package absolutelyaya.formidulus.network;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;

public record BossMusicUpdatePayload(Identifier bossId, String trackKey, boolean late) implements CustomPayload
{
	public static final CustomPayload.Id<BossMusicUpdatePayload> ID = new CustomPayload.Id<>(Formidulus.identifier("boss_music_update"));
	public static final PacketCodec<RegistryByteBuf, BossMusicUpdatePayload> CODEC =
			PacketCodec.tuple(Identifier.PACKET_CODEC, BossMusicUpdatePayload::bossId, PacketCodecs.STRING, BossMusicUpdatePayload::trackKey,
					PacketCodecs.BOOL, BossMusicUpdatePayload::late, BossMusicUpdatePayload::new);
	
	public BossMusicUpdatePayload(Identifier bossId, String trackKey)
	{
		this(bossId, trackKey, false);
	}
	
	@Override
	public Id<? extends CustomPayload> getId()
	{
		return ID;
	}
}
