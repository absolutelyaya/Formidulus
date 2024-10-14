package absolutelyaya.formidulus.rendering.entity;

import absolutelyaya.formidulus.entities.DeerFollowerEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EntityPose;
import net.minecraft.util.Arm;
import net.minecraft.util.math.MathHelper;
import org.joml.Vector3f;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class DeerFollowerModel extends BipedEntityModel<DeerFollowerEntity>
{
	private final ModelPart root;
	private final ModelPart crossedArms;
	private final ModelPart mask;
	private final ModelPart rightLegLower;
	private final ModelPart leftLegLower;
	private final ModelPart rightArmLower;
	private final ModelPart leftArmLower;
	
	public DeerFollowerModel(ModelPart root)
	{
		super(root);
		this.root = root;
		ModelPart body = root.getChild("body");
		ModelPart head = root.getChild("head");
		mask = head.getChild("mask");
		head.getChild("hood");
		ModelPart rightLeg = root.getChild("right_leg");
		rightLegLower = rightLeg.getChild("rightLegLower");
		ModelPart leftLeg = root.getChild("left_leg");
		leftLegLower = leftLeg.getChild("leftLegLower");
		crossedArms = body.getChild("crossedArms");
		ModelPart rightArm = root.getChild("right_arm");
		rightArmLower = rightArm.getChild("rightArmLower");
		ModelPart leftArm = root.getChild("left_arm");
		leftArmLower = leftArm.getChild("leftArmLower");
	}
	
	public static TexturedModelData getTexturedModelData()
	{
		ModelData modelData = new ModelData();
		ModelPartData root = modelData.getRoot();
		ModelPartData body = root.addChild("body", ModelPartBuilder.create().uv(72, 16).cuboid(-4.0F, -0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 31).cuboid(-4.0F, -0.0F, -2.0F, 8.0F, 15.0F, 4.0F, new Dilation(0.5F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData head = root.addChild("head", ModelPartBuilder.create().uv(72, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(-0.25F)), ModelTransform.pivot(0.0F, -12.0F, 0.0F));
		
		root.addChild("hat", ModelPartBuilder.create(), ModelTransform.NONE);
		
		ModelPartData mask = head.addChild("mask", ModelPartBuilder.create().uv(0, 16).cuboid(-4.5F, 0.0F, 0.0F, 9.0F, 7.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-4.5F, 0.0F, 0.0F, 9.0F, 8.0F, 8.0F, new Dilation(-0.15F))
		.uv(40, 27).cuboid(-2.5F, 6.0F, -5.0F, 5.0F, 2.0F, 6.0F, new Dilation(0.0F))
		.uv(40, 35).cuboid(-2.5F, 8.0F, -4.0F, 5.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -8.0F, -4.0F));

		mask.addChild("cube_r1", ModelPartBuilder.create().uv(34, 0).cuboid(0.0F, -8.0F, -4.0F, 0.0F, 11.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(5.325F, -1.85F, 8.3F, -0.3847F, 0.9575F, -0.3139F));

		mask.addChild("cube_r2", ModelPartBuilder.create().uv(58, 20).cuboid(0.0F, -0.9962F, -0.0872F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(1.5485F, -0.0529F, 5.0984F, -0.1723F, 0.0129F, 0.1745F));

		mask.addChild("cube_r3", ModelPartBuilder.create().uv(60, 35).cuboid(-3.0F, -0.9962F, -0.0872F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-1.5485F, -0.0529F, 5.0984F, -0.1723F, -0.0129F, -0.1745F));

		mask.addChild("cube_r4", ModelPartBuilder.create().uv(24, 31).cuboid(0.0F, -8.0F, -4.0F, 0.0F, 11.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-5.325F, -1.85F, 8.3F, -0.3847F, -0.9575F, 0.3139F));

		head.addChild("hood", ModelPartBuilder.create().uv(0, 74).cuboid(-4.5F, -8.0F, -4.0F, 9.0F, 8.0F, 8.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData rightLeg = root.addChild("right_leg", ModelPartBuilder.create().uv(72, 32).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 0.0F, 0.0F));

		rightLeg.addChild("rightLegLower", ModelPartBuilder.create().uv(72, 42).cuboid(-2.0F, 0.0F, 0.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, -2.0F));

		ModelPartData leftLeg = root.addChild("left_leg", ModelPartBuilder.create().uv(88, 32).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 0.0F, 0.0F));

		leftLeg.addChild("leftLegLower", ModelPartBuilder.create().uv(88, 42).cuboid(-2.0F, 0.0F, 0.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, -2.0F));

		ModelPartData crossedArms = body.addChild("crossedArms", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -1.0F + 12, 0.0F));

		crossedArms.addChild("cube_r5", ModelPartBuilder.create().uv(54, 42).cuboid(-1.5F, -0.0125F, -4.0217F, 3.0F, 8.0F, 4.0F, new Dilation(0.0F))
		.uv(40, 42).cuboid(-12.5F, -0.0125F, -4.0217F, 3.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(5.5F, -7.9783F, 2.0125F, -0.7854F, 0.0F, 0.0F));

		crossedArms.addChild("cube_r6", ModelPartBuilder.create().uv(34, 19).cuboid(-4.0F, -2.0F, -2.0F, 8.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -5.1741F, -3.6508F, -0.7854F, 0.0F, 0.0F));

		ModelPartData rightArm = root.addChild("right_arm", ModelPartBuilder.create().uv(72, 52).cuboid(-2.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, new Dilation(0.0F))
		.uv(72, 72).cuboid(-2.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, new Dilation(0.499F)), ModelTransform.pivot(-5.0F, -10.0F, 0.0F));

		rightArm.addChild("rightArmLower", ModelPartBuilder.create().uv(72, 62).cuboid(-1.5F, 0.0F, -4.0F, 3.0F, 6.0F, 4.0F, new Dilation(0.0F))
		.uv(72, 82).cuboid(-1.5F, 0.0F, -4.0F, 3.0F, 6.0F, 4.0F, new Dilation(0.498F)), ModelTransform.pivot(-0.5F, 4.0F, 2.0F));

		ModelPartData leftArm = root.addChild("left_arm", ModelPartBuilder.create().uv(88, 52).cuboid(-1.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, new Dilation(0.0F))
		.uv(88, 72).cuboid(-1.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, new Dilation(0.499F)), ModelTransform.pivot(5.0F, -10.0F, 0.0F));

		leftArm.addChild("leftArmLower", ModelPartBuilder.create().uv(88, 62).cuboid(-1.5F, 0.0F, -4.0F, 3.0F, 6.0F, 4.0F, new Dilation(0.0F))
		.uv(88, 82).cuboid(-1.5F, 0.0F, -4.0F, 3.0F, 6.0F, 4.0F, new Dilation(0.498F)), ModelTransform.pivot(0.5F, 4.0F, 2.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	
	@Override
	public void setAngles(DeerFollowerEntity entity, float f, float g, float h, float i, float j)
	{
		root.traverse().forEach(ModelPart::resetTransform);
		
		riding = riding || entity.getPose().equals(EntityPose.SITTING);
		super.setAngles(entity, f, g, h, i, j);
		crossedArms.visible = !entity.isArmsVisible();
		leftArm.traverse().forEach(part -> part.visible = entity.isArmsVisible());
		rightArm.traverse().forEach(part -> part.visible = entity.isArmsVisible());
		mask.visible = entity.isHasMask();
		switch(entity.getActivity())
		{
			case DeerFollowerEntity.ACTIVITY_READING -> applyReadingPose(entity);
			case DeerFollowerEntity.ACTIVITY_WORSHIP -> applyWorshipPose();
		}
	}
	
	void applyReadingPose(DeerFollowerEntity entity)
	{
		float amount = entity.getPose().equals(EntityPose.SITTING) ? 20f : 35f;
		if(entity.getMainArm().equals(Arm.RIGHT))
			leftArm.rotate(new Vector3f((float)Math.toRadians(-amount), 0f, 0f));
		else
			rightArm.rotate(new Vector3f((float)Math.toRadians(-amount), 0f, 0f));
	}
	
	void applyWorshipPose()
	{
		body.translate(new Vector3f(0f, 7f, -8f));
		body.rotate(new Vector3f(32.5f, 0f, 0f).mul(MathHelper.RADIANS_PER_DEGREE));
		rightLeg.translate(new Vector3f(0f, 5.9f, -1f));
		Vector3f rot = new Vector3f(17.6922f, -4.1807f, 3.6993f).mul(MathHelper.RADIANS_PER_DEGREE);
		rightLeg.pitch = rot.x;
		rightLeg.yaw = rot.y;
		rightLeg.roll = rot.z;
		rightLegLower.rotate(new Vector3f(75f, 0f, 0f).mul(MathHelper.RADIANS_PER_DEGREE));
		leftLeg.translate(new Vector3f(0f, 5.9f, -1f));
		rot = new Vector3f(-0.1f, 2.88f, -4.79f).mul(MathHelper.RADIANS_PER_DEGREE);
		leftLeg.pitch = rot.x;
		leftLeg.yaw = rot.y;
		leftLeg.roll = rot.z;
		leftLegLower.rotate(new Vector3f(80f, 0f, 0f).mul(MathHelper.RADIANS_PER_DEGREE));
		rightArm.translate(new Vector3f(0f, 9f, -7f));
		rightArm.rotate(new Vector3f(-40.1785f, -17.3519f, -21.6708f).mul(MathHelper.RADIANS_PER_DEGREE));
		rightArmLower.rotate(new Vector3f(-30f, 0f, 0f).mul(MathHelper.RADIANS_PER_DEGREE));
		leftArm.translate(new Vector3f(0f, 9.5f, -7f));
		leftArm.rotate(new Vector3f(-50.1379f, 21.4894f, 17.5835f).mul(MathHelper.RADIANS_PER_DEGREE));
		leftArmLower.rotate(new Vector3f(-25f, 0f, 0f).mul(MathHelper.RADIANS_PER_DEGREE));
		head.translate(new Vector3f(0f, 7.6f, -7.8f));
	}
	
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color)
	{
		root.render(matrices, vertices, light, overlay);
	}
}