package absolutelyaya.formidulus.entities;

import absolutelyaya.formidulus.damage.DamageSources;
import absolutelyaya.formidulus.registries.ItemRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityStatuses;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.TypeFilter;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class PumpkinProjectile extends ThrownItemEntity
{
	public PumpkinProjectile(EntityType<? extends ThrownItemEntity> entityType, World world)
	{
		super(entityType, world);
		movementMultiplier = new Vec3d(1.01f, 1.01f, 1.01f);
		if(random.nextFloat() <= 0.25f)
			setItem(ItemRegistry.WEEN.getDefaultStack());
	}
	
	@Override
	protected Item getDefaultItem()
	{
		return Items.JACK_O_LANTERN;
	}
	
	@Override
	public boolean hasNoGravity()
	{
		return true;
	}
	
	@Override
	public void tick()
	{
		super.tick();
		if(!getWorld().isClient && age >= 200)
		{
			getWorld().sendEntityStatus(this, EntityStatuses.PLAY_DEATH_SOUND_OR_ADD_PROJECTILE_HIT_PARTICLES);
			discard();
			return;
		}
		if(age == 1)
		{
			Vec3d dest = getPos().add(getVelocity().normalize().multiply(32f));
			for (int i = 0; i < 64; i++)
			{
				Vec3d pos = getPos().lerp(dest, i / 64f);
				getWorld().addParticle(ParticleTypes.CRIT, pos.x, pos.y, pos.z, 0, 0, 0);
			}
		}
		
		if(getWorld().isClient)
		{
			Vec3d pos = getPos().addRandom(random, 0.15f);
			if(random.nextBoolean())
				getWorld().addParticle(ParticleTypes.SMOKE, pos.x, pos.y, pos.z, 0, 0, 0);
			else
				getWorld().addParticle(ParticleTypes.FLAME, pos.x, pos.y, pos.z, 0, 0, 0);
		}
	}
	
	@Override
	public void handleStatus(byte status)
	{
		super.handleStatus(status);
		if(status == EntityStatuses.PLAY_DEATH_SOUND_OR_ADD_PROJECTILE_HIT_PARTICLES)
		{
			for (int i = 0; i < 16; i++)
			{
				Vec3d vel = Vec3d.ZERO.addRandom(random, 0.2f);
				getWorld().addParticle(ParticleTypes.FLAME, getX(), getY(), getZ(), vel.x, vel.y, vel.z);
			}
			getWorld().playSound(null, getBlockPos(), SoundEvents.ITEM_FIRECHARGE_USE, SoundCategory.HOSTILE, 1f, 1f);
		}
	}
	
	@Override
	protected void onCollision(HitResult hitResult)
	{
		super.onCollision(hitResult);
		//getWorld().createExplosion(this, getX(), getY(), getZ(), 0.1f, World.ExplosionSourceType.MOB);
		if (!getWorld().isClient)
		{
			getWorld().sendEntityStatus(this, EntityStatuses.PLAY_DEATH_SOUND_OR_ADD_PROJECTILE_HIT_PARTICLES);
			discard();
		}
		getWorld().getEntitiesByType(TypeFilter.instanceOf(LivingEntity.class), getBoundingBox().expand(0.2f), i -> !i.equals(getOwner())).forEach(this::hitLiving);
		getWorld().playSound(null, getBlockPos(), SoundEvents.ITEM_FIRECHARGE_USE, SoundCategory.HOSTILE, 0.4f, 1f);
	}
	
	@Override
	protected void onEntityHit(EntityHitResult eHit)
	{
		super.onEntityHit(eHit);
		if(!(eHit.getEntity() instanceof LivingEntity living) || eHit.getEntity().equals(getOwner()))
			return;
		hitLiving(living);
	}
	
	void hitLiving(LivingEntity living)
	{
		living.damage(DamageSources.get(getWorld(), DamageTypes.FIREBALL, this, getOwner()), 6f);
		living.setFireTicks(living.getFireTicks() + 40 * (getWorld().getDifficulty().getId() + 1));
	}
	
	@Override
	protected boolean canHit(Entity entity)
	{
		if(entity instanceof IrrlichtEntity)
			return false;
		return super.canHit(entity);
	}
}
