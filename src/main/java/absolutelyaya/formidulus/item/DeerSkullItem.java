package absolutelyaya.formidulus.item;

import absolutelyaya.formidulus.registries.BlockRegistry;
import net.fabricmc.fabric.api.item.v1.EnchantingContext;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.block.DispenserBlock;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.entry.RegistryEntry;

public class DeerSkullItem extends BlockItem implements Equipment, FabricItem
{
	public static final String ACCESSORY_MODE_MASK = "mask";
	public static final String ACCESSORY_MODE_CAP = "cap";
	
	public DeerSkullItem(Item.Settings settings)
	{
		super(BlockRegistry.DEER_SKULL, settings);
		DispenserBlock.registerBehavior(this, ArmorItem.DISPENSER_BEHAVIOR);
	}
	
	@Override
	public EquipmentSlot getSlotType()
	{
		return EquipmentSlot.HEAD;
	}
	
	@Override
	public boolean isEnchantable(ItemStack stack)
	{
		return true;
	}
	
	@Override
	public boolean canBeEnchantedWith(ItemStack stack, RegistryEntry<Enchantment> enchantment, EnchantingContext context)
	{
		return enchantment.equals(Enchantments.BINDING_CURSE);
	}
}
