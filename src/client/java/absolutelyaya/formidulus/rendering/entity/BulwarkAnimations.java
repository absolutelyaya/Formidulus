package absolutelyaya.formidulus.rendering.entity;// Save this class in your mod and generate all required imports

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

/**
 * Made with Blockbench 4.11.2
 * Exported for Minecraft version 1.19 or later with Yarn mappings
 * @author Absolutelyaya
 */
public class BulwarkAnimations
{
	public static final Animation prePlace = Animation.Builder.create(0.25F)
					.addBoneAnimation("root", new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0.0F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.1F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.25F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					))
					.addBoneAnimation("root", new Transformation(Transformation.Targets.TRANSLATE,
							new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 9.0F, 2.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.1F, AnimationHelper.createTranslationalVector(0.0F, 10.0F, 2.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, 11.0F, 2.0F), Transformation.Interpolations.LINEAR)
					))
					.addBoneAnimation("root", new Transformation(Transformation.Targets.SCALE,
							new Keyframe(0.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
					))
					.build();
	
	public static final Animation place = Animation.Builder.create(0.1F)
					.addBoneAnimation("root", new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.1F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					))
					.addBoneAnimation("root", new Transformation(Transformation.Targets.TRANSLATE,
							new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 11.0F, 2.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.05F, AnimationHelper.createTranslationalVector(0.0F, 7.45F, 1.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.1F, AnimationHelper.createTranslationalVector(0.0F, -0.1F, 0.0F), Transformation.Interpolations.LINEAR)
					))
					.addBoneAnimation("root", new Transformation(Transformation.Targets.SCALE,
							new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.05F, AnimationHelper.createScalingVector(1.0F, 1.2F, 1.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.1F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
					))
					.build();
	
	public static final Animation hit = Animation.Builder.create(0.3F)
					.addBoneAnimation("root", new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0.0F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.05F, AnimationHelper.createRotationalVector(-7.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.15F, AnimationHelper.createRotationalVector(-8.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.3F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					))
					.addBoneAnimation("root", new Transformation(Transformation.Targets.TRANSLATE,
							new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.1F, 0.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.05F, AnimationHelper.createTranslationalVector(0.0F, -0.1F, 1.3F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.15F, AnimationHelper.createTranslationalVector(0.0F, -0.2F, 1.5F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.3F, AnimationHelper.createTranslationalVector(0.0F, -0.1F, 0.0F), Transformation.Interpolations.LINEAR)
					))
					.build();
	
	public static final Animation unplace = Animation.Builder.create(0.75F)
					.addBoneAnimation("root", new Transformation(Transformation.Targets.ROTATE,
							new Keyframe(0.0F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.25F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.4F, AnimationHelper.createRotationalVector(-13.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.55F, AnimationHelper.createRotationalVector(-10.83F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.75F, AnimationHelper.createRotationalVector(-3.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					))
					.addBoneAnimation("root", new Transformation(Transformation.Targets.TRANSLATE,
							new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.1F, 0.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.6F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, -0.1F, 0.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.3F, AnimationHelper.createTranslationalVector(0.0F, 3.91F, 0.22F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.4F, AnimationHelper.createTranslationalVector(0.0F, 6.0F, 2.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.55F, AnimationHelper.createTranslationalVector(0.0F, 5.0F, 2.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, -8.0F, 6.0F), Transformation.Interpolations.LINEAR)
					))
					.addBoneAnimation("root", new Transformation(Transformation.Targets.SCALE,
							new Keyframe(0.6F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.7F, AnimationHelper.createScalingVector(0.2F, 0.5F, 1.0F), Transformation.Interpolations.LINEAR),
							new Keyframe(0.75F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					))
					.build();
}