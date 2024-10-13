package absolutelyaya.formidulus.entities;

import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class DeerFollowerEntity extends HostileEntity
{
	public DeerFollowerEntity(EntityType<? extends HostileEntity> entityType, World world)
	{
		super(entityType, world);
	}
	
	@Override
	protected void initGoals()
	{
		super.initGoals();
		goalSelector.add(0, new MeleeAttackGoal(this, 0.4f, false));
		goalSelector.add(4, new LookAroundGoal(this));
		goalSelector.add(4, new LookAtEntityGoal(this, DeerFollowerEntity.class, 6));
		
		targetSelector.add(0, new ActiveTargetGoal<>(this, PlayerEntity.class, true));
		targetSelector.add(0, new RevengeGoal(this, DeerGodEntity.class));
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
		if(random.nextFloat() < 0.1f + localDifficulty.getLocalDifficulty() / 10f)
		{
			equipStack(EquipmentSlot.OFFHAND, Items.BOOK.getDefaultStack());
			if(getWorld() instanceof ServerWorld serverWorld && random.nextFloat() < localDifficulty.getLocalDifficulty() / 10f)
				enchantEquipment(serverWorld, random, EquipmentSlot.OFFHAND, localDifficulty);
		}
	}
}
