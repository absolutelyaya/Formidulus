package absolutelyaya.formidulus.rendering.trinkets;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.client.TrinketRenderer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

public class JollyHatTrinketRenderer implements TrinketRenderer
{
	@Override
	public void render(ItemStack stack, SlotReference slotReference, EntityModel<? extends LivingEntity> contextModel, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, LivingEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch)
	{
		if(entity instanceof AbstractClientPlayerEntity player && contextModel instanceof PlayerEntityModel<?>)
		{
			TrinketRenderer.translateToFace(matrices, (PlayerEntityModel<AbstractClientPlayerEntity>)contextModel, player, headYaw, headPitch);
			matrices.scale(0.65f, -0.65f, 0.65f);
			matrices.translate(0, 0, 0.5);
			MinecraftClient.getInstance().getItemRenderer().renderItem(entity, stack, ModelTransformationMode.HEAD, false,
					matrices, vertexConsumers, entity.getWorld(), light, OverlayTexture.DEFAULT_UV, 1);
		}
	}
}
