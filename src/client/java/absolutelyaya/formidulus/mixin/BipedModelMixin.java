package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.registries.ItemRegistry;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BipedEntityModel.class)
public class BipedModelMixin
{
	@Shadow @Final public ModelPart leftArm;
	
	@Shadow @Final public ModelPart rightArm;
	
	@Inject(method = "setAngles(Lnet/minecraft/entity/LivingEntity;FFFFF)V", at = @At("TAIL"))
	void afterSetAngle(LivingEntity livingEntity, float f, float g, float h, float i, float j, CallbackInfo ci)
	{
		setArmAngle(livingEntity, Hand.MAIN_HAND);
		setArmAngle(livingEntity, Hand.OFF_HAND);
	}
	
	@Unique
	void setArmAngle(LivingEntity living, Hand hand)
	{
		Arm arm = living.getMainArm();
		if(hand.equals(Hand.OFF_HAND))
			arm = arm.getOpposite();
		ModelPart armPart = arm.equals(Arm.LEFT) ? leftArm : rightArm;
		
		if(living.getStackInHand(hand).isOf(ItemRegistry.GREAT_LANTERN))
			armPart.pitch += (float)Math.toRadians(-20f);
	}
}
