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
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
public class ItemMixin
{
	@Inject(method = "use", at = @At("TAIL"), cancellable = true)
	void onUse(World world, PlayerEntity user, Hand hand, CallbackInfoReturnable<TypedActionResult<ItemStack>> cir)
	{
		if(user.getStackInHand(hand).get(DataComponentRegistry.ABILITY) instanceof AbilityComponent component)
			component.ability().onUse(user.getStackInHand(hand), user, hand, cir.getReturnValue()).ifPresent(cir::setReturnValue);
	}
	
	@Inject(method = "usageTick", at = @At("TAIL"))
	void onUseTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks, CallbackInfo ci)
	{
		if(stack.get(DataComponentRegistry.ABILITY) instanceof AbilityComponent component)
			component.ability().onTickUsing(stack, user, user.getActiveHand());
	}
	
	@Inject(method = "onStoppedUsing", at = @At("TAIL"))
	void onStopUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks, CallbackInfo ci)
	{
		if(stack.get(DataComponentRegistry.ABILITY) instanceof AbilityComponent component)
			component.ability().onStopUsing(stack, user, user.getActiveHand());
	}
	
	@Inject(method = "useOnBlock", at = @At("TAIL"), cancellable = true)
	void onUseOnBlock(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir)
	{
		if(context.getStack().get(DataComponentRegistry.ABILITY) instanceof AbilityComponent component)
			component.ability().onUseOnBlock(context.getStack(), context, cir.getReturnValue()).ifPresent(cir::setReturnValue);
	}
	
	@Inject(method = "useOnEntity", at = @At("TAIL"), cancellable = true)
	void onUseOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand, CallbackInfoReturnable<ActionResult> cir)
	{
		if(stack.get(DataComponentRegistry.ABILITY) instanceof AbilityComponent component)
			component.ability().onUseOnEntity(stack, user, entity, hand, cir.getReturnValue()).ifPresent(cir::setReturnValue);
	}
}
