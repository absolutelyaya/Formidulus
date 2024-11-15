package absolutelyaya.formidulus.network;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.FormidulusClient;
import absolutelyaya.formidulus.block.BossSpawnerBlockEntity;
import absolutelyaya.formidulus.gui.TitleHUD;
import absolutelyaya.formidulus.gui.screen.BossSpawnerScreen;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

public class ClientPacketHandler
{
	public static void register()
	{
		ClientPlayNetworking.registerGlobalReceiver(SequenceTriggerPayload.ID, (payload, context) -> {
			switch(payload.sequenceID())
			{
				case SequenceTriggerPayload.SPAWN_SEQUENCE:
				{
					TitleHUD.queueTitle(TitleHUD.makeTextObject("dialogue.deer.intro1").color(0)
												.jitter(true).font(Formidulus.FONT).typeSpeed(20f).displayDuration(5f).instability(0.7f).color(0x000000).clearPreceding(true));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("dialogue.deer.intro2")
												.jitter(true).font(Formidulus.FONT).typeSpeed(50f).displayDuration(4f).instability(0.5f));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("dialogue.deer.intro3")
												.jitter(true).font(Formidulus.FONT).typeSpeed(50f).displayDuration(4f));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("dialogue.deer.intro4")
												.jitter(true).font(Formidulus.FONT).typeSpeed(50f).displayDuration(4f).instability(0.5f));
					break;
				}
				case SequenceTriggerPayload.PROJECTILE_SEQUENCE:
				{
					TitleHUD.queueTitle(TitleHUD.makeTextObject("dialogue.deer.projectile1").color(0)
												.jitter(true).font(Formidulus.FONT).typeSpeed(40f).instability(0.3f).displayDuration(3f).clearPreceding(true));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("dialogue.deer.projectile2")
												.jitter(true).font(Formidulus.FONT).typeSpeed(40f).instability(0.3f).displayDuration(3f));
					break;
				}
				case SequenceTriggerPayload.PHASE_TRANSITION_SEQUENCE:
				{
					TitleHUD.queueTitle(TitleHUD.makeTextObject("dialogue.deer.phase-transition1").color(0)
												.jitter(true).font(Formidulus.FONT).typeSpeed(40f).instability(0.3f).displayDuration(6f).clearPreceding(true));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("dialogue.deer.phase-transition2")
												.jitter(true).font(Formidulus.FONT).typeSpeed(80f).displayDuration(6f));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("dialogue.deer.phase-transition3")
												.jitter(true).font(Formidulus.FONT).typeSpeed(80f).delay(1f).displayDuration(3f));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("dialogue.deer.phase-transition4")
												.jitter(true).font(Formidulus.FONT).typeSpeed(80f).delay(1f).displayDuration(3f));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("dialogue.deer.phase-transition5")
												.jitter(true).font(Formidulus.FONT).typeSpeed(50f).delay(2f).displayDuration(5f));
					break;
				}
				case SequenceTriggerPayload.PLAYER_DEATH_SEQUENCE:
				{
					TitleHUD.queueTitle(TitleHUD.makeTextObject("dialogue.deer.player-death1").color(0) //You will never return.
												.jitter(true).font(Formidulus.FONT).delay(5f).displayDuration(5f).clearPreceding(true));
					break;
				}
				case SequenceTriggerPayload.DEATH_SEQUENCE:
				{
					TitleHUD.queueTitle(TitleHUD.makeTextObject("dialogue.deer.death1").color(0) //ENOUGH!
												.jitter(true).font(Formidulus.FONT).delay(1f).typeSpeed(40f).displayDuration(4f).clearPreceding(true));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("dialogue.deer.death2") //This vessel is too fragile.
												.jitter(true).font(Formidulus.FONT).typeSpeed(30f).displayDuration(5f));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("dialogue.deer.death3") //Good looking, but not fit for war.
												.jitter(true).font(Formidulus.FONT).typeSpeed(30f).displayDuration(7f));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("dialogue.deer.death4") //once I find a vessel that is sufficient,
												.jitter(true).font(Formidulus.FONT).typeSpeed(30f).displayDuration(6f));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("dialogue.deer.death5") //I will destroy you.
												.jitter(true).font(Formidulus.FONT).typeSpeed(10f).displayDuration(6f));
					break;
				}
				case 69:
				{
					TitleHUD.queueTitle(TitleHUD.makeTextObject("dialogue.deer.what").color(0) //No maidens ?
												.jitter(true).font(Formidulus.FONT).delay(1f).typeSpeed(40f).displayDuration(4f).clearPreceding(true));
				}
			}
		});
		ClientPlayNetworking.registerGlobalReceiver(BossMusicUpdatePayload.ID, (payload, context) -> {
			String key = payload.trackKey();
			switch (key)
			{
				case "cancel" -> FormidulusClient.bossMusicHandler.stopCurrentTrackNoOutro();
				case "cancelAll" -> FormidulusClient.bossMusicHandler.cancelAll();
				case "stopImmediately" -> FormidulusClient.bossMusicHandler.stopCurrentTrackNoFade();
				case "end" -> FormidulusClient.bossMusicHandler.stopCurrentTrack();
				default -> FormidulusClient.bossMusicHandler.startTrack(payload.bossId(), key, payload.late());
			}
		});
		ClientPlayNetworking.registerGlobalReceiver(OpenBossSpawnerScreenPayload.ID, (payload, context) -> {
			if(!(context.player().getWorld().getBlockEntity(payload.pos()) instanceof BossSpawnerBlockEntity spawner))
				return;
			context.client().setScreen(new BossSpawnerScreen(spawner));
		});
	}
}
