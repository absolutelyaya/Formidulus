package absolutelyaya.formidulus.rendering.entity;

import absolutelyaya.formidulus.entities.DeerGodEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Vector3f;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class DeerGodModel extends SinglePartEntityModel<DeerGodEntity>
{
	private static final Vector3f TEMP = new Vector3f();
	private final ModelPart root;
	private final ModelPart body;
	private final ModelPart spineBottom;
	private final ModelPart spineBottomEnd;
	private final ModelPart hips;
	private final ModelPart legLeftTop;
	private final ModelPart legLeftMid;
	private final ModelPart legLeftBottom;
	private final ModelPart hoofLeft;
	private final ModelPart legRightTop;
	private final ModelPart legRightMid;
	private final ModelPart legRightBottom;
	private final ModelPart hoofRight;
	private final ModelPart spineCenter;
	private final ModelPart spineTop;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart eyes;
	private final ModelPart leftEye;
	private final ModelPart rightEye;
	private final ModelPart centerEye;
	private final ModelPart torso;
	private final ModelPart leftArm;
	private final ModelPart leftArmLower;
	private final ModelPart hand;
	private final ModelPart leftFinger1;
	private final ModelPart leftFingerTip1;
	private final ModelPart leftFinger2;
	private final ModelPart leftFingerTip2;
	private final ModelPart leftFinger3;
	private final ModelPart leftFingerTip3;
	private final ModelPart thumb;
	private final ModelPart thumbTip;
	private final ModelPart lantern;
	private final ModelPart handle;
	private final ModelPart chainStart;
	private final ModelPart chain1;
	private final ModelPart chain2;
	private final ModelPart chain3;
	private final ModelPart chain4;
	private final ModelPart chain5;
	private final ModelPart chain6;
	private final ModelPart hull;
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
	private final ModelPart flame;
	
	public DeerGodModel(ModelPart root)
	{
		this.root = root;
		this.body = root.getChild("body");
		this.spineBottom = body.getChild("spineBottom");
		this.spineBottomEnd = spineBottom.getChild("spineBottomEnd");
		this.hips = spineBottom.getChild("hips");
		this.legLeftTop = hips.getChild("legLeftTop");
		this.legLeftMid = legLeftTop.getChild("legLeftMid");
		this.legLeftBottom = legLeftMid.getChild("legLeftBottom");
		this.hoofLeft = legLeftBottom.getChild("hoofLeft");
		this.legRightTop = hips.getChild("legRightTop");
		this.legRightMid = legRightTop.getChild("legRightMid");
		this.legRightBottom = legRightMid.getChild("legRightBottom");
		this.hoofRight = legRightBottom.getChild("hoofRight");
		this.spineCenter = spineBottom.getChild("spineCenter");
		this.spineTop = spineCenter.getChild("spineTop");
		this.head = spineTop.getChild("head");
		this.jaw = head.getChild("jaw");
		this.eyes = head.getChild("eyes");
		this.leftEye = eyes.getChild("leftEye");
		this.rightEye = eyes.getChild("rightEye");
		this.centerEye = eyes.getChild("centerEye");
		this.torso = spineCenter.getChild("torso");
		this.leftArm = torso.getChild("leftArm");
		this.leftArmLower = leftArm.getChild("leftArmLower");
		this.hand = leftArmLower.getChild("hand");
		this.leftFinger1 = hand.getChild("leftFinger1");
		this.leftFingerTip1 = leftFinger1.getChild("leftFingerTip1");
		this.leftFinger2 = hand.getChild("leftFinger2");
		this.leftFingerTip2 = leftFinger2.getChild("leftFingerTip2");
		this.leftFinger3 = hand.getChild("leftFinger3");
		this.leftFingerTip3 = leftFinger3.getChild("leftFingerTip3");
		this.thumb = hand.getChild("thumb");
		this.thumbTip = thumb.getChild("thumbTip");
		this.lantern = hand.getChild("lantern");
		this.handle = lantern.getChild("handle");
		this.chainStart = handle.getChild("chainStart");
		this.chain1 = chainStart.getChild("chain1");
		this.chain2 = chain1.getChild("chain2");
		this.chain3 = chain2.getChild("chain3");
		this.chain4 = chain3.getChild("chain4");
		this.chain5 = chain4.getChild("chain5");
		this.chain6 = chain5.getChild("chain6");
		this.hull = chain6.getChild("hull");
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
		this.flame = body.getChild("flame");
		
		eyes.hidden = true;
		brokenArmGore1.hidden = true;
		brokenArmGore2.traverse().forEach(i -> i.hidden = true);
	}
	
	public static TexturedModelData getTexturedModelData()
	{
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		
		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(0, 0, 0, 0, 1, 0), ModelTransform.pivot(0.0F, 22.0F, 0.0F));
		
		ModelPartData spineBottom = body.addChild("spineBottom", ModelPartBuilder.create().uv(118, 117).cuboid(-1.0F, 0.0F, -1.0F, 3.0F, 9.0F, 1.0F, new Dilation(0.001F)), ModelTransform.pivot(-0.5F, -36.0F, 9.0F));
		
		ModelPartData spineBottomEnd = spineBottom.addChild("spineBottomEnd", ModelPartBuilder.create().uv(110, 122).cuboid(-1.0F, 0.0F, 0.0F, 3.0F, 4.0F, 1.0F, new Dilation(0.002F)), ModelTransform.pivot(0.0F, 9.0F, -1.0F));
		
		ModelPartData hips = spineBottom.addChild("hips", ModelPartBuilder.create().uv(81, 49).cuboid(-7.5F, 0.0F, -8.0F, 15.0F, 7.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.5F, 6.0F, -1.0F));
		
		ModelPartData legLeftTop = hips.addChild("legLeftTop", ModelPartBuilder.create().uv(94, 114).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, new Dilation(0.002F)), ModelTransform.pivot(5.5F, 7.0F, -6.0F));
		
		ModelPartData legLeftMid = legLeftTop.addChild("legLeftMid", ModelPartBuilder.create().uv(80, 105).cuboid(-2.0F, 0.0F, 0.0F, 3.0F, 9.0F, 4.0F, new Dilation(0.001F)), ModelTransform.pivot(0.5F, 10.0F, -2.0F));
		
		ModelPartData legLeftBottom = legLeftMid.addChild("legLeftBottom", ModelPartBuilder.create().uv(82, 118).cuboid(-2.0F, 0.0F, -3.0F, 3.0F, 7.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 9.0F, 3.0F));
		
		ModelPartData hoofLeft = legLeftBottom.addChild("hoofLeft", ModelPartBuilder.create().uv(70, 121).cuboid(-2.0F, 0.0F, 0.0F, 3.0F, 4.0F, 3.0F, new Dilation(-0.001F)), ModelTransform.pivot(0.0F, 7.0F, -3.0F));
		
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
															   .uv(10, 35).cuboid(-2.5F, -2.0F, -17.0F, 5.0F, 2.0F, 5.0F, new Dilation(0.0F))
															   .uv(30, 35).cuboid(-2.5F, 0.0F, -15.0F, 5.0F, 2.0F, 3.0F, new Dilation(0.0F))
															   .uv(18, 30).cuboid(-3.5F, 0.0F, -12.0F, 7.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -4.0F, 0.0F));
		
		ModelPartData cube_r1 = head.addChild("cube_r1", ModelPartBuilder.create().uv(88, -20).mirrored().cuboid(0.0F, -18.0F, -4.0F, 0.0F, 21.0F, 20.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(6.75F, -11.75F, 0.25F, -0.3847F, 0.9575F, -0.3139F));
		
		ModelPartData cube_r2 = head.addChild("cube_r2", ModelPartBuilder.create().uv(0, 6).mirrored().cuboid(0.0F, -0.9962F, -0.0872F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(2.4735F, -10.0529F, -2.9516F, -0.1723F, 0.0129F, 0.1745F));
		
		ModelPartData cube_r3 = head.addChild("cube_r3", ModelPartBuilder.create().uv(88, -20).cuboid(0.0F, -18.0F, -4.0F, 0.0F, 21.0F, 20.0F, new Dilation(0.0F)), ModelTransform.of(-6.75F, -11.75F, 0.25F, -0.3847F, -0.9575F, 0.3139F));
		
		ModelPartData cube_r4 = head.addChild("cube_r4", ModelPartBuilder.create().uv(0, 6).cuboid(-3.0F, -0.9962F, -0.0872F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.4735F, -10.0529F, -2.9516F, -0.1723F, -0.0129F, -0.1745F));
		
		ModelPartData jaw = head.addChild("jaw", ModelPartBuilder.create().uv(38, 32).cuboid(-2.5F, 5.0F, -8.0F, 5.0F, 1.0F, 8.0F, new Dilation(0.0F))
														 .uv(28, 41).cuboid(-2.5F, 0.0F, -8.0F, 5.0F, 5.0F, 8.0F, new Dilation(0.0F))
														 .uv(10, 45).cuboid(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -7.0F));
		
		ModelPartData eyes = head.addChild("eyes", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -5.0F, -10.0F));
		
		ModelPartData leftEye = eyes.addChild("leftEye", ModelPartBuilder.create().uv(0, 10).cuboid(-0.5F, -0.5F, -0.05F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(2.5F, 1.0F, 1.0F));
		
		ModelPartData rightEye = eyes.addChild("rightEye", ModelPartBuilder.create().uv(0, 10).cuboid(-0.5F, -0.5F, -0.05F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.5F, 1.0F, 1.0F));
		
		ModelPartData centerEye = eyes.addChild("centerEye", ModelPartBuilder.create().uv(0, 10).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.5F, 0.95F));
		
		ModelPartData torso = spineCenter.addChild("torso", ModelPartBuilder.create().uv(84, 80).cuboid(-7.5F, -11.0F, -7.0F, 15.0F, 12.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		
		ModelPartData leftArm = torso.addChild("leftArm", ModelPartBuilder.create().uv(42, 110).mirrored().cuboid(-1.5F, -2.0F, -2.0F, 3.0F, 14.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(9.5F, -9.0F, -3.5F));
		
		ModelPartData leftArmLower = leftArm.addChild("leftArmLower", ModelPartBuilder.create().uv(14, 110).mirrored().cuboid(-1.5F, 0.0F, -4.0F, 3.0F, 14.0F, 4.0F, new Dilation(0.01F)).mirrored(false), ModelTransform.pivot(0.0F, 12.0F, 2.0F));
		
		ModelPartData hand = leftArmLower.addChild("hand", ModelPartBuilder.create().uv(24, 107).mirrored().cuboid(0.0F, 0.0F, -2.0F, 1.0F, 4.0F, 3.0F, new Dilation(0.01F)).mirrored(false), ModelTransform.pivot(-0.5F, 14.0F, -2.0F));
		
		ModelPartData leftFinger1 = hand.addChild("leftFinger1", ModelPartBuilder.create().uv(56, 113).mirrored().cuboid(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.01F)).mirrored(false), ModelTransform.pivot(1.0F, 4.0F, -1.5F));
		
		ModelPartData leftFingerTip1 = leftFinger1.addChild("leftFingerTip1", ModelPartBuilder.create().uv(56, 108).mirrored().cuboid(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.01F)).mirrored(false), ModelTransform.pivot(0.0F, 3.0F, 0.0F));
		
		ModelPartData leftFinger2 = hand.addChild("leftFinger2", ModelPartBuilder.create().uv(56, 113).mirrored().cuboid(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.01F)).mirrored(false), ModelTransform.pivot(1.0F, 4.0F, -0.5F));
		
		ModelPartData leftFingerTip2 = leftFinger2.addChild("leftFingerTip2", ModelPartBuilder.create().uv(56, 108).mirrored().cuboid(-1.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new Dilation(0.01F)).mirrored(false), ModelTransform.pivot(0.0F, 3.0F, 0.0F));
		
		ModelPartData leftFinger3 = hand.addChild("leftFinger3", ModelPartBuilder.create().uv(56, 113).mirrored().cuboid(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.01F)).mirrored(false), ModelTransform.pivot(1.0F, 4.0F, 0.5F));
		
		ModelPartData leftFingerTip3 = leftFinger3.addChild("leftFingerTip3", ModelPartBuilder.create().uv(56, 108).mirrored().cuboid(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.01F)).mirrored(false), ModelTransform.pivot(0.0F, 3.0F, 0.0F));
		
		ModelPartData thumb = hand.addChild("thumb", ModelPartBuilder.create().uv(60, 113).mirrored().cuboid(0.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.01F)).mirrored(false), ModelTransform.pivot(0.0F, 1.0F, -2.0F));
		
		ModelPartData thumbTip = thumb.addChild("thumbTip", ModelPartBuilder.create().uv(56, 108).mirrored().cuboid(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.01F)).mirrored(false), ModelTransform.pivot(0.0F, 4.0F, 0.0F));
		
		ModelPartData lantern = hand.addChild("lantern", ModelPartBuilder.create(), ModelTransform.pivot(7.5F, -4.0F, 1.0F));
		
		ModelPartData handle = lantern.addChild("handle", ModelPartBuilder.create().uv(49, 56).cuboid(-4.0F, -1.0F, -1.5F, 8.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 1.0F, 0.0F));
		
		ModelPartData chainStart = handle.addChild("chainStart", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 1.0F, 0.0F));
		
		ModelPartData cube_r5 = chainStart.addChild("cube_r5", ModelPartBuilder.create().uv(21, 63).cuboid(-1.5F, -5.0F, 0.0F, 3.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 5.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		
		ModelPartData cube_r6 = chainStart.addChild("cube_r6", ModelPartBuilder.create().uv(21, 63).cuboid(-1.5F, -5.0F, 0.0F, 3.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 5.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		
		ModelPartData chain1 = chainStart.addChild("chain1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 5.0F, 0.0F));
		
		ModelPartData cube_r7 = chain1.addChild("cube_r7", ModelPartBuilder.create().uv(21, 63).cuboid(-1.5F, -5.0F, 0.0F, 3.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 5.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		
		ModelPartData cube_r8 = chain1.addChild("cube_r8", ModelPartBuilder.create().uv(21, 63).cuboid(-1.5F, -5.0F, 0.0F, 3.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 5.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		
		ModelPartData chain2 = chain1.addChild("chain2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		
		ModelPartData cube_r9 = chain2.addChild("cube_r9", ModelPartBuilder.create().uv(21, 63).cuboid(-1.5F, -5.0F, 0.0F, 3.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 5.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		
		ModelPartData cube_r10 = chain2.addChild("cube_r10", ModelPartBuilder.create().uv(21, 63).cuboid(-1.5F, -5.0F, 0.0F, 3.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 5.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		
		ModelPartData chain3 = chain2.addChild("chain3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		
		ModelPartData cube_r11 = chain3.addChild("cube_r11", ModelPartBuilder.create().uv(21, 63).cuboid(-1.5F, -5.0F, 0.0F, 3.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 5.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		
		ModelPartData cube_r12 = chain3.addChild("cube_r12", ModelPartBuilder.create().uv(21, 63).cuboid(-1.5F, -5.0F, 0.0F, 3.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 5.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		
		ModelPartData chain4 = chain3.addChild("chain4", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		
		ModelPartData cube_r13 = chain4.addChild("cube_r13", ModelPartBuilder.create().uv(21, 63).cuboid(-1.5F, -5.0F, 0.0F, 3.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 5.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		
		ModelPartData cube_r14 = chain4.addChild("cube_r14", ModelPartBuilder.create().uv(21, 63).cuboid(-1.5F, -5.0F, 0.0F, 3.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 5.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		
		ModelPartData chain5 = chain4.addChild("chain5", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		
		ModelPartData cube_r15 = chain5.addChild("cube_r15", ModelPartBuilder.create().uv(21, 63).cuboid(-1.5F, -5.0F, 0.0F, 3.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 5.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		
		ModelPartData cube_r16 = chain5.addChild("cube_r16", ModelPartBuilder.create().uv(21, 63).cuboid(-1.5F, -5.0F, 0.0F, 3.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 5.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		
		ModelPartData chain6 = chain5.addChild("chain6", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		
		ModelPartData cube_r17 = chain6.addChild("cube_r17", ModelPartBuilder.create().uv(21, 63).cuboid(-1.5F, -5.0F, 0.0F, 3.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 5.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		
		ModelPartData cube_r18 = chain6.addChild("cube_r18", ModelPartBuilder.create().uv(21, 63).cuboid(-1.5F, -5.0F, 0.0F, 3.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 5.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		
		ModelPartData hull = chain6.addChild("hull", ModelPartBuilder.create().uv(10, 69).cuboid(-5.5F, 14.0F, -5.5F, 11.0F, 4.0F, 11.0F, new Dilation(0.0F))
															 .uv(16, 57).cuboid(-5.5F, 3.0F, -5.5F, 11.0F, 1.0F, 11.0F, new Dilation(0.0F))
															 .uv(89, 70).cuboid(-4.5F, 2.0F, -4.5F, 9.0F, 1.0F, 9.0F, new Dilation(0.0F))
															 .uv(53, 61).cuboid(-4.5F, 4.0F, -4.5F, 9.0F, 10.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		
		ModelPartData brokenArm = torso.addChild("brokenArm", ModelPartBuilder.create().uv(42, 110).cuboid(-1.5F, -2.0F, -2.0F, 3.0F, 14.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-9.5F, -9.0F, -3.5F));
		
		ModelPartData brokenArmGore1 = brokenArm.addChild("brokenArmGore1", ModelPartBuilder.create().uv(22, 88).cuboid(-1.5F, -2.0F, -2.0F, 3.0F, 14.0F, 4.0F, new Dilation(0.25F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		
		ModelPartData brokenArmLower = brokenArm.addChild("brokenArmLower", ModelPartBuilder.create().uv(28, 110).cuboid(-1.5F, 0.0F, -4.0F, 3.0F, 14.0F, 4.0F, new Dilation(0.01F)), ModelTransform.pivot(0.0F, 12.0F, 2.0F));
		
		ModelPartData brokenArmGore2 = brokenArmLower.addChild("brokenArmGore2", ModelPartBuilder.create().uv(37, 84).cuboid(-2.5F, 16.0F, -2.0F, 4.0F, 18.0F, 4.0F, new Dilation(0.27F)), ModelTransform.pivot(0.0F, -16.0F, -2.0F));
		
		ModelPartData claw = brokenArmGore2.addChild("claw", ModelPartBuilder.create().uv(0, 85).cuboid(-4.0F, -2.0F, -3.0F, 8.0F, 7.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.5F, 34.0F, 1.5F));
		
		ModelPartData finger1 = claw.addChild("finger1", ModelPartBuilder.create().uv(10, 95).cuboid(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 3.0F, new Dilation(0.001F)), ModelTransform.pivot(-3.0F, 5.0F, -3.0F));
		
		ModelPartData finger1tip = finger1.addChild("finger1tip", ModelPartBuilder.create().uv(0, 95).cuboid(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, 0.0F));
		
		ModelPartData knife1 = finger1tip.addChild("knife1", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 5.0F, 1.0F));
		
		ModelPartData cube_r19 = knife1.addChild("cube_r19", ModelPartBuilder.create().uv(0, 97).cuboid(0.0F, 0.0F, -3.0F, 0.0F, 24.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, -0.4F, 0.1309F, 0.0F, 0.0F));
		
		ModelPartData finger2 = claw.addChild("finger2", ModelPartBuilder.create().uv(10, 95).cuboid(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 3.0F, new Dilation(0.001F)), ModelTransform.pivot(0.0F, 5.0F, -3.0F));
		
		ModelPartData finger2tip = finger2.addChild("finger2tip", ModelPartBuilder.create().uv(0, 95).cuboid(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, 0.0F));
		
		ModelPartData knife2 = finger2tip.addChild("knife2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 5.0F, 1.0F));
		
		ModelPartData cube_r20 = knife2.addChild("cube_r20", ModelPartBuilder.create().uv(0, 97).cuboid(0.0F, 0.0F, -3.0F, 0.0F, 24.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, -0.4F, 0.1309F, 0.0F, 0.0F));
		
		ModelPartData finger3 = claw.addChild("finger3", ModelPartBuilder.create().uv(10, 95).cuboid(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 3.0F, new Dilation(0.001F)), ModelTransform.pivot(3.0F, 5.0F, -3.0F));
		
		ModelPartData finger3tip = finger3.addChild("finger3tip", ModelPartBuilder.create().uv(0, 95).cuboid(-1.0F, 0.0F, 0.0F, 2.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, 0.0F));
		
		ModelPartData knife3 = finger3tip.addChild("knife3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 5.0F, 1.0F));
		
		ModelPartData cube_r21 = knife3.addChild("cube_r21", ModelPartBuilder.create().uv(0, 97).cuboid(0.0F, 0.0F, -3.0F, 0.0F, 24.0F, 7.0F, new Dilation(0.001F)), ModelTransform.of(0.0F, -3.0F, -0.4F, 0.1309F, 0.0F, 0.0F));
		
		ModelPartData flame = body.addChild("flame", ModelPartBuilder.create(), ModelTransform.pivot(17.5F, -6.0F, -6.5F));
		
		ModelPartData cube_r22 = flame.addChild("cube_r22", ModelPartBuilder.create().uv(43, 73).cuboid(-2.5F, -7.0F, 0.0F, 5.0F, 7.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		
		ModelPartData cube_r23 = flame.addChild("cube_r23", ModelPartBuilder.create().uv(43, 73).cuboid(-2.5F, -7.0F, 0.0F, 5.0F, 7.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		
		return TexturedModelData.of(modelData, 128, 128);
	}
	
	@Override
	public void setAngles(DeerGodEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
	{
		getPart().traverse().forEach(ModelPart::resetTransform);
		if(entity.idleAnimationState.isRunning()) //TODO: add running
			blendMovement(DeerGodAnimations.idle, DeerGodAnimations.walk, limbSwing, ageInTicks, limbSwingAmount, 1f, 3f, 5f);
		updateAnimation(entity.unsummonedPoseAnimationState, DeerGodAnimations.unsummonedPose, ageInTicks);
		updateAnimation(entity.spawnSequenceAnimationState, DeerGodAnimations.spawnSequence, ageInTicks);
		updateAnimation(entity.swingAnimationState, DeerGodAnimations.lanternSideSwing, ageInTicks);
		updateAnimation(entity.slamAnimationState, DeerGodAnimations.lanternSlam, ageInTicks);
		updateAnimation(entity.summonLanternAnimationState, DeerGodAnimations.summonLantern, ageInTicks);
		updateAnimation(entity.phaseTransitionAnimationState, DeerGodAnimations.phaseTransition, ageInTicks);
		updateAnimation(entity.deathAnimationState, DeerGodAnimations.death, ageInTicks);
		
		if(entity.shouldApplyLampArmPose())
		{
			if(entity.hasLantern())
				updateAnimation(entity.holdLanternAnimationState, DeerGodAnimations.holdLantern, ageInTicks);
			else
				updateAnimation(entity.noLanternAnimationState, DeerGodAnimations.noLantern, ageInTicks);
		}
		
		boolean claw = entity.hasClaw();
		brokenArmGore1.hidden = !claw;
		brokenArmGore2.traverse().forEach(i -> i.hidden = !claw);
		
		boolean spine = entity.isSpineVisible();
		spineBottomEnd.hidden = spineBottom.hidden = spineCenter.hidden = spineTop.hidden = !spine;
		
		if(!entity.shouldApplyClawPose())
			return;
		if(entity.hasClaw())
		{
			if(entity.shouldShowClawWithoutExtras())
				updateAnimation(entity.showClawWithoutExtrasAnimationState, DeerGodAnimations.showClawWithoutExtras, ageInTicks);
			else
				updateAnimation(entity.showClawAnimationState, DeerGodAnimations.showClaw, ageInTicks);
		}
		else
			updateAnimation(entity.noClawAnimationState, DeerGodAnimations.noClaw, ageInTicks);
	}
	
	void blendMovement(Animation idleAnim, Animation moveAnim, float limbAngle, float ageInTicks, float interpolation, float idleAnimSpeed, float moveAnimSpeed, float interpolationScale)
	{
		long moveTime = (long)(limbAngle * 50f * moveAnimSpeed);
		long idleTime = (long)(ageInTicks * 50f * idleAnimSpeed);
		float scale = Math.min(interpolation * interpolationScale, 1f);
		AnimationHelper.animate(this, moveAnim, moveTime, scale, TEMP);
		AnimationHelper.animate(this, idleAnim, idleTime, 1f - scale, TEMP);
	}
	
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color)
	{
		getPart().render(matrices, vertices, light, overlay);
	}
	
	@Override
	public ModelPart getPart()
	{
		return root;
	}
}
