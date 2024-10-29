package absolutelyaya.formidulus.entities;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.damage.DamageSources;
import absolutelyaya.formidulus.datagen.Lang;
import absolutelyaya.formidulus.entities.boss.BossFightManager;
import absolutelyaya.formidulus.entities.boss.BossType;
import absolutelyaya.formidulus.entities.goal.AnimatedAttackGoal;
import absolutelyaya.formidulus.entities.goal.BossOutOfCombatGoal;
import absolutelyaya.formidulus.entities.goal.BossTargetGoal;
import absolutelyaya.formidulus.entities.goal.InterruptableGoal;
import absolutelyaya.formidulus.network.SequenceTriggerPayload;
import absolutelyaya.formidulus.particle.BloodDropParticleEffect;
import absolutelyaya.formidulus.registries.EntityRegistry;
import absolutelyaya.formidulus.registries.ParticleRegistry;
import absolutelyaya.formidulus.registries.StatusEffectRegistry;
import com.chocohead.mm.api.ClassTinkerers;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.command.argument.EntityAnchorArgumentType;
import net.minecraft.entity.*;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.TypeFilter;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.*;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

import java.util.EnumSet;
import java.util.List;

public class DeerGodEntity extends BossEntity
{
	static final List<Class<? extends LivingEntity>> ignoredClasses = List.of(DeerGodEntity.class, IrrlichtEntity.class);
	static final TrackedData<Boolean> SUMMONED = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	static final TrackedData<Boolean> LANTERN = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	static final TrackedData<Boolean> CLAW = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	static final TrackedData<Boolean> RANGED = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	static final TrackedData<Boolean> DYING = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	static final TrackedData<Byte> RUN_ATTACK = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.BYTE);
	static final TrackedData<Integer> TELEPORT_TIMER = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.INTEGER);
	static final TrackedData<Integer> TELEPORT_COOLDOWN = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.INTEGER);
	static final TrackedData<Integer> RANGED_COOLDOWN = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.INTEGER);
	static final TrackedData<Integer> SCHEDULED_SPAWNS = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.INTEGER);
	static final TrackedData<Integer> SWARM_TRANSITION_TICKS = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.INTEGER);
	static final TrackedData<Integer> STRONG_COOLDOWN = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.INTEGER);
	static final TrackedData<Integer> RUN_ATTACK_ANIM_SPEED = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.INTEGER);
	static final TrackedData<Vector3f> NEXT_TELEPORT_DEST = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.VECTOR3F);
	
	static final byte UNSUMMONED_POSE = 0;
	static final byte SPAWN_SEQUENCE_ANIM = 1;
	static final byte IDLE_ANIM = 2;
	static final byte SUMMON_LANTERN_ANIM = 3;
	static final byte SWING_ANIM = 4;
	static final byte SLAM_ANIM = 5;
	static final byte PHASE_TRANSITION_ANIM = 6;
	static final byte PREPARE_RUN_ATTACK_ANIM = 7;
	static final byte SIMPLE_CLAW_ATTACK_ANIM = 8;
	static final byte SLAM_CLAW_ATTACK_ANIM = 9;
	static final byte RUN_ATTACK_CLAW_ANIM = 10;
	static final byte RUN_ATTACK_LANTERN_ANIM = 11;
	static final byte RUN_ATTACK_WALL_IMPACT_ANIM = 12;
	static final byte DEATH_SEQUENCE_ANIM = 69;
	public static final byte RUN_ATTACK_NONE = 0;
	public static final byte RUN_ATTACK_CLAW = 1;
	public static final byte RUN_ATTACK_LANTERN = 2;
	public AnimationState unsummonedPoseAnimationState = new AnimationState();
	public AnimationState spawnSequenceAnimationState = new AnimationState();
	public AnimationState idleAnimationState = new AnimationState();
	public AnimationState swingAnimationState = new AnimationState();
	public AnimationState slamAnimationState = new AnimationState();
	public AnimationState summonLanternAnimationState = new AnimationState();
	public AnimationState holdLanternAnimationState = new AnimationState();
	public AnimationState noLanternAnimationState = new AnimationState();
	public AnimationState noClawAnimationState = new AnimationState();
	public AnimationState showClawAnimationState = new AnimationState();
	public AnimationState showClawWithoutExtrasAnimationState = new AnimationState();
	public AnimationState phaseTransitionAnimationState = new AnimationState();
	public AnimationState simpleClawAttackAnimationState = new AnimationState();
	public AnimationState slamClawAnimationState = new AnimationState();
	public AnimationState prepareRunAttackAnimationState = new AnimationState();
	public AnimationState runAttackClawAnimationState = new AnimationState();
	public AnimationState runAttackLanternAnimationState = new AnimationState();
	public AnimationState runAttackWallImpactAnimationState = new AnimationState();
	public AnimationState deathAnimationState = new AnimationState();
	int swingChain, swarmAttack, warnTimer;
	DamageSource killingBlow;
	PlayerEntity killer;
	float rangedDamageTaken, eyeGlow;
	boolean swarmAttackPending;
	
	public DeerGodEntity(EntityType<? extends BossEntity> entityType, World world)
	{
		super(entityType, world, BossType.DEER);
		unsummonedPoseAnimationState.start(age);
		holdLanternAnimationState.start(age);
		noLanternAnimationState.start(age);
		noClawAnimationState.start(age);
		showClawAnimationState.start(age);
		showClawWithoutExtrasAnimationState.start(age);
		dataTracker.set(ANIMATION_START, age);
	}
	
	@Override
	protected void initDataTracker(DataTracker.Builder builder)
	{
		super.initDataTracker(builder);
		builder.add(SUMMONED, false);
		builder.add(LANTERN, true);
		builder.add(CLAW, false);
		builder.add(RANGED, false);
		builder.add(DYING, false);
		builder.add(RUN_ATTACK, (byte)0);
		builder.add(TELEPORT_TIMER, Integer.MIN_VALUE);
		builder.add(TELEPORT_COOLDOWN, 200);
		builder.add(RANGED_COOLDOWN, 100);
		builder.add(SCHEDULED_SPAWNS, 0);
		builder.add(SWARM_TRANSITION_TICKS, 0);
		builder.add(STRONG_COOLDOWN, 40);
		builder.add(RUN_ATTACK_ANIM_SPEED, 1);
		builder.add(NEXT_TELEPORT_DEST, getPos().toVector3f());
	}
	
	@Override
	protected void initGoals()
	{
		super.initGoals();
		goalSelector.add(0, new SwarmGoal(this));
		goalSelector.add(0, outOfCombatGoal = new BossOutOfCombatGoal(this, BossOutOfCombatGoal.BEHAVIOR_RESPAWN_AT_ORIGIN));
		goalSelector.add(0, new TeleportRandomlyGoal(this));
		goalSelector.add(1, new RunClawAttackGoal(this, 0.9f));
		goalSelector.add(1, new SimpleClawAttackGoal(this));
		goalSelector.add(1, new SummonLanternGoal(this));
		goalSelector.add(1, new LanternSwingGoal(this));
		goalSelector.add(1, new LanternSlamClawGoal(this));
		goalSelector.add(1, new LanternSlamGoal(this));
		goalSelector.add(1, new ProjectileGoal(this));
		goalSelector.add(2, new TeleportToTargetGoal(this));
		goalSelector.add(2, new ApproachTargetGoal(this, 0.45f));
		
		targetSelector.add(0, targetGoal = new BossTargetGoal(this, 16, 200, 0.4f));
	}
	
	@Override
	protected Text getDefaultName()
	{
		return super.getDefaultName().getWithStyle(Style.EMPTY.withFont(Formidulus.FONT)).getFirst();
	}
	
	@Override
	public boolean isBossBarVisible()
	{
		return super.isBossBarVisible() && dataTracker.get(SUMMONED) && dataTracker.get(ANIMATION) != SPAWN_SEQUENCE_ANIM;
	}
	
	@Override
	BossBar.Style getBossBarStyle()
	{
		return ClassTinkerers.getEnum(BossBar.Style.class, "DEER");
	}
	
	@Override
	public float getStepHeight()
	{
		return 1f;
	}
	
	@Override
	public void pushAwayFrom(Entity entity)
	{
	
	}
	
	@Override
	protected void pushAway(Entity entity)
	{
	
	}
	
	@Override
	public boolean canHit()
	{
		return getVanishingPercent() < 0.5f && dataTracker.get(SUMMONED);
	}
	
	@Override
	public boolean isPushedByFluids()
	{
		return false;
	}
	
	@Override
	public boolean isFireImmune()
	{
		return true;
	}
	
	@Override
	public void tick()
	{
		super.tick();
		if(!dataTracker.get(SUMMONED))
		{
			if(Formidulus.config.deerWarning.getValue() && warnTimer-- <= 0 && !getWorld().isClient)
			{
				getWorld().getEntitiesByType(TypeFilter.instanceOf(ServerPlayerEntity.class), getBoundingBox().expand(48f, 32f, 48f),
						p -> p.canTakeDamage() && p.getArmor() < 20)
						.forEach(p -> p.sendMessage(Text.translatable(Lang.MESSAGE_DEER_WARNING + random.nextInt(4))
															.setStyle(Style.EMPTY.withColor(Formatting.RED)), true));
				warnTimer = 500;
			}
			if(age % 20 != 0)
				return;
			if(!isAnyCultistNearby() && !getWorld().getEntitiesByType(TypeFilter.instanceOf(PlayerEntity.class),
					getBoundingBox().expand(12), p -> !p.isSpectator() && !p.isCreative()).isEmpty())
			{
				beginFight();
				setAnimation(SPAWN_SEQUENCE_ANIM);
				triggerMonologueSequence(SequenceTriggerPayload.SPAWN_SEQUENCE);
				dataTracker.set(SUMMONED, true);
			}
			else if(age % 1200 == 0 && getAllNearbyCultists().size() < getMaxCultists())
				spawnCultist(new Vec2f(3f, 8f), true);
			return;
		}
		int teleportTimer = getTeleportTimer();
		if(teleportTimer == getTeleportFadeDuration() - 1)
			playSound(SoundEvents.ENTITY_EVOKER_PREPARE_ATTACK, 1f, 1f + (1f - getTeleportFadeDuration() / 40f));
		if(teleportTimer == 0)
		{
			Vec3d dest = getNextTeleportDestination();
			playSound(SoundEvents.ENTITY_EVOKER_CAST_SPELL, 0.6f, 1f);
			setPosition(dest.x, dest.y, dest.z);
			if(getTarget() != null && distanceTo(getTarget()) < 6f)
				lookAt(EntityAnchorArgumentType.EntityAnchor.FEET, getTarget().getPos());
			playSound(SoundEvents.ENTITY_EVOKER_CAST_SPELL, 0.6f, 1f);
		}
		if(getWorld().isClient)
			return;
		if((getTarget() == null || getTarget().isRemoved()) && !isNotInAttackAnimation() && !isInSequence())
			cancelActiveGoals();
		if(getHealth() < getMaxHealth() * 0.75f && dataTracker.get(TELEPORT_COOLDOWN) > 0)
			dataTracker.set(TELEPORT_COOLDOWN, dataTracker.get(TELEPORT_COOLDOWN) - (int)(1 + getCooldownBonusSpeed()));
		if(isTeleporting())
			dataTracker.set(TELEPORT_TIMER, dataTracker.get(TELEPORT_TIMER) - 1);
		if(rangedDamageTaken > 0f)
			rangedDamageTaken -= 0.05f;
		if(dataTracker.get(RANGED) && isTargetValid())
			dataTracker.set(RANGED_COOLDOWN, dataTracker.get(RANGED_COOLDOWN) - (int)(1 + getCooldownBonusSpeed()));
		if(!dataTracker.get(RANGED) && rangedDamageTaken > 50)
		{
			dataTracker.set(RANGED, true);
			triggerMonologueSequence(SequenceTriggerPayload.PROJECTILE_SEQUENCE);
		}
		if(isTargetValid() && hasClaw())
		{
			if(dataTracker.get(STRONG_COOLDOWN) > 0)
				dataTracker.set(STRONG_COOLDOWN, dataTracker.get(STRONG_COOLDOWN) - (int)(1 + getCooldownBonusSpeed()));
		}
		
		bodyYaw = headYaw;
	}
	
	float getCooldownBonusSpeed()
	{
		return getWorld().getDifficulty().getId() * 0.44f * (1f - getHealthPercent());
	}
	
	@Override
	public void tickMovement()
	{
		super.tickMovement();
		tickTimedAnimationEffects(getCurrentAnimation());
		
		if(shouldEyesGlow())
			eyeGlow = Math.min(eyeGlow + 0.05f, 1f);
		else
			eyeGlow = Math.max(eyeGlow - 0.05f, 0f);
		float vanishing = getVanishingPercent();
		if(vanishing > 0f)
			eyeGlow = Math.max(MathHelper.clamp(vanishing * 2f - Math.max(vanishing * 10f - 6f, 0f), 0f, 1f), eyeGlow);
		
		//Vanishing Particle Effects; includes Swarm Attack Vanishing
		if(vanishing > 0f)
		{
			int particles = (int)Math.ceil(vanishing * 6);
			if(isTeleporting())
			{
				spawnVanishingParticles(particles, new Vec3d(getX(), getY(), getZ()));
				spawnVanishingParticles(particles, getNextTeleportDestination());
				return;
			}
			int swarmTicks = dataTracker.get(SWARM_TRANSITION_TICKS);
			if(swarmTicks > 0 && swarmTicks < 50)
			{
				if(dataTracker.get(SCHEDULED_SPAWNS) > 0)
				{
					spawnVanishingParticles(particles, new Vec3d(getX(), getY(), getZ()), dataTracker.get(SCHEDULED_SPAWNS) == 0 ? 1f : 1f - vanishing);
					for (int i = 0; i < (1f - (Math.abs(swarmTicks - 25) / 25f)) * 32; i++)
					{
						Vec3d dir = Vec3d.ZERO.addRandom(random, 1f).multiply(1, 0, 1).normalize().multiply(0.05f + random.nextFloat() * 0.1f);
						getWorld().addParticle(ParticleRegistry.RISING_DARKNESS, true, getX(), getY() + 0.2f, getZ(), dir.x, dir.y, dir.z);
					}
				}
				else
					spawnVanishingParticles(particles, new Vec3d(getX(), getY(), getZ()), dataTracker.get(SCHEDULED_SPAWNS) == 0 ? 1f : 1f - vanishing);
			}
		}
	}
	
	/**
	 * Mainly for timed Visual and Sound Effects. Some animation based state changes are handled here as well, like enabling the claw.<br>
	 * Ticks on both Client and Server.<br>
	 * <b>Timed Damage//Hit logic should be handled in {@link AnimatedAttackGoal}s</b>
	 */
	void tickTimedAnimationEffects(byte animationID)
	{
		float duration = getCurrentAnimationDuration();
		
		switch(animationID)
		{
			case SPAWN_SEQUENCE_ANIM -> {
				float darkness = duration - 6.5f;
				if(!getAnimationFlag(0))
				{
					setAnimationFlag(0, true);
					setAttackCooldown(20);
					if(!getWorld().isClient)
						dataTracker.set(ORIGIN, getBlockPos());
				}
				if(duration < 8.7f)
				{
					for (int i = 0; i < darkness * 3; i++)
					{
						Vec3d pos = new Vec3d(getX(), getY(), getZ()).add((random.nextFloat() - 0.5f) * 2.2f, random.nextFloat() * 4.5f * darkness / (8.7 - 6.5), (random.nextFloat() - 0.5f) * 2.2f);
						getWorld().addParticle(ParticleRegistry.DARKNESS, pos.x, pos.y, pos.z, 0f, 0f, 0f);
					}
				}
				applyReverence(18f - duration);
				if(!getWorld().isClient && duration >= 18f)
					setAnimation(IDLE_ANIM);
			}
			case SWING_ANIM -> {
				if(!getAnimationFlag(0) && duration >= 1.1f)
				{
					setAnimationFlag(0, true);
					getWorld().playSound(null, getBlockPos(), SoundEvents.ENTITY_WITCH_THROW, SoundCategory.HOSTILE, 0.8f, 0.1f);
				}
			}
			case SLAM_ANIM -> {
				if(!getAnimationFlag(0) && duration >= 1.25f)
				{
					setAnimationFlag(0, true);
					playSound(SoundEvents.ENTITY_WITCH_THROW, 0.8f, 0.6f);
				}
				if(!getAnimationFlag(1) && duration >= 2.65f)
				{
					setAnimationFlag(1, true);
					playSound(SoundEvents.ENTITY_WITCH_THROW, 1f, 0.5f);
				}
				if(!getAnimationFlag(2) && duration >= 2.9f)
				{
					setAnimationFlag(2, true);
					Vec3d impactOffset = new Vec3d(0.5, 0, 3).rotateY((float)Math.toRadians(-getYaw()));
					breakLanternEffect(impactOffset, true);
					for (int i = 0; i < (hasClaw() ? 6 : 3); i++) //increase in second phase
					{
						Vec3d vel = Vec3d.ZERO.addRandom(random, 1.5f);
						vel = new Vec3d(vel.x, Math.abs(vel.y * 0.2f), vel.z);
						IrrlichtEntity funke = new IrrlichtEntity(EntityRegistry.IRRLICHT, getWorld());
						funke.setOwner(this);
						funke.setPosition(getPos().add(impactOffset));
						funke.setVelocity(vel);
						funke.setLifetime(300 + (int)(random.nextFloat() * 50));
						getWorld().spawnEntity(funke);
					}
					BlockState state = getWorld().getBlockState(BlockPos.ofFloored(getPos().add(impactOffset).subtract(0f, 0.5f, 0f)));
					for (int i = 0; i < 32; i++)
					{
						Vec3d rand = Vec3d.ZERO.addRandom(random, 2f);
						Vec3d pos = getPos().add(impactOffset).add(0f, 0.1f, 0f).add(rand.multiply(1f, 0f, 1f));
						getWorld().addParticle(new BlockStateParticleEffect(ParticleTypes.DUST_PILLAR, state),
								pos.x, pos.y, pos.z, 0f, 0f, 0f);
					}
				}
			}
			case PHASE_TRANSITION_ANIM -> {
				if(!hasClaw())
					setHasClaw(true);
				if(hasLantern())
					setHasLantern(false);
				if(!getAnimationFlag(0) && duration >= 0f)
				{
					setAnimationFlag(0, true);
					triggerMonologueSequence(SequenceTriggerPayload.PHASE_TRANSITION_SEQUENCE);
					setAttackCooldown(20);
				}
				if(duration >= 3.5f && duration <= 4f)
				{
					if(!getAnimationFlag(1))
					{
						setAnimationFlag(1, true);
						playSound(SoundEvents.ENTITY_EVOKER_PREPARE_ATTACK, 0.6f, 1f);
					}
					spawnVanishingParticles(12, getPos());
					spawnVanishingParticles(12, getOriginBlock().toBottomCenterPos());
				}
				if(!getAnimationFlag(2) && duration >= 4.05f)
				{
					setAnimationFlag(2, true);
					BlockPos pos = dataTracker.get(ORIGIN);
					playSound(SoundEvents.ENTITY_EVOKER_CAST_SPELL, 0.6f, 1f);
					setPosition(pos.getX() + 0.5f, pos.getY(), pos.getZ() + 0.5f);
					playSound(SoundEvents.ENTITY_EVOKER_CAST_SPELL, 0.6f, 1f);
					if(getTarget() != null)
						lookAt(EntityAnchorArgumentType.EntityAnchor.FEET, getTarget().getPos());
					else
						setYaw(0);
				}
				if(getWorld().isClient && !getAnimationFlag(3) && duration >= 5.5f)
				{
					setAnimationFlag(3, true);
					playSound(SoundEvents.ENTITY_EVOKER_PREPARE_SUMMON, 5f, 1f);
					Vec3d dest = getPos().add((float)getRotationVector().x, getHeight() / 2f, (float)getRotationVector().z);
					for (int i = 0; i < 111; i++)
					{
						Vec3d dir = Vec3d.ZERO.addRandom(random, 1f).multiply(1f, 0f, 1f);
						Vec3d pos = getPos().add(dir.normalize().multiply((getRandom().nextFloat() - 0.5f) * 2f * 16f));
						BlockHitResult bHit = getWorld().raycast(new RaycastContext(pos.add(0f, 2f, 0f), pos.subtract(0f, 2f, 0f),
								RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, this));
						if(bHit.getType().equals(HitResult.Type.MISS))
							continue;
						getWorld().addParticle(new BloodDropParticleEffect(dest.toVector3f()),
								(float)pos.x, (float)bHit.getPos().y, (float)pos.z, 0f, 0f, 0f);
					}
				}
				if(!getAnimationFlag(4) && duration >= 13f)
				{
					setAnimationFlag(4, true);
					playSound(SoundEvents.BLOCK_RESPAWN_ANCHOR_SET_SPAWN, 5f, 0.6f);
				}
				if(duration > 4.05f)
					applyReverence(18f - duration);
				if(!getWorld().isClient && duration >= 18.05f)
					setAnimation(IDLE_ANIM);
			}
			case PREPARE_RUN_ATTACK_ANIM -> {
				for (int i = 0; i < 4; i++)
				{
					Vec3d pos = /*getBoundingBox().getCenter().addRandom(random, 2f)*/
							getPos().add(Vec3d.ZERO.addRandom(random, 2f).multiply(1f, 0f, 1f)).add(0, 0.1, 0);
					Vec3d vel = Vec3d.ZERO.addRandom(random, 0.5f);
					getWorld().addParticle(ParticleTypes.TRIAL_SPAWNER_DETECTION, true, pos.x, pos.y, pos.z, 0f, vel.y, 0f);
				}
			}
			case RUN_ATTACK_WALL_IMPACT_ANIM -> {
				if(!getAnimationFlag(0))
				{
					setAnimationFlag(0, true);
					breakLanternEffect(new Vec3d(1, 0, 0).rotateY((float)Math.toRadians(-getYaw())), true);
				}
				setHasLantern(false);
			}
			case SLAM_CLAW_ATTACK_ANIM -> {
				if(duration <= 2.7f) //lantern smashing should not be included due to it bouncing in this animation
				{
					tickTimedAnimationEffects(SLAM_ANIM); //uses up animation flags 0 & 1
					return;
				}
				if(!getAnimationFlag(2) && duration >= 2.9f)
				{
					setAnimationFlag(2, true);
					playSound(SoundEvents.BLOCK_VAULT_BREAK, 5f, 0.5f);
				}
				if(!getAnimationFlag(3) && duration >= 4.20f)
				{
					setAnimationFlag(3, true);
					playSound(SoundEvents.ENTITY_WITCH_THROW, 1f, 0.5f);
				}
				if(duration >= 4.3f && duration <= 5.3f)
				{
					Vec3d impactOffset = new Vec3d(0.5, 0, 3).rotateY((float)Math.toRadians(-getYaw()));
					if(!getAnimationFlag(4))
					{
						setAnimationFlag(4, true);
						breakLanternEffect(impactOffset, false);
						playSound(SoundEvents.ENTITY_DRAGON_FIREBALL_EXPLODE, 1f, 0.75f);
						BlockState state = getWorld().getBlockState(BlockPos.ofFloored(getPos().add(impactOffset).subtract(0f, 0.5f, 0f)));
						for (int i = 0; i < 32; i++)
						{
							Vec3d rand = Vec3d.ZERO.addRandom(random, 3f);
							Vec3d pos = getPos().add(impactOffset).add(0f, 0.1f, 0f).add(rand.multiply(1f, 0f, 1f));
							getWorld().addParticle(new BlockStateParticleEffect(ParticleTypes.DUST_PILLAR, state),
									pos.x, pos.y, pos.z, 0f, 0f, 0f);
						}
					}
					float intensity = 1f - (duration - 4.3f);
					Vec3d pos = getPos().add(impactOffset).add(0f, 0.1f, 0f);
					for (int i = 0; i < Math.round(48 * intensity); i++)
					{
						Vec3d dir = Vec3d.ZERO.addRandom(random, 1f).multiply(1f, 0f, 1f).normalize()
											.multiply((random.nextFloat() + 0.5f * (intensity + 0.1f)));
						getWorld().addParticle(ParticleTypes.FLAME, true, pos.x, pos.y, pos.z, dir.x, dir.y, dir.z);
					}
					for (int i = 0; i < Math.round(6 * intensity); i++)
					{
						getWorld().addParticle(ParticleTypes.LAVA, true, pos.x, pos.y, pos.z, 0f, 0f, 0f);
					}
					if(age % 3 == 0)
						playSound(SoundEvents.ITEM_FIRECHARGE_USE, 1.5f, 0.9f + random.nextFloat() * 0.2f);
				}
			}
			case DEATH_SEQUENCE_ANIM -> {
				if(getCurrentAnimation() == DEATH_SEQUENCE_ANIM)
					applyReverence(20f - duration);
				if(duration >= 28 && !isRemoved() && !getWorld().isClient)
				{
					getWorld().sendEntityStatus(this, EntityStatuses.ADD_DEATH_PARTICLES);
					remove(RemovalReason.KILLED);
					dropLoot(killingBlow, killer != null);
				}
			}
		}
		//TODO: add sounds and particles to run attacks
		//TODO: add sounds and particles simple claw attack
	}
	
	/**
	 * Visual and Sound Effects for the Lantern Breaking.
	 * @param offset forwards for the particles to be spawned; not aligned with yaw.
	 */
	void breakLanternEffect(Vec3d offset, boolean flames)
	{
		if(flames)
		{
			for (int i = 0; i < 32; i++)
			{
				Vec3d pos = getPos().add(offset).addRandom(random, 0.5f);
				Vec3d vel = Vec3d.ZERO.addRandom(random, 0.75f);
				vel = new Vec3d(vel.x, Math.abs(vel.y), vel.z);
				getWorld().addParticle(ParticleTypes.FLAME, pos.x, pos.y, pos.z, vel.x, vel.y, vel.z);
			}
		}
		for (int i = 0; i < 64; i++)
		{
			Vec3d pos = getPos().add(0f, 0.75f, 0f).add(offset).addRandom(random, 1.5f);
			getWorld().addParticle(new BlockStateParticleEffect(ParticleTypes.BLOCK, Blocks.LANTERN.getDefaultState()),
					pos.x, pos.y, pos.z, 0, 0, 0);
		}
		playSound(SoundEvents.BLOCK_VAULT_OPEN_SHUTTER, 0.8f, 0.6f);
		playSound(SoundEvents.BLOCK_VAULT_BREAK, 5f, 0.5f);
	}
	
	void spawnVanishingParticles(int count, Vec3d origin)
	{
		spawnVanishingParticles(count, origin, 1f);
	}
	
	void spawnVanishingParticles(int count, Vec3d origin, float heightPercent)
	{
		for (int i = 0; i < count; i++)
		{
			Vec3d pos = origin.add((random.nextFloat() - 0.5f) * 2f, random.nextFloat() * 4.5f * heightPercent, (random.nextFloat() - 0.5f) * 2f);
			Vec3d vel = Vec3d.ZERO.addRandom(random, 0.02f);
			getWorld().addParticle(ParticleRegistry.DARKNESS, true, pos.x, pos.y, pos.z, vel.x, vel.y, vel.z);
		}
	}
	
	@Override
	protected void playStepSound(BlockPos pos, BlockState state)
	{
		super.playStepSound(pos, state);
		if(hasLantern())
			playSound(SoundEvents.BLOCK_CHAIN_BREAK, 0.1f, 0.6f);
	}
	
	@Override
	protected void playHurtSound(DamageSource damageSource)
	{
		super.playHurtSound(damageSource);
		playSound(SoundEvents.ENTITY_SKELETON_HURT, 0.25f, 0.6f);
	}
	
	/**
	 * Apply {@link absolutelyaya.formidulus.effects.ReverenceStatusEffect} to all Participants of the Fight, and all other entities within 32 Blocks.<br>
	 * Needs to be run every tick while it should be active.<br>
	 * Used for Scripted Sequences.
	 * @param remainingTime How much time is left in the current Sequence; Players don't receive it anymore 2 seconds before other entities,
	 * 						so that they don't get ambushed.<br>
	 *                      <b>Does not affect length of the applied effect.</b>
	 */
	void applyReverence(float remainingTime)
	{
		if(getWorld().isClient)
			return;
		if(remainingTime > 2f) //players
		{
			bossFight.getAllParticipants()
					.forEach(p -> p.addStatusEffect(new StatusEffectInstance(StatusEffectRegistry.REVERENCE, 20, 0, false, false)));
		}
		if(remainingTime > 0f) //other entities
		{
			getWorld().getOtherEntities(this, getBoundingBox().expand(32), i -> !i.isPlayer())
					.forEach(e -> {
						if(!(e instanceof PlayerEntity) && e instanceof LivingEntity living)
							living.addStatusEffect(new StatusEffectInstance(StatusEffectRegistry.REVERENCE, 40, 0, false, true));
					});
		}
	}
	
	/**
	 * Apply {@link absolutelyaya.formidulus.effects.DarknessStatusEffect} to all participants of the Battle.<br>
	 * Used for Swarm Attack.
	 * @param duration duration of the effect.
	 */
	void applyDarkness(int duration)
	{
		if(getWorld().isClient)
			return;
		bossFight.getAllParticipants()
				.forEach(p -> p.addStatusEffect(new StatusEffectInstance(StatusEffectRegistry.DARKNESS, duration, 0,
						false, false, true)));
	}
	
	@Override
	public Vec3d getFocusPos()
	{
		if(getCurrentAnimation() == SPAWN_SEQUENCE_ANIM && getCurrentAnimationDuration() <= 8.5f)
		{
			float height = getCurrentAnimationDuration() - 6.5f;
			return getPos().add(0, Math.max(height / 2f, 0) * (getStandingEyeHeight() - 0.5f), 0);
		}
		if(getCurrentAnimation() == DEATH_SEQUENCE_ANIM)
		{
			if(getCurrentAnimationDuration() > 15f)
				return super.getFocusPos().subtract(0f, 0.5f + Math.min((getCurrentAnimationDuration() - 15f) / 2f, 1f), 0f);
		}
		return super.getFocusPos().subtract(0f, 0.5f, 0f);
	}
	
	/**
	 * Sends a {@link SequenceTriggerPayload} Packet to all participants of the Fight.<br>
	 * The Payload Class contains Constants for Sequence IDs.
	 * @param id ID of the Sequence.
	 */
	void triggerMonologueSequence(byte id)
	{
		if(getWorld().isClient || bossFight == null)
			return;
		bossFight.getAllParticipants().forEach(i -> ServerPlayNetworking.send(i, new SequenceTriggerPayload(id)));
	}
	
	/**
	 * @param id The given Animation ID.
	 * @return The {@link AnimationState} belonging to the given Animation ID Constant, OR Null if none matches.
	 */
	protected @Nullable AnimationState getAnimationState(byte id)
	{
		return switch(id)
		{
			default -> null;
			case UNSUMMONED_POSE -> unsummonedPoseAnimationState;
			case SPAWN_SEQUENCE_ANIM -> spawnSequenceAnimationState;
			case IDLE_ANIM -> idleAnimationState;
			case SWING_ANIM -> swingAnimationState;
			case SLAM_ANIM -> slamAnimationState;
			case SUMMON_LANTERN_ANIM -> summonLanternAnimationState;
			case PHASE_TRANSITION_ANIM -> phaseTransitionAnimationState;
			case SIMPLE_CLAW_ATTACK_ANIM -> simpleClawAttackAnimationState;
			case SLAM_CLAW_ATTACK_ANIM -> slamClawAnimationState;
			case PREPARE_RUN_ATTACK_ANIM -> prepareRunAttackAnimationState;
			case RUN_ATTACK_CLAW_ANIM -> runAttackClawAnimationState;
			case RUN_ATTACK_LANTERN_ANIM -> runAttackLanternAnimationState;
			case RUN_ATTACK_WALL_IMPACT_ANIM -> runAttackWallImpactAnimationState;
			case DEATH_SEQUENCE_ANIM -> deathAnimationState;
		};
	}
	
	@Override
	public boolean isTargetValid()
	{
		return super.isTargetValid() && !isInSequence();
	}
	
	public boolean isInSequence()
	{
		byte anim = getCurrentAnimation();
		return anim == SPAWN_SEQUENCE_ANIM || anim == PHASE_TRANSITION_ANIM || anim == DEATH_SEQUENCE_ANIM;
	}
	
	@Override
	public boolean isNotInAttackAnimation()
	{
		byte anim = getCurrentAnimation();
		return anim != SWING_ANIM && anim != SLAM_ANIM && anim != SUMMON_LANTERN_ANIM &&
					   anim != SIMPLE_CLAW_ATTACK_ANIM && anim != PREPARE_RUN_ATTACK_ANIM && anim != RUN_ATTACK_CLAW_ANIM &&
					   anim != SLAM_CLAW_ATTACK_ANIM && anim != RUN_ATTACK_LANTERN_ANIM;
	}
	
	public boolean shouldEyesGlow()
	{
		float animDuration = getCurrentAnimationDuration();
		if(getCurrentAnimation() == SPAWN_SEQUENCE_ANIM)
			return animDuration > 2f && animDuration < 8.5f;
		return hasClaw() && !(getCurrentAnimation() == PHASE_TRANSITION_ANIM && animDuration < 2f) && getCurrentAnimation() != DEATH_SEQUENCE_ANIM;
	}
	
	public float getEyeGlow()
	{
		return eyeGlow;
	}
	
	public boolean isSpineVisible()
	{
		if(getCurrentAnimation() == SPAWN_SEQUENCE_ANIM)
			return getCurrentAnimationDuration() >= 8.7f;
		return true;
	}
	
	public boolean hasLantern()
	{
		return dataTracker.get(LANTERN);
	}
	
	public void setHasLantern(boolean b)
	{
		dataTracker.set(LANTERN, b);
	}
	
	public boolean hasClaw()
	{
		return dataTracker.get(CLAW);
	}
	
	public void setHasClaw(boolean b)
	{
		dataTracker.set(CLAW, b);
	}
	
	public boolean shouldApplyLampArmPose()
	{
		byte anim = getCurrentAnimation();
		return anim == IDLE_ANIM || anim == RUN_ATTACK_CLAW_ANIM ||
					   anim == PREPARE_RUN_ATTACK_ANIM || anim == SIMPLE_CLAW_ATTACK_ANIM;
	}
	
	public boolean shouldApplyClawPose()
	{
		byte anim = getCurrentAnimation();
		return anim != PHASE_TRANSITION_ANIM && anim != DEATH_SEQUENCE_ANIM && anim != RUN_ATTACK_CLAW_ANIM &&
					   anim != SIMPLE_CLAW_ATTACK_ANIM && anim != RUN_ATTACK_WALL_IMPACT_ANIM && anim != SLAM_CLAW_ATTACK_ANIM;
	}
	
	public boolean shouldShowClawWithoutExtras()
	{
		return getCurrentAnimation() == SLAM_ANIM || getCurrentAnimation() == SWING_ANIM;
	}
	
	public boolean shouldRun()
	{
		return hasClaw();
	}
	
	public boolean shouldPlayRunAnimation()
	{
		return shouldRun() && getVelocity().length() > 0.1f;
	}
	
	public byte getRunAttackState()
	{
		return dataTracker.get(RUN_ATTACK);
	}
	
	public void setRunAttackState(byte attackType)
	{
		dataTracker.set(RUN_ATTACK, (byte)(attackType % 3));
	}
	
	public int getStrongAttackCooldown()
	{
		return dataTracker.get(STRONG_COOLDOWN);
	}
	
	public void setStrongCooldown(int ticks)
	{
		dataTracker.set(STRONG_COOLDOWN, ticks);
	}
	
	@Override
	public boolean shouldSpawnSprintingParticles()
	{
		return shouldPlayRunAnimation();
	}
	
	@Override
	protected void spawnSprintingParticles()
	{
		super.spawnSprintingParticles();
		if(getRunAttackState() == RUN_ATTACK_CLAW)
		{
			Vec3d pos = getPos().subtract(new Vec3d(1, 0, 1.5).rotateY((float)Math.toRadians(-getYaw())))
								.add(Vec3d.ZERO.addRandom(random, 1f).multiply(1f, 0, 1f));
			getWorld().addParticle(ParticleTypes.CRIT, pos.x, pos.y, pos.z, 0f, 1f + random.nextFloat() * 0.15f, 0f);
		}
	}
	
	@Override
	public boolean damage(DamageSource source, float amount)
	{
		if(source.isOf(DamageTypes.OUT_OF_WORLD) || source.isOf(DamageTypes.GENERIC_KILL))
			return super.damage(source, amount);
		if(isInSequence() || getVanishingPercent() > 0.5f || !isActive())
			return false;
		boolean b = super.damage(source, amount);
		if(getWorld().isClient)
			return b;
		if(b && (source.getAttacker() != null && distanceTo(source.getAttacker()) > 10) ||
				   (source.getSource() != null && source.getSource() instanceof ProjectileEntity))
			rangedDamageTaken += amount; //let's keep it raw
		if(getHealth() <= 0)
		{
			dataTracker.set(DYING, true);
			cancelActiveGoals();
			setAnimation(DEATH_SEQUENCE_ANIM);
			triggerMonologueSequence(SequenceTriggerPayload.DEATH_SEQUENCE);
			shouldUpdateBossbar = false;
			if(bossBar != null)
				bossBar.setPercent(0f);
			setHealth(1f);
			killingBlow = source;
			if(source.getAttacker() instanceof PlayerEntity player)
				killer = player;
			if(killer == null && source.getSource() instanceof PlayerEntity player)
				killer = player;
			if(killer != null)
				lookAt(EntityAnchorArgumentType.EntityAnchor.EYES, killer.getEyePos());
			bossFight.markWon();
			BossFightManager.INSTANCE.endFight(bossFight);
			return b;
		}
		if(!dataTracker.get(CLAW) && b && getHealth() <= getMaxHealth() / 2f && getHealth() > 0f)
		{
			cancelActiveGoals();
			setAnimation(PHASE_TRANSITION_ANIM);
			dataTracker.set(CLAW, true);
			setHealth(getMaxHealth() / 2f);
			return true;
		}
		if((swarmAttack == 0 && getHealthPercent() < 0.75f) || (swarmAttack == 1 && getHealthPercent() < 0.25f))
		{
			swarmAttackPending = true;
			swarmAttack++;
		}
		return b;
	}
	
	@Override
	protected void cancelActiveGoals()
	{
		super.cancelActiveGoals();
		dataTracker.set(TELEPORT_TIMER, Integer.MIN_VALUE);
		setAnimation(IDLE_ANIM);
		getWorld().getEntitiesByType(TypeFilter.instanceOf(IrrlichtEntity.class), box(getPos()).expand(32), i -> i.owner == this)
				.forEach(LivingEntity::kill);
	}
	
	@Override
	protected boolean shouldDropLoot()
	{
		return false; //handled in UpdatePostDeath instead
	}
	
	@Override
	protected void updatePostDeath()
	{
		if(getRecentDamageSource() instanceof DamageSource source && (source.isOf(DamageTypes.GENERIC_KILL) || source.isOf(DamageTypes.OUT_OF_WORLD)))
		{
			getWorld().sendEntityStatus(this, EntityStatuses.ADD_DEATH_PARTICLES);
			remove(RemovalReason.KILLED);
		}
	}
	
	@Override
	public void handleStatus(byte status)
	{
		if(status == EntityStatuses.ADD_DEATH_PARTICLES)
		{
			for (int i = 0; i < 160; i++)
			{
				Vec3d pos = new Vec3d(getX(), getY(), getZ()).add(new Vec3d((random.nextFloat() - 0.5f) * 2f, random.nextFloat() * 0.75f,
						(random.nextFloat() - 0.5f) * 4f).rotateY((float)Math.toRadians(-bodyYaw)));
				Vec3d vel = Vec3d.ZERO.addRandom(random, 0.01f).multiply(1, 0, 1);
				getWorld().addParticle(ParticleRegistry.RISING_DARKNESS, pos.x, pos.y, pos.z, vel.x, vel.y, vel.z);
			}
			return;
		}
		super.handleStatus(status);
	}
	
	void setNextTeleport(Vec3d destination, int delay)
	{
		dataTracker.set(TELEPORT_TIMER, delay);
		dataTracker.set(NEXT_TELEPORT_DEST, destination.toVector3f());
	}
	
	public int getTeleportTimer()
	{
		return dataTracker.get(TELEPORT_TIMER);
	}
	
	public Vec3d getNextTeleportDestination()
	{
		return new Vec3d(dataTracker.get(NEXT_TELEPORT_DEST));
	}
	
	public float getVanishingPercent()
	{
		if(dataTracker.get(SWARM_TRANSITION_TICKS) > 0)
			return Math.min(dataTracker.get(SWARM_TRANSITION_TICKS) / 20f, 1f);
		return MathHelper.clamp(1f - (Math.abs((float)getTeleportTimer()) / (float) getTeleportFadeDuration()), 0f, 1f);
	}
	
	public boolean isReadyToAttack()
	{
		return super.isReadyToAttack() && dataTracker.get(SUMMONED) && !isInSequence() && getVanishingPercent() < 0.33f && !isAboutToTeleport() &&
					   dataTracker.get(SCHEDULED_SPAWNS) == 0 && getRunAttackState() == RUN_ATTACK_NONE && !dataTracker.get(DYING);
	}
	
	public boolean isReadyToTeleport()
	{
		return dataTracker.get(TELEPORT_COOLDOWN) <= 0 && getHealthPercent() <= 0.75f;
	}
	
	public void setTeleportCooldown(int cooldown)
	{
		dataTracker.set(TELEPORT_COOLDOWN, cooldown);
	}
	
	public int getTeleportFadeDuration()
	{
		return 40 - (20 * Math.round(1f - (Math.max(getHealthPercent(), 0.5f) - 0.5f) * 4f));
	}
	
	public boolean isTeleporting()
	{
		return dataTracker.get(TELEPORT_TIMER) > -getTeleportFadeDuration();
	}
	
	public boolean isAboutToTeleport()
	{
		return dataTracker.get(TELEPORT_TIMER) >= 0;
	}
	
	@Override
	protected float applyArmorToDamage(DamageSource source, float amount)
	{
		float armor = (float)getAttributeValue(EntityAttributes.GENERIC_ARMOR) * (getWorld().getDifficulty().getId() * 0.75f + 1f);
		float toughness = (float)getAttributeValue(EntityAttributes.GENERIC_ARMOR_TOUGHNESS) * (getWorld().getDifficulty().getId() * 0.75f + 1f);
		return DamageUtil.getDamageLeft(this, amount, source, armor, toughness);
	}
	
	@Override
	public void forceReset()
	{
		super.forceReset();
		getAllNearbyCultists().forEach(i -> {
			if(i.getMaster().equals(this))
				i.discard();
		});
	}
	
	@Override
	public void afterBossReset()
	{
		Vec2f range = new Vec2f(2f, 7f);
		int count = getMaxCultists() - getAllNearbyCultists().size();
		for (int i = 0; i < count; i++)
			spawnCultist(range, true);
	}
	
	@Override
	public BossType getBossType()
	{
		return BossType.DEER;
	}
	
	@Override
	public boolean isActive()
	{
		return dataTracker.get(SUMMONED);
	}
	
	int getMaxCultists()
	{
		return 4 + (Math.max(getWorld().getDifficulty().getId() - 2, 0));
	}
	
	boolean isAnyCultistNearby()
	{
		return !getAllNearbyCultists().isEmpty();
	}
	
	List<DeerFollowerEntity> getAllNearbyCultists()
	{
		return getWorld().getEntitiesByType(TypeFilter.instanceOf(DeerFollowerEntity.class),
				Box.from(getOriginBlockMinCorner()).expand(48), LivingEntity::isPartOfGame);
	}
	
	@Override
	public boolean isInvisible()
	{
		return super.isInvisible() || dataTracker.get(SWARM_TRANSITION_TICKS) == 50;
	}
	
	public void spawnCultist(Vec2f distanceRange, boolean persistent)
	{
		if(!(getWorld() instanceof ServerWorld serverWorld))
			return;
		DeerFollowerEntity cultist = new DeerFollowerEntity(EntityRegistry.DEER_FOLLOWER, getWorld());
		Vec3d pos = null;
		for (int ii = 0; ii < 16; ii++)
		{
			Vec3d dir = Vec3d.ZERO.addRandom(random, 1f).multiply(1f, 0f, 1f).normalize();
			Vec3d randomPos = getPos().add(dir.multiply(MathHelper.lerp(random.nextFloat(), distanceRange.x, distanceRange.y)));
			BlockHitResult bHit = getWorld().raycast(new RaycastContext(randomPos.add(0f, 6f, 0f), randomPos.subtract(0f, 12f, 0f),
					RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, this));
			if(!bHit.getType().equals(HitResult.Type.MISS) && getWorld().isSpaceEmpty(cultist.getBoundingBox().offset(bHit.getPos())))
			{
				pos = bHit.getPos();
				break;
			}
		}
		if(pos == null)
		{
			cultist.discard();
			Formidulus.LOGGER.warn("Couldn't find valid spot to spawn Cultist around Deer at [{} {} {}]", getX(), getY(), getZ());
			return;
		}
		cultist.setMaster(this);
		cultist.setPosition(pos);
		cultist.setTarget(getRandomTarget());
		if(persistent)
			cultist.setPersistent();
		if(getWorld().spawnEntity(cultist))
		{
			getWorld().sendEntityStatus(cultist, EntityStatuses.PLAY_SPAWN_EFFECTS);
			cultist.initialize(serverWorld, getWorld().getLocalDifficulty(getBlockPos()), SpawnReason.SPAWNER, null);
		}
	}
	
	@Override
	public boolean onKilledOther(ServerWorld world, LivingEntity other)
	{
		if(targetGoal.isHasNoTargets())
			combatTimer = 0;
		return super.onKilledOther(world, other);
	}
	
	@Override
	public List<Class<? extends LivingEntity>> getIgnoredClasses()
	{
		return ignoredClasses;
	}
	
	public int getRunAttackAnimSpeed()
	{
		return dataTracker.get(RUN_ATTACK_ANIM_SPEED);
	}
	
	@Override
	boolean shouldFightBeActive()
	{
		return dataTracker.get(SUMMONED);
	}
	
	@Override
	public void readCustomDataFromNbt(NbtCompound nbt)
	{
		if(nbt.contains("Summoned", NbtElement.BYTE_TYPE))
		{
			dataTracker.set(SUMMONED, nbt.getBoolean("Summoned"));
			setAnimation(IDLE_ANIM);
		}
		if(nbt.contains("Claw", NbtElement.BYTE_TYPE))
			dataTracker.set(CLAW, nbt.getBoolean("Claw"));
		if(nbt.contains("Lantern", NbtElement.BYTE_TYPE))
			dataTracker.set(LANTERN, nbt.getBoolean("Lantern"));
		if(nbt.contains("Ranged", NbtElement.BYTE_TYPE))
			dataTracker.set(RANGED, nbt.getBoolean("Ranged"));
		if(nbt.contains("RangedDamageTaken", NbtElement.FLOAT_TYPE))
			rangedDamageTaken = nbt.getFloat("RangedDamageTaken");
		if(nbt.contains("SwarmAttack", NbtElement.INT_TYPE))
			swarmAttack = nbt.getInt("SwarmAttack");
		super.readCustomDataFromNbt(nbt);
	}
	
	@Override
	public void writeCustomDataToNbt(NbtCompound nbt)
	{
		super.writeCustomDataToNbt(nbt);
		if(dataTracker.get(SUMMONED))
			nbt.putBoolean("Summoned", true);
		if(dataTracker.get(LANTERN))
			nbt.putBoolean("Lantern", true);
		if(dataTracker.get(CLAW))
			nbt.putBoolean("Claw", true);
		if(dataTracker.get(RANGED))
			nbt.putBoolean("Ranged", true);
		if(rangedDamageTaken > 0f)
			nbt.putFloat("RangedDamageTaken", rangedDamageTaken);
		if(swarmAttack > 0)
			nbt.putInt("SwarmAttack", swarmAttack);
	}
	
	/**
	 * Swing the Lantern Horizontally. Throws hit entities away and deals moderate damage.<br>
	 * <b>Lantern Required</b>
	 */
	static class LanternSwingGoal extends AnimatedAttackGoal<DeerGodEntity>
	{
		public LanternSwingGoal(DeerGodEntity mob)
		{
			super(mob, SWING_ANIM, 2.45f, IDLE_ANIM);
		}
		
		@Override
		public boolean canStart()
		{
			return mob.hasLantern() && super.canStart() && mob.distanceTo(mob.getTarget()) < 4f && (mob.random.nextFloat() <= 1.2f / (mob.swingChain + 1));
		}
		
		@Override
		public void start()
		{
			super.start();
			mob.navigation.stop();
			mob.lookAt(EntityAnchorArgumentType.EntityAnchor.EYES, target.getEyePos());
			mob.prevBodyYaw = mob.bodyYaw = mob.headYaw;
			mob.swingChain++;
		}
		
		@Override
		public boolean shouldContinue()
		{
			return super.shouldContinue() && !mob.isInSequence();
		}
		
		@Override
		public void tick()
		{
			super.tick();
			if(time >= 22 && time <= 30)
			{
				float rotation = (float)Math.toRadians(135f - (time - 22f) / 8 * 225f);
				Vec3d forwards = mob.getRotationVector().rotateY(rotation);
				mob.applyDamageInCylindricArea(4.5f, mob.getHeight() * 0.75f, 28.125f, //covers the entire arc over 8 checks
						DamageSources.get(mob.getWorld(), DamageSources.LANTERN, mob), 15f, forwards,
						(hit, success) -> {
							if(success)
								hit.setVelocity(forwards.normalize().multiply(2f).add(0f, 0.2f, 0f));
						});
			}
		}
		
		@Override
		protected int getAttackCooldown()
		{
			return 1;
		}
	}
	
	/**
	 * Throw the Lantern up and then slam it onto the Ground.<br>
	 * Entities can be hit by the upwards swing, which deals low damage, but sends them flying upwards.<br>
	 * Entities can also be hit by the slam, which does large AOE damage. The Closer to the impact, the higher the damage and knockback.<br>
	 * <b>Lantern Required</b>
	 */
	static class LanternSlamGoal extends AnimatedAttackGoal<DeerGodEntity>
	{
		public LanternSlamGoal(DeerGodEntity mob)
		{
			super(mob, SLAM_ANIM, 5.8f, IDLE_ANIM);
		}
		public LanternSlamGoal(DeerGodEntity mob, byte attackAnimationId, float duration, byte postAnimationId)
		{
			super(mob, attackAnimationId, duration, postAnimationId);
		}
		
		@Override
		public boolean canStart()
		{
			return mob.hasLantern() && super.canStart() && mob.distanceTo(mob.getTarget()) < 7f && (mob.swingChain > 1 || mob.random.nextFloat() < 0.01f);
		}
		
		@Override
		public void start()
		{
			super.start();
			mob.navigation.stop();
			mob.lookAt(EntityAnchorArgumentType.EntityAnchor.EYES, target.getEyePos());
			mob.prevBodyYaw = mob.bodyYaw = mob.headYaw;
			mob.swingChain = 0;
		}
		
		@Override
		public boolean shouldContinue()
		{
			return super.shouldContinue() && !mob.isInSequence();
		}
		
		@Override
		public void tick()
		{
			super.tick();
			if(time < 40)
			{
				mob.lookAt(EntityAnchorArgumentType.EntityAnchor.EYES, target.getEyePos());
				mob.prevBodyYaw = mob.bodyYaw = mob.headYaw;
			}
			if(time >= 25 && time <= 27)
			{
				mob.applyDamageInCylindricArea(4f, mob.getHeight(), 22.5f, DamageSources.get(mob.getWorld(), DamageSources.LANTERN, mob), 12f,
						(hit, success) -> {
							if(success)
								hit.setVelocity(mob.getRotationVector().multiply(1f, 0f, 1f).normalize().multiply(0.5f).add(0f, 1.5f, 0f));
						});
			}
			if(time == 58)
			{
				mob.setHasLantern(false);
				impact(9f, 7.5f, 1f);
			}
		}
		
		protected void impact(float radius, float falloffDistance, float strengthMultiplier)
		{
			Vec3d impact = mob.getPos().add(new Vec3d(0.5, 0, 3).rotateY((float)Math.toRadians(-mob.getYaw())));
			List<LivingEntity> hits = mob.getWorld().getNonSpectatingEntities(LivingEntity.class,
					Box.from(impact.subtract(0.5, 0.5, 0.5)).expand(radius));
			for (LivingEntity hit : hits)
			{
				if(mob.getIgnoredClasses().contains(hit.getClass()))
					continue;
				float strength = Math.max(1f - (float)impact.distanceTo(hit.getPos()) / falloffDistance, 0f) * strengthMultiplier;
				if(strength <= 0f)
					continue;
				if(strength * 20f > 0f && hit.damage(DamageSources.get(mob.getWorld(), DamageSources.LANTERN, mob), strength * 20f))
				{
					hit.setVelocity(hit.getPos().subtract(impact).normalize().multiply(strength * 4f).add(0f, strength, 0f));
					mob.onDamageEntity(hit);
				}
			}
		}
		
		@Override
		protected int getAttackCooldown()
		{
			return (int)((20 + mob.random.nextFloat() * 30) *  Math.max(mob.getHealth() / mob.getMaxHealth(), 0.2f));
		}
	}
	
	/**
	 * Re-Summon the Lantern if none is held currently.
	 */
	static class SummonLanternGoal extends AnimatedAttackGoal<DeerGodEntity>
	{
		public SummonLanternGoal(DeerGodEntity mob)
		{
			super(mob, SUMMON_LANTERN_ANIM, 2.75f, IDLE_ANIM);
		}
		
		@Override
		public boolean canStart()
		{
			return !mob.hasLantern() && super.canStart() && (mob.random.nextFloat() < 0.33f || !mob.hasClaw());
		}
		
		@Override
		public void start()
		{
			super.start();
			mob.navigation.stop();
		}
		
		@Override
		public void tick()
		{
			super.tick();
			if(time == 35)
				mob.setHasLantern(true);
		}
		
		@Override
		public boolean canStop()
		{
			return true;
		}
		
		@Override
		protected int getAttackCooldown()
		{
			return 10 + (int)(mob.random.nextFloat() * 5);
		}
	}
	
	/**
	 * Move towards Target. Significantly faster in second Phase.<br>
	 * If the target can't be navigated to, or has been pursued without reaching it for a certain amount of time, set teleport cooldown to 0.
	 */
	static class ApproachTargetGoal extends InterruptableGoal
	{
		final DeerGodEntity mob;
		int time;
		boolean failed;
		float speed;
		
		public ApproachTargetGoal(DeerGodEntity mob, float speed)
		{
			this.mob = mob;
			this.speed = speed;
			setControls(EnumSet.of(Control.MOVE, Control.LOOK));
		}
		
		@Override
		public boolean canStart()
		{
			return mob.isReadyToAttack();
		}
		
		@Override
		public void start()
		{
			super.start();
			failed = false;
			time = 0;
		}
		
		@Override
		public boolean shouldContinue()
		{
			return mob.isTargetValid() && mob.isNotInAttackAnimation() && !(mob.distanceTo(mob.getTarget()) <= 3f || failed) && !mob.isTeleporting();
		}
		
		@Override
		public void tick()
		{
			time++;
			super.tick();
			if(mob.getTarget() == null || mob.getTarget().isRemoved())
			{
				mob.navigation.stop();
				mob.moveControl.moveTo(mob.getX(), mob.getY(), mob.getZ(), 0f);
				failed = true;
				stop();
				return;
			}
			failed = mob.getTarget().getPos().distanceTo(mob.getOriginBlock().toBottomCenterPos()) > 32f || ++time > 200;
			if(mob.distanceTo(mob.getTarget()) <= 3f || failed)
				return;
			Vec3d target = mob.getTarget().getPos();
			if(mob.getWorld().raycast(new RaycastContext(mob.getPos().add(0f, 1.5f, 0f), mob.getTarget().getPos().add(0f, 1.5f, 0f),
					RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, mob)).getType().equals(HitResult.Type.BLOCK))
				mob.navigation.startMovingTo(mob.getTarget(), speed * (mob.shouldRun() ? 1.5f : 1f));
			else
				mob.moveControl.moveTo(target.x, target.y, target.z, speed * (mob.shouldRun() ? 1.75f : 1.25f));
			//mob.lookAt(EntityAnchorArgumentType.EntityAnchor.EYES, mob.getTarget().getEyePos());
		}
		
		@Override
		public void stop()
		{
			mob.navigation.stop();
			mob.moveControl.moveTo(mob.getX(), mob.getY(), mob.getZ(), 0f);
			super.stop();
			if(failed)
				mob.setTeleportCooldown(0);
		}
	}
	
	/**
	 * Base Teleport Goal. If the chosen teleport destination isn't valid, don't teleport; but still apply cooldown.<br>
	 * <b>Becomes available <=75% Health</b>
	 */
	static abstract class DeerTeleportGoal extends InterruptableGoal
	{
		final DeerGodEntity mob;
		
		public DeerTeleportGoal(DeerGodEntity mob)
		{
			this.mob = mob;
		}
		
		@Override
		public boolean canStart()
		{
			return mob.isReadyToAttack() && mob.isReadyToTeleport();
		}
		
		@Override
		public void start()
		{
			super.start();
			mob.navigation.stop();
			Vec3d dest = getTeleportDestination();
			if(dest != null && isDestinationFree(dest))
			{
				mob.setNextTeleport(dest, getTeleportDelay());
				mob.navigation.stop();
			}
			else
				Formidulus.LOGGER.warn("Deer couldn't find a free spot to teleport to!");
			mob.setTeleportCooldown((int)((200 + (mob.random.nextFloat())) * Math.max(mob.getHealth() / mob.getMaxHealth(), 0.2f)));
			stop();
		}
		
		protected abstract @Nullable Vec3d getTeleportDestination();
		
		protected int getTeleportDelay()
		{
			return mob.getTeleportFadeDuration();
		}
		
		boolean isDestinationFree(Vec3d dest)
		{
			return mob.getWorld().isSpaceEmpty(mob.getBoundingBox().offset(mob.getPos().multiply(-1)).offset(dest));
		}
		
		protected boolean isCanReachTarget()
		{
			return mob.navigation.findPathTo(mob.getTarget(), 16) != null;
		}
	}
	
	/**
	 * Teleport to a random position within a certain range of the origin.<br>
	 * <b>Becomes available <=75% Health</b>
	 */
	static class TeleportRandomlyGoal extends DeerTeleportGoal
	{
		Vec3d origin;
		
		public TeleportRandomlyGoal(DeerGodEntity mob)
		{
			super(mob);
		}
		
		@Override
		public boolean canStart()
		{
			return super.canStart() && ((!mob.hasClaw() && !mob.hasLantern() && mob.getTarget() != null && mob.distanceTo(mob.getTarget()) < 5) ||
												(mob.random.nextFloat() < (isCanReachTarget() ? 0.01f : 0.05f)));
		}
		
		@Override
		public void start()
		{
			origin = mob.getOriginBlock().toBottomCenterPos();
			super.start();
		}
		
		@Override
		protected @Nullable Vec3d getTeleportDestination()
		{
			for (int i = 0; i < 8; i++)
			{
				Vec3d dest = origin.add((mob.random.nextFloat() - 0.5) * 2f * 16f, 8f, (mob.random.nextFloat() - 0.5) * 2f * 16f);
				BlockHitResult bHit = mob.getWorld().raycast(new RaycastContext(dest, dest.subtract(0, 16f, 0), RaycastContext.ShapeType.COLLIDER,
						RaycastContext.FluidHandling.NONE, mob));
				if(!bHit.getType().equals(HitResult.Type.MISS) && isDestinationFree(bHit.getPos()))
					return bHit.getPos();
			}
			return null;
		}
	}
	
	/**
	 * Teleport to within a few Blocks of the current target.<br>
	 * It's sort of like teleporting towards the target, meaning if the deer is north to it's target, it'll still be north of it after teleporting.<br>
	 * <b>Becomes available <=75% Health</b>
	 */
	static class TeleportToTargetGoal extends DeerTeleportGoal
	{
		public TeleportToTargetGoal(DeerGodEntity mob)
		{
			super(mob);
		}
		
		@Override
		public boolean canStart()
		{
			return super.canStart() && mob.getTarget() != null && (mob.distanceTo(mob.getTarget()) > 10 || !isCanReachTarget());
		}
		
		@Override
		public void start()
		{
			super.start();
			if(mob.getTarget() != null)
				mob.lookAt(EntityAnchorArgumentType.EntityAnchor.FEET, mob.getTarget().getPos());
		}
		
		@Override
		protected @Nullable Vec3d getTeleportDestination()
		{
			LivingEntity target = mob.getTarget();
			if(target == null)
				return null;
			Vec3d dir = mob.getPos().subtract(target.getPos()).multiply(1f, 0f, 1f).normalize();
			for (int i = 0; i < 36; i++)
			{
				float rot = i / 2f * (i % 2 == 0 ? -1 : 1) * 20f;
				Vec3d dest = target.getPos().add(dir.rotateY((float)Math.toRadians(rot)).multiply(2.5f + mob.random.nextFloat()));
				BlockHitResult bHit = mob.getWorld().raycast(new RaycastContext(dest.add(0, 2, 0), dest.subtract(0, 2, 0), RaycastContext.ShapeType.COLLIDER,
						RaycastContext.FluidHandling.NONE, mob));
				if(!bHit.getType().equals(HitResult.Type.MISS) && isDestinationFree(bHit.getPos()))
					return bHit.getPos();
			}
			return null;
		}
	}
	
	/**
	 * Spawn Irrlichter that rise upwards and then turn into Volatile Pumpkins.<br>
	 * The Number and rate is based on difficulty and how much Ranged Damage has been dealt to the deer.<br>
	 * They aim at a random target; their speed is based on difficulty<br>
	 * <b>Becomes available once a certain amount of Ranged Damage has been dealt to the deer.<br>
	 * This Amount wears off over time and with every summon; Once it goes below a certain threshold, this attack becomes unavailable again</b>
	 */
	static class ProjectileGoal extends InterruptableGoal
	{
		final DeerGodEntity mob;
		
		public ProjectileGoal(DeerGodEntity mob)
		{
			this.mob = mob;
		}
		
		@Override
		public boolean canStart()
		{
			return !mob.isInSequence() && mob.dataTracker.get(RANGED) && mob.dataTracker.get(RANGED_COOLDOWN) <= 0 && mob.rangedDamageTaken > 10;
		}
		
		@Override
		public void start()
		{
			super.start();
			float amount = (1f - mob.getHealth() / mob.getMaxHealth()) * 4f + mob.getWorld().getDifficulty().getId() * 0.33f;
			for (int i = 0; i < Math.max(amount, 1); i++)
			{
				Vec3d pos = mob.getPos().add(0, -1, 0)
									.add((mob.random.nextFloat() - 0.5f) * 2f * 4f, 0f, (mob.random.nextFloat() - 0.5f) * 2f * 4f);
				IrrlichtEntity funke = new IrrlichtEntity(EntityRegistry.IRRLICHT, mob.getWorld());
				funke.setOwner(mob);
				funke.setPosition(pos);
				funke.setType(IrrlichtEntity.PROJECTILE_TYPE);
				funke.lifetime = 100 - (int)(mob.random.nextFloat() * 40f);
				mob.getWorld().spawnEntity(funke);
			}
			mob.dataTracker.set(RANGED_COOLDOWN, (int)(((100 + mob.random.nextFloat() * 200) - mob.getWorld().getDifficulty().getId() * 20) *
								  ((mob.getHealth() / mob.getMaxHealth() < 0.5f ? 0.5f : 1f))));
			mob.rangedDamageTaken -= amount / Math.max(mob.getWorld().getDifficulty().getId(), 1);
		}
	}
	
	/**
	 * Vanish and spawn Cultists; the amount is based on difficulty and how often the attack has been performed.<br>
	 * Re-Appear after all Cultists have been slain, or no valid targets are left.<br>
	 * <b>Only performed once at 75% and 25% Health</b>
	 */
	static class SwarmGoal extends InterruptableGoal
	{
		final DeerGodEntity mob;
		int fade, spawnCooldown;
		
		public SwarmGoal(DeerGodEntity mob)
		{
			this.mob = mob;
		}
		
		@Override
		public boolean canStart()
		{
			return mob.swarmAttackPending && mob.isReadyToAttack();
		}
		
		@Override
		public void start()
		{
			super.start();
			mob.dataTracker.set(SCHEDULED_SPAWNS, 4 + mob.getWorld().getDifficulty().getId() * mob.swarmAttack);
			mob.navigation.stop();
			mob.moveControl.moveTo(mob.getX(), mob.getY(), mob.getZ(), 0f);
		}
		
		@Override
		public boolean shouldRunEveryTick()
		{
			return true;
		}
		
		@Override
		public boolean shouldContinue()
		{
			return (fade > 0 || mob.dataTracker.get(SCHEDULED_SPAWNS) > 0 || mob.dataTracker.get(SWARM_TRANSITION_TICKS) > 0 || mob.isAnyCultistNearby()) &&
						   !mob.isInSequence();
		}
		
		@Override
		public void tick()
		{
			int cultists = mob.getAllNearbyCultists().size();
			if(fade < 50 && mob.dataTracker.get(SCHEDULED_SPAWNS) > 0)
				mob.dataTracker.set(SWARM_TRANSITION_TICKS, ++fade);
			else if(fade > 0 && mob.dataTracker.get(SCHEDULED_SPAWNS) <= 0 && cultists == 0)
				mob.dataTracker.set(SWARM_TRANSITION_TICKS, --fade);
			if(fade > 20)
				mob.applyDarkness((fade - 10));
			if(cultists <= 1)
				spawnCooldown -= 2;
			if(fade < 50 || mob.dataTracker.get(SCHEDULED_SPAWNS) <= 0 || spawnCooldown-- > 0 || cultists >= mob.getMaxCultists())
				return;
			if(mob.getPos().distanceTo(mob.getOriginBlock().toBottomCenterPos()) > 1f)
				mob.setPosition(mob.getOriginBlock().toCenterPos());
			mob.spawnCultist(new Vec2f(10, 15), false);
			mob.setTarget(mob.getRandomTarget());
			mob.playSound(SoundEvents.ENTITY_EVOKER_CAST_SPELL, 1f, 1f);
			spawnCooldown = 80 * cultists - 10 * mob.getWorld().getDifficulty().getId();
			mob.dataTracker.set(SCHEDULED_SPAWNS, mob.dataTracker.get(SCHEDULED_SPAWNS) - 1);
		}
		
		@Override
		public boolean canStop()
		{
			return false;//!shouldContinue();
		}
		
		@Override
		public void stop()
		{
			super.stop();
			mob.swarmAttackPending = false;
		}
		
		@Override
		public void interrupt()
		{
			super.interrupt();
			mob.dataTracker.set(SWARM_TRANSITION_TICKS, 0);
			mob.dataTracker.set(SCHEDULED_SPAWNS, 0);
		}
	}
	
	/**
	 * Slash at the current target with its Claw.<br>
	 * <b>Claw Required</b>
	 */
	static class SimpleClawAttackGoal extends AnimatedAttackGoal<DeerGodEntity>
	{
		public SimpleClawAttackGoal(DeerGodEntity mob)
		{
			super(mob, SIMPLE_CLAW_ATTACK_ANIM, 1.8f, IDLE_ANIM);
		}
		
		@Override
		public boolean canStart()
		{
			return mob.hasClaw() && super.canStart() && mob.distanceTo(mob.getTarget()) < 4f && mob.random.nextFloat() < 0.5f;
		}
		
		@Override
		public boolean shouldContinue()
		{
			return super.shouldContinue() && !mob.isInSequence();
		}
		
		@Override
		public void tick()
		{
			super.tick();
			if(time < 10 && mob.getTarget() != null)
				mob.lookAt(EntityAnchorArgumentType.EntityAnchor.EYES, mob.getTarget().getEyePos());
			if(time > 16 && time < 20)
			{
				mob.applyDamageInCylindricArea(4.25f, mob.getHeight(), 50f, DamageSources.get(mob.getWorld(), DamageSources.CLAW, mob), 20f,
						(hit, success) -> {
							if(success)
								hit.setVelocity(mob.getRotationVector().multiply(1f, 0f, 1f).normalize().multiply(2f));
						});
			}
		}
		
		@Override
		protected int getAttackCooldown()
		{
			return 0;
		}
	}
	
	/**
	 * Slams the Lantern like in {@link LanternSlamGoal}; but it doesn't break.<br>
	 * Instead, it bounces and is then shattered by a flat hand slam using the claw; which causes a wave of fire damaging and burning anything in a large radius.
	 */
	static class LanternSlamClawGoal extends LanternSlamGoal
	{
		public LanternSlamClawGoal(DeerGodEntity mob)
		{
			super(mob, SLAM_CLAW_ATTACK_ANIM, 6.1f, IDLE_ANIM);
		}
		
		@Override
		public boolean canStart()
		{
			return super.canStart() && mob.hasClaw() && mob.random.nextFloat() < 0.666f;
		}
		
		@Override
		public void tick()
		{
			if(time != 58) //impact
				super.tick();
			else
			{
				impact(7.5f, 6f, 0.6f);
				time++;
			}
			if(time >= 86 && time <= 106)
			{
				mob.setHasLantern(false);
				float strength = 1f - (time - 86) / 20f;
				Vec3d impact = mob.getPos().add(new Vec3d(0.5, 0, 3).rotateY((float)Math.toRadians(-mob.getYaw())));
				float radius = Math.max(1f - Math.abs(1f - strength - 0.25f) * 2f, 0.333f) * 20f;
				mob.applyDamageInCylindricArea(radius, 0.8f, DamageSources.get(mob.getWorld(), DamageSources.SCORCH, mob),  strength * 15f,
						(hit, success) -> {
							if(strength * 15f > 0f && success)
								hit.setFireTicks(Math.max(hit.getFireTicks() + 40 * (mob.getWorld().getDifficulty().getId() + 1), 0));
							else if(mob.age % 3 == 0)
									hit.setFireTicks(Math.max(hit.getFireTicks() + 40 * (mob.getWorld().getDifficulty().getId() + 1), 0));
							hit.setVelocity(hit.getPos().subtract(impact).normalize().multiply(strength * 4f).add(0f, 0.1f, 0f));
						});
			}
		}
		
		@Override
		protected int getAttackCooldown()
		{
			return (int)(super.getAttackCooldown() * 1.25f);
		}
	}
	
	/**
	 * Select a random target and charge at it.<br>
	 * "Arrives" when being within 4 Blocks of the Target, or further than 20 Blocks from the starting point.<br>
	 * If a Wall is hit instead, Break lantern and stun for 2 seconds.<br>
	 * <b>Becomes available in Second Phase; or in other words: Claw Required</b>
	 */
	static abstract class RunAttackGoal extends AnimatedAttackGoal<DeerGodEntity>
	{
		protected final byte type;
		protected final float speed;
		boolean arrived;
		int preparationTime, impactTicks;
		Vec3d start, dir;
		LivingEntity newTarget;
		int chain, animSpeed;
		boolean firstInChain;
		
		public RunAttackGoal(DeerGodEntity mob, byte attackAnimationId, float duration, byte postAnimationID, byte runAttackType, float speed)
		{
			super(mob, attackAnimationId, duration, postAnimationID);
			this.type = runAttackType;
			this.speed = speed;
			setControls(EnumSet.of(Control.MOVE, Control.TARGET, Control.LOOK));
		}
		
		@Override
		public boolean canStart()
		{
			return super.canStart() && mob.shouldRun() && mob.getStrongAttackCooldown() <= 0;
		}
		
		@Override
		protected boolean shouldImmediatelyStartAttackAnim()
		{
			return false;
		}
		
		@Override
		public void start()
		{
			super.start();
			if(mob.targetGoal.getAllTargets().size() > 1)
			{
				for (int i = 0; i < 4; i++)
				{
					mob.targetGoal.randomizeTarget();
					//check if target is obstructed
					if(mob.getTarget() != null &&
							   mob.getWorld().raycast(new RaycastContext(mob.getPos(), mob.getTarget().getPos(),
									   RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, mob)).getType().equals(HitResult.Type.MISS))
						break;
				}
			}
			if(mob.getTarget() == null)
			{
				interrupt();
				return;
			}
			mob.setRunAttackState(type);
			arrived = false;
			preparationTime = 20;
			start = mob.getPos();
			dir = null;
			mob.setAnimation(PREPARE_RUN_ATTACK_ANIM);
			mob.playSound(SoundEvents.ENTITY_BREEZE_INHALE, 10, 1);
			impactTicks = -1;
			firstInChain = chain == 0;
			if(firstInChain)
			{
				chain = (int)Math.max(mob.getWorld().getDifficulty().getId() - 1f +
											  ((0.5f - mob.getHealthPercent()) * 2f * mob.getWorld().getDifficulty().getId()), 0f);
				setAnimSpeed(1);
			}
			else
				updateAnimSpeed();
		}
		
		void updateAnimSpeed()
		{
			setAnimSpeed((int)(chain / 2f) + 1);
		}
		
		void setAnimSpeed(int speed)
		{
			animSpeed = speed;
			mob.dataTracker.set(RUN_ATTACK_ANIM_SPEED, animSpeed);
		}
		
		@Override
		public void tick()
		{
			if(wasInterrupted())
				return;
			if(impactTicks > 0)
			{
				if(--impactTicks == 0)
				{
					if(mob.getCurrentAnimation() == RUN_ATTACK_WALL_IMPACT_ANIM)
						mob.setAnimation(IDLE_ANIM);
					interrupt();
				}
				return;
			}
			if(mob.getTarget() == null)
			{
				interrupt();
				return;
			}
			if(preparationTime > 0)
			{
				preparationTime = Math.max(preparationTime - animSpeed, 0);
				if(preparationTime == 0 && mob.getCurrentAnimation() == PREPARE_RUN_ATTACK_ANIM)
					mob.setAnimation(IDLE_ANIM);
				if(preparationTime > 2)
				{
					Vec3d dirNow = mob.getTarget().getPos().subtract(mob.getPos()).multiply(1, 0, 1).normalize();
					if(dir == null)
						dir = dirNow;
					else
						dir = dir.lerp(dirNow.add(target.getVelocity().multiply(5f)), mob.getWorld().getDifficulty().getId() / 3f * animSpeed).normalize();
					mob.lookAt(EntityAnchorArgumentType.EntityAnchor.FEET, mob.getPos().add(dir));
				}
				return;
			}
			if(arrived)
			{
				for (int i = 0; i < animSpeed; i++)
				{
					super.tick();
					tickAttackAnim();
				}
				return;
			}
			
			//slowly rotate towards target
			Vec3d diff = mob.getTarget().getPos().subtract(mob.getPos());
			float curYaw = mob.getYaw(), targetYaw = (float)Math.toDegrees(MathHelper.atan2(diff.z, diff.x)) - 90f;
			float yaw = MathHelper.lerpAngleDegrees(0.025f * mob.getWorld().getDifficulty().getId(), curYaw, targetYaw);
			dir = dir.rotateY((float)-Math.toRadians(yaw - curYaw));
			mob.setYaw(yaw);
			mob.applyDamageInCylindricArea(mob.getWidth(), mob.getHeight(), DamageSources.get(mob.getWorld(), DamageSources.TRAMPLE, mob), 5f,
					(hit, success) -> {
						if(success)
							hit.setVelocity(mob.getRotationVector().multiply(1f, 0f, 1f).normalize().multiply(2.5f).add(0f, 0.2f, 0f));
					});
			
			Vec3d dest = mob.getPos().add(dir);
			mob.getMoveControl().moveTo(dest.x, dest.y, dest.z, speed + mob.getWorld().getDifficulty().getId() * 0.05f);
			if(mob.getWorld().raycast(new RaycastContext(mob.getPos().add(0f, 1.5f, 0f), dest.add(0f, 1.5f, 0f),
					RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, mob)).getType().equals(HitResult.Type.BLOCK))
			{
				impactTicks = 40;
				mob.setAnimation(RUN_ATTACK_WALL_IMPACT_ANIM);
				mob.getMoveControl().moveTo(mob.getX(), mob.getY(), mob.getZ(), 0f);
				return;
			}
			if(mob.distanceTo(target) < 4f || mob.getPos().distanceTo(start) > 16f)
			{
				arrived = true;
				mob.setAnimation(attackAnimationId);
				onArrive();
				if(firstInChain)
					updateAnimSpeed();
			}
		}
		
		@Override
		public boolean canStop()
		{
			return (super.canStop() || impactTicks == 0) && chain <= 0;
		}
		
		@Override
		public boolean shouldContinue()
		{
			return super.shouldContinue() && impactTicks != 0;
		}
		
		protected void onArrive()
		{
			mob.getMoveControl().moveTo(mob.getX(), mob.getY(), mob.getZ(), 0f);
		}
		
		@Override
		public void stop()
		{
			super.stop();
			newTarget = null;
			mob.setRunAttackState(RUN_ATTACK_NONE);
			if(mob.getCurrentAnimation() == PREPARE_RUN_ATTACK_ANIM || mob.getCurrentAnimation() == attackAnimationId)
				mob.setAnimation(postAnimationID);
			if(mob.moveControl.isMoving())
				mob.moveControl.moveTo(mob.getX(), mob.getY(), mob.getZ(), 0f);
		}
		
		protected abstract void tickAttackAnim();
		
		@Override
		public void interrupt()
		{
			super.interrupt();
			arrived = false;
			impactTicks = 0;
		}
	}
	
	/**
	 * Once arrived, perform an uppercut with the claw; sends hit entities flying upwards and into the direction the deer is looking.<br>
	 * <b>Claw Required</b>
	 */
	static class RunClawAttackGoal extends RunAttackGoal
	{
		public RunClawAttackGoal(DeerGodEntity mob, float speed)
		{
			super(mob, RUN_ATTACK_CLAW_ANIM, 1.9f, IDLE_ANIM, RUN_ATTACK_CLAW, speed);
		}
		
		@Override
		public boolean canStart()
		{
			return super.canStart() && mob.hasClaw();
		}
		
		@Override
		protected void tickAttackAnim()
		{
			if(time <= 7)
			{
				mob.applyDamageInCylindricArea(mob.getWidth(), mob.getHeight(), DamageSources.get(mob.getWorld(), DamageSources.TRAMPLE, mob), 2f,
						(hit, success) -> {
							if(success)
								hit.setVelocity(mob.getRotationVector().multiply(1f, 0f, 1f).normalize()
														.multiply(mob.getVelocity().length() * 1.5f).add(0f, 0.2f, 0f));
						});
			}
			if(time > 11 && time < 14)
				mob.applyDamageInCylindricArea(6.5f, 3.5f, 45f, DamageSources.get(mob.getWorld(), DamageSources.CLAW, mob), 15f,
						mob.getRotationVector(), mob.getRotationVector().multiply(-1.5f), (hit, success) -> {
							if(success)
								hit.setVelocity(mob.getRotationVector().multiply(1f, 0f, 1f).normalize().multiply(2f).add(0f, 1.5f, 0f));
						});
			if(time >= duration * 20 && chain > 0)
			{
				chain--;
				if(chain == 0)
					chain = -1;
				start();
			}
		}
		
		@Override
		protected void onArrive()
		{
			Vec3d dest = mob.getPos().add(dir.multiply(2f));
			mob.moveControl.moveTo(dest.x, dest.y, dest.z, 1f);
		}
		
		@Override
		public void stop()
		{
			mob.setStrongCooldown(200 - mob.getWorld().getDifficulty().getId() * 15);
			super.stop();
			chain = 0;
		}
		
		@Override
		protected int getAttackCooldown()
		{
			return 0;
		}
		
		@Override
		public void interrupt()
		{
			super.interrupt();
			chain = 0;
		}
	}
}
