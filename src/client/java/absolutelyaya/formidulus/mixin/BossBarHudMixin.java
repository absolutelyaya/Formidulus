package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.accessor.BossBarAccessor;
import com.chocohead.mm.api.ClassTinkerers;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.BossBarHud;
import net.minecraft.client.gui.hud.ClientBossBar;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;
import java.util.UUID;

@Mixin(BossBarHud.class)
public abstract class BossBarHudMixin
{
	@Shadow @Final Map<UUID, ClientBossBar> bossBars;
	
	@Shadow protected abstract void renderBossBar(DrawContext context, int x, int y, BossBar bossBar);
	
	@Shadow @Final private MinecraftClient client;
	@Unique private static final Identifier TEXTURE = Formidulus.identifier("textures/gui/deer_bossbar.png");
	@Unique private static final Random RANDOM = Random.create();
	
	@Inject(method = "render", at = @At("HEAD"), cancellable = true)
	void onRenderBossBar(DrawContext context, CallbackInfo ci)
	{
		BossBar.Style deerStyle = ClassTinkerers.getEnum(BossBar.Style.class, "DEER");
		if(bossBars.values().stream().noneMatch(i -> i.getStyle().equals(deerStyle)))
			return;
		
		MatrixStack matrices = context.getMatrices();
		int center = context.getScaledWindowWidth() / 2;
		int y = 12;
		for (ClientBossBar bar : bossBars.values())
		{
			if(bar.getStyle().equals(deerStyle))
			{
				matrices.push();
				matrices.translate(center, 9f, 0f);
				float shake = 0;
				if(bar instanceof BossBarAccessor barr)
				{
					barr.formidulus$update(0.02f);
					shake = barr.formidulus$getDeltaPercent() * 25f;
				}
				context.drawTexture(TEXTURE, -91, y - 9, 0, 0, 182, 9, 182, 27);
				matrices.push();
				if(shake > 1f && bar.getPercent() < 0.5f)
					matrices.translate((RANDOM.nextFloat() - 0.5f) * shake, (RANDOM.nextFloat() - 0.5f) * shake, 0f);
				context.drawTexture(TEXTURE, -84, y - 9, 7, 9, Math.round(168 * Math.min(bar.getPercent() * 2f, 1f)), 9, 182, 27);
				if(shake > 1f)
					matrices.translate((RANDOM.nextFloat() - 0.5f) * shake, (RANDOM.nextFloat() - 0.5f) * shake, 0f);
				context.drawTexture(TEXTURE, -84, y - 9, 7, 18, Math.round(168 * (bar.getPercent() * 2f - 1f)), 9, 182, 27);
				matrices.pop();
				matrices.pop();
				Text t = bar.getName();
				context.drawText(client.textRenderer, t, center - client.textRenderer.getWidth(t) / 2 - 1, y - 9, 0xffff0000, false);
				context.drawText(client.textRenderer, t, center - client.textRenderer.getWidth(t) / 2 + 1, y - 9, 0xffff0000, false);
				context.drawText(client.textRenderer, t, center - client.textRenderer.getWidth(t) / 2, y - 9 - 1, 0xffff0000, false);
				context.drawText(client.textRenderer, t, center - client.textRenderer.getWidth(t) / 2, y - 9 + 1, 0xffff0000, false);
				
				context.drawText(client.textRenderer, t, center - client.textRenderer.getWidth(t) / 2, y - 9, 0xff000000, false);
				y += 21;
				if(y > context.getScaledWindowHeight() / 3)
					break;
				continue;
			}
			renderBossBar(context, center - 91, y, bar);
			Text t = bar.getName();
			context.drawTextWithShadow(client.textRenderer, t, center - client.textRenderer.getWidth(t) / 2, y - 9, 0xffffffff);
			y += 10 + client.textRenderer.fontHeight;
			if(y > context.getScaledWindowHeight() / 3)
				break;
		}
		ci.cancel();
	}
}
