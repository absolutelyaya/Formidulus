package absolutelyaya.formidulus.entities;

import absolutelyaya.formidulus.entities.boss.BossType;
import absolutelyaya.formidulus.entities.goal.BossOutOfCombatGoal;
import absolutelyaya.formidulus.entities.goal.BossTargetGoal;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
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
import net.minecraft.text.Text;
import net.minecraft.util.TypeFilter;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

import java.util.List;

public abstract class BossEntity extends AnimatedHostileEntity
{
	public static final TrackedData<Vector3f> ORIGIN = DataTracker.registerData(BossEntity.class, TrackedDataHandlerRegistry.VECTOR3F);
	protected ServerBossBar bossBar;
	boolean wasBossbarVisible, shouldUpdateBossbar = true;
	float lastDamageTakenRaw, lastDamageTaken;
	int lastTargetDamagedTime, combatTimer;
	BossTargetGoal targetGoal;
	BossOutOfCombatGoal outOfCombatGoal;
	
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
		if(isBossBarVisible() && shouldUpdateBossbar)
			bossBar.setPercent(getHealth() / getMaxHealth());
		if(getWorld().isClient)
			return;
		if(getTarget() instanceof LivingEntity living && living.isAlive() && !living.isRemoved())
			combatTimer = 100;
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
	
	/**
	 * Used to get the Position Players with the {@link absolutelyaya.formidulus.effects.ReverenceStatusEffect} should look at.<br>
	 * Used for Scripted Sequences.
	 */
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
		if(targetGoal != null)
			return targetGoal.getRandomTarget();
		return null;
	}
	
	public List<LivingEntity> getAllTargets()
	{
		if(targetGoal != null)
			return targetGoal.getAllTargets();
		return List.of();
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
	
	public boolean isInCombat()
	{
		return combatTimer > 0;
	}
	
	/**
	 * Runs after the OutOfCombatGoal is completed.<br>
	 * If the Behavior is RESPAWN_AT_ORIGIN, this will be run on the newly spawned instance of the boss.
	 */
	public abstract void afterBossReset();
	
	public abstract BossType getBossType();
	
	public abstract boolean isActive();
	
	@Override
	public void readCustomDataFromNbt(NbtCompound nbt)
	{
		super.readCustomDataFromNbt(nbt);
		if(nbt.contains("Origin", NbtElement.COMPOUND_TYPE))
		{
			NbtCompound origin = nbt.getCompound("Origin");
			dataTracker.set(ORIGIN, new Vector3f(origin.getFloat("x"), origin.getFloat("y"), origin.getFloat("z")));
		}
		if(nbt.contains("CombatTimer", NbtElement.INT_TYPE))
			combatTimer = nbt.getInt("CombatTimer");
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
		if(isInCombat())
			nbt.putInt("CombatTimer", combatTimer);
	}
}
