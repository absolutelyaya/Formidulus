package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.item.components.AbilityComponent;
import absolutelyaya.formidulus.registries.DataComponentRegistry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
public class ItemMixin
{
	@Inject(method = "use", at = @At("TAIL"))
	void onUse(World world, PlayerEntity user, Hand hand, CallbackInfoReturnable<TypedActionResult<ItemStack>> cir)
	{
		if(user.getStackInHand(hand).get(DataComponentRegistry.ABILITY) instanceof AbilityComponent component)
			component.ability().onUse(user.getStackInHand(hand), user, hand, cir.getReturnValue());
	}
	
	@Inject(method = "useOnBlock", at = @At("TAIL"))
	void onUseOnBlock(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir)
	{
		if(context.getStack().get(DataComponentRegistry.ABILITY) instanceof AbilityComponent component)
			component.ability().onUseOnBlock(context.getStack(), context, cir.getReturnValue());
	}
	
	@Inject(method = "useOnEntity", at = @At("TAIL"))
	void onUseOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand, CallbackInfoReturnable<ActionResult> cir)
	{
		if(stack.get(DataComponentRegistry.ABILITY) instanceof AbilityComponent component)
			component.ability().onUseOnEntity(stack, user, entity, hand, cir.getReturnValue());
	}
}
