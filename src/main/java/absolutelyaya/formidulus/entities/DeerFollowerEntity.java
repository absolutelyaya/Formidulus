package absolutelyaya.formidulus.entities;

import net.minecraft.block.Blocks;
import net.minecraft.command.argument.EntityAnchorArgumentType;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.control.LookControl;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypeFilter;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

import java.util.EnumSet;
import java.util.List;

public class DeerFollowerEntity extends HostileEntity
{
	static final TrackedData<Boolean> READING = DataTracker.registerData(DeerFollowerEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	static final TrackedData<Boolean> MASK = DataTracker.registerData(DeerFollowerEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	static final TrackedData<Byte> VARIANT = DataTracker.registerData(DeerFollowerEntity.class, TrackedDataHandlerRegistry.BYTE);
	static final TrackedData<Vector3f> ALTAR = DataTracker.registerData(DeerFollowerEntity.class, TrackedDataHandlerRegistry.VECTOR3F);
	
	boolean hasAltar;
	
	public DeerFollowerEntity(EntityType<? extends HostileEntity> entityType, World world)
	{
		super(entityType, world);
		lookControl = new LookControl(this) {
			@Override
			protected boolean shouldStayHorizontal()
			{
				return false;
			}
		};
	}
	
	@Override
	protected void initGoals()
	{
		super.initGoals();
		goalSelector.add(0, new MeleeAttackGoal(this, 0.4f, false));
		goalSelector.add(1, new SearchForAltarGoal(this, 0.3f));
		goalSelector.add(1, new PatrolAltarGoal(this, 0.25f));
		goalSelector.add(1, new WorshipGoal(this, 0.4f));
		goalSelector.add(3, new ReadBookGoal(this));
		goalSelector.add(4, new LookAroundGoal(this));
		goalSelector.add(4, new LookAtEntityGoal(this, DeerFollowerEntity.class, 6));
		
		targetSelector.add(0, new ActiveTargetGoal<>(this, PlayerEntity.class, true));
		targetSelector.add(0, new RevengeGoal(this, DeerGodEntity.class));
	}
	
	@Override
	protected void initDataTracker(DataTracker.Builder builder)
	{
		super.initDataTracker(builder);
		builder.add(READING, false);
		builder.add(MASK, true);
		builder.add(VARIANT, (byte)0);
		builder.add(ALTAR, new Vector3f());
	}
	
	@Override
	public void onTrackedDataSet(TrackedData<?> data)
	{
		super.onTrackedDataSet(data);
		if(getWorld().isClient && data.equals(MASK))
		{
			if(!dataTracker.get(MASK))
			{
				for (int i = 0; i < 32; i++)
				{
					Vec3d pos = getEyePos().addRandom(random, 1f);
					getWorld().addParticle(new BlockStateParticleEffect(ParticleTypes.BLOCK, Blocks.BONE_BLOCK.getDefaultState()), pos.x, pos.y, pos.z,
							0, 0, 0);
				}
			}
			else
			{
				for (int i = 0; i < 16; i++)
				{
					Vec3d pos = getEyePos().addRandom(random, 1f);
					getWorld().addParticle(new DustParticleEffect(new Vector3f(0f, 0f, 0f), 5f), pos.x, pos.y, pos.z,
							0, 0, 0);
				}
			}
		}
		if(data.equals(ALTAR))
			hasAltar = !dataTracker.get(ALTAR).equals(new Vector3f());
	}
	
	@Nullable
	@Override
	public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData)
	{
		initEquipment(random, difficulty);
		return super.initialize(world, difficulty, spawnReason, entityData);
	}
	
	@Override
	protected void initEquipment(Random random, LocalDifficulty localDifficulty)
	{
		equipStack(EquipmentSlot.MAINHAND, Items.IRON_SWORD.getDefaultStack());
		if(getWorld() instanceof ServerWorld serverWorld && random.nextFloat() < localDifficulty.getLocalDifficulty() / 10f)
			enchantEquipment(serverWorld, random, EquipmentSlot.MAINHAND, localDifficulty);
		setEquipmentDropChance(EquipmentSlot.MAINHAND, 0.1f);
		if(random.nextFloat() < 0.1f + localDifficulty.getLocalDifficulty() / 10f)
		{
			if(getWorld() instanceof ServerWorld serverWorld && random.nextFloat() < localDifficulty.getLocalDifficulty() / 10f)
			{
				equipStack(EquipmentSlot.OFFHAND, Items.ENCHANTED_BOOK.getDefaultStack());
				enchantEquipment(serverWorld, random, EquipmentSlot.OFFHAND, localDifficulty); //TODO: fix the enchanted books not actually having an enchantment
				setEquipmentDropChance(EquipmentSlot.OFFHAND, 1f);
			}
			else
				equipStack(EquipmentSlot.OFFHAND, Items.BOOK.getDefaultStack());
			setEquipmentDropChance(EquipmentSlot.OFFHAND, 0.33f);
		}
	}
	
	@Override
	public int getArmor()
	{
		int armor = super.getArmor()* (isHasMask() ? 3 : 1);
		return armor + (getWorld().getDifficulty().getId() - 1) * 5;
	}
	
	@Override
	public boolean damage(DamageSource source, float amount)
	{
		boolean b = super.damage(source, amount);
		if(!getWorld().isClient && dataTracker.get(MASK) && random.nextFloat() < 0.01f * amount)
		{
			dataTracker.set(MASK, false);
			playSound(SoundEvents.ENTITY_ITEM_BREAK);
		}
		return b;
	}
	
	@Override
	public void tickMovement()
	{
		super.tickMovement();
		if(isReading() && age % 40 == 0 && random.nextFloat() < 0.33f)
			swingHand(Hand.OFF_HAND);
		if(getPose().equals(EntityPose.SITTING) && moveControl.isMoving())
			setPose(EntityPose.STANDING);
		
		if(!isHasAltar())
		{
			List<DeerGodEntity> list = getWorld().getEntitiesByType(TypeFilter.instanceOf(DeerGodEntity.class), Box.from(getPos()).expand(32), i -> true);
			if(!list.isEmpty())
			{
				DeerGodEntity deer = list.getFirst();
				dataTracker.set(ALTAR, deer.getOrigin());
				setTarget(deer.getTarget());
			}
		}
	}
	
	public boolean isReading()
	{
		return dataTracker.get(READING);
	}
	
	public boolean isArmsVisible()
	{
		return isReading() || isAttacking();
	}
	
	public boolean isHasMask()
	{
		return dataTracker.get(MASK);
	}
	
	public byte getVariant()
	{
		return dataTracker.get(VARIANT);
	}
	
	public Vector3f getAltar()
	{
		return dataTracker.get(ALTAR);
	}
	
	public boolean isHasAltar()
	{
		return hasAltar;
	}
	
	@Override
	public void readCustomDataFromNbt(NbtCompound nbt)
	{
		super.readCustomDataFromNbt(nbt);
		if(nbt.contains("Variant", NbtElement.BYTE_TYPE))
			dataTracker.set(VARIANT, nbt.getByte("Variant"));
		else
			dataTracker.set(VARIANT, (byte)(random.nextFloat() * 3.99));
		if(nbt.contains("Sitting", NbtElement.BYTE_TYPE) && nbt.getBoolean("Sitting"))
			setPose(EntityPose.SITTING);
		if(nbt.contains("Mask", NbtElement.BYTE_TYPE))
			dataTracker.set(MASK, nbt.getBoolean("Mask"));
		if(nbt.contains("Altar", NbtElement.COMPOUND_TYPE))
		{
			NbtCompound altar = nbt.getCompound("Altar");
			dataTracker.set(ALTAR, new Vector3f(altar.getFloat("x"), altar.getFloat("y"), altar.getFloat("z")));
		}
	}
	
	@Override
	public void writeCustomDataToNbt(NbtCompound nbt)
	{
		super.writeCustomDataToNbt(nbt);
		nbt.putByte("Variant", dataTracker.get(VARIANT));
		nbt.putBoolean("Sitting", getPose().equals(EntityPose.SITTING));
		nbt.putBoolean("Mask", dataTracker.get(MASK));
		if(isHasAltar())
		{
			NbtCompound altar = new NbtCompound();
			Vector3f altarPos = dataTracker.get(ALTAR);
			altar.putFloat("x", altarPos.x);
			altar.putFloat("y", altarPos.y);
			altar.putFloat("z", altarPos.z);
			nbt.put("Altar", altar);
		}
	}
	
	static class SearchForAltarGoal extends WanderAroundGoal
	{
		final DeerFollowerEntity mob;
		
		public SearchForAltarGoal(DeerFollowerEntity mob, double speed)
		{
			super(mob, speed);
			this.mob = mob;
		}
		
		@Override
		public boolean canStart()
		{
			return !mob.isHasAltar() && mob.getTarget() == null && super.canStart();
		}
	}
	
	static class PatrolAltarGoal extends Goal
	{
		final DeerFollowerEntity mob;
		final float speed;
		
		public PatrolAltarGoal(DeerFollowerEntity mob, float speed)
		{
			this.mob = mob;
			this.speed = speed;
			setControls(EnumSet.of(Control.MOVE));
		}
		
		@Override
		public boolean canStart()
		{
			return mob.isHasAltar() && mob.getTarget() == null && mob.navigation.isIdle() && mob.random.nextFloat() < 0.01f;
		}
		
		@Override
		public void start()
		{
			super.start();
			Vec3d center = new Vec3d(mob.getAltar());
			for (int i = 0; i < 16; i++)
			{
				Vec3d dest = center.add((mob.random.nextFloat() - 0.5) * 2 * 32f, 0f, (mob.random.nextFloat() - 0.5) * 2 * 32f);
				BlockHitResult bHit = mob.getWorld().raycast(new RaycastContext(dest.add(0, 16, 0), dest.subtract(0, 32, 0),
						RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, mob));
				if(!bHit.getType().equals(HitResult.Type.MISS))
				{
					dest = bHit.getPos();
					if(mob.getWorld().isSpaceEmpty(mob.getBoundingBox().offset(mob.getPos().multiply(-1)).offset(dest)) &&
							   mob.navigation.startMovingTo(dest.x, dest.y, dest.z, speed))
					{
						stop();
						return;
					}
				}
			}
		}
	}
	
	static class ReadBookGoal extends Goal
	{
		final DeerFollowerEntity mob;
		int duration;
		
		public ReadBookGoal(DeerFollowerEntity mob)
		{
			this.mob = mob;
			setControls(EnumSet.of(Control.MOVE, Control.LOOK));
		}
		
		@Override
		public boolean canStart()
		{
			ItemStack offHand = mob.getOffHandStack();
			return mob.isHasAltar() && mob.getTarget() == null && mob.navigation.isIdle() && (offHand.isOf(Items.BOOK) || offHand.isOf(Items.ENCHANTED_BOOK)) &&
						   (mob.random.nextFloat() < 0.05f || mob.isReading());
		}
		
		@Override
		public void start()
		{
			duration = 200 + (int)(mob.random.nextFloat() * 300);
			mob.navigation.stop();
			mob.dataTracker.set(READING, true);
			if(mob.random.nextFloat() < 0.5)
				mob.setPose(EntityPose.SITTING);
		}
		
		@Override
		public boolean shouldContinue()
		{
			return super.shouldContinue() && duration-- > 0;
		}
		
		@Override
		public boolean canStop()
		{
			return !shouldContinue();
		}
		
		@Override
		public void tick()
		{
			super.tick();
			mob.setPitch(30f);
		}
		
		@Override
		public void stop()
		{
			super.stop();
			mob.dataTracker.set(READING, false);
			if(mob.getPose().equals(EntityPose.SITTING))
				mob.setPose(EntityPose.STANDING);
			mob.setPitch(0f);
		}
	}
	
	static class WorshipGoal extends Goal
	{
		final DeerFollowerEntity mob;
		final int duration = 100;
		final float speed;
		int time;
		boolean arrived;
		
		public WorshipGoal(DeerFollowerEntity mob, float moveSpeed)
		{
			this.mob = mob;
			this.speed = moveSpeed;
			setControls(EnumSet.of(Control.MOVE, Control.LOOK));
		}
		
		@Override
		public boolean canStart()
		{
			return mob.getTarget() == null && mob.hasAltar && (mob.random.nextFloat() < 0.005f || (!mob.isHasMask() && mob.random.nextFloat() < 0.1));
		}
		
		@Override
		public void start()
		{
			super.start();
			time = duration;
			arrived = false;
		}
		
		@Override
		public boolean shouldRunEveryTick()
		{
			return true;
		}
		
		@Override
		public void tick()
		{
			super.tick();
			Vec3d altar = new Vec3d(mob.getAltar());
			if(!arrived && mob.getAltar().distance(mob.getPos().toVector3f()) > 4)
			{
				if(!mob.navigation.isIdle())
					return;
				Vec3d dest = altar.add(mob.getPos().subtract(altar).multiply(1f, 0f, 1f).normalize().multiply(1.5f + mob.random.nextFloat()));
				if(!mob.navigation.startMovingTo(dest.x, dest.y, dest.z, speed))
					stop();
				return;
			}
			if(!arrived)
			{
				arrived = true;
				mob.navigation.stop();
			}
			time--;
			//TODO: start worship animation
			mob.setPose(EntityPose.SITTING);
			mob.lookAt(EntityAnchorArgumentType.EntityAnchor.EYES, altar);
		}
		
		@Override
		public boolean shouldContinue()
		{
			return time > 0 && mob.getTarget() == null;
		}
		
		@Override
		public boolean canStop()
		{
			return !shouldContinue();
		}
		
		@Override
		public void stop()
		{
			super.stop();
			if(time <= 0 && !mob.isHasMask())
			{
				mob.dataTracker.set(MASK, true);
				mob.heal(15f);
			}
			//TODO: stop worship animation
			mob.setPose(EntityPose.STANDING);
			mob.setPitch(0f);
		}
	}
}
