package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.block.BossSpawnerBlockEntity;
import absolutelyaya.formidulus.entities.boss.BossType;
import absolutelyaya.formidulus.network.*;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;

public class PacketRegistry
{
	public static void register()
	{
		PayloadTypeRegistry.playS2C().register(SequenceTriggerPayload.ID, SequenceTriggerPayload.CODEC);
		PayloadTypeRegistry.playS2C().register(BossMusicUpdatePayload.ID, BossMusicUpdatePayload.CODEC);
		PayloadTypeRegistry.playS2C().register(OpenBossSpawnerScreenPayload.ID, OpenBossSpawnerScreenPayload.CODEC);
		PayloadTypeRegistry.playS2C().register(CastActiveAbilityPayload.ID, CastActiveAbilityPayload.CODEC);
		
		PayloadTypeRegistry.playC2S().register(ModifyBossSpawnerPayload.ID, ModifyBossSpawnerPayload.CODEC);
		
		ServerPlayNetworking.registerGlobalReceiver(ModifyBossSpawnerPayload.ID, (payload, context) -> {
			if(!(context.player().getWorld().getBlockEntity(payload.pos()) instanceof BossSpawnerBlockEntity spawner))
				return;
			spawner.setBossType(BossType.fromId(payload.bossType()));
			spawner.setRespawnDelay(payload.respawnDelay());
		});
	}
}
