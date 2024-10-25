package absolutelyaya.formidulus.entities.goal;

import absolutelyaya.formidulus.entities.BossEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.TypeFilter;
import net.minecraft.util.math.Box;

import java.util.*;

public class BossTargetGoal extends Goal
{
	final Class<LivingEntity>[] untargettableTypes;
	final BossEntity mob;
	final int switchInterval;
	final float range, switchChance;
	final Map<LivingEntity, Float> knownTargets = new HashMap<>();
	int lastAttackedTime, lastTargetDamagedTime, targetSwitchTimer;
	LivingEntity lastTarget;
	
	@SafeVarargs
	public BossTargetGoal(BossEntity mob, float range, int switchInterval, float switchChance, Class<LivingEntity>... untargettableTypes)
	{
		this.mob = mob;
		this.untargettableTypes = untargettableTypes;
		this.range = range;
		this.switchInterval = switchInterval;
		this.switchChance = switchChance;
		setControls(EnumSet.of(Goal.Control.TARGET));
	}
	
	@Override
	public boolean canStart()
	{
		return true;
	}
	
	@Override
	public void tick()
	{
		super.tick();
		validateTargetList();
		LivingEntity curTarget = mob.getTarget();
		if(mob.getLastAttackedTime() != lastAttackedTime)
		{
			lastAttackedTime = mob.getLastAttackTime();
			LivingEntity lastAttacker = mob.getLastAttacker();
			if(isTargetValid(lastAttacker))
				knownTargets.put(lastAttacker, knownTargets.containsKey(lastAttacker) ? knownTargets.get(lastAttacker) + mob.getLastDamageTaken() :
													   getStartPriority(lastAttacker));
		}
		if(mob.getLastTargetDamagedTime() != lastTargetDamagedTime)
		{
			lastTargetDamagedTime = mob.getLastTargetDamagedTime();
			targetSwitchTimer = Math.min(targetSwitchTimer + switchInterval / 4, switchInterval);
		}
		mob.getWorld().getEntitiesByType(TypeFilter.instanceOf(PlayerEntity.class), Box.from(mob.getPos()).expand(range), this::isTargetValid)
				.forEach(p -> {
					if(!knownTargets.containsKey(p))
						knownTargets.put(p, 5f);
				});
		if(curTarget != null)
		{
			if(!isTargetValid(curTarget))
				mob.setTarget(curTarget = null);
			else if(!knownTargets.containsKey(curTarget))
				knownTargets.put(curTarget, getStartPriority(curTarget));
		}
		if(knownTargets.isEmpty())
			return;
		targetSwitchTimer--;
		if(!isTargetValid(curTarget))
		{
			mob.setTarget(getBestTarget());
			targetSwitchTimer = switchInterval;
		}
		else if((targetSwitchTimer <= 0))
		{
			if(mob.getRandom().nextFloat() <= switchChance)
			{
				LivingEntity bestTarget = getBestTarget();
				if(bestTarget != null && knownTargets.size() > 1 && bestTarget.equals(lastTarget))
					randomizeTarget();
				else
					mob.setTarget(bestTarget);
			}
			targetSwitchTimer = switchInterval;
		}
	}
	
	void validateTargetList()
	{
		List<LivingEntity> remove = new ArrayList<>();
		for (LivingEntity living : knownTargets.keySet())
		{
			if(!isTargetValid(living))
				remove.add(living);
		}
		remove.forEach(knownTargets::remove);
	}
	
	boolean isTargetValid(LivingEntity living)
	{
		return mob.isTargetValid(living) && mob.distanceTo(living) < range * 2;
	}
	
	float getStartPriority(LivingEntity living)
	{
		return living instanceof PlayerEntity ? 5f : 0f;
	}
	
	LivingEntity getBestTarget()
	{
		validateTargetList();
		if(knownTargets.size() == 1)
			return knownTargets.keySet().toArray(new LivingEntity[0])[0];
		float highestPriority = Float.MIN_VALUE;
		LivingEntity bestTarget = null;
		for (LivingEntity living : knownTargets.keySet())
		{
			if(!isTargetValid(living))
				continue;
			float priority = knownTargets.get(living) - (mob.distanceTo(living) * 0.1f); //decrease targets priority based on distance
			if(priority > highestPriority)
			{
				highestPriority = priority;
				bestTarget = living;
			}
		}
		return bestTarget;
	}
	
	public void randomizeTarget()
	{
		LivingEntity target = getRandomTarget();
		mob.setTarget(target);
	}
	
	public LivingEntity getRandomTarget()
	{
		if(knownTargets.isEmpty())
			return null;
		return getAllTargets().get(mob.getRandom().nextInt(knownTargets.size()));
	}
	
	public List<LivingEntity> getAllTargets()
	{
		validateTargetList();
		return new ArrayList<>(knownTargets.keySet());
	}
	
	public boolean isHasNoTargets()
	{
		return getAllTargets().isEmpty();
	}
}
