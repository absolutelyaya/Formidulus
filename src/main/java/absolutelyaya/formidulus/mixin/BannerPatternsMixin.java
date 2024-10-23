package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.registries.FormidableBannerPatterns;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.block.entity.BannerPatterns;
import net.minecraft.registry.Registerable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BannerPatterns.class)
public abstract class BannerPatternsMixin
{
	@Inject(method = "bootstrap", at = @At("TAIL"))
	private static void afterBootstrap(Registerable<BannerPattern> registry, CallbackInfo ci)
	{
		registry.register(FormidableBannerPatterns.EYES, new BannerPattern(FormidableBannerPatterns.EYES.getValue(), "block.formidulus.banner.eyes"));
	}
}
