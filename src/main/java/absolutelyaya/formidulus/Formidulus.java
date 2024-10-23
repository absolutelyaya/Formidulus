package absolutelyaya.formidulus;

import absolutelyaya.formidulus.advancement.CriteriaRegistry;
import absolutelyaya.formidulus.config.ServerConfig;
import absolutelyaya.formidulus.entities.boss.BossFightManager;
import absolutelyaya.formidulus.registries.*;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Formidulus implements ModInitializer
{
	public static final Identifier FONT = Identifier.of("illageralt");
	public static final String MOD_ID = "formidulus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static ServerConfig config;

	@Override
	public void onInitialize()
	{
		BlockRegistry.register();
		BlockEntityRegistry.register();
		ItemRegistry.register();
		ParticleRegistry.register();
		EntityRegistry.register();
		PacketRegistry.register();
		StatusEffectRegistry.register();
		SoundRegistry.register();
		CriteriaRegistry.regiser();
		
		ServerTickEvents.END_SERVER_TICK.register((server) -> {
			BossFightManager.INSTANCE.tick();
		});
		
		config = new ServerConfig();
	}
	
	public static Identifier identifier(String path)
	{
		return Identifier.of(MOD_ID, path);
	}
}
