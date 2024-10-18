package absolutelyaya.formidulus.item;

import absolutelyaya.formidulus.Formidulus;
import net.fabricmc.fabric.api.item.v1.EnchantingContext;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.block.BlockState;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class SacrificialDaggerItem extends ToolItem implements FabricItem
{
	public SacrificialDaggerItem(ToolMaterial toolMaterial, Item.Settings settings)
	{
		super(toolMaterial, settings);
	}
	
	public static AttributeModifiersComponent createAttributeModifiers()
	{
		return new AttributeModifiersComponent(List.of(
				new AttributeModifiersComponent.Entry(
						EntityAttributes.GENERIC_ATTACK_DAMAGE,
						new EntityAttributeModifier(BASE_ATTACK_DAMAGE_MODIFIER_ID, 7f, EntityAttributeModifier.Operation.ADD_VALUE),
						AttributeModifierSlot.MAINHAND
				),
				new AttributeModifiersComponent.Entry(
						EntityAttributes.GENERIC_ATTACK_SPEED,
						new EntityAttributeModifier(BASE_ATTACK_SPEED_MODIFIER_ID, 1f, EntityAttributeModifier.Operation.ADD_VALUE),
						AttributeModifierSlot.MAINHAND
				),
				//TODO: figure out why knockback reduction doesn't work
				//new AttributeModifiersComponent.Entry(
				//		EntityAttributes.GENERIC_ATTACK_KNOCKBACK,
				//		new EntityAttributeModifier(Formidulus.identifier("low_knockback"), 1f, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
				//		AttributeModifierSlot.MAINHAND
				//),
				new AttributeModifiersComponent.Entry(
						EntityAttributes.PLAYER_ENTITY_INTERACTION_RANGE,
						new EntityAttributeModifier(Formidulus.identifier("low_range_combat"), -0.75f, EntityAttributeModifier.Operation.ADD_VALUE),
						AttributeModifierSlot.MAINHAND
				),
				new AttributeModifiersComponent.Entry(
						EntityAttributes.PLAYER_BLOCK_INTERACTION_RANGE,
						new EntityAttributeModifier(Formidulus.identifier("low_range_mining"), -0.75f, EntityAttributeModifier.Operation.ADD_VALUE),
						AttributeModifierSlot.MAINHAND
				)), true);
	}
	
	@Override
	public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner)
	{
		return !miner.isCreative();
	}
	
	@Override
	public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker)
	{
		return true;
	}
	
	@Override
	public void postDamageEntity(ItemStack stack, LivingEntity target, LivingEntity attacker)
	{
		stack.damage(1, attacker, EquipmentSlot.MAINHAND);
	}
	
	@Override
	public float getBonusAttackDamage(Entity target, float baseAttackDamage, DamageSource damageSource)
	{
		return super.getBonusAttackDamage(target, baseAttackDamage, damageSource);
	}
	
	@Override
	public boolean canBeEnchantedWith(ItemStack stack, RegistryEntry<Enchantment> enchantment, EnchantingContext context)
	{
		return enchantment.getKey().isEmpty() || !enchantment.getKey().get().equals(Enchantments.SWEEPING_EDGE);
	}
}
