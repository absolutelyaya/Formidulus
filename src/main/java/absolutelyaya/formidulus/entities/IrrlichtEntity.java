package absolutelyaya.formidulus.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityStatuses;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.TypeFilter;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class IrrlichtEntity extends MobEntity
{
	int lifetime, targetCheckTimer;
	
	public IrrlichtEntity(EntityType<? extends MobEntity> entityType, World world)
	{
		super(entityType, world);
		lifetime = 200;
		setNoGravity(true);
		noClip = true;
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
		float targetDistance = Float.MAX_VALUE;
		LivingEntity target = null;
		if(targetCheckTimer-- <= 0)
		{
			for(PlayerEntity p : getWorld().getEntitiesByType(TypeFilter.instanceOf(PlayerEntity.class), getBoundingBox().expand(16), i -> !i.isCreative() && !i.isDead()))
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
			targetVelocity = target.getPos().add(0f, 1f, 0f).subtract(getPos()).normalize().multiply(0.15);
		else
			targetVelocity = Vec3d.ZERO;
		setVelocity(getVelocity().lerp(targetVelocity, 0.1f));
		if(getTarget() != null && getPos().distanceTo(getTarget().getPos().add(0f, 1f, 0f)) < 0.05f)
		{
			getTarget().setFireTicks(getTarget().getFireTicks() + 60);
			getWorld().sendEntityStatus(this, EntityStatuses.ADD_DEATH_PARTICLES);
			remove(RemovalReason.KILLED);
		}
		if(lifetime-- <= 0)
		{
			getWorld().sendEntityStatus(this, EntityStatuses.ADD_DEATH_PARTICLES);
			remove(RemovalReason.KILLED);
		}
	}
	
	public void setLifetime(int lifetime)
	{
		this.lifetime = lifetime;
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
}
