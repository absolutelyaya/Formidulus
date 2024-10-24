package absolutelyaya.formidulus.entities.goal;

import absolutelyaya.formidulus.entities.ServantEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;

import java.util.EnumSet;

public class ServantTargetGoal extends Goal
{
	final ServantEntity mob;
	
	public ServantTargetGoal(ServantEntity mob)
	{
		this.mob = mob;
		setControls(EnumSet.of(Control.TARGET));
	}
	
	@Override
	public boolean canStart()
	{
		LivingEntity target = mob.getTarget();
		if(target != null && (target.isDead() || target.isRemoved()))
			mob.setTarget(null);
		return mob.hasMaster() && mob.getMaster().isActive() && target == null;
	}
	
	@Override
	public void start()
	{
		super.start();
		if(!mob.getMaster().getAllTargets().isEmpty())
			mob.setTarget(mob.getMaster().getRandomTarget());
	}
}
