package absolutelyaya.formidulus.components.entity;

import absolutelyaya.formidulus.components.FormidableComponents;
import absolutelyaya.formidulus.entities.BulwarkEntity;
import absolutelyaya.formidulus.item.abilities.ItemAbilities;
import absolutelyaya.formidulus.item.abilities.ItemAbility;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.registry.RegistryWrapper;

public class BulwarkAbilityEntityComponent implements IBulwarkComponent
{
	PlayerEntity provider;
	int bulwark = -1;
	float bulwarkYaw;
	
	public BulwarkAbilityEntityComponent(PlayerEntity provider)
	{
		this.provider = provider;
	}
	
	@Override
	public void setBulwark(BulwarkEntity entity)
	{
		bulwark = entity == null ? -1 : entity.getId();
		bulwarkYaw = entity == null ? 0f : entity.getYaw();
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
	public boolean hasBulwark()
	{
		return bulwark > -1;
	}
	
	@Override
	public float getBulwarkYaw()
	{
		return bulwarkYaw;
	}
	
	@Override
	public void onBulwarkBreak()
	{
		if(provider.getWorld().isClient)
			return;
		ItemStack active = provider.getActiveItem();
		if(ItemAbility.hasAbility(active, ItemAbilities.BULWARK))
		{
			provider.stopUsingItem();
			provider.clearActiveItem();
			provider.getItemCooldownManager().set(active.getItem(), 200);
		}
	}
	
	@Override
	public void readFromNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup)
	{
		if(tag.contains("Bulwark", NbtElement.INT_TYPE))
			bulwark = tag.getInt("Bulwark");
		if(tag.contains("BulwarkYaw", NbtElement.FLOAT_TYPE))
			bulwarkYaw = tag.getFloat("BulwarkYaw");
	}
	
	@Override
	public void writeToNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup)
	{
		tag.putInt("Bulwark", bulwark);
		tag.putFloat("BulwarkYaw", bulwarkYaw);
	}
}
