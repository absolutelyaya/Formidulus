package absolutelyaya.formidulus.entities.goal;

import absolutelyaya.formidulus.entities.AnimatedHostileEntity;
import net.minecraft.entity.LivingEntity;

public abstract class AnimatedAttackGoal<T extends AnimatedHostileEntity> extends InterruptableGoal
{
	protected final T mob;
	final float duration;
	protected final byte attackAnimationId, postAnimationID;
	protected int time;
	protected LivingEntity target;
	
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
		if(shouldImmediatelyStartAttackAnim())
			mob.setAnimation(attackAnimationId);
		target = mob.getTarget();
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
		return time <= duration * 20 && !(target == null || target.isDead() || target.isRemoved());
	}
	
	protected boolean shouldImmediatelyStartAttackAnim()
	{
		return true;
	}
	
	protected abstract int getAttackCooldown();
	
	@Override
	public void stop()
	{
		super.stop();
		if(mob.getCurrentAnimation() == attackAnimationId)
			mob.setAnimation(postAnimationID);
		if(!wasInterrupted())
			mob.setAttackCooldown(getAttackCooldown());
	}
}
