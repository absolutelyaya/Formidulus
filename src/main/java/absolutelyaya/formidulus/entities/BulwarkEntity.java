package absolutelyaya.formidulus.entities;

import absolutelyaya.formidulus.registries.EntityRegistry;
import absolutelyaya.formidulus.registries.SoundRegistry;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.UUID;

public class BulwarkEntity extends AnimatedEntity
{
	public static final TrackedData<Optional<UUID>> OWNER = DataTracker.registerData(BulwarkEntity.class, TrackedDataHandlerRegistry.OPTIONAL_UUID);
	public AnimationState placeAnimationState = new AnimationState();
	public AnimationState hitAnimationState = new AnimationState();
	public AnimationState removeAnimationState = new AnimationState();
	
	static final byte PLACE_ANIM = 0;
	static final byte HIT_ANIM = 1;
	static final byte REMOVE_ANIM = 2;
	
	public BulwarkEntity(EntityType<? extends AnimatedEntity> type, World world)
	{
		super(type, world);
	}
	
	@Override
	protected void initDataTracker(DataTracker.Builder builder)
	{
		super.initDataTracker(builder);
		builder.add(OWNER, Optional.empty());
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
		bulwark.setAnimation(PLACE_ANIM);
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
	public void onSpawnPacket(EntitySpawnS2CPacket packet)
	{
		super.onSpawnPacket(packet);
		if(getWorld().isClient)
			setAnimation(PLACE_ANIM);
	}
	
	@Override
	protected @Nullable AnimationState getAnimationState(byte id)
	{
		return switch(id)
		{
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
	public boolean damage(DamageSource source, float amount)
	{
		boolean b = super.damage(source, amount);
		if(b)
		{
			if(getHealth() <= 0f)
			{
				setAnimation(REMOVE_ANIM);
				dataTracker.get(OWNER).ifPresent(p -> {
				
				});
				playSound(SoundRegistry.BULWARK_BREAK, 1f, 0.8f);
			}
			else
			{
				setAnimation(HIT_ANIM);
			}
		}
		return b;
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
		if(!getWorld().isClient && (owner == null || !owner.isAlive() || new Vec2f((float)getX(), (float)getZ()).distanceSquared(new Vec2f((float)owner.getX(), (float)owner.getZ())) > 1f))
			setAnimation(REMOVE_ANIM);
		if(getCurrentAnimation() == PLACE_ANIM && getCurrentAnimationDuration() >= 0.3f && !getAnimationFlag(0))
		{
			playSound(SoundRegistry.BULWARK_BLOCK, 1f, 0.8f);
			setAnimationFlag(0, true);
		}
		if(owner != null)
			setPos(getX(), owner.getY(), getZ());
	}
}
