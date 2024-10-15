package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.registries.StatusEffectRegistry;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(WorldRenderer.class)
public class WorldRendererMixin
{
	@ModifyReturnValue(method = "hasBlindnessOrDarkness", at = @At("RETURN"))
	boolean modifyHasBlindnessOrDarkness(boolean original, @Local(argsOnly = true) Camera cam)
	{
		return original || (cam.getFocusedEntity() instanceof LivingEntity living && living.hasStatusEffect(StatusEffectRegistry.DARKNESS));
	}
}
