package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.accessor.BossBarAccessor;
import net.minecraft.client.gui.hud.ClientBossBar;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.text.Text;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.UUID;

@Mixin(ClientBossBar.class)
public abstract class ClientBossBarMixin implements BossBarAccessor
{
	@Shadow
	public abstract float getPercent();
	
	@Unique
	float deltaPercent;
	
	@Inject(method = "<init>", at = @At("TAIL"))
	void onInit(UUID uuid, Text name, float percent, BossBar.Color color, BossBar.Style style, boolean darkenSky, boolean dragonMusic, boolean thickenFog, CallbackInfo ci)
	{
		deltaPercent = percent;
	}
	
	@Override
	public float formidulus$getDeltaPercent()
	{
		return Math.abs(deltaPercent - getPercent());
	}
	
	@Override
	public void formidulus$update(float delta)
	{
		deltaPercent = MathHelper.lerp(delta, deltaPercent, getPercent());
	}
}
