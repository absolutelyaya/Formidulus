package absolutelyaya.formidulus.entities;

import absolutelyaya.formidulus.network.SequenceTriggerPayload;
import absolutelyaya.formidulus.particle.BloodDropParticleEffect;
import absolutelyaya.formidulus.registries.EntityRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.Blocks;
import net.minecraft.entity.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.TypeFilter;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.joml.Vector3f;

import java.util.List;

public class DeerGodEntity extends BossEntity
{
	static final TrackedData<Boolean> SUMMONED = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	static final TrackedData<Byte> ANIMATION = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.BYTE);
	static final TrackedData<Integer> ANIMATION_START = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.INTEGER);
	static final TrackedData<Integer> INTRO_TICKS = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.INTEGER);
	static final TrackedData<Boolean> LANTERN = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	static final TrackedData<Boolean> CLAW = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	static final TrackedData<Vector3f> ORIGIN = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.VECTOR3F);
	
	static final byte UNSUMMONED_POSE = 0;
	static final byte SPAWN_SEQUENCE_ANIM = 1;
	static final byte IDLE_ANIM = 2;
	static final byte SWING_ANIM = 3;
	static final byte SLAM_ANIM = 4;
	static final byte PHASE_TRANSITION_ANIM = 5;
	static final byte DEATH_ANIM = 6;
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
	public AnimationState deathAnimationState = new AnimationState();
	int animFlags, deathTime;
	byte lastAnimation;
	
	public DeerGodEntity(EntityType<? extends BossEntity> entityType, World world)
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
	public void onTrackedDataSet(TrackedData<?> data)
	{
		super.onTrackedDataSet(data);
		if(data.equals(ANIMATION) && getWorld().isClient)
			setAnimation(dataTracker.get(ANIMATION));
	}
	
	@Override
	public boolean isBossBarVisible()
	{
		return super.isBossBarVisible() && dataTracker.get(SUMMONED) && dataTracker.get(ANIMATION) != SPAWN_SEQUENCE_ANIM;
	}
	
	@Override
	protected void initDataTracker(DataTracker.Builder builder)
	{
		super.initDataTracker(builder);
		builder.add(SUMMONED, false);
		builder.add(ANIMATION, UNSUMMONED_POSE);
		builder.add(ANIMATION_START, 0);
		builder.add(INTRO_TICKS, 400);
		builder.add(LANTERN, true);
		builder.add(CLAW, false);
		builder.add(ORIGIN, getPos().toVector3f());
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
		if(!dataTracker.get(SUMMONED) && !getWorld().getEntitiesByType(TypeFilter.instanceOf(PlayerEntity.class), getBoundingBox().expand(16), i -> true).isEmpty())
		{
			setAnimation(SPAWN_SEQUENCE_ANIM);
			triggerMonologueSequence(SequenceTriggerPayload.SPAWN_SEQUENCE);
			dataTracker.set(SUMMONED, true);
		}
		if(dataTracker.get(INTRO_TICKS) > 0)
			dataTracker.set(INTRO_TICKS, dataTracker.get(INTRO_TICKS) - 1);
		
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
			if(!getAnimationFlag(0))
			{
				setAnimationFlag(0, true);
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
			if(getCurrentAnimationDuration() >= 18f)
				setAnimation(IDLE_ANIM);
		}
		if(getCurrentAnimation() == SLAM_ANIM)
		{
			if(!getAnimationFlag(0) && getCurrentAnimationDuration() >= 2.9f)
			{
				setAnimationFlag(0, true);
				for (int i = 0; i < 32; i++)
				{
					Vec3d pos = new Vec3d(0.5, 0, 3).rotateY((float)Math.toRadians(-getYaw())).add(getPos()).addRandom(random, 0.5f);
					Vec3d vel = Vec3d.ZERO.addRandom(random, 0.75f);
					vel = new Vec3d(vel.x, Math.abs(vel.y), vel.z);
					getWorld().addParticle(ParticleTypes.FLAME, pos.x, pos.y, pos.z, vel.x, vel.y, vel.z);
				}
				for (int i = 0; i < 64; i++)
				{
					Vec3d pos = new Vec3d(0.5, 0.75, 3).rotateY((float)Math.toRadians(-getYaw())).add(getPos()).addRandom(random, 1.5f);
					getWorld().addParticle(new BlockStateParticleEffect(ParticleTypes.BLOCK, Blocks.LANTERN.getDefaultState()),
							pos.x, pos.y, pos.z, 0, 0, 0);
				}
				for (int i = 0; i < 3; i++) //increase in second phase
				{
					Vec3d pos = new Vec3d(0.5, 0.75, 3).rotateY((float)Math.toRadians(-getYaw())).add(getPos());
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
				triggerMonologueSequence(SequenceTriggerPayload.PHASE_TRANSITION_SEQUENCE);
			}
			if(getCurrentAnimationDuration() >= 3.5f && getCurrentAnimationDuration() <= 4f)
			{
				for (int i = 0; i < 12; i++)
				{
					Vec3d pos = new Vec3d(getX(), getY(), getZ()).add((random.nextFloat() - 0.5f) * 2.2f, random.nextFloat() * 4.5f, (random.nextFloat() - 0.5f) * 2.2f);
					getWorld().addParticle(new DustParticleEffect(new Vector3f(0f, 0f, 0f), 5f), pos.x, pos.y, pos.z, 0f, 0f, 0f);
				}
				for (int i = 0; i < 12; i++)
				{
					Vector3f origin = dataTracker.get(ORIGIN);
					Vec3d pos = new Vec3d(origin.x, origin.y, origin.z).add((random.nextFloat() - 0.5f) * 2.2f, random.nextFloat() * 4.5f, (random.nextFloat() - 0.5f) * 2.2f);
					getWorld().addParticle(new DustParticleEffect(new Vector3f(0f, 0f, 0f), 5f), pos.x, pos.y, pos.z, 0f, 0f, 0f);
				}
			}
			if(!getAnimationFlag(1) && getCurrentAnimationDuration() >= 4.05f)
			{
				setAnimationFlag(1, true);
				Vector3f pos = dataTracker.get(ORIGIN);
				setPosition(pos.x, pos.y, pos.z);
			}
			if(getWorld().isClient && !getAnimationFlag(2) && getCurrentAnimationDuration() >= 5.5f)
			{
				setAnimationFlag(2, true);
				Vec3d dest = getPos().add((float)getRotationVector().x, getHeight() / 2f, (float)getRotationVector().z);
				for (int i = 0; i < 111; i++)
				{
					Vec3d dir = Vec3d.ZERO.addRandom(random, 1f).multiply(1f, 0f, 1f);
					Vec3d pos = getPos().add(dir.normalize().multiply((getRandom().nextFloat() - 0.5f) * 2f * 16f));
					getWorld().addParticle(new BloodDropParticleEffect(dest.toVector3f()),
							(float)pos.x, (float)getY(), (float)pos.z, 0f, 0f, 0f);
				}
			}
			if(getCurrentAnimationDuration() >= 18.05f)
				setAnimation(IDLE_ANIM);
		}
		
		//TODO: vanishing
		//for (int i = 0; i < 3; i++)
		//{
		//	Vec3d pos = new Vec3d(getX(), getY(), getZ()).add((random.nextFloat() - 0.5f) * 2f, random.nextFloat() * 4.5f, (random.nextFloat() - 0.5f) * 2f);
		//	getWorld().addParticle(new DustParticleEffect(new Vector3f(0f, 0f, 0f), 5f), pos.x, pos.y, pos.z, 0f, 0f, 0f);
		//}
	}
	
	void triggerMonologueSequence(byte id)
	{
		if(getWorld().isClient)
			return;
		List<ServerPlayerEntity> nearby = getWorld().getEntitiesByType(TypeFilter.instanceOf(ServerPlayerEntity.class), getBoundingBox().expand(64), LivingEntity::isAlive);
		nearby.forEach(i -> ServerPlayNetworking.send(i, new SequenceTriggerPayload(id)));
	}
	
	void setAnimation(byte id)
	{
		if(!getWorld().isClient)
		{
			dataTracker.set(ANIMATION, id);
			dataTracker.set(ANIMATION_START, age);
		}
		if(getAnimation(lastAnimation) instanceof AnimationState lastState)
			lastState.stop();
		if(getAnimation(id) instanceof AnimationState newState)
			newState.start(age);
		lastAnimation = id;
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
			case DEATH_ANIM -> deathAnimationState;
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
		return hasClaw() && !(getCurrentAnimation() == PHASE_TRANSITION_ANIM && animDuration < 2f) && getCurrentAnimation() != DEATH_ANIM;
	}
	
	public boolean hasLantern()
	{
		return dataTracker.get(LANTERN);
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
		if(getWorld().isClient)
			return b;
		if(!dataTracker.get(CLAW) && b && getHealth() <= getMaxHealth() / 2f && getHealth() > 0f)
		{
			setAnimation(PHASE_TRANSITION_ANIM);
			dataTracker.set(CLAW, true);
		}
		if(getHealth() <= 0)
		{
			setAnimation(DEATH_ANIM);
			triggerMonologueSequence(SequenceTriggerPayload.DEATH_SEQUENCE);
			if(bossBar != null)
				bossBar.setPercent(0f);
		}
		return b;
	}
	
	public boolean shouldApplyLampArmPose()
	{
		return getCurrentAnimation() == IDLE_ANIM;
	}
	
	public boolean shouldApplyClawPose()
	{
		return getCurrentAnimation() != PHASE_TRANSITION_ANIM && getCurrentAnimation() != DEATH_ANIM;
	}
	
	public boolean shouldShowClawWithoutExtras()
	{
		return getCurrentAnimation() == SLAM_ANIM;
	}
	
	@Override
	protected void updatePostDeath()
	{
		if(++deathTime >= 28f * 20 && !getWorld().isClient && !isRemoved()) //death animation is 23.25 seconds long, the sequence takes a bit longer tho
		{
			getWorld().sendEntityStatus(this, EntityStatuses.ADD_DEATH_PARTICLES);
			remove(RemovalReason.KILLED);
			dropItem(Items.DEAD_BUSH); //TODO: replace with deer skull
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
	
	@Override
	public void readCustomDataFromNbt(NbtCompound nbt)
	{
		super.readCustomDataFromNbt(nbt);
		if(nbt.contains("Summoned", NbtElement.BYTE_TYPE))
		{
			dataTracker.set(SUMMONED, nbt.getBoolean("Summoned"));
			setAnimation(IDLE_ANIM);
			dataTracker.set(ORIGIN, getPos().toVector3f());
		}
		if(nbt.contains("Claw", NbtElement.BYTE_TYPE))
			dataTracker.set(CLAW, nbt.getBoolean("Claw"));
		if(nbt.contains("Lantern", NbtElement.BYTE_TYPE))
			dataTracker.set(LANTERN, nbt.getBoolean("Lantern"));
		if(nbt.contains("Origin", NbtElement.COMPOUND_TYPE))
		{
			NbtCompound origin = nbt.getCompound("Origin");
			dataTracker.set(ORIGIN, new Vector3f(origin.getFloat("x"), origin.getFloat("y"), origin.getFloat("z")));
		}
	}
	
	@Override
	public void writeCustomDataToNbt(NbtCompound nbt)
	{
		super.writeCustomDataToNbt(nbt);
		if(dataTracker.get(SUMMONED))
		{
			nbt.putBoolean("Summoned", true);
			NbtCompound origin = new NbtCompound();
			Vector3f originPos = dataTracker.get(ORIGIN);
			origin.putFloat("x", originPos.x);
			origin.putFloat("y", originPos.y);
			origin.putFloat("z", originPos.z);
			nbt.put("Origin", origin);
		}
		if(dataTracker.get(LANTERN))
			nbt.putBoolean("Lantern", true);
		if(dataTracker.get(CLAW))
			nbt.putBoolean("Claw", true);
	}
}
