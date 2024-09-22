package absolutelyaya.formidulus.entities;

import net.minecraft.entity.AnimationState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.TypeFilter;
import net.minecraft.world.World;

public class DeerGodEntity extends HostileEntity
{
	static final TrackedData<Boolean> SUMMONED = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	static final TrackedData<Byte> ANIMATION = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.BYTE);
	static final TrackedData<Integer> ANIMATION_START = DataTracker.registerData(DeerGodEntity.class, TrackedDataHandlerRegistry.INTEGER);
	
	static final byte UNSUMMONED_POSE = 0;
	static final byte SPAWN_SEQUENCE_ANIM = 1;
	static final byte IDLE_ANIM = 2;
	public AnimationState unsummonedPoseAnimationState = new AnimationState();
	public AnimationState spawnSequenceAnimationState = new AnimationState();
	public AnimationState idleAnimationState = new AnimationState();
	
	public DeerGodEntity(EntityType<? extends HostileEntity> entityType, World world)
	{
		super(entityType, world);
		unsummonedPoseAnimationState.start(0);
	}
	
	@Override
	protected void initDataTracker(DataTracker.Builder builder)
	{
		super.initDataTracker(builder);
		builder.add(SUMMONED, false);
		builder.add(ANIMATION, UNSUMMONED_POSE);
		builder.add(ANIMATION_START, 0);
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
		if(dataTracker.get(ANIMATION).equals(SPAWN_SEQUENCE_ANIM) && getAnimDuration() >= 11f)
			setAnimation(IDLE_ANIM);
	}
	
	@Override
	public void tickMovement()
	{
		super.tickMovement();
		//TODO: vanishing
		//for (int i = 0; i < 3; i++)
		//{
		//	Vec3d pos = new Vec3d(getX(), getY(), getZ()).add((random.nextFloat() - 0.5f) * 2f, random.nextFloat() * 4.5f, (random.nextFloat() - 0.5f) * 2f);
		//	getWorld().addParticle(new DustParticleEffect(new Vector3f(0f, 0f, 0f), 5f), pos.x, pos.y, pos.z, 0f, 0f, 0f);
		//}
	}
	
	void setAnimation(byte id)
	{
		if(dataTracker.get(ANIMATION) == id)
			return;
		getAnimation(dataTracker.get(ANIMATION)).stop();
		getAnimation(id).start(age);
		dataTracker.set(ANIMATION, id);
	}
	
	AnimationState getAnimation(byte id)
	{
		return switch(id)
		{
			default -> null;
			case UNSUMMONED_POSE -> unsummonedPoseAnimationState;
			case SPAWN_SEQUENCE_ANIM -> spawnSequenceAnimationState;
			case IDLE_ANIM -> idleAnimationState;
		};
	}
	
	float getAnimDuration()
	{
		return (age - dataTracker.get(ANIMATION_START)) / 20f;
	}
}
