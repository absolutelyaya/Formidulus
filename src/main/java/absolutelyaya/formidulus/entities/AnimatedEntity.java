package absolutelyaya.formidulus.entities;

import net.minecraft.entity.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public abstract class AnimatedEntity extends LivingEntity
{
	public static final TrackedData<Byte> ANIMATION = DataTracker.registerData(AnimatedEntity.class, TrackedDataHandlerRegistry.BYTE);
	public static final TrackedData<Integer> ANIMATION_START = DataTracker.registerData(AnimatedEntity.class, TrackedDataHandlerRegistry.INTEGER);
	byte lastAnimation;
	int animFlags;
	
	protected AnimatedEntity(EntityType<? extends LivingEntity> entityType, World world)
	{
		super(entityType, world);
	}
	
	@Override
	protected void initDataTracker(DataTracker.Builder builder)
	{
		super.initDataTracker(builder);
		builder.add(ANIMATION, (byte)0);
		builder.add(ANIMATION_START, 0);
	}
	
	@Override
	public void onTrackedDataSet(TrackedData<?> data)
	{
		super.onTrackedDataSet(data);
		if(getWorld().isClient)
		{
			if(data.equals(ANIMATION_START))
				age = dataTracker.get(ANIMATION_START); //to make sure the age and thus animation progress is synced
			if(data.equals(ANIMATION) && dataTracker.get(ANIMATION) > -1)
				setAnimation(dataTracker.get(ANIMATION));
		}
	}
	
	public void setAnimation(byte id)
	{
		if(!getWorld().isClient)
		{
			dataTracker.set(ANIMATION_START, age);
			dataTracker.set(ANIMATION, (byte)-1);
			dataTracker.set(ANIMATION, id);
		}
		if(getAnimationState(lastAnimation) instanceof AnimationState lastState)
			lastState.stop();
		if(getAnimationState(id) instanceof AnimationState newState)
			newState.start(age);
		lastAnimation = id;
		//reset animation flags
		animFlags = 0;
	}
	
	protected abstract @Nullable AnimationState getAnimationState(byte id);
	
	public byte getCurrentAnimation()
	{
		return dataTracker.get(ANIMATION);
	}
	
	public float getCurrentAnimationDuration()
	{
		return (age - dataTracker.get(ANIMATION_START)) / 20f;
	}
	
	protected void setAnimationFlag(int idx, boolean state)
	{
		if(state)
			animFlags = animFlags | 1 << idx;
		else
			animFlags = animFlags & ~(1 << idx);
	}
	
	protected boolean getAnimationFlag(int idx)
	{
		return ((animFlags >> idx) & 1) == 1;
	}
	
	@Override
	public boolean damage(DamageSource source, float amount)
	{
		return super.damage(source, amount);
	}
	
	public float getRelativeHorizontalAngleTo(Vec3d pos, Vec3d target, Vec3d forward)
	{
		Vec3d targetDir = target.multiply(1, 0, 1).subtract(pos.multiply(1, 0, 1)).normalize();
		forward = forward.multiply(1, 0, 1).normalize();
		return (float)targetDir.dotProduct(forward);
	}
	
	@Override
	public Iterable<ItemStack> getArmorItems()
	{
		return List.of();
	}
	
	@Override
	public ItemStack getEquippedStack(EquipmentSlot slot)
	{
		return ItemStack.EMPTY;
	}
	
	@Override
	public void equipStack(EquipmentSlot slot, ItemStack stack)
	{
	
	}
	
	@Override
	public Arm getMainArm()
	{
		return Arm.RIGHT;
	}
}
