package absolutelyaya.formidulus.rendering.entity;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.client.model.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class JollyHatModel extends Model
{
	public static final Identifier TEXTURE = Formidulus.identifier("textures/item/jolly_cap.png");
	private final ModelPart root;
	private final ModelPart tip;
	private final ModelPart bone;
	
	public JollyHatModel(ModelPart root)
	{
		super(RenderLayer::getEntityCutout);
		this.root = root.getChild("root");
		this.tip = this.root.getChild("tip");
		this.bone = this.tip.getChild("bone");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create().uv(0, 15).cuboid(-5.0F, -3.0F, -5.0F, 10.0F, 4.0F, 10.0F, new Dilation(0.25F))
		.uv(0, 29).cuboid(-5.0F, -4.115F, -5.0F, 10.0F, 4.0F, 10.0F, new Dilation(0.25F))
		.uv(30, 33).cuboid(-5.0F, -5.23F, -5.0F, 10.0F, 4.0F, 10.0F, new Dilation(0.25F))
		.uv(0, 0).cuboid(-5.0F, -5.0F, -5.0F, 10.0F, 5.0F, 10.0F, new Dilation(0.0F))
		.uv(40, 0).cuboid(-5.0F, -5.0F, -5.0F, 10.0F, 2.0F, 10.0F, new Dilation(-0.25F)), ModelTransform.pivot(0.0F, 23.0F, 0.0F));

		ModelPartData tip = root.addChild("tip", ModelPartBuilder.create().uv(31, 20).cuboid(-3.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, -5.2F, -4.0F));

		ModelPartData bone = tip.addChild("bone", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, 0.5F, 0.2F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 1.0F, 8.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color)
	{
		root.render(matrices, vertices, light, overlay);
	}
}