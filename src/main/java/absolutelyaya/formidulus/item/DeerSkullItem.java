package absolutelyaya.formidulus.item;

import net.fabricmc.fabric.api.item.v1.EnchantingContext;
import net.minecraft.block.DispenserBlock;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Equipment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;

public class DeerSkullItem extends ExpandableLoreItem implements Equipment
{
	public DeerSkullItem(Settings settings)
	{
		super(settings);
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
