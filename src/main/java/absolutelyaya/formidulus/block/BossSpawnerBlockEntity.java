package absolutelyaya.formidulus.block;

import absolutelyaya.formidulus.entities.boss.BossFightManager;
import absolutelyaya.formidulus.entities.boss.BossType;
import absolutelyaya.formidulus.registries.BlockEntityRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public class BossSpawnerBlockEntity extends BlockEntity
{
	static final int validityCheckInterval = 100;
	
	BossType bossType;
	UUID bossFightId;
	int respawnDelay, validityCheckTimer;
	long lastSpawnFightEnded;
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
	
	public static <T extends BlockEntity> void tick(World world, BlockPos pos, BlockState state, T t)
	{
		if(!(t instanceof BossSpawnerBlockEntity spawner && spawner.validityCheckTimer-- <= 0))
			return;
		boolean active = BossFightManager.INSTANCE.isActive(spawner.bossFightId);
		if(!spawner.wasBossfightActive && active)
			spawner.onFightEnded();
		spawner.validityCheckTimer = validityCheckInterval;
	}
	
	boolean isBossFightActive(UUID id)
	{
		return BossFightManager.INSTANCE.isActive(id);
	}
	
	public UUID getFightId()
	{
		return bossFightId;
	}
	
	public BossType getBossType()
	{
		return bossType;
	}
	
	public void onFightEnded()
	{
		if(world != null)
			lastSpawnFightEnded = world.getTime();
	}
	
	@Override
	protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup)
	{
		super.writeNbt(nbt, registryLookup);
		nbt.putInt("RespawnDelay", respawnDelay);
		nbt.putLong("LastSpawn", lastSpawnFightEnded);
		if(bossType != null)
			nbt.putString("BossType", bossType.id().toString());
		if(isBossFightActive(bossFightId))
			nbt.putUuid("BossFightId", bossFightId);
	}
	
	@Override
	protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup)
	{
		super.readNbt(nbt, registryLookup);
		if(nbt.contains("RespawnDelay", NbtElement.INT_TYPE))
			respawnDelay = nbt.getInt("RespawnDelay");
		if(nbt.contains("LastSpawn", NbtElement.LONG_TYPE))
			lastSpawnFightEnded = nbt.getLong("LastSpawn");
		if(nbt.contains("BossType", NbtElement.STRING_TYPE))
			bossType = BossType.fromId(Identifier.tryParse(nbt.getString("BossType")));
		if(nbt.containsUuid("BossFightId"))
			bossFightId = nbt.getUuid("BossFightId");
	}
}
