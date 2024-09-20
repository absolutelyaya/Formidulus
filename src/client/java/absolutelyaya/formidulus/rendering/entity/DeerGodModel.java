package absolutelyaya.formidulus.rendering.entity;

import absolutelyaya.formidulus.entities.DeerGodEntity;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.ColorHelper;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class DeerGodModel extends SinglePartEntityModel<DeerGodEntity>
{
	private final ModelPart body;
	private final ModelPart spineBottom;
	private final ModelPart spineBottomEnd;
	private final ModelPart hips;
	private final ModelPart legLeftTop;
	private final ModelPart legLeftMid;
	private final ModelPart legtLeftBottom;
	private final ModelPart hoofLeft;
	private final ModelPart legRightTop;
	private final ModelPart legRightMid;
	private final ModelPart legRightBottom;
	private final ModelPart hoofRight;
	private final ModelPart spineCenter;
	private final ModelPart spineTop;
	public final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart torso;
	private final ModelPart brokenArm;
	private final ModelPart brokenArmGore1;
	private final ModelPart brokenArmLower;
	private final ModelPart brokenArmGore2;
	private final ModelPart claw;
	private final ModelPart finger1;
	private final ModelPart finger1tip;
	private final ModelPart knife1;
	private final ModelPart finger2;
	private final ModelPart finger2tip;
	private final ModelPart knife2;
	private final ModelPart finger3;
	private final ModelPart finger3tip;
	private final ModelPart knife3;
	
	public DeerGodModel(ModelPart root)
	{
		this.body = root.getChild("body");
		this.spineBottom = body.getChild("spineBottom");
		this.spineBottomEnd = spineBottom.getChild("spineBottomEnd");
		this.hips = spineBottom.getChild("hips");
		this.legLeftTop = hips.getChild("legLeftTop");
		this.legLeftMid = legLeftTop.getChild("legLeftMid");
		this.legtLeftBottom = legLeftMid.getChild("legtLeftBottom");
		this.hoofLeft = legtLeftBottom.getChild("hoofLeft");
		this.legRightTop = hips.getChild("legRightTop");
		this.legRightMid = legRightTop.getChild("legRightMid");
		this.legRightBottom = legRightMid.getChild("legRightBottom");
		this.hoofRight = legRightBottom.getChild("hoofRight");
		this.spineCenter = spineBottom.getChild("spineCenter");
		this.spineTop = spineCenter.getChild("spineTop");
		this.head = spineTop.getChild("head");
		this.jaw = head.getChild("jaw");
		this.torso = spineCenter.getChild("torso");
		this.brokenArm = torso.getChild("brokenArm");
		this.brokenArmGore1 = brokenArm.getChild("brokenArmGore1");
		this.brokenArmLower = brokenArm.getChild("brokenArmLower");
		this.brokenArmGore2 = brokenArmLower.getChild("brokenArmGore2");
		this.claw = brokenArmGore2.getChild("claw");
		this.finger1 = claw.getChild("finger1");
		this.finger1tip = finger1.getChild("finger1tip");
		this.knife1 = finger1tip.getChild("knife1");
		this.finger2 = claw.getChild("finger2");
		this.finger2tip = finger2.getChild("finger2tip");
		this.knife2 = finger2tip.getChild("knife2");
		this.finger3 = claw.getChild("finger3");
		this.finger3tip = finger3.getChild("finger3tip");
		this.knife3 = finger3tip.getChild("knife3");
	}
	
	public static TexturedModelData getTexturedModelData()
	{
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 22.0F, 0.0F));

		ModelPartData spineBottom = body.addChild("spineBottom", ModelPartBuilder.create().uv(118, 117).cuboid(-1.0F, 0.0F, -1.0F, 3.0F, 9.0F, 1.0F, new Dilation(0.001F)), ModelTransform.pivot(-0.5F, -36.0F, 9.0F));

		ModelPartData spineBottomEnd = spineBottom.addChild("spineBottomEnd", ModelPartBuilder.create().uv(110, 122).cuboid(-1.0F, 0.0F, 0.0F, 3.0F, 4.0F, 1.0F, new Dilation(0.002F)), ModelTransform.pivot(0.0F, 9.0F, -1.0F));

		ModelPartData hips = spineBottom.addChild("hips", ModelPartBuilder.create().uv(81, 49).cuboid(-7.5F, 0.0F, -8.0F, 15.0F, 7.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.5F, 6.0F, -1.0F));

		ModelPartData legLeftTop = hips.addChild("legLeftTop", ModelPartBuilder.create().uv(94, 114).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, new Dilation(0.002F)), ModelTransform.pivot(5.5F, 7.0F, -6.0F));

		ModelPartData legLeftMid = legLeftTop.addChild("legLeftMid", ModelPartBuilder.create().uv(80, 105).cuboid(-2.0F, 0.0F, 0.0F, 3.0F, 9.0F, 4.0F, new Dilation(0.001F)), ModelTransform.pivot(0.5F, 10.0F, -2.0F));

		ModelPartData legtLeftBottom = legLeftMid.addChild("legtLeftBottom", ModelPartBuilder.create().uv(82, 118).cuboid(-2.0F, 0.0F, -3.0F, 3.0F, 7.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 9.0F, 3.0F));

		ModelPartData hoofLeft = legtLeftBottom.addChild("hoofLeft", ModelPartBuilder.create().uv(70, 121).cuboid(-2.0F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, new Dilation(-0.001F)), ModelTransform.pivot(0.0F, 7.0F, -3.0F));

		ModelPartData legRightTop = hips.addChild("legRightTop", ModelPartBuilder.create().uv(94, 114).mirrored().cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, new Dilation(0.002F)).mirrored(false), ModelTransform.pivot(-5.5F, 7.0F, -6.0F));

		ModelPartData legRightMid = legRightTop.addChild("legRightMid", ModelPartBuilder.create().uv(80, 105).mirrored().cuboid(-1.0F, 0.0F, 0.0F, 3.0F, 9.0F, 4.0F, new Dilation(0.001F)).mirrored(false), ModelTransform.pivot(-0.5F, 10.0F, -2.0F));

		ModelPartData legRightBottom = legRightMid.addChild("legRightBottom", ModelPartBuilder.create().uv(82, 118).mirrored().cuboid(-1.0F, 0.0F, -3.0F, 3.0F, 7.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 9.0F, 3.0F));

		ModelPartData hoofRight = legRightBottom.addChild("hoofRight", ModelPartBuilder.create().uv(70, 121).mirrored().cuboid(-1.0F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, new Dilation(-0.001F)).mirrored(false), ModelTransform.pivot(0.0F, 7.0F, -3.0F));

		ModelPartData spineCenter = spineBottom.addChild("spineCenter", ModelPartBuilder.create().uv(118, 107).cuboid(-1.5F, -9.0F, 0.0F, 3.0F, 9.0F, 1.0F, new Dilation(0.002F)), ModelTransform.pivot(0.5F, 0.0F, -1.0F));

		ModelPartData spineTop = spineCenter.addChild("spineTop", ModelPartBuilder.create().uv(118, 99).cuboid(-1.5F, -7.0F, -1.0F, 3.0F, 7.0F, 1.0F, new Dilation(0.001F)), ModelTransform.pivot(0.0F, -9.0F, 1.0F));

		ModelPartData head = spineTop.addChild("head", ModelPartBuilder.create().uv(2, 0).cuboid(-5.5F, -10.0F, -10.0F, 11.0F, 8.0F, 10.0F, new Dilation(0.0F))
		.uv(0, 18).cuboid(-4.5F, -2.0F, -10.0F, 9.0F, 2.0F, 10.0F, new Dilation(0.0F))
		.uv(38, 18).cuboid(-4.5F, -3.0F, -10.0F, 9.0F, 3.0F, 10.0F, new Dilation(-0.2F))
		.uv(44, 0).cuboid(-5.5F, -10.0F, -10.0F, 11.0F, 8.0F, 10.0F, new Dilation(-0.2F))
		.uv(34, 0).cuboid(-4.5F, -9.0F, -10.0F, 9.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 31).cuboid(-3.5F, -2.0F, -12.0F, 7.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(14, 49).cuboid(-2.5F, -2.0F, -17.0F, 5.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(34, 50).cuboid(-2.5F, 0.0F, -15.0F, 5.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(18, 30).cuboid(-3.5F, 0.0F, -12.0F, 7.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -4.0F, 0.0F));

		ModelPartData cube_r1 = head.addChild("cube_r1", ModelPartBuilder.create().uv(88, -20).mirrored().cuboid(0.0F, -18.0F, -4.0F, 0.0F, 21.0F, 20.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(6.75F, -11.75F, 0.25F, -0.3847F, 0.9575F, -0.3139F));

		ModelPartData cube_r2 = head.addChild("cube_r2", ModelPartBuilder.create().uv(0, 6).mirrored().cuboid(0.0F, -0.9962F, -0.0872F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(2.4735F, -10.0529F, -2.9516F, -0.1723F, 0.0129F, 0.1745F));

		ModelPartData cube_r3 = head.addChild("cube_r3", ModelPartBuilder.create().uv(88, -20).cuboid(0.0F, -18.0F, -4.0F, 0.0F, 21.0F, 20.0F, new Dilation(0.0F)), ModelTransform.of(-6.75F, -11.75F, 0.25F, -0.3847F, -0.9575F, 0.3139F));

		ModelPartData cube_r4 = head.addChild("cube_r4", ModelPartBuilder.create().uv(0, 6).cuboid(-3.0F, -0.9962F, -0.0872F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.4735F, -10.0529F, -2.9516F, -0.1723F, -0.0129F, -0.1745F));

		ModelPartData jaw = head.addChild("jaw", ModelPartBuilder.create().uv(42, 47).cuboid(-2.5F, 5.0F, -8.0F, 5.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(42, 56).cuboid(-2.5F, 0.0F, -8.0F, 5.0F, 5.0F, 8.0F, new Dilation(0.0F))
		.uv(24, 60).cuboid(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -7.0F));

		ModelPartData torso = spineCenter.addChild("torso", ModelPartBuilder.create().uv(84, 79).cuboid(-7.5F, -11.0F, -7.0F, 15.0F, 12.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData brokenArm = torso.addChild("brokenArm", ModelPartBuilder.create().uv(39, 110).cuboid(-1.5F, -2.0F, -2.0F, 3.0F, 14.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-9.5F, -9.0F, -3.5F));

		ModelPartData brokenArmGore1 = brokenArm.addChild("brokenArmGore1", ModelPartBuilder.create().uv(22, 88).cuboid(-1.5F, -2.0F, -2.0F, 3.0F, 14.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData brokenArmLower = brokenArm.addChild("brokenArmLower", ModelPartBuilder.create().uv(25, 110).cuboid(-1.5F, 0.0F, -4.0F, 3.0F, 14.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 12.0F, 2.0F));

		ModelPartData brokenArmGore2 = brokenArmLower.addChild("brokenArmGore2", ModelPartBuilder.create().uv(37, 84).cuboid(-2.5F, 16.0F, -2.0F, 4.0F, 18.0F, 4.0F, new Dilation(0.27F)), ModelTransform.pivot(0.0F, -16.0F, -2.0F));

		ModelPartData claw = brokenArmGore2.addChild("claw", ModelPartBuilder.create().uv(0, 85).cuboid(-4.0F, -2.0F, -3.0F, 8.0F, 7.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.5F, 34.0F, 1.5F));

		ModelPartData finger1 = claw.addChild("finger1", ModelPartBuilder.create().uv(10, 95).cuboid(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 3.0F, new Dilation(0.001F)), ModelTransform.pivot(-3.0F, 5.0F, -3.0F));

		ModelPartData finger1tip = finger1.addChild("finger1tip", ModelPartBuilder.create().uv(0, 95).cuboid(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, 0.0F));

		ModelPartData knife1 = finger1tip.addChild("knife1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 5.0F, 1.0F));

		ModelPartData cube_r5 = knife1.addChild("cube_r5", ModelPartBuilder.create().uv(0, 97).cuboid(0.0F, 0.0F, -3.0F, 0.0F, 24.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, -0.4F, 0.1309F, 0.0F, 0.0F));

		ModelPartData finger2 = claw.addChild("finger2", ModelPartBuilder.create().uv(10, 95).cuboid(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 3.0F, new Dilation(0.001F)), ModelTransform.pivot(0.0F, 5.0F, -3.0F));

		ModelPartData finger2tip = finger2.addChild("finger2tip", ModelPartBuilder.create().uv(0, 95).cuboid(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, 0.0F));

		ModelPartData knife2 = finger2tip.addChild("knife2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 5.0F, 1.0F));

		ModelPartData cube_r6 = knife2.addChild("cube_r6", ModelPartBuilder.create().uv(0, 97).cuboid(0.0F, 0.0F, -3.0F, 0.0F, 24.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, -0.4F, 0.1309F, 0.0F, 0.0F));

		ModelPartData finger3 = claw.addChild("finger3", ModelPartBuilder.create().uv(10, 95).cuboid(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 3.0F, new Dilation(0.001F)), ModelTransform.pivot(3.0F, 5.0F, -3.0F));

		ModelPartData finger3tip = finger3.addChild("finger3tip", ModelPartBuilder.create().uv(0, 95).cuboid(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, 0.0F));

		ModelPartData knife3 = finger3tip.addChild("knife3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 5.0F, 1.0F));

		ModelPartData cube_r7 = knife3.addChild("cube_r7", ModelPartBuilder.create().uv(0, 97).cuboid(0.0F, 0.0F, -3.0F, 0.0F, 24.0F, 7.0F, new Dilation(0.001F)), ModelTransform.of(0.0F, -3.0F, -0.4F, 0.1309F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	
	@Override
	public void setAngles(DeerGodEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
	{
		getPart().traverse().forEach(ModelPart::resetTransform);
		float animationProgress = ageInTicks - (float)entity.age;
		updateAnimation(entity.poseAnimationState, DeerGodAnimations.pose, animationProgress);
	}
	
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color)
	{
		//TODO: vanishing
		body.render(matrices, vertices, light, overlay);
	}
	
	@Override
	public ModelPart getPart()
	{
		return body;
	}
}
