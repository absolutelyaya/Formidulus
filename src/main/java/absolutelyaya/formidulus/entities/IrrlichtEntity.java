package absolutelyaya.formidulus.entities;

import absolutelyaya.formidulus.registries.EntityRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityStatuses;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.TypeFilter;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class IrrlichtEntity extends MobEntity
{
	public static final byte FOLLOWER_TYPE = 0;
	public static final byte PROJECTILE_TYPE = 1;
	static final TrackedData<Byte> TYPE = DataTracker.registerData(IrrlichtEntity.class, TrackedDataHandlerRegistry.BYTE);
	
	int lifetime, targetCheckTimer;
	Entity owner;
	
	public IrrlichtEntity(EntityType<? extends MobEntity> entityType, World world)
	{
		super(entityType, world);
		lifetime = 200;
		setNoGravity(true);
		noClip = true;
	}
	
	@Override
	protected void initDataTracker(DataTracker.Builder builder)
	{
		super.initDataTracker(builder);
		builder.add(TYPE, FOLLOWER_TYPE);
	}
	
	@Override
	public void tick()
	{
		super.tick();
		if(isDead() || isRemoved())
			return;
		if(getWorld().isClient)
		{
			if(random.nextFloat() < 0.1f)
				getWorld().addParticle(ParticleTypes.SMOKE, getX(), getY() + getHeight(), getZ(), 0, 0, 0);
			return;
		}
		switch(dataTracker.get(TYPE))
		{
			case FOLLOWER_TYPE -> tickFollower();
			case PROJECTILE_TYPE -> tickProjectile();
		}
		if(lifetime-- <= 0)
		{
			getWorld().sendEntityStatus(this, EntityStatuses.ADD_DEATH_PARTICLES);
			remove(RemovalReason.KILLED);
		}
	}
	
	void tickFollower()
	{
		float targetDistance = Float.MAX_VALUE;
		LivingEntity target = null;
		if(targetCheckTimer-- <= 0)
		{
			for(PlayerEntity p : getWorld().getEntitiesByType(TypeFilter.instanceOf(PlayerEntity.class),
					getBoundingBox().expand(16), i -> !i.isCreative() && !i.isDead()))
			{
				if(target == null)
				{
					target = p;
					targetDistance = distanceTo(target);
				}
				else if(targetDistance > distanceTo(p))
					target = p;
			}
			setTarget(target);
		}
		Vec3d targetVelocity;
		if(target != null)
			targetVelocity = target.getPos().add(0f, 1f, 0f).subtract(getPos()).normalize().multiply(0.15 * getMovementSpeed());
		else
			targetVelocity = Vec3d.ZERO;
		setVelocity(getVelocity().lerp(targetVelocity, 0.1f));
		if(getTarget() != null && getPos().distanceTo(getTarget().getBoundingBox().getCenter()) < 0.2f)
		{
			getTarget().setFireTicks(getTarget().getFireTicks() + 60);
			getWorld().sendEntityStatus(this, EntityStatuses.ADD_DEATH_PARTICLES);
			remove(RemovalReason.KILLED);
		}
	}
	
	void tickProjectile()
	{
		setVelocity(0f, 0.15 * getMovementSpeed() * (lifetime / 100f), 0f);
		if(lifetime == 1)
		{
			Vec3d checkPos = getPos();
			if(owner != null)
				checkPos = owner.getPos();
			List<PlayerEntity> targets = getWorld().getEntitiesByType(TypeFilter.instanceOf(PlayerEntity.class),
					Box.from(checkPos).expand(32), i -> isAlive() && !i.isSpectator());
			if(!targets.isEmpty())
			{
				PlayerEntity target = targets.get(random.nextInt(targets.size()));
				FireballProjectile fireball = new FireballProjectile(EntityRegistry.PUMPKIN, getWorld());
				fireball.setOwner(owner);
				fireball.setPosition(getPos());
				Vec3d vel = target.getBoundingBox().getCenter().subtract(getPos());
				fireball.setVelocity(vel.normalize().multiply(0.5f * Math.max(getWorld().getDifficulty().getId(), 1f)));
				getWorld().spawnEntity(fireball);
			}
		}
	}
	
	@Override
	public float getMovementSpeed()
	{
		return 1f + (getWorld().getDifficulty().getId() * 0.25f);
	}
	
	public void setLifetime(int lifetime)
	{
		this.lifetime = lifetime;
	}
	
	public void setType(byte type)
	{
		dataTracker.set(TYPE, type);
	}
	
	public void setOwner(Entity owner)
	{
		this.owner = owner;
	}
	
	@Override
	protected void pushAway(Entity entity)
	{
	
	}
	
	@Override
	public void pushAwayFrom(Entity entity)
	{
	
	}
	
	@Nullable
	@Override
	protected SoundEvent getDeathSound()
	{
		return SoundEvents.BLOCK_FIRE_EXTINGUISH;
	}
	
	@Nullable
	@Override
	protected SoundEvent getAmbientSound()
	{
		return SoundEvents.BLOCK_FIRE_AMBIENT;
	}
	
	@Override
	public void handleStatus(byte status)
	{
		if(status == EntityStatuses.ADD_DEATH_PARTICLES)
		{
			for (int i = 0; i < 5; i++)
			{
				Vec3d vel = Vec3d.ZERO.addRandom(random, 0.1f);
				getWorld().addParticle(ParticleTypes.FLAME, getX(), getY(), getZ(), vel.x, vel.y, vel.z);
			}
			return;
		}
		super.handleStatus(status);
	}
	
	@Override
	public void writeCustomDataToNbt(NbtCompound nbt)
	{
		super.writeCustomDataToNbt(nbt);
		nbt.putByte("Type", dataTracker.get(TYPE));
	}
	
	@Override
	public void readCustomDataFromNbt(NbtCompound nbt)
	{
		super.readCustomDataFromNbt(nbt);
		if(nbt.contains("Type", NbtElement.BYTE_TYPE))
			dataTracker.set(TYPE, nbt.getByte("Type"));
	}
}
