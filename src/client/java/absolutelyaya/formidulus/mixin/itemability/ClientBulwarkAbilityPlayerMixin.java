package absolutelyaya.formidulus.mixin.itemability;

import absolutelyaya.formidulus.components.FormidableComponents;
import absolutelyaya.formidulus.components.entity.IBulwarkComponent;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.mojang.authlib.GameProfile;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayerEntity.class)
public abstract class ClientBulwarkAbilityPlayerMixin extends PlayerEntity
{
	@Shadow public float lastRenderYaw;
	
	@Shadow public float lastRenderPitch;
	
	@Shadow public float renderPitch;
	
	@Shadow public float renderYaw;
	
	public ClientBulwarkAbilityPlayerMixin(World world, BlockPos pos, float yaw, GameProfile gameProfile)
	{
		super(world, pos, yaw, gameProfile);
	}
	
	@ModifyReturnValue(method = "isSneaking", at = @At("RETURN"))
	boolean modifySneaking(boolean original)
	{
		IBulwarkComponent comp = FormidableComponents.BULWARK.get(this);
		return original || comp.hasBulwark();
	}
	
	@Inject(method = "tickNewAi", at = @At("HEAD"), cancellable = true)
	void onTickNewAi(CallbackInfo ci)
	{
		IBulwarkComponent comp = FormidableComponents.BULWARK.get(this);
		if(comp.getBulwarkEntity() != null && !comp.getBulwarkEntity().isRemoved())
		{
			ci.cancel();
			lastRenderYaw = renderYaw;
			lastRenderPitch = renderPitch;
			renderPitch = renderPitch + (getPitch() - renderPitch) * 0.5F;
			renderYaw = renderYaw + (getYaw() - renderYaw) * 0.5F;
		}
	}
	
	@Inject(method = "updatePostDeath", at = @At("HEAD"))
	void onPostDeath(CallbackInfo ci)
	{
		IBulwarkComponent comp = FormidableComponents.BULWARK.get(this);
		if(comp.hasBulwark())
			MinecraftClient.getInstance().gameRenderer.setRenderHand(true);
	}
}
