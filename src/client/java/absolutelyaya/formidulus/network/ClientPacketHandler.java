package absolutelyaya.formidulus.network;

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
												.jitter(true).font(FormidulusClient.FONT).typeSpeed(25f).instability(0.7f).color(0x000000));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Peccatum tuum non videris intellegre.") //You do not seem to understand your sin.
												.jitter(true).font(FormidulusClient.FONT).typeSpeed(30f).displayDuration(7.5f).instability(0.5f));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Nulla res.") //No matter.
												.jitter(true).font(FormidulusClient.FONT).typeSpeed(50f).displayDuration(1f));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Mores vos docebo.") //I will teach you manners
												.jitter(true).font(FormidulusClient.FONT).typeSpeed(30f).displayDuration(5f).instability(0.5f));
					break;
				}
				case SequenceTriggerPayload.PHASE_TRANSITION_SEQUENCE:
				{
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Tus inprob modicas...").color(0) //You little brat...
												.jitter(true).font(FormidulusClient.FONT).typeSpeed(40f).instability(0.3f).displayDuration(3f));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Terra, tus sanguinem mihi!") //Earth, shed Blood for me!
												.jitter(true).font(FormidulusClient.FONT).typeSpeed(80f).displayDuration(5f));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Videamus quomodo contra hoc vales.") //Let's see how you fare against this.
												.jitter(true).font(FormidulusClient.FONT).typeSpeed(50f).delay(1f).displayDuration(5f));
					break;
				}
				case SequenceTriggerPayload.PLAYER_DEATH_SEQUENCE:
				{
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Numquam redibis.").color(0) //You will never return.
												.jitter(true).font(FormidulusClient.FONT).delay(5f).displayDuration(5f));
					break;
				}
				case SequenceTriggerPayload.DEATH_SEQUENCE:
				{
					TitleHUD.queueTitle(TitleHUD.makeTextObject("SATIS!").color(0) //ENOUGH!
												.jitter(true).font(FormidulusClient.FONT).delay(5f).typeSpeed(40f).displayDuration(4f));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Vas hoc nimis fragilis est...") //This vessel is too fragile.
												.jitter(true).font(FormidulusClient.FONT).typeSpeed(30f).displayDuration(5f));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Vultus bonus, sed non aptus ad bellum.") //Good looking, but not fit for war.
												.jitter(true).font(FormidulusClient.FONT).typeSpeed(30f).displayDuration(7f));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("semel vas quod satis est invenio,") //once I find a vessel that is sufficient,
												.jitter(true).font(FormidulusClient.FONT).typeSpeed(30f).displayDuration(6f));
					TitleHUD.queueTitle(TitleHUD.makeTextObject("Ego te delebus.") //I will destroy you.
												.jitter(true).font(FormidulusClient.FONT).typeSpeed(10f).displayDuration(6f));
					break;
				}
			}
		});
	}
}
