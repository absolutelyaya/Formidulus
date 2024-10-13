package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;

public class SoundRegistry
{
	public static final SoundEvent WEEN = Registry.register(Registries.SOUND_EVENT, Formidulus.identifier("ween"), SoundEvent.of(Formidulus.identifier("ween")));
	
	public static void register()
	{
	
	}
}
