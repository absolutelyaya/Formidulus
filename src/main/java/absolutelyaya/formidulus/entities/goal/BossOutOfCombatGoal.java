package absolutelyaya.formidulus.entities.goal;

import absolutelyaya.formidulus.entities.BossEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import java.util.EnumSet;

public class BossOutOfCombatGoal extends Goal
{
	public static final byte BEHAVIOR_RESPAWN_AT_ORIGIN = 0;
	public static final byte BEHAVIOR_RETURN_TO_ORIGIN_AND_HEAL = 1;
	public static final byte BEHAVIOR_TELEPORT_TO_ORIGIN_AND_HEAL = 2;
	public static final byte BEHAVIOR_DESPAWN = 3;
	final BossEntity mob;
	final byte behavior;
	final float regenPerTick, speed;
	BossEntity reborn;
	boolean wasInCombat;
	
	public BossOutOfCombatGoal(BossEntity mob, byte behavior)
	{
		this(mob, behavior, 10f);
	}
	
	public BossOutOfCombatGoal(BossEntity mob, byte behavior, float regenPerTick)
	{
		this(mob, behavior, regenPerTick, 0.4f);
	}
	
	public BossOutOfCombatGoal(BossEntity mob, byte behavior, float regenPerTick, float speed)
	{
		this.mob = mob;
		this.behavior = behavior;
		this.regenPerTick = regenPerTick;
		this.speed = speed;
		setControls(EnumSet.of(Control.MOVE));
	}
	
	@Override
	public boolean canStart()
	{
		boolean b = !mob.isInCombat() && wasInCombat;
		wasInCombat = mob.isInCombat();
		return b;
	}
	
	@Override
	public void start()
	{
		super.start();
		BlockPos originBlock = BlockPos.ofFloored(new Vec3d(mob.getDataTracker().get(BossEntity.ORIGIN)));
		if (behavior == BEHAVIOR_TELEPORT_TO_ORIGIN_AND_HEAL ||
					mob.getNavigation().findPathTo(originBlock, 1) == null)
			mob.setPosition(new Vec3d(mob.getDataTracker().get(BossEntity.ORIGIN)));
		else if (behavior == BEHAVIOR_DESPAWN)
		{
			mob.discard();
			mob.afterBossReset();
		}
		else if (behavior == BEHAVIOR_RESPAWN_AT_ORIGIN && mob.getWorld() instanceof ServerWorld serverWorld)
		{
			Entity e = mob.getType().spawn(serverWorld, reborn ->
			{
				reborn.setYaw(0f);
				reborn.setHeadYaw(0f);
				reborn.setBodyYaw(0f);
				reborn.refreshPositionAndAngles(reborn.getPos(), 0f, 0f);
			}, originBlock, SpawnReason.MOB_SUMMONED, true, false);
			if(e instanceof BossEntity boss)
				boss.afterBossReset();
			mob.discard();
		}
	}
	
	@Override
	public boolean shouldContinue()
	{
		if(mob.getTarget() != null)
			return false;
		if (behavior == BEHAVIOR_RETURN_TO_ORIGIN_AND_HEAL)
			return mob.getHealth() < mob.getMaxHealth() && mob.squaredDistanceTo(new Vec3d(mob.getDataTracker().get(BossEntity.ORIGIN))) < 1f;
		else if (behavior == BEHAVIOR_TELEPORT_TO_ORIGIN_AND_HEAL)
			return mob.getHealth() < mob.getMaxHealth();
		return false;
	}
	
	@Override
	public boolean shouldRunEveryTick()
	{
		return true;
	}
	
	@Override
	public void tick()
	{
		super.tick();
		if (behavior == BEHAVIOR_RETURN_TO_ORIGIN_AND_HEAL || behavior == BEHAVIOR_TELEPORT_TO_ORIGIN_AND_HEAL)
			mob.heal(regenPerTick);
		Vec3d origin = new Vec3d(mob.getDataTracker().get(BossEntity.ORIGIN));
		if (!mob.getBlockPos().isWithinDistance(origin, 2f) && mob.getNavigation().isIdle())
			if (!mob.getNavigation().startMovingTo(origin.x, origin.y, origin.z, speed))
				mob.setPosition(origin);
	}
	
	@Override
	public void stop()
	{
		super.stop();
		if (!mob.isRemoved())
		{
			mob.setYaw(0f);
			mob.afterBossReset();
		}
	}
}
