package absolutelyaya.formidulus.block;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.entities.BossEntity;
import absolutelyaya.formidulus.entities.boss.BossFightManager;
import absolutelyaya.formidulus.entities.boss.BossType;
import absolutelyaya.formidulus.registries.BlockEntityRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtList;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BossSpawnerBlockEntity extends BlockEntity
{
	final List<UUID> bossEntities = new ArrayList<>();
	BossType bossType = BossType.DEER;
	UUID bossFightId;
	int respawnDelay = 12000, fightCheckTimer;
	long lastFightEnded;
	boolean wasBossfightActive;
	
	public BossSpawnerBlockEntity(BlockPos pos, BlockState state)
	{
		super(BlockEntityRegistry.BOSS_SPAWNER, pos, state);
	}
	
	@Override
	public NbtCompound toInitialChunkDataNbt(RegistryWrapper.WrapperLookup registryLookup)
	{
		return createNbt(registryLookup);
	}
	
	@Nullable
	@Override
	public Packet<ClientPlayPacketListener> toUpdatePacket()
	{
		return BlockEntityUpdateS2CPacket.create(this);
	}
	
	public static <T extends BlockEntity> void tick(T t)
	{
		if(!(t instanceof BossSpawnerBlockEntity spawner))
			return;
		spawner.tick();
	}
	
	void tick()
	{
		if(fightCheckTimer-- > 0)
			return;
		boolean active = BossFightManager.INSTANCE.isActive(bossFightId);
		if(!wasBossfightActive && active)
			onFightEnded();
		if(world instanceof ServerWorld serverWorld && !wasBossfightActive)
		{
			if(bossEntities.isEmpty() && (serverWorld.getTime() > lastFightEnded + respawnDelay || lastFightEnded == 0))
				spawnBoss();
			bossEntities.removeIf(i -> {
				Entity entity = serverWorld.getEntity(i);
				return entity == null || !entity.isAlive() || entity.isRemoved();
			});
		}
		fightCheckTimer = Formidulus.config.fightCheckInterval.getValue();
		wasBossfightActive = active;
	}
	
	void spawnBoss()
	{
		if(bossType == null)
			bossType = BossType.DEER;
		if(world instanceof ServerWorld serverWorld)
		{
			BossEntity entity = bossType.bossEntities().getFirst().spawn(serverWorld, e -> {
				e.setYaw(0f);
				e.setHeadYaw(0f);
				e.setBodyYaw(0f);
				e.refreshPositionAndAngles(e.getPos(), 0f, 0f);
				if(e instanceof BossEntity boss)
				{
					boss.setOriginBlock(pos);
					boss.afterBossReset();
				}
			}, pos, SpawnReason.SPAWNER, false ,false);
			if(entity != null)
				bossEntities.add(entity.getUuid());
		}
	}
	
	boolean isBossFightActive(UUID id)
	{
		return BossFightManager.INSTANCE.isActive(id);
	}
	
	public UUID getFightId()
	{
		return bossFightId;
	}
	
	public void setBossFightId(UUID bossFightId)
	{
		this.bossFightId = bossFightId;
		markDirty();
		if(world != null)
			world.updateListeners(pos, getCachedState(), getCachedState(), Block.NOTIFY_LISTENERS);
	}
	
	public BossType getBossType()
	{
		return bossType;
	}
	
	public void setBossType(BossType bossType)
	{
		this.bossType = bossType;
		markDirty();
		if(world != null)
			world.updateListeners(pos, getCachedState(), getCachedState(), Block.NOTIFY_LISTENERS);
	}
	
	public int getRespawnDelay()
	{
		return respawnDelay;
	}
	
	public void setRespawnDelay(int respawnDelay)
	{
		this.respawnDelay = respawnDelay;
		markDirty();
		if(world != null)
			world.updateListeners(pos, getCachedState(), getCachedState(), Block.NOTIFY_LISTENERS);
	}
	
	public void onFightEnded()
	{
		if(world != null)
		{
			lastFightEnded = world.getTime();
			markDirty();
			world.updateListeners(pos, getCachedState(), getCachedState(), Block.NOTIFY_LISTENERS);
		}
	}
	
	public void onBlockBroken()
	{
		if(!(world instanceof ServerWorld serverWorld))
			return;
		for (UUID id : bossEntities)
		{
			if(serverWorld.getEntity(id) instanceof BossEntity boss)
				boss.discard();
		}
	}
	
	@Override
	protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup)
	{
		super.writeNbt(nbt, registryLookup);
		nbt.putInt("RespawnDelay", respawnDelay);
		nbt.putLong("LastFightEnded", lastFightEnded);
		if(bossType != null)
			nbt.putString("BossType", bossType.id().toString());
		if(isBossFightActive(bossFightId))
			nbt.putUuid("BossFightId", bossFightId);
		if(!bossEntities.isEmpty())
		{
			NbtList list = new NbtList();
			for (UUID id : bossEntities)
			{
				NbtCompound compound = new NbtCompound();
				compound.putUuid("ID", id);
				list.add(compound);
			}
			nbt.put("LivingBossEntities", list);
		}
	}
	
	@Override
	protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup)
	{
		super.readNbt(nbt, registryLookup);
		if(nbt.contains("RespawnDelay", NbtElement.INT_TYPE))
			respawnDelay = nbt.getInt("RespawnDelay");
		if(nbt.contains("LastFightEnded", NbtElement.LONG_TYPE))
			lastFightEnded = nbt.getLong("LastFightEnded");
		if(nbt.contains("BossType", NbtElement.STRING_TYPE))
			bossType = BossType.fromId(Identifier.tryParse(nbt.getString("BossType")));
		if(nbt.containsUuid("BossFightId"))
			bossFightId = nbt.getUuid("BossFightId");
		if(nbt.contains("LivingBossEntities", NbtElement.LIST_TYPE))
		{
			NbtList list = nbt.getList("LivingBossEntities", NbtElement.COMPOUND_TYPE);
			list.forEach(i -> {
				if(i instanceof NbtCompound compound && compound.containsUuid("ID"))
					bossEntities.add(compound.getUuid("ID"));
			});
		}
	}
}
