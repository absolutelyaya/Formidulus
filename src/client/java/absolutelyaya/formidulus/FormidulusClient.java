package absolutelyaya.formidulus;

import absolutelyaya.formidulus.gui.TitleHUD;
import absolutelyaya.formidulus.particle.BloodDropParticle;
import absolutelyaya.formidulus.registries.EntityRegistry;
import absolutelyaya.formidulus.registries.ParticleRegistry;
import absolutelyaya.formidulus.rendering.entity.DeerGodModel;
import absolutelyaya.formidulus.rendering.entity.DeerGodRenderer;
import absolutelyaya.formidulus.rendering.entity.IrrlichtModel;
import absolutelyaya.formidulus.rendering.entity.IrrlichtRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class FormidulusClient implements ClientModInitializer
{
	public static final EntityModelLayer DEER_GOD_LAYER = new EntityModelLayer(Formidulus.identifier("deer_god"), "deer_god");
	public static final EntityModelLayer IRRLICHT_LAYER = new EntityModelLayer(Formidulus.identifier("irrlicht"), "irrlicht");
	final Identifier font = Identifier.of("illageralt");
	
	@Override
	public void onInitializeClient()
	{
		//Entities
		EntityRendererRegistry.register(EntityRegistry.DEER_GOD, DeerGodRenderer::new);
		EntityRendererRegistry.register(EntityRegistry.IRRLICHT, IrrlichtRenderer::new);
		
		//Entity Model Layers
		EntityModelLayerRegistry.registerModelLayer(DEER_GOD_LAYER, DeerGodModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(IRRLICHT_LAYER, IrrlichtModel::getTexturedModelData);
		
		//Particles
		ParticleFactoryRegistry particles = ParticleFactoryRegistry.getInstance();
		particles.register(ParticleRegistry.BLOOD_DROP_PARTICLE, BloodDropParticle.Factory::new);
		
		ClientSendMessageEvents.CHAT.register(message -> {
			//Spawn Sequence
			TitleHUD.queueTitle(TitleHUD.makeTextObject("Es ausus altare meum delictem ?") //Have you dared to desecrate my altar ?
										.jitter(true).font(font).typeSpeed(10f).instability(0.7f).color(0x000000));
			TitleHUD.queueTitle(TitleHUD.makeTextObject("Peccatum tuum non videris intellegre.") //You do not seem to understand your sin.
										.jitter(true).font(font).typeSpeed(30f).displayDuration(7.5f).instability(0.5f));
			TitleHUD.queueTitle(TitleHUD.makeTextObject("Nulla res.") //No matter.
										.jitter(true).font(font).typeSpeed(30f).displayDuration(2f));
			TitleHUD.queueTitle(TitleHUD.makeTextObject("Mores vos docebo.") //I will teach you manners
										.jitter(true).font(font).typeSpeed(20f).displayDuration(5f).instability(0.5f));
			//Player Death
			TitleHUD.queueTitle(TitleHUD.makeTextObject("Numquam redibis.") //You will never return.
										.jitter(true).font(font).delay(5f).displayDuration(5f));
			//Phase 2 Sequence
			TitleHUD.queueTitle(TitleHUD.makeTextObject("Tus inprob modicas...") //You little brat...
										.jitter(true).font(font).typeSpeed(25f).delay(5f).instability(0.8f).displayDuration(5f));
			TitleHUD.queueTitle(TitleHUD.makeTextObject("Terra, tus sanguinem mihi!") //Earth, shed Blood for me!
										.jitter(true).font(font).typeSpeed(50f).delay(1f).displayDuration(5f));
			TitleHUD.queueTitle(TitleHUD.makeTextObject("Videamus quomodo contra hoc vales.") //Let's see how you fare against this.
										.jitter(true).font(font).typeSpeed(30f).delay(8f).displayDuration(5f));
			//Death Sequence
			TitleHUD.queueTitle(TitleHUD.makeTextObject("SATIS!") //ENOUGH!
										.jitter(true).font(font).delay(5f).typeSpeed(40f).displayDuration(4f));
			TitleHUD.queueTitle(TitleHUD.makeTextObject("Vas hoc nimis fragilis est...") //This vessel is too fragile.
										.jitter(true).font(font).typeSpeed(30f).displayDuration(5f));
			TitleHUD.queueTitle(TitleHUD.makeTextObject("Vultus bonus, sed non aptus ad bellum.") //Good looking, but not fit for war.
										.jitter(true).font(font).typeSpeed(30f).displayDuration(7f));
			TitleHUD.queueTitle(TitleHUD.makeTextObject("semel vas quod satis est invenio,") //once I find a vessel that is sufficient,
										.jitter(true).font(font).typeSpeed(30f).displayDuration(6f));
			TitleHUD.queueTitle(TitleHUD.makeTextObject("Ego te delebus.") //I will destroy you.
										.jitter(true).font(font).typeSpeed(10f).displayDuration(6f));
			TitleHUD.queueTitle(TitleHUD.makeTextObject("Test Sequence finished.")
										.typeSpeed(30f).displayDuration(5f).color(0xffffff));
		});
		
		HudRenderCallback.EVENT.register((context, tickCounter) -> TitleHUD.render(context, tickCounter.getLastFrameDuration()));
	}
}
