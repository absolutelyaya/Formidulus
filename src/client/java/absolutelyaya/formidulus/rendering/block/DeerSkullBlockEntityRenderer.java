package absolutelyaya.formidulus.rendering.block;

import absolutelyaya.formidulus.block.DeerSkullBlock;
import absolutelyaya.formidulus.block.DeerSkullBlockEntity;
import absolutelyaya.formidulus.registries.ItemRegistry;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;
import org.joml.Vector3f;

public class DeerSkullBlockEntityRenderer implements BlockEntityRenderer<DeerSkullBlockEntity>
{
	BlockRenderManager blockRenderer;
	ItemRenderer itemRenderer;
	
	public DeerSkullBlockEntityRenderer(BlockEntityRendererFactory.Context ctx)
	{
		itemRenderer = ctx.getItemRenderer();
		blockRenderer = ctx.getRenderManager();
	}
	
	@Override
	public void render(DeerSkullBlockEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay)
	{
		matrices.push();
		Direction dir = entity.getCachedState().get(DeerSkullBlock.FACING);
		Vector3f offset = dir.getOpposite().getUnitVector().mul(0.025f);
		matrices.translate(0.5f + offset.x, 0.4f, 0.5f + offset.z);
		boolean b = dir.getDirection().equals(Direction.AxisDirection.POSITIVE);
		if(dir.getAxis().equals(Direction.Axis.X))
			matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(b ? -27.5f : 27.5f));
		else
			matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(b ? 27.5f : -27.5f));
		matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-dir.getOpposite().asRotation()));
		itemRenderer.renderItem(ItemRegistry.DEER_SKULL.getDefaultStack(), ModelTransformationMode.GROUND, light, overlay,
				matrices, vertexConsumers, entity.getWorld(), 0);
		matrices.pop();
	}
}
