package absolutelyaya.formidulus;

import absolutelyaya.formidulus.gui.TitleHUD;
import absolutelyaya.formidulus.item.components.AccessoryComponent;
import absolutelyaya.formidulus.network.ClientPacketHandler;
import absolutelyaya.formidulus.particle.BloodDropParticle;
import absolutelyaya.formidulus.registries.*;
import absolutelyaya.formidulus.rendering.block.DeerSkullBlockEntityRenderer;
import absolutelyaya.formidulus.rendering.entity.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.*;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class FormidulusClient implements ClientModInitializer
{
	public static final EntityModelLayer DEER_GOD_LAYER = new EntityModelLayer(Formidulus.identifier("deer_god"), "deer_god");
	public static final EntityModelLayer DEER_GOD_SKULL_LAYER = new EntityModelLayer(Formidulus.identifier("deer_god_skull"), "deer_god_skull");
	public static final EntityModelLayer IRRLICHT_LAYER = new EntityModelLayer(Formidulus.identifier("irrlicht"), "irrlicht");
	
	@Override
	public void onInitializeClient()
	{
		ClientPacketHandler.register();
		
		//Entities
		EntityRendererRegistry.register(EntityRegistry.DEER_GOD, DeerGodRenderer::new);
		EntityRendererRegistry.register(EntityRegistry.IRRLICHT, IrrlichtRenderer::new);
		EntityRendererRegistry.register(EntityRegistry.PUMPKIN, PumpkinRenderer::new);
		
		//Entity Model Layers
		EntityModelLayerRegistry.registerModelLayer(DEER_GOD_LAYER, DeerGodModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(DEER_GOD_SKULL_LAYER, DeerGodSkullModel::getTexturedModelData);
		EntityModelLayerRegistry.registerModelLayer(IRRLICHT_LAYER, IrrlichtModel::getTexturedModelData);
		
		//Particles
		ParticleFactoryRegistry particles = ParticleFactoryRegistry.getInstance();
		particles.register(ParticleRegistry.BLOOD_DROP_PARTICLE, BloodDropParticle.Factory::new);
		
		//Block Entities
		BlockEntityRendererFactories.register(BlockEntityRegistry.DEER_SKULL, DeerSkullBlockEntityRenderer::new);
		
		HudRenderCallback.EVENT.register((context, tickCounter) -> TitleHUD.render(context, tickCounter.getLastFrameDuration()));
		
		BuiltinItemRendererRegistry builtinItemRendererRegistry = BuiltinItemRendererRegistry.INSTANCE;
		builtinItemRendererRegistry.register(ItemRegistry.DEER_SKULL, new DeerGodSkullRenderer());
		
		ModelPredicateProviderRegistry.register(Formidulus.identifier("accessory_mode"),
				(stack, world, entity, seed) -> {
					AccessoryComponent component = stack.getOrDefault(DataComponentRegistry.ACCESSORY, AccessoryComponent.DEFAULT);
					return (float)(component.activeMode() % component.modes().size());
				});
	}
}
