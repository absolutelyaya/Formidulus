package absolutelyaya.formidulus.rendering.entity;

import absolutelyaya.formidulus.FormidulusClient;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;

public class DeerGodSkullRenderer implements BuiltinItemRendererRegistry.DynamicItemRenderer
{
	DeerGodSkullModel model;
	
	public DeerGodSkullRenderer()
	{
	
	}
	
	@Override
	public void render(ItemStack stack, ModelTransformationMode mode, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay)
	{
		if(model == null)
			model = new DeerGodSkullModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(FormidulusClient.DEER_GOD_LAYER));
		matrices.push();
		if(!mode.equals(ModelTransformationMode.GUI))
			matrices.translate(0.5, 0f, 0.45);
		matrices.translate(0, 1.5, 0);
		matrices.scale(1, -1, 1);
		new DeerGodSkullModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(FormidulusClient.DEER_GOD_SKULL_LAYER))
				.render(matrices, vertexConsumers.getBuffer(RenderLayer.getEntityCutoutNoCull(DeerGodSkullModel.TEXTURE)), light, overlay);
		matrices.pop();
	}
}
