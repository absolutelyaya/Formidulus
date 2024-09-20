package absolutelyaya.formidulus.entities;

import net.minecraft.entity.AnimationState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;

public class DeerGodEntity extends HostileEntity
{
	public AnimationState poseAnimationState = new AnimationState();
	
	public DeerGodEntity(EntityType<? extends HostileEntity> entityType, World world)
	{
		super(entityType, world);
		poseAnimationState.start(0);
	}
	
	@Override
	public void pushAwayFrom(Entity entity)
	{
	
	}
	
	@Override
	protected void pushAway(Entity entity)
	{
	
	}
	
	@Override
	public boolean cannotDespawn()
	{
		return true;
	}
	
	@Override
	public void tickMovement()
	{
		super.tickMovement();
		//TODO: vanishing
		//for (int i = 0; i < 3; i++)
		//{
		//	Vec3d pos = new Vec3d(getX(), getY(), getZ()).add((random.nextFloat() - 0.5f) * 2f, random.nextFloat() * 4.5f, (random.nextFloat() - 0.5f) * 2f);
		//	getWorld().addParticle(new DustParticleEffect(new Vector3f(0f, 0f, 0f), 5f), pos.x, pos.y, pos.z, 0f, 0f, 0f);
		//}
	}
}
