package absolutelyaya.formidulus.item.abilities;

import absolutelyaya.formidulus.components.FormidableComponents;
import absolutelyaya.formidulus.components.entity.IBulwarkComponent;
import absolutelyaya.formidulus.entities.BulwarkEntity;
import absolutelyaya.formidulus.registries.ItemRegistry;
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
		active = true;
		if(user instanceof PlayerEntity player)
		{
			IBulwarkComponent comp = FormidableComponents.BULWARK.get(player);
			if(comp.getBulwarkEntity() == null)
				comp.setBulwark(BulwarkEntity.place(player));
			user.setSneaking(true);
		}
		return super.onUse(stack, user, hand, result);
	}
	
	@Override
	public void onStopUsing(ItemStack stack, LivingEntity user, Hand hand)
	{
		super.onStopUsing(stack, user, hand);
		active = false;
		if(user instanceof PlayerEntity player)
		{
			IBulwarkComponent comp = FormidableComponents.BULWARK.get(player);
			if(comp.getBulwarkEntity() instanceof BulwarkEntity b && b.getCurrentAnimation() != (byte)2)
				b.setAnimation((byte)2);
			comp.setBulwark(null);
			user.setSneaking(false);
		}
		if(user instanceof PlayerEntity player)
			player.getItemCooldownManager().set(ItemRegistry.BULWARK, 40);
	}
}
