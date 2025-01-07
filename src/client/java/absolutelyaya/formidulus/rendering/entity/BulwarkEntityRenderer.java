package absolutelyaya.formidulus.rendering.entity;

import absolutelyaya.formidulus.FormidulusClient;
import absolutelyaya.formidulus.entities.BulwarkEntity;
import absolutelyaya.formidulus.rendering.equipment.BulwarkModel;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
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
		matrices.push();
		matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180 - yaw));
		matrices.scale(-1.0F, -1.0F, 1.0F);
		matrices.translate(0, -1.5, 0);
		model.setAngles(entity, 0.0F, 0.0F, entity.age + tickDelta, 0.0F, 0.0F);
		VertexConsumer vertexConsumer = vertexConsumers.getBuffer(model.getLayer(getTexture(entity)));
		model.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV);
		matrices.pop();
	}
}
