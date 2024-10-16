package absolutelyaya.formidulus.network;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.FormidulusClient;
import absolutelyaya.formidulus.gui.TitleHUD;
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
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Es ausus altare meum delictem ?").color(0) //Have you dared to desecrate my altar ?
												.jitter(true).font(Formidulus.FONT).typeSpeed(25f).displayDuration(5f).instability(0.7f).color(0x000000).clearPreceding(true));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Non habes ullam veneratia ?") //Have you no respect ?
												.jitter(true).font(Formidulus.FONT).typeSpeed(30f).displayDuration(5f).instability(0.5f));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Nulla res.") //No matter.
												.jitter(true).font(Formidulus.FONT).typeSpeed(50f).displayDuration(1f));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Faciam te audire.") //I will make you listen.
												.jitter(true).font(Formidulus.FONT).typeSpeed(30f).displayDuration(5f).instability(0.5f));
					break;
				}
				case SequenceTriggerPayload.PROJECTILE_SEQUENCE:
				{
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Mavis pugnares procul ?").color(0) //Would you rather fight at a distance ?
												.jitter(true).font(Formidulus.FONT).typeSpeed(40f).instability(0.3f).displayDuration(3f).clearPreceding(true));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Deinde pluat ignem!").color(0) //Then let it rain fire!
												.jitter(true).font(Formidulus.FONT).typeSpeed(40f).instability(0.3f).displayDuration(3f));
					break;
				}
				case SequenceTriggerPayload.PHASE_TRANSITION_SEQUENCE:
				{
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Tus inprob modicas...").color(0) //You little brat...
												.jitter(true).font(Formidulus.FONT).typeSpeed(40f).instability(0.3f).displayDuration(6f).clearPreceding(true));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Terra, tus cruorem mihi!") //Earth, shed Blood for me!
												.jitter(true).font(Formidulus.FONT).typeSpeed(80f).displayDuration(6f));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Videamus quomodo contra hoc vales.") //Let's see how you fare against this.
												.jitter(true).font(Formidulus.FONT).typeSpeed(50f).delay(1f).displayDuration(5f));
					break;
				}
				case SequenceTriggerPayload.PLAYER_DEATH_SEQUENCE:
				{
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Numquam redibis.").color(0) //You will never return.
												.jitter(true).font(Formidulus.FONT).delay(5f).displayDuration(5f).clearPreceding(true));
					break;
				}
				case SequenceTriggerPayload.DEATH_SEQUENCE:
				{
					TitleHUD.queueTitle(TitleHUD.makeTextObject("SATIS!").color(0) //ENOUGH!
												.jitter(true).font(Formidulus.FONT).delay(1f).typeSpeed(40f).displayDuration(4f).clearPreceding(true));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Vas hoc nimis fragilis est...") //This vessel is too fragile.
												.jitter(true).font(Formidulus.FONT).typeSpeed(30f).displayDuration(5f));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Vultus bonus, sed non aptus ad bellum.") //Good looking, but not fit for war.
												.jitter(true).font(Formidulus.FONT).typeSpeed(30f).displayDuration(7f));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("semel vas quod satis est invenio,") //once I find a vessel that is sufficient,
												.jitter(true).font(Formidulus.FONT).typeSpeed(30f).displayDuration(6f));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Ego te delebus.") //I will destroy you.
												.jitter(true).font(Formidulus.FONT).typeSpeed(10f).displayDuration(6f));
					break;
				}
				case 69:
				{
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Nullae amicas ?").color(0) //No maidens ?
												.jitter(true).font(Formidulus.FONT).delay(1f).typeSpeed(40f).displayDuration(4f).clearPreceding(true));
				}
			}
		});
		ClientPlayNetworking.registerGlobalReceiver(BossMusicUpdatePayload.ID, ((payload, context) -> {
			String key = payload.trackKey();
			if(key.equals("stop") || key.equals("null"))
				FormidulusClient.bossMusicHandler.stopCurrentTrack();
			else
				FormidulusClient.bossMusicHandler.startTrack(payload.bossId(), key);
		}));
	}
}
