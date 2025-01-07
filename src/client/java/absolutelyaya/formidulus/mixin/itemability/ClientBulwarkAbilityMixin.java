package absolutelyaya.formidulus.mixin.itemability;

import absolutelyaya.formidulus.item.abilities.BulwarkAbility;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BulwarkAbility.class)
public class ClientBulwarkAbilityMixin
{
	@Inject(method = "Labsolutelyaya/formidulus/item/abilities/BulwarkAbility;onUse(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/util/Hand;Lnet/minecraft/util/TypedActionResult;)Ljava/util/Optional;", at = @At("HEAD"))
	void onStartUsing(ItemStack stack, LivingEntity user, Hand hand, TypedActionResult<ItemStack> result, CallbackInfoReturnable<TypedActionResult<ItemStack>> cir)
	{
		MinecraftClient.getInstance().gameRenderer.setRenderHand(false);
	}
	
	@Inject(method = "Labsolutelyaya/formidulus/item/abilities/BulwarkAbility;onStopUsing(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/util/Hand;)V", at = @At("HEAD"))
	void onStopUsing(ItemStack stack, LivingEntity user, Hand hand, CallbackInfo ci)
	{
		MinecraftClient.getInstance().gameRenderer.setRenderHand(true);
	}
}
