package absolutelyaya.formidulus.entities;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.damage.DamageSources;
import absolutelyaya.formidulus.entities.goal.AnimatedAttackGoal;
import absolutelyaya.formidulus.entities.goal.BossTargetGoal;
import absolutelyaya.formidulus.entities.goal.InterruptableGoal;
import absolutelyaya.formidulus.network.SequenceTriggerPayload;
import absolutelyaya.formidulus.particle.BloodDropParticleEffect;
import absolutelyaya.formidulus.registries.EntityRegistry;
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
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.TypeFilter;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

import java.util.EnumSet;
import java.util.List;

public class DeerGodEntity extends BossEntity
{
	static final TrackedData<Boolean> SUMMONED = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	static final TrackedData<Boolean> LANTERN = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	static final TrackedData<Boolean> CLAW = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	static final TrackedData<Boolean> RANGED = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	static final TrackedData<Integer> TELEPORT_TIMER = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.INTEGER);
	static final TrackedData<Integer> TELEPORT_COOLDOWN = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.INTEGER);
	static final TrackedData<Integer> RANGED_COOLDOWN = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.INTEGER);
	static final TrackedData<Vector3f> NEXT_TELEPORT_DEST = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.VECTOR3F);
	
	static final byte UNSUMMONED_POSE = 0;
	static final byte SPAWN_SEQUENCE_ANIM = 1;
	static final byte IDLE_ANIM = 2;
	static final byte SUMMON_LANTERN_ANIM = 3;
	static final byte SWING_ANIM = 4;
	static final byte SLAM_ANIM = 5;
	static final byte PHASE_TRANSITION_ANIM = 6;
	static final byte DEATH_SEQUENCE_ANIM = 69;
	public AnimationState unsummonedPoseAnimationState = new AnimationState();
	public AnimationState spawnSequenceAnimationState = new AnimationState();
	public AnimationState idleAnimationState = new AnimationState();
	public AnimationState walkingAnimationState = new AnimationState();
	public AnimationState swingAnimationState = new AnimationState();
	public AnimationState slamAnimationState = new AnimationState();
	public AnimationState summonLanternAnimationState = new AnimationState();
	public AnimationState holdLanternAnimationState = new AnimationState();
	public AnimationState noLanternAnimationState = new AnimationState();
	public AnimationState noClawAnimationState = new AnimationState();
	public AnimationState showClawAnimationState = new AnimationState();
	public AnimationState showClawWithoutExtrasAnimationState = new AnimationState();
	public AnimationState phaseTransitionAnimationState = new AnimationState();
	public AnimationState deathAnimationState = new AnimationState();
	int deathTime, swingChain;
	DamageSource killingBlow;
	PlayerEntity killer;
	float rangedDamageTaken;
	
	public DeerGodEntity(EntityType<? extends BossEntity> entityType, World world)
	{
		super(entityType, world);
		unsummonedPoseAnimationState.start(age);
		holdLanternAnimationState.start(age);
		noLanternAnimationState.start(age);
		noClawAnimationState.start(age);
		showClawAnimationState.start(age);
		walkingAnimationState.start(age);
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
		builder.add(TELEPORT_TIMER, Integer.MIN_VALUE);
		builder.add(TELEPORT_COOLDOWN, 200);
		builder.add(RANGED_COOLDOWN, 100);
		builder.add(NEXT_TELEPORT_DEST, getPos().toVector3f());
	}
	
	@Override
	protected void initGoals()
	{
		super.initGoals();
		goalSelector.add(0, new OutOfCombatGoal(this, OutOfCombatGoal.BEHAVIOR_RESPAWN_AT_ORIGIN));
		goalSelector.add(0, new TeleportRandomlyGoal(this));
		goalSelector.add(1, new SummonLanternGoal(this));
		goalSelector.add(1, new LanternSwingGoal(this));
		goalSelector.add(1, new LanternSlamGoal(this));
		goalSelector.add(1, new ProjectileGoal(this));
		goalSelector.add(2, new TeleportToTargetGoal(this));
		goalSelector.add(3, new ApproachTargetGoal(this, 0.4f));
		
		targetSelector.add(0, bossTargetGoal = new BossTargetGoal(this, 16, 200, 0.4f));
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
	public void pushAwayFrom(Entity entity)
	{
	
	}
	
	@Override
	protected void pushAway(Entity entity)
	{
	
	}
	
	@Override
	public void tick()
	{
		super.tick();
		if(!dataTracker.get(SUMMONED) && !getWorld().getEntitiesByType(TypeFilter.instanceOf(PlayerEntity.class),
				getBoundingBox().expand(8), p -> !p.isSpectator() && !p.isCreative()).isEmpty())
		{
			setAnimation(SPAWN_SEQUENCE_ANIM);
			triggerMonologueSequence(SequenceTriggerPayload.SPAWN_SEQUENCE);
			dataTracker.set(SUMMONED, true);
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
			dataTracker.set(TELEPORT_COOLDOWN, dataTracker.get(TELEPORT_COOLDOWN) - 1);
		if(isTeleporting())
			dataTracker.set(TELEPORT_TIMER, dataTracker.get(TELEPORT_TIMER) - 1);
		if(rangedDamageTaken > 0f)
			rangedDamageTaken -= 0.05f;
		if(dataTracker.get(RANGED) && hasLivingTarget())
			dataTracker.set(RANGED_COOLDOWN, dataTracker.get(RANGED_COOLDOWN) - 1);
		if(!dataTracker.get(RANGED) && rangedDamageTaken > 50)
		{
			dataTracker.set(RANGED, true);
			triggerMonologueSequence(SequenceTriggerPayload.PROJECTILE_SEQUENCE);
		}
	}
	
	@Override
	public void tickMovement()
	{
		super.tickMovement();
		
		if(getCurrentAnimation() == SPAWN_SEQUENCE_ANIM)
		{
			float darkness = getCurrentAnimationDuration() - 6.5f;
			if(!getAnimationFlag(0))
			{
				setAnimationFlag(0, true);
				setAttackCooldown(20);
				if(!getWorld().isClient)
					dataTracker.set(ORIGIN, getPos().toVector3f());
			}
			if(getCurrentAnimationDuration() < 8.7f)
			{
				for (int i = 0; i < darkness * 3; i++)
				{
					Vec3d pos = new Vec3d(getX(), getY(), getZ()).add((random.nextFloat() - 0.5f) * 2.2f, random.nextFloat() * 4.5f * darkness / (8.7 - 6.5), (random.nextFloat() - 0.5f) * 2.2f);
					getWorld().addParticle(new DustParticleEffect(new Vector3f(0f, 0f, 0f), 5f), pos.x, pos.y, pos.z, 0f, 0f, 0f);
				}
			}
			applyReverence(18f - getCurrentAnimationDuration());
			if(!getWorld().isClient && getCurrentAnimationDuration() >= 18f)
				setAnimation(IDLE_ANIM);
		}
		if(getCurrentAnimation() == SWING_ANIM)
		{
			if(!getAnimationFlag(0) && getCurrentAnimationDuration() >= 1.1f)
			{
				setAnimationFlag(0, true);
				getWorld().playSound(null, getBlockPos(), SoundEvents.ENTITY_WITCH_THROW, SoundCategory.HOSTILE, 0.8f, 0.1f);
			}
		}
		if(getCurrentAnimation() == SLAM_ANIM)
		{
			if(!getAnimationFlag(0) && getCurrentAnimationDuration() >= 1.25f)
			{
				setAnimationFlag(0, true);
				playSound(SoundEvents.ENTITY_WITCH_THROW, 0.8f, 0.6f);
			}
			if(!getAnimationFlag(1) && getCurrentAnimationDuration() >= 2.65f)
			{
				setAnimationFlag(1, true);
				playSound(SoundEvents.ENTITY_WITCH_THROW, 1f, 0.5f);
			}
			if(!getAnimationFlag(2) && getCurrentAnimationDuration() >= 2.9f)
			{
				setAnimationFlag(2, true);
				Vec3d impactOffset = new Vec3d(0.5, 0, 3).rotateY((float)Math.toRadians(-getYaw()));
				for (int i = 0; i < 32; i++)
				{
					Vec3d pos = getPos().add(impactOffset).addRandom(random, 0.5f);
					Vec3d vel = Vec3d.ZERO.addRandom(random, 0.75f);
					vel = new Vec3d(vel.x, Math.abs(vel.y), vel.z);
					getWorld().addParticle(ParticleTypes.FLAME, pos.x, pos.y, pos.z, vel.x, vel.y, vel.z);
				}
				for (int i = 0; i < 64; i++)
				{
					Vec3d pos = getPos().add(0f, 0.75f, 0f).add(impactOffset).addRandom(random, 1.5f);
					getWorld().addParticle(new BlockStateParticleEffect(ParticleTypes.BLOCK, Blocks.LANTERN.getDefaultState()),
							pos.x, pos.y, pos.z, 0, 0, 0);
				}
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
				playSound(SoundEvents.BLOCK_VAULT_OPEN_SHUTTER, 0.8f, 0.6f);
				playSound(SoundEvents.BLOCK_VAULT_BREAK, 5f, 0.5f);
			}
		}
		if(getCurrentAnimation() == PHASE_TRANSITION_ANIM)
		{
			if(!hasClaw())
				setHasClaw(true);
			if(hasLantern())
				setHasLantern(false);
			if(!getAnimationFlag(0) && getCurrentAnimationDuration() >= 0f)
			{
				setAnimationFlag(0, true);
				triggerMonologueSequence(SequenceTriggerPayload.PHASE_TRANSITION_SEQUENCE);
				setAttackCooldown(20);
			}
			if(getCurrentAnimationDuration() >= 3.5f && getCurrentAnimationDuration() <= 4f)
			{
				if(!getAnimationFlag(1))
				{
					setAnimationFlag(1, true);
					playSound(SoundEvents.ENTITY_EVOKER_PREPARE_ATTACK, 0.6f, 1f);
				}
				spawnVanishingParticles(12, getPos());
				spawnVanishingParticles(12, new Vec3d(dataTracker.get(ORIGIN)));
			}
			if(!getAnimationFlag(2) && getCurrentAnimationDuration() >= 4.05f)
			{
				setAnimationFlag(2, true);
				Vector3f pos = dataTracker.get(ORIGIN);
				playSound(SoundEvents.ENTITY_EVOKER_CAST_SPELL, 0.6f, 1f);
				setPosition(pos.x, pos.y, pos.z);
				playSound(SoundEvents.ENTITY_EVOKER_CAST_SPELL, 0.6f, 1f);
				if(getTarget() != null)
					lookAt(EntityAnchorArgumentType.EntityAnchor.FEET, getTarget().getPos());
				else
					setYaw(0);
			}
			if(getWorld().isClient && !getAnimationFlag(3) && getCurrentAnimationDuration() >= 5.5f)
			{
				setAnimationFlag(3, true);
				playSound(SoundEvents.ENTITY_EVOKER_PREPARE_SUMMON, 5f, 1f);
				Vec3d dest = getPos().add((float)getRotationVector().x, getHeight() / 2f, (float)getRotationVector().z);
				for (int i = 0; i < 111; i++)
				{
					Vec3d dir = Vec3d.ZERO.addRandom(random, 1f).multiply(1f, 0f, 1f);
					Vec3d pos = getPos().add(dir.normalize().multiply((getRandom().nextFloat() - 0.5f) * 2f * 16f));
					getWorld().addParticle(new BloodDropParticleEffect(dest.toVector3f()),
							(float)pos.x, (float)getY(), (float)pos.z, 0f, 0f, 0f);
				}
			}
			if(!getAnimationFlag(4) && getCurrentAnimationDuration() >= 13f)
			{
				setAnimationFlag(4, true);
				playSound(SoundEvents.BLOCK_RESPAWN_ANCHOR_SET_SPAWN, 5f, 0.6f);
			}
			if(getCurrentAnimationDuration() > 4.05f)
				applyReverence(18f - getCurrentAnimationDuration());
			if(!getWorld().isClient && getCurrentAnimationDuration() >= 18.05f)
				setAnimation(IDLE_ANIM);
		}
		if(getCurrentAnimation() == DEATH_SEQUENCE_ANIM)
			applyReverence(20f - getCurrentAnimationDuration());
		
		float vanishing = getVanishingPercent();
		if(vanishing > 0f)
		{
			spawnVanishingParticles((int)Math.ceil(vanishing * 3), new Vec3d(getX(), getY(), getZ()));
			spawnVanishingParticles((int)Math.ceil(vanishing * 3), getNextTeleportDestination());
		}
	}
	
	void spawnVanishingParticles(int count, Vec3d origin)
	{
		for (int i = 0; i < count; i++)
		{
			Vec3d pos = origin.add((random.nextFloat() - 0.5f) * 2f, random.nextFloat() * 4.5f, (random.nextFloat() - 0.5f) * 2f);
			getWorld().addParticle(new DustParticleEffect(new Vector3f(0f, 0f, 0f), 5f),
					true, pos.x, pos.y, pos.z, 0f, 0f, 0f);
		}
	}
	
	@Override
	protected void playStepSound(BlockPos pos, BlockState state)
	{
		super.playStepSound(pos, state);
		if(hasLantern())
			playSound(SoundEvents.BLOCK_CHAIN_BREAK, 0.1f, 0.6f);
	}
	
	void applyReverence(float remainingTime)
	{
		if(getWorld().isClient)
			return;
		if(remainingTime > 2f) //players
		{
			getWorld().getEntitiesByType(TypeFilter.instanceOf(PlayerEntity.class), getBoundingBox().expand(16), i -> true)
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
			if(getCurrentAnimationDuration() > 15f && getCurrentAnimationDuration() < 20f)
			{
				float height = (getCurrentAnimationDuration() - 15f);
				return getEyePos().subtract(0, MathHelper.clamp(height / 3f, 0, 1f) * 0.5f - 0.5f, 0);
			}
			else if(getCurrentAnimationDuration() >= 20f)
				return getPos();
		}
		return super.getFocusPos().subtract(0f, 0.5f, 0f);
	}
	
	void triggerMonologueSequence(byte id)
	{
		if(getWorld().isClient)
			return;
		List<ServerPlayerEntity> nearby = getWorld().getEntitiesByType(TypeFilter.instanceOf(ServerPlayerEntity.class), getBoundingBox().expand(64),
				LivingEntity::isAlive);
		nearby.forEach(i -> ServerPlayNetworking.send(i, new SequenceTriggerPayload(id)));
	}
	
	protected AnimationState getAnimationState(byte id)
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
			case DEATH_SEQUENCE_ANIM -> deathAnimationState;
		};
	}
	
	@Override
	protected boolean hasLivingTarget()
	{
		return super.hasLivingTarget() && !isInSequence();
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
		return anim != SWING_ANIM && anim != SLAM_ANIM && anim != SUMMON_LANTERN_ANIM;
	}
	
	public boolean shouldEyesGlow()
	{
		float animDuration = getCurrentAnimationDuration();
		if(getCurrentAnimation() == SPAWN_SEQUENCE_ANIM)
			return animDuration > 2f && animDuration < 8.5f;
		return hasClaw() && !(getCurrentAnimation() == PHASE_TRANSITION_ANIM && animDuration < 2f) && getCurrentAnimation() != DEATH_SEQUENCE_ANIM;
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
		return getCurrentAnimation() == IDLE_ANIM;
	}
	
	public boolean shouldApplyClawPose()
	{
		return getCurrentAnimation() != PHASE_TRANSITION_ANIM && getCurrentAnimation() != DEATH_SEQUENCE_ANIM;
	}
	
	public boolean shouldShowClawWithoutExtras()
	{
		return getCurrentAnimation() == SLAM_ANIM || getCurrentAnimation() == SWING_ANIM;
	}
	
	@Override
	public boolean isInvulnerable()
	{
		return super.isInvulnerable();
	}
	
	@Override
	public boolean damage(DamageSource source, float amount)
	{
		if(source.isOf(DamageTypes.OUT_OF_WORLD) || source.isOf(DamageTypes.GENERIC_KILL))
			return super.damage(source, amount);
		if(isInSequence() || getVanishingPercent() > 0.5f)
			return false;
		boolean b = super.damage(source, amount);
		if(getWorld().isClient)
			return b;
		if(b && (source.getAttacker() != null && distanceTo(source.getAttacker()) > 10) || (source.getSource() != null && source.getSource() instanceof ProjectileEntity))
			rangedDamageTaken += amount; //let's keep it raw
		if(!dataTracker.get(CLAW) && b && getHealth() <= getMaxHealth() / 2f && getHealth() > 0f)
		{
			cancelActiveGoals();
			setAnimation(PHASE_TRANSITION_ANIM);
			dataTracker.set(CLAW, true);
			setHealth(getMaxHealth() / 2f);
		}
		if(getHealth() <= 0)
		{
			cancelActiveGoals();
			setAnimation(DEATH_SEQUENCE_ANIM);
			triggerMonologueSequence(SequenceTriggerPayload.DEATH_SEQUENCE);
			if(bossBar != null)
				bossBar.setPercent(0f);
			killingBlow = source;
			if(source.getAttacker() instanceof PlayerEntity player)
				killer = player;
			if(killer == null && source.getSource() instanceof PlayerEntity player)
				killer = player;
		}
		return b;
	}
	
	@Override
	protected void cancelActiveGoals()
	{
		super.cancelActiveGoals();
		dataTracker.set(TELEPORT_TIMER, Integer.MIN_VALUE);
		setAnimation(IDLE_ANIM);
		getWorld().getEntitiesByType(TypeFilter.instanceOf(IrrlichtEntity.class), Box.from(getPos()).expand(32), i -> i.owner == this).forEach(LivingEntity::kill);
	}
	
	@Override
	protected boolean shouldDropLoot()
	{
		return false;
	}
	
	@Override
	protected void updatePostDeath()
	{
		if(getRecentDamageSource() instanceof DamageSource source && (source.isOf(DamageTypes.GENERIC_KILL) || source.isOf(DamageTypes.OUT_OF_WORLD)))
		{
			getWorld().sendEntityStatus(this, EntityStatuses.ADD_DEATH_PARTICLES);
			remove(RemovalReason.KILLED);
		}
		if(++deathTime >= 28f * 20 && !getWorld().isClient && !isRemoved()) //death animation is 23.25 seconds long, the sequence takes a bit longer tho
		{
			getWorld().sendEntityStatus(this, EntityStatuses.ADD_DEATH_PARTICLES);
			remove(RemovalReason.KILLED);
			dropLoot(killingBlow, killer != null);
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
				Vec3d vel = Vec3d.ZERO.addRandom(random, 0.2f);
				getWorld().addParticle(new DustParticleEffect(new Vector3f(0f, 0f, 0f), 5f), pos.x, pos.y, pos.z, vel.x, vel.y, vel.z);
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
		return MathHelper.clamp(1f - (Math.abs((float)getTeleportTimer()) / (float) getTeleportFadeDuration()), 0f, 1f);
	}
	
	public boolean isReadyToAttack()
	{
		return super.isReadyToAttack() && dataTracker.get(SUMMONED) && !isInSequence() && getVanishingPercent() < 0.5f && !isAboutToTeleport() && navigation.isIdle();
	}
	
	public boolean isReadyToTeleport()
	{
		return dataTracker.get(TELEPORT_COOLDOWN) <= 0 && getHealth() / getMaxHealth() <= 0.75f && rangedDamageTaken < 100f;
	}
	
	public void setTeleportCooldown(int cooldown)
	{
		dataTracker.set(TELEPORT_COOLDOWN, cooldown);
	}
	
	public int getTeleportFadeDuration()
	{
		return 40 - (20 * Math.round(1f - (Math.max(getHealth() / getMaxHealth(), 0.5f) - 0.5f) * 4f));
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
	public void readCustomDataFromNbt(NbtCompound nbt)
	{
		super.readCustomDataFromNbt(nbt);
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
	}
	
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
				float rotation = (float)Math.toRadians(-mob.getYaw() + 135 - (time - 22f) / (30f - 22f) * 225);
				Vec3d offset = new Vec3d(0, 0, 0.5).rotateY(rotation);
				Vec3d expansion = new Vec3d(2, 0f, 3).rotateY(rotation);
				List<LivingEntity> hits = mob.getWorld().getNonSpectatingEntities(LivingEntity.class,
						Box.from(mob.getPos()).stretch(expansion.x, 0f, expansion.z));
				for (LivingEntity hit : hits)
				{
					if (hit instanceof IrrlichtEntity || hit instanceof DeerGodEntity)
						continue;
					if(hit.damage(DamageSources.get(mob.getWorld(), DamageSources.LANTERN, mob), 15f))
					{
						hit.setVelocity(offset.normalize().multiply(2f).add(0f, 0.2f, 0f));
						mob.onDamageEntity(hit);
					}
				}
			}
		}
		
		@Override
		protected int getAttackCooldown()
		{
			return 1;
		}
	}
	
	static class LanternSlamGoal extends AnimatedAttackGoal<DeerGodEntity>
	{
		public LanternSlamGoal(DeerGodEntity mob)
		{
			super(mob, SLAM_ANIM, 5.8f, IDLE_ANIM);
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
				Vec3d offset = new Vec3d(0, 0, 0).rotateY((float)Math.toRadians(-mob.getYaw()));
				List<LivingEntity> hits = mob.getWorld().getNonSpectatingEntities(LivingEntity.class,
						mob.getBoundingBox().offset(offset).stretch(mob.getRotationVector().x * 4f, 0f, mob.getRotationVector().z * 4f));
				for (LivingEntity hit : hits)
				{
					if (hit instanceof IrrlichtEntity || hit instanceof DeerGodEntity)
						continue;
					if(hit.damage(DamageSources.get(mob.getWorld(), DamageSources.LANTERN, mob), 12f))
					{
						hit.setVelocity(mob.getRotationVector().multiply(1f, 0f, 1f).normalize().multiply(0.5f).add(0f, 1.5f, 0f));
						mob.onDamageEntity(hit);
					}
				}
			}
			if(time == 58) //pos
			{
				mob.setHasLantern(false);
				Vec3d impact = mob.getPos().add(new Vec3d(0.5, 0, 3).rotateY((float)Math.toRadians(-mob.getYaw())));
				List<LivingEntity> hits = mob.getWorld().getNonSpectatingEntities(LivingEntity.class,
						Box.from(impact).expand(8f));
				for (LivingEntity hit : hits)
				{
					if(hit instanceof IrrlichtEntity || hit instanceof DeerGodEntity)
						continue;
					float strength = Math.max(1f - (float)impact.distanceTo(hit.getPos()) / 6f, 0f);
					if(strength <= 0f)
						continue;
					if(hit.damage(DamageSources.get(mob.getWorld(), DamageSources.LANTERN, mob), strength * 20f))
					{
						hit.setVelocity(hit.getPos().subtract(impact).normalize().multiply(strength * 4f).add(0f, strength, 0f));
						mob.onDamageEntity(hit);
					}
				}
			}
		}
		
		@Override
		protected int getAttackCooldown()
		{
			return 20 + (int)(mob.random.nextFloat() * 30);
		}
	}
	
	static class SummonLanternGoal extends AnimatedAttackGoal<DeerGodEntity>
	{
		public SummonLanternGoal(DeerGodEntity mob)
		{
			super(mob, SUMMON_LANTERN_ANIM, 2.75f, IDLE_ANIM);
		}
		
		@Override
		public boolean canStart()
		{
			return !mob.hasLantern() && super.canStart();
		}
		
		@Override
		public void tick()
		{
			super.tick();
			if(time == 35)
				mob.setHasLantern(true);
		}
		
		@Override
		protected int getAttackCooldown()
		{
			return 10 + (int)(mob.random.nextFloat() * 5);
		}
	}
	
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
			return mob.isReadyToAttack() && !mob.isTeleporting();
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
			return mob.hasLivingTarget() && mob.isNotInAttackAnimation() && !(mob.distanceTo(mob.getTarget()) <= 3f || failed);
		}
		
		@Override
		public void tick()
		{
			time++;
			super.tick();
			if(mob.getTarget() == null || mob.getTarget().isRemoved())
			{
				mob.navigation.stop();
				failed = true;
				stop();
				return;
			}
			failed = mob.getTarget().getPos().distanceTo(new Vec3d(mob.dataTracker.get(ORIGIN))) > 32f || ++time > 200;
			if(mob.distanceTo(mob.getTarget()) <= 3f || failed)
				return;
			mob.navigation.startMovingTo(mob.getTarget(), speed);
			mob.lookAt(EntityAnchorArgumentType.EntityAnchor.EYES, mob.getTarget().getEyePos());
		}
		
		@Override
		public void stop()
		{
			mob.navigation.stop();
			super.stop();
			if(failed)
				mob.setTeleportCooldown(0);
		}
	}
	
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
			mob.setTeleportCooldown((int)((100 + (mob.random.nextFloat())) * Math.max(mob.getHealth() / mob.getMaxHealth(), 0.1f)));
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
	}
	
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
			return super.canStart() && ((!mob.hasLantern() && mob.getTarget() != null && mob.distanceTo(mob.getTarget()) < 5) || mob.random.nextFloat() < 0.01f);
		}
		
		@Override
		public void start()
		{
			origin = new Vec3d(mob.dataTracker.get(ORIGIN));
			super.start();
		}
		
		@Override
		protected @Nullable Vec3d getTeleportDestination()
		{
			Vec3d dest;
			for (int i = 0; i < 8; i++)
			{
				dest = origin.add((mob.random.nextFloat() - 0.5) * 2f * 16f, 0f, (mob.random.nextFloat() - 0.5) * 2f * 16f);
				if(isDestinationFree(dest))
					return dest;
			}
			return null;
		}
	}
	
	static class TeleportToTargetGoal extends DeerTeleportGoal
	{
		public TeleportToTargetGoal(DeerGodEntity mob)
		{
			super(mob);
		}
		
		@Override
		public boolean canStart()
		{
			return super.canStart() && mob.getTarget() != null && mob.distanceTo(mob.getTarget()) > 10;
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
			Vec3d dest;
			for (int i = 0; i < 36; i++)
			{
				float rot = i / 2f * (i % 2 == 0 ? -1 : 1) * 20f;
				dest = target.getPos().add(dir.rotateY((float)Math.toRadians(rot)).multiply(2.5f + mob.random.nextFloat()));
				if(isDestinationFree(dest))
					return dest;
			}
			return null;
		}
	}
	
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
}
