package absolutelyaya.formidulus.entities;

import absolutelyaya.formidulus.entities.boss.BossFight;
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
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

public abstract class BossEntity extends AnimatedHostileEntity
{
	public static final TrackedData<BlockPos> ORIGIN = DataTracker.registerData(BossEntity.class, TrackedDataHandlerRegistry.BLOCK_POS);
	protected ServerBossBar bossBar;
	boolean wasBossbarVisible, shouldUpdateBossbar = true;
	float lastDamageTakenRaw, lastDamageTaken;
	int lastTargetDamagedTime, combatTimer;
	BossTargetGoal targetGoal;
	BossOutOfCombatGoal outOfCombatGoal;
	BossFight bossFight;
	BossType type;
	
	protected BossEntity(EntityType<? extends AnimatedHostileEntity> entityType, World world, BossType type)
	{
		super(entityType, world);
		this.type = type;
	}
	
	@Override
	protected void initDataTracker(DataTracker.Builder builder)
	{
		super.initDataTracker(builder);
		builder.add(ORIGIN, getBlockPos());
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
			combatTimer = 10;
		else if(combatTimer > 0)
			combatTimer--;
		if(dataTracker.get(ORIGIN).equals(BlockPos.ORIGIN))
			dataTracker.set(ORIGIN, getBlockPos());
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
	
	@Override
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
	 * Runs before the OutOfCombatGoal is completed.
	 */
	public abstract void beforeBossReset();
	
	/**
	 * Runs after the OutOfCombatGoal is completed.<br>
	 * If the Behavior is RESPAWN_AT_ORIGIN, this will be run on the newly spawned instance of the boss.
	 */
	public abstract void afterBossReset();
	
	public abstract BossType getBossType();
	
	public abstract boolean isActive();
	
	public BlockPos getOriginBlock()
	{
		return dataTracker.get(ORIGIN);
	}
	
	public Vec3d getOriginBlockMinCorner()
	{
		BlockPos pos = getOriginBlock();
		return new Vec3d(pos.getX(), pos.getY(), pos.getZ());
	}
	
	public void setOriginBlock(BlockPos pos)
	{
		dataTracker.set(ORIGIN, pos);
	}
	
	protected void beginFight()
	{
		bossFight = type.beginFight(this, getFightId());
	}
	
	public UUID getFightId()
	{
		if(bossFight == null)
			return null;
		return bossFight.getFightID();
	}
	
	public BossFight getBossFightInstance()
	{
		return bossFight;
	}
	
	public void forceReset()
	{
		cancelActiveGoals();
		if(outOfCombatGoal != null)
			outOfCombatGoal.start(); //perform reset logic
	}
	
	abstract boolean shouldFightBeActive();
	
	@Override
	public void readCustomDataFromNbt(NbtCompound nbt)
	{
		super.readCustomDataFromNbt(nbt);
		if(nbt.contains("Origin", NbtElement.LONG_TYPE))
			dataTracker.set(ORIGIN, BlockPos.fromLong(nbt.getLong("Origin")));
		if(nbt.contains("CombatTimer", NbtElement.INT_TYPE))
			combatTimer = nbt.getInt("CombatTimer");
		if(nbt.containsUuid("FightId") && (bossFight == null || bossFight.hasEnded()))
			bossFight = type.beginFight(this, nbt.getUuid("FightId"));
		else if(shouldFightBeActive() && (bossFight == null || bossFight.hasEnded()))
			beginFight();
	}
	
	@Override
	public void writeCustomDataToNbt(NbtCompound nbt)
	{
		super.writeCustomDataToNbt(nbt);
		if(!dataTracker.get(ORIGIN).equals(BlockPos.ORIGIN))
			nbt.putLong("Origin", dataTracker.get(ORIGIN).asLong());
		if(isInCombat())
			nbt.putInt("CombatTimer", combatTimer);
		if(bossFight != null)
			nbt.putUuid("FightId", bossFight.getFightID());
	}
}
