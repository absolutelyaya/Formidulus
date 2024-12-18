package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.compat.TrinketsUtil;
import absolutelyaya.formidulus.item.components.AccessoryComponent;
import absolutelyaya.formidulus.registries.DataComponentRegistry;
import absolutelyaya.formidulus.registries.ItemRegistry;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ArmorFeatureRenderer.class)
public abstract class ArmorFeatureRendererMixin <T extends LivingEntity, M extends BipedEntityModel<T>, A extends BipedEntityModel<T>> extends FeatureRenderer<T, M>
{
	public ArmorFeatureRendererMixin(FeatureRendererContext<T, M> context)
	{
		super(context);
	}
	
	@WrapOperation(method = "render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/entity/LivingEntity;FFFFFF)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/entity/feature/ArmorFeatureRenderer;renderArmor(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/entity/EquipmentSlot;ILnet/minecraft/client/render/entity/model/BipedEntityModel;)V"))
	void wrapRenderArmor(ArmorFeatureRenderer<T, M, A> instance, MatrixStack matrices, VertexConsumerProvider vertexConsumers, T entity, EquipmentSlot armorSlot, int light, A model, Operation<Void> original)
	{
		if(armorSlot.equals(EquipmentSlot.HEAD))
		{
			boolean cancelHelmetRender = TrinketsUtil.performIfPresent(entity, ItemRegistry.DEER_SKULL, stack -> {
				AccessoryComponent accessory = stack.getComponents().get(DataComponentRegistry.ACCESSORY);
				return accessory != null && accessory.modes().get(accessory.activeMode()).equals("mask");
			});
			if(!cancelHelmetRender)
				cancelHelmetRender = TrinketsUtil.isHasTrinketEquipped(entity, ItemRegistry.JOLLY_HAT);
			if(cancelHelmetRender)
				return;
		}
		original.call(instance, matrices, vertexConsumers, entity, armorSlot, light, model);
	}
}
