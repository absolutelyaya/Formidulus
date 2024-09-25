package absolutelyaya.formidulus;

import absolutelyaya.formidulus.gui.TitleHUD;
import absolutelyaya.formidulus.network.ClientPacketHandler;
import absolutelyaya.formidulus.particle.BloodDropParticle;
import absolutelyaya.formidulus.registries.EntityRegistry;
import absolutelyaya.formidulus.registries.ParticleRegistry;
import absolutelyaya.formidulus.rendering.entity.DeerGodModel;
import absolutelyaya.formidulus.rendering.entity.DeerGodRenderer;
import absolutelyaya.formidulus.rendering.entity.IrrlichtModel;
import absolutelyaya.formidulus.rendering.entity.IrrlichtRenderer;
import net.fabricmc.api.ClientModInitializer;
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
	public static final Identifier FONT = Identifier.of("illageralt");
	
	@Override
	public void onInitializeClient()
	{
		ClientPacketHandler.register();
		
		//Entities
		EntityRendererRegistry.register(EntityRegistry.DEER_GOD, DeerGodRenderer::new);
		EntityRendererRegistry.register(EntityRegistry.IRRLICHT, IrrlichtRenderer::new);
		
		//Entity Model Layers
		EntityModelLayerRegistry.registerModelLayer(DEER_GOD_LAYER, DeerGodModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(IRRLICHT_LAYER, IrrlichtModel::getTexturedModelData);
		
		//Particles
		ParticleFactoryRegistry particles = ParticleFactoryRegistry.getInstance();
		particles.register(ParticleRegistry.BLOOD_DROP_PARTICLE, BloodDropParticle.Factory::new);
		
		HudRenderCallback.EVENT.register((context, tickCounter) -> TitleHUD.render(context, tickCounter.getLastFrameDuration()));
	}
}
