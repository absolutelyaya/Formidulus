package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.gui.TitleHUD;
import absolutelyaya.formidulus.registries.StatusEffectRegistry;
import absolutelyaya.formidulus.registries.TagRegistry;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class InGameHudMixin
{
	@Unique private static final Identifier DEER_EFFECT_TEX = Formidulus.identifier("textures/gui/deer_effect_background_hud.png");
	@Unique private static final Identifier DEER_EFFECT_AMBIENT_TEX = Formidulus.identifier("textures/gui/deer_effect_background_hud_ambient.png");
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
	
	@WrapOperation(method = "renderStatusEffectOverlay", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/DrawContext;drawGuiTexture(Lnet/minecraft/util/Identifier;IIII)V"))
	void onDrawStatusEffectBackground(DrawContext context, Identifier texture, int x, int y, int width, int height, Operation<Void> original, @Local StatusEffectInstance effect)
	{
		if(effect.getEffectType().isIn(TagRegistry.DEER_EFFECTS))
		{
			if(effect.isAmbient())
				context.drawTexture(DEER_EFFECT_AMBIENT_TEX, x, y, 0, 0, 24, 24, 24, 24);
			else
				context.drawTexture(DEER_EFFECT_TEX, x, y, 0, 0, 24, 24, 24, 24);
		}
		else
			original.call(context, texture, x, y, width, height);
	}
}