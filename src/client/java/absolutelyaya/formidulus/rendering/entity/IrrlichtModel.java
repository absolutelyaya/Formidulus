package absolutelyaya.formidulus.rendering.entity;

import absolutelyaya.formidulus.entities.IrrlichtEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class IrrlichtModel extends EntityModel<IrrlichtEntity>
{
	private final ModelPart bb_main;
	
	public IrrlichtModel(ModelPart root)
	{
		this.bb_main = root.getChild("bb_main");
	}
	public static TexturedModelData getTexturedModelData()
	{
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r1 = bb_main.addChild("cube_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -5.0F, 0.0F, 8.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, -1.0F, 0.0F, 2.3562F, 0.0F));

		ModelPartData cube_r2 = bb_main.addChild("cube_r2", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -5.0F, 0.0F, 8.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, -1.0F, 0.0F, 0.7854F, 0.0F));
		return TexturedModelData.of(modelData, 16, 16);
	}
	
	@Override
	public void setAngles(IrrlichtEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
	{
	
	}
	
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color)
	{
		matrices.push();
		matrices.translate(0f, 0f, 0.05f);
		bb_main.render(matrices, vertices, light, overlay, color);
		matrices.pop();
	}
}