package absolutelyaya.formidulus.rendering.entity;

import absolutelyaya.formidulus.FormidulusClient;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;

public class JollyHatRenderer implements BuiltinItemRendererRegistry.DynamicItemRenderer
{
	JollyHatModel model;
	
	@Override
	public void render(ItemStack stack, ModelTransformationMode mode, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay)
	{
		if(model == null)
			model = new JollyHatModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(FormidulusClient.JOLLY_HAT_LAYER));
		matrices.push();
		matrices.translate(0.5, 1.475, 0.5);
		matrices.scale(1, -1, 1);
		model.render(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityCutoutNoCull(JollyHatModel.TEXTURE)), light, overlay);
		matrices.pop();
	}
}
