package absolutelyaya.formidulus.entities;

import absolutelyaya.formidulus.network.SequenceTriggerPayload;
import absolutelyaya.formidulus.particle.BloodDropParticleEffect;
import absolutelyaya.formidulus.registries.EntityRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.Blocks;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.TypeFilter;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.joml.Vector3f;

import java.util.List;

public class DeerGodEntity extends HostileEntity
{
	static final TrackedData<Boolean> SUMMONED = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	static final TrackedData<Byte> ANIMATION = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.BYTE);
	static final TrackedData<Integer> ANIMATION_START = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.INTEGER);
	static final TrackedData<Integer> INTRO_TICKS = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.INTEGER);
	static final TrackedData<Boolean> CLAW = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	
	static final byte UNSUMMONED_POSE = 0;
	static final byte SPAWN_SEQUENCE_ANIM = 1;
	static final byte IDLE_ANIM = 2;
	static final byte SWING_ANIM = 3;
	static final byte SLAM_ANIM = 4;
	static final byte PHASE_TRANSITION_ANIM = 5;
	public AnimationState unsummonedPoseAnimationState = new AnimationState();
	public AnimationState spawnSequenceAnimationState = new AnimationState();
	public AnimationState idleAnimationState = new AnimationState();
	public AnimationState swingAnimationState = new AnimationState();
	public AnimationState slamAnimationState = new AnimationState();
	public AnimationState holdLanternAnimationState = new AnimationState();
	public AnimationState noLanternAnimationState = new AnimationState();
	public AnimationState noClawAnimationState = new AnimationState();
	public AnimationState showClawAnimationState = new AnimationState();
	public AnimationState showClawWithoutExtrasAnimationState = new AnimationState();
	public AnimationState phaseTransitionAnimationState = new AnimationState();
	int animFlags;
	
	public DeerGodEntity(EntityType<? extends HostileEntity> entityType, World world)
	{
		super(entityType, world);
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
		builder.add(ANIMATION, UNSUMMONED_POSE);
		builder.add(ANIMATION_START, 0);
		builder.add(INTRO_TICKS, 400);
		builder.add(CLAW, false);
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
	public boolean cannotDespawn()
	{
		return true;
	}
	
	@Override
	public void tick()
	{
		super.tick();
		if(!dataTracker.get(SUMMONED) && !getWorld().getEntitiesByType(TypeFilter.instanceOf(PlayerEntity.class), getBoundingBox().expand(16), i -> true).isEmpty())
		{
			setAnimation(SPAWN_SEQUENCE_ANIM);
			dataTracker.set(SUMMONED, true);
		}
		if(dataTracker.get(ANIMATION).equals(SPAWN_SEQUENCE_ANIM) && getCurrentAnimationDuration() >= 18f)
			setAnimation(IDLE_ANIM);
		if(dataTracker.get(INTRO_TICKS) > 0)
			dataTracker.set(INTRO_TICKS, dataTracker.get(INTRO_TICKS) - 1);
		
		if(age % 400 == 0)
			setAnimation(PHASE_TRANSITION_ANIM);
		
		//if(age == 300)
		//	setAnimation(SWING_ANIM);
		//
		//if(age == 600)
		//	setAnimation(SLAM_ANIM);
		//
		//if(age == 900)
		//	setAnimation(IDLE_ANIM);
	}
	
	@Override
	public void tickMovement()
	{
		super.tickMovement();
		
		if(getCurrentAnimation() == SPAWN_SEQUENCE_ANIM)
		{
			float darkness = getCurrentAnimationDuration() - 6.5f;
			if(getCurrentAnimationDuration() < 8.7f)
			{
				for (int i = 0; i < darkness * 3; i++)
				{
					Vec3d pos = new Vec3d(getX(), getY(), getZ()).add((random.nextFloat() - 0.5f) * 2.2f, random.nextFloat() * 4.5f * darkness / (8.7 - 6.5), (random.nextFloat() - 0.5f) * 2.2f);
					getWorld().addParticle(new DustParticleEffect(new Vector3f(0f, 0f, 0f), 5f), pos.x, pos.y, pos.z, 0f, 0f, 0f);
				}
			}
		}
		if(getCurrentAnimation() == SLAM_ANIM)
		{
			if(!getAnimationFlag(0) && getCurrentAnimationDuration() >= 2.9f)
			{
				setAnimationFlag(0, true);
				for (int i = 0; i < 32; i++)
				{
					Vec3d pos = new Vec3d(0.5, 0, 3).rotateY(getYaw()).add(getPos()).addRandom(random, 0.5f);
					Vec3d vel = Vec3d.ZERO.addRandom(random, 0.75f);
					vel = new Vec3d(vel.x, Math.abs(vel.y), vel.z);
					getWorld().addParticle(ParticleTypes.FLAME, pos.x, pos.y, pos.z, vel.x, vel.y, vel.z);
				}
				for (int i = 0; i < 64; i++)
				{
					Vec3d pos = new Vec3d(0.5, 0.75, 3).rotateY(getYaw()).add(getPos()).addRandom(random, 1.5f);
					getWorld().addParticle(new BlockStateParticleEffect(ParticleTypes.BLOCK, Blocks.LANTERN.getDefaultState()),
							pos.x, pos.y, pos.z, 0, 0, 0);
				}
				for (int i = 0; i < 3; i++) //increase in second phase
				{
					Vec3d pos = new Vec3d(0.5, 0.75, 3).rotateY(getYaw()).add(getPos());
					Vec3d vel = Vec3d.ZERO.addRandom(random, 1.5f);
					vel = new Vec3d(vel.x, Math.abs(vel.y * 0.2f), vel.z);
					IrrlichtEntity funke = new IrrlichtEntity(EntityRegistry.IRRLICHT, getWorld());
					funke.setPosition(pos);
					funke.setVelocity(vel);
					funke.setLifetime(300 + (int)(random.nextFloat() * 50));
					getWorld().spawnEntity(funke);
				}
			}
		}
		if(getCurrentAnimation() == PHASE_TRANSITION_ANIM)
		{
			if(!hasClaw())
				dataTracker.set(CLAW, true);
			if(!getAnimationFlag(0) && getCurrentAnimationDuration() >= 0f)
			{
				setAnimationFlag(0, true);
				if(!getWorld().isClient)
				{
					List<ServerPlayerEntity> nearby = getWorld().getEntitiesByType(TypeFilter.instanceOf(ServerPlayerEntity.class), getBoundingBox().expand(64), LivingEntity::isAlive);
					nearby.forEach(i -> ServerPlayNetworking.send(i, new SequenceTriggerPayload(SequenceTriggerPayload.PHASE_TRANSITION_SEQUENCE)));
				}
			}
			if(getCurrentAnimationDuration() >= 3.5f && getCurrentAnimationDuration() <= 4f)
			{
				for (int i = 0; i < 12; i++)
				{
					Vec3d pos = new Vec3d(getX(), getY(), getZ()).add((random.nextFloat() - 0.5f) * 2.2f, random.nextFloat() * 4.5f, (random.nextFloat() - 0.5f) * 2.2f);
					getWorld().addParticle(new DustParticleEffect(new Vector3f(0f, 0f, 0f), 5f), pos.x, pos.y, pos.z, 0f, 0f, 0f);
				}
			}
			if(!getAnimationFlag(1) && getCurrentAnimationDuration() >= 5.5f)
			{
				setAnimationFlag(1, true);
				Vec3d dest = getPos().add((float)getRotationVector().x, getHeight() / 2f, (float)getRotationVector().z);
				for (int i = 0; i < 111; i++)
				{
					Vec3d dir = Vec3d.ZERO.addRandom(random, 1f).multiply(1f, 0f, 1f);
					Vec3d pos = getPos().add(dir.normalize().multiply((getRandom().nextFloat() - 0.5f) * 2f * 16f));
					getWorld().addParticle(new BloodDropParticleEffect(dest.toVector3f()),
							(float)pos.x, (float)getY(), (float)pos.z, 0f, 0f, 0f);
				}
			}
		}
		
		//TODO: vanishing
		//for (int i = 0; i < 3; i++)
		//{
		//	Vec3d pos = new Vec3d(getX(), getY(), getZ()).add((random.nextFloat() - 0.5f) * 2f, random.nextFloat() * 4.5f, (random.nextFloat() - 0.5f) * 2f);
		//	getWorld().addParticle(new DustParticleEffect(new Vector3f(0f, 0f, 0f), 5f), pos.x, pos.y, pos.z, 0f, 0f, 0f);
		//}
	}
	
	void setAnimation(byte id)
	{
		//if(dataTracker.get(ANIMATION) == sequenceID)
		//	return;
		getAnimation(dataTracker.get(ANIMATION)).stop();
		getAnimation(id).start(age);
		dataTracker.set(ANIMATION, id);
		dataTracker.set(ANIMATION_START, age);
		//reset animation flags
		animFlags = 0;
	}
	
	AnimationState getAnimation(byte id)
	{
		return switch(id)
		{
			default -> null;
			case UNSUMMONED_POSE -> unsummonedPoseAnimationState;
			case SPAWN_SEQUENCE_ANIM -> spawnSequenceAnimationState;
			case IDLE_ANIM -> idleAnimationState;
			case SWING_ANIM -> swingAnimationState;
			case SLAM_ANIM -> slamAnimationState;
			case PHASE_TRANSITION_ANIM -> phaseTransitionAnimationState;
		};
	}
	
	byte getCurrentAnimation()
	{
		return dataTracker.get(ANIMATION);
	}
	
	float getCurrentAnimationDuration()
	{
		return (age - dataTracker.get(ANIMATION_START)) / 20f;
	}
	
	int setAnimationFlag(int idx, boolean state)
	{
		if(state)
			return animFlags = animFlags | 1 << idx;
		else
			return animFlags = animFlags & ~(1 << idx);
	}
	
	boolean getAnimationFlag(int idx)
	{
		return ((animFlags >> idx) & 1) == 1;
	}
	
	public boolean shouldEyesGlow()
	{
		float animDuration = getCurrentAnimationDuration();
		if(getCurrentAnimation() == SPAWN_SEQUENCE_ANIM)
			return animDuration > 2f && animDuration < 8.5f;
		return hasClaw() && !(getCurrentAnimation() == PHASE_TRANSITION_ANIM && animDuration < 2f);
	}
	
	public boolean hasLantern()
	{
		return true;
	}
	
	public boolean hasClaw()
	{
		return dataTracker.get(CLAW);
	}
	
	@Override
	public boolean damage(DamageSource source, float amount)
	{
		if(!(source.isOf(DamageTypes.OUT_OF_WORLD) || source.isOf(DamageTypes.GENERIC_KILL)) && dataTracker.get(INTRO_TICKS) > 0)
			return false;
		boolean b = super.damage(source, amount);
		if(!dataTracker.get(CLAW) && b && getHealth() < getMaxHealth() / 2f && getHealth() > 0f)
		{
			setAnimation(PHASE_TRANSITION_ANIM);
			dataTracker.set(CLAW, true);
		}
		return b;
	}
	
	public boolean shouldApplyLampArmPose()
	{
		return getCurrentAnimation() == IDLE_ANIM;
	}
	
	public boolean shouldApplyClawPose()
	{
		return getCurrentAnimation() != PHASE_TRANSITION_ANIM;
	}
	
	public boolean shouldShowClawWithoutExtras()
	{
		return getCurrentAnimation() == SLAM_ANIM;
	}
}
