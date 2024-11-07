package absolutelyaya.formidulus.entities.boss;

import absolutelyaya.formidulus.entities.BossEntity;
import absolutelyaya.formidulus.network.SequenceTriggerPayload;
import absolutelyaya.formidulus.registries.SoundRegistry;
import absolutelyaya.formidulus.sound.BossMusicEntry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.UUID;

public class DeerBossFight extends BossFight
{
	public DeerBossFight(BossEntity entity, UUID id)
	{
		super(entity, id);
	}
	
	@Override
	public void leaveFight(ServerPlayerEntity player)
	{
		if(!playerWin)
			ServerPlayNetworking.send(player, new SequenceTriggerPayload(SequenceTriggerPayload.PLAYER_DEATH_SEQUENCE));
		super.leaveFight(player);
	}
	
	static {
		bossMusic.put("phase1", new BossMusicEntry(SoundRegistry.MUSIC_DEER_PHASE1, 0f, 2f)
										.withIntro(SoundRegistry.MUSIC_DEER_INTRO, 67011, true));
		bossMusic.put("phase2", new BossMusicEntry(SoundRegistry.MUSIC_DEER_PHASE2, 0f, 3f)
										.withIntro(SoundRegistry.MUSIC_DEER_PHASE2_INTRO, 14470 + 1500));
	}
}
