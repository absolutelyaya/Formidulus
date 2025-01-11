package absolutelyaya.formidulus.entities;

import absolutelyaya.formidulus.components.FormidableComponents;
import absolutelyaya.formidulus.components.entity.IBulwarkComponent;
import absolutelyaya.formidulus.entities.goal.InterruptableGoal;
import absolutelyaya.formidulus.registries.EntityRegistry;
import absolutelyaya.formidulus.registries.SoundRegistry;
import absolutelyaya.formidulus.registries.TagRegistry;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.TypeFilter;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.UUID;

public class BulwarkEntity extends AnimatedEntity
{
	public static final TrackedData<Optional<UUID>> OWNER = DataTracker.registerData(BulwarkEntity.class, TrackedDataHandlerRegistry.OPTIONAL_UUID);
	public static final TrackedData<Boolean> SMASH = DataTracker.registerData(BulwarkEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	public AnimationState prePlaceAnimationState = new AnimationState();
	public AnimationState placeAnimationState = new AnimationState();
	public AnimationState hitAnimationState = new AnimationState();
	public AnimationState removeAnimationState = new AnimationState();
	
	static final byte PREPLACE_ANIM = 0;
	static final byte PLACE_ANIM = 1;
	static final byte HIT_ANIM = 2;
	static final byte REMOVE_ANIM = 3;
	
	public BulwarkEntity(EntityType<? extends AnimatedEntity> type, World world)
	{
		super(type, world);
	}
	
	@Override
	protected void initDataTracker(DataTracker.Builder builder)
	{
		super.initDataTracker(builder);
		builder.add(OWNER, Optional.empty());
		builder.add(SMASH, false);
	}
	
	public static BulwarkEntity place(PlayerEntity owner)
	{
		if(owner == null || !owner.isAlive())
			return null;
		BulwarkEntity bulwark = new BulwarkEntity(EntityRegistry.BULWARK, owner.getWorld());
		bulwark.setOwner(owner);
		bulwark.setPosition(owner.getPos().add(owner.getRotationVector().multiply(1, 0, 1).normalize().multiply(0.4f)));
		bulwark.setYaw(owner.getYaw());
		owner.getWorld().spawnEntity(bulwark);
		bulwark.setYaw(owner.getYaw());
		bulwark.setHeadYaw(owner.getYaw());
		bulwark.setBodyYaw(owner.getYaw());
		bulwark.setAnimation(PREPLACE_ANIM);
		if(!owner.isOnGround())
			bulwark.dataTracker.set(SMASH, true);
		return bulwark;
	}
	
	public void setOwner(PlayerEntity owner)
	{
		if(owner == null)
			dataTracker.set(OWNER, Optional.empty());
		else
			dataTracker.set(OWNER, Optional.of(owner.getUuid()));
	}
	
	public PlayerEntity getOwner()
	{
		if(dataTracker.get(OWNER).isEmpty())
			return null;
		return getWorld().getPlayerByUuid(dataTracker.get(OWNER).get());
	}
	
	@Override
	protected @Nullable AnimationState getAnimationState(byte id)
	{
		return switch(id)
		{
			case PREPLACE_ANIM -> prePlaceAnimationState;
			case PLACE_ANIM -> placeAnimationState;
			case HIT_ANIM -> hitAnimationState;
			case REMOVE_ANIM -> removeAnimationState;
			default -> null;
		};
	}
	
	@Override
	public boolean canTakeDamage()
	{
		return getCurrentAnimation() == HIT_ANIM || (getCurrentAnimation() == PLACE_ANIM && getCurrentAnimationDuration() > 0.35f);
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
	protected void pushOutOfBlocks(double x, double y, double z)
	{
	
	}
	
	@Override
	public boolean isPushedByFluids()
	{
		return false;
	}
	
	@Override
	public boolean hasNoGravity()
	{
		return true;
	}
	
	@Override
	public void takeKnockback(double strength, double x, double z)
	{
	
	}
	
	@Override
	public int getAir()
	{
		return 20; // a shield can't drown.
	}
	
	@Override
	public boolean damage(DamageSource source, float amount)
	{
		if(source.isOf(DamageTypes.ON_FIRE))
			return super.damage(source, amount);
		return false; // avoid being damaged twice by AOE
	}
	
	public void redirectDamage(DamageSource source, float amount)
	{
		boolean b = super.damage(source, amount);
		if(b)
		{
			if(getHealth() <= 0f)
			{
				setAnimation(REMOVE_ANIM);
				PlayerEntity owner = getOwner();
				IBulwarkComponent comp = FormidableComponents.BULWARK.get(owner);
				comp.onBulwarkBreak();
				playSound(SoundRegistry.BULWARK_BREAK, 1f, 0.8f);
			}
			else
				setAnimation(HIT_ANIM);
		}
	}
	
	@Override
	protected void playHurtSound(DamageSource damageSource)
	{
		playSound(SoundRegistry.BULWARK_BLOCK, 1f, 0.8f);
	}
	
	@Override
	protected void updatePostDeath()
	{
	
	}
	
	@Override
	public void tick()
	{
		super.tick();
		if(!getWorld().isClient && getOwner() != null && getOwner().isOnGround() && getCurrentAnimation() == PREPLACE_ANIM && getCurrentAnimationDuration() > 0.25f)
			setAnimation(PLACE_ANIM);
		setVelocity(Vec3d.ZERO);
		if(isRemoved())
			return;
		if(getCurrentAnimation() == REMOVE_ANIM)
		{
			if(getCurrentAnimationDuration() > 0.75f)
				discard();
			return;
		}
		if(isRemoved())
			return;
		if(dataTracker.get(OWNER).isEmpty())
		{
			setAnimation(REMOVE_ANIM);
			return;
		}
		PlayerEntity owner = getWorld().getPlayerByUuid(dataTracker.get(OWNER).get());
		if(!getWorld().isClient && (owner == null || !owner.isAlive() ||
											new Vec2f((float)getX(), (float)getZ()).distanceSquared(new Vec2f((float)owner.getX(), (float)owner.getZ())) > 1f))
			setAnimation(REMOVE_ANIM);
		if(getCurrentAnimation() == PLACE_ANIM && getCurrentAnimationDuration() >= 0.1f && !getAnimationFlag(0))
		{
			if(!dataTracker.get(SMASH))
			{
				playSound(SoundRegistry.BULWARK_PLACE, 1f, 0.9f);
				for (int i = 0; i < 16; i++)
				{
					Vec3d ppos = getPos().add(Vec3d.ZERO.addRandom(random, 1.25f).multiply(1f, 0f, 1f));
					getWorld().addParticle(new BlockStateParticleEffect(ParticleTypes.BLOCK, getWorld().getBlockState(BlockPos.ofFloored(ppos).down())),
							ppos.x, ppos.y, ppos.z, 0f, 0f, 0f);
				}
			}
			else
			{
				playSound(SoundRegistry.BULWARK_SMASH, 1f, 0.9f);
				for (int i = 0; i < 32; i++)
				{
					Vec3d ppos = getPos().add(Vec3d.ZERO.addRandom(random, 2f).multiply(1f, 0f, 1f));
					getWorld().addParticle(new BlockStateParticleEffect(ParticleTypes.DUST_PILLAR, getWorld().getBlockState(BlockPos.ofFloored(ppos).down())),
							ppos.x, ppos.y, ppos.z, 0f, 0.33f, 0f);
				}
				if(!getWorld().isClient)
				{
					getWorld().getEntitiesByType(TypeFilter.instanceOf(LivingEntity.class), getBoundingBox().expand(2f, 1f, 2f),
									i -> i.canTakeDamage() && !(i.equals(owner) || i.equals(this)))
							.forEach(living -> {
								Vec3d dir = living.getPos().subtract(getPos()).multiply(1f, 0f, 1f).normalize();
								living.addVelocity(dir.multiply(2f).add(0f, 0.2f, 0f)
														   .multiply(Math.max(1f - living.getAttributeValue(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE) -
																   getPos().multiply(1, 0, 1).distanceTo(living.getPos().multiply(1, 0, 1)) / 3f, 0)));
								if(owner != null)
									living.setAttacker(owner);
							});
				}
			}
			setAnimationFlag(0, true);
		}
		if(owner != null)
			setPosition(getX(), owner.getY(), getZ());
	}
	
	public boolean tryBlockDamage(DamageSource source, float amount)
	{
		if(source.isIn(TagRegistry.BULWARK_UNBLOCKABLE_DAMAGE))
			return false;
		if(source.getSource() instanceof Entity src && tryBlockDamage(src, source, amount))
			return true;
		return source.getAttacker() instanceof Entity src && tryBlockDamage(src, source, amount);
	}
	
	public boolean tryBlockDamage(Entity sourceEntity, DamageSource source, float amount)
	{
		float angle = getRelativeHorizontalAngleTo(getPos(), sourceEntity.getPos(), getRotationVector());
		boolean frontal = angle > 0.3f;
		if(frontal && !source.isIn(TagRegistry.BULWARK_UNBLOCKABLE_DAMAGE))
		{
			redirectDamage(source, amount);
			if(sourceEntity instanceof AnimatedHostileEntity entity)
				entity.tryInterruptActiveGoals(InterruptableGoal.BULWARK);
			return true;
		}
		return false;
	}
}
