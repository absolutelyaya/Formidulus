package absolutelyaya.formidulus.item;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.item.components.ChargeComponent;
import absolutelyaya.formidulus.registries.DataComponentRegistry;
import absolutelyaya.formidulus.registries.ItemRegistry;
import net.minecraft.block.DispenserBlock;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

import java.util.List;

public class BulwarkItem extends Item implements Equipment
{
	public BulwarkItem(Settings settings)
	{
		super(settings);
		DispenserBlock.registerBehavior(this, ArmorItem.DISPENSER_BEHAVIOR);
	}
	
	public static AttributeModifiersComponent createAttributeModifiers()
	{
		return new AttributeModifiersComponent(List.of(
				new AttributeModifiersComponent.Entry(
						EntityAttributes.GENERIC_ATTACK_SPEED,
						new EntityAttributeModifier(BASE_ATTACK_SPEED_MODIFIER_ID, -2.75f, EntityAttributeModifier.Operation.ADD_VALUE),
						AttributeModifierSlot.HAND
				),
				new AttributeModifiersComponent.Entry(
						EntityAttributes.GENERIC_MOVEMENT_SPEED,
						new EntityAttributeModifier(Formidulus.identifier("heavy"), -0.05f, EntityAttributeModifier.Operation.ADD_VALUE),
						AttributeModifierSlot.HAND
				)), true);
	}
	
	@Override
	public boolean canRepair(ItemStack stack, ItemStack ingredient)
	{
		return ingredient.isOf(ItemRegistry.CHAINLINK);
	}
	
	@Override
	public int getMaxUseTime(ItemStack stack, LivingEntity user)
	{
		return 72000;
	}
	
	@Override
	public EquipmentSlot getSlotType() {
		return EquipmentSlot.OFFHAND;
	}
	
	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand)
	{
		ItemStack itemStack = user.getStackInHand(hand);
		user.setCurrentHand(hand);
		super.use(world, user, hand);
		return TypedActionResult.consume(itemStack);
	}
}
