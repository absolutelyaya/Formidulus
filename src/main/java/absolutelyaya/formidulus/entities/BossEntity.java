package absolutelyaya.formidulus.entities;

import absolutelyaya.formidulus.entities.goal.BossTargetGoal;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.entity.boss.ServerBossBar;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.TypeFilter;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

import java.util.EnumSet;

public abstract class BossEntity extends AnimatedHostileEntity
{
	static final TrackedData<Vector3f> ORIGIN = DataTracker.registerData(BossEntity.class, TrackedDataHandlerRegistry.VECTOR3F);
	protected ServerBossBar bossBar;
	boolean wasBossbarVisible;
	float lastDamageTakenRaw, lastDamageTaken;
	int lastTargetDamagedTime, combatTimer;
	BossTargetGoal bossTargetGoal;
	
	protected BossEntity(EntityType<? extends AnimatedHostileEntity> entityType, World world)
	{
		super(entityType, world);
	}
	
	@Override
	protected void initDataTracker(DataTracker.Builder builder)
	{
		super.initDataTracker(builder);
		builder.add(ORIGIN, getPos().toVector3f());
	}
	
	protected ServerBossBar initBossBar()
	{
		return new ServerBossBar(getDisplayName(), BossBar.Color.RED, getBossBarStyle());
	}
	
	abstract BossBar.Style getBossBarStyle();
	
	@Override
	public void setCustomName(@Nullable Text name)
	{
		super.setCustomName(name);
		if(isBossBarVisible())
			bossBar.setName(getDisplayName());
	}
	
	public boolean isBossBarVisible()
	{
		if(bossBar == null)
			bossBar = initBossBar();
		return true;
	}
	
	@Override
	public void onStartedTrackingBy(ServerPlayerEntity player)
	{
		super.onStartedTrackingBy(player);
		if(isBossBarVisible())
			bossBar.addPlayer(player);
	}
	
	@Override
	public void onStoppedTrackingBy(ServerPlayerEntity player)
	{
		super.onStoppedTrackingBy(player);
		if(isBossBarVisible())
			bossBar.removePlayer(player);
	}
	
	@Override
	protected void mobTick()
	{
		super.mobTick();
		if(isBossBarVisible())
			bossBar.setPercent(getHealth() / getMaxHealth());
		if(getWorld().isClient)
			return;
		if(getTarget() != null)
			combatTimer = 200;
		else if(combatTimer > 0)
			combatTimer--;
		if(dataTracker.get(ORIGIN).equals(new Vector3f()))
			dataTracker.set(ORIGIN, getPos().toVector3f());
		if(wasBossbarVisible && !isBossBarVisible())
			bossBar.clearPlayers();
		else if(!wasBossbarVisible && isBossBarVisible())
		{
			getWorld().getEntitiesByType(TypeFilter.instanceOf(PlayerEntity.class), getBoundingBox().expand(64), p -> true)
					.forEach(p -> bossBar.addPlayer((ServerPlayerEntity)p));
		}
		wasBossbarVisible = isBossBarVisible();
	}
	
	@Override
	public boolean cannotDespawn()
	{
		return true;
	}
	
	abstract boolean isInSequence();
	
	public Vec3d getFocusPos()
	{
		return getEyePos().subtract(0f, 0.5f, 0f);
	}
	
	public float getLastDamageTakenRaw()
	{
		return lastDamageTakenRaw;
	}
	
	public float getLastDamageTaken()
	{
		return lastDamageTaken;
	}
	
	public int getLastTargetDamagedTime()
	{
		return lastTargetDamagedTime;
	}
	
	public @Nullable LivingEntity getRandomTarget()
	{
		if(bossTargetGoal != null)
			return bossTargetGoal.getRandomTarget();
		return null;
	}
	
	@Override
	public boolean damage(DamageSource source, float amount)
	{
		boolean b = super.damage(source, amount);
		if(b)
		{
			lastDamageTakenRaw = amount;
			lastDamageTaken = applyArmorToDamage(source, amount);
		}
		return b;
	}
	
	public void onDamageEntity(LivingEntity damaged)
	{
		if(damaged.equals(getTarget()))
			lastTargetDamagedTime = age;
	}
	
	boolean isInCombat()
	{
		return combatTimer > 0;
	}
	
	@Override
	public void readCustomDataFromNbt(NbtCompound nbt)
	{
		super.readCustomDataFromNbt(nbt);
		if(nbt.contains("Origin", NbtElement.COMPOUND_TYPE))
		{
			NbtCompound origin = nbt.getCompound("Origin");
			dataTracker.set(ORIGIN, new Vector3f(origin.getFloat("x"), origin.getFloat("y"), origin.getFloat("z")));
		}
	}
	
	@Override
	public void writeCustomDataToNbt(NbtCompound nbt)
	{
		super.writeCustomDataToNbt(nbt);
		if(!dataTracker.get(ORIGIN).equals(new Vector3f()))
		{
			NbtCompound origin = new NbtCompound();
			Vector3f originPos = dataTracker.get(ORIGIN);
			origin.putFloat("x", originPos.x);
			origin.putFloat("y", originPos.y);
			origin.putFloat("z", originPos.z);
			nbt.put("Origin", origin);
		}
	}
	
	static class OutOfCombatGoal extends Goal
	{
		public static final byte BEHAVIOR_RESPAWN_AT_ORIGIN = 0;
		public static final byte BEHAVIOR_RETURN_TO_ORIGIN_AND_HEAL = 1;
		public static final byte BEHAVIOR_TELEPORT_TO_ORIGIN_AND_HEAL = 2;
		public static final byte BEHAVIOR_DESPAWN = 3;
		final BossEntity mob;
		final byte behavior;
		final float regenPerTick, speed;
		boolean wasInCombat;
		
		public OutOfCombatGoal(BossEntity mob, byte behavior)
		{
			this(mob, behavior, 10f);
		}
		
		public OutOfCombatGoal(BossEntity mob, byte behavior, float regenPerTick)
		{
			this(mob, behavior, regenPerTick, 0.4f);
		}
		
		public OutOfCombatGoal(BossEntity mob, byte behavior, float regenPerTick, float speed)
		{
			this.mob = mob;
			this.behavior = behavior;
			this.regenPerTick = regenPerTick;
			this.speed = speed;
			setControls(EnumSet.of(Control.MOVE));
		}
		
		@Override
		public boolean canStart()
		{
			boolean b = !mob.isInCombat() && wasInCombat;
			wasInCombat = mob.isInCombat();
			return b;
		}
		
		@Override
		public void start()
		{
			super.start();
			BlockPos originBlock = BlockPos.ofFloored(new Vec3d(mob.dataTracker.get(ORIGIN)));
			if(behavior == BEHAVIOR_TELEPORT_TO_ORIGIN_AND_HEAL ||
					   mob.navigation.findPathTo(originBlock, 1) == null)
				mob.setPosition(new Vec3d(mob.dataTracker.get(ORIGIN)));
			else if(behavior == BEHAVIOR_DESPAWN)
				mob.discard();
			else if(behavior == BEHAVIOR_RESPAWN_AT_ORIGIN && mob.getWorld() instanceof ServerWorld serverWorld)
			{
				mob.getType().spawn(serverWorld, reborn -> {
					reborn.setYaw(0f);
					reborn.setHeadYaw(0f);
					reborn.setBodyYaw(0f);
					reborn.refreshPositionAndAngles(reborn.getPos(), 0f, 0f);
				}, originBlock, SpawnReason.MOB_SUMMONED, true, false);
				mob.discard();
			}
		}
		
		@Override
		public boolean shouldContinue()
		{
			if(behavior == BEHAVIOR_RETURN_TO_ORIGIN_AND_HEAL)
				return mob.getHealth() < mob.getMaxHealth() && mob.squaredDistanceTo(new Vec3d(mob.dataTracker.get(ORIGIN))) < 1f;
			else if(behavior == BEHAVIOR_TELEPORT_TO_ORIGIN_AND_HEAL)
				return mob.getHealth() < mob.getMaxHealth();
			return false;
		}
		
		@Override
		public boolean shouldRunEveryTick()
		{
			return true;
		}
		
		@Override
		public void tick()
		{
			super.tick();
			if(behavior == BEHAVIOR_RETURN_TO_ORIGIN_AND_HEAL || behavior == BEHAVIOR_TELEPORT_TO_ORIGIN_AND_HEAL)
				mob.heal(regenPerTick);
			Vec3d origin = new Vec3d(mob.dataTracker.get(ORIGIN));
			if(!mob.getBlockPos().isWithinDistance(origin, 2f) && mob.navigation.isIdle())
				if(!mob.navigation.startMovingTo(origin.x, origin.y, origin.z, speed))
					mob.setPosition(origin);
		}
		
		@Override
		public void stop()
		{
			super.stop();
			if(!mob.isRemoved())
				mob.setYaw(0f);
		}
	}
}
