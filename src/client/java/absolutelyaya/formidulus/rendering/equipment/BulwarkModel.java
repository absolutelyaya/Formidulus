package absolutelyaya.formidulus.rendering.equipment;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.client.model.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class BulwarkModel extends Model
{
	public static final Identifier TEXTURE = Formidulus.identifier("textures/entity/bulwark.png");
	private final ModelPart bb_main;
	
	public BulwarkModel(ModelPart root)
	{
		super(RenderLayer::getEntityCutout);
		this.bb_main = root.getChild("bb_main");
	}
	
	public static TexturedModelData getTexturedModelData()
	{
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(15, 15).cuboid(-7.5F, -24.0F, 0.0F, 15.0F, 19.0F, 1.0F, new Dilation(0.0F))
		.uv(13, 36).cuboid(-8.5F, -5.0F, -1.0F, 17.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(15, 43).cuboid(-8.5F, 0.0F, 0.0F, 17.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(48, 12).cuboid(-1.5F, -18.0F, 1.0F, 3.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color)
	{
		bb_main.render(matrices, vertices, light, overlay, color);
	}
}