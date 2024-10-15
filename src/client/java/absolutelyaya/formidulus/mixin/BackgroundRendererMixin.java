package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.registries.StatusEffectRegistry;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.FogShape;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BackgroundRenderer.class)
public abstract class BackgroundRendererMixin
{
	@Shadow private static float red;
	
	@Shadow private static float green;
	
	@Shadow private static float blue;
	
	@Inject(method = "applyFog(Lnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/BackgroundRenderer$FogType;FZF)V",
			at = @At(value = "JUMP", ordinal = 11), cancellable = true)
	private static void modifyGetFogModifier(Camera camera, BackgroundRenderer.FogType fogType, float viewDistance, boolean thickFog, float tickDelta, CallbackInfo ci, @Local Entity entity)
	{
		if(entity instanceof LivingEntity living && living.hasStatusEffect(StatusEffectRegistry.DARKNESS))
		{
			StatusEffectInstance effect = living.getStatusEffect(StatusEffectRegistry.DARKNESS);
			if(effect == null)
				return;
			float f = 1f - Math.min(1f, effect.getDuration() / 30f);
			RenderSystem.setShaderFogStart((fogType == BackgroundRenderer.FogType.FOG_SKY) ? 0f : 4f + f * 16f);
			RenderSystem.setShaderFogEnd(18f + f * viewDistance);
			RenderSystem.setShaderFogShape(FogShape.CYLINDER);
			red = Math.max(f, 0.05f);
			green = f;
			blue = Math.max(f, 0.03f);
			RenderSystem.clearColor(red, green, blue, 0f);
			RenderSystem.setShaderFogColor(red, green, blue);
			ci.cancel();
		}
	}
	
	@WrapOperation(method = "render", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderSystem;clearColor(FFFF)V"))
	private static void modifyGetSkyColor(float red, float green, float blue, float alpha, Operation<Void> original, @Local(argsOnly = true) Camera camera)
	{
		if(camera.getFocusedEntity() instanceof LivingEntity living && living.hasStatusEffect(StatusEffectRegistry.DARKNESS))
		{
			original.call(0f, 0f, 0f, 0f);
			return;
		}
		original.call(red, green, blue, alpha);
	}
}
