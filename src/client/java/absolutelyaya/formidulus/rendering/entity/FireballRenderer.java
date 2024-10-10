package absolutelyaya.formidulus.rendering.entity;

import absolutelyaya.formidulus.entities.PumpkinProjectile;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;

public class FireballRenderer extends FlyingItemEntityRenderer<PumpkinProjectile>
{
	public FireballRenderer(EntityRendererFactory.Context context)
	{
		super(context);
	}
	
	@Override
	public void render(PumpkinProjectile entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light)
	{
		matrices.push();
		Vec3d dir = entity.getVelocity().normalize();
		matrices.multiply(RotationAxis.POSITIVE_Y.rotation((float)(-Math.atan2(dir.z, dir.x) - Math.toRadians(90f))));
		matrices.multiply(RotationAxis.POSITIVE_X.rotation((float)Math.atan2(dir.y, Math.sqrt(1 - dir.y * dir.y))));
		MinecraftClient.getInstance().getItemRenderer().renderItem(entity.getStack(), ModelTransformationMode.FIXED, LightmapTextureManager.MAX_BLOCK_LIGHT_COORDINATE,
				OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, entity.getWorld(), entity.getId());
		matrices.pop();
	}
}
