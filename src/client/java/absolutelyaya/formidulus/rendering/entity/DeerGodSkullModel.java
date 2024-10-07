package absolutelyaya.formidulus.rendering.entity;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.client.model.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class DeerGodSkullModel extends Model
{
	public static final Identifier TEXTURE = Formidulus.identifier("textures/entity/deer_god.png");
	private final ModelPart root;
	
	public DeerGodSkullModel(ModelPart root)
	{
		super(RenderLayer::getEntityCutout);
		this.root = root;
	}
	
	public static TexturedModelData getTexturedModelData()
	{
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(2, 0).cuboid(-5.5F, -10.0F, -10.0F, 11.0F, 8.0F, 10.0F, new Dilation(0.0F))
		.uv(0, 18).cuboid(-4.5F, -2.0F, -10.0F, 9.0F, 2.0F, 10.0F, new Dilation(0.0F))
		.uv(38, 18).cuboid(-4.5F, -3.0F, -10.0F, 9.0F, 3.0F, 10.0F, new Dilation(-0.2F))
		.uv(44, 0).cuboid(-5.5F, -10.0F, -10.0F, 11.0F, 8.0F, 10.0F, new Dilation(-0.2F))
		.uv(34, 0).cuboid(-4.5F, -9.0F, -10.0F, 9.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 31).cuboid(-3.5F, -2.0F, -12.0F, 7.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(10, 35).cuboid(-2.5F, -2.0F, -17.0F, 5.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(30, 35).cuboid(-2.5F, 0.0F, -15.0F, 5.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(18, 30).cuboid(-3.5F, 0.0F, -12.0F, 7.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 8.0F));

		head.addChild("cube_r1", ModelPartBuilder.create().uv(88, -20).mirrored().cuboid(0.0F, -18.0F, -4.0F, 0.0F, 21.0F, 20.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(6.75F, -11.75F, 0.25F, -0.3847F, 0.9575F, -0.3139F));

		head.addChild("cube_r2", ModelPartBuilder.create().uv(0, 6).mirrored().cuboid(0.0F, -0.9962F, -0.0872F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(2.4735F, -10.0529F, -2.9516F, -0.1723F, 0.0129F, 0.1745F));

		head.addChild("cube_r3", ModelPartBuilder.create().uv(88, -20).cuboid(0.0F, -18.0F, -4.0F, 0.0F, 21.0F, 20.0F, new Dilation(0.0F)), ModelTransform.of(-6.75F, -11.75F, 0.25F, -0.3847F, -0.9575F, 0.3139F));

		head.addChild("cube_r4", ModelPartBuilder.create().uv(0, 6).cuboid(-3.0F, -0.9962F, -0.0872F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.4735F, -10.0529F, -2.9516F, -0.1723F, -0.0129F, -0.1745F));
		
		return TexturedModelData.of(modelData, 128, 128);
	}
	
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color)
	{
		root.render(matrices, vertices, light, overlay, color);
	}
}