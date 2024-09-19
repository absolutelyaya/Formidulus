package absolutelyaya.formidulus;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.util.Identifier;

public class FormidulusClient implements ClientModInitializer
{
	final Identifier font = Identifier.of("illageralt");
	
	@Override
	public void onInitializeClient()
	{
		ClientSendMessageEvents.CHAT.register(message -> {
			TitleHUD.queueTitle(TitleHUD.makeTextObject("Ausus es altare meum delictum ?")
										.jitter(true).font(font).typeSpeed(10f).instability(0.7f).color(0x000000));
			TitleHUD.queueTitle(TitleHUD.makeTextObject("tam miserabilis pugnatori excusatio")
										.jitter(true).font(font).typeSpeed(30f).displayDuration(7.5f).instability(0.5f));
			TitleHUD.queueTitle(TitleHUD.makeTextObject("numquam redibis.")
										.jitter(true).font(font).delay(5f).displayDuration(5f));
			TitleHUD.queueTitle(TitleHUD.makeTextObject("SATIS!")
										.jitter(true).font(font).delay(5f).typeSpeed(40f).displayDuration(4f));
			TitleHUD.queueTitle(TitleHUD.makeTextObject("Vas hoc nimis fragile est...")
										.jitter(true).font(font).typeSpeed(30f).displayDuration(5f));
			TitleHUD.queueTitle(TitleHUD.makeTextObject("Vultus bonus, sed non aptus ad bellum.")
										.jitter(true).font(font).typeSpeed(30f).displayDuration(7f));
			TitleHUD.queueTitle(TitleHUD.makeTextObject("semel vas quod satis est invenio,")
										.jitter(true).font(font).typeSpeed(30f).displayDuration(6f));
			TitleHUD.queueTitle(TitleHUD.makeTextObject("Ego te delebus.")
										.jitter(true).font(font).typeSpeed(10f).displayDuration(6f));
			TitleHUD.queueTitle(TitleHUD.makeTextObject("Test Sequence finished.")
										.typeSpeed(30f).displayDuration(5f).color(0xffffff));
		});
		
		HudRenderCallback.EVENT.register((context, tickCounter) -> {
			TitleHUD.render(context, tickCounter.getLastFrameDuration());
		});
	}
}
