package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.gui.TitleHUD;
import absolutelyaya.formidulus.registries.StatusEffectRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class InGameHudMixin
{
	@Unique float cinematicBars;
	
	@Inject(method="renderTitleAndSubtitle", at = @At(value = "HEAD"))
	private void init(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci)
	{
		TitleHUD.render(context, tickCounter.getLastFrameDuration());
		
		if(MinecraftClient.getInstance().player instanceof LivingEntity living && living.hasStatusEffect(StatusEffectRegistry.REVERENCE))
			cinematicBars = Math.min(cinematicBars + tickCounter.getTickDelta(true) / 20f, 1f);
		else if(cinematicBars > 0)
			cinematicBars = Math.max(cinematicBars - tickCounter.getTickDelta(true) / 5f, 0f);
		
		if(cinematicBars > 0f)
		{
			context.fill(0, 0, context.getScaledWindowWidth(), (int)(50 * cinematicBars), 0xff000000);
			int y = context.getScaledWindowHeight();
			context.fill(0, (int)(y - 50 * cinematicBars), context.getScaledWindowWidth(), y, 0xff000000);
		}
	}
}