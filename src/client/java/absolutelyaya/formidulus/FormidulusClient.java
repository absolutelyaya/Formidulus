package absolutelyaya.formidulus;

import absolutelyaya.formidulus.gui.TitleHUD;
import absolutelyaya.formidulus.item.components.AccessoryComponent;
import absolutelyaya.formidulus.network.ClientPacketHandler;
import absolutelyaya.formidulus.particle.BloodDropParticle;
import absolutelyaya.formidulus.particle.DarknessParticle;
import absolutelyaya.formidulus.particle.GatheringDarknessParticle;
import absolutelyaya.formidulus.particle.RisingDarknessParticle;
import absolutelyaya.formidulus.registries.*;
import absolutelyaya.formidulus.rendering.block.BossSpawnerRenderer;
import absolutelyaya.formidulus.rendering.block.DeerSkullBlockEntityRenderer;
import absolutelyaya.formidulus.rendering.entity.*;
import absolutelyaya.formidulus.sound.BossMusicHandler;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.*;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class FormidulusClient implements ClientModInitializer
{
	public static final EntityModelLayer DEER_GOD_LAYER = new EntityModelLayer(Formidulus.identifier("deer_god"), "deer_god");
	public static final EntityModelLayer DEER_GOD_SKULL_LAYER = new EntityModelLayer(Formidulus.identifier("deer_god_skull"), "deer_god_skull");
	public static final EntityModelLayer IRRLICHT_LAYER = new EntityModelLayer(Formidulus.identifier("irrlicht"), "irrlicht");
	public static final EntityModelLayer DEER_FOLLOWER_LAYER = new EntityModelLayer(Formidulus.identifier("deer_follower"), "deer_follower");
	public static BossMusicHandler bossMusicHandler;
	
	@Override
	public void onInitializeClient()
	{
		ClientPacketHandler.register();
		
		//Entities
		EntityRendererRegistry.register(EntityRegistry.DEER_GOD, DeerGodRenderer::new);
		EntityRendererRegistry.register(EntityRegistry.IRRLICHT, IrrlichtRenderer::new);
		EntityRendererRegistry.register(EntityRegistry.PUMPKIN, PumpkinRenderer::new);
		EntityRendererRegistry.register(EntityRegistry.DEER_FOLLOWER, DeerFollowerRenderer::new);
		
		//Entity Model Layers
		EntityModelLayerRegistry.registerModelLayer(DEER_GOD_LAYER, DeerGodModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(DEER_GOD_SKULL_LAYER, DeerGodSkullModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(IRRLICHT_LAYER, IrrlichtModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(DEER_FOLLOWER_LAYER, DeerFollowerModel::getTexturedModelData);
		
		//Particles
		ParticleFactoryRegistry particles = ParticleFactoryRegistry.getInstance();
		particles.register(ParticleRegistry.BLOOD_DROP_PARTICLE, BloodDropParticle.Factory::new);
		particles.register(ParticleRegistry.DARKNESS, DarknessParticle.Factory::new);
		particles.register(ParticleRegistry.RISING_DARKNESS, RisingDarknessParticle.Factory::new);
		particles.register(ParticleRegistry.GATHERING_DARKNESS, GatheringDarknessParticle.Factory::new);
		
		//Block Entities
		BlockEntityRendererFactories.register(BlockEntityRegistry.DEER_SKULL, DeerSkullBlockEntityRenderer::new);
		BlockEntityRendererFactories.register(BlockEntityRegistry.BOSS_SPAWNER, BossSpawnerRenderer::new);
		
		HudRenderCallback.EVENT.register((context, tickCounter) -> TitleHUD.render(context, tickCounter.getLastFrameDuration()));
		
		BuiltinItemRendererRegistry builtinItemRendererRegistry = BuiltinItemRendererRegistry.INSTANCE;
		builtinItemRendererRegistry.register(ItemRegistry.DEER_SKULL, new DeerGodSkullRenderer());
		
		ModelPredicateProviderRegistry.register(Formidulus.identifier("accessory_mode"),
				(stack, world, entity, seed) -> {
					AccessoryComponent component = stack.getOrDefault(DataComponentRegistry.ACCESSORY, AccessoryComponent.DEFAULT);
					return (float)(component.activeMode() % component.modes().size());
				});
		
		bossMusicHandler = new BossMusicHandler();
		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			if(!client.isPaused())
				bossMusicHandler.tick();
		});
		
		ClientPlayConnectionEvents.DISCONNECT.register((handler, client) -> bossMusicHandler.stopAll());
	}
}
