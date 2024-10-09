package absolutelyaya.formidulus.network;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.network.packet.CustomPayload;

public record SequenceTriggerPayload(byte sequenceID) implements CustomPayload
{
	public static final Id<SequenceTriggerPayload> ID = new Id<>(Formidulus.identifier("sequence_trigger_packet"));
	public static final PacketCodec<RegistryByteBuf, SequenceTriggerPayload> CODEC = PacketCodec.tuple(PacketCodecs.BYTE, SequenceTriggerPayload::sequenceID, SequenceTriggerPayload::new);
	public static final byte SPAWN_SEQUENCE = 0;
	public static final byte PROJECTILE_SEQUENCE = 1;
	public static final byte PHASE_TRANSITION_SEQUENCE = 2;
	public static final byte PLAYER_DEATH_SEQUENCE = 3;
	public static final byte DEATH_SEQUENCE = 5;
	
	@Override
	public Id<? extends CustomPayload> getId()
	{
		return ID;
	}
}
