package absolutelyaya.formidulus.network;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.math.BlockPos;

public record OpenBossSpawnerScreenPayload(BlockPos pos) implements CustomPayload
{
	public static final CustomPayload.Id<OpenBossSpawnerScreenPayload> ID = new CustomPayload.Id<>(Formidulus.identifier("boss_spawner_screen"));
	public static final PacketCodec<RegistryByteBuf, OpenBossSpawnerScreenPayload> CODEC =
			PacketCodec.tuple(BlockPos.PACKET_CODEC, OpenBossSpawnerScreenPayload::pos, OpenBossSpawnerScreenPayload::new);
	
	@Override
	public Id<? extends CustomPayload> getId()
	{
		return ID;
	}
}
