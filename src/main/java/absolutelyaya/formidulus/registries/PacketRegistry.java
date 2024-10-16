package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.network.BossMusicUpdatePayload;
import absolutelyaya.formidulus.network.SequenceTriggerPayload;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;

public class PacketRegistry
{
	public static void register()
	{
		PayloadTypeRegistry.playS2C().register(SequenceTriggerPayload.ID, SequenceTriggerPayload.CODEC);
		PayloadTypeRegistry.playS2C().register(BossMusicUpdatePayload.ID, BossMusicUpdatePayload.CODEC);
	}
}
