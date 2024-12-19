package absolutelyaya.formidulus;

import absolutelyaya.formidulus.compat.ClientTrinketUtil;
import absolutelyaya.formidulus.entities.boss.BossType;
import absolutelyaya.formidulus.gui.TitleHUD;
import absolutelyaya.formidulus.item.components.AccessoryComponent;
import absolutelyaya.formidulus.item.components.ChargeComponent;
import absolutelyaya.formidulus.network.ClientPacketHandler;
import absolutelyaya.formidulus.particle.BloodDropParticle;
import absolutelyaya.formidulus.particle.DarknessParticle;
import absolutelyaya.formidulus.particle.GatheringDarknessParticle;
import absolutelyaya.formidulus.particle.RisingDarknessParticle;
import absolutelyaya.formidulus.registries.*;
import absolutelyaya.formidulus.rendering.block.BossSpawnerRenderer;
import absolutelyaya.formidulus.rendering.block.DeerSkullBlockEntityRenderer;
import absolutelyaya.formidulus.rendering.entity.*;
import absolutelyaya.formidulus.rendering.entity.feature.CreeperHeadFeatureRenderer;
import absolutelyaya.formidulus.sound.BossMusicHandler;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.*;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.entity.CreeperEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.EntityType;

public class FormidulusClient implements ClientModInitializer
{
	public static final EntityModelLayer DEER_GOD_LAYER = new EntityModelLayer(Formidulus.identifier("deer_god"), "deer_god");
	public static final EntityModelLayer DEER_GOD_SKULL_LAYER = new EntityModelLayer(Formidulus.identifier("deer_god_skull"), "deer_god_skull");
	public static final EntityModelLayer IRRLICHT_LAYER = new EntityModelLayer(Formidulus.identifier("irrlicht"), "irrlicht");
	public static final EntityModelLayer DEER_FOLLOWER_LAYER = new EntityModelLayer(Formidulus.identifier("deer_follower"), "deer_follower");
	public static final EntityModelLayer JOLLY_HAT_LAYER = new EntityModelLayer(Formidulus.identifier("jolly_hat"), "jolly_hat");
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
		EntityModelLayerRegistry.registerModelLayer(JOLLY_HAT_LAYER, JollyHatModel::getTexturedModelData);
		
		//Particles
		ParticleFactoryRegistry particles = ParticleFactoryRegistry.getInstance();
		particles.register(ParticleRegistry.BLOOD_DROP_PARTICLE, BloodDropParticle.Factory::new);
		particles.register(ParticleRegistry.DARKNESS, DarknessParticle.Factory::new);
		particles.register(ParticleRegistry.RISING_DARKNESS, RisingDarknessParticle.Factory::new);
		particles.register(ParticleRegistry.GATHERING_DARKNESS, GatheringDarknessParticle.Factory::new);
		
		//Block Entities
		BlockEntityRendererFactories.register(BlockEntityRegistry.DEER_SKULL, DeerSkullBlockEntityRenderer::new);
		BlockEntityRendererFactories.register(BlockEntityRegistry.BOSS_SPAWNER, BossSpawnerRenderer::new);
		
		ClientTrinketUtil.registerTrinketRenderers();
		
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.GREAT_LANTERN, RenderLayer.getCutout());
		
		HudRenderCallback.EVENT.register((context, tickCounter) -> TitleHUD.render(context, tickCounter.getLastFrameDuration()));
		
		BuiltinItemRendererRegistry builtinItemRendererRegistry = BuiltinItemRendererRegistry.INSTANCE;
		builtinItemRendererRegistry.register(ItemRegistry.DEER_SKULL, new DeerGodSkullRenderer());
		builtinItemRendererRegistry.register(ItemRegistry.JOLLY_HAT, new JollyHatRenderer());
		
		ModelPredicateProviderRegistry.register(Formidulus.identifier("accessory_mode"),
				(stack, world, entity, seed) -> {
					AccessoryComponent component = stack.getOrDefault(DataComponentRegistry.ACCESSORY, AccessoryComponent.DEFAULT);
					return (float)(component.activeMode() % component.modes().size());
				});
		ModelPredicateProviderRegistry.register(Formidulus.identifier("charge"),
				(stack, world, entity, seed) -> {
					ChargeComponent stateComp = stack.get(DataComponentRegistry.CHARGE);
					if(stateComp == null)
						return 0;
					return stateComp.getChargePercent();
				});
		
		bossMusicHandler = new BossMusicHandler();
		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			if(!client.isPaused())
				bossMusicHandler.tick();
		});
		
		ModelLoadingPlugin.register(pluginContext -> {
			BossType.getAllTypes().forEach((id, type) -> {
				if(!type.spawnerModel().isEmpty())
					pluginContext.addModels(Formidulus.identifier("block/" + type.spawnerModel()));
			});
		});
		
		LivingEntityFeatureRendererRegistrationCallback.EVENT.register((type, renderer, helper, context) -> {
			if(type.equals(EntityType.CREEPER) && renderer instanceof CreeperEntityRenderer creeperRenderer)
				helper.register(new CreeperHeadFeatureRenderer(creeperRenderer));
		});
		
		ClientPlayConnectionEvents.DISCONNECT.register((handler, client) -> bossMusicHandler.stopAll());
	}
}
