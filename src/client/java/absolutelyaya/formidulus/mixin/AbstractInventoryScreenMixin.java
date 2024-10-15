package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.registries.StatusEffectRegistry;
import absolutelyaya.formidulus.registries.TagRegistry;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.AbstractInventoryScreen;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(AbstractInventoryScreen.class)
public class AbstractInventoryScreenMixin
{
	@Unique private static final Identifier DEER_EFFECT_WIDE_TEX = Formidulus.identifier("textures/gui/deer_effect_background_wide.png");
	@Unique private static final Identifier DEER_EFFECT_SMOL_TEX = Formidulus.identifier("textures/gui/deer_effect_background_smol.png");
	
	@WrapOperation(method = "drawStatusEffectBackgrounds", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/DrawContext;drawGuiTexture(Lnet/minecraft/util/Identifier;IIII)V"))
	void onDrawStatusEffectBackground(DrawContext context, Identifier texture, int x, int y, int width, int height, Operation<Void> original, @Local StatusEffectInstance effect, @Local(argsOnly = true) boolean wide)
	{
		if(effect.getEffectType().isIn(TagRegistry.DEER_EFFECTS))
		{
			if(wide)
				context.drawTexture(DEER_EFFECT_WIDE_TEX, x, y, 0, 0, 145, 32, 145, 32);
			else
				context.drawTexture(DEER_EFFECT_SMOL_TEX, x, y, 0, 0, 32, 32, 32, 32);
		}
		else
			original.call(context, texture, x, y, width, height);
	}
	
	@WrapOperation(method = "drawStatusEffectDescriptions", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/DrawContext;drawTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/Text;III)I"))
	int onDrawStatusEffectDescription(DrawContext context, TextRenderer textRenderer, Text text, int x, int y, int color, Operation<Integer> original, @Local StatusEffectInstance effect)
	{
		if(effect.getEffectType().isIn(TagRegistry.DEER_EFFECTS))
			return original.call(context, textRenderer, text, x, y + 2, color);
		else
			return original.call(context, textRenderer, text, x, y, color);
	}
}
