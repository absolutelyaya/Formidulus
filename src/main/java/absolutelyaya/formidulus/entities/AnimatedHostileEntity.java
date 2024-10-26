package absolutelyaya.formidulus.entities;

import absolutelyaya.formidulus.entities.goal.InterruptableGoal;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;
import java.util.function.BiConsumer;

public abstract class AnimatedHostileEntity extends HostileEntity
{
	static final TrackedData<Byte> ANIMATION = DataTracker.registerData(AnimatedHostileEntity.class, TrackedDataHandlerRegistry.BYTE);
	static final TrackedData<Integer> ANIMATION_START = DataTracker.registerData(AnimatedHostileEntity.class, TrackedDataHandlerRegistry.INTEGER);
	static final TrackedData<Integer> ATTACK_COOLDOWN = DataTracker.registerData(AnimatedHostileEntity.class, TrackedDataHandlerRegistry.INTEGER);
	byte lastAnimation;
	int animFlags;
	
	protected AnimatedHostileEntity(EntityType<? extends HostileEntity> entityType, World world)
	{
		super(entityType, world);
	}
	
	@Override
	protected void initDataTracker(DataTracker.Builder builder)
	{
		super.initDataTracker(builder);
		builder.add(ANIMATION, (byte)0);
		builder.add(ANIMATION_START, 0);
		builder.add(ATTACK_COOLDOWN, 0);
	}
	
	@Override
	public void onTrackedDataSet(TrackedData<?> data)
	{
		super.onTrackedDataSet(data);
		if(getWorld().isClient)
		{
			if(data.equals(ANIMATION_START))
				age = dataTracker.get(ANIMATION_START); //to make sure the age and thus animation progress is synced
			if(data.equals(ANIMATION))
				setAnimation(dataTracker.get(ANIMATION));
		}
	}
	
	public void setAnimation(byte id)
	{
		if(!getWorld().isClient)
		{
			dataTracker.set(ANIMATION_START, age);
			dataTracker.set(ANIMATION, id);
		}
		if(getAnimationState(lastAnimation) instanceof AnimationState lastState)
			lastState.stop();
		if(getAnimationState(id) instanceof AnimationState newState)
			newState.start(age);
		lastAnimation = id;
		//reset animation flags
		animFlags = 0;
	}
	
	public byte getCurrentAnimation()
	{
		return dataTracker.get(ANIMATION);
	}
	
	public float getCurrentAnimationDuration()
	{
		return (age - dataTracker.get(ANIMATION_START)) / 20f;
	}
	
	abstract AnimationState getAnimationState(byte id);
	
	protected void setAnimationFlag(int idx, boolean state)
	{
		if(state)
			animFlags = animFlags | 1 << idx;
		else
			animFlags = animFlags & ~(1 << idx);
	}
	
	protected boolean getAnimationFlag(int idx)
	{
		return ((animFlags >> idx) & 1) == 1;
	}
	
	public void setAttackCooldown(int cooldown)
	{
		dataTracker.set(ATTACK_COOLDOWN, Math.max(cooldown, 0));
	}
	
	public boolean isReadyToAttack()
	{
		return dataTracker.get(ATTACK_COOLDOWN) <= 0 && isTargetValid() && isNotInAttackAnimation();
	}
	
	@Override
	public void tick()
	{
		super.tick();
		if(isTargetValid())
		{
			int cd = dataTracker.get(ATTACK_COOLDOWN);
			if(cd > 0)
				dataTracker.set(ATTACK_COOLDOWN, cd - 1);
		}
		else if(getTarget() != null)
			setTarget(null);
	}
	
	protected void cancelActiveGoals()
	{
		navigation.stop();
		goalSelector.getGoals().forEach(i -> {
			if(i.getGoal() instanceof InterruptableGoal animated && i.isRunning())
				animated.interrupt();
		});
	}
	
	public abstract boolean isNotInAttackAnimation();
	
	protected float getHealthPercent()
	{
		return getHealth() / getMaxHealth();
	}
	
	public float getHorizontalDistanceToTarget()
	{
		return getHorizontalDistanceTo(getTarget());
	}
	
	public float getHorizontalDistanceTo(Vec3d pos, LivingEntity target)
	{
		if(!isTargetValid(target) || target == null) //two null checks just so the ide doesn't complain about possible nullrefs
			return Float.MAX_VALUE;
		return (float)pos.multiply(1, 0, 1).distanceTo(target.getPos().multiply(1, 0, 1));
	}
	
	public float getHorizontalDistanceTo(LivingEntity target)
	{
		return getHorizontalDistanceTo(getPos(), target);
	}
	
	public boolean isTargetValid(LivingEntity target)
	{
		if(target instanceof PlayerEntity player && player.isCreative())
			return false;
		return !(target == null || target.isDead() || target.isRemoved() || target.isSpectator()) && target.canTakeDamage();
	}
	
	public boolean isTargetValid()
	{
		return isTargetValid(getTarget());
	}
	
	public float getRelativeHorizontalAngleTo(Vec3d pos, LivingEntity target, Vec3d forward)
	{
		if(!isTargetValid(target) || target == null)
			return 0f;
		Vec3d targetDir = target.getPos().multiply(1, 0, 1).subtract(pos.multiply(1, 0, 1)).normalize();
		forward = forward.multiply(1, 0, 1).normalize();
		return (float)Math.acos(targetDir.dotProduct(forward));
	}
	public float getRelativeHorizontalAngleTo(LivingEntity target, Vec3d forward)
	{
		return getRelativeHorizontalAngleTo(getPos(), target, forward);
	}
	
	public float getRelativeHorizontalAngleTo(LivingEntity target)
	{
		return getRelativeHorizontalAngleTo(target, getRotationVector());
	}
	
	public float getRelativeHorizontalTargetAngle()
	{
		return getRelativeHorizontalAngleTo(getTarget());
	}
	
	public int applyDamageInCylindricArea(float radius, float height, float maxAngle, DamageSource source, float amount, Vec3d angleCheckFowards,
										  Vec3d offset, BiConsumer<LivingEntity, Boolean> extraProcess)
	{
		int successfulHits = 0;
		Box area = box(getPos()).expand(radius, 0, radius).stretch(0f, height, 0f).offset(offset);
		List<LivingEntity> hits = getWorld().getNonSpectatingEntities(LivingEntity.class, area);
		for (LivingEntity hit : hits)
		{
			if (getIgnoredClasses().contains(hit.getClass()) || getHorizontalDistanceTo(getPos().add(offset), hit) > radius ||
						getRelativeHorizontalAngleTo(getPos().add(offset), hit, angleCheckFowards) > Math.toRadians(maxAngle))
				continue;
			boolean success = hit.damage(source, amount);
			extraProcess.accept(hit, success);
			if(success)
			{
				successfulHits++;
				onDamageEntity(hit);
			}
		}
		return successfulHits;
	}
	
	public int applyDamageInCylindricArea(float radius, float height, float maxAngle, DamageSource source, float amount, Vec3d angleCheckFowards,
										  BiConsumer<LivingEntity, Boolean> extraProcess)
	{
		return applyDamageInCylindricArea(radius, height, maxAngle, source, amount, angleCheckFowards, Vec3d.ZERO, extraProcess);
	}
	
	public int applyDamageInCylindricArea(float radius, float height, float maxAngle, DamageSource source, float amount, BiConsumer<LivingEntity, Boolean> extraProcess)
	{
		return applyDamageInCylindricArea(radius, height, maxAngle, source, amount, getRotationVector(), Vec3d.ZERO, extraProcess);
	}
	
	public int applyDamageInCylindricArea(float radius, float height, DamageSource source, float amount, BiConsumer<LivingEntity, Boolean> extraProcess)
	{
		return applyDamageInCylindricArea(radius, height, 360f, source, amount, extraProcess);
	}
	
	public int applyDamageInCylindricArea(float radius, float height, float maxAngle, DamageSource source, float amount)
	{
		return applyDamageInCylindricArea(radius, height, maxAngle, source, amount, (i, b) -> {});
	}
	
	public int applyDamageInCylindricArea(float radius, float height, DamageSource source, float amount)
	{
		return applyDamageInCylindricArea(radius, height, 360f, source, amount, (i, b) -> {});
	}
	
	public List<Class<? extends LivingEntity>> getIgnoredClasses()
	{
		return List.of();
	}
	
	public void onDamageEntity(LivingEntity damaged)
	{
	
	}
	
	protected Box box(Vec3d pos)
	{
		return new Box(pos.subtract(0.5, 0.5, 0.5), pos.add(0.5, 0.5, 0.5));
	}
}
