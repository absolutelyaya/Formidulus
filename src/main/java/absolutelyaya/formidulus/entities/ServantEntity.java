package absolutelyaya.formidulus.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;

public abstract class ServantEntity extends HostileEntity
{
	BossEntity master;
	
	protected ServantEntity(EntityType<? extends HostileEntity> entityType, World world)
	{
		super(entityType, world);
	}
	
	public BossEntity getMaster()
	{
		return master;
	}
	
	public void setMaster(BossEntity master)
	{
		this.master = master;
	}
	
	public boolean hasMaster()
	{
		return master != null;
	}
}
