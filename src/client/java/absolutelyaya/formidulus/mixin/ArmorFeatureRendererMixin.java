package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.item.components.AccessoryComponent;
import absolutelyaya.formidulus.registries.DataComponentRegistry;
import absolutelyaya.formidulus.registries.ItemRegistry;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import dev.emi.trinkets.TrinketSlot;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketComponent;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Pair;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.Map;
import java.util.Optional;

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
		Optional<TrinketComponent> comp = TrinketsApi.getTrinketComponent(entity);
		if(armorSlot.equals(EquipmentSlot.HEAD) && comp.isPresent() && comp.get().isEquipped(ItemRegistry.DEER_SKULL))
		{
			for (Pair<SlotReference, ItemStack> i : comp.get().getEquipped(ItemRegistry.DEER_SKULL))
			{
				AccessoryComponent accessory = i.getRight().getComponents().get(DataComponentRegistry.ACCESSORY);
				if(accessory != null && accessory.modes().get(accessory.activeMode()).equals("mask"))
					return;
			}
		}
		original.call(instance, matrices, vertexConsumers, entity, armorSlot, light, model);
	}
}
