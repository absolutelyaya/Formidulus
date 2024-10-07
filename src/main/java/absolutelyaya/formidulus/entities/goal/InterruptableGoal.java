package absolutelyaya.formidulus.entities.goal;

import net.minecraft.entity.ai.goal.Goal;

public abstract class InterruptableGoal extends Goal
{
	boolean interrupted;
	
	@Override
	public void start()
	{
		super.start();
		interrupted = false;
	}
	
	public void interrupt()
	{
		interrupted = true;
		stop();
	}
	
	public boolean wasInterrupted()
	{
		return interrupted;
	}
}
