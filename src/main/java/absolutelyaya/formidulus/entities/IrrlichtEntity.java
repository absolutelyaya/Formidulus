package absolutelyaya.formidulus.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.ActiveTargetGoal;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class IrrlichtEntity extends MobEntity
{
	int lifetime;
	
	public IrrlichtEntity(EntityType<? extends MobEntity> entityType, World world)
	{
		super(entityType, world);
		lifetime = 200;
		setNoGravity(true);
		noClip = true;
	}
	
	@Override
	protected void initGoals()
	{
		super.initGoals();
		targetSelector.add(0, new ActiveTargetGoal<>(this, PlayerEntity.class, false));
	}
	
	@Override
	public void tick()
	{
		super.tick();
		Entity target = getTarget();
		if(target != null)
			setVelocity(target.getPos().subtract(getPos()).normalize().multiply(getMovementSpeed() / 10f));
		else
			setVelocity(Vec3d.ZERO);
		if(lifetime-- <= 0)
			remove(RemovalReason.KILLED);
	}
	
	@Override
	protected void pushAway(Entity entity)
	{
	
	}
	
	@Override
	public void pushAwayFrom(Entity entity)
	{
	
	}
	
	@Override
	public void onRemoved()
	{
		for (int i = 0; i < 5; i++)
		{
			Vec3d vel = Vec3d.ZERO.addRandom(random, 0.1f);
			getWorld().addParticle(ParticleTypes.FLAME, getX(), getY(), getZ(), vel.x, vel.y, vel.z);
		}
		//TODO: this only works sometimes ?
		super.onRemoved();
	}
}
