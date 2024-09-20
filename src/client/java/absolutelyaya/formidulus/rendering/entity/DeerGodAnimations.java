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
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hips", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("spineBottomEnd", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("legtLeftBottom", new Transformation(Transformation.Targets.ROTATE, 
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
		.build();
}