package absolutelyaya.formidulus.entities.goal;

import absolutelyaya.formidulus.entities.AnimatedHostileEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;

public abstract class AnimatedAttackGoal<T extends AnimatedHostileEntity> extends Goal
{
	protected final T mob;
	final float duration;
	final byte attackAnimationId, postAnimationID;
	protected int time;
	protected LivingEntity target;
	boolean interrupted;
	
	public AnimatedAttackGoal(T mob, byte attackAnimationId, float duration, byte postAnimationID)
	{
		this.mob = mob;
		this.duration = duration;
		this.attackAnimationId = attackAnimationId;
		this.postAnimationID = postAnimationID;
	}
	
	@Override
	public boolean canStart()
	{
		return mob.isReadyToAttack() && mob.getTarget() != null;
	}
	
	@Override
	public void start()
	{
		super.start();
		time = 0;
		mob.setAnimation(attackAnimationId);
		target = mob.getTarget();
		interrupted = false;
	}
	
	@Override
	public void tick()
	{
		super.tick();
		if(time++ > duration * 20)
			stop();
	}
	
	@Override
	public boolean shouldRunEveryTick()
	{
		return true;
	}
	
	@Override
	public boolean canStop()
	{
		return !canStart() || time > duration * 20;
	}
	
	@Override
	public boolean shouldContinue()
	{
		return time <= duration * 20 || target == null || target.isDead() || target.isRemoved();
	}
	
	protected abstract int getAttackCooldown();
	
	@Override
	public void stop()
	{
		super.stop();
		if(!interrupted)
		{
			if(mob.getCurrentAnimation() == attackAnimationId)
				mob.setAnimation(postAnimationID);
			mob.setAttackCooldown(getAttackCooldown());
		}
	}
	
	public void interrupt()
	{
		interrupted = true;
		stop();
	}
}
