package absolutelyaya.formidulus.entities;

import absolutelyaya.formidulus.entities.goal.AnimatedAttackGoal;
import absolutelyaya.formidulus.entities.goal.InterruptableGoal;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;

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
	
	public void setAnimation(byte id)
	{
		if(!getWorld().isClient)
		{
			dataTracker.set(ANIMATION, id);
			dataTracker.set(ANIMATION_START, age);
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
	
	protected int setAnimationFlag(int idx, boolean state)
	{
		if(state)
			return animFlags = animFlags | 1 << idx;
		else
			return animFlags = animFlags & ~(1 << idx);
	}
	
	protected boolean getAnimationFlag(int idx)
	{
		return ((animFlags >> idx) & 1) == 1;
	}
	
	public void setAttackCooldown(int cooldown)
	{
		dataTracker.set(ATTACK_COOLDOWN, Math.max(cooldown, 0));
	}
	
	protected boolean shouldTickAttackCooldown()
	{
		return getTarget() != null && getTarget().isAlive() && !getTarget().isRemoved();
	}
	
	public boolean isReadyToAttack()
	{
		return dataTracker.get(ATTACK_COOLDOWN) <= 0 && shouldTickAttackCooldown() && isNotInAttackAnimation();
	}
	
	@Override
	public void tick()
	{
		super.tick();
		if(shouldTickAttackCooldown())
		{
			int cd = dataTracker.get(ATTACK_COOLDOWN);
			if(cd > 0)
				dataTracker.set(ATTACK_COOLDOWN, cd - 1);
		}
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
}
