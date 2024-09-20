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
}
