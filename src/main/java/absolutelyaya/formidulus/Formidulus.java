package absolutelyaya.formidulus;

import absolutelyaya.formidulus.registries.EntityRegistry;
import absolutelyaya.formidulus.registries.ParticleRegistry;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Formidulus implements ModInitializer
{
	public static final String MOD_ID = "formidulus";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ParticleRegistry.register();
		EntityRegistry.register();
	}
	
	public static Identifier identifier(String path)
	{
		return Identifier.of(MOD_ID, path);
	}
}