package absolutelyaya.formidulus.rendering.entity;// Save this class in your mod and generate all required imports

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

/**
 * Made with Blockbench 4.10.4
 * Exported for Minecraft version 1.19 or later with Yarn mappings
 * @author Absolutelyaya
 */
public class DeerGodAnimations
{
	public static final Animation pose = Animation.Builder.create(0.0F)
		.addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-34.7714F, -10.6229F, 11.4027F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("jaw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("jaw", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 2.0274F, -0.2156F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("claw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-33.6404F, 37.2028F, 8.1506F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("claw", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.4673F, -1.3712F, -0.605F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(23.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger1tip", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(57.679F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger2tip", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(46.282F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger3tip", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(47.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("knife3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, -2.5F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-69.3012F, -23.4908F, -16.702F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(28.4327F, 28.2176F, 54.0908F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.1736F, -0.9848F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("torso", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0437F, 4.4899F, 0.832F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineTop", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.1402F, 10.7145F, -3.1723F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hips", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineBottomEnd", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftBottom", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftMid", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightMid", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hoofLeft", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftArm", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(8.7685F, 16.9416F, -51.2783F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftArm", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-0.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-67.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("lantern", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-7.9691F, 78.8825F, 94.5937F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("lantern", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-7.75F, -7.7F, -2.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("flame", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hull", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.2362F, 1.7702F, -8.2665F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("handle", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, 2.5F, 5.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chainStart", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(2.4976F, -0.109F, 2.4976F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("thumb", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.776F, -1.0873F, 55.7603F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("thumb", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hand", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-16.8502F, -3.6311F, -62.5178F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hand", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("thumbTip", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -52.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-18.1429F, 15.2099F, 30.0306F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFingerTip1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 80.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-4.2764F, 5.8539F, 28.3899F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFingerTip2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.5744F, 6.7089F, 32.3286F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger3", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.2F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFingerTip3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR)
		))
		.build();

	public static final Animation unsummonedPose = Animation.Builder.create(0.0F).looping()
		.addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -49.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hips", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("torso", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.build();

	public static final Animation spawnSequence = Animation.Builder.create(11.0F)
		.addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.9F, AnimationHelper.createRotationalVector(0.0F, 10.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.55F, AnimationHelper.createRotationalVector(0.0F, 10.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -49.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, -49.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.5F, AnimationHelper.createTranslationalVector(0.0F, 6.1F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.7F, AnimationHelper.createTranslationalVector(0.0F, 7.1F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.05F, AnimationHelper.createTranslationalVector(0.0F, -7.9F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.5F, AnimationHelper.createTranslationalVector(0.0F, -7.9F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createTranslationalVector(0.0F, -0.8F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createTranslationalVector(0.0F, -0.8F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createTranslationalVector(0.0F, -0.8F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.75F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.5F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(4.6758F, 2.2422F, -2.7032F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.75F, AnimationHelper.createRotationalVector(4.6758F, 2.2422F, -2.7032F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineBottomEnd", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hips", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.5F, AnimationHelper.createRotationalVector(0.0F, -10.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(0.0F, -10.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.85F, AnimationHelper.createRotationalVector(0.0F, 15.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.55F, AnimationHelper.createRotationalVector(0.0F, 15.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hips", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.699F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.7F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.999F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(-42.8111F, -7.8418F, 1.4283F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.95F, AnimationHelper.createRotationalVector(-42.8111F, -7.8418F, 1.4283F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.05F, AnimationHelper.createRotationalVector(-52.8111F, -7.8418F, 1.4283F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.5F, AnimationHelper.createRotationalVector(-52.8111F, -7.8418F, 1.4283F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.5F, AnimationHelper.createRotationalVector(-1.8577F, -17.2808F, -2.5417F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(-1.8577F, -17.2808F, -2.5417F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.85F, AnimationHelper.createRotationalVector(-18.0915F, -23.4954F, -5.4331F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.55F, AnimationHelper.createRotationalVector(-18.0915F, -23.4954F, -5.4331F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.95F, AnimationHelper.createRotationalVector(-18.6743F, -20.3348F, -3.7262F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(4.05F, AnimationHelper.createTranslationalVector(-0.8737F, -0.0923F, 1.5322F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.5F, AnimationHelper.createTranslationalVector(-0.8737F, -0.0923F, 1.5322F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.95F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftMid", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(57.621F, 0.7341F, 3.009F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.95F, AnimationHelper.createRotationalVector(57.621F, 0.7341F, 3.009F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.05F, AnimationHelper.createRotationalVector(85.121F, 0.7341F, 3.009F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.5F, AnimationHelper.createRotationalVector(85.121F, 0.7341F, 3.009F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(52.4982F, 5.0263F, 2.4467F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.25F, AnimationHelper.createRotationalVector(58.9097F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.5F, AnimationHelper.createRotationalVector(45.1597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(45.1597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.9F, AnimationHelper.createRotationalVector(45.1597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.55F, AnimationHelper.createRotationalVector(45.1597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.9F, AnimationHelper.createRotationalVector(49.0221F, 3.1449F, 3.8876F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.75F, AnimationHelper.createRotationalVector(49.0221F, 3.1449F, 3.8876F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftBottom", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(-64.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.95F, AnimationHelper.createRotationalVector(-64.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.05F, AnimationHelper.createRotationalVector(-86.6649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.5F, AnimationHelper.createRotationalVector(-86.6649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(-54.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.25F, AnimationHelper.createRotationalVector(-64.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.5F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.9F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.55F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.9F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hoofLeft", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(5.5F, AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.9F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.55F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.9F, AnimationHelper.createRotationalVector(25.92F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.75F, AnimationHelper.createRotationalVector(25.92F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.7F, AnimationHelper.createRotationalVector(-5.6157F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.95F, AnimationHelper.createRotationalVector(19.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.05F, AnimationHelper.createRotationalVector(35.116F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.5F, AnimationHelper.createRotationalVector(35.116F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(-17.0212F, 15.9483F, 3.6433F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(-17.0212F, 15.9483F, 3.6433F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.9F, AnimationHelper.createRotationalVector(-14.2224F, 11.1045F, 4.9194F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.55F, AnimationHelper.createRotationalVector(-14.2224F, 11.1045F, 4.9194F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(7.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightMid", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.7F, AnimationHelper.createRotationalVector(57.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.9F, AnimationHelper.createRotationalVector(67.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.95F, AnimationHelper.createRotationalVector(57.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.05F, AnimationHelper.createRotationalVector(48.8012F, -0.122F, -5.1503F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.5F, AnimationHelper.createRotationalVector(48.8012F, -0.122F, -5.1503F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(52.6597F, -1.0544F, -5.4887F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.55F, AnimationHelper.createRotationalVector(52.6597F, -1.0544F, -5.4887F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.7F, AnimationHelper.createRotationalVector(-81.8103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.95F, AnimationHelper.createRotationalVector(-56.8103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.05F, AnimationHelper.createRotationalVector(-63.4567F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.5F, AnimationHelper.createRotationalVector(-63.4567F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(-54.1649F, 1.3726F, -0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(-54.1649F, 1.3726F, -0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.85F, AnimationHelper.createRotationalVector(-61.6649F, 1.3726F, -0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.55F, AnimationHelper.createRotationalVector(-61.6649F, 1.3726F, -0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.7F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.95F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.05F, AnimationHelper.createRotationalVector(-22.99F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.5F, AnimationHelper.createRotationalVector(-22.99F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.55F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.95F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.05F, AnimationHelper.createTranslationalVector(0.0F, 1.406F, 0.2706F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.5F, AnimationHelper.createTranslationalVector(0.0F, 1.406F, 0.2706F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.55F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(10.1402F, 10.7145F, -3.1723F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(10.1402F, 10.7145F, -3.1723F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.1F, AnimationHelper.createRotationalVector(14.6647F, 8.9413F, -6.2761F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.3F, AnimationHelper.createRotationalVector(12.1647F, 8.9413F, -6.2761F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.5F, AnimationHelper.createRotationalVector(12.1647F, 8.9413F, -6.2761F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(9.9387F, -7.3584F, 0.0429F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.4F, AnimationHelper.createRotationalVector(7.5518F, -12.3157F, -0.6188F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(7.6315F, -14.7938F, -0.9585F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.9F, AnimationHelper.createRotationalVector(7.6493F, 10.6431F, 1.7058F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.55F, AnimationHelper.createRotationalVector(7.6493F, 10.6431F, 1.7058F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.0F, AnimationHelper.createRotationalVector(10.2533F, 5.3516F, -1.5833F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineTop", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.1F, AnimationHelper.createRotationalVector(39.9011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.65F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.95F, AnimationHelper.createRotationalVector(27.2642F, -0.0044F, -2.1618F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(27.2642F, -0.0044F, -2.1618F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.5F, AnimationHelper.createRotationalVector(27.2642F, -0.0044F, -2.1618F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.75F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-7.2888F, -2.4751F, 0.3165F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.15F, AnimationHelper.createRotationalVector(-7.3891F, -2.1557F, 2.798F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(-7.3891F, -2.1557F, 2.798F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(-7.052F, -0.4352F, -2.5675F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(-7.052F, -0.4352F, -2.5675F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-7.2888F, -2.4751F, 0.3165F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.6F, AnimationHelper.createRotationalVector(-7.3891F, -2.1557F, 2.798F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.7F, AnimationHelper.createRotationalVector(-6.9537F, -5.4413F, -2.1177F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.8F, AnimationHelper.createRotationalVector(-9.7888F, -2.4751F, 0.3165F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.9F, AnimationHelper.createRotationalVector(-7.5071F, 2.4786F, -0.3265F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-6.9537F, -5.4413F, -2.1177F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.1F, AnimationHelper.createRotationalVector(-9.5243F, -0.8495F, -5.0331F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.2F, AnimationHelper.createRotationalVector(-7.3891F, -2.1557F, 2.798F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.3F, AnimationHelper.createRotationalVector(-7.5071F, 2.4786F, -0.3265F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.35F, AnimationHelper.createRotationalVector(-7.2888F, -2.4751F, 0.3165F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.4F, AnimationHelper.createRotationalVector(-7.3891F, -2.1557F, 2.798F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.45F, AnimationHelper.createRotationalVector(-6.9537F, -5.4413F, -2.1177F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(-9.7888F, -2.4751F, 0.3165F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.55F, AnimationHelper.createRotationalVector(-7.5071F, 2.4786F, -0.3265F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.6F, AnimationHelper.createRotationalVector(-6.9537F, -5.4413F, -2.1177F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.65F, AnimationHelper.createRotationalVector(-9.5243F, -0.8495F, -5.0331F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.7F, AnimationHelper.createRotationalVector(-7.3891F, -2.1557F, 2.798F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(-7.5071F, 2.4786F, -0.3265F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(-7.2888F, -2.4751F, 0.3165F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.85F, AnimationHelper.createRotationalVector(-7.3891F, -2.1557F, 2.798F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.9F, AnimationHelper.createRotationalVector(-6.9537F, -5.4413F, -2.1177F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.95F, AnimationHelper.createRotationalVector(-9.7888F, -2.4751F, 0.3165F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(-7.5071F, 2.4786F, -0.3265F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(-6.9537F, -5.4413F, -2.1177F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.1F, AnimationHelper.createRotationalVector(-9.5243F, -0.8495F, -5.0331F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.15F, AnimationHelper.createRotationalVector(-7.3891F, -2.1557F, 2.798F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(-7.5071F, 2.4786F, -0.3265F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.45F, AnimationHelper.createRotationalVector(-6.9537F, -5.4413F, -2.1177F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.55F, AnimationHelper.createRotationalVector(-7.3891F, -2.1557F, 2.798F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.95F, AnimationHelper.createRotationalVector(7.4929F, 2.4786F, -0.3265F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.05F, AnimationHelper.createRotationalVector(2.4929F, 2.4786F, -0.3265F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.2F, AnimationHelper.createRotationalVector(-2.62F, 4.8643F, -2.9406F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.5F, AnimationHelper.createRotationalVector(-2.62F, 4.8643F, -2.9406F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(0.3307F, -2.0621F, -1.9736F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.5F, AnimationHelper.createRotationalVector(-1.6408F, -19.5056F, 3.221F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.0F, AnimationHelper.createRotationalVector(-1.6681F, -22.0045F, 3.2982F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(-1.6681F, -22.0045F, 3.2982F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.0F, AnimationHelper.createRotationalVector(-0.2888F, 10.8328F, -2.4753F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.65F, AnimationHelper.createRotationalVector(-0.1633F, 3.9056F, 0.4144F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.95F, AnimationHelper.createRotationalVector(-7.2525F, 7.501F, 20.6205F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(-7.2525F, 7.501F, 20.6205F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.5F, AnimationHelper.createRotationalVector(-6.919F, 7.8095F, 23.1238F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.75F, AnimationHelper.createRotationalVector(0.3361F, 10.4377F, -1.9008F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(-34.344F, -6.5042F, 8.5351F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.2F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.5F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("jaw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(2.3F, AnimationHelper.createRotationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.9F, AnimationHelper.createRotationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.15F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.3F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.6F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(1.8266F, 1.6188F, 5.4202F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.75F, AnimationHelper.createRotationalVector(11.0464F, 0.181F, 2.4387F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("jaw", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(2.3F, AnimationHelper.createTranslationalVector(0.0197F, 2.9888F, -0.1979F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.9F, AnimationHelper.createTranslationalVector(0.0197F, 2.9888F, -0.1979F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.15F, AnimationHelper.createTranslationalVector(0.0F, 1.3513F, -0.0344F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.3F, AnimationHelper.createTranslationalVector(0.0F, 1.3513F, -0.0344F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.6F, AnimationHelper.createTranslationalVector(0.0F, 2.0274F, -0.2156F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createTranslationalVector(0.0565F, 1.9829F, 0.2549F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createTranslationalVector(0.0976F, 2.3531F, 0.3891F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.75F, AnimationHelper.createTranslationalVector(-0.0545F, 1.9888F, -0.0409F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.0F, AnimationHelper.createTranslationalVector(0.0565F, 1.9829F, 0.2549F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createTranslationalVector(0.0565F, 1.9829F, 0.2549F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createTranslationalVector(0.0F, 2.0274F, -0.2156F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("torso", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(0.0437F, 4.4899F, 0.832F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(0.0437F, 4.4899F, 0.832F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(0.0436F, -0.5101F, 0.8282F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("torso", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.699F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.7F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.999F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftArm", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(4.05F, AnimationHelper.createRotationalVector(13.4843F, 13.5362F, -33.479F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.15F, AnimationHelper.createRotationalVector(23.1083F, 5.9081F, -6.6443F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.3F, AnimationHelper.createRotationalVector(18.3377F, 5.1262F, -4.2587F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.5F, AnimationHelper.createRotationalVector(17.846F, 6.6798F, -9.0367F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(-14.36F, 20.6424F, -30.3657F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.5F, AnimationHelper.createRotationalVector(4.099F, 8.9549F, -64.5955F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(3.2978F, 9.2777F, -69.6489F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.7F, AnimationHelper.createRotationalVector(-26.2417F, 7.9551F, -66.912F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.8F, AnimationHelper.createRotationalVector(-40.8536F, 18.0891F, -43.4106F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.0F, AnimationHelper.createRotationalVector(-48.9283F, -2.2827F, -54.7569F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(-48.9283F, -2.2827F, -54.7569F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.5F, AnimationHelper.createRotationalVector(-47.2907F, 14.5647F, -39.7003F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.75F, AnimationHelper.createRotationalVector(-27.2434F, 6.6857F, -42.219F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(8.7685F, 16.9416F, -51.2783F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftArm", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(4.05F, AnimationHelper.createTranslationalVector(-0.6428F, -0.926F, -0.3495F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.15F, AnimationHelper.createTranslationalVector(-0.6428F, -0.926F, -0.3495F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9962F, -0.0872F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createTranslationalVector(-0.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(4.1F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.2F, AnimationHelper.createRotationalVector(-40.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.35F, AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.55F, AnimationHelper.createRotationalVector(-55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(-52.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.5F, AnimationHelper.createRotationalVector(-80.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(-79.9907F, -2.462F, -0.4344F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.7F, AnimationHelper.createRotationalVector(-60.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.8F, AnimationHelper.createRotationalVector(-62.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.5F, AnimationHelper.createRotationalVector(-80.0093F, 0.434F, -2.4621F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(-80.0093F, 0.434F, -2.4621F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.5F, AnimationHelper.createRotationalVector(-80.0093F, 0.434F, -2.4621F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.75F, AnimationHelper.createRotationalVector(-60.01F, 0.43F, -2.46F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(-67.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hand", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(-16.8502F, -3.6311F, -62.5178F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(-15.6263F, 22.9193F, -35.6867F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.7F, AnimationHelper.createRotationalVector(-16.8502F, -3.6311F, -62.5178F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.8F, AnimationHelper.createRotationalVector(-18.6293F, 10.8224F, -34.3553F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.5F, AnimationHelper.createRotationalVector(-24.6385F, 41.1819F, -47.5377F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(-24.6385F, 41.1819F, -47.5377F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.75F, AnimationHelper.createRotationalVector(-18.218F, 43.9278F, -20.5584F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(-16.8502F, -3.6311F, -62.5178F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hand", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(3.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(-18.1429F, 15.2099F, 30.0306F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(-15.6249F, 7.9813F, 13.9032F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.3F, AnimationHelper.createRotationalVector(-16.5037F, -5.9032F, -31.6431F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.45F, AnimationHelper.createRotationalVector(-16.9384F, -4.4638F, -26.835F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.65F, AnimationHelper.createRotationalVector(-17.4844F, -0.7515F, -14.8844F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.95F, AnimationHelper.createRotationalVector(-17.4844F, 0.7515F, -10.1156F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.5F, AnimationHelper.createRotationalVector(-17.4375F, 1.5018F, -7.7303F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(-17.3593F, -2.2494F, -19.6566F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.7F, AnimationHelper.createRotationalVector(-18.1429F, 15.2099F, 30.0306F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(-18.1429F, 15.2099F, 30.0306F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(-18.1429F, 15.2099F, 30.0306F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(3.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFingerTip1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 80.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 60.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 30.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 27.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 45.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 47.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 40.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 80.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 80.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 80.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(-4.2764F, 5.8539F, 28.3899F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 15.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -35.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.85F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -17.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -15.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -27.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.7F, AnimationHelper.createRotationalVector(-4.2764F, 5.8539F, 28.3899F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(-4.2764F, 5.8539F, 28.3899F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(-4.2764F, 5.8539F, 28.3899F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFingerTip2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 75.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 30.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 47.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 50.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 42.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(9.5744F, 6.7089F, 32.3286F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 20.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.8F, AnimationHelper.createRotationalVector(15.1291F, 1.5065F, -32.6291F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.1F, AnimationHelper.createRotationalVector(14.8981F, -3.06F, -15.7294F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.5F, AnimationHelper.createRotationalVector(14.7554F, -3.6999F, -13.3084F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(15.1624F, -1.1125F, -22.9773F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.7F, AnimationHelper.createRotationalVector(9.5744F, 6.7089F, 32.3286F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(9.5744F, 6.7089F, 32.3286F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(9.5744F, 6.7089F, 32.3286F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger3", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(3.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.2F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.2F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.2F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.2F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFingerTip3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.9F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 40.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 52.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 55.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 45.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("thumb", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(-17.776F, -1.0873F, 55.7603F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(-60.2444F, -31.8956F, 79.1775F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.3F, AnimationHelper.createRotationalVector(-56.0171F, -33.8662F, 75.9631F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.0F, AnimationHelper.createRotationalVector(-54.2045F, -17.4308F, 84.1974F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.5F, AnimationHelper.createRotationalVector(-53.0345F, -17.9608F, 80.5287F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(-44.9019F, -5.8049F, 89.529F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.7F, AnimationHelper.createRotationalVector(-17.776F, -1.0873F, 55.7603F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(-17.776F, -1.0873F, 55.7603F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(-17.776F, -1.0873F, 55.7603F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("thumb", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(3.5F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createTranslationalVector(0.5942F, 0.9772F, 0.0667F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.75F, AnimationHelper.createTranslationalVector(0.5942F, 0.9772F, 0.0667F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.7F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("thumbTip", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -52.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -45.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.45F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -72.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -40.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -35.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -52.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -52.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -52.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("lantern", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(-7.9691F, 78.8825F, 94.5937F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(-7.9691F, 78.8825F, 94.5937F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(-7.9691F, 78.8825F, 94.5937F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(-7.9691F, 78.8825F, 94.5937F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("lantern", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(3.5F, AnimationHelper.createTranslationalVector(-7.75F, -7.7F, -2.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createTranslationalVector(-7.75F, -7.7F, -2.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createTranslationalVector(-7.75F, -7.7F, -2.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createTranslationalVector(-7.75F, -7.7F, -2.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("lantern", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(7.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.649F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.8F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("handle", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(-5.0F, 2.5F, 5.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(-5.0F, 2.5F, 5.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chainStart", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(2.4976F, -0.109F, 2.4976F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.7F, AnimationHelper.createRotationalVector(1.3433F, 3.0955F, 34.7562F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.9F, AnimationHelper.createRotationalVector(-18.5366F, -4.8207F, 47.8619F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.1F, AnimationHelper.createRotationalVector(-5.1245F, -29.154F, -2.6935F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.6F, AnimationHelper.createRotationalVector(-19.6211F, -7.2563F, 25.9912F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.1F, AnimationHelper.createRotationalVector(-32.3327F, -17.8664F, 5.3122F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(-32.3327F, -17.8664F, 5.3122F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.5F, AnimationHelper.createRotationalVector(-20.853F, -10.8877F, 19.7803F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.65F, AnimationHelper.createRotationalVector(3.8789F, -10.2164F, -5.6478F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.85F, AnimationHelper.createRotationalVector(2.4991F, -10.6342F, 1.9664F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(2.0278F, -10.733F, 4.5085F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hull", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(7.2362F, 1.7702F, -8.2665F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.8F, AnimationHelper.createRotationalVector(28.4327F, 28.2176F, 54.0908F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.15F, AnimationHelper.createRotationalVector(-20.7742F, -18.1453F, 19.59F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.25F, AnimationHelper.createRotationalVector(-21.9521F, -18.2166F, 19.6043F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.55F, AnimationHelper.createRotationalVector(-15.7898F, -17.5355F, 19.3628F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(-4.9811F, -0.4352F, 7.5189F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(-15.047F, -1.0871F, 12.4767F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.85F, AnimationHelper.createRotationalVector(34.3857F, -6.7853F, 20.7173F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.25F, AnimationHelper.createRotationalVector(41.8857F, -6.7853F, 20.7173F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.0F, AnimationHelper.createRotationalVector(39.3857F, -6.7853F, 20.7173F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.3F, AnimationHelper.createRotationalVector(23.86F, -4.56F, 16.1F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(3.8F, AnimationHelper.createTranslationalVector(0.0F, 0.1736F, -0.9848F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createTranslationalVector(0.4966F, -0.9829F, -0.193F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createTranslationalVector(0.5107F, -0.9928F, 0.06F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.8F, AnimationHelper.createRotationalVector(-69.3012F, -23.4908F, -16.702F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.15F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.3F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.65F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.65F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.85F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.35F, AnimationHelper.createRotationalVector(-60.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.0F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("claw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(-33.6404F, 37.2028F, 8.1506F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(-33.6404F, 37.2028F, 8.1506F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(-33.6404F, 37.2028F, 8.1506F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("claw", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(3.5F, AnimationHelper.createTranslationalVector(0.4673F, -1.3712F, -0.605F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createTranslationalVector(0.4673F, -1.3712F, -0.605F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createTranslationalVector(0.4673F, -1.3712F, -0.605F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(23.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(23.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(23.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger1tip", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(57.679F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(57.679F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(57.679F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(17.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(17.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(17.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger2tip", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(46.282F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(46.282F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(46.282F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger3tip", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(47.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(47.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(47.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("knife3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(-5.0F, -2.5F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createRotationalVector(-5.0F, -2.5F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(-5.0F, -2.5F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("flame", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(7.0F, AnimationHelper.createTranslationalVector(0.0F, 12.0F, -13.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.5F, AnimationHelper.createTranslationalVector(0.0F, 17.75F, -13.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("flame", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(3.5F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(7.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.799F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.8F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.2F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chain1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(7.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.6F, AnimationHelper.createRotationalVector(8.1249F, -7.9813F, 26.4032F), Transformation.Interpolations.LINEAR),
			new Keyframe(8.8F, AnimationHelper.createRotationalVector(12.6387F, -25.7905F, 43.6296F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.0F, AnimationHelper.createRotationalVector(-3.5979F, -34.7996F, -17.653F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.25F, AnimationHelper.createRotationalVector(-96.5396F, -78.6126F, 83.2974F), Transformation.Interpolations.LINEAR),
			new Keyframe(9.5F, AnimationHelper.createRotationalVector(-31.4764F, -79.8585F, 41.3071F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.0F, AnimationHelper.createRotationalVector(-61.4472F, -77.6103F, 49.0875F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.1F, AnimationHelper.createRotationalVector(-61.4472F, -77.6103F, 49.0875F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.5F, AnimationHelper.createRotationalVector(6.4748F, -82.3556F, -2.4011F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.65F, AnimationHelper.createRotationalVector(6.5831F, -70.01F, -24.8675F), Transformation.Interpolations.LINEAR),
			new Keyframe(10.9F, AnimationHelper.createRotationalVector(21.5831F, -70.01F, -24.8675F), Transformation.Interpolations.LINEAR),
			new Keyframe(11.0F, AnimationHelper.createRotationalVector(-4.5556F, -71.3182F, 5.4048F), Transformation.Interpolations.LINEAR)
		))
		.build();

	public static final Animation summonLantern = Animation.Builder.create(4.0F)
		.addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.9F, AnimationHelper.createRotationalVector(0.0F, 10.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.55F, AnimationHelper.createRotationalVector(0.0F, 10.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.8F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createTranslationalVector(0.0F, -0.8F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hips", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, -10.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(0.0F, -10.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.85F, AnimationHelper.createRotationalVector(0.0F, 15.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.55F, AnimationHelper.createRotationalVector(0.0F, 15.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-1.8577F, -17.2808F, -2.5417F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(-1.8577F, -17.2808F, -2.5417F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.85F, AnimationHelper.createRotationalVector(-18.0915F, -23.4954F, -5.4331F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.55F, AnimationHelper.createRotationalVector(-18.0915F, -23.4954F, -5.4331F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftMid", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(52.4982F, 5.0263F, 2.4467F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(58.9097F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(45.1597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(45.1597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.9F, AnimationHelper.createRotationalVector(45.1597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.55F, AnimationHelper.createRotationalVector(45.1597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.9F, AnimationHelper.createRotationalVector(56.5221F, 3.1449F, 3.8876F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(52.4982F, 5.0263F, 2.4467F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftBottom", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-54.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(-64.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.9F, AnimationHelper.createRotationalVector(-54.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.55F, AnimationHelper.createRotationalVector(-54.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.9F, AnimationHelper.createRotationalVector(-64.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(-54.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hoofLeft", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.9F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.55F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.9F, AnimationHelper.createRotationalVector(25.92F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.0212F, 15.9483F, 3.6433F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(-17.0212F, 15.9483F, 3.6433F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.9F, AnimationHelper.createRotationalVector(-14.2224F, 11.1045F, 4.9194F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.55F, AnimationHelper.createRotationalVector(-14.2224F, 11.1045F, 4.9194F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(-17.0212F, 15.9483F, 3.6433F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightMid", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(52.6597F, -1.0544F, -5.4887F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-54.1649F, 1.3726F, -0.9571F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.9387F, -7.3584F, 0.0429F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(7.5518F, -12.3157F, -0.6188F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(7.6315F, -14.7938F, -0.9585F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.9F, AnimationHelper.createRotationalVector(7.6493F, 10.6431F, 1.7058F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.55F, AnimationHelper.createRotationalVector(7.6493F, 10.6431F, 1.7058F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(9.9387F, -7.3584F, 0.0429F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineTop", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.65F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.95F, AnimationHelper.createRotationalVector(27.2642F, -0.0044F, -2.1618F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(27.2642F, -0.0044F, -2.1618F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.75F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.3307F, -2.0621F, -1.9736F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-1.6408F, -19.5056F, 3.221F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-1.6681F, -22.0045F, 3.2982F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(-1.6681F, -22.0045F, 3.2982F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-0.2888F, 10.8328F, -2.4753F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.65F, AnimationHelper.createRotationalVector(-0.1633F, 3.9056F, 0.4144F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.95F, AnimationHelper.createRotationalVector(-7.2525F, 7.501F, 20.6205F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(-6.919F, 7.8095F, 23.1238F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.75F, AnimationHelper.createRotationalVector(0.3361F, 10.4377F, -1.9008F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("jaw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(1.8266F, 1.6188F, 5.4202F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(11.0464F, 0.181F, 2.4387F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("jaw", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0565F, 1.9829F, 0.2549F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createTranslationalVector(0.0976F, 2.3531F, 0.3891F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createTranslationalVector(-0.0545F, 1.9888F, -0.0409F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.0F, AnimationHelper.createTranslationalVector(0.0565F, 1.9829F, 0.2549F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftArm", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-14.36F, 20.6424F, -30.3657F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(4.099F, 8.9549F, -64.5955F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(3.2978F, 9.2777F, -69.6489F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.7F, AnimationHelper.createRotationalVector(-26.2417F, 7.9551F, -66.912F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.8F, AnimationHelper.createRotationalVector(-40.8536F, 18.0891F, -43.4106F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-47.2907F, 14.5647F, -39.7003F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(-47.2907F, 14.5647F, -39.7003F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.75F, AnimationHelper.createRotationalVector(-27.2434F, 6.6857F, -42.219F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftArm", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9962F, -0.0872F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-52.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-80.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(-79.9907F, -2.462F, -0.4344F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.7F, AnimationHelper.createRotationalVector(-60.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.8F, AnimationHelper.createRotationalVector(-62.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(-80.0093F, 0.434F, -2.4621F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(-80.0093F, 0.434F, -2.4621F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.75F, AnimationHelper.createRotationalVector(-60.01F, 0.43F, -2.46F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hand", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-15.6263F, 22.9193F, -35.6867F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.7F, AnimationHelper.createRotationalVector(-16.8502F, -3.6311F, -62.5178F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.8F, AnimationHelper.createRotationalVector(-18.6293F, 10.8224F, -34.3553F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(-24.6385F, 41.1819F, -47.5377F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.75F, AnimationHelper.createRotationalVector(-18.218F, 43.9278F, -20.5584F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hand", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(1.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-15.6249F, 7.9813F, 13.9032F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.3F, AnimationHelper.createRotationalVector(-16.5037F, -5.9032F, -31.6431F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(-16.9384F, -4.4638F, -26.835F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(-17.4844F, -0.7515F, -14.8844F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.95F, AnimationHelper.createRotationalVector(-17.4844F, 0.7515F, -10.1156F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-17.4375F, 1.5018F, -7.7303F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(-17.3593F, -2.2494F, -19.6566F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.7F, AnimationHelper.createRotationalVector(-18.1429F, 15.2099F, 30.0306F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(1.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFingerTip1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 60.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 30.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 27.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 45.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 47.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 40.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 80.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 15.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -35.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.85F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -17.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -15.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -27.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.7F, AnimationHelper.createRotationalVector(-4.2764F, 5.8539F, 28.3899F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFingerTip2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 75.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 30.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 47.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 50.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 42.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 20.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(15.1291F, 1.5065F, -32.6291F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(14.8981F, -3.06F, -15.7294F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(14.7554F, -3.6999F, -13.3084F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(15.1624F, -1.1125F, -22.9773F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.7F, AnimationHelper.createRotationalVector(9.5744F, 6.7089F, 32.3286F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger3", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(1.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.2F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFingerTip3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 40.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 52.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 55.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 45.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("thumb", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-60.2444F, -31.8956F, 79.1775F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.3F, AnimationHelper.createRotationalVector(-56.0171F, -33.8662F, 75.9631F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-54.2045F, -17.4308F, 84.1974F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-53.0345F, -17.9608F, 80.5287F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(-44.9019F, -5.8049F, 89.529F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.7F, AnimationHelper.createRotationalVector(-17.776F, -1.0873F, 55.7603F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("thumb", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.5942F, 0.9772F, 0.0667F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.5942F, 0.9772F, 0.0667F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.7F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("thumbTip", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -45.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -72.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -40.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -35.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -52.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-4.9811F, -0.4352F, 7.5189F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(-15.047F, -1.0871F, 12.4767F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.85F, AnimationHelper.createRotationalVector(34.3857F, -6.7853F, 20.7173F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(41.8857F, -6.7853F, 20.7173F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(39.3857F, -6.7853F, 20.7173F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.3F, AnimationHelper.createRotationalVector(23.86F, -4.56F, 16.1F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-4.9811F, -0.4352F, 7.5189F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.4966F, -0.9829F, -0.193F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.85F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.35F, AnimationHelper.createRotationalVector(-60.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("lantern", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-7.9691F, 78.8825F, 94.5937F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("lantern", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-7.75F, -7.7F, -2.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("lantern", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.649F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.8F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chainStart", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.7F, AnimationHelper.createRotationalVector(1.3433F, 3.0955F, 34.7562F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.9F, AnimationHelper.createRotationalVector(-18.5366F, -4.8207F, 47.8619F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.1F, AnimationHelper.createRotationalVector(-5.1245F, -29.154F, -2.6935F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.6F, AnimationHelper.createRotationalVector(-19.6211F, -7.2563F, 25.9912F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.1F, AnimationHelper.createRotationalVector(-28.3211F, -11.1215F, 19.1624F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(-20.853F, -10.8877F, 19.7803F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.65F, AnimationHelper.createRotationalVector(3.8789F, -10.2164F, -5.6478F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.85F, AnimationHelper.createRotationalVector(2.4991F, -10.6342F, 1.9664F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("flame", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(4.1395F, 12.0F, -11.9951F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(4.1395F, 18.0F, -11.9951F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("flame", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.799F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.8F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chain1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.6F, AnimationHelper.createRotationalVector(8.1249F, -7.9813F, 26.4032F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.8F, AnimationHelper.createRotationalVector(12.6387F, -25.7905F, 43.6296F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-3.5979F, -34.7996F, -17.653F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(-96.5396F, -78.6126F, 83.2974F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(-31.4764F, -79.8585F, 41.3071F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(-61.4472F, -77.6103F, 49.0875F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(6.4748F, -82.3556F, -2.4011F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.65F, AnimationHelper.createRotationalVector(6.5831F, -70.01F, -24.8675F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.9F, AnimationHelper.createRotationalVector(21.5831F, -70.01F, -24.8675F), Transformation.Interpolations.LINEAR)
		))
		.build();

	public static final Animation idle = Animation.Builder.create(2.0F).looping()
		.addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineBottomEnd", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hips", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hips", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftMid", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftBottom", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hoofLeft", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightMid", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.2533F, 5.3516F, -1.5833F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(12.7533F, 5.3516F, -1.5833F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(10.2533F, 5.3516F, -1.5833F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineTop", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(39.9011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-34.344F, -6.5042F, 8.5351F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(-36.844F, -6.5042F, 8.5351F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-34.344F, -6.5042F, 8.5351F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("jaw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("jaw", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 2.0274F, -0.2156F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("torso", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0436F, -0.5101F, 0.8282F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("torso", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftArm", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(8.7685F, 16.9416F, -51.2783F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(9.5111F, 16.5444F, -48.7007F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(8.7685F, 16.9416F, -51.2783F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftArm", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-0.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-67.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(-65.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-67.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hand", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-16.8502F, -3.6311F, -62.5178F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hand", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-18.1429F, 15.2099F, 30.0306F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFingerTip1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 80.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-4.2764F, 5.8539F, 28.3899F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFingerTip2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.5744F, 6.7089F, 32.3286F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger3", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.2F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFingerTip3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("thumb", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.776F, -1.0873F, 55.7603F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("thumb", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("thumbTip", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -52.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("lantern", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-7.9691F, 78.8825F, 94.5937F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("lantern", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-7.75F, -7.7F, -2.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("lantern", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("handle", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, 2.5F, 5.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chainStart", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(2.0278F, -10.733F, 4.5085F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(3.5282F, -10.6633F, 4.5129F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(2.0278F, -10.733F, 4.5085F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(7.4929F, -0.3262F, 9.9786F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.5107F, -0.9928F, 0.06F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("claw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-33.6404F, 37.2028F, 8.1506F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("claw", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.4673F, -1.3712F, -0.605F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(23.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger1tip", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(57.679F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger2tip", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(46.282F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger3tip", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(47.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("knife3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, -2.5F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("flame", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(6.0F, 17.0F, -7.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("flame", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chain1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-4.5556F, -71.3182F, 5.4048F), Transformation.Interpolations.LINEAR)
		))
		.build();

	public static final Animation lanternSideSwing = Animation.Builder.create(3.35F)
		.addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(0.1205F, -30.4286F, 3.4956F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(0.1205F, -30.4286F, 3.4956F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(-1.0254F, 24.5514F, 0.8628F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(-1.0254F, 24.5514F, 0.8628F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.25F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineBottomEnd", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hips", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(0.0F, -2.5F, 2.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -2.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -2.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hips", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(16.0543F, -7.6833F, -7.5854F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(16.0543F, -7.6833F, -7.5854F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(-36.7593F, -12.1853F, -1.039F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(-36.7593F, -12.1853F, -1.039F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(-1.335F, 0.2577F, 2.4548F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createTranslationalVector(-1.335F, 0.2577F, 2.4548F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.25F, AnimationHelper.createTranslationalVector(-1.335F, 0.2577F, 2.4548F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftMid", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(27.4829F, 3.7473F, 1.2718F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(27.4829F, 3.7473F, 1.2718F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.6F, AnimationHelper.createRotationalVector(77.4829F, 3.7473F, 1.2718F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(54.9829F, 3.7473F, 1.2718F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(54.9829F, 3.7473F, 1.2718F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftBottom", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-64.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(-64.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.6F, AnimationHelper.createRotationalVector(-84.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(-49.1571F, 0.5186F, 2.5922F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(-49.1571F, 0.5186F, 2.5922F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hoofLeft", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.6F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(-6.5955F, 11.8703F, 3.8141F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(-22.9627F, 9.0581F, -3.2735F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(-22.9627F, 9.0581F, -3.2735F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(16.6193F, -2.6711F, 0.9954F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(16.6193F, -2.6711F, 0.9954F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.45F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.25F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightMid", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(65.9927F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(49.9245F, 0.0031F, 1.2287F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(49.9245F, 0.0031F, 1.2287F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(39.9245F, 0.0031F, 1.2287F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(39.9245F, 0.0031F, 1.2287F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(-69.2204F, -1.7563F, -1.6117F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(-51.7328F, -1.487F, -1.4263F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(-51.7328F, -1.487F, -1.4263F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(-79.2328F, -1.487F, -1.4263F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(-79.2328F, -1.487F, -1.4263F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.2533F, 5.3516F, -1.5833F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(10.9957F, -21.695F, -6.6582F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(11.1992F, -24.1483F, -7.1806F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(11.2773F, 25.0073F, 2.2685F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.95F, AnimationHelper.createRotationalVector(14.0208F, 27.458F, 2.8193F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.3F, AnimationHelper.createRotationalVector(14.0208F, 27.458F, 2.8193F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.7F, AnimationHelper.createRotationalVector(10.2533F, 5.3516F, -1.5833F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.9F, AnimationHelper.createRotationalVector(10.2213F, 2.8914F, -2.0288F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.35F, AnimationHelper.createRotationalVector(10.2533F, 5.3516F, -1.5833F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineTop", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(37.4818F, 0.3569F, 0.2498F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-34.344F, -6.5042F, 8.5351F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-36.6733F, 20.1963F, -10.3082F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(-36.6733F, 20.1963F, -10.3082F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(-32.7828F, 1.7357F, -7.8572F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(-32.9648F, 5.9358F, -10.5767F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.45F, AnimationHelper.createRotationalVector(-44.1557F, -31.5632F, 24.3623F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.35F, AnimationHelper.createRotationalVector(-34.344F, -6.5042F, 8.5351F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("jaw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.95F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("jaw", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 2.0274F, -0.2156F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 3.28F, -0.22F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.1F, AnimationHelper.createTranslationalVector(0.0F, 3.28F, -0.22F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2F, AnimationHelper.createTranslationalVector(0.0F, 2.28F, -0.22F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.95F, AnimationHelper.createTranslationalVector(0.0F, 2.28F, -0.22F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createTranslationalVector(0.0F, 2.0274F, -0.2156F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("torso", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0436F, -0.5101F, 0.8282F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("torso", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftArm", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(8.7685F, 16.9416F, -51.2783F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.3F, AnimationHelper.createRotationalVector(26.6316F, 19.18F, -50.1071F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(29.1316F, 19.18F, -50.1071F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(29.1316F, 19.18F, -50.1071F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(-49.645F, 21.1127F, -67.653F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(-54.645F, 21.1127F, -67.653F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(8.7685F, 16.9416F, -51.2783F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.9F, AnimationHelper.createRotationalVector(11.2685F, 16.9416F, -51.2783F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.35F, AnimationHelper.createRotationalVector(8.7685F, 16.9416F, -51.2783F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftArm", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-0.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-67.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.3F, AnimationHelper.createRotationalVector(-37.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(-72.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(-75.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(-67.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.95F, AnimationHelper.createRotationalVector(-65.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.35F, AnimationHelper.createRotationalVector(-67.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hand", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-16.8502F, -3.6311F, -62.5178F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(-19.8239F, -30.7334F, -53.1852F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-17.1232F, 10.7215F, -66.897F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-17.9607F, 20.259F, -70.0211F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(-30.0145F, 36.9514F, -83.1384F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.95F, AnimationHelper.createRotationalVector(-21.6251F, 11.2872F, -59.899F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.4F, AnimationHelper.createRotationalVector(-25.2908F, 6.6846F, -55.7835F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.35F, AnimationHelper.createRotationalVector(-16.8502F, -3.6311F, -62.5178F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hand", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-18.1429F, 15.2099F, 30.0306F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFingerTip1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 80.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-4.2764F, 5.8539F, 28.3899F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFingerTip2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.5744F, 6.7089F, 32.3286F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger3", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.2F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFingerTip3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("thumb", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.776F, -1.0873F, 55.7603F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("thumb", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("thumbTip", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -52.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("lantern", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-7.9691F, 78.8825F, 94.5937F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("lantern", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-7.75F, -7.7F, -2.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("lantern", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("handle", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, 2.5F, 5.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chainStart", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(2.0278F, -10.733F, 4.5085F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.3F, AnimationHelper.createRotationalVector(7.4316F, -7.7148F, -28.7453F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(7.1474F, -7.505F, -28.2793F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(1.0737F, -10.8684F, 9.5969F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(1.0737F, -10.8684F, 9.5969F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(24.5445F, 8.3021F, -31.3197F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.95F, AnimationHelper.createRotationalVector(14.5573F, 11.8194F, -32.8573F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.4F, AnimationHelper.createRotationalVector(9.5573F, 11.8194F, -32.8573F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(9.5573F, 11.8194F, -32.8573F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.95F, AnimationHelper.createRotationalVector(15.0621F, 1.7145F, 11.3779F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.35F, AnimationHelper.createRotationalVector(2.0278F, -10.733F, 4.5085F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hull", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.7F, AnimationHelper.createScalingVector(0.9F, 1.1F, 1.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-30.8393F, -3.4553F, 34.7989F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(-33.3393F, -3.4553F, 34.7989F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(24.1607F, -3.4553F, 34.7989F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.4F, AnimationHelper.createRotationalVector(39.16F, -3.46F, 29.8F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.5107F, -0.9928F, 0.06F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(-25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.4F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("claw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-33.6404F, 37.2028F, 8.1506F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("claw", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.4673F, -1.3712F, -0.605F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(23.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger1tip", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(57.679F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger2tip", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(46.282F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger3tip", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(47.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("knife3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, -2.5F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("flame", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(6.0F, 17.0F, -7.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("flame", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chain1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-4.5556F, -71.3182F, 5.4048F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.2F, AnimationHelper.createRotationalVector(-47.0556F, -71.3182F, 5.4048F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(-47.0556F, -71.3182F, 5.4048F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-4.5556F, -71.3182F, 5.4048F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(10.4444F, -71.3182F, 5.4048F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(12.9444F, -71.3182F, 5.4048F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(12.9444F, -71.3182F, 5.4048F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(48.5359F, -61.8713F, -33.0297F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(23.5359F, -61.8713F, -33.0297F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(23.5359F, -61.8713F, -33.0297F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(23.5359F, -61.8713F, -33.0297F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(4.3875F, -75.9206F, 15.6592F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.35F, AnimationHelper.createRotationalVector(-4.5556F, -71.3182F, 5.4048F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chain2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(24.5623F, 4.2453F, -11.7678F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.05F, AnimationHelper.createRotationalVector(-17.9377F, 4.2453F, -11.7678F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.6F, AnimationHelper.createRotationalVector(-17.9377F, 4.2453F, -11.7678F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chain2", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.35F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.45F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.6F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chain3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.15F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chain3", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.45F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.5F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.6F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chain4", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(14.1F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3F, AnimationHelper.createRotationalVector(23.53F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(23.53F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.55F, AnimationHelper.createRotationalVector(40.1851F, -51.9555F, -29.5418F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(23.3503F, -2.987F, 6.8826F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.2F, AnimationHelper.createRotationalVector(-16.47F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.4F, AnimationHelper.createRotationalVector(-18.97F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chain4", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.55F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.4F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.build();

	public static final Animation lanternSlam = Animation.Builder.create(6.0F)
		.addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.1F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createTranslationalVector(0.0F, -1.8F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.15F, AnimationHelper.createTranslationalVector(0.0F, -1.8F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.45F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.1F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(12.0739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(12.0739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.45F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(4.6084F, 7.4278F, -4.7955F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(4.6084F, 7.4278F, -4.7955F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.9F, AnimationHelper.createRotationalVector(29.6084F, 7.4278F, -4.7955F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.9F, AnimationHelper.createRotationalVector(29.6084F, 7.4278F, -4.7955F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.9F, AnimationHelper.createTranslationalVector(0.0F, -0.4F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.9F, AnimationHelper.createTranslationalVector(0.0F, -0.4F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineBottomEnd", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hips", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.9F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hips", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.999F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-37.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(-37.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.45F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(-35.0515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.9F, AnimationHelper.createRotationalVector(-27.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.9F, AnimationHelper.createRotationalVector(-27.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.45F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.9F, AnimationHelper.createTranslationalVector(-1.147F, -0.4633F, 1.3739F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.9F, AnimationHelper.createTranslationalVector(-1.147F, -0.4633F, 1.3739F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftMid", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(67.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(67.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.45F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(76.0468F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.9F, AnimationHelper.createRotationalVector(57.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.9F, AnimationHelper.createRotationalVector(57.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legLeftBottom", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-61.6649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(-61.6649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.45F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(-68.5197F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.9F, AnimationHelper.createRotationalVector(-64.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.9F, AnimationHelper.createRotationalVector(-64.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hoofLeft", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.45F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-25.6157F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(-25.6157F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.45F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.9F, AnimationHelper.createRotationalVector(-38.9588F, 10.5985F, 4.5638F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.9F, AnimationHelper.createRotationalVector(-38.9588F, 10.5985F, 4.5638F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.45F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightMid", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(57.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(57.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.45F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.9F, AnimationHelper.createRotationalVector(57.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.9F, AnimationHelper.createRotationalVector(57.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-74.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(-74.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.45F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.9F, AnimationHelper.createRotationalVector(-69.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.9F, AnimationHelper.createRotationalVector(-69.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.45F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.45F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.9F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.9F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.45F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.2533F, 5.3516F, -1.5833F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(33.3334F, -12.34F, -10.9664F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(38.3334F, -12.34F, -10.9664F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(35.2084F, -12.34F, -10.9664F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.45F, AnimationHelper.createRotationalVector(-12.4513F, 12.7414F, -2.8815F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-16.3728F, 17.599F, -4.1091F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(-16.3728F, 17.599F, -4.1091F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.9F, AnimationHelper.createRotationalVector(16.0433F, -18.4734F, 6.3145F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.55F, AnimationHelper.createRotationalVector(21.0433F, -18.4734F, 6.3145F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.9F, AnimationHelper.createRotationalVector(21.0433F, -18.4734F, 6.3145F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(10.2533F, 5.3516F, -1.5833F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.65F, AnimationHelper.createRotationalVector(10.7179F, 17.6445F, 0.7337F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.8F, AnimationHelper.createRotationalVector(10.8132F, 18.7349F, 0.9647F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.9F, AnimationHelper.createRotationalVector(10.8711F, -19.2593F, -6.1665F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createRotationalVector(10.2533F, 5.3516F, -1.5833F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineTop", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.8F, AnimationHelper.createRotationalVector(27.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.8F, AnimationHelper.createRotationalVector(14.9011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-34.344F, -6.5042F, 8.5351F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(-29.4715F, 7.9698F, -1.3284F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.9F, AnimationHelper.createRotationalVector(-29.47F, 7.97F, -1.33F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(-4.6283F, -16.9537F, 0.6433F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.8F, AnimationHelper.createRotationalVector(-26.4863F, -13.7139F, 7.6586F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createRotationalVector(-34.344F, -6.5042F, 8.5351F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.9F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("jaw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("jaw", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 2.0274F, -0.2156F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("torso", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0436F, -0.5101F, 0.8282F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createRotationalVector(0.0436F, -0.5101F, 0.8282F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("torso", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.999F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftArm", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(8.7685F, 16.9416F, -51.2783F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-21.3377F, 0.9083F, -15.1628F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-21.3377F, 0.9083F, -15.1628F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(-26.3377F, 0.9083F, -15.1628F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.4F, AnimationHelper.createRotationalVector(-149.0975F, -25.7013F, 20.1036F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(-151.5975F, -25.7013F, 20.1036F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(-79.3689F, 3.1254F, 6.6953F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.9F, AnimationHelper.createRotationalVector(-79.37F, 3.13F, 6.7F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(-31.9417F, -2.1649F, -1.7865F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.65F, AnimationHelper.createRotationalVector(-41.1961F, 10.6219F, -59.5705F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.8F, AnimationHelper.createRotationalVector(-54.4669F, 17.5971F, -63.919F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.9F, AnimationHelper.createRotationalVector(22.1534F, -0.766F, -49.7546F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.1F, AnimationHelper.createRotationalVector(32.1534F, -0.766F, -49.7546F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createRotationalVector(19.6105F, -16.1734F, -3.7325F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftArm", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-0.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.9F, AnimationHelper.createTranslationalVector(-0.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createTranslationalVector(-0.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-67.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-52.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(-61.25F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.55F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(-65.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.65F, AnimationHelper.createRotationalVector(-72.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.8F, AnimationHelper.createRotationalVector(-85.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.9F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.1F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hand", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-16.8502F, -3.6311F, -62.5178F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-18.5419F, 17.099F, -71.6623F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(-10.1382F, 22.3948F, -62.2644F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(-10.1382F, 22.3948F, -62.2644F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.85F, AnimationHelper.createRotationalVector(-26.5291F, 8.7483F, -23.0854F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(18.4709F, 8.7483F, -23.0854F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(9.1323F, 13.2162F, -45.5604F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.1F, AnimationHelper.createRotationalVector(1.01F, 7.95F, -50.86F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.35F, AnimationHelper.createRotationalVector(1.6249F, 5.9453F, 1.1495F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hand", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-18.1429F, 15.2099F, 30.0306F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.9F, AnimationHelper.createRotationalVector(-18.14F, 15.21F, 30.03F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(-14.9F, 7.3203F, 8.5207F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFingerTip1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 80.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.9F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 80.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 12.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-4.2764F, 5.8539F, 28.3899F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.9F, AnimationHelper.createRotationalVector(-4.28F, 5.85F, 28.39F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(-6.0205F, 4.0361F, 8.3965F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFingerTip2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.9F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 22.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.5744F, 6.7089F, 32.3286F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.9F, AnimationHelper.createRotationalVector(9.57F, 6.71F, 32.33F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(6.7086F, 9.571F, 12.3299F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFinger3", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.2F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("leftFingerTip3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.9F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 15.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("thumb", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.776F, -1.0873F, 55.7603F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.9F, AnimationHelper.createRotationalVector(-17.78F, -1.09F, 55.76F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(-17.7071F, 1.9646F, 65.2835F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createRotationalVector(-82.5663F, -67.4582F, 90.1369F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("thumb", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("thumbTip", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -52.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("lantern", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-7.9691F, 78.8825F, 94.5937F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("lantern", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-7.75F, -7.7F, -2.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("lantern", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("handle", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, 2.5F, 5.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-5.0F, 2.5F, 5.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(7.5F, 2.5F, 5.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(7.5F, 2.5F, 5.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.85F, AnimationHelper.createRotationalVector(32.5F, 2.5F, 5.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(44.7356F, 6.0285F, 1.447F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.9F, AnimationHelper.createRotationalVector(44.7356F, 6.0285F, 1.447F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.1F, AnimationHelper.createRotationalVector(64.7356F, 6.0285F, 1.447F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("handle", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.9F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.1F, AnimationHelper.createTranslationalVector(-57.9746F, -31.9406F, 15.5801F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("handle", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.9F, AnimationHelper.createScalingVector(1.0F, 1.1F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(5.1F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chainStart", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(2.0278F, -10.733F, 4.5085F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(2.4991F, -10.6342F, 1.9664F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(2.4991F, -10.6342F, 1.9664F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(-1.8099F, -10.7714F, 24.8697F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.55F, AnimationHelper.createRotationalVector(2.9654F, -10.515F, -0.5739F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(2.9654F, -10.515F, -0.5739F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(2.9654F, -10.515F, -0.5739F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.8F, AnimationHelper.createRotationalVector(1.0737F, -10.8684F, 9.5969F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.9F, AnimationHelper.createRotationalVector(5.6051F, -9.3875F, -15.7615F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hull", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.849F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.85F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.95F, AnimationHelper.createScalingVector(0.8F, 1.0F, 1.9F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.05F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.099F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.1F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(40.0F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(47.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(40.0F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.45F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.95F, AnimationHelper.createRotationalVector(50.0F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.9F, AnimationHelper.createRotationalVector(50.0F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.9F, AnimationHelper.createRotationalVector(7.4366F, -0.9762F, 14.9366F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.5107F, -0.9928F, 0.06F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createTranslationalVector(0.5107F, -0.9928F, 0.06F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createTranslationalVector(0.5107F, -0.9928F, 0.06F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-75.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-80.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(-75.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.45F, AnimationHelper.createRotationalVector(-65.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(-70.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.95F, AnimationHelper.createRotationalVector(-55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.9F, AnimationHelper.createRotationalVector(-55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(6.0F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("claw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-33.6404F, 37.2028F, 8.1506F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("claw", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.4673F, -1.3712F, -0.605F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(23.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger1tip", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(57.679F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger2tip", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(46.282F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("finger3tip", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(47.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("knife3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, -2.5F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("flame", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(6.0F, 17.0F, -7.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("flame", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chain1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-4.5556F, -71.3182F, 5.4048F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(7.6597F, -71.0715F, -10.1304F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(7.6597F, -71.0715F, -10.1304F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(210.8606F, -78.4812F, -171.5236F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(163.3606F, -78.4812F, -171.5236F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.6F, AnimationHelper.createRotationalVector(143.3477F, -76.203F, -151.0266F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(143.3477F, -76.203F, -151.0266F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.85F, AnimationHelper.createRotationalVector(128.3477F, -76.203F, -151.0266F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(145.8477F, -76.203F, -151.0266F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.4F, AnimationHelper.createRotationalVector(165.8477F, -76.203F, -151.0266F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.55F, AnimationHelper.createRotationalVector(126.5263F, -58.8168F, -98.7059F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(135.6892F, -64.4894F, -109.0981F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.7F, AnimationHelper.createRotationalVector(155.6892F, -64.4894F, -109.0981F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.9F, AnimationHelper.createRotationalVector(78.1892F, -64.4894F, -109.0981F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chain2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.4F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.95F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.6F, AnimationHelper.createRotationalVector(-7.4718F, 0.6518F, 4.9574F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(-7.4718F, 0.6518F, 4.9574F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.85F, AnimationHelper.createRotationalVector(-17.4718F, 0.6518F, 4.9574F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(2.5282F, 0.6518F, 4.9574F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.1F, AnimationHelper.createRotationalVector(2.5282F, 0.6518F, 4.9574F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.3F, AnimationHelper.createRotationalVector(-22.4718F, 0.6518F, 4.9574F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.7F, AnimationHelper.createRotationalVector(-12.4718F, 0.6518F, 4.9574F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(-12.3703F, 1.7279F, 9.8414F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.8F, AnimationHelper.createRotationalVector(12.6297F, 1.7279F, 9.8414F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.9F, AnimationHelper.createRotationalVector(-29.8703F, 1.7279F, 9.8414F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chain2", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(1.1F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chain3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.4F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.95F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.6F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.85F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.1F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.3F, AnimationHelper.createRotationalVector(-38.1658F, 9.8874F, -7.6861F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.7F, AnimationHelper.createRotationalVector(-5.6658F, 9.8874F, -7.6861F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(-4.6008F, 12.8249F, -2.836F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.7F, AnimationHelper.createRotationalVector(30.3992F, 12.8249F, -2.836F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.9F, AnimationHelper.createRotationalVector(-17.1008F, 12.8249F, -2.836F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chain3", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(1.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chain4", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.55F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.95F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.6F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.85F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.1F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.3F, AnimationHelper.createRotationalVector(-38.8189F, 13.8019F, -10.8653F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.7F, AnimationHelper.createRotationalVector(-53.8189F, 13.8019F, -10.8653F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.1F, AnimationHelper.createRotationalVector(-58.722F, 13.36F, -2.9771F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(-53.6493F, 13.0285F, 2.9391F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.8F, AnimationHelper.createRotationalVector(-1.1493F, 13.0285F, 2.9391F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.9F, AnimationHelper.createRotationalVector(-31.1493F, 13.0285F, 2.9391F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chain4", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chain5", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(1.45F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.9F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.1F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(-14.9375F, -1.5018F, -4.7697F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.85F, AnimationHelper.createRotationalVector(-19.9375F, -1.5018F, -4.7697F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(-32.4375F, -1.5018F, -4.7697F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.1F, AnimationHelper.createRotationalVector(-32.4375F, -1.5018F, -4.7697F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.3F, AnimationHelper.createRotationalVector(-27.4375F, -1.5018F, -4.7697F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.4F, AnimationHelper.createRotationalVector(-32.4375F, -1.5018F, -4.7697F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.6F, AnimationHelper.createRotationalVector(-7.4375F, -1.5018F, -4.7697F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.75F, AnimationHelper.createRotationalVector(-43.831F, -1.5215F, -5.2382F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.95F, AnimationHelper.createRotationalVector(-22.0352F, -1.5477F, -5.8629F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.1F, AnimationHelper.createRotationalVector(-17.7814F, -2.5906F, -8.2978F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(-17.7814F, -2.5906F, -8.2978F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.7F, AnimationHelper.createRotationalVector(22.2186F, -2.5906F, -8.2978F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.9F, AnimationHelper.createRotationalVector(-9.978F, -9.5276F, -11.1665F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chain5", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(1.45F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.85F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chain6", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(1.9F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.2F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.8F, AnimationHelper.createRotationalVector(-10.3453F, 14.7669F, -2.664F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.85F, AnimationHelper.createRotationalVector(-15.3453F, 14.7669F, -2.664F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.3F, AnimationHelper.createRotationalVector(-30.3453F, 14.7669F, -2.664F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.4F, AnimationHelper.createRotationalVector(-37.8453F, 14.7669F, -2.664F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.6F, AnimationHelper.createRotationalVector(-23.5668F, 31.3197F, 27.9537F), Transformation.Interpolations.LINEAR),
			new Keyframe(3.85F, AnimationHelper.createRotationalVector(-33.5271F, 14.7669F, -2.664F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.1F, AnimationHelper.createRotationalVector(12.7756F, 13.218F, -20.6333F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.4F, AnimationHelper.createRotationalVector(3.3229F, 15.1149F, -7.8265F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.7F, AnimationHelper.createRotationalVector(15.8229F, 15.1149F, -7.8265F), Transformation.Interpolations.LINEAR),
			new Keyframe(4.9F, AnimationHelper.createRotationalVector(-24.1771F, 15.1149F, -7.8265F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("chain6", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(1.85F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.35F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.build();
}