package absolutelyaya.formidulus.rendering.entity.feature;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.CreeperEntityModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.util.math.RotationAxis;

public class CreeperHeadFeatureRenderer extends FeatureRenderer<CreeperEntity, CreeperEntityModel<CreeperEntity>>
{
	public CreeperHeadFeatureRenderer(FeatureRendererContext<CreeperEntity, CreeperEntityModel<CreeperEntity>> context)
	{
		super(context);
	}
	
	@Override
	public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, CreeperEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch)
	{
		matrices.push();
		matrices.translate(0f, 0.4f, 0f);
		matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(headYaw));
		matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(headPitch));
		matrices.translate(0f, -0.35f, Math.max(headPitch / 90f, 0f) * 0.04f);
		matrices.scale(0.6f, -0.6f, 0.6f);
		MinecraftClient.getInstance().getItemRenderer().renderItem(entity, entity.getEquippedStack(EquipmentSlot.HEAD), ModelTransformationMode.HEAD, false,
				matrices, vertexConsumers, entity.getWorld(), light, OverlayTexture.DEFAULT_UV, 1);
		matrices.pop();
	}
}
