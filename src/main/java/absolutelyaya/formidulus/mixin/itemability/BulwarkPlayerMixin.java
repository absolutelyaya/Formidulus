package absolutelyaya.formidulus.mixin.itemability;

import absolutelyaya.formidulus.components.FormidableComponents;
import absolutelyaya.formidulus.components.entity.IBulwarkComponent;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class BulwarkPlayerMixin extends LivingEntity
{
	protected BulwarkPlayerMixin(EntityType<? extends LivingEntity> entityType, World world)
	{
		super(entityType, world);
	}
	
	@Override
	public void takeKnockback(double strength, double x, double z)
	{
		IBulwarkComponent comp = FormidableComponents.BULWARK.get(this);
		if(comp.hasBulwark())
			return;
		super.takeKnockback(strength, x, z);
	}
	
	@Override
	protected double getGravity()
	{
		IBulwarkComponent comp = FormidableComponents.BULWARK.get(this);
		if(comp.hasBulwark())
			return super.getGravity() * 2f;
		return super.getGravity();
	}
	
	@Override
	public boolean isSneaking()
	{
		IBulwarkComponent comp = FormidableComponents.BULWARK.get(this);
		return super.isSneaking() || comp.hasBulwark();
	}
	
	@Inject(method = "jump", at = @At("HEAD"), cancellable = true)
	void onJump(CallbackInfo ci)
	{
		IBulwarkComponent comp = FormidableComponents.BULWARK.get(this);
		if(comp.hasBulwark())
			ci.cancel();
	}
	
	@ModifyVariable(method = "travel", at = @At("HEAD"), argsOnly = true)
	Vec3d modifyInputs(Vec3d input)
	{
		IBulwarkComponent comp = FormidableComponents.BULWARK.get(this);
		if(comp.hasBulwark())
			return input.multiply(0f, 1f, 0f);
		return input;
	}
	
	@Override
	public Vec3d getVelocity()
	{
		IBulwarkComponent comp = FormidableComponents.BULWARK.get(this);
		if(comp.hasBulwark())
			return super.getVelocity().multiply(0.3f, 1f, 0.3f);
		return super.getVelocity();
	}
	
	@Override
	public void changeLookDirection(double cursorDeltaX, double cursorDeltaY)
	{
		super.changeLookDirection(cursorDeltaX, cursorDeltaY);
		IBulwarkComponent comp = FormidableComponents.BULWARK.get(this);
		if(comp.hasBulwark())
		{
			float yaw = comp.getBulwarkYaw();
			setBodyYaw(yaw);
			float f = MathHelper.wrapDegrees(getYaw() - yaw);
			float g = MathHelper.clamp(f, -40f, 40f);
			prevYaw += g - f;
			setYaw(getYaw() + g - f);
			setHeadYaw(getYaw());
		}
	}
}
