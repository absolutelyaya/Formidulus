package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.entities.BossEntity;
import absolutelyaya.formidulus.registries.StatusEffectRegistry;
import absolutelyaya.formidulus.util.RotationUtil;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.Mouse;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.util.GlfwUtil;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.util.TypeFilter;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Smoother;
import net.minecraft.world.World;
import org.joml.Vector2f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(Mouse.class)
public abstract class MouseMixin
{
	@Shadow @Final private Smoother cursorXSmoother;
	
	@Shadow @Final private Smoother cursorYSmoother;
	
	@Shadow public abstract boolean isCursorLocked();
	
	@Shadow protected abstract void updateMouse(double timeDelta);
	
	@Unique float lastTickTime;
	
	@Inject(method = "tick", at=@At("TAIL"))
	void onTick(CallbackInfo ci)
	{
		double time = GlfwUtil.getTime();
		double timeDelta = time - lastTickTime;
		this.lastTickTime = (float)time;
		if(!isCursorLocked() && MinecraftClient.getInstance().player instanceof ClientPlayerEntity p && p.hasStatusEffect(StatusEffectRegistry.REVERENCE))
			updateMouse(timeDelta);
	}
	
	@Inject(method = "updateMouse", at = @At("HEAD"), cancellable = true)
	void onUpdateMouse(double timeDelta, CallbackInfo ci)
	{
		if(MinecraftClient.getInstance().player instanceof ClientPlayerEntity p && p.hasStatusEffect(StatusEffectRegistry.REVERENCE))
		{
			World world = p.getWorld();
			if(p.hasStatusEffect(StatusEffectRegistry.REVERENCE))
			{
				List<BossEntity> targets = world.getEntitiesByType(TypeFilter.instanceOf(BossEntity.class), p.getBoundingBox().expand(16), i -> true);
				BossEntity closest = world.getClosestEntity(targets, TargetPredicate.createNonAttackable(), p, p.getX(), p.getY(), p.getZ());
				if(closest == null || closest.distanceTo(p) > 16)
					return;
				Vector2f targetRot = RotationUtil.getRotationTowards(p.getEyePos(), closest.getFocusPos());
				Vector2f rot = new Vector2f(p.getYaw(), p.getPitch());
				Vector2f diff = new Vector2f(targetRot).sub(rot);
				diff = new Vector2f(MathHelper.wrapDegrees(diff.x), MathHelper.wrapDegrees(diff.y));
				Vector2f dir = new Vector2f(diff.x, diff.y).normalize();
				if(diff.length() > 0)
				{
					double dx = cursorXSmoother.smooth(dir.x * diff.length(), timeDelta * 5f);
					double dy = cursorYSmoother.smooth(dir.y * diff.length(), timeDelta * 5f);
					p.changeLookDirection(dx, dy);
				}
			}
			ci.cancel();
		}
	}
}
