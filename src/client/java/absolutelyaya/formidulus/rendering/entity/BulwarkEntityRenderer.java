package absolutelyaya.formidulus.rendering.entity;

import absolutelyaya.formidulus.FormidulusClient;
import absolutelyaya.formidulus.entities.BulwarkEntity;
import absolutelyaya.formidulus.rendering.equipment.BulwarkModel;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.ColorHelper;
import net.minecraft.util.math.RotationAxis;

public class BulwarkEntityRenderer extends EntityRenderer<BulwarkEntity>
{
	final BulwarkModel model;
	
	public BulwarkEntityRenderer(EntityRendererFactory.Context ctx)
	{
		super(ctx);
		model = new BulwarkModel(ctx.getPart(FormidulusClient.BULWARK_LAYER));
	}
	
	@Override
	public Identifier getTexture(BulwarkEntity entity)
	{
		return BulwarkModel.TEXTURE;
	}
	
	@Override
	public void render(BulwarkEntity entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light)
	{
		super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
		ClientPlayerEntity localPlayer = MinecraftClient.getInstance().player;
		if(localPlayer == null)
			return;
		matrices.push();
		matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180 - yaw));
		matrices.scale(-1.0F, -1.0F, 1.0F);
		matrices.translate(0, -1.5, 0);
		model.setAngles(entity, 0.0F, 0.0F, entity.age + tickDelta, 0.0F, 0.0F);
		VertexConsumer vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(BulwarkModel.TEXTURE));
		model.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV,
				ColorHelper.Argb.fromFloats(localPlayer.equals(entity.getOwner()) ? 0.5f : 1f, 1f, 1f, 1f));
		matrices.pop();
	}
}
