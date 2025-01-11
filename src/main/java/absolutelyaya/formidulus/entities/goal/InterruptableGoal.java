package absolutelyaya.formidulus.entities.goal;

import net.minecraft.entity.ai.goal.Goal;

public abstract class InterruptableGoal extends Goal
{
	public static final byte FORCE_STOP = -1;
	public static final byte BULWARK = 100;
	byte interruptReason;
	
	@Override
	public void start()
	{
		super.start();
		interruptReason = 0;
	}
	
	public void forceStop()
	{
		interruptReason = FORCE_STOP;
		stop();
	}
	
	public void interrupt(byte reason)
	{
		if(tryInterrupt(reason))
			interruptReason = reason;
	}
	
	public boolean wasForceStopped()
	{
		return interruptReason == -1;
	}
	
	protected boolean tryInterrupt(byte reason)
	{
		return false;
	}
}
