package absolutelyaya.formidulus.rendering.entity;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

/**
 * Made with Blockbench 4.11.0
 * Exported for Minecraft version 1.19 or later with Yarn mappings
 * @author Absolutelyaya
 */
public class DeerGodAnimations
{
	public static final Animation unsummonedPose = initUnsummonedPoseAnim();
	public static final Animation spawnSequence = initSpawnSequenceAnim();
	public static final Animation summonLantern = initSummonLanternAnim();
	public static final Animation idle = initIdleAnim();
	public static final Animation walk = initWalkAnim();
	public static final Animation holdLantern = initHoldLanternPose();
	public static final Animation noLantern = initNoLanternPose();
	public static final Animation showClaw = initShowClawPose();
	public static final Animation showClawWithoutExtras = initShowClawNoExtrasPose();
	public static final Animation noClaw = initNoClawPose();
	public static final Animation run = initRunAnim();
	public static final Animation prepareRunAttack = initPrepareRunAttack();
	public static final Animation runLantern = initRunLanternAnim();
	public static final Animation runLanternDrag = initRunLanternDragAnim();
	public static final Animation runClaw = initRunClawAnim();
	public static final Animation runClawDrag = initRunClawDragAnim();
	public static final Animation lanternSideSwing = initLanternSideSwingAnim();
	public static final Animation lanternSlam = initLanternSlamAnim();
	public static final Animation phaseTransition = initPhaseTransitionAnim();
	public static final Animation simpleClawAttackAnimation = initSimpleClawAttackAnim();
	public static final Animation runClawAttackAnimation = initRunClawAttackAnim();
	public static final Animation runAttackWallImpactAnimation = initRunAttackWallImpactAnim();
	public static final Animation death = initDeathAnim();
	
	static Animation initUnsummonedPoseAnim()
	{
		return Animation.Builder.create(0.0F).looping()
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
	}
	
	static Animation initSpawnSequenceAnim()
	{
		return Animation.Builder.create(18.0F)
				.addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.9F, AnimationHelper.createRotationalVector(0.0F, 10.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.55F, AnimationHelper.createRotationalVector(0.0F, 10.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(5.0F, AnimationHelper.createTranslationalVector(0.0F, -49.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(6.5F, AnimationHelper.createTranslationalVector(0.0F, -49.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.5F, AnimationHelper.createTranslationalVector(0.0F, 6.1F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.7F, AnimationHelper.createTranslationalVector(0.0F, 7.1F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.05F, AnimationHelper.createTranslationalVector(0.0F, -7.9F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(10.5F, AnimationHelper.createTranslationalVector(0.0F, -7.9F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createTranslationalVector(0.0F, -0.8F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createTranslationalVector(0.0F, -0.8F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createTranslationalVector(0.0F, -0.8F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createTranslationalVector(0.0F, -0.8F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.35F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
						new Keyframe(10.5F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(4.6758F, 2.2422F, -2.7032F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(4.6758F, 2.2422F, -2.7032F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.35F, AnimationHelper.createRotationalVector(4.6758F, 2.2422F, -2.7032F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("spineBottomEnd", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("hips", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.5F, AnimationHelper.createRotationalVector(0.0F, -10.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(0.0F, -10.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.85F, AnimationHelper.createRotationalVector(0.0F, 15.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.55F, AnimationHelper.createRotationalVector(0.0F, 15.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("hips", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(5.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.699F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.7F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.999F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(-42.8111F, -7.8418F, 1.4283F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.95F, AnimationHelper.createRotationalVector(-42.8111F, -7.8418F, 1.4283F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.05F, AnimationHelper.createRotationalVector(-52.8111F, -7.8418F, 1.4283F), Transformation.Interpolations.LINEAR),
						new Keyframe(10.5F, AnimationHelper.createRotationalVector(-52.8111F, -7.8418F, 1.4283F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.5F, AnimationHelper.createRotationalVector(-1.8577F, -17.2808F, -2.5417F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(-1.8577F, -17.2808F, -2.5417F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.85F, AnimationHelper.createRotationalVector(-18.0915F, -23.4954F, -5.4331F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.55F, AnimationHelper.createRotationalVector(-18.0915F, -23.4954F, -5.4331F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.95F, AnimationHelper.createRotationalVector(-18.6743F, -20.3348F, -3.7262F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(9.05F, AnimationHelper.createTranslationalVector(-0.8737F, -0.0923F, 1.5322F), Transformation.Interpolations.LINEAR),
						new Keyframe(10.5F, AnimationHelper.createTranslationalVector(-0.8737F, -0.0923F, 1.5322F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.95F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legLeftMid", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(57.621F, 0.7341F, 3.009F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.95F, AnimationHelper.createRotationalVector(57.621F, 0.7341F, 3.009F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.05F, AnimationHelper.createRotationalVector(85.121F, 0.7341F, 3.009F), Transformation.Interpolations.LINEAR),
						new Keyframe(10.5F, AnimationHelper.createRotationalVector(85.121F, 0.7341F, 3.009F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(52.4982F, 5.0263F, 2.4467F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(52.4982F, 5.0263F, 2.4467F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.25F, AnimationHelper.createRotationalVector(58.9097F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.5F, AnimationHelper.createRotationalVector(45.1597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(45.1597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.9F, AnimationHelper.createRotationalVector(45.1597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.55F, AnimationHelper.createRotationalVector(45.1597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.9F, AnimationHelper.createRotationalVector(49.0221F, 3.1449F, 3.8876F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.35F, AnimationHelper.createRotationalVector(49.0221F, 3.1449F, 3.8876F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legLeftBottom", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(-64.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.95F, AnimationHelper.createRotationalVector(-64.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.05F, AnimationHelper.createRotationalVector(-86.6649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(10.5F, AnimationHelper.createRotationalVector(-86.6649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(-54.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(-54.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.25F, AnimationHelper.createRotationalVector(-64.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.5F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.9F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.55F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.9F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("hoofLeft", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(10.5F, AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.9F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.55F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.9F, AnimationHelper.createRotationalVector(25.92F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.35F, AnimationHelper.createRotationalVector(25.92F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.7F, AnimationHelper.createRotationalVector(-5.6157F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.95F, AnimationHelper.createRotationalVector(19.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.05F, AnimationHelper.createRotationalVector(35.116F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
						new Keyframe(10.5F, AnimationHelper.createRotationalVector(35.116F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(-17.0212F, 15.9483F, 3.6433F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(-17.0212F, 15.9483F, 3.6433F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(-17.0212F, 15.9483F, 3.6433F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.9F, AnimationHelper.createRotationalVector(-14.2224F, 11.1045F, 4.9194F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.55F, AnimationHelper.createRotationalVector(-14.2224F, 11.1045F, 4.9194F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(12.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legRightMid", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.7F, AnimationHelper.createRotationalVector(57.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.9F, AnimationHelper.createRotationalVector(67.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.95F, AnimationHelper.createRotationalVector(57.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.05F, AnimationHelper.createRotationalVector(48.8012F, -0.122F, -5.1503F), Transformation.Interpolations.LINEAR),
						new Keyframe(10.5F, AnimationHelper.createRotationalVector(48.8012F, -0.122F, -5.1503F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(52.6597F, -1.0544F, -5.4887F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(52.6597F, -1.0544F, -5.4887F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.55F, AnimationHelper.createRotationalVector(52.6597F, -1.0544F, -5.4887F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.7F, AnimationHelper.createRotationalVector(-81.8103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.95F, AnimationHelper.createRotationalVector(-56.8103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.05F, AnimationHelper.createRotationalVector(-63.4567F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
						new Keyframe(10.5F, AnimationHelper.createRotationalVector(-63.4567F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(-54.1649F, 1.3726F, -0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(-54.1649F, 1.3726F, -0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(-54.1649F, 1.3726F, -0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.85F, AnimationHelper.createRotationalVector(-61.6649F, 1.3726F, -0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.55F, AnimationHelper.createRotationalVector(-61.6649F, 1.3726F, -0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(5.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.7F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.95F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.05F, AnimationHelper.createRotationalVector(-22.99F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(10.5F, AnimationHelper.createRotationalVector(-22.99F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.55F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(5.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.95F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.05F, AnimationHelper.createTranslationalVector(0.0F, 1.406F, 0.2706F), Transformation.Interpolations.LINEAR),
						new Keyframe(10.5F, AnimationHelper.createTranslationalVector(0.0F, 1.406F, 0.2706F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.55F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(10.1402F, 10.7145F, -3.1723F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.0F, AnimationHelper.createRotationalVector(10.1402F, 10.7145F, -3.1723F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.1F, AnimationHelper.createRotationalVector(14.6647F, 8.9413F, -6.2761F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.3F, AnimationHelper.createRotationalVector(12.1647F, 8.9413F, -6.2761F), Transformation.Interpolations.LINEAR),
						new Keyframe(10.5F, AnimationHelper.createRotationalVector(12.1647F, 8.9413F, -6.2761F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(9.9387F, -7.3584F, 0.0429F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(12.4387F, -7.3584F, 0.0429F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.4F, AnimationHelper.createRotationalVector(7.5518F, -12.3157F, -0.6188F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(7.6315F, -14.7938F, -0.9585F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.9F, AnimationHelper.createRotationalVector(7.6493F, 10.6431F, 1.7058F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.55F, AnimationHelper.createRotationalVector(7.6493F, 10.6431F, 1.7058F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.0F, AnimationHelper.createRotationalVector(10.2533F, 5.3516F, -1.5833F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("spineTop", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.1F, AnimationHelper.createRotationalVector(39.9011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.65F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.95F, AnimationHelper.createRotationalVector(27.2642F, -0.0044F, -2.1618F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(27.2642F, -0.0044F, -2.1618F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.5F, AnimationHelper.createRotationalVector(27.2642F, -0.0044F, -2.1618F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.0F, AnimationHelper.createRotationalVector(27.2642F, -0.0044F, -2.1618F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(-7.2888F, -2.4751F, 0.3165F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.15F, AnimationHelper.createRotationalVector(-7.29F, -2.48F, 2.82F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.9F, AnimationHelper.createRotationalVector(-7.29F, -2.48F, 2.82F), Transformation.Interpolations.LINEAR),
						new Keyframe(3.05F, AnimationHelper.createRotationalVector(-7.29F, 2.52F, -0.02F), Transformation.Interpolations.LINEAR),
						new Keyframe(3.65F, AnimationHelper.createRotationalVector(-7.29F, 2.52F, -0.02F), Transformation.Interpolations.LINEAR),
						new Keyframe(3.85F, AnimationHelper.createRotationalVector(-7.2888F, -2.4751F, 0.3165F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.35F, AnimationHelper.createRotationalVector(-7.2888F, -2.4751F, 0.3165F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.5F, AnimationHelper.createRotationalVector(-7.3891F, -2.1557F, 2.798F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.8F, AnimationHelper.createRotationalVector(-7.3891F, -2.1557F, 2.798F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.9F, AnimationHelper.createRotationalVector(-7.052F, -0.4352F, -2.5675F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.1F, AnimationHelper.createRotationalVector(-7.052F, -0.4352F, -2.5675F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.2F, AnimationHelper.createRotationalVector(-7.2888F, -2.4751F, 0.3165F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.3F, AnimationHelper.createRotationalVector(-7.3891F, -2.1557F, 2.798F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.4F, AnimationHelper.createRotationalVector(-6.9537F, -5.4413F, -2.1177F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.5F, AnimationHelper.createRotationalVector(-9.7888F, -2.4751F, 0.3165F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.6F, AnimationHelper.createRotationalVector(-7.5071F, 2.4786F, -0.3265F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.7F, AnimationHelper.createRotationalVector(-6.9537F, -5.4413F, -2.1177F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.8F, AnimationHelper.createRotationalVector(-9.5243F, -0.8495F, -5.0331F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.9F, AnimationHelper.createRotationalVector(-7.3891F, -2.1557F, 2.798F), Transformation.Interpolations.LINEAR),
						new Keyframe(6.0F, AnimationHelper.createRotationalVector(-7.2888F, -2.4751F, 0.3165F), Transformation.Interpolations.LINEAR),
						new Keyframe(6.1F, AnimationHelper.createRotationalVector(-7.3891F, -2.1557F, 2.798F), Transformation.Interpolations.LINEAR),
						new Keyframe(6.2F, AnimationHelper.createRotationalVector(-6.9537F, -5.4413F, -2.1177F), Transformation.Interpolations.LINEAR),
						new Keyframe(6.3F, AnimationHelper.createRotationalVector(-9.7888F, -2.4751F, 0.3165F), Transformation.Interpolations.LINEAR),
						new Keyframe(6.4F, AnimationHelper.createRotationalVector(-7.5071F, 2.4786F, -0.3265F), Transformation.Interpolations.LINEAR),
						new Keyframe(6.5F, AnimationHelper.createRotationalVector(-6.9537F, -5.4413F, -2.1177F), Transformation.Interpolations.LINEAR),
						new Keyframe(6.6F, AnimationHelper.createRotationalVector(-9.5243F, -0.8495F, -5.0331F), Transformation.Interpolations.LINEAR),
						new Keyframe(6.7F, AnimationHelper.createRotationalVector(-7.3891F, -2.1557F, 2.798F), Transformation.Interpolations.LINEAR),
						new Keyframe(6.8F, AnimationHelper.createRotationalVector(-7.5071F, 2.4786F, -0.3265F), Transformation.Interpolations.LINEAR),
						new Keyframe(6.85F, AnimationHelper.createRotationalVector(-7.2888F, -2.4751F, 0.3165F), Transformation.Interpolations.LINEAR),
						new Keyframe(6.9F, AnimationHelper.createRotationalVector(-7.3891F, -2.1557F, 2.798F), Transformation.Interpolations.LINEAR),
						new Keyframe(6.95F, AnimationHelper.createRotationalVector(-6.9537F, -5.4413F, -2.1177F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.0F, AnimationHelper.createRotationalVector(-9.7888F, -2.4751F, 0.3165F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.05F, AnimationHelper.createRotationalVector(-7.5071F, 2.4786F, -0.3265F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.1F, AnimationHelper.createRotationalVector(-6.9537F, -5.4413F, -2.1177F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.15F, AnimationHelper.createRotationalVector(-7.2888F, -2.4751F, 0.3165F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.2F, AnimationHelper.createRotationalVector(-7.3891F, -2.1557F, 2.798F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.25F, AnimationHelper.createRotationalVector(-6.9537F, -5.4413F, -2.1177F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.3F, AnimationHelper.createRotationalVector(-7.5071F, 2.4786F, -0.3265F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.35F, AnimationHelper.createRotationalVector(-7.2888F, -2.4751F, 0.3165F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.4F, AnimationHelper.createRotationalVector(-7.3891F, -2.1557F, 2.798F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.45F, AnimationHelper.createRotationalVector(-6.9537F, -5.4413F, -2.1177F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.5F, AnimationHelper.createRotationalVector(-9.7888F, -2.4751F, 0.3165F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.55F, AnimationHelper.createRotationalVector(-7.5071F, 2.4786F, -0.3265F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.6F, AnimationHelper.createRotationalVector(-6.9537F, -5.4413F, -2.1177F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.65F, AnimationHelper.createRotationalVector(-9.5243F, -0.8495F, -5.0331F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.7F, AnimationHelper.createRotationalVector(-7.3891F, -2.1557F, 2.798F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.75F, AnimationHelper.createRotationalVector(-7.5071F, 2.4786F, -0.3265F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.8F, AnimationHelper.createRotationalVector(-7.2888F, -2.4751F, 0.3165F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.85F, AnimationHelper.createRotationalVector(-7.3891F, -2.1557F, 2.798F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.9F, AnimationHelper.createRotationalVector(-6.9537F, -5.4413F, -2.1177F), Transformation.Interpolations.LINEAR),
						new Keyframe(7.95F, AnimationHelper.createRotationalVector(-9.7888F, -2.4751F, 0.3165F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.0F, AnimationHelper.createRotationalVector(-7.5071F, 2.4786F, -0.3265F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.05F, AnimationHelper.createRotationalVector(-6.9537F, -5.4413F, -2.1177F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.1F, AnimationHelper.createRotationalVector(-9.5243F, -0.8495F, -5.0331F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.15F, AnimationHelper.createRotationalVector(-7.3891F, -2.1557F, 2.798F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.2F, AnimationHelper.createRotationalVector(-7.5071F, 2.4786F, -0.3265F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.45F, AnimationHelper.createRotationalVector(-6.9537F, -5.4413F, -2.1177F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.55F, AnimationHelper.createRotationalVector(-7.3891F, -2.1557F, 2.798F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.95F, AnimationHelper.createRotationalVector(7.4929F, 2.4786F, -0.3265F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.05F, AnimationHelper.createRotationalVector(2.4929F, 2.4786F, -0.3265F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.2F, AnimationHelper.createRotationalVector(-2.62F, 4.8643F, -2.9406F), Transformation.Interpolations.LINEAR),
						new Keyframe(10.5F, AnimationHelper.createRotationalVector(-2.62F, 4.8643F, -2.9406F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(-4.6693F, 7.9379F, -1.9736F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.5F, AnimationHelper.createRotationalVector(-2.17F, 9.0F, -3.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(-4.6693F, 7.9379F, -1.9736F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.5F, AnimationHelper.createRotationalVector(-1.6408F, -19.5056F, 3.221F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.0F, AnimationHelper.createRotationalVector(-1.6681F, -22.0045F, 3.2982F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(-1.6681F, -22.0045F, 3.2982F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.0F, AnimationHelper.createRotationalVector(-0.2888F, 10.8328F, -2.4753F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.65F, AnimationHelper.createRotationalVector(-0.1633F, 3.9056F, 0.4144F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.95F, AnimationHelper.createRotationalVector(-7.2525F, 7.501F, 20.6205F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(-7.2525F, 7.501F, 20.6205F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.5F, AnimationHelper.createRotationalVector(-7.218F, 5.0209F, 20.9373F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.0F, AnimationHelper.createRotationalVector(-6.919F, 7.8095F, 23.1238F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-34.344F, -6.5042F, 8.5351F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(4.35F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.2F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.5F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("jaw", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(7.3F, AnimationHelper.createRotationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.9F, AnimationHelper.createRotationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.15F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.3F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.6F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.65F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(1.8266F, 1.6188F, 5.4202F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.75F, AnimationHelper.createRotationalVector(11.0464F, 0.181F, 2.4387F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("jaw", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(7.3F, AnimationHelper.createTranslationalVector(0.0197F, 2.9888F, -0.1979F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.9F, AnimationHelper.createTranslationalVector(0.0197F, 2.9888F, -0.1979F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.15F, AnimationHelper.createTranslationalVector(0.0F, 1.3513F, -0.0344F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.3F, AnimationHelper.createTranslationalVector(0.0F, 1.3513F, -0.0344F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.6F, AnimationHelper.createTranslationalVector(0.0F, 2.0274F, -0.2156F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createTranslationalVector(0.0565F, 1.9829F, 0.2549F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createTranslationalVector(0.0565F, 1.9829F, 0.2549F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createTranslationalVector(0.0976F, 2.3531F, 0.3891F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.75F, AnimationHelper.createTranslationalVector(-0.0545F, 1.9888F, -0.0409F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.0F, AnimationHelper.createTranslationalVector(0.0565F, 1.9829F, 0.2549F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createTranslationalVector(0.0565F, 1.9829F, 0.2549F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(0.0F, 2.0274F, -0.2156F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("torso", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(0.0437F, 4.4899F, 0.832F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(0.0437F, 4.4899F, 0.832F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(0.0436F, -0.5101F, 0.8282F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("torso", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(5.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.699F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(8.7F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.999F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftArm", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(9.05F, AnimationHelper.createRotationalVector(13.4843F, 13.5362F, -33.479F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.15F, AnimationHelper.createRotationalVector(23.1083F, 5.9081F, -6.6443F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.3F, AnimationHelper.createRotationalVector(18.3377F, 5.1262F, -4.2587F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.5F, AnimationHelper.createRotationalVector(17.846F, 6.6798F, -9.0367F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(3.14F, 13.1424F, -7.8657F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(3.14F, 13.1424F, -7.8657F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.5F, AnimationHelper.createRotationalVector(4.099F, 8.9549F, -64.5955F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(3.2978F, 9.2777F, -69.6489F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.7F, AnimationHelper.createRotationalVector(-26.2417F, 7.9551F, -66.912F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.9F, AnimationHelper.createRotationalVector(-40.8536F, 18.0891F, -43.4106F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.0F, AnimationHelper.createRotationalVector(-48.9283F, -2.2827F, -54.7569F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.95F, AnimationHelper.createRotationalVector(-48.9283F, -2.2827F, -54.7569F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.0F, AnimationHelper.createRotationalVector(-47.2907F, 14.5647F, -39.7003F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.15F, AnimationHelper.createRotationalVector(-47.2907F, 14.5647F, -39.7003F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createRotationalVector(-27.2434F, 6.6857F, -42.219F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(8.7685F, 16.9416F, -51.2783F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftArm", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(9.05F, AnimationHelper.createTranslationalVector(-0.6428F, -0.926F, -0.3495F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.15F, AnimationHelper.createTranslationalVector(-0.6428F, -0.926F, -0.3495F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9962F, -0.0872F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9962F, -0.0872F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(-0.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(9.0F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.1F, AnimationHelper.createRotationalVector(-40.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.25F, AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.45F, AnimationHelper.createRotationalVector(-55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(-27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(-27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.5F, AnimationHelper.createRotationalVector(-80.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(-79.9907F, -2.462F, -0.4344F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.7F, AnimationHelper.createRotationalVector(-60.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.8F, AnimationHelper.createRotationalVector(-62.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.5F, AnimationHelper.createRotationalVector(-80.0093F, 0.434F, -2.4621F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.0F, AnimationHelper.createRotationalVector(-80.0093F, 0.434F, -2.4621F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.15F, AnimationHelper.createRotationalVector(-77.5093F, 0.434F, -2.4621F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createRotationalVector(-60.01F, 0.43F, -2.46F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-67.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("hand", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(-16.8502F, -3.6311F, -62.5178F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(-15.6263F, 22.9193F, -35.6867F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(-15.6263F, 22.9193F, -35.6867F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.7F, AnimationHelper.createRotationalVector(-16.8502F, -3.6311F, -62.5178F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.8F, AnimationHelper.createRotationalVector(-18.6293F, 10.8224F, -34.3553F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.5F, AnimationHelper.createRotationalVector(-24.6385F, 41.1819F, -47.5377F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(-24.6385F, 41.1819F, -47.5377F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createRotationalVector(-18.218F, 43.9278F, -20.5584F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-16.8502F, -3.6311F, -62.5178F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("hand", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(8.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(-18.1429F, 15.2099F, 30.0306F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(-15.6249F, 7.9813F, 13.9032F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(-15.6249F, 7.9813F, 13.9032F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.3F, AnimationHelper.createRotationalVector(-16.5037F, -5.9032F, -31.6431F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.45F, AnimationHelper.createRotationalVector(-16.9384F, -4.4638F, -26.835F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.65F, AnimationHelper.createRotationalVector(-17.4844F, -0.7515F, -14.8844F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.95F, AnimationHelper.createRotationalVector(-17.4844F, 0.7515F, -10.1156F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.5F, AnimationHelper.createRotationalVector(-17.4375F, 1.5018F, -7.7303F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(-17.3593F, -2.2494F, -19.6566F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.7F, AnimationHelper.createRotationalVector(-18.1429F, 15.2099F, 30.0306F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(-18.1429F, 15.2099F, 30.0306F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-18.1429F, 15.2099F, 30.0306F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(8.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftFingerTip1", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 80.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 60.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 60.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 30.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 27.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 45.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 47.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 40.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 80.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 80.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 80.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftFinger2", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(-4.2764F, 5.8539F, 28.3899F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 15.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 15.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -35.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.85F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -17.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -15.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -27.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.7F, AnimationHelper.createRotationalVector(-4.2764F, 5.8539F, 28.3899F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(-4.2764F, 5.8539F, 28.3899F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-4.2764F, 5.8539F, 28.3899F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftFingerTip2", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 75.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 75.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 30.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 47.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 50.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 42.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftFinger3", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(9.5744F, 6.7089F, 32.3286F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 20.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 20.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.8F, AnimationHelper.createRotationalVector(15.1291F, 1.5065F, -32.6291F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.1F, AnimationHelper.createRotationalVector(14.8981F, -3.06F, -15.7294F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.5F, AnimationHelper.createRotationalVector(14.7554F, -3.6999F, -13.3084F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(15.1624F, -1.1125F, -22.9773F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.7F, AnimationHelper.createRotationalVector(9.5744F, 6.7089F, 32.3286F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(9.5744F, 6.7089F, 32.3286F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(9.5744F, 6.7089F, 32.3286F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftFinger3", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(8.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.2F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.2F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.2F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.2F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftFingerTip3", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.9F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 40.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 52.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 55.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 45.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("thumb", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(-17.776F, -1.0873F, 55.7603F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(-60.2444F, -31.8956F, 79.1775F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(-60.2444F, -31.8956F, 79.1775F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.3F, AnimationHelper.createRotationalVector(-56.0171F, -33.8662F, 75.9631F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.0F, AnimationHelper.createRotationalVector(-54.2045F, -17.4308F, 84.1974F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.5F, AnimationHelper.createRotationalVector(-53.0345F, -17.9608F, 80.5287F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(-44.9019F, -5.8049F, 89.529F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.7F, AnimationHelper.createRotationalVector(-17.776F, -1.0873F, 55.7603F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(-17.776F, -1.0873F, 55.7603F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-17.776F, -1.0873F, 55.7603F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("thumb", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(8.5F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createTranslationalVector(0.5942F, 0.9772F, 0.0667F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createTranslationalVector(0.5942F, 0.9772F, 0.0667F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.75F, AnimationHelper.createTranslationalVector(0.5942F, 0.9772F, 0.0667F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.7F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("thumbTip", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -52.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -45.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -45.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.45F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -72.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -40.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -35.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -52.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -52.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -52.5F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("lantern", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(-7.9691F, 78.8825F, 94.5937F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(-7.9691F, 78.8825F, 94.5937F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(-7.9691F, 78.8825F, 94.5937F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(-7.9691F, 78.8825F, 94.5937F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-7.9691F, 78.8825F, 94.5937F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("lantern", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(8.5F, AnimationHelper.createTranslationalVector(-7.75F, -7.7F, -2.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createTranslationalVector(-7.75F, -7.7F, -2.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createTranslationalVector(-7.75F, -7.7F, -2.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createTranslationalVector(-7.75F, -7.7F, -2.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(-7.75F, -7.7F, -2.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("lantern", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(12.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.999F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.649F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.8F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("handle", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(-5.0F, 2.5F, 5.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-5.0F, 2.5F, 5.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("chainStart", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(2.4976F, -0.109F, 2.4976F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.7F, AnimationHelper.createRotationalVector(1.3433F, 3.0955F, 34.7562F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.9F, AnimationHelper.createRotationalVector(-18.5366F, -4.8207F, 47.8619F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.0F, AnimationHelper.createRotationalVector(-17.9286F, -17.1498F, 19.7228F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.25F, AnimationHelper.createRotationalVector(-2.3206F, -29.479F, -8.4164F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.35F, AnimationHelper.createRotationalVector(-0.9056F, -29.5493F, -11.2881F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.7F, AnimationHelper.createRotationalVector(-33.6871F, -12.6247F, -2.0325F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.8F, AnimationHelper.createRotationalVector(-34.5092F, -9.8204F, 2.1883F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(-30.8505F, -20.4871F, 0.8032F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.0F, AnimationHelper.createRotationalVector(-15.6256F, -15.074F, 7.689F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createRotationalVector(3.8789F, -10.2164F, -5.6478F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(2.0278F, -10.733F, 4.5085F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.8F, AnimationHelper.createRotationalVector(28.4327F, 28.2176F, 54.0908F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.15F, AnimationHelper.createRotationalVector(-20.7742F, -18.1453F, 19.59F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.25F, AnimationHelper.createRotationalVector(-21.9521F, -18.2166F, 19.6043F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.55F, AnimationHelper.createRotationalVector(-15.7898F, -17.5355F, 19.3628F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(-4.9811F, -0.4352F, 7.5189F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(-4.9811F, -0.4352F, 7.5189F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(-15.047F, -1.0871F, 12.4767F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.85F, AnimationHelper.createRotationalVector(34.3857F, -6.7853F, 20.7173F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.25F, AnimationHelper.createRotationalVector(41.8857F, -6.7853F, 20.7173F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.0F, AnimationHelper.createRotationalVector(39.3857F, -6.7853F, 20.7173F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.3F, AnimationHelper.createRotationalVector(23.86F, -4.56F, 16.1F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(8.8F, AnimationHelper.createTranslationalVector(0.0F, 0.1736F, -0.9848F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createTranslationalVector(0.4966F, -0.9829F, -0.193F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createTranslationalVector(0.4966F, -0.9829F, -0.193F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(0.5107F, -0.9928F, 0.06F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.8F, AnimationHelper.createRotationalVector(-69.3012F, -23.4908F, -16.702F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.15F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.3F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(9.65F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.85F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.35F, AnimationHelper.createRotationalVector(-60.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.0F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("claw", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(-33.6404F, 37.2028F, 8.1506F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(-33.6404F, 37.2028F, 8.1506F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-33.6404F, 37.2028F, 8.1506F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("claw", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(8.5F, AnimationHelper.createTranslationalVector(0.4673F, -1.3712F, -0.605F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createTranslationalVector(0.4673F, -1.3712F, -0.605F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(0.4673F, -1.3712F, -0.605F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger1", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(23.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(23.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(23.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger1tip", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(57.679F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(57.679F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(57.679F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger2", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(17.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(17.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(17.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger2tip", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger3", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(46.282F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(46.282F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(46.282F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger3tip", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(47.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(47.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(47.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("knife3", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(8.5F, AnimationHelper.createRotationalVector(-5.0F, -2.5F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(-5.0F, -2.5F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-5.0F, -2.5F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("flame", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(12.0F, AnimationHelper.createTranslationalVector(0.0F, 12.0F, -11.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createTranslationalVector(0.0F, 12.0F, -11.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.5F, AnimationHelper.createTranslationalVector(0.0F, 17.75F, -11.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("flame", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(8.5F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.799F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.8F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("chain1", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(12.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.6F, AnimationHelper.createRotationalVector(8.1249F, -7.9813F, 26.4032F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.25F, AnimationHelper.createRotationalVector(-96.5396F, -78.6126F, 83.2974F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.7F, AnimationHelper.createRotationalVector(-31.4764F, -79.8585F, 41.3071F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.2F, AnimationHelper.createRotationalVector(-3.8657F, -84.0424F, -4.0098F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.0F, AnimationHelper.createRotationalVector(112.0573F, -83.7235F, -108.8243F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createRotationalVector(17.7171F, -69.3934F, -42.7052F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-10.9113F, -69.7015F, 12.0549F), Transformation.Interpolations.LINEAR)
				))
				.build();
	}
	
	static Animation initSummonLanternAnim()
	{
		return Animation.Builder.create(2.75F)
					   .addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createRotationalVector(0.0F, 10.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.3F, AnimationHelper.createRotationalVector(0.0F, 10.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.35F, AnimationHelper.createTranslationalVector(0.0F, -0.83F, 7.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createTranslationalVector(0.0F, -0.83F, 7.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createTranslationalVector(0.0F, -0.8F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.3F, AnimationHelper.createTranslationalVector(0.0F, -0.8F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hips", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, -10.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(0.0F, -10.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.85F, AnimationHelper.createRotationalVector(0.0F, 15.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.3F, AnimationHelper.createRotationalVector(0.0F, 15.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-1.8577F, -17.2808F, -2.5417F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(-1.8577F, -17.2808F, -2.5417F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.85F, AnimationHelper.createRotationalVector(-7.9397F, -21.3703F, -10.0735F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.3F, AnimationHelper.createRotationalVector(-7.9397F, -21.3703F, -10.0735F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftMid", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(58.9097F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(45.1597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(45.1597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(57.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createRotationalVector(37.6234F, 1.3956F, 6.3217F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.3F, AnimationHelper.createRotationalVector(37.6234F, 1.3956F, 6.3217F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(-64.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(-76.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createRotationalVector(-54.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.3F, AnimationHelper.createRotationalVector(-54.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofLeft", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.3F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.35F, AnimationHelper.createRotationalVector(-17.0212F, 15.9483F, 3.6433F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(-17.0212F, 15.9483F, 3.6433F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createRotationalVector(-14.2224F, 11.1045F, 4.9194F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.3F, AnimationHelper.createRotationalVector(-14.2224F, 11.1045F, 4.9194F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightMid", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.35F, AnimationHelper.createRotationalVector(52.6597F, -1.0544F, -5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.3F, AnimationHelper.createRotationalVector(52.6597F, -1.0544F, -5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.5F, AnimationHelper.createRotationalVector(58.7012F, -5.5411F, 3.7213F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.35F, AnimationHelper.createRotationalVector(-54.1649F, 1.3726F, -0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.3F, AnimationHelper.createRotationalVector(-54.1649F, 1.3726F, -0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.5F, AnimationHelper.createRotationalVector(-71.883F, -5.233F, -5.0606F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.35F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.35F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.3F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.5F, AnimationHelper.createRotationalVector(23.0725F, -1.374F, 3.036F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.2533F, -4.6484F, 0.9167F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.4F, AnimationHelper.createRotationalVector(7.5518F, -12.3157F, -0.6188F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(7.6315F, -14.7938F, -0.9585F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createRotationalVector(7.6493F, 10.6431F, 1.7058F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.35F, AnimationHelper.createRotationalVector(7.6493F, 10.6431F, 1.7058F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(10.2533F, 5.3516F, -1.5833F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.3F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.65F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-34.344F, -6.5042F, 8.5351F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-1.6408F, -19.5056F, 3.221F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-1.6681F, -22.0045F, 3.2982F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(-1.6681F, -22.0045F, 3.2982F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-0.2888F, 10.8328F, -2.4753F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.3F, AnimationHelper.createRotationalVector(-0.1633F, 3.9056F, 0.4144F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.65F, AnimationHelper.createRotationalVector(-34.344F, -6.5042F, 8.5351F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("jaw", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(1.8266F, 1.6188F, 5.4202F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.75F, AnimationHelper.createRotationalVector(11.0464F, 0.181F, 2.4387F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("jaw", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 2.0274F, -0.2156F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createTranslationalVector(0.0976F, 2.3531F, 0.3891F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.75F, AnimationHelper.createTranslationalVector(-0.0545F, 1.9888F, -0.0409F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createTranslationalVector(0.0565F, 1.9829F, 0.2549F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createTranslationalVector(0.0F, 2.0274F, -0.2156F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(19.6105F, -11.1734F, -8.7325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(4.099F, 8.9549F, -64.5955F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(3.2978F, 9.2777F, -69.6489F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(-26.2417F, 7.9551F, -66.912F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(-40.8536F, 18.0891F, -43.4106F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-47.2907F, 14.5647F, -39.7003F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createRotationalVector(-47.2907F, 14.5647F, -39.7003F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.65F, AnimationHelper.createRotationalVector(8.7685F, 16.9416F, -51.2783F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createTranslationalVector(0.0F, -0.9962F, -0.0872F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.65F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-40.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-80.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(-79.9907F, -2.462F, -0.4344F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(-60.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(-62.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.25F, AnimationHelper.createRotationalVector(-80.0093F, 0.434F, -2.4621F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(-67.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hand", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(1.62F, 5.95F, 1.15F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(-16.8502F, -3.6311F, -62.5178F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(-18.6293F, 10.8224F, -34.3553F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.1F, AnimationHelper.createRotationalVector(-24.6385F, 41.1819F, -47.5377F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(-16.8502F, -3.6311F, -62.5178F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hand", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-14.9F, 7.32F, 8.52F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(-16.5037F, -5.9032F, -31.6431F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createRotationalVector(-16.9384F, -4.4638F, -26.835F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(-17.4844F, -0.7515F, -14.8844F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.95F, AnimationHelper.createRotationalVector(-17.4844F, 0.7515F, -10.1156F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(-17.4375F, 1.5018F, -7.7303F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(-17.3593F, -2.2494F, -19.6566F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(-18.1429F, 15.2099F, 30.0306F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFingerTip1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 12.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 30.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 27.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 45.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 47.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 40.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 80.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFinger2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-6.0205F, 4.0361F, 8.3965F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -35.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.85F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -17.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -15.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -27.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(-4.2764F, 5.8539F, 28.3899F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFingerTip2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 22.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 30.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 47.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 50.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 42.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFinger3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(6.7086F, 9.571F, 12.3299F), Transformation.Interpolations.LINEAR),
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
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 15.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.9F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 40.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 52.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 55.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 45.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("thumb", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-82.57F, -67.46F, 90.14F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(-56.0171F, -33.8662F, 75.9631F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-54.2045F, -17.4308F, 84.1974F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(-53.0345F, -17.9608F, 80.5287F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(-44.9019F, -5.8049F, 89.529F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(-17.776F, -1.0873F, 55.7603F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("thumb", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.5942F, 0.9772F, 0.0667F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("thumbTip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -52.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -72.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -40.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -35.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -52.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(-15.047F, -1.0871F, 12.4767F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.85F, AnimationHelper.createRotationalVector(34.3857F, -6.7853F, 20.7173F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.25F, AnimationHelper.createRotationalVector(41.8857F, -6.7853F, 20.7173F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -2.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createTranslationalVector(0.4966F, -0.9829F, -0.193F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.85F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.35F, AnimationHelper.createRotationalVector(-60.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createTranslationalVector(0.0F, -0.8F, -1.2F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.85F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -3.9F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
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
							   new Keyframe(2.15F, AnimationHelper.createRotationalVector(-2.3206F, -29.479F, -8.4164F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.55F, AnimationHelper.createRotationalVector(-3.29F, -9.5113F, -2.669F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(-10.1014F, -8.7616F, 17.0343F), Transformation.Interpolations.LINEAR)
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
							   new Keyframe(1.6F, AnimationHelper.createRotationalVector(155.6387F, -61.4708F, -109.1043F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(155.6387F, -61.4708F, -109.1043F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-84.0396F, -78.6126F, 83.2974F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.25F, AnimationHelper.createRotationalVector(-91.5396F, -78.6126F, 83.2974F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.55F, AnimationHelper.createRotationalVector(-38.2713F, -74.6627F, 17.6251F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(-1.2601F, -72.098F, -0.617F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.3F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineBottomEnd", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("torso", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0436F, -0.5101F, 0.8282F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("torso", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("claw", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-12.5F, 15.0F, -14.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 12.5F, 15.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .build();
	}
	
	static Animation initIdleAnim()
	{
		return Animation.Builder.create(2.0F).looping()
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
				.addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.2533F, 5.3516F, -1.5833F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(12.7533F, 5.3516F, -1.5833F), Transformation.Interpolations.LINEAR),
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
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.9F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 5.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftArm", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-0.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.9F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftFingerTip1", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 5.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftFingerTip2", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 5.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftFingerTip3", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 5.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("chainStart", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.4609F, 0.9101F, -10.9167F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(13.8675F, 4.6031F, -9.163F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(10.4609F, 0.9101F, -10.9167F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("claw", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-12.5F, 15.0F, -14.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(-7.5F, 10.0F, -10.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(-12.5F, 15.0F, -14.5F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger1", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 12.5F, 15.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 15.0F, 17.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 12.5F, 15.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger2", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 2.5F, 5.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger2tip", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger3", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger3tip", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, -2.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("knife3", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(1.8F, 3.3F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("flame", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(6.0F, 17.0F, -7.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("flame", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("brokenArmGore2", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(-1.0565F, 5.1532F, -2.5434F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("knife1", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(-1.0F, -1.5F, -0.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("knife2", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(2.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("chain1", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(1.5F, 5.0F, -2.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.build();
	}
	
	static Animation initWalkAnim()
	{
		return Animation.Builder.create(2.0F).looping()
				.addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, -7.5F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, 0.1F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 0.1F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(4.5739F, -2.4438F, 5.1971F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("spineBottomEnd", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("hips", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 5.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -5.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 5.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("hips", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-35.3961F, -8.4319F, 1.9128F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(16.2976F, 7.9919F, -1.8195F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.9F, AnimationHelper.createRotationalVector(-37.8961F, -8.4319F, 1.9128F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(-35.3961F, -8.4319F, 1.9128F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.1F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.9F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legLeftMid", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(32.3984F, 2.1192F, 0.0001F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.25F, AnimationHelper.createRotationalVector(35.4845F, 3.349F, -0.158F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.5F, AnimationHelper.createRotationalVector(36.0705F, 4.5788F, -0.3162F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.75F, AnimationHelper.createRotationalVector(33.1566F, 2.2894F, -0.1581F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(22.7427F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.25F, AnimationHelper.createRotationalVector(58.5705F, 2.4596F, -0.3163F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(32.3984F, 2.1192F, 0.0001F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legLeftBottom", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-44.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.25F, AnimationHelper.createRotationalVector(-59.4512F, -0.271F, 0.583F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.5F, AnimationHelper.createRotationalVector(-61.7376F, 0.8307F, 0.209F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.75F, AnimationHelper.createRotationalVector(-58.2866F, -0.366F, -1.1487F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(-65.3356F, -1.5628F, -2.5065F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.25F, AnimationHelper.createRotationalVector(-81.7376F, 2.2034F, -0.748F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.75F, AnimationHelper.createRotationalVector(-81.7376F, 2.2034F, -0.748F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(-44.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("hoofLeft", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(38.13F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.25F, AnimationHelper.createRotationalVector(39.69F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.5F, AnimationHelper.createRotationalVector(30.75F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.75F, AnimationHelper.createRotationalVector(20.63F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(22.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.25F, AnimationHelper.createRotationalVector(33.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.6F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.85F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(38.13F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(16.2976F, -7.9919F, 1.8195F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.9F, AnimationHelper.createRotationalVector(-37.8961F, 8.4319F, -1.9128F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(-35.3961F, 8.4319F, -1.9128F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(11.2976F, -7.9919F, 1.8195F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-0.1F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.9F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createTranslationalVector(-0.1F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legRightMid", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(22.7427F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.25F, AnimationHelper.createRotationalVector(66.0705F, -2.4596F, 0.3163F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(32.3984F, -2.1192F, -0.0001F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.25F, AnimationHelper.createRotationalVector(35.4845F, -3.349F, 0.158F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.5F, AnimationHelper.createRotationalVector(36.0705F, -4.5788F, 0.3162F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.75F, AnimationHelper.createRotationalVector(33.1566F, -2.2894F, 0.1581F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(32.7427F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-65.3356F, 1.5628F, 2.5065F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.25F, AnimationHelper.createRotationalVector(-81.7376F, -2.2034F, 0.748F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.75F, AnimationHelper.createRotationalVector(-81.7376F, -2.2034F, 0.748F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(-44.1649F, 1.3726F, -0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.25F, AnimationHelper.createRotationalVector(-59.4512F, 0.271F, -0.583F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.5F, AnimationHelper.createRotationalVector(-61.7376F, -0.8307F, -0.209F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.75F, AnimationHelper.createRotationalVector(-58.2866F, 0.366F, 1.1487F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(-63.3356F, 1.5628F, 2.5065F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(22.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.25F, AnimationHelper.createRotationalVector(33.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.6F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.85F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(38.13F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.25F, AnimationHelper.createRotationalVector(39.69F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.5F, AnimationHelper.createRotationalVector(30.75F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.75F, AnimationHelper.createRotationalVector(20.63F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(22.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(13.4791F, 2.234F, 0.4505F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.05F, AnimationHelper.createRotationalVector(14.7233F, 2.1283F, 0.4239F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.35F, AnimationHelper.createRotationalVector(13.93F, 1.61F, -2.09F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.95F, AnimationHelper.createRotationalVector(10.7393F, 3.3903F, -4.4152F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.05F, AnimationHelper.createRotationalVector(13.2393F, 3.3903F, -4.4152F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.35F, AnimationHelper.createRotationalVector(13.1F, 3.39F, -4.42F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.95F, AnimationHelper.createRotationalVector(12.2348F, 2.3402F, 0.4747F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(13.4791F, 2.234F, 0.4505F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("spineTop", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(37.4011F, 2.6841F, -4.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-32.5232F, -0.7068F, -1.1335F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.1F, AnimationHelper.createRotationalVector(-31.2474F, -1.0525F, -1.4199F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.4F, AnimationHelper.createRotationalVector(-33.7996F, -0.3652F, -0.8534F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.9F, AnimationHelper.createRotationalVector(-33.6945F, 1.7137F, -2.2461F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(-32.4139F, 1.4025F, -2.48F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createRotationalVector(-31.1345F, 1.0863F, -2.7195F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.4F, AnimationHelper.createRotationalVector(-33.7996F, -0.3652F, -0.8534F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.9F, AnimationHelper.createRotationalVector(-33.7996F, -0.3652F, -0.8534F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(-32.5232F, -0.7068F, -1.1335F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("jaw", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.17F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.15F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.55F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.95F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.15F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.5F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.95F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(9.17F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("jaw", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 2.5274F, -0.2156F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("torso", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0436F, -0.5101F, 0.8282F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("torso", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftArm", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(18.1573F, -1.1194F, 2.33F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(-20.0F, 2.5F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(18.1573F, -1.1194F, 2.33F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftArm", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(1.0F, AnimationHelper.createTranslationalVector(-0.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("hand", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 5.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(-0.2624F, 18.5388F, -4.7891F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 5.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftFingerTip1", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftFingerTip2", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftFingerTip3", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("chainStart", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.9609F, 0.9101F, -8.4167F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.15F, AnimationHelper.createRotationalVector(5.96F, 0.91F, -6.42F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.35F, AnimationHelper.createRotationalVector(4.96F, 0.91F, -4.42F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(4.96F, 0.91F, -4.42F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.25F, AnimationHelper.createRotationalVector(10.4609F, 0.9101F, -10.9167F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(7.9609F, 0.9101F, -8.4167F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("chain1", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, 27.5F, -12.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.2F, AnimationHelper.createRotationalVector(0.0F, 22.5F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.5F, AnimationHelper.createRotationalVector(-2.5F, 27.03F, 6.29F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.9F, AnimationHelper.createRotationalVector(0.0F, 33.06F, 3.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.2F, AnimationHelper.createRotationalVector(2.5F, 35.28F, -9.75F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.45F, AnimationHelper.createRotationalVector(5.0F, 35.28F, -12.25F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(7.5F, 27.5F, -12.5F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("brokenArmGore2", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("claw", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-12.5F, 15.0F, -14.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.25F, AnimationHelper.createRotationalVector(-13.1964F, 16.4854F, -19.5487F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.5F, AnimationHelper.createRotationalVector(-20.0751F, 18.3297F, -28.8895F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createRotationalVector(14.1025F, 7.4502F, 0.6377F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.45F, AnimationHelper.createRotationalVector(12.688F, 4.7856F, 3.5047F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(-12.5F, 15.0F, -14.5F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger1", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.865F, 8.3133F, 12.2626F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.35F, AnimationHelper.createRotationalVector(9.865F, 8.3133F, 12.2626F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.8F, AnimationHelper.createRotationalVector(24.865F, 8.3133F, 12.2626F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.95F, AnimationHelper.createRotationalVector(27.365F, 8.3133F, 12.2626F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(9.865F, 8.3133F, 12.2626F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger1tip", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.75F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("knife1", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger2", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.5F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.9F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.05F, AnimationHelper.createRotationalVector(32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger2tip", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("knife2", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger3", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.15F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger3tip", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("knife3", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("flame", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(6.0F, 17.0F, -7.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("flame", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.build();
	}
	
	static Animation initHoldLanternPose()
	{
		return Animation.Builder.create(0.0F).looping()
					   .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(8.7685F, 16.9416F, -51.2783F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-0.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-67.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
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
					   .addBoneAnimation("handle", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, 2.5F, 5.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chainStart", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-10.1014F, -8.7616F, 17.0343F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-4.5556F, -71.3182F, 5.4048F), Transformation.Interpolations.LINEAR)
					   ))
					   .build();
	}
	
	static Animation initNoLanternPose()
	{
		return Animation.Builder.create(0.0F)
					   .addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, -10.0F, 2.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 5.0F, -5.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(19.6105F, -11.1734F, -8.7325F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-0.2F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-40.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hand", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(1.62F, 5.95F, 1.15F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hand", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-14.9F, 7.32F, 8.52F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFingerTip1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 12.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFinger2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-6.0205F, 4.0361F, 8.3965F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFingerTip2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 22.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFinger3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(6.7086F, 9.571F, 12.3299F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFingerTip3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 15.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("thumb", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-82.57F, -67.46F, 90.14F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("thumb", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("thumbTip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -52.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("lantern", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .build();
	}
	
	static Animation initShowClawPose()
	{
		return Animation.Builder.create(0.0F).looping()
				.addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.6151F, 12.9126F, -2.1494F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, -5.0F, 17.5F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("jaw", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(47.2947F, 20.3671F, 44.3488F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-75.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("claw", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-52.1015F, 38.0036F, -18.5428F), Transformation.Interpolations.LINEAR)
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
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-17.0F, -6.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("chainStart", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.2F, 0.0F, -6.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("chain1", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-0.5F, -9.0F, -1.0F), Transformation.Interpolations.LINEAR)
				))
				.build();
	}
	
	static Animation initShowClawNoExtrasPose()
	{
		return Animation.Builder.create(0.0F).looping()
				.addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(47.2947F, 20.3671F, 44.3488F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("claw", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-52.1015F, 38.0036F, -18.5428F), Transformation.Interpolations.LINEAR)
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
				.build();
	}
	
	static Animation initNoClawPose()
	{
		return Animation.Builder.create(0.0F).looping()
				.addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.5107F, -0.9928F, 0.06F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("brokenArmGore1", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("brokenArmGore2", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.build();
	}
	
	static Animation initRunAnim()
	{
		return Animation.Builder.create(2.0F).looping()
					   .addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(22.5F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(22.5F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.35F, AnimationHelper.createTranslationalVector(0.0F, -2.5F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, -2.5F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createTranslationalVector(0.0F, -2.5F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createTranslationalVector(0.0F, -2.5F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-55.83F, -17.6906F, 0.9791F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-0.2507F, 0.8608F, -1.2818F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.95F, AnimationHelper.createRotationalVector(6.5875F, 11.0808F, -2.6265F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(3.2913F, 13.0272F, -1.9922F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createRotationalVector(-55.7724F, -14.5422F, 0.7154F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-55.83F, -17.6906F, 0.9791F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-0.6678F, 0.4294F, -1.1703F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0493F, 0.266F, 1.905F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createTranslationalVector(-0.6678F, 0.4294F, -1.1703F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftMid", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(73.67F, -1.61F, 2.15F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(57.3367F, -1.61F, 2.15F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.85F, AnimationHelper.createRotationalVector(78.17F, -1.61F, 2.15F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.95F, AnimationHelper.createRotationalVector(81.17F, -1.61F, 2.15F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(80.78F, -1.61F, 2.15F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createRotationalVector(73.67F, -1.61F, 2.15F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(73.67F, -1.61F, 2.15F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-78.7F, -0.21F, -2.78F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(-38.7F, -0.21F, -2.78F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createRotationalVector(-31.2F, -0.21F, -2.78F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(-63.7F, -0.21F, -2.78F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-78.7F, -0.21F, -2.78F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofLeft", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(29.9719F, -0.7975F, 0.7311F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(8.5296F, -0.7975F, 0.7311F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(8.2219F, -0.7975F, 0.7311F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(49.9719F, -0.7975F, 0.7311F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(29.9719F, -0.7975F, 0.7311F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(3.2913F, -13.0272F, 1.9922F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.9F, AnimationHelper.createRotationalVector(-56.0342F, 8.9756F, -1.2085F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-55.6951F, 12.3094F, -0.9897F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(-0.2507F, -0.8608F, 1.2818F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.95F, AnimationHelper.createRotationalVector(6.5875F, -11.0808F, 1.2818F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(3.2913F, -13.0272F, 1.9922F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0493F, 0.266F, 1.905F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.6678F, 0.4294F, -1.1703F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0493F, 0.266F, 1.905F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightMid", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(81.04F, -1.61F, 2.15F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(80.78F, -1.61F, 2.15F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(73.67F, -1.61F, 2.15F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(73.67F, -1.61F, 2.15F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(73.67F, -1.61F, 2.15F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(57.3367F, -1.61F, 2.15F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.85F, AnimationHelper.createRotationalVector(78.17F, -1.61F, 2.15F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.95F, AnimationHelper.createRotationalVector(81.17F, -1.61F, 2.15F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(81.04F, -1.61F, 2.15F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-43.7F, -0.21F, -2.78F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.4F, AnimationHelper.createRotationalVector(-63.7F, -0.21F, -2.78F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-78.7F, -0.21F, -2.78F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createRotationalVector(-38.7F, -0.21F, -2.78F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.75F, AnimationHelper.createRotationalVector(-31.2F, -0.21F, -2.78F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-43.7F, -0.21F, -2.78F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(49.9719F, -0.7975F, 0.7311F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(29.9719F, -0.7975F, 0.7311F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(8.5296F, -0.7975F, 0.7311F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.6F, AnimationHelper.createRotationalVector(8.2219F, -0.7975F, 0.7311F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(49.9719F, -0.7975F, 0.7311F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 2.0F, -5.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 2.0F, -5.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(14.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.15F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.4F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(12.5115F, 2.4407F, 0.5414F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(14.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-42.56F, -8.29F, 4.18F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.2F, AnimationHelper.createRotationalVector(-38.5563F, -8.2887F, 4.1788F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-41.0563F, -8.2887F, 4.1788F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.95F, AnimationHelper.createRotationalVector(-43.5563F, -8.2887F, 4.1788F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.2F, AnimationHelper.createRotationalVector(-38.5563F, -8.2887F, 4.1788F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(-41.0563F, -8.2887F, 4.1788F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.85F, AnimationHelper.createRotationalVector(-43.5563F, -8.2887F, 4.1788F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-42.56F, -8.29F, 4.18F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("jaw", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(4.99F, 0.09F, 0.2F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.15F, AnimationHelper.createRotationalVector(9.9722F, 0.1524F, 0.5987F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.35F, AnimationHelper.createRotationalVector(7.4831F, 0.1128F, 0.4F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.05F, AnimationHelper.createRotationalVector(2.4956F, 0.0582F, 0.0014F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(9.9722F, 0.1524F, 0.5987F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(7.4831F, 0.1128F, 0.4F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(4.99F, 0.09F, 0.2F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("jaw", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-0.02F, 1.11F, -0.11F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.15F, AnimationHelper.createTranslationalVector(-0.0213F, 0.7098F, -0.1557F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.35F, AnimationHelper.createTranslationalVector(-0.0173F, 1.0061F, -0.1088F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.05F, AnimationHelper.createTranslationalVector(-0.0176F, 1.3091F, -0.0874F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createTranslationalVector(-0.0213F, 0.7098F, -0.1557F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createTranslationalVector(-0.0173F, 1.0061F, -0.1088F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createTranslationalVector(-0.02F, 1.11F, -0.11F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-0.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("flame", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hips", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 10.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-1.5975F, -19.9303F, 5.3144F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 10.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.95F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.4F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.9F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.75F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.85F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(7.95F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("torso", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 5.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("torso", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.2F), Transformation.Interpolations.LINEAR)
					   ))
					   .build();
	}
	
	static Animation initPrepareRunAttack()
	{
		return Animation.Builder.create(1.0F)
					   .addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -3.9F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, -4.2F, 0.0F), Transformation.Interpolations.LINEAR)
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
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.4F, AnimationHelper.createRotationalVector(-70.0515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-27.0515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-35.0515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftMid", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.4F, AnimationHelper.createRotationalVector(87.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(66.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(69.9597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(75.1597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.4F, AnimationHelper.createRotationalVector(-60.4149F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-71.6649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(-74.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-71.6649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofLeft", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.4F, AnimationHelper.createRotationalVector(36.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(28.9429F, -0.8391F, 9.0314F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(31.4429F, -0.8391F, 9.0314F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightMid", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(32.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(32.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-61.8103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-61.8103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.2533F, 5.3516F, -1.5833F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(15.2533F, 5.3516F, -1.5833F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-34.344F, -6.5042F, 8.5351F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-44.344F, -6.5042F, 8.5351F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("jaw", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("jaw", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 2.0274F, -0.2156F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 3.03F, -0.22F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("torso", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0436F, -0.5101F, 0.8282F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("torso", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(8.8914F, -1.4598F, 4.9805F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(11.6383F, -7.0152F, 5.606F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-0.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFingerTip1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFingerTip2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFingerTip3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chainStart", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.4609F, 0.9101F, -10.9167F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(2.5447F, 7.0417F, 3.1486F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.7399F, 1.6835F, 4.4826F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArmGore2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("claw", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-12.5F, 15.0F, -14.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 12.5F, 15.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger2tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger3tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("flame", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(6.0F, 17.0F, -7.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("flame", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .build();
	}
	
	static Animation initRunLanternAnim()
	{
		return Animation.Builder.create(2.0F).looping()
					   .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(14.9721F, -32.7419F, 3.4335F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(17.6266F, -27.427F, -8.1905F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(14.9721F, -32.7419F, 3.4335F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hand", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-0.1499F, 11.9626F, 3.8645F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(-0.7201F, -7.6155F, 12.5259F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-0.1499F, 11.9626F, 3.8645F), Transformation.Interpolations.LINEAR)
					   ))
					   .build();
	}
	
	static Animation initRunLanternDragAnim()
	{
		return Animation.Builder.create(4.0F).looping()
					   .addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-0.3655F, -20.9089F, -0.8652F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-0.473F, 18.9591F, -19.5206F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("torso", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 5.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 5.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.0F, AnimationHelper.createRotationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 5.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 37.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 37.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(30.6174F, -2.3863F, -0.2399F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.0F, AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hand", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(111.1532F, -28.5181F, -13.1237F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(110.4587F, -23.8048F, -11.2216F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(110.6181F, -26.3006F, -11.3337F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.0F, AnimationHelper.createRotationalVector(110.4587F, -23.8048F, -11.2216F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createRotationalVector(111.1532F, -28.5181F, -13.1237F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("handle", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(29.5144F, 3.1445F, -6.8271F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chainStart", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0308F, 2.8143F, -6.8609F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-5.0577F, 4.1643F, -5.6693F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-8.9246F, 5.4856F, -4.5215F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.0F, AnimationHelper.createRotationalVector(-9.8304F, 6.6918F, -4.4521F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createRotationalVector(-5.0308F, 2.8143F, -6.8609F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(39.088F, 1.9827F, -40.1263F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(96.4144F, -6.7161F, -97.1897F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(60.48F, 0.05F, -62.3F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.65F, AnimationHelper.createRotationalVector(32.5344F, 2.1516F, -35.0508F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.0F, AnimationHelper.createRotationalVector(24.5452F, 6.8077F, -27.4172F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createRotationalVector(39.088F, 1.9827F, -40.1263F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.2462F, 0.0093F, -7.4896F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createRotationalVector(-2.0696F, 2.8625F, -6.7816F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.1F, AnimationHelper.createRotationalVector(4.0999F, -5.4667F, 5.4667F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.2462F, 0.0093F, -7.4896F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain2", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-0.1261F, -0.1505F, -15.0096F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-4.9042F, 1.3152F, -5.1264F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.45F, AnimationHelper.createRotationalVector(3.207F, -6.3013F, -6.4831F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createRotationalVector(-0.1261F, -0.1505F, -15.0096F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain3", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain4", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.9026F, -0.7385F, -7.9076F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(0.7432F, 0.5166F, -10.7593F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.2F, AnimationHelper.createRotationalVector(1.4053F, -1.6396F, -10.0707F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.9026F, -0.7385F, -7.9076F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain4", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain5", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(4.6685F, 0.3524F, -9.9649F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-4.3129F, -2.3369F, -11.7782F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(-0.8877F, -1.6272F, -17.733F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(2.0713F, -1.9349F, -8.6249F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.5F, AnimationHelper.createRotationalVector(3.7472F, -2.1545F, -15.793F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.0F, AnimationHelper.createRotationalVector(7.1982F, -2.7845F, -25.3321F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createRotationalVector(4.6685F, 0.3524F, -9.9649F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain5", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain6", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-3.8527F, -19.9563F, -5.5569F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.8F, AnimationHelper.createRotationalVector(-1.12F, -7.18F, -13.82F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-0.5854F, -3.6075F, -24.0138F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.4407F, -3.0418F, -27.7048F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(3.3932F, -2.412F, -26.5733F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.0F, AnimationHelper.createRotationalVector(2.1175F, 2.6101F, -15.065F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createRotationalVector(-3.8527F, -19.9563F, -5.5569F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain6", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .build();
	}
	
	static Animation initRunClawAnim()
	{
		return Animation.Builder.create(4.0F).looping()
					   .addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-107.7823F, -15.7391F, -12.6868F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.85F, AnimationHelper.createRotationalVector(-1.2616F, -5.1277F, -5.7513F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(-46.3264F, 18.002F, -5.218F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-107.7823F, -15.7391F, -12.6868F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.85F, AnimationHelper.createRotationalVector(-1.2616F, -5.1277F, -5.7513F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.1F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.5F, AnimationHelper.createRotationalVector(-46.3264F, 18.002F, -5.218F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createRotationalVector(-107.7823F, -15.7391F, -12.6868F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.85F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.85F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.1F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("claw", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.85F, AnimationHelper.createRotationalVector(-14.4008F, 7.6222F, -17.4824F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(1.7188F, 31.9975F, 18.1729F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.85F, AnimationHelper.createRotationalVector(-14.4008F, 7.6222F, -17.4824F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.1F, AnimationHelper.createRotationalVector(1.7188F, 31.9975F, 18.1729F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger1tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.0F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger2tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.0F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger3tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.0F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .build();
	}
	
	static Animation initRunClawDragAnim()
	{
		return Animation.Builder.create(2.0F).looping()
					   .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(3.8722F, -4.5678F, -15.2764F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("torso", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 5.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 5.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-10.5169F, -29.8469F, -19.3705F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-18.0169F, -29.8469F, -19.3705F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-10.5169F, -29.8469F, -19.3705F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(-18.0169F, -29.8469F, -19.3705F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-10.5169F, -29.8469F, -19.3705F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("claw", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(186.0954F, -29.1142F, -172.0498F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(191.0954F, -29.1142F, -172.0498F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(186.0954F, -29.1142F, -172.0498F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(191.0954F, -29.1142F, -172.0498F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(186.0954F, -29.1142F, -172.0498F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.2F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.4F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.8F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.9F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.2F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.6F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger1tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(-11.87F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.2F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.4F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(-11.87F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.8F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.9F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.2F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(-11.87F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.6F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createRotationalVector(-11.87F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, -10.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.2F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.4F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.8F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.9F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.2F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.6F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger2tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.2F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(-25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.4F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-27.3315F, 4.7317F, 1.6251F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(-24.8315F, 4.7317F, 1.6251F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.2F, AnimationHelper.createRotationalVector(-24.8315F, 4.7317F, 1.6251F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(-25.6649F, 4.7317F, 1.6251F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.4F, AnimationHelper.createRotationalVector(-22.3315F, 4.7317F, 1.6251F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-27.3315F, 4.7317F, 1.6251F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(-24.8315F, 4.7317F, 1.6251F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(-24.8315F, 4.7317F, 1.6251F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.8F, AnimationHelper.createRotationalVector(-25.6649F, 4.7317F, 1.6251F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.9F, AnimationHelper.createRotationalVector(-22.3315F, 4.7317F, 1.6251F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-27.3315F, 4.7317F, 1.6251F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(-24.8315F, 4.7317F, 1.6251F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.2F, AnimationHelper.createRotationalVector(-24.8315F, 4.7317F, 1.6251F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(-25.6649F, 4.7317F, 1.6251F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(-22.3315F, 4.7317F, 1.6251F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(-27.3315F, 4.7317F, 1.6251F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.6F, AnimationHelper.createRotationalVector(-24.8315F, 4.7317F, 1.6251F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(-24.8315F, 4.7317F, 1.6251F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(-25.6649F, 4.7317F, 1.6251F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createRotationalVector(-22.3315F, 4.7317F, 1.6251F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-27.3315F, 4.7317F, 1.6251F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger3tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-14.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(-14.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.2F, AnimationHelper.createRotationalVector(-16.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(-14.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 20.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .build();
	}
	
	static Animation initLanternSideSwingAnim()
	{
		return Animation.Builder.create(2.45F)
					   .addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createRotationalVector(0.1205F, -30.4286F, 3.4956F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(0.1205F, -30.4286F, 3.4956F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(-1.0254F, 24.5514F, 0.8628F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(-1.0254F, 24.5514F, 0.8628F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineBottomEnd", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hips", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(0.0F, -2.5F, 2.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -2.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -2.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hips", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(16.0543F, -7.6833F, -7.5854F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(16.0543F, -7.6833F, -7.5854F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(-36.7593F, -12.1853F, -1.039F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(-36.7593F, -12.1853F, -1.039F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createTranslationalVector(-1.335F, 0.2577F, 2.4548F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createTranslationalVector(-1.335F, 0.2577F, 2.4548F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createTranslationalVector(-1.335F, 0.2577F, 2.4548F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftMid", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(27.4829F, 3.7473F, 1.2718F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(27.4829F, 3.7473F, 1.2718F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.2F, AnimationHelper.createRotationalVector(77.4829F, 3.7473F, 1.2718F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(54.9829F, 3.7473F, 1.2718F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(54.9829F, 3.7473F, 1.2718F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-64.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(-64.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.2F, AnimationHelper.createRotationalVector(-84.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(-49.1571F, 0.5186F, 2.5922F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(-49.1571F, 0.5186F, 2.5922F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofLeft", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.2F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(-6.5955F, 11.8703F, 3.8141F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createRotationalVector(-22.9627F, 9.0581F, -3.2735F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(-22.9627F, 9.0581F, -3.2735F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(16.6193F, -2.6711F, 0.9954F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(16.6193F, -2.6711F, 0.9954F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightMid", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(65.9927F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createRotationalVector(49.9245F, 0.0031F, 1.2287F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(49.9245F, 0.0031F, 1.2287F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(39.9245F, 0.0031F, 1.2287F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(39.9245F, 0.0031F, 1.2287F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(-69.2204F, -1.7563F, -1.6117F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createRotationalVector(-51.7328F, -1.487F, -1.4263F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(-51.7328F, -1.487F, -1.4263F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(-79.2328F, -1.487F, -1.4263F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(-79.2328F, -1.487F, -1.4263F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.2533F, 5.3516F, -1.5833F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(10.9957F, -21.695F, -6.6582F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(11.1992F, -24.1483F, -7.1806F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(11.2773F, 25.0073F, 2.2685F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createRotationalVector(14.0208F, 27.458F, 2.8193F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(14.0208F, 27.458F, 2.8193F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createRotationalVector(10.2533F, 5.3516F, -1.5833F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(37.4818F, 0.3569F, 0.2498F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-34.344F, -6.5042F, 8.5351F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(-36.6733F, 20.1963F, -10.3082F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(-36.6733F, 20.1963F, -10.3082F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(-32.7828F, 1.7357F, -7.8572F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(-32.9648F, 5.9358F, -10.5767F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.85F, AnimationHelper.createRotationalVector(-44.1557F, -24.0632F, 24.3623F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createRotationalVector(-34.344F, -6.5042F, 8.5351F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("jaw", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.85F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.95F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("jaw", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 2.0274F, -0.2156F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 3.28F, -0.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.85F, AnimationHelper.createTranslationalVector(0.0F, 3.28F, -0.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.95F, AnimationHelper.createTranslationalVector(0.0F, 2.28F, -0.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createTranslationalVector(0.0F, 2.28F, -0.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createTranslationalVector(0.0F, 2.0274F, -0.2156F), Transformation.Interpolations.LINEAR)
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
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(29.1316F, 19.18F, -50.1071F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(-49.645F, 21.1127F, -67.653F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(-54.645F, 21.1127F, -67.653F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(8.7685F, 16.9416F, -51.2783F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createRotationalVector(11.2685F, 16.9416F, -51.2783F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.4F, AnimationHelper.createRotationalVector(8.7685F, 16.9416F, -51.2783F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createTranslationalVector(-0.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createTranslationalVector(-0.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-67.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(-37.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.8F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(-72.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(-75.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-67.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.2F, AnimationHelper.createRotationalVector(-65.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.4F, AnimationHelper.createRotationalVector(-67.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hand", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-16.8502F, -3.6311F, -62.5178F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(-19.8239F, -30.7334F, -53.1852F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-17.1232F, 10.7215F, -66.897F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createRotationalVector(-17.9607F, 20.259F, -70.0211F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(-30.0145F, 36.9514F, -83.1384F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createRotationalVector(-21.6251F, 11.2872F, -59.899F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(-25.2908F, 6.6846F, -55.7835F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.4F, AnimationHelper.createRotationalVector(-16.8502F, -3.6311F, -62.5178F), Transformation.Interpolations.LINEAR)
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
							   new Keyframe(0.9F, AnimationHelper.createRotationalVector(1.0737F, -10.8684F, 9.5969F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(1.0737F, -10.8684F, 9.5969F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(24.5445F, 8.3021F, -31.3197F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createRotationalVector(14.5573F, 11.8194F, -32.8573F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(9.5573F, 11.8194F, -32.8573F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(9.5573F, 11.8194F, -32.8573F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.25F, AnimationHelper.createRotationalVector(15.0621F, 1.7145F, 11.3779F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.45F, AnimationHelper.createRotationalVector(2.0278F, -10.733F, 4.5085F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hull", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createScalingVector(0.9F, 1.1F, 1.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.6F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-30.8393F, -3.4553F, 34.7989F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(-33.3393F, -3.4553F, 34.7989F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(24.1607F, -3.4553F, 34.7989F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(39.16F, -3.46F, 29.8F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.5107F, -0.9928F, 0.06F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createTranslationalVector(0.5107F, -0.9928F, 0.06F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(-25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createTranslationalVector(-0.2128F, -0.5979F, -0.4553F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createTranslationalVector(-0.2128F, -0.5979F, -0.4553F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.15F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("claw", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.05F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.05F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger1tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.05F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.05F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger2tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.05F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.05F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger3tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.05F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
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
							   new Keyframe(0.95F, AnimationHelper.createRotationalVector(12.9444F, -71.3182F, 5.4048F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(12.9444F, -71.3182F, 5.4048F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(48.5359F, -61.8713F, -33.0297F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createRotationalVector(23.5359F, -61.8713F, -33.0297F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(23.5359F, -61.8713F, -33.0297F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.05F, AnimationHelper.createRotationalVector(23.5359F, -61.8713F, -33.0297F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.3F, AnimationHelper.createRotationalVector(4.3875F, -75.9206F, 15.6592F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.45F, AnimationHelper.createRotationalVector(-4.5556F, -71.3182F, 5.4048F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.8F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(24.5623F, 4.2453F, -11.7678F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(-17.9377F, 4.2453F, -11.7678F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.95F, AnimationHelper.createRotationalVector(-17.9377F, 4.2453F, -11.7678F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain2", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.35F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.95F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.05F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.45F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.85F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.6F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain3", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.45F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain4", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.85F, AnimationHelper.createRotationalVector(14.1F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.05F, AnimationHelper.createRotationalVector(23.53F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(23.53F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(40.1851F, -51.9555F, -29.5418F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(23.3503F, -2.987F, 6.8826F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(-16.47F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.85F, AnimationHelper.createRotationalVector(-18.97F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.95F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain4", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.55F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.85F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.95F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .build();
	}
	
	static Animation initLanternSlamAnim()
	{
		return Animation.Builder.create(5.8F)
					   .addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.9F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createTranslationalVector(0.0F, -1.8F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createTranslationalVector(0.0F, -1.8F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.9F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(12.0739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(12.0739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(4.6084F, 7.4278F, -4.7955F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(4.6084F, 7.4278F, -4.7955F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.7F, AnimationHelper.createRotationalVector(29.6084F, 7.4278F, -4.7955F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.7F, AnimationHelper.createRotationalVector(29.6084F, 7.4278F, -4.7955F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.7F, AnimationHelper.createTranslationalVector(0.0F, -0.4F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.7F, AnimationHelper.createTranslationalVector(0.0F, -0.4F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineBottomEnd", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hips", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.7F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hips", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.799F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(-37.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(-37.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(-35.0515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.7F, AnimationHelper.createRotationalVector(-27.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.7F, AnimationHelper.createRotationalVector(-27.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.7F, AnimationHelper.createTranslationalVector(-1.147F, -0.4633F, 1.3739F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.7F, AnimationHelper.createTranslationalVector(-1.147F, -0.4633F, 1.3739F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftMid", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(67.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(67.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(76.0468F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.7F, AnimationHelper.createRotationalVector(57.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.7F, AnimationHelper.createRotationalVector(57.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(-61.6649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(-61.6649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(-68.5197F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.7F, AnimationHelper.createRotationalVector(-64.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.7F, AnimationHelper.createRotationalVector(-64.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofLeft", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(-25.6157F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(-25.6157F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.7F, AnimationHelper.createRotationalVector(-38.9588F, 10.5985F, 4.5638F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.7F, AnimationHelper.createRotationalVector(-38.9588F, 10.5985F, 4.5638F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightMid", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(57.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(57.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.7F, AnimationHelper.createRotationalVector(57.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.7F, AnimationHelper.createRotationalVector(57.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(-74.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(-74.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.7F, AnimationHelper.createRotationalVector(-69.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.7F, AnimationHelper.createRotationalVector(-69.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.7F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.7F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.2533F, 5.3516F, -1.5833F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(33.3334F, -12.34F, -10.9664F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(38.3334F, -12.34F, -10.9664F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(35.2084F, -12.34F, -10.9664F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createRotationalVector(-12.4513F, 12.7414F, -2.8815F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-16.3728F, 17.599F, -4.1091F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(-16.3728F, 17.599F, -4.1091F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.7F, AnimationHelper.createRotationalVector(16.0433F, -18.4734F, 6.3145F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.35F, AnimationHelper.createRotationalVector(21.0433F, -18.4734F, 6.3145F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.7F, AnimationHelper.createRotationalVector(21.0433F, -18.4734F, 6.3145F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createRotationalVector(10.2533F, 5.3516F, -1.5833F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.45F, AnimationHelper.createRotationalVector(10.7179F, 17.6445F, 0.7337F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.6F, AnimationHelper.createRotationalVector(10.8132F, 18.7349F, 0.9647F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.7F, AnimationHelper.createRotationalVector(10.8711F, -19.2593F, -6.1665F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.5F, AnimationHelper.createRotationalVector(0.0F, -10.0F, 2.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createRotationalVector(10.2533F, -4.6484F, 0.9167F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(27.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.6F, AnimationHelper.createRotationalVector(14.9011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-34.344F, -6.5042F, 8.5351F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.85F, AnimationHelper.createRotationalVector(-29.4715F, 7.9698F, -1.3284F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.7F, AnimationHelper.createRotationalVector(-29.47F, 7.97F, -1.33F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createRotationalVector(-4.6283F, -16.9537F, 0.6433F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.6F, AnimationHelper.createRotationalVector(-26.4863F, -13.7139F, 7.6586F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createRotationalVector(-34.344F, -1.5042F, 3.5351F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.7F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("jaw", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.3F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.35F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.45F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.3F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.8F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.3F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("jaw", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 2.0274F, -0.2156F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 3.03F, -0.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.3F, AnimationHelper.createTranslationalVector(0.0F, 3.03F, -0.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.35F, AnimationHelper.createTranslationalVector(0.0F, 1.03F, -0.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.45F, AnimationHelper.createTranslationalVector(0.0F, 1.03F, -0.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.3F, AnimationHelper.createTranslationalVector(0.0F, 1.03F, -0.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.8F, AnimationHelper.createTranslationalVector(0.0F, 3.03F, -0.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.3F, AnimationHelper.createTranslationalVector(0.0F, 3.03F, -0.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createTranslationalVector(0.0F, 2.0274F, -0.2156F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("torso", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0436F, -0.5101F, 0.8282F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createRotationalVector(0.0436F, -0.5101F, 0.8282F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("torso", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.799F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(8.7685F, 16.9416F, -51.2783F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(-21.3377F, 0.9083F, -15.1628F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-21.3377F, 0.9083F, -15.1628F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(-26.3377F, 0.9083F, -15.1628F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(-149.0975F, -25.7013F, 20.1036F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(-151.5975F, -25.7013F, 20.1036F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.85F, AnimationHelper.createRotationalVector(-79.3689F, 3.1254F, 6.6953F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.7F, AnimationHelper.createRotationalVector(-79.37F, 3.13F, 6.7F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createRotationalVector(-31.9417F, -2.1649F, -1.7865F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.45F, AnimationHelper.createRotationalVector(-41.1961F, 10.6219F, -59.5705F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.6F, AnimationHelper.createRotationalVector(-54.4669F, 17.5971F, -63.919F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.7F, AnimationHelper.createRotationalVector(22.1534F, -0.766F, -49.7546F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.9F, AnimationHelper.createRotationalVector(32.1534F, -0.766F, -49.7546F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createRotationalVector(19.6105F, -11.1734F, -8.7325F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.7F, AnimationHelper.createTranslationalVector(-0.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createTranslationalVector(-0.7F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-67.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(-52.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(-61.25F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(-65.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.85F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.45F, AnimationHelper.createRotationalVector(-72.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.6F, AnimationHelper.createRotationalVector(-85.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.7F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.9F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createRotationalVector(-40.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hand", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-16.8502F, -3.6311F, -62.5178F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(-18.5419F, 17.099F, -71.6623F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(-10.1382F, 22.3948F, -62.2644F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(-10.1382F, 22.3948F, -62.2644F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.65F, AnimationHelper.createRotationalVector(-26.5291F, 8.7483F, -23.0854F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.85F, AnimationHelper.createRotationalVector(18.4709F, 8.7483F, -23.0854F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createRotationalVector(9.1323F, 13.2162F, -45.5604F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.9F, AnimationHelper.createRotationalVector(1.01F, 7.95F, -50.86F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.15F, AnimationHelper.createRotationalVector(1.6249F, 5.9453F, 1.1495F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hand", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-18.1429F, 15.2099F, 30.0306F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.65F, AnimationHelper.createRotationalVector(-18.14F, 15.21F, 30.03F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.75F, AnimationHelper.createRotationalVector(-14.9F, 7.3203F, 8.5207F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFingerTip1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 80.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 80.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 12.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFinger2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-4.2764F, 5.8539F, 28.3899F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.65F, AnimationHelper.createRotationalVector(-4.28F, 5.85F, 28.39F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.75F, AnimationHelper.createRotationalVector(-6.0205F, 4.0361F, 8.3965F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFingerTip2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 22.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFinger3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.5744F, 6.7089F, 32.3286F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.65F, AnimationHelper.createRotationalVector(9.57F, 6.71F, 32.33F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.75F, AnimationHelper.createRotationalVector(6.7086F, 9.571F, 12.3299F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFinger3", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.2F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFingerTip3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 15.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("thumb", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.776F, -1.0873F, 55.7603F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.65F, AnimationHelper.createRotationalVector(-17.78F, -1.09F, 55.76F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.75F, AnimationHelper.createRotationalVector(-17.7071F, 1.9646F, 65.2835F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createRotationalVector(-82.57F, -67.46F, 90.14F), Transformation.Interpolations.LINEAR)
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
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(7.5F, 2.5F, 5.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.65F, AnimationHelper.createRotationalVector(32.5F, 2.5F, 5.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.85F, AnimationHelper.createRotationalVector(44.7356F, 6.0285F, 1.447F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.7F, AnimationHelper.createRotationalVector(44.7356F, 6.0285F, 1.447F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.9F, AnimationHelper.createRotationalVector(18.5621F, -41.048F, 42.3277F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("handle", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.9F, AnimationHelper.createTranslationalVector(-57.9746F, -31.9406F, 15.5801F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("handle", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.7F, AnimationHelper.createScalingVector(1.0F, 1.1F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.9F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chainStart", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.3595F, -8.1485F, 6.1176F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(2.4991F, -10.6342F, 1.9664F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(2.4991F, -10.6342F, 1.9664F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.2F, AnimationHelper.createRotationalVector(-1.8099F, -10.7714F, 24.8697F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createRotationalVector(2.9654F, -10.515F, -0.5739F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(2.9654F, -10.515F, -0.5739F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createRotationalVector(2.9654F, -10.515F, -0.5739F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.6F, AnimationHelper.createRotationalVector(1.0737F, -10.8684F, 9.5969F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.7F, AnimationHelper.createRotationalVector(5.6051F, -9.3875F, -15.7615F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hull", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.649F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.65F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createScalingVector(0.8F, 1.0F, 1.9F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.85F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.899F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.9F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(40.0F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(47.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(40.0F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(50.0F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.7F, AnimationHelper.createRotationalVector(50.0F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.7F, AnimationHelper.createRotationalVector(7.4366F, -0.9762F, 14.9366F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.8F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createTranslationalVector(0.5107F, -0.9928F, 0.06F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createTranslationalVector(0.5107F, -0.9928F, 0.06F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(-55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-67.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(-75.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(-55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.7F, AnimationHelper.createRotationalVector(-55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createTranslationalVector(0.0F, -0.8725F, -1.552F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, -1.3287F, -2.1153F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createTranslationalVector(0.0F, -1.4284F, -2.7527F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createTranslationalVector(0.0F, -1.0492F, -1.9104F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createTranslationalVector(0.0F, -1.0492F, -1.9104F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createTranslationalVector(0.0F, -0.9576F, -1.8717F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.7F, AnimationHelper.createTranslationalVector(0.0F, -0.9576F, -1.8717F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("claw", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createRotationalVector(10.0F, -8.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(10.0F, -8.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger1tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger2tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger3tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
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
							   new Keyframe(2.4F, AnimationHelper.createRotationalVector(143.3477F, -76.203F, -151.0266F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(143.3477F, -76.203F, -151.0266F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.65F, AnimationHelper.createRotationalVector(128.3477F, -76.203F, -151.0266F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.8F, AnimationHelper.createRotationalVector(145.8477F, -76.203F, -151.0266F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.2F, AnimationHelper.createRotationalVector(165.8477F, -76.203F, -151.0266F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.35F, AnimationHelper.createRotationalVector(126.5263F, -58.8168F, -98.7059F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createRotationalVector(135.6892F, -64.4894F, -109.0981F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.4F, AnimationHelper.createRotationalVector(155.6892F, -64.4894F, -109.0981F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.6F, AnimationHelper.createRotationalVector(78.1892F, -64.4894F, -109.0981F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.8F, AnimationHelper.createRotationalVector(88.1892F, -64.4894F, -109.0981F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.95F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.4F, AnimationHelper.createRotationalVector(-7.4718F, 0.6518F, 4.9574F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(-7.4718F, 0.6518F, 4.9574F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.65F, AnimationHelper.createRotationalVector(-17.4718F, 0.6518F, 4.9574F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.8F, AnimationHelper.createRotationalVector(2.5282F, 0.6518F, 4.9574F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.9F, AnimationHelper.createRotationalVector(2.5282F, 0.6518F, 4.9574F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.1F, AnimationHelper.createRotationalVector(-22.4718F, 0.6518F, 4.9574F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.5F, AnimationHelper.createRotationalVector(-12.4718F, 0.6518F, 4.9574F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createRotationalVector(-12.3703F, 1.7279F, 9.8414F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.25F, AnimationHelper.createRotationalVector(9.088F, 1.7279F, 9.8414F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.35F, AnimationHelper.createRotationalVector(9.5047F, 1.7279F, 9.8414F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.5F, AnimationHelper.createRotationalVector(12.6297F, 1.7279F, 9.8414F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.65F, AnimationHelper.createRotationalVector(-29.8703F, 1.7279F, 9.8414F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.8F, AnimationHelper.createRotationalVector(-7.3703F, 1.7279F, 9.8414F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain2", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(1.1F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.2F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.95F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.4F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.65F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.8F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.9F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.1F, AnimationHelper.createRotationalVector(-38.1658F, 9.8874F, -7.6861F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.5F, AnimationHelper.createRotationalVector(-5.6658F, 9.8874F, -7.6861F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.85F, AnimationHelper.createRotationalVector(-5.13F, 11.36F, -5.26F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createRotationalVector(-12.1008F, 12.8249F, -2.836F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.25F, AnimationHelper.createRotationalVector(-10.0174F, 12.8249F, -2.836F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.35F, AnimationHelper.createRotationalVector(9.1492F, 12.8249F, -2.836F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.45F, AnimationHelper.createRotationalVector(30.3992F, 12.8249F, -2.836F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.65F, AnimationHelper.createRotationalVector(-17.1008F, 12.8249F, -2.836F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.8F, AnimationHelper.createRotationalVector(-14.6008F, 12.8249F, -2.836F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain3", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(1.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain4", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.85F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.4F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.65F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.8F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.9F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.1F, AnimationHelper.createRotationalVector(-38.8189F, 13.8019F, -10.8653F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.5F, AnimationHelper.createRotationalVector(-53.8189F, 13.8019F, -10.8653F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.7F, AnimationHelper.createRotationalVector(-53.8189F, 13.8019F, -10.8653F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.9F, AnimationHelper.createRotationalVector(-55.2424F, -18.8374F, -22.4858F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.05F, AnimationHelper.createRotationalVector(-57.4168F, -5.1806F, -11.5894F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.25F, AnimationHelper.createRotationalVector(-48.6493F, 13.0285F, 2.9391F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.35F, AnimationHelper.createRotationalVector(7.0382F, 13.0285F, 2.9391F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.4F, AnimationHelper.createRotationalVector(19.1632F, 13.0285F, 2.9391F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.55F, AnimationHelper.createRotationalVector(-1.1493F, 13.0285F, 2.9391F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.75F, AnimationHelper.createRotationalVector(-31.1493F, 13.0285F, 2.9391F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.8F, AnimationHelper.createRotationalVector(-23.6493F, 13.0285F, 2.9391F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain4", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain5", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.1F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(-14.9375F, -1.5018F, -4.7697F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.65F, AnimationHelper.createRotationalVector(-19.9375F, -1.5018F, -4.7697F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.8F, AnimationHelper.createRotationalVector(-32.4375F, -1.5018F, -4.7697F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.9F, AnimationHelper.createRotationalVector(-32.4375F, -1.5018F, -4.7697F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.1F, AnimationHelper.createRotationalVector(-27.4375F, -1.5018F, -4.7697F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.2F, AnimationHelper.createRotationalVector(-32.4375F, -1.5018F, -4.7697F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.4F, AnimationHelper.createRotationalVector(-7.4375F, -1.5018F, -4.7697F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.55F, AnimationHelper.createRotationalVector(-43.831F, -1.5215F, -5.2382F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.75F, AnimationHelper.createRotationalVector(-22.0352F, -1.5477F, -5.8629F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.9F, AnimationHelper.createRotationalVector(0.0991F, -5.8057F, -15.2322F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.05F, AnimationHelper.createRotationalVector(-3.39F, -5.12F, -15.39F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createRotationalVector(-8.5369F, -15.3195F, -25.8836F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.25F, AnimationHelper.createRotationalVector(-7.1326F, -15.0667F, -30.2347F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.3F, AnimationHelper.createRotationalVector(-28.8247F, -18.4068F, -22.4275F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.35F, AnimationHelper.createRotationalVector(-15.8942F, -5.125F, -15.3874F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.45F, AnimationHelper.createRotationalVector(22.2186F, -2.5906F, -8.2978F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.6F, AnimationHelper.createRotationalVector(2.9F, -6.75F, -10.02F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.65F, AnimationHelper.createRotationalVector(-19.779F, -12.4385F, -9.4752F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.8F, AnimationHelper.createRotationalVector(-14.779F, -12.4385F, -9.4752F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain5", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(1.45F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.85F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain6", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(1.9F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.2F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(-15.3453F, 14.7669F, -2.664F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.65F, AnimationHelper.createRotationalVector(-15.3453F, 14.7669F, -2.664F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.1F, AnimationHelper.createRotationalVector(-30.3453F, 14.7669F, -2.664F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.2F, AnimationHelper.createRotationalVector(-37.8453F, 14.7669F, -2.664F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.4F, AnimationHelper.createRotationalVector(-23.5668F, 31.3197F, 27.9537F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.65F, AnimationHelper.createRotationalVector(-33.5271F, 14.7669F, -2.664F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.9F, AnimationHelper.createRotationalVector(-2.1113F, 5.6975F, 11.3637F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.05F, AnimationHelper.createRotationalVector(2.03F, 14.32F, -18.11F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.2F, AnimationHelper.createRotationalVector(1.405F, 14.32F, -18.11F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.25F, AnimationHelper.createRotationalVector(-20.47F, 14.32F, -18.11F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.3F, AnimationHelper.createRotationalVector(-26.4611F, 22.2332F, 3.8423F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.35F, AnimationHelper.createRotationalVector(-44.4594F, 12.3855F, -14.4271F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.4F, AnimationHelper.createRotationalVector(6.0487F, 15.2656F, -11.7107F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.45F, AnimationHelper.createRotationalVector(15.8229F, 15.1149F, -7.8265F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.6F, AnimationHelper.createRotationalVector(-4.18F, 15.11F, -7.83F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.65F, AnimationHelper.createRotationalVector(-31.6303F, 15.0353F, 0.5262F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.8F, AnimationHelper.createRotationalVector(-26.6303F, 15.0353F, 0.5262F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain6", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(1.85F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.1F, AnimationHelper.createTranslationalVector(0.0F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .build();
	}
	
	static Animation initPhaseTransitionAnim()
	{
		return Animation.Builder.create(18.0F)
				.addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.1F, AnimationHelper.createRotationalVector(12.5F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createRotationalVector(12.5F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createRotationalVector(12.5F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.45F, AnimationHelper.createRotationalVector(12.5F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.7F, AnimationHelper.createRotationalVector(12.5F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.2F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.45F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.05F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 12.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.3F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 14.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 15.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 15.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 15.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.45F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 15.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.7F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 15.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.2F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.45F, AnimationHelper.createTranslationalVector(0.0F, -2.1F, -4.1F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, -2.1F, -4.1F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.3F, AnimationHelper.createRotationalVector(19.57F, 2.44F, 2.3F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createRotationalVector(19.57F, 2.44F, 2.3F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createRotationalVector(19.57F, 2.44F, 2.3F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.45F, AnimationHelper.createRotationalVector(19.57F, 2.44F, 2.3F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.7F, AnimationHelper.createRotationalVector(19.57F, 2.44F, 2.3F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.2F, AnimationHelper.createRotationalVector(4.5739F, -7.5562F, -5.1971F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.45F, AnimationHelper.createRotationalVector(4.57F, -15.06F, -5.2F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.6F, AnimationHelper.createRotationalVector(4.57F, -15.06F, -5.2F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(4.57F, -15.06F, -5.2F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.5F, AnimationHelper.createRotationalVector(4.6084F, 7.4278F, -4.7955F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.85F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.6F, AnimationHelper.createRotationalVector(4.57F, -7.56F, -5.2F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(4.57F, -7.56F, -5.2F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.0F, AnimationHelper.createRotationalVector(12.07F, -7.56F, -5.2F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(12.07F, -7.56F, -5.2F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.1F, AnimationHelper.createTranslationalVector(0.0F, -11.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, -11.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createTranslationalVector(0.0F, -11.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.45F, AnimationHelper.createTranslationalVector(0.0F, -11.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.7F, AnimationHelper.createTranslationalVector(0.0F, -11.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.75F, AnimationHelper.createTranslationalVector(-0.4F, -9.59F, 0.84F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.8F, AnimationHelper.createTranslationalVector(-0.8F, -8.19F, 1.47F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.85F, AnimationHelper.createTranslationalVector(-1.1F, -6.79F, 1.95F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.9F, AnimationHelper.createTranslationalVector(-1.4F, -5.52F, 2.1F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.95F, AnimationHelper.createTranslationalVector(-1.75F, -4.275F, 2.1F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.0F, AnimationHelper.createTranslationalVector(-1.8F, -3.084F, 2.0335F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.05F, AnimationHelper.createTranslationalVector(-1.9F, -2.01F, 1.793F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.1F, AnimationHelper.createTranslationalVector(-2.0F, -1.08F, 1.405F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.15F, AnimationHelper.createTranslationalVector(-2.0F, -0.3F, 0.9F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.2F, AnimationHelper.createTranslationalVector(-2.0F, 0.3F, 0.4F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.45F, AnimationHelper.createTranslationalVector(-2.6F, -0.1F, -0.3F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.6F, AnimationHelper.createTranslationalVector(-2.6F, -0.1F, -0.3F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createTranslationalVector(-2.6F, -0.1F, -0.3F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("spineBottomEnd", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("hips", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.3F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, -5.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.7F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, -5.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.95F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("hips", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(3.999F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.049F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.999F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.05F, AnimationHelper.createRotationalVector(-65.05F, -9.69F, -0.27F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.1F, AnimationHelper.createRotationalVector(-82.55F, -9.69F, -0.27F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.3F, AnimationHelper.createRotationalVector(-82.55F, -9.69F, -0.27F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.5F, AnimationHelper.createRotationalVector(-82.55F, -9.69F, -0.27F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createRotationalVector(-82.55F, -9.69F, -0.27F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createRotationalVector(-82.55F, -9.69F, -0.27F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.45F, AnimationHelper.createRotationalVector(-82.55F, -9.69F, -0.27F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.7F, AnimationHelper.createRotationalVector(-82.55F, -9.69F, -0.27F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.2F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.45F, AnimationHelper.createRotationalVector(-12.55F, -9.69F, -0.27F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(-12.55F, -9.69F, -0.27F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(-17.55F, -9.69F, -0.27F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.0F, AnimationHelper.createRotationalVector(-32.55F, -9.69F, -0.27F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(-32.55F, -9.69F, -0.27F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.2F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legLeftMid", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(65.16F, 1.05F, 5.49F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.05F, AnimationHelper.createRotationalVector(63.91F, 1.05F, 5.49F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.1F, AnimationHelper.createRotationalVector(80.16F, 1.05F, 5.49F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.3F, AnimationHelper.createRotationalVector(77.66F, 1.05F, 5.49F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.5F, AnimationHelper.createRotationalVector(75.16F, 1.05F, 5.49F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createRotationalVector(75.16F, 1.05F, 5.49F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createRotationalVector(75.16F, 1.05F, 5.49F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.45F, AnimationHelper.createRotationalVector(75.16F, 1.05F, 5.49F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.7F, AnimationHelper.createRotationalVector(75.16F, 1.05F, 5.49F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.2F, AnimationHelper.createRotationalVector(50.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.45F, AnimationHelper.createRotationalVector(60.66F, 1.05F, 5.49F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(60.66F, 1.05F, 5.49F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.0F, AnimationHelper.createRotationalVector(60.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(60.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(65.16F, 1.05F, 5.49F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(65.16F, 1.05F, 5.49F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legLeftBottom", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-72.91F, -1.37F, 0.96F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.05F, AnimationHelper.createRotationalVector(-67.28F, -1.37F, 0.96F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.1F, AnimationHelper.createRotationalVector(-84.16F, -1.37F, 0.96F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.3F, AnimationHelper.createRotationalVector(-76.66F, -1.37F, 0.96F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.5F, AnimationHelper.createRotationalVector(-76.66F, -1.37F, 0.96F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createRotationalVector(-76.66F, -1.37F, 0.96F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createRotationalVector(-76.66F, -1.37F, 0.96F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.45F, AnimationHelper.createRotationalVector(-76.66F, -1.37F, 0.96F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.7F, AnimationHelper.createRotationalVector(-76.66F, -1.37F, 0.96F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.2F, AnimationHelper.createRotationalVector(-54.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.45F, AnimationHelper.createRotationalVector(-61.6125F, -1.585F, 1.4628F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(-61.61F, -1.58F, 1.46F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.0F, AnimationHelper.createRotationalVector(-64.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(-64.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(-72.91F, -1.37F, 0.96F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-72.91F, -1.37F, 0.96F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("hoofLeft", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(18.75F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.05F, AnimationHelper.createRotationalVector(48.13F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.1F, AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.3F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.45F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.7F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.2F, AnimationHelper.createRotationalVector(14.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.45F, AnimationHelper.createRotationalVector(17.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(17.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.0F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(18.75F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(18.75F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(15.01F, 6.21F, 4.81F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.1F, AnimationHelper.createRotationalVector(34.38F, 3.71F, 3.56F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.3F, AnimationHelper.createRotationalVector(29.38F, 3.71F, 3.56F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createRotationalVector(29.38F, 3.71F, 3.56F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createRotationalVector(29.38F, 3.71F, 3.56F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.45F, AnimationHelper.createRotationalVector(29.38F, 3.71F, 3.56F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.7F, AnimationHelper.createRotationalVector(29.38F, 3.71F, 3.56F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.3F, AnimationHelper.createRotationalVector(-43.12F, 3.71F, 3.56F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.45F, AnimationHelper.createRotationalVector(-40.62F, 3.71F, 3.56F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(-40.62F, 3.71F, 3.56F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(9.38F, 13.71F, 8.56F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.0F, AnimationHelper.createRotationalVector(-10.62F, 13.71F, 8.56F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(-10.62F, 13.71F, 8.56F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(15.01F, 6.21F, 4.81F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(15.01F, 6.21F, 4.81F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legRightMid", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(42.24F, -4.54F, 0.63F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.1F, AnimationHelper.createRotationalVector(47.24F, -2.04F, 0.63F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.3F, AnimationHelper.createRotationalVector(57.24F, -2.04F, 0.63F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createRotationalVector(57.24F, -2.04F, 0.63F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createRotationalVector(57.24F, -2.04F, 0.63F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.45F, AnimationHelper.createRotationalVector(57.24F, -2.04F, 0.63F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.7F, AnimationHelper.createRotationalVector(57.24F, -2.04F, 0.63F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.3F, AnimationHelper.createRotationalVector(57.24F, -2.04F, 0.63F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.45F, AnimationHelper.createRotationalVector(69.74F, -2.04F, 0.63F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(69.74F, -2.04F, 0.63F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(42.24F, -7.04F, 0.63F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(42.24F, -7.04F, 0.63F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.0F, AnimationHelper.createRotationalVector(57.8154F, -7.1316F, -0.7371F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(57.8154F, -7.1316F, -0.7371F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(42.24F, -4.54F, 0.63F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(42.24F, -4.54F, 0.63F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-75.56F, -3.03F, 0.54F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.1F, AnimationHelper.createRotationalVector(-86.81F, -3.03F, 0.54F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.3F, AnimationHelper.createRotationalVector(-81.81F, -3.03F, 0.54F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.5F, AnimationHelper.createRotationalVector(-79.31F, -3.03F, 0.54F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createRotationalVector(-79.31F, -3.03F, 0.54F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createRotationalVector(-79.31F, -3.03F, 0.54F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.45F, AnimationHelper.createRotationalVector(-79.31F, -3.03F, 0.54F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.7F, AnimationHelper.createRotationalVector(-79.31F, -3.03F, 0.54F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.3F, AnimationHelper.createRotationalVector(-64.31F, -3.03F, 0.54F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.45F, AnimationHelper.createRotationalVector(-51.81F, -3.03F, 0.54F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(-51.81F, -3.03F, 0.54F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(-69.31F, -3.03F, 0.54F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(-69.31F, -3.03F, 0.54F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.0F, AnimationHelper.createRotationalVector(-74.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(-74.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(-75.56F, -3.03F, 0.54F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-75.56F, -3.03F, 0.54F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(11.25F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.1F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.45F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.7F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.3F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.45F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(11.25F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(11.25F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.2533F, 5.3516F, -1.5833F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.1F, AnimationHelper.createRotationalVector(30.25F, 10.35F, -1.58F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.2F, AnimationHelper.createRotationalVector(35.25F, 10.35F, -1.58F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.35F, AnimationHelper.createRotationalVector(35.25F, 15.35F, -1.58F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createRotationalVector(35.25F, 15.35F, -1.58F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createRotationalVector(35.25F, 15.35F, -1.58F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.25F, AnimationHelper.createRotationalVector(20.25F, 15.35F, -1.58F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.35F, AnimationHelper.createRotationalVector(20.25F, 15.35F, -1.58F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.45F, AnimationHelper.createRotationalVector(20.25F, 15.35F, -1.58F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.7F, AnimationHelper.createRotationalVector(20.25F, 15.35F, -1.58F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.2F, AnimationHelper.createRotationalVector(7.75F, 5.35F, 3.42F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(10.25F, 5.35F, 3.42F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(20.25F, 5.35F, -1.58F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.3F, AnimationHelper.createRotationalVector(10.2533F, 5.3516F, -1.5833F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.0F, AnimationHelper.createRotationalVector(10.25F, 5.35F, -1.58F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.25F, AnimationHelper.createRotationalVector(10.5364F, -14.3283F, -5.1816F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.35F, AnimationHelper.createRotationalVector(10.655F, -16.4474F, -5.5962F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.5F, AnimationHelper.createRotationalVector(10.972F, 21.0116F, 1.4287F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.85F, AnimationHelper.createRotationalVector(10.972F, 21.0116F, 1.4287F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.1F, AnimationHelper.createRotationalVector(10.25F, -9.65F, -1.58F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(15.25F, -9.65F, -1.58F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.05F, AnimationHelper.createRotationalVector(30.25F, -9.65F, -1.58F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(32.75F, -9.65F, -1.58F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(-20.6349F, -19.0385F, 1.9789F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.55F, AnimationHelper.createRotationalVector(-21.3362F, -23.7073F, 3.9013F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.0F, AnimationHelper.createRotationalVector(-20.3033F, 16.2452F, -10.9333F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.25F, AnimationHelper.createRotationalVector(-20.8952F, 20.9259F, -12.7887F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createRotationalVector(17.0445F, 1.0082F, -0.66F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.65F, AnimationHelper.createRotationalVector(17.21F, 2.46F, -0.77F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.75F, AnimationHelper.createRotationalVector(17.8684F, 8.2642F, -1.2327F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.9F, AnimationHelper.createRotationalVector(22.8684F, 8.2642F, -1.2327F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(17.8684F, 8.2642F, -1.2327F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("spineTop", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.4F, AnimationHelper.createRotationalVector(37.4F, -2.68F, 4.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createRotationalVector(39.9011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.35F, AnimationHelper.createRotationalVector(29.9F, -2.68F, 4.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.55F, AnimationHelper.createRotationalVector(29.9F, -2.68F, 4.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.9F, AnimationHelper.createRotationalVector(22.4F, -2.68F, 4.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(22.4F, -2.68F, 4.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(37.4F, -2.68F, 4.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.0F, AnimationHelper.createRotationalVector(44.9F, -2.68F, 4.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(44.9F, -2.68F, 4.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(11.8384F, -15.4227F, 4.0638F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.55F, AnimationHelper.createRotationalVector(11.8384F, -15.4227F, 4.0638F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.8F, AnimationHelper.createRotationalVector(9.3294F, 11.3486F, -3.39F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.85F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-34.344F, -6.5042F, 8.5351F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.3F, AnimationHelper.createRotationalVector(-19.34F, -6.5F, 8.54F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.45F, AnimationHelper.createRotationalVector(-24.34F, -6.5F, 8.54F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createRotationalVector(-24.34F, -6.5F, 8.54F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.0F, AnimationHelper.createRotationalVector(-24.34F, -6.5F, 8.54F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.3F, AnimationHelper.createRotationalVector(-74.34F, -14.0F, 11.04F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.45F, AnimationHelper.createRotationalVector(-71.84F, -14.0F, 11.04F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.7F, AnimationHelper.createRotationalVector(-71.84F, -14.0F, 11.04F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.9F, AnimationHelper.createRotationalVector(-34.34F, -9.0F, 6.04F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.2F, AnimationHelper.createRotationalVector(-29.34F, -1.5F, -3.96F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(-19.34F, -1.5F, -3.96F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(-34.344F, -6.5042F, 8.5351F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.0F, AnimationHelper.createRotationalVector(-34.344F, -6.5042F, 8.5351F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.25F, AnimationHelper.createRotationalVector(-34.0326F, 7.9648F, -1.3017F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.35F, AnimationHelper.createRotationalVector(-34.2548F, 10.0339F, -2.7223F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.5F, AnimationHelper.createRotationalVector(-35.602F, -17.4772F, 16.1923F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.85F, AnimationHelper.createRotationalVector(-35.602F, -17.4772F, 16.1923F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.6F, AnimationHelper.createRotationalVector(-29.34F, 3.5F, 1.04F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(-29.34F, 3.5F, 1.04F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.05F, AnimationHelper.createRotationalVector(-9.34F, 3.5F, 1.04F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(-6.84F, 3.5F, 1.04F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.4F, AnimationHelper.createRotationalVector(-39.34F, 3.5F, 1.04F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.45F, AnimationHelper.createRotationalVector(-41.84F, 3.5F, 1.04F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.55F, AnimationHelper.createRotationalVector(-29.34F, 3.5F, 1.04F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.7F, AnimationHelper.createRotationalVector(-34.344F, -6.5042F, 21.0351F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.8F, AnimationHelper.createRotationalVector(-31.844F, -6.5042F, 21.0351F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.9F, AnimationHelper.createRotationalVector(-34.344F, -6.5042F, 21.0351F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-34.344F, -6.5042F, 21.0351F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("jaw", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.1F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.45F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.75F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.25F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.75F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(3.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.4F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.45F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.5F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.55F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.6F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.65F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.7F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.75F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.8F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.85F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.9F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.95F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.05F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.1F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.15F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.2F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.25F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.75F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.85F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("jaw", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 2.0274F, -0.2156F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.1F, AnimationHelper.createTranslationalVector(0.0F, 3.03F, -0.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.45F, AnimationHelper.createTranslationalVector(0.0F, 3.03F, -0.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, 2.8274F, -0.2156F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.2F, AnimationHelper.createTranslationalVector(0.0F, 3.03F, -0.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.65F, AnimationHelper.createTranslationalVector(0.0F, 3.03F, -0.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.25F, AnimationHelper.createTranslationalVector(0.0F, 2.0274F, -0.2156F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.75F, AnimationHelper.createTranslationalVector(0.0F, 2.0274F, -0.2156F), Transformation.Interpolations.LINEAR),
						new Keyframe(3.25F, AnimationHelper.createTranslationalVector(0.0F, 3.03F, -0.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, 3.03F, -0.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createTranslationalVector(0.0F, 3.03F, -0.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createTranslationalVector(0.0F, 1.03F, -0.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.75F, AnimationHelper.createTranslationalVector(0.0F, 2.03F, -0.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(0.0F, 2.03F, -0.22F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("torso", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.01F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.01F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftArm", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-21.2315F, -5.5584F, -11.2783F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.1F, AnimationHelper.createRotationalVector(-68.73F, -13.06F, 1.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.2F, AnimationHelper.createRotationalVector(-68.73F, -13.06F, 1.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.35F, AnimationHelper.createRotationalVector(-68.73F, -15.56F, 6.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.5F, AnimationHelper.createRotationalVector(-71.23F, -15.56F, 6.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createRotationalVector(-71.23F, -15.56F, 6.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createRotationalVector(-71.23F, -15.56F, 6.22F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.25F, AnimationHelper.createRotationalVector(-38.73F, -15.56F, -11.28F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.7F, AnimationHelper.createRotationalVector(-38.73F, -15.56F, -11.28F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.95F, AnimationHelper.createRotationalVector(-11.23F, -0.56F, -8.78F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.25F, AnimationHelper.createRotationalVector(1.27F, -0.56F, -8.78F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(1.27F, -0.56F, -8.78F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(4.61F, -11.17F, -8.73F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.3F, AnimationHelper.createRotationalVector(19.6105F, -11.1734F, -8.7325F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.0F, AnimationHelper.createRotationalVector(19.6105F, -11.1734F, -8.7325F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.25F, AnimationHelper.createRotationalVector(49.61F, -11.17F, -8.73F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.35F, AnimationHelper.createRotationalVector(52.11F, -11.17F, -8.73F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.5F, AnimationHelper.createRotationalVector(-45.7346F, -23.6782F, 0.334F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.5F, AnimationHelper.createRotationalVector(-52.89F, -11.17F, -8.73F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.6F, AnimationHelper.createRotationalVector(-47.89F, -11.17F, -8.73F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.75F, AnimationHelper.createRotationalVector(-45.39F, -11.17F, -8.73F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.85F, AnimationHelper.createRotationalVector(-42.89F, -11.17F, -8.73F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.35F, AnimationHelper.createRotationalVector(34.61F, -11.17F, -8.73F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(39.61F, -11.17F, -8.73F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.0F, AnimationHelper.createRotationalVector(-66.1888F, 58.2035F, -44.6516F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(-68.6888F, 58.2035F, -44.6516F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.4F, AnimationHelper.createRotationalVector(44.9236F, -1.6743F, -10.2205F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.75F, AnimationHelper.createRotationalVector(49.9236F, -1.6743F, -10.2205F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.25F, AnimationHelper.createRotationalVector(49.9236F, -1.6743F, -10.2205F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createRotationalVector(-1.8486F, -2.4544F, -30.2186F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(19.6105F, -11.1734F, -8.7325F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftArm", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-0.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createTranslationalVector(-0.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createTranslationalVector(-0.2F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.0F, AnimationHelper.createTranslationalVector(-0.2F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.25F, AnimationHelper.createTranslationalVector(-0.2F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.35F, AnimationHelper.createTranslationalVector(-0.2F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.0F, AnimationHelper.createTranslationalVector(-0.2F, 0.0F, -1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createTranslationalVector(-0.2F, 0.0F, -1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.4F, AnimationHelper.createTranslationalVector(-0.4F, 0.0F, -1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createTranslationalVector(-0.4F, 0.0F, -1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(-0.2F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-47.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.1F, AnimationHelper.createRotationalVector(-25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.15F, AnimationHelper.createRotationalVector(-24.37F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.35F, AnimationHelper.createRotationalVector(-29.37F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.5F, AnimationHelper.createRotationalVector(-27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createRotationalVector(-27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createRotationalVector(-27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.25F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.7F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.95F, AnimationHelper.createRotationalVector(-15.42F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.25F, AnimationHelper.createRotationalVector(-27.92F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(-32.92F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(-40.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.25F, AnimationHelper.createRotationalVector(-75.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.35F, AnimationHelper.createRotationalVector(-72.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.45F, AnimationHelper.createRotationalVector(-70.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.5F, AnimationHelper.createRotationalVector(-42.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.5F, AnimationHelper.createRotationalVector(-50.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.6F, AnimationHelper.createRotationalVector(-55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.75F, AnimationHelper.createRotationalVector(-60.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.85F, AnimationHelper.createRotationalVector(-62.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(12.35F, AnimationHelper.createRotationalVector(-85.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.0F, AnimationHelper.createRotationalVector(-80.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(-80.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.4F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.75F, AnimationHelper.createRotationalVector(-27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createRotationalVector(-27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-40.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("hand", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-26.8502F, 16.3689F, -32.5178F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.15F, AnimationHelper.createRotationalVector(-26.85F, 46.37F, -32.52F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.2F, AnimationHelper.createRotationalVector(-35.18F, 51.37F, -45.85F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.3F, AnimationHelper.createRotationalVector(-59.35F, 38.87F, -72.52F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.9F, AnimationHelper.createRotationalVector(-59.35F, 38.87F, -72.52F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.25F, AnimationHelper.createRotationalVector(-59.35F, 76.37F, -57.52F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(-59.35F, 76.37F, -57.52F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(1.62F, 5.95F, 1.15F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.0F, AnimationHelper.createRotationalVector(1.62F, 5.95F, 1.15F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.25F, AnimationHelper.createRotationalVector(25.0383F, -86.1906F, -24.0077F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.5F, AnimationHelper.createRotationalVector(1.62F, -111.55F, 1.15F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.5F, AnimationHelper.createRotationalVector(-151.6265F, -73.911F, 152.4587F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.6F, AnimationHelper.createRotationalVector(-116.4858F, -56.8556F, 114.4458F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(-116.4858F, -56.8556F, 114.4458F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.0F, AnimationHelper.createRotationalVector(-29.4444F, -5.4363F, -3.2498F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(-29.4444F, -5.4363F, -3.2498F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.45F, AnimationHelper.createRotationalVector(-116.4858F, -56.8556F, 114.4458F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.15F, AnimationHelper.createRotationalVector(-116.4858F, -56.8556F, 114.4458F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.3F, AnimationHelper.createRotationalVector(-42.3875F, -54.2552F, 29.7495F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createRotationalVector(-26.8502F, 16.3689F, -32.5178F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-26.8502F, 16.3689F, -32.5178F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("hand", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.25F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-18.1429F, 15.2099F, 30.0306F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.15F, AnimationHelper.createRotationalVector(-18.14F, 15.21F, 30.03F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.2F, AnimationHelper.createRotationalVector(-18.14F, 15.21F, 10.03F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(-18.14F, 15.21F, 10.03F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(-14.9F, 7.32F, 8.52F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.05F, AnimationHelper.createRotationalVector(-13.28F, 9.9755F, 19.2109F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.5F, AnimationHelper.createRotationalVector(-11.5614F, 11.944F, 28.265F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.6F, AnimationHelper.createRotationalVector(0.4462F, 9.0584F, 74.4846F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.15F, AnimationHelper.createRotationalVector(0.4462F, 9.0584F, 74.4846F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createRotationalVector(-18.1429F, 15.2099F, 30.0306F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-18.1429F, 15.2099F, 30.0306F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftFingerTip1", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 35.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.15F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 35.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 55.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 55.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 12.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 46.08F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 12.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 40.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.15F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 35.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 35.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftFinger2", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-4.2764F, 5.8539F, 20.8899F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.15F, AnimationHelper.createRotationalVector(-4.28F, 5.85F, 20.89F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.2F, AnimationHelper.createRotationalVector(-4.28F, 5.85F, -9.11F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(-4.28F, 5.85F, -9.11F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(-6.0205F, 4.0361F, 8.3965F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.15F, AnimationHelper.createRotationalVector(-5.0139F, 5.2002F, 20.6213F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.5F, AnimationHelper.createRotationalVector(-6.0205F, 4.0361F, 8.3965F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.4F, AnimationHelper.createRotationalVector(-4.28F, 5.85F, 28.39F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.6F, AnimationHelper.createRotationalVector(1.4329F, 2.1013F, 76.0725F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.15F, AnimationHelper.createRotationalVector(1.4329F, 2.1013F, 76.0725F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createRotationalVector(-4.2764F, 5.8539F, 20.8899F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-4.2764F, 5.8539F, 20.8899F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftFingerTip2", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 45.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.15F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 45.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 62.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 62.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 22.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.15F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 69.74F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 22.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.4F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 52.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 80.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.15F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 80.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 45.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 45.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftFinger3", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.5744F, 6.7089F, 17.3286F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.15F, AnimationHelper.createRotationalVector(9.57F, 6.71F, 17.33F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.2F, AnimationHelper.createRotationalVector(9.57F, 6.71F, -5.17F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(9.57F, 6.71F, -5.17F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(6.7086F, 9.571F, 12.3299F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.25F, AnimationHelper.createRotationalVector(9.2043F, 7.1382F, 29.5777F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.5F, AnimationHelper.createRotationalVector(6.7086F, 9.571F, 12.3299F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.3F, AnimationHelper.createRotationalVector(10.9643F, 4.0213F, 47.1538F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.6F, AnimationHelper.createRotationalVector(8.3704F, 1.0131F, 87.229F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.15F, AnimationHelper.createRotationalVector(8.3704F, 1.0131F, 87.229F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createRotationalVector(9.5744F, 6.7089F, 17.3286F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(9.5744F, 6.7089F, 17.3286F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftFinger3", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.2F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.2F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.2F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.2F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("leftFingerTip3", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 55.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.15F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 55.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 67.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 67.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 15.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 66.79F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 15.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.3F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 50.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 72.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.15F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 72.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 55.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 55.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("thumb", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-27.776F, -11.0873F, 55.7603F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.15F, AnimationHelper.createRotationalVector(-27.78F, -11.09F, 55.76F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.2F, AnimationHelper.createRotationalVector(-27.78F, -11.09F, 43.26F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(-27.78F, -11.09F, 43.26F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(-82.57F, -67.46F, 90.14F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.5F, AnimationHelper.createRotationalVector(-82.57F, -67.46F, 90.14F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.5F, AnimationHelper.createRotationalVector(-126.6825F, -39.3455F, 158.175F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.6F, AnimationHelper.createRotationalVector(-150.0602F, -35.7254F, 183.4385F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.15F, AnimationHelper.createRotationalVector(-150.0602F, -35.7254F, 183.4385F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createRotationalVector(-27.776F, -11.0873F, 55.7603F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-27.776F, -11.0873F, 55.7603F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("thumb", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.5F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.5F, AnimationHelper.createTranslationalVector(1.0F, 0.7F, 0.1F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.6F, AnimationHelper.createTranslationalVector(1.0F, 0.7F, 0.1F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.15F, AnimationHelper.createTranslationalVector(1.0F, 0.7F, 0.1F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("thumbTip", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -27.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.15F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -27.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -52.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -52.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -60.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -75.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.15F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -75.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -27.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -27.5F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("lantern", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-7.97F, 78.88F, 94.59F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("lantern", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(-7.75F, -7.7F, -2.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("lantern", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(18.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("handle", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-5.0F, 2.5F, 5.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("handle", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(18.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("chainStart", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(10.4609F, 0.9101F, -10.9167F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("chain1", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.3F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.25F, AnimationHelper.createRotationalVector(-42.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.45F, AnimationHelper.createRotationalVector(-42.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.7F, AnimationHelper.createRotationalVector(-42.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.95F, AnimationHelper.createRotationalVector(36.7F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.4F, AnimationHelper.createRotationalVector(49.9F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.6F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.7F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.85F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.3F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.25F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.35F, AnimationHelper.createRotationalVector(-22.1522F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.5F, AnimationHelper.createRotationalVector(23.4359F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.85F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.1F, AnimationHelper.createRotationalVector(-67.5F, -47.5F, 32.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(-44.9048F, -36.4413F, 50.8763F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.0F, AnimationHelper.createRotationalVector(-56.4049F, -66.6073F, 67.4287F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(-58.9049F, -66.6073F, 67.4287F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(-7.3337F, -14.4093F, 41.2796F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.55F, AnimationHelper.createRotationalVector(-7.9628F, -14.0765F, 43.8359F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.0F, AnimationHelper.createRotationalVector(34.071F, -20.5906F, 61.6515F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.85F, AnimationHelper.createRotationalVector(56.8933F, 28.842F, 65.0391F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.9F, AnimationHelper.createRotationalVector(47.2947F, 20.3671F, 44.3488F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(47.2947F, 20.3671F, 44.3488F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.5107F, -0.9928F, 0.06F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.51F, -0.99F, 0.06F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createTranslationalVector(0.51F, -0.99F, 0.06F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.51F, -0.99F, 0.06F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createTranslationalVector(0.51F, -0.99F, 0.06F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.85F, AnimationHelper.createTranslationalVector(0.51F, -0.99F, 0.06F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.1F, AnimationHelper.createTranslationalVector(0.51F, -0.99F, -3.94F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.0F, AnimationHelper.createTranslationalVector(0.51F, -0.99F, -3.94F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.85F, AnimationHelper.createTranslationalVector(0.51F, -0.99F, 0.06F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(0.51F, -0.99F, 0.06F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.3F, AnimationHelper.createRotationalVector(-40.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.65F, AnimationHelper.createRotationalVector(-52.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.1F, AnimationHelper.createRotationalVector(-52.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.45F, AnimationHelper.createRotationalVector(-80.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(1.7F, AnimationHelper.createRotationalVector(-80.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.25F, AnimationHelper.createRotationalVector(-46.09F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.5F, AnimationHelper.createRotationalVector(-42.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.6F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.7F, AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(2.85F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.25F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(5.35F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(11.85F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.1F, AnimationHelper.createRotationalVector(-52.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(-87.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.0F, AnimationHelper.createRotationalVector(-92.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(-92.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(-72.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.0F, AnimationHelper.createRotationalVector(-70.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.25F, AnimationHelper.createRotationalVector(-77.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.5F, AnimationHelper.createRotationalVector(-89.5631F, 4.9809F, 5.019F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.75F, AnimationHelper.createRotationalVector(-82.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.85F, AnimationHelper.createRotationalVector(-75.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-75.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.0F, AnimationHelper.createTranslationalVector(0.0F, -1.0F, -1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createTranslationalVector(0.0F, -1.0F, -1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("claw", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-33.6404F, 37.2028F, 8.1506F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(-33.64F, 37.2F, 8.15F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(-12.5F, 15.0F, -14.5F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.05F, AnimationHelper.createRotationalVector(-151.763F, 24.073F, 174.2647F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.1F, AnimationHelper.createRotationalVector(-167.5393F, 14.322F, 171.9128F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(-166.4897F, 26.5053F, 174.9042F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(-166.4897F, 26.5053F, 174.9042F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(-180.4214F, -7.7841F, 168.225F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.55F, AnimationHelper.createRotationalVector(-180.4384F, -17.7838F, 168.3019F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.75F, AnimationHelper.createRotationalVector(-180.5242F, 37.2145F, 167.8509F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.75F, AnimationHelper.createRotationalVector(-57.3705F, 55.304F, 337.1772F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.85F, AnimationHelper.createRotationalVector(-4.493F, 60.3027F, 380.3952F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.9F, AnimationHelper.createRotationalVector(-9.0974F, 70.2578F, 378.0872F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-9.0974F, 70.2578F, 378.0872F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("claw", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.4673F, -1.3712F, -0.605F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.47F, -1.37F, -0.6F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.05F, AnimationHelper.createTranslationalVector(0.47F, -1.37F, -0.6F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.1F, AnimationHelper.createTranslationalVector(0.47F, -1.37F, -1.6F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(0.47F, -1.37F, -1.6F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("claw", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.099F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.1F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.2F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger1", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(23.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(23.22F, -7.58F, 10.09F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(0.0F, 12.5F, 15.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.55F, AnimationHelper.createRotationalVector(60.0F, 12.5F, 15.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(65.0F, 12.5F, 15.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(65.0F, 12.5F, 15.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(23.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.2F, AnimationHelper.createRotationalVector(8.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.25F, AnimationHelper.createRotationalVector(-11.776F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.75F, AnimationHelper.createRotationalVector(-11.776F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.85F, AnimationHelper.createRotationalVector(18.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(18.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger1", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.549F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.55F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.65F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger1tip", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(57.679F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(57.68F, -4.12F, -2.18F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.35F, AnimationHelper.createRotationalVector(70.18F, -4.12F, -2.18F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(72.68F, -4.12F, -2.18F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(72.68F, -4.12F, -2.18F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(50.18F, -4.12F, -2.18F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.2F, AnimationHelper.createRotationalVector(25.18F, -4.12F, -2.18F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.25F, AnimationHelper.createRotationalVector(55.18F, -4.12F, -2.18F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(55.18F, -4.12F, -2.18F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger2", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(17.52F, -2.38F, -3.25F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.0F, AnimationHelper.createRotationalVector(47.5F, 12.5F, 15.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.1F, AnimationHelper.createRotationalVector(56.945F, 14.6263F, -4.8777F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(59.445F, 14.6263F, -4.8777F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(59.44F, 14.63F, -4.88F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(17.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.2F, AnimationHelper.createRotationalVector(10.0157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.25F, AnimationHelper.createRotationalVector(-22.4843F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.75F, AnimationHelper.createRotationalVector(-22.4843F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.85F, AnimationHelper.createRotationalVector(10.0157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(10.0157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger2", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.999F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.1F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger2tip", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(14.7F, AnimationHelper.createRotationalVector(57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(62.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(62.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(27.6945F, -0.8937F, 0.3873F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.2F, AnimationHelper.createRotationalVector(15.1945F, -0.8937F, 0.3873F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.25F, AnimationHelper.createRotationalVector(52.6945F, -0.8937F, 0.3873F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(52.6945F, -0.8937F, 0.3873F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger3", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(46.282F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(46.28F, 3.58F, -8.68F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.35F, AnimationHelper.createRotationalVector(64.141F, 14.7015F, -12.018F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(69.141F, 14.7015F, -12.018F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(69.14F, 14.7F, -12.02F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(11.282F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.2F, AnimationHelper.createRotationalVector(1.282F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.25F, AnimationHelper.createRotationalVector(-41.218F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.75F, AnimationHelper.createRotationalVector(-41.218F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.85F, AnimationHelper.createRotationalVector(26.282F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(26.282F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger3", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.349F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.35F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.45F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("finger3tip", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(47.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(47.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.0F, AnimationHelper.createRotationalVector(75.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(15.75F, AnimationHelper.createRotationalVector(77.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createRotationalVector(77.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(50.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.2F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.25F, AnimationHelper.createRotationalVector(70.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(17.6F, AnimationHelper.createRotationalVector(57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("knife3", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, -2.5F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(0.3F, AnimationHelper.createRotationalVector(9.4215F, 8.7295F, 9.0246F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.0F, AnimationHelper.createRotationalVector(9.42F, 8.73F, 9.02F), Transformation.Interpolations.LINEAR),
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createRotationalVector(-5.0F, -2.5F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-5.0F, -2.5F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("knife3", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.249F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("flame", new Transformation(Transformation.Targets.TRANSLATE,
						new Keyframe(0.0F, AnimationHelper.createTranslationalVector(6.0F, 17.0F, -7.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createTranslationalVector(6.0F, 17.0F, -7.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("flame", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("brokenArmGore1", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.099F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.1F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.2F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("brokenArmGore2", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("brokenArmGore2", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.599F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.6F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(13.7F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("knife1", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("knife1", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.249F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("knife2", new Transformation(Transformation.Targets.ROTATE,
						new Keyframe(4.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
				))
				.addBoneAnimation("knife2", new Transformation(Transformation.Targets.SCALE,
						new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.249F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.25F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(16.35F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
						new Keyframe(18.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
				))
				.build();
	}
	
	static Animation initSimpleClawAttackAnim()
	{
		return Animation.Builder.create(1.8F)
					   .addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.85F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, -12.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.9F, AnimationHelper.createTranslationalVector(0.0F, -1.9F, -17.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createTranslationalVector(0.0F, -1.9F, -17.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(-5.4261F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(-5.4261F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.9F, AnimationHelper.createRotationalVector(-6.1944F, -16.2092F, 7.1126F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(-6.1944F, -16.2092F, 7.1126F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hips", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(4.9485F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(4.9485F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.9F, AnimationHelper.createRotationalVector(32.1603F, 9.6974F, -13.5268F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(32.1603F, 9.6974F, -13.5268F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftMid", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(36.097F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(36.097F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.9F, AnimationHelper.createRotationalVector(25.16F, 1.05F, 5.49F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(25.16F, 1.05F, 5.49F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.2F, AnimationHelper.createRotationalVector(41.8267F, 1.05F, 5.49F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(51.8267F, 1.05F, 5.49F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(-52.41F, -1.37F, 0.96F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(-52.41F, -1.37F, 0.96F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.9F, AnimationHelper.createRotationalVector(-57.91F, -1.37F, 0.96F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(-57.91F, -1.37F, 0.96F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofLeft", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(16.25F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(16.25F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.9F, AnimationHelper.createRotationalVector(8.75F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(8.75F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(9.58F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(32.51F, 6.21F, 4.81F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(-47.6336F, -2.8632F, -0.0798F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(-50.1336F, -2.8632F, -0.0798F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.9F, AnimationHelper.createRotationalVector(-30.7243F, 2.7234F, -4.5926F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(-30.7243F, 2.7234F, -4.5926F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightMid", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(16.1754F, -9.5305F, 8.5872F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.35F, AnimationHelper.createRotationalVector(53.0867F, -8.1047F, 6.3137F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createRotationalVector(67.498F, -6.6788F, 4.0402F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(79.74F, -4.54F, 0.63F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(79.74F, -4.54F, 0.63F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.9F, AnimationHelper.createRotationalVector(59.8446F, -0.2183F, -1.8873F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(59.8446F, -0.2183F, -1.8873F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.2F, AnimationHelper.createRotationalVector(84.74F, -4.54F, 0.63F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(84.74F, -4.54F, 0.63F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(-52.9805F, -1.526F, -1.4586F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createRotationalVector(-67.6688F, -2.3854F, -0.3166F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(-65.56F, -3.03F, 0.54F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(-68.06F, -3.03F, 0.54F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.9F, AnimationHelper.createRotationalVector(-30.5167F, -0.8767F, -0.731F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(-30.5167F, -0.8767F, -0.731F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.2F, AnimationHelper.createRotationalVector(-80.56F, -3.03F, 0.54F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(-80.56F, -3.03F, 0.54F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(6.25F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(6.25F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.8684F, 18.2642F, -3.7327F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(8.8149F, 25.3844F, -1.192F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(4.43F, 29.92F, -0.84F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(3.9951F, 30.3728F, -0.8069F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.9F, AnimationHelper.createRotationalVector(31.41F, -36.15F, -5.62F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(34.8314F, -44.4644F, -6.2177F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(17.8684F, 18.2642F, -3.7327F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createRotationalVector(17.8684F, 18.2642F, -3.7327F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(20.3684F, 18.2642F, -3.7327F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(17.8684F, 18.2642F, -3.7327F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(37.4431F, 1.8777F, -1.7349F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(37.4431F, 1.8777F, -1.7349F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createRotationalVector(37.4431F, 1.8777F, -1.7349F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.6F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-34.344F, -11.5042F, 26.0351F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(-32.5308F, -15.6165F, 28.9616F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.05F, AnimationHelper.createRotationalVector(-32.5308F, -15.6165F, 28.9616F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.2F, AnimationHelper.createRotationalVector(-32.6842F, -7.2718F, 23.3404F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(-34.0842F, -9.4367F, 24.6057F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(-33.8778F, -7.3636F, 23.1933F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.6F, AnimationHelper.createRotationalVector(-31.844F, -11.5042F, 26.0351F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.75F, AnimationHelper.createRotationalVector(-34.344F, -11.5042F, 26.0351F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("jaw", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("jaw", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 2.03F, -0.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createTranslationalVector(0.0F, 3.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.35F, AnimationHelper.createTranslationalVector(0.0F, 3.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createTranslationalVector(0.0F, 1.73F, -0.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createTranslationalVector(0.0F, 2.03F, -0.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createTranslationalVector(0.0F, 2.03F, -0.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createTranslationalVector(0.0F, 1.73F, -0.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createTranslationalVector(0.0F, 2.03F, -0.22F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("torso", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0436F, -0.5101F, 0.8282F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("torso", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.01F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -12.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-0.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chainStart", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.6609F, 0.9101F, -16.9167F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(9.5992F, 0.5767F, -12.8912F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(-4.233F, -0.9293F, 2.1695F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(-4.6327F, -0.3018F, 4.6223F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.85F, AnimationHelper.createRotationalVector(15.3239F, 1.0817F, -28.1569F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.9F, AnimationHelper.createRotationalVector(15.3239F, 1.0817F, -28.1569F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(11.996F, -0.9337F, 9.7349F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(-22.5324F, -28.8634F, 35.7609F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(-12.7296F, 8.6716F, 5.4119F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.6F, AnimationHelper.createRotationalVector(43.7012F, 3.007F, -21.6331F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(17.6609F, 0.9101F, -16.9167F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-0.5F, -9.0F, -1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(-28.6148F, -2.3781F, 27.5107F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(-17.4091F, -4.4166F, 20.6747F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.8F, AnimationHelper.createRotationalVector(-38.0757F, -4.4166F, 20.6747F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.85F, AnimationHelper.createRotationalVector(-38.0757F, -4.4166F, 20.6747F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(16.8025F, -4.5345F, 10.4865F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(12.5168F, -4.5345F, 10.4865F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(-10.6975F, -4.5345F, 10.4865F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(-5.0054F, -5.4137F, -10.3027F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.6F, AnimationHelper.createRotationalVector(-35.6975F, -4.5345F, 10.4865F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.75F, AnimationHelper.createRotationalVector(-0.5F, -9.0F, -1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(47.2947F, 20.3671F, 44.3488F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(37.4799F, -7.0607F, 70.1418F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.35F, AnimationHelper.createRotationalVector(37.8634F, -4.0038F, 66.1661F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createRotationalVector(-38.653F, 75.3681F, 60.7114F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.95F, AnimationHelper.createRotationalVector(-22.8176F, -0.2439F, 30.0425F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.05F, AnimationHelper.createRotationalVector(-22.72F, -2.18F, 25.4313F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.2F, AnimationHelper.createRotationalVector(-22.72F, -2.18F, 25.4313F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(8.1066F, -11.8491F, 87.0155F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(36.3234F, -4.0594F, 78.6741F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.6F, AnimationHelper.createRotationalVector(37.4799F, -7.0607F, 70.1418F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(47.2947F, 20.3671F, 44.3488F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-75.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.35F, AnimationHelper.createRotationalVector(-75.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.95F, AnimationHelper.createRotationalVector(-60.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.2F, AnimationHelper.createRotationalVector(-60.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createRotationalVector(-75.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.35F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("claw", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-64.6015F, 53.0036F, -33.0428F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(-21.5974F, 70.2578F, 18.0872F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.35F, AnimationHelper.createRotationalVector(-9.0974F, 70.2578F, 18.0872F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createRotationalVector(-180.9978F, 61.8592F, -147.6028F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.85F, AnimationHelper.createRotationalVector(-67.7213F, 81.1606F, -52.356F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.95F, AnimationHelper.createRotationalVector(-146.1153F, 57.8321F, -153.5163F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.05F, AnimationHelper.createRotationalVector(-133.2656F, 55.3348F, -163.4995F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.2F, AnimationHelper.createRotationalVector(-125.7656F, 55.3348F, -163.4995F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(-140.7872F, 40.9325F, -159.4573F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createRotationalVector(-21.5974F, 70.2578F, 18.0872F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.6F, AnimationHelper.createRotationalVector(-119.3878F, 81.7961F, -81.1174F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(-64.6015F, 53.0036F, -33.0428F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("claw", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.4673F, -1.3712F, -0.605F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("claw", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(23.224F, 4.9168F, 25.0906F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(18.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createRotationalVector(43.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(18.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(17.6433F, 2.7903F, 18.6869F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(33.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(33.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(23.224F, 4.9168F, 25.0906F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger1tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(57.679F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(55.18F, -4.12F, -2.18F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createRotationalVector(57.68F, -4.12F, -2.18F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(27.68F, -4.12F, -2.18F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(27.68F, -4.12F, -2.18F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(37.68F, -4.12F, -2.18F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(52.68F, -4.12F, -2.18F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(57.679F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.05F, AnimationHelper.createRotationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife1", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 3.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.9F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(10.0157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createRotationalVector(32.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(2.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(10.0157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createRotationalVector(10.0157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(17.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger2tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(52.6945F, -0.8937F, 0.3873F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createRotationalVector(55.1945F, -0.8937F, 0.3873F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(35.1945F, -0.8937F, 0.3873F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(45.1945F, -0.8937F, 0.3873F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createRotationalVector(67.6945F, -0.8937F, 0.3873F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife2", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 3.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.9F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(46.282F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(26.282F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createRotationalVector(23.782F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(-4.2799F, -2.1058F, -18.2955F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(28.782F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createRotationalVector(28.782F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(46.282F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger3tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(37.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createRotationalVector(57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, -2.5F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife3", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 3.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.9F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("flame", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(6.0F, 17.0F, -7.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("flame", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .build();
	}
	
	static Animation initRunClawAttackAnim()
	{
		return Animation.Builder.create(1.9F)
					   .addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -3.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -3.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hips", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 10.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-47.5F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-52.5F, -5.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftMid", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(50.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(60.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.05F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.15F, AnimationHelper.createRotationalVector(-30.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.2F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.35F, AnimationHelper.createRotationalVector(-30.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-35.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofLeft", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightMid", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(62.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(62.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-67.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.05F, AnimationHelper.createRotationalVector(-72.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(-70.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.15F, AnimationHelper.createRotationalVector(-72.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.2F, AnimationHelper.createRotationalVector(-70.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(-72.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(-70.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.35F, AnimationHelper.createRotationalVector(-72.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-70.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.6151F, 12.9126F, -2.1494F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(27.5339F, 18.5004F, -2.046F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createRotationalVector(36.0339F, 18.5004F, -2.046F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(-12.1075F, -16.7385F, 14.0164F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.95F, AnimationHelper.createRotationalVector(-8.7468F, -14.669F, 11.0391F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(-6.2468F, -14.669F, 11.0391F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(17.8684F, 18.2642F, -3.7327F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.6F, AnimationHelper.createRotationalVector(17.8684F, 18.2642F, -3.7327F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(20.3684F, 18.2642F, -3.7327F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.85F, AnimationHelper.createRotationalVector(17.8684F, 18.2642F, -3.7327F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-15.0F, -5.0F, 2.2236F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(-13.382F, -16.0767F, 9.9942F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(4.7325F, -10.899F, 7.83F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.8F, AnimationHelper.createRotationalVector(-24.0333F, 2.2794F, 0.709F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-22.1651F, 2.3754F, 0.9343F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(-31.844F, -11.5042F, 26.0351F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(-34.344F, -11.5042F, 26.0351F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.75F, AnimationHelper.createRotationalVector(-31.844F, -11.5042F, 26.0351F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createRotationalVector(-34.344F, -11.5042F, 26.0351F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("jaw", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.15F, AnimationHelper.createRotationalVector(20.19F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.2F, AnimationHelper.createRotationalVector(17.61F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(12.61F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("jaw", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.05F, AnimationHelper.createTranslationalVector(0.0F, 3.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.15F, AnimationHelper.createTranslationalVector(0.0F, 0.85F, -0.03F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.2F, AnimationHelper.createTranslationalVector(0.0F, 1.39F, -0.04F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, 1.39F, -0.04F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createTranslationalVector(0.0F, 2.03F, -0.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createTranslationalVector(0.0F, 1.73F, -0.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createTranslationalVector(0.0F, 2.03F, -0.22F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("torso", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 5.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-1.1873F, -15.0947F, -14.6675F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(1.4543F, -14.5906F, -23.0694F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(21.1198F, -0.6754F, -0.5053F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(21.1198F, -0.6754F, -0.5053F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(3.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hand", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 27.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 27.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 20.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(-0.7146F, 17.9195F, 18.1684F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.8F, AnimationHelper.createRotationalVector(-0.4291F, 16.7408F, 22.3653F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(-0.4291F, 16.7408F, 22.3653F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chainStart", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(14.7F, 0.0F, -6.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(2.2F, 0.0F, -6.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(2.2F, 0.0F, -6.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.8F, AnimationHelper.createRotationalVector(29.7F, 0.0F, -6.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.9F, AnimationHelper.createRotationalVector(32.2F, 0.0F, -6.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(12.2F, 0.0F, -6.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createRotationalVector(24.7876F, 1.5435F, -12.5285F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createRotationalVector(17.6609F, 0.9101F, -16.9167F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-49.117F, -2.2552F, 48.6765F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(-59.9353F, 4.2102F, 60.142F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-59.9353F, 4.2102F, 60.142F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(69.8149F, 4.914F, -73.2348F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.85F, AnimationHelper.createRotationalVector(71.9919F, 7.2044F, -75.6313F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(-49.117F, -2.2552F, 48.6765F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(-49.117F, -2.2552F, 48.6765F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(-49.0446F, 2.3608F, 40.5742F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(29.4375F, -3.0348F, -33.8029F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createRotationalVector(-0.5F, -9.0F, -1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(36.7778F, -9.4798F, 24.9783F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(36.78F, -9.48F, 24.98F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createRotationalVector(34.28F, -9.48F, 24.98F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(-59.8627F, -4.2662F, -3.8555F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.8F, AnimationHelper.createRotationalVector(-62.4325F, -2.1033F, -2.5998F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.05F, AnimationHelper.createRotationalVector(-59.9325F, -2.1033F, -2.5998F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(36.3234F, -4.0594F, 78.6741F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.6F, AnimationHelper.createRotationalVector(37.4799F, -7.0607F, 70.1418F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(47.2947F, 20.3671F, 44.3488F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-42.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(-42.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(-45.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(-75.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.2F, AnimationHelper.createRotationalVector(-77.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createRotationalVector(-75.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("claw", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(133.9939F, 8.8894F, -190.5926F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(136.4939F, 8.8894F, -190.5926F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(186.5978F, -13.4676F, -193.1434F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(189.0978F, -13.4676F, -193.1434F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createRotationalVector(305.4743F, 79.116F, -65.0403F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.6F, AnimationHelper.createRotationalVector(275.4743F, 79.116F, -65.0403F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(322.9892F, 67.8559F, -13.3688F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("claw", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.4673F, -1.3712F, -0.605F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(20.724F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(10.724F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.85F, AnimationHelper.createRotationalVector(38.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(33.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createRotationalVector(23.224F, 4.9168F, 25.0906F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger1tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(42.679F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(27.679F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.85F, AnimationHelper.createRotationalVector(60.179F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(52.68F, -4.12F, -2.18F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createRotationalVector(57.679F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, -10.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife1", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.55F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createScalingVector(1.0F, 1.0F, 2.2F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(15.0157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(2.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.8F, AnimationHelper.createRotationalVector(40.0157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(10.0157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createRotationalVector(17.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger2tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.8F, AnimationHelper.createRotationalVector(50.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(67.6945F, -0.8937F, 0.3873F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife2", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.55F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createScalingVector(1.0F, 1.0F, 2.2F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(18.9505F, 8.3113F, -7.0521F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(2.4146F, 3.8745F, -17.363F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.85F, AnimationHelper.createRotationalVector(27.4146F, 3.8745F, -17.363F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(28.782F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createRotationalVector(46.282F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger3tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(33.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(23.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createRotationalVector(51.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, 17.5F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife3", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.55F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createScalingVector(1.0F, 1.0F, 2.2F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("flame", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .build();
	}
	
	static Animation initRunAttackWallImpactAnim()
	{
		return Animation.Builder.create(2.55F)
					   .addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.2F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, 10.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, 13.7F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, 13.7F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(0.0F, 2.5F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 2.5F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineBottomEnd", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hips", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(0.0F, -7.5F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, -7.5F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hips", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.999F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.15F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftMid", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(45.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(45.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(65.0532F, 0.3515F, 1.8296F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(65.1171F, 0.7732F, 4.025F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(-84.7216F, -0.4575F, 0.319F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(-79.3876F, -1.0066F, 0.7018F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofLeft", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.2F, AnimationHelper.createRotationalVector(-47.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-50.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(-50.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightMid", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.2F, AnimationHelper.createRotationalVector(77.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(75.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(75.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.2F, AnimationHelper.createRotationalVector(-50.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-47.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(-47.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(-63.1034F, -1.0114F, 0.1797F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(-68.1034F, -1.0114F, 0.1797F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.2F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(26.39F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.8F, AnimationHelper.createRotationalVector(26.39F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, -10.0F, 2.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(10.2377F, -12.3071F, -2.2046F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.25F, AnimationHelper.createRotationalVector(-4.7623F, -12.3071F, -2.2046F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(10.2377F, -12.3071F, -2.2046F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(12.7377F, -12.3071F, -2.2046F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(12.4774F, -8.6893F, -1.6129F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(12.3301F, -11.5699F, -2.6824F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createRotationalVector(11.8698F, -3.8574F, -1.4599F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(7.6151F, 12.9126F, -2.1494F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.2F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 5.0F, -5.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.05F, AnimationHelper.createRotationalVector(-4.1667F, 3.3333F, -3.3333F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.15F, AnimationHelper.createRotationalVector(-27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.2F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.4F, AnimationHelper.createRotationalVector(-42.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(-2.1136F, 14.5701F, -10.6692F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.35F, AnimationHelper.createRotationalVector(-3.6638F, 21.9063F, -13.6987F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(-3.1403F, -2.5624F, 9.218F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createRotationalVector(-1.193F, -2.3247F, 11.8073F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(-2.4967F, 9.5567F, -10.4241F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.55F, AnimationHelper.createRotationalVector(-3.6638F, 21.9063F, -13.6987F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.7F, AnimationHelper.createRotationalVector(0.0F, 5.0F, -5.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-34.344F, -6.5042F, 8.5351F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("jaw", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.15F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.35F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("jaw", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 2.0274F, -0.2156F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createTranslationalVector(0.0F, 3.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.15F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, 1.6F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, 3.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 3.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 2.0274F, -0.2156F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("torso", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0436F, -0.5101F, 0.8282F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0436F, -0.5101F, 0.8282F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("torso", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.999F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(19.6105F, -11.1734F, -8.7325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(-16.3701F, -10.6147F, -8.2959F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.4F, AnimationHelper.createRotationalVector(2.5305F, -8.9387F, -6.986F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(2.5305F, -8.9387F, -6.986F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-0.2F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createTranslationalVector(-0.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-40.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.2F, AnimationHelper.createRotationalVector(-50.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-29.58F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.1F, AnimationHelper.createRotationalVector(-29.58F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hand", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(1.62F, 5.95F, 1.15F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hand", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-14.9F, 7.32F, 8.52F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFingerTip1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 27.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFinger2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-6.0205F, 4.0361F, 8.3965F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFingerTip2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 22.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFinger3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(6.7086F, 9.571F, 12.3299F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFingerTip3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 15.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("thumb", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-82.57F, -67.46F, 90.14F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("thumb", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("thumbTip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -52.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("lantern", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chainStart", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.4609F, 0.9101F, -10.9167F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(7.2F, 0.0F, -6.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-0.5F, -9.0F, -1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-55.1558F, -34.8926F, 38.197F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(-75.9254F, -47.8951F, 45.5428F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.15F, AnimationHelper.createRotationalVector(-78.4254F, -47.8951F, 45.5428F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.4F, AnimationHelper.createRotationalVector(-69.3814F, -45.5626F, 46.8555F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createRotationalVector(-61.8814F, -45.5626F, 46.8555F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-61.8814F, -45.5626F, 46.8555F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(-22.4071F, -7.8419F, 54.9032F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.75F, AnimationHelper.createRotationalVector(47.2947F, 20.3671F, 44.3488F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createRotationalVector(47.2947F, 20.3671F, 44.3488F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(47.2947F, 20.3671F, 44.3488F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.1F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -2.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.15F, AnimationHelper.createRotationalVector(-75.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.55F, AnimationHelper.createRotationalVector(-62.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(-62.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.75F, AnimationHelper.createRotationalVector(-93.75F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.85F, AnimationHelper.createRotationalVector(-92.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.9F, AnimationHelper.createRotationalVector(-75.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-77.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArmGore2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArmGore2", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("claw", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-12.5F, 15.0F, -14.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.15F, AnimationHelper.createRotationalVector(-15.5186F, -38.6112F, -1.3856F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.35F, AnimationHelper.createRotationalVector(-21.5388F, -31.3548F, 9.0534F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(-12.0678F, 0.3395F, -11.2886F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(-47.4442F, 21.8618F, -15.4339F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-49.6015F, 38.0036F, -18.5428F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("claw", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.4673F, -1.3712F, -0.605F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(23.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.2F, AnimationHelper.createRotationalVector(0.724F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createRotationalVector(8.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(39.0466F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.6F, AnimationHelper.createRotationalVector(39.0466F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.75F, AnimationHelper.createRotationalVector(23.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(23.224F, -7.5832F, 10.0906F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger1tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(57.679F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(35.179F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(47.679F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(81.3886F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.6F, AnimationHelper.createRotationalVector(81.3886F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.75F, AnimationHelper.createRotationalVector(57.679F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(57.679F, -4.1157F, -2.1768F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.2F, AnimationHelper.createRotationalVector(7.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createRotationalVector(12.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(40.3571F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.6F, AnimationHelper.createRotationalVector(40.3571F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.75F, AnimationHelper.createRotationalVector(17.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(17.5157F, -2.3842F, -3.2522F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger2tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.45F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.7F, AnimationHelper.createRotationalVector(52.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(79.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.75F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(46.282F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.2F, AnimationHelper.createRotationalVector(33.782F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.75F, AnimationHelper.createRotationalVector(38.782F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(56.6509F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.75F, AnimationHelper.createRotationalVector(46.282F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(46.282F, 3.5796F, -8.6772F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger3tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(47.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.65F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.85F, AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.5F, AnimationHelper.createRotationalVector(59.35F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.75F, AnimationHelper.createRotationalVector(47.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(47.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, -2.5F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(-5.0F, -2.5F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("flame", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(6.0F, 17.0F, -7.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createTranslationalVector(-17.0F, -6.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("flame", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .build();
	}
	
	static Animation initDeathAnim()
	{
		return Animation.Builder.create(23.25F)
					   .addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 7.5F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, 6.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, 9.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, 9.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.05F, AnimationHelper.createTranslationalVector(0.0F, -1.97F, 6.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.0F, AnimationHelper.createTranslationalVector(0.0F, -0.9F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(16.0F, AnimationHelper.createTranslationalVector(0.0F, -3.9F, 2.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.5F, AnimationHelper.createTranslationalVector(0.0F, -4.4F, 2.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(4.5739F, 2.4438F, -5.1971F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(0.0F, 2.5F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 2.5F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(4.6758F, 2.2422F, -2.7032F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.0F, AnimationHelper.createRotationalVector(4.68F, 2.24F, -2.7F), Transformation.Interpolations.LINEAR),
							   new Keyframe(16.0F, AnimationHelper.createRotationalVector(12.273F, 2.034F, -0.2068F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.5F, AnimationHelper.createRotationalVector(12.27F, 2.03F, -0.21F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.0F, AnimationHelper.createRotationalVector(84.77F, 2.03F, -0.21F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.15F, AnimationHelper.createRotationalVector(82.27F, 2.03F, -0.21F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.25F, AnimationHelper.createRotationalVector(84.77F, 2.03F, -0.21F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineBottom", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(21.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.7F, AnimationHelper.createTranslationalVector(0.0F, -9.2F, -12.2F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.0F, AnimationHelper.createTranslationalVector(0.0F, -23.0F, -23.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.15F, AnimationHelper.createTranslationalVector(0.0F, -22.4F, -23.6F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.25F, AnimationHelper.createTranslationalVector(0.0F, -23.0F, -23.8F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.55F, AnimationHelper.createTranslationalVector(0.0F, -23.0F, -24.4F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineBottomEnd", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hips", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(0.0F, -7.5F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hips", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.0F, AnimationHelper.createRotationalVector(-17.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
							   new Keyframe(16.0F, AnimationHelper.createRotationalVector(-52.5515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.5F, AnimationHelper.createRotationalVector(-55.0515F, -9.6905F, -0.2746F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.5F, AnimationHelper.createRotationalVector(-55.05F, -9.69F, -0.27F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.6F, AnimationHelper.createRotationalVector(-23.55F, -9.69F, -0.27F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.75F, AnimationHelper.createRotationalVector(-7.55F, -9.69F, -0.27F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftTop", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftMid", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(45.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(45.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(65.0532F, 0.3515F, 1.8296F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.0F, AnimationHelper.createRotationalVector(52.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(16.0F, AnimationHelper.createRotationalVector(80.1597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.5F, AnimationHelper.createRotationalVector(82.6597F, 1.0544F, 5.4887F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.5F, AnimationHelper.createRotationalVector(82.66F, 1.05F, 5.49F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.6F, AnimationHelper.createRotationalVector(85.16F, 1.05F, 5.49F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.75F, AnimationHelper.createRotationalVector(70.16F, 1.05F, 5.49F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.0F, AnimationHelper.createRotationalVector(35.16F, 1.05F, 5.49F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legLeftBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(-74.7216F, -0.4575F, 0.319F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.0F, AnimationHelper.createRotationalVector(-59.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(16.0F, AnimationHelper.createRotationalVector(-64.1649F, -1.3726F, 0.9571F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.5F, AnimationHelper.createRotationalVector(-64.16F, -1.37F, 0.96F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.6F, AnimationHelper.createRotationalVector(-36.66F, -1.37F, 0.96F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.75F, AnimationHelper.createRotationalVector(-51.66F, -1.37F, 0.96F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofLeft", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.0F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(16.0F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.5F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(-47.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(-50.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-50.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.0F, AnimationHelper.createRotationalVector(9.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
							   new Keyframe(16.0F, AnimationHelper.createRotationalVector(24.3843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.5F, AnimationHelper.createRotationalVector(26.8843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.5F, AnimationHelper.createRotationalVector(26.8843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.0F, AnimationHelper.createRotationalVector(-0.6157F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.15F, AnimationHelper.createRotationalVector(1.8843F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.25F, AnimationHelper.createRotationalVector(-0.6157F, 13.7149F, 8.5641F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightTop", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightMid", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(77.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(75.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(75.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.05F, AnimationHelper.createRotationalVector(59.8284F, -4.6923F, 0.4217F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(57.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(34.5983F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.0F, AnimationHelper.createRotationalVector(37.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.7F, AnimationHelper.createRotationalVector(48.7427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(16.0F, AnimationHelper.createRotationalVector(32.2427F, -7.0384F, 0.6325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.5F, AnimationHelper.createRotationalVector(32.24F, -7.04F, 0.63F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.65F, AnimationHelper.createRotationalVector(49.74F, -7.04F, 0.63F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.8F, AnimationHelper.createRotationalVector(37.24F, -7.04F, 0.63F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.9F, AnimationHelper.createRotationalVector(35.5733F, -7.04F, 0.63F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.0F, AnimationHelper.createRotationalVector(27.24F, -7.04F, 0.63F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(-50.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(-47.6185F, -0.8299F, 0.6608F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-47.6185F, -0.8299F, 0.6608F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.05F, AnimationHelper.createRotationalVector(-45.6825F, -1.5646F, 0.6202F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.0F, AnimationHelper.createRotationalVector(-64.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.7F, AnimationHelper.createRotationalVector(-84.8103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
							   new Keyframe(16.0F, AnimationHelper.createRotationalVector(-79.3103F, -3.0341F, 0.539F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.55F, AnimationHelper.createRotationalVector(-79.31F, -3.03F, 0.54F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.8F, AnimationHelper.createRotationalVector(-39.31F, -3.03F, 0.54F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.0F, AnimationHelper.createRotationalVector(-41.81F, -3.03F, 0.54F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("legRightBottom", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(16.0F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hoofRight", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, -10.0F, 2.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(10.2377F, -12.3071F, -2.2046F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(20.8111F, -19.5343F, -4.2907F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.4F, AnimationHelper.createRotationalVector(18.3111F, -19.5343F, -4.2907F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(20.8111F, -19.5343F, -4.2907F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(24.5611F, -19.5343F, -4.2907F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(9.2455F, -10.2799F, 2.1949F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(6.7455F, -10.2799F, 2.1949F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(5.7455F, -10.2799F, 2.1949F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.0F, AnimationHelper.createRotationalVector(11.7458F, -10.2799F, 2.1947F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.5F, AnimationHelper.createRotationalVector(12.7458F, -10.2799F, 2.1947F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.5F, AnimationHelper.createRotationalVector(6.7455F, -10.2799F, 2.1949F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.85F, AnimationHelper.createRotationalVector(11.7458F, -10.2799F, 2.1947F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.35F, AnimationHelper.createRotationalVector(12.7458F, -10.2799F, 2.1947F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.35F, AnimationHelper.createRotationalVector(6.7455F, -10.2799F, 2.1949F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.7F, AnimationHelper.createRotationalVector(11.7458F, -10.2799F, 2.1947F), Transformation.Interpolations.LINEAR),
							   new Keyframe(6.2F, AnimationHelper.createRotationalVector(12.7458F, -10.2799F, 2.1947F), Transformation.Interpolations.LINEAR),
							   new Keyframe(7.2F, AnimationHelper.createRotationalVector(6.7455F, -10.2799F, 2.1949F), Transformation.Interpolations.LINEAR),
							   new Keyframe(7.55F, AnimationHelper.createRotationalVector(11.7458F, -10.2799F, 2.1947F), Transformation.Interpolations.LINEAR),
							   new Keyframe(8.05F, AnimationHelper.createRotationalVector(12.7458F, -10.2799F, 2.1947F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.05F, AnimationHelper.createRotationalVector(6.7455F, -10.2799F, 2.1949F), Transformation.Interpolations.LINEAR),
							   new Keyframe(12.25F, AnimationHelper.createRotationalVector(6.75F, -10.28F, 2.19F), Transformation.Interpolations.LINEAR),
							   new Keyframe(14.5F, AnimationHelper.createRotationalVector(9.25F, -10.28F, 2.19F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.0F, AnimationHelper.createRotationalVector(6.75F, -10.28F, 2.19F), Transformation.Interpolations.LINEAR),
							   new Keyframe(16.0F, AnimationHelper.createRotationalVector(21.75F, -10.28F, 2.19F), Transformation.Interpolations.LINEAR),
							   new Keyframe(17.8F, AnimationHelper.createRotationalVector(29.25F, -10.28F, 2.19F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.5F, AnimationHelper.createRotationalVector(29.25F, -10.28F, 2.19F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.75F, AnimationHelper.createRotationalVector(43.7319F, -6.6816F, 5.7006F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.0F, AnimationHelper.createRotationalVector(46.2319F, -6.6816F, 5.7006F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.45F, AnimationHelper.createRotationalVector(46.2319F, -6.6816F, 5.7006F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.7F, AnimationHelper.createRotationalVector(13.7319F, -6.6816F, 5.7006F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.95F, AnimationHelper.createRotationalVector(11.2319F, -6.6816F, 5.7006F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.15F, AnimationHelper.createRotationalVector(-3.7681F, -6.6816F, 5.7006F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.25F, AnimationHelper.createRotationalVector(-5.7681F, -6.6816F, 5.7006F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.5F, AnimationHelper.createRotationalVector(11.2319F, -6.6816F, 5.7006F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineCenter", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(19.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineTop", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(37.4011F, -2.6841F, 4.22F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.25F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.5F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.1F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.35F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.95F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(7.2F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(7.8F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.0F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.5F, AnimationHelper.createRotationalVector(37.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.35F, AnimationHelper.createRotationalVector(37.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(20.2F, AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.45F, AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.75F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.0F, AnimationHelper.createRotationalVector(-23.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.15F, AnimationHelper.createRotationalVector(32.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("spineTop", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(19.35F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 5.0F, -5.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(-27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(-30.1258F, 5.5783F, -0.3423F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.4F, AnimationHelper.createRotationalVector(-27.6258F, 5.5783F, -0.3423F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(-30.1258F, 5.5783F, -0.3423F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-30.1258F, 5.5783F, -0.3423F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.15F, AnimationHelper.createRotationalVector(-29.9764F, 1.2497F, 2.1654F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.5F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.5F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.35F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.35F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(6.2F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(7.2F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(8.05F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.0F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.5F, AnimationHelper.createRotationalVector(-20.4378F, -17.1888F, 3.4647F), Transformation.Interpolations.LINEAR),
							   new Keyframe(10.15F, AnimationHelper.createRotationalVector(-20.7295F, -19.5292F, 4.3907F), Transformation.Interpolations.LINEAR),
							   new Keyframe(12.25F, AnimationHelper.createRotationalVector(-18.2295F, -19.5292F, 4.3907F), Transformation.Interpolations.LINEAR),
							   new Keyframe(12.75F, AnimationHelper.createRotationalVector(-7.0944F, 8.3797F, -3.8783F), Transformation.Interpolations.LINEAR),
							   new Keyframe(12.85F, AnimationHelper.createRotationalVector(-7.1137F, 9.372F, -4.0035F), Transformation.Interpolations.LINEAR),
							   new Keyframe(13.45F, AnimationHelper.createRotationalVector(-7.2326F, -13.9492F, -1.0869F), Transformation.Interpolations.LINEAR),
							   new Keyframe(13.55F, AnimationHelper.createRotationalVector(-7.2651F, -14.9412F, -0.9567F), Transformation.Interpolations.LINEAR),
							   new Keyframe(14.2F, AnimationHelper.createRotationalVector(-7.0944F, 8.3797F, -3.8783F), Transformation.Interpolations.LINEAR),
							   new Keyframe(14.3F, AnimationHelper.createRotationalVector(-7.1137F, 9.372F, -4.0035F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.0F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.35F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(20.25F, AnimationHelper.createRotationalVector(-44.8265F, 2.8631F, 6.9349F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.5F, AnimationHelper.createRotationalVector(-44.83F, 2.86F, 6.93F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.8F, AnimationHelper.createRotationalVector(-54.83F, 2.86F, 6.93F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.0F, AnimationHelper.createRotationalVector(-62.33F, 2.86F, 6.93F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.15F, AnimationHelper.createRotationalVector(-118.7189F, 2.86F, 6.93F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.25F, AnimationHelper.createRotationalVector(-120.1078F, 2.86F, 6.93F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.6F, AnimationHelper.createRotationalVector(-133.4466F, 12.0358F, -1.6405F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.8F, AnimationHelper.createRotationalVector(-145.9466F, 12.0358F, -1.6405F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.95F, AnimationHelper.createRotationalVector(-148.9274F, 13.3352F, -3.8298F), Transformation.Interpolations.LINEAR),
							   new Keyframe(23.25F, AnimationHelper.createRotationalVector(-138.4466F, 12.0358F, -1.6405F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.35F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.0F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.1F, AnimationHelper.createTranslationalVector(-0.2632F, 3.1276F, -2.2214F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.25F, AnimationHelper.createTranslationalVector(-0.6405F, 10.5563F, -6.3179F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.5F, AnimationHelper.createTranslationalVector(1.1174F, 12.3449F, 7.9949F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.65F, AnimationHelper.createTranslationalVector(1.1955F, 14.7201F, 9.4393F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.95F, AnimationHelper.createTranslationalVector(0.7623F, 21.5512F, 7.1732F), Transformation.Interpolations.LINEAR),
							   new Keyframe(23.1F, AnimationHelper.createTranslationalVector(0.9267F, 21.7291F, 8.5629F), Transformation.Interpolations.LINEAR),
							   new Keyframe(23.25F, AnimationHelper.createTranslationalVector(0.8757F, 23.1324F, 8.3861F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("jaw", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.4F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.5F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.5F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(3.5F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(4.35F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(5.35F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(6.2F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(7.2F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(8.05F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.5F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(11.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(11.75F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(12.25F, AnimationHelper.createRotationalVector(11.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(12.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(16.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.85F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.05F, AnimationHelper.createRotationalVector(19.7197F, 3.4049F, -9.408F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.2F, AnimationHelper.createRotationalVector(22.7197F, 3.4049F, -9.408F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.45F, AnimationHelper.createRotationalVector(14.7197F, 3.4049F, -9.408F), Transformation.Interpolations.LINEAR),
							   new Keyframe(20.25F, AnimationHelper.createRotationalVector(14.7197F, 3.4049F, -9.408F), Transformation.Interpolations.LINEAR),
							   new Keyframe(20.45F, AnimationHelper.createRotationalVector(24.5638F, 4.4474F, -11.6857F), Transformation.Interpolations.LINEAR),
							   new Keyframe(20.55F, AnimationHelper.createRotationalVector(17.0638F, 4.4474F, -11.6857F), Transformation.Interpolations.LINEAR),
							   new Keyframe(20.75F, AnimationHelper.createRotationalVector(15.0638F, 4.4474F, -11.6857F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.05F, AnimationHelper.createRotationalVector(20.0638F, 4.4474F, -11.6857F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.3F, AnimationHelper.createRotationalVector(17.5638F, 4.4474F, -11.6857F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.2F, AnimationHelper.createRotationalVector(17.5638F, 4.4474F, -11.6857F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.3F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.7F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(23.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(23.1F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("jaw", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 2.0274F, -0.2156F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createTranslationalVector(0.0F, 3.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 3.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createTranslationalVector(0.0F, 1.2F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.65F, AnimationHelper.createTranslationalVector(0.0F, 1.3F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.0F, AnimationHelper.createTranslationalVector(0.0F, 1.3F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.5F, AnimationHelper.createTranslationalVector(0.0F, 2.3F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(11.0F, AnimationHelper.createTranslationalVector(0.0F, 2.3F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(11.75F, AnimationHelper.createTranslationalVector(0.0F, 2.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(12.25F, AnimationHelper.createTranslationalVector(0.0F, 2.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(12.75F, AnimationHelper.createTranslationalVector(0.0F, 3.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(16.0F, AnimationHelper.createTranslationalVector(0.0F, 3.1F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.85F, AnimationHelper.createTranslationalVector(0.0F, 3.1F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.05F, AnimationHelper.createTranslationalVector(-0.2F, 2.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.45F, AnimationHelper.createTranslationalVector(-0.2F, 2.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(20.25F, AnimationHelper.createTranslationalVector(-0.2F, 2.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(20.45F, AnimationHelper.createTranslationalVector(-0.2F, 0.0F, -2.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.15F, AnimationHelper.createTranslationalVector(-0.2F, 0.0F, -2.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.25F, AnimationHelper.createTranslationalVector(0.0F, 3.1F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.65F, AnimationHelper.createTranslationalVector(0.0053F, 2.6003F, 0.0178F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.95F, AnimationHelper.createTranslationalVector(0.0053F, 2.6003F, 0.0178F), Transformation.Interpolations.LINEAR),
							   new Keyframe(23.1F, AnimationHelper.createTranslationalVector(0.0F, 3.1F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("torso", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0436F, -0.5101F, 0.8282F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("torso", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(19.6105F, -11.1734F, -8.7325F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.0F, AnimationHelper.createRotationalVector(19.61F, -11.17F, -8.73F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.5F, AnimationHelper.createRotationalVector(-17.89F, -11.17F, -8.73F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.75F, AnimationHelper.createRotationalVector(-27.89F, -11.17F, -8.73F), Transformation.Interpolations.LINEAR),
							   new Keyframe(11.0F, AnimationHelper.createRotationalVector(-30.39F, -11.17F, -8.73F), Transformation.Interpolations.LINEAR),
							   new Keyframe(12.0F, AnimationHelper.createRotationalVector(-30.39F, -11.17F, -8.73F), Transformation.Interpolations.LINEAR),
							   new Keyframe(13.0F, AnimationHelper.createRotationalVector(-0.39F, -11.17F, -8.73F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.0F, AnimationHelper.createRotationalVector(-0.39F, -11.17F, -8.73F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.8F, AnimationHelper.createRotationalVector(-85.1873F, 50.35F, -63.453F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.5F, AnimationHelper.createRotationalVector(-88.2075F, 50.4941F, -67.3708F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.85F, AnimationHelper.createRotationalVector(-58.2075F, 50.4941F, -67.3708F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.0F, AnimationHelper.createRotationalVector(-56.2075F, 50.4941F, -67.3708F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.35F, AnimationHelper.createRotationalVector(-68.2075F, 50.4941F, -67.3708F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.5F, AnimationHelper.createRotationalVector(-68.2075F, 50.4941F, -67.3708F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.75F, AnimationHelper.createRotationalVector(-71.4135F, 31.5336F, -75.9382F), Transformation.Interpolations.LINEAR),
							   new Keyframe(20.0F, AnimationHelper.createRotationalVector(-72.2831F, 26.782F, -77.7214F), Transformation.Interpolations.LINEAR),
							   new Keyframe(20.15F, AnimationHelper.createRotationalVector(-72.5754F, 24.8753F, -78.3921F), Transformation.Interpolations.LINEAR),
							   new Keyframe(20.5F, AnimationHelper.createRotationalVector(-71.4135F, 31.5336F, -75.9382F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.0F, AnimationHelper.createRotationalVector(-72.1257F, 27.7342F, -77.3776F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.45F, AnimationHelper.createRotationalVector(-71.6045F, 30.5852F, -76.3084F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.85F, AnimationHelper.createRotationalVector(27.7101F, -10.1161F, -10.2285F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.0F, AnimationHelper.createRotationalVector(10.0832F, 4.6519F, -7.5903F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.1F, AnimationHelper.createRotationalVector(5.7082F, 4.6519F, -7.5903F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.25F, AnimationHelper.createRotationalVector(8.677F, 4.6519F, -7.5903F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.5F, AnimationHelper.createRotationalVector(-6.9168F, 4.6519F, -7.5903F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArm", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(-0.2F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.0F, AnimationHelper.createTranslationalVector(-0.2F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.8F, AnimationHelper.createTranslationalVector(-0.2F, -2.0F, -1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.5F, AnimationHelper.createTranslationalVector(-0.2F, -2.0F, -1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.85F, AnimationHelper.createTranslationalVector(-0.2F, -2.0F, -1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.0F, AnimationHelper.createTranslationalVector(-0.2F, -2.0F, -4.8F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.1F, AnimationHelper.createTranslationalVector(-0.2F, -2.0F, -6.7F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.25F, AnimationHelper.createTranslationalVector(0.7924F, -1.0622F, -6.8064F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.5F, AnimationHelper.createTranslationalVector(0.7918F, 0.9697F, -4.5245F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-40.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.0F, AnimationHelper.createRotationalVector(-40.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.5F, AnimationHelper.createRotationalVector(-52.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.75F, AnimationHelper.createRotationalVector(-55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(10.0F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(12.0F, AnimationHelper.createRotationalVector(-60.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(13.05F, AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.0F, AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.8F, AnimationHelper.createRotationalVector(-62.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.5F, AnimationHelper.createRotationalVector(-67.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.75F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.05F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.25F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.45F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.45F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.85F, AnimationHelper.createRotationalVector(-37.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.1F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.25F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.5F, AnimationHelper.createRotationalVector(0.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftArmLower", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(15.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hand", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(1.62F, 5.95F, 1.15F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.0F, AnimationHelper.createRotationalVector(1.62F, 5.95F, 1.15F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.5F, AnimationHelper.createRotationalVector(59.422F, -88.1284F, -58.4266F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.75F, AnimationHelper.createRotationalVector(169.8584F, -80.8112F, -169.0038F), Transformation.Interpolations.LINEAR),
							   new Keyframe(12.25F, AnimationHelper.createRotationalVector(59.422F, -88.1284F, -58.4266F), Transformation.Interpolations.LINEAR),
							   new Keyframe(13.1F, AnimationHelper.createRotationalVector(2.3734F, 0.6919F, 8.4765F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.0F, AnimationHelper.createRotationalVector(2.37F, 0.69F, 8.48F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.8F, AnimationHelper.createRotationalVector(161.2007F, -82.3655F, -142.8958F), Transformation.Interpolations.LINEAR),
							   new Keyframe(17.8F, AnimationHelper.createRotationalVector(161.2F, -82.37F, -142.9F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.05F, AnimationHelper.createRotationalVector(97.5683F, -17.3846F, -74.1293F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.2F, AnimationHelper.createRotationalVector(97.3315F, -9.9477F, -73.1293F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.5F, AnimationHelper.createRotationalVector(97.5683F, -17.3846F, -74.1293F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.8F, AnimationHelper.createRotationalVector(172.7211F, -82.7792F, -162.0788F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.0F, AnimationHelper.createRotationalVector(172.7211F, -82.7792F, -162.0788F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.15F, AnimationHelper.createRotationalVector(111.6873F, -70.282F, -99.9398F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.6F, AnimationHelper.createRotationalVector(246.2333F, -71.9788F, -236.6936F), Transformation.Interpolations.LINEAR),
							   new Keyframe(20.0F, AnimationHelper.createRotationalVector(209.5207F, -81.7623F, -199.1915F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.1F, AnimationHelper.createRotationalVector(209.52F, -81.76F, -199.19F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.2F, AnimationHelper.createRotationalVector(255.5006F, -60.1242F, -246.7755F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.3F, AnimationHelper.createRotationalVector(273.2935F, -61.1149F, -267.1424F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("hand", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.25F), Transformation.Interpolations.LINEAR),
							   new Keyframe(12.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.25F), Transformation.Interpolations.LINEAR),
							   new Keyframe(13.1F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR),
							   new Keyframe(17.8F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.1F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.75F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.25F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-14.9F, 7.32F, 8.52F), Transformation.Interpolations.LINEAR),
							   new Keyframe(10.0F, AnimationHelper.createRotationalVector(-14.9F, 7.32F, 8.52F), Transformation.Interpolations.LINEAR),
							   new Keyframe(10.5F, AnimationHelper.createRotationalVector(-5.3787F, 15.6899F, 53.7369F), Transformation.Interpolations.LINEAR),
							   new Keyframe(10.65F, AnimationHelper.createRotationalVector(-5.0981F, 15.7813F, 54.7715F), Transformation.Interpolations.LINEAR),
							   new Keyframe(11.25F, AnimationHelper.createRotationalVector(-14.2238F, 8.5779F, 13.4063F), Transformation.Interpolations.LINEAR),
							   new Keyframe(17.05F, AnimationHelper.createRotationalVector(-14.22F, 8.58F, 13.41F), Transformation.Interpolations.LINEAR),
							   new Keyframe(17.3F, AnimationHelper.createRotationalVector(-6.9128F, -15.0874F, -82.1013F), Transformation.Interpolations.LINEAR),
							   new Keyframe(17.5F, AnimationHelper.createRotationalVector(-4.132F, -16.0524F, -92.4349F), Transformation.Interpolations.LINEAR),
							   new Keyframe(17.8F, AnimationHelper.createRotationalVector(-8.2193F, -14.4286F, -76.9756F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.0F, AnimationHelper.createRotationalVector(-16.3924F, -2.3982F, -25.1723F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.4F, AnimationHelper.createRotationalVector(-15.9583F, -4.4903F, -32.3881F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.6F, AnimationHelper.createRotationalVector(-16.3667F, 2.5724F, -8.3878F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.25F, AnimationHelper.createRotationalVector(-15.9583F, -4.4903F, -32.3881F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.5F, AnimationHelper.createRotationalVector(-13.0032F, 10.3475F, 20.7998F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.8F, AnimationHelper.createRotationalVector(-12.5457F, 10.9004F, 23.2804F), Transformation.Interpolations.LINEAR),
							   new Keyframe(20.5F, AnimationHelper.createRotationalVector(-11.5571F, 11.945F, 28.269F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.95F, AnimationHelper.createRotationalVector(-11.56F, 11.95F, 28.27F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.1F, AnimationHelper.createRotationalVector(-15.9157F, 4.6628F, -1.1682F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.2F, AnimationHelper.createRotationalVector(-16.1381F, -3.799F, -29.9772F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFinger1", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.3F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFingerTip1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 12.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(10.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 12.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(10.55F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 72.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(10.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 73.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(11.3F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 17.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(17.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 17.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(17.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(17.55F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(17.9F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 20.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 10.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 30.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 10.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 20.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.8F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 52.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(20.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 57.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.95F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 57.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.1F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 20.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFinger2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-6.0205F, 4.0361F, 8.3965F), Transformation.Interpolations.LINEAR),
							   new Keyframe(10.25F, AnimationHelper.createRotationalVector(-6.02F, 4.04F, 8.4F), Transformation.Interpolations.LINEAR),
							   new Keyframe(10.75F, AnimationHelper.createRotationalVector(-3.1949F, 6.5068F, 38.4309F), Transformation.Interpolations.LINEAR),
							   new Keyframe(10.85F, AnimationHelper.createRotationalVector(-3.0805F, 6.5616F, 39.4359F), Transformation.Interpolations.LINEAR),
							   new Keyframe(11.5F, AnimationHelper.createRotationalVector(-5.8387F, 4.2983F, 10.8932F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.0F, AnimationHelper.createRotationalVector(-14.22F, 8.58F, 13.41F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.4F, AnimationHelper.createRotationalVector(-15.9583F, -4.4903F, -32.3881F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.6F, AnimationHelper.createRotationalVector(-16.3667F, 2.5724F, -8.3878F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.25F, AnimationHelper.createRotationalVector(-15.5226F, -5.8475F, -37.2201F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.5F, AnimationHelper.createRotationalVector(-13.4351F, 9.7757F, 18.328F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.8F, AnimationHelper.createRotationalVector(-8.0842F, 3.0693F, 24.3804F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.95F, AnimationHelper.createRotationalVector(-8.08F, 3.07F, 24.38F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.1F, AnimationHelper.createRotationalVector(-8.2844F, -2.4618F, -12.7248F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.2F, AnimationHelper.createRotationalVector(-11.5327F, 9.1788F, -39.2745F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFinger2", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(22.1F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -0.2F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFingerTip2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 22.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(10.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 22.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(11.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 82.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(11.15F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 83.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(11.8F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 25.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.15F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 25.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -2.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 25.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 5.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 15.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.8F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 55.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(20.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 62.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.95F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 62.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.1F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 22.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 10.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFinger3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(6.7086F, 9.571F, 12.3299F), Transformation.Interpolations.LINEAR),
							   new Keyframe(10.5F, AnimationHelper.createRotationalVector(6.71F, 9.57F, 12.33F), Transformation.Interpolations.LINEAR),
							   new Keyframe(11.0F, AnimationHelper.createRotationalVector(10.1136F, 5.8534F, 37.2861F), Transformation.Interpolations.LINEAR),
							   new Keyframe(11.1F, AnimationHelper.createRotationalVector(10.2129F, 5.6769F, 38.2754F), Transformation.Interpolations.LINEAR),
							   new Keyframe(11.75F, AnimationHelper.createRotationalVector(7.1218F, 9.2689F, 14.8457F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.0F, AnimationHelper.createRotationalVector(-14.22F, 8.58F, 13.41F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.4F, AnimationHelper.createRotationalVector(-15.9583F, -4.4903F, -32.3881F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.6F, AnimationHelper.createRotationalVector(-16.3667F, 2.5724F, -8.3878F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.25F, AnimationHelper.createRotationalVector(-13.1122F, -10.208F, -54.3416F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.5F, AnimationHelper.createRotationalVector(-14.22F, 8.58F, 13.41F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.8F, AnimationHelper.createRotationalVector(2.2683F, 8.3133F, 23.5164F), Transformation.Interpolations.LINEAR),
							   new Keyframe(20.5F, AnimationHelper.createRotationalVector(2.9884F, 8.0839F, 28.5627F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.95F, AnimationHelper.createRotationalVector(2.99F, 8.08F, 28.56F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.1F, AnimationHelper.createRotationalVector(-4.3077F, 7.4643F, -21.9324F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.2F, AnimationHelper.createRotationalVector(-6.6009F, 5.5435F, -41.9712F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("leftFingerTip3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 15.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(10.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 15.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(10.8F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 87.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(10.9F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 88.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(11.55F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 17.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 17.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.55F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 5.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 37.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 5.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 22.5F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.8F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 55.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.95F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 55.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.1F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 15.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("thumb", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-82.57F, -67.46F, 90.14F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.0F, AnimationHelper.createRotationalVector(-82.57F, -67.46F, 90.14F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.5F, AnimationHelper.createRotationalVector(-124.5857F, -34.4472F, 152.4688F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.0F, AnimationHelper.createRotationalVector(-124.59F, -34.45F, 152.47F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.2F, AnimationHelper.createRotationalVector(-118.7211F, -13.0493F, 138.2125F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("thumb", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(9.5F, AnimationHelper.createTranslationalVector(1.3F, 0.9F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("thumbTip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -52.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("lantern", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chainStart", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.4609F, 0.9101F, -10.9167F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("chain1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-55.1558F, -34.8926F, 38.197F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(-61.4608F, -43.8361F, 32.3918F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(-62.1287F, -42.614F, 29.7381F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(-60.9902F, -44.8125F, 28.091F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-67.1287F, -42.614F, 29.7381F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createRotationalVector(9.2221F, 15.6764F, 65.1144F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.4F, AnimationHelper.createRotationalVector(14.2221F, 15.6764F, 65.1144F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.1F, AnimationHelper.createRotationalVector(13.5271F, 16.276F, 62.5899F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(-7.4494F, 12.4623F, 2.889F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.0F, AnimationHelper.createRotationalVector(-7.45F, 12.46F, 2.89F), Transformation.Interpolations.LINEAR),
							   new Keyframe(17.5F, AnimationHelper.createRotationalVector(15.05F, 12.46F, 2.89F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.75F, AnimationHelper.createRotationalVector(15.05F, 12.46F, 2.89F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.1F, AnimationHelper.createRotationalVector(-48.0799F, 8.7569F, -0.5287F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.35F, AnimationHelper.createRotationalVector(-60.5099F, 8.4801F, -0.1885F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.65F, AnimationHelper.createRotationalVector(-40.6806F, 9.2238F, -0.9913F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.9F, AnimationHelper.createRotationalVector(-35.6806F, 9.2238F, -0.9913F), Transformation.Interpolations.LINEAR),
							   new Keyframe(20.5F, AnimationHelper.createRotationalVector(-58.2214F, 3.9885F, -2.484F), Transformation.Interpolations.LINEAR),
							   new Keyframe(20.85F, AnimationHelper.createRotationalVector(-65.7214F, 3.9885F, -2.484F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.2F, AnimationHelper.createRotationalVector(-60.7214F, 3.9885F, -2.484F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.5F, AnimationHelper.createRotationalVector(-60.7214F, 3.9885F, -2.484F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.75F, AnimationHelper.createRotationalVector(26.7786F, 3.9885F, -2.484F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.9F, AnimationHelper.createRotationalVector(29.2786F, 3.9885F, -2.484F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.0F, AnimationHelper.createRotationalVector(-10.7214F, 3.9885F, -2.484F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.3F, AnimationHelper.createRotationalVector(11.7786F, 3.9885F, -2.484F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.4F, AnimationHelper.createRotationalVector(14.2786F, 3.9885F, -2.484F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.65F, AnimationHelper.createRotationalVector(-15.7214F, 3.9885F, -2.484F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArm", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.1F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -2.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -2.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.1F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.3F, AnimationHelper.createRotationalVector(-62.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.6F, AnimationHelper.createRotationalVector(-65.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.0F, AnimationHelper.createRotationalVector(-67.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.3F, AnimationHelper.createRotationalVector(-37.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(1.45F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(2.6F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.0F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(15.6F, AnimationHelper.createRotationalVector(-25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(17.5F, AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.8F, AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(18.95F, AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.15F, AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.3F, AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.4F, AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(19.6F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(20.5F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(20.7F, AnimationHelper.createRotationalVector(-12.86F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(20.95F, AnimationHelper.createRotationalVector(-14.86F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.3F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.75F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(21.9F, AnimationHelper.createRotationalVector(-25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.35F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.65F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArmLower", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(15.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.35F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(22.65F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArmGore2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("brokenArmGore2", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
							   new Keyframe(0.05F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("claw", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-12.5F, 15.0F, -14.5F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("claw", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 12.5F, 15.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife1", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-1.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger2tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife2", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("finger3tip", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("knife3", new Transformation(Transformation.Targets.ROTATE,
							   new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("flame", new Transformation(Transformation.Targets.TRANSLATE,
							   new Keyframe(0.0F, AnimationHelper.createTranslationalVector(6.0F, 17.0F, -7.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .addBoneAnimation("flame", new Transformation(Transformation.Targets.SCALE,
							   new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
					   ))
					   .build();
	}
}
