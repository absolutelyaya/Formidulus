package absolutelyaya.formidulus.components.entity;

import absolutelyaya.formidulus.components.FormidableComponents;
import absolutelyaya.formidulus.entities.BulwarkEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.registry.RegistryWrapper;

public class BulwarkComponent implements IBulwarkComponent
{
	PlayerEntity provider;
	int bulwark = -1;
	
	public BulwarkComponent(PlayerEntity provider)
	{
		this.provider = provider;
	}
	
	@Override
	public void setBulwark(BulwarkEntity entity)
	{
		bulwark = entity == null ? -1 : entity.getId();
		FormidableComponents.BULWARK.sync(provider);
	}
	
	@Override
	public BulwarkEntity getBulwarkEntity()
	{
		if(bulwark == -1)
			return null;
		if(provider.getWorld().getEntityById(bulwark) instanceof BulwarkEntity b && b.getOwner().equals(provider))
			return b;
		return null;
	}
	
	@Override
	public void readFromNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup)
	{
		if(tag.contains("bulwark", NbtElement.INT_TYPE))
			bulwark = tag.getInt("bulwark");
	}
	
	@Override
	public void writeToNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup)
	{
		tag.putInt("bulwark", bulwark);
	}
}
