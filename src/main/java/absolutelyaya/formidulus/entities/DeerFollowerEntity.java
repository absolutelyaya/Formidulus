package absolutelyaya.formidulus.entities;

import absolutelyaya.formidulus.entities.goal.ServantTargetGoal;
import absolutelyaya.formidulus.registries.ItemRegistry;
import absolutelyaya.formidulus.registries.ParticleRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.command.argument.EntityAnchorArgumentType;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
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
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
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
import java.util.stream.Stream;

public class DeerFollowerEntity extends ServantEntity
{
	static final TrackedData<Boolean> MASK = DataTracker.registerData(DeerFollowerEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	static final TrackedData<Byte> ACTIVITY = DataTracker.registerData(DeerFollowerEntity.class, TrackedDataHandlerRegistry.BYTE);
	static final TrackedData<Byte> VARIANT = DataTracker.registerData(DeerFollowerEntity.class, TrackedDataHandlerRegistry.BYTE);
	static final TrackedData<Vector3f> ALTAR = DataTracker.registerData(DeerFollowerEntity.class, TrackedDataHandlerRegistry.VECTOR3F);
	public static final byte ACTIVITY_IDLE = 0;
	public static final byte ACTIVITY_READING = 1;
	public static final byte ACTIVITY_WORSHIP = 2;
	public static final byte ACTIVITY_HUMMING = 3;
	
	boolean hasAltar;
	byte activity;
	
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
		goalSelector.add(0, new MeleeAttackGoal(this, 0.41f, false));
		goalSelector.add(0, new ProtectTheAltarGoal(this, 0.5f));
		goalSelector.add(1, new SearchForAltarGoal(this, 0.3f));
		goalSelector.add(1, new PatrolAltarGoal(this, 0.25f));
		goalSelector.add(1, new WorshipGoal(this, 0.3f));
		goalSelector.add(3, new ReadBookGoal(this, 0.01f));
		goalSelector.add(3, new HumGoal(this, 0.001f));
		goalSelector.add(4, new LookAroundGoal(this));
		goalSelector.add(4, new LookAtEntityGoal(this, DeerFollowerEntity.class, 6));
		
		targetSelector.add(0, new ActiveTargetGoal<>(this, PlayerEntity.class, true));
		targetSelector.add(0, new ServantTargetGoal(this));
		targetSelector.add(1, new RevengeGoal(this, DeerGodEntity.class));
	}
	
	@Override
	protected void initDataTracker(DataTracker.Builder builder)
	{
		super.initDataTracker(builder);
		builder.add(MASK, true);
		builder.add(ACTIVITY, ACTIVITY_IDLE);
		builder.add(VARIANT, (byte)(random.nextFloat() * 3.99));
		builder.add(ALTAR, new Vector3f());
	}
	
	@Override
	public void onTrackedDataSet(TrackedData<?> data)
	{
		super.onTrackedDataSet(data);
		if(getWorld().isClient && data.equals(MASK))
		{
			if (!dataTracker.get(MASK))
				addHeadParticles(new BlockStateParticleEffect(ParticleTypes.BLOCK, Blocks.BONE_BLOCK.getDefaultState()), 1f, 32);
			else
				addHeadParticles(ParticleRegistry.DARKNESS, 1f, 16);
		}
		if(data.equals(ALTAR))
			hasAltar = !dataTracker.get(ALTAR).equals(new Vector3f());
		if(data.equals(ACTIVITY))
			activity = dataTracker.get(ACTIVITY);
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
		equipStack(EquipmentSlot.MAINHAND, ItemRegistry.SACRIFICIAL_DAGGER.getDefaultStack());
		if(getWorld() instanceof ServerWorld serverWorld && random.nextFloat() < localDifficulty.getLocalDifficulty() / 10f)
			enchantEquipment(serverWorld, random, EquipmentSlot.MAINHAND, localDifficulty);
		setEquipmentDropChance(EquipmentSlot.MAINHAND, 0.1f);
		if(random.nextFloat() > 0.1f + localDifficulty.getLocalDifficulty() / 10f)
			return;
		if(getWorld() instanceof ServerWorld serverWorld && random.nextFloat() < localDifficulty.getLocalDifficulty() / 10f)
		{
			ItemStack enchantedBook = Items.ENCHANTED_BOOK.getDefaultStack();
			DynamicRegistryManager registryManager = serverWorld.getRegistryManager();
			Registry<Enchantment> reg = registryManager.get(RegistryKeys.ENCHANTMENT);
			// I couldn't figure out how this shit works properly
			// This is definitely not the right way to do it, but it works well enough for now
			List<EnchantmentLevelEntry> enchantments =  EnchantmentHelper.generateEnchantments(random, Items.BOOK.getDefaultStack(), 30,
					getEnchantmentEntryStream(reg, List.of(Enchantments.BINDING_CURSE, Enchantments.VANISHING_CURSE, Enchantments.FLAME, Enchantments.FIRE_ASPECT,
							Enchantments.SHARPNESS, Enchantments.SMITE, Enchantments.FIRE_PROTECTION)));
			ItemEnchantmentsComponent.Builder componentBuilder = new ItemEnchantmentsComponent.Builder(
					enchantedBook.getOrDefault(DataComponentTypes.ENCHANTMENTS, ItemEnchantmentsComponent.DEFAULT));
			if(random.nextFloat() < 0.01f)
				enchantments.add(new EnchantmentLevelEntry(reg.getEntry(reg.get(Enchantments.MENDING)), 1));
			for (EnchantmentLevelEntry e : enchantments)
				componentBuilder.add(e.enchantment, e.level);
			enchantedBook.set(DataComponentTypes.ENCHANTMENTS, componentBuilder.build());
			equipStack(EquipmentSlot.OFFHAND, enchantedBook);
			setEquipmentDropChance(EquipmentSlot.OFFHAND, 1f);
		}
		else
		{
			equipStack(EquipmentSlot.OFFHAND, Items.BOOK.getDefaultStack());
			setEquipmentDropChance(EquipmentSlot.OFFHAND, 0.33f);
		}
	}
	
	Stream<RegistryEntry<Enchantment>> getEnchantmentEntryStream(Registry<Enchantment> reg, List<RegistryKey<Enchantment>> keys)
	{
		Stream.Builder<RegistryEntry<Enchantment>> builder = Stream.builder();
		for (RegistryKey<Enchantment> key : keys)
		{
			builder.add(reg.getEntry(reg.get(key)));
		}
		return builder.build();
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
		if(age % 40 == 0 && random.nextFloat() < 0.33f)
		{
			if(isReading())
				swingHand(Hand.OFF_HAND);
			if(isHumming())
				addHeadParticles(ParticleTypes.NOTE, 1f, (int)(2 + random.nextFloat() * 2.5f));
		}
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
	
	void addHeadParticles(ParticleEffect type, float range, int count)
	{
		for (int i = 0; i < count; i++)
		{
			Vec3d pos = getEyePos().addRandom(random, range);
			getWorld().addParticle(type, pos.x, pos.y, pos.z, 0, 0, 0);
		}
	}
	
	public boolean isReading()
	{
		return getActivity() == ACTIVITY_READING;
	}
	
	public boolean isWorshipping()
	{
		return getActivity() == ACTIVITY_WORSHIP;
	}
	
	public boolean isHumming()
	{
		return getActivity() == ACTIVITY_HUMMING;
	}
	
	public byte getActivity()
	{
		return activity;
	}
	
	public void setActivity(byte activity)
	{
		dataTracker.set(ACTIVITY, activity);
	}
	
	public boolean isArmsVisible()
	{
		return isReading() || isAttacking() || isWorshipping();
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
	public void handleStatus(byte status)
	{
		if(status == EntityStatuses.ADD_VILLAGER_HAPPY_PARTICLES)
			addHeadParticles(ParticleTypes.HAPPY_VILLAGER, 0.8f, 8);
		else if(status == EntityStatuses.PLAY_SPAWN_EFFECTS)
		{
			for (int i = 0; i < 16; i++)
			{
				Vec3d pos = getBoundingBox().getCenter().add(Vec3d.ZERO.addRandom(random, 1f).multiply(1f, 2f, 1f));
				getWorld().addParticle(ParticleRegistry.DARKNESS, pos.x, pos.y, pos.z,
						0, 0, 0);
			}
			return;
		}
		super.handleStatus(status);
	}
	
	@Override
	public void readCustomDataFromNbt(NbtCompound nbt)
	{
		super.readCustomDataFromNbt(nbt);
		if(nbt.contains("Variante", NbtElement.BYTE_TYPE))
			dataTracker.set(VARIANT, nbt.getByte("Variante"));
		else
			dataTracker.set(VARIANT, (byte)(random.nextFloat() * 3.99));
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
		nbt.putByte("Variante", dataTracker.get(VARIANT));
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
	
	static class ActivityGoal extends Goal
	{
		final DeerFollowerEntity mob;
		final byte activity;
		final float chance;
		int duration;
		
		ActivityGoal(DeerFollowerEntity mob, byte activity, float chance)
		{
			this.mob = mob;
			this.activity = activity;
			this.chance = chance;
		}
		
		@Override
		public boolean canStart()
		{
			return mob.isHasAltar() && mob.getTarget() == null && mob.navigation.isIdle() &&
						   (mob.random.nextFloat() < chance || mob.getActivity() == activity);
		}
		
		@Override
		public void start()
		{
			duration = 300 + (int)(mob.random.nextFloat() * 700);
			mob.setActivity(activity);
		}
		
		@Override
		public boolean shouldContinue()
		{
			return canStart() && duration-- > 0;
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
			if(mob.getActivity() == activity)
				mob.setActivity(ACTIVITY_IDLE);
		}
	}
	
	static class ReadBookGoal extends ActivityGoal
	{
		public ReadBookGoal(DeerFollowerEntity mob, float chance)
		{
			super(mob, ACTIVITY_READING, chance);
			setControls(EnumSet.of(Control.MOVE, Control.LOOK));
		}
		
		@Override
		public boolean canStart()
		{
			ItemStack offHand = mob.getOffHandStack();
			return (offHand.isOf(Items.BOOK) || offHand.isOf(Items.ENCHANTED_BOOK)) && super.canStart();
		}
		
		@Override
		public void start()
		{
			super.start();
			mob.navigation.stop();
			if(mob.random.nextFloat() < 0.5)
				mob.setPose(EntityPose.SITTING);
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
			if(mob.getPose().equals(EntityPose.SITTING))
				mob.setPose(EntityPose.STANDING);
			mob.setPitch(0f);
		}
	}
	
	static class HumGoal extends ActivityGoal
	{
		public HumGoal(DeerFollowerEntity mob, float chance)
		{
			super(mob, ACTIVITY_HUMMING, chance);
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
			return mob.getTarget() == null && mob.hasAltar && (mob.random.nextFloat() < 0.001f || (!mob.isHasMask() && mob.random.nextFloat() < 0.1) ||
									(mob.getHealth() < mob.getMaxHealth() && mob.random.nextFloat() < 0.05));
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
				Vec3d dest = altar.add(mob.getPos().subtract(altar).multiply(1f, 0f, 1f).normalize().multiply(2f + mob.random.nextFloat()));
				if(!mob.navigation.startMovingTo(dest.x, dest.y, dest.z, speed + (mob.isHasMask() ? 0f : 0.15f)))
					stop();
				return;
			}
			if(!arrived)
			{
				arrived = true;
				mob.navigation.stop();
			}
			time--;
			mob.setActivity(ACTIVITY_WORSHIP);
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
			if(time <= 0)
			{
				if(!mob.isHasMask())
					mob.dataTracker.set(MASK, true);
				else
					mob.getWorld().sendEntityStatus(mob, EntityStatuses.ADD_VILLAGER_HAPPY_PARTICLES);
				mob.heal(15f);
			}
			if(mob.isWorshipping())
				mob.setActivity(ACTIVITY_IDLE);
			mob.setPitch(0f);
		}
	}
	
	static class ProtectTheAltarGoal extends Goal
	{
		final DeerFollowerEntity mob;
		final float speed;
		
		public ProtectTheAltarGoal(DeerFollowerEntity mob, float speed)
		{
			this.mob = mob;
			this.speed = speed;
			setControls(EnumSet.of(Control.MOVE, Control.LOOK));
		}
		
		@Override
		public boolean canStart()
		{
			if(!mob.hasAltar || mob.getTarget() != null)
				return false;
			return !mob.getWorld().getEntitiesByType(TypeFilter.instanceOf(PlayerEntity.class),
					Box.from(new Vec3d(mob.getAltar())).expand(4f), i -> i.isAlive() && !i.isCreative() && !i.isSpectator()).isEmpty();
		}
		
		@Override
		public void start()
		{
			super.start();
			Vec3d dest = new Vec3d(mob.getAltar());
			if(!mob.navigation.startMovingTo(dest.x, dest.y, dest.z, 3, speed))
				stop();
		}
	}
}
