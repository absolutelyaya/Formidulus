package absolutelyaya.formidulus.item.abilities;

import absolutelyaya.formidulus.item.components.ChargeComponent;
import absolutelyaya.formidulus.registries.DataComponentRegistry;
import absolutelyaya.formidulus.registries.ItemRegistry;
import absolutelyaya.formidulus.registries.SoundRegistry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;

import java.util.Optional;

public class BulwarkAbility extends ItemAbility
{
	public BulwarkAbility(Identifier id)
	{
		super(id);
	}
	
	@Override
	public MutableText getNameText()
	{
		return super.getNameText().setStyle(STYLE.withColor(Formatting.BLUE));
	}
	
	@Override
	public int getDescriptionLines()
	{
		return 3;
	}
	
	@Override
	public Optional<TypedActionResult<ItemStack>> onUse(ItemStack stack, LivingEntity user, Hand hand, TypedActionResult<ItemStack> result)
	{
		return super.onUse(stack, user, hand, result);
	}
	
	@Override
	public void onStopUsing(ItemStack stack, LivingEntity user, Hand hand)
	{
		super.onStopUsing(stack, user, hand);
		if(user.isInCreativeMode() || !(stack.get(DataComponentRegistry.CHARGE) instanceof ChargeComponent comp))
			return;
		Optional<ChargeComponent> newCharge = comp.tryAddCharge(1f); //fully charge
		if(newCharge.isEmpty())
			return;
		stack.set(DataComponentRegistry.CHARGE, newCharge.get());
		if(user instanceof PlayerEntity player)
			player.getItemCooldownManager().set(ItemRegistry.BULWARK, 40);
	}
	
	public boolean consumeDamage(LivingEntity user, ItemStack stack, float damage)
	{
		if(!(stack.get(DataComponentRegistry.CHARGE) instanceof ChargeComponent comp))
			return false;
		Optional<ChargeComponent> newCharge = comp.tryConsumeCharge(damage / 15f); //consume charge based on damage taken (can take 30 damage total)
		if(newCharge.isEmpty())
			return false;
		stack.set(DataComponentRegistry.CHARGE, newCharge.get());
		if(newCharge.get().charge() == 0f && user instanceof PlayerEntity player) //when charge runs out, disable Shield
		{
			player.getItemCooldownManager().set(ItemRegistry.BULWARK, 400);
			if(!player.getWorld().isClient)
				player.playSound(SoundRegistry.BULWARK_BREAK, 1f, 0.8f);
		}
		else if(!user.getWorld().isClient)
			user.playSound(SoundRegistry.BULWARK_BLOCK, 1f, 0.8f);
		return true;
	}
}
