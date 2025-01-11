package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.components.FormidableComponents;
import absolutelyaya.formidulus.components.entity.IBulwarkComponent;
import absolutelyaya.formidulus.item.abilities.ItemAbilities;
import absolutelyaya.formidulus.item.abilities.ItemAbility;
import absolutelyaya.formidulus.registries.ItemRegistry;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.feature.HeldItemFeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.ModelWithArms;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.util.math.RotationAxis;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HeldItemFeatureRenderer.class)
public abstract class HeldItemRendererMixin<T extends LivingEntity, M extends EntityModel<T> & ModelWithArms> extends FeatureRenderer<T, M>
{
	public HeldItemRendererMixin(FeatureRendererContext<T, M> context)
	{
		super(context);
	}
	
	@Inject(method = "renderItem", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/item/HeldItemRenderer;renderItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/render/model/json/ModelTransformationMode;ZLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"), cancellable = true)
	void onRenderItem(LivingEntity entity, ItemStack stack, ModelTransformationMode transformationMode, Arm arm, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, CallbackInfo ci)
	{
		if(ItemAbility.hasAbility(stack, ItemAbilities.BULWARK) && entity instanceof PlayerEntity player)
		{
			IBulwarkComponent comp = FormidableComponents.BULWARK.get(player);
			if(comp.hasBulwark())
			{
				matrices.pop();
				ci.cancel();
			}
			return;
		}
		if(stack.isOf(ItemRegistry.GREAT_LANTERN))
		{
			matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-15f));
			matrices.translate(0, -0.35, -0.3);
		}
	}
}
