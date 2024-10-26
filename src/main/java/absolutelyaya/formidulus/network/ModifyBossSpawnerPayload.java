package absolutelyaya.formidulus.network;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public record ModifyBossSpawnerPayload(BlockPos pos, Identifier bossType, int respawnDelay) implements CustomPayload
{
	public static final CustomPayload.Id<ModifyBossSpawnerPayload> ID = new CustomPayload.Id<>(Formidulus.identifier("modify_boss_spawner"));
	public static final PacketCodec<RegistryByteBuf, ModifyBossSpawnerPayload> CODEC =
			PacketCodec.tuple(BlockPos.PACKET_CODEC, ModifyBossSpawnerPayload::pos,
					Identifier.PACKET_CODEC, ModifyBossSpawnerPayload::bossType,
					PacketCodecs.INTEGER, ModifyBossSpawnerPayload::respawnDelay, ModifyBossSpawnerPayload::new);
	
	@Override
	public Id<? extends CustomPayload> getId()
	{
		return ID;
	}
}
