package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.gui.TitleHUD;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.entity.effect.StatusEffectInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class InGameHudMixin
{
	@Inject(method="renderTitleAndSubtitle", at = @At(value = "HEAD"))
	private void init(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci)
	{
		TitleHUD.render(context, tickCounter.getLastFrameDuration());
	}
}