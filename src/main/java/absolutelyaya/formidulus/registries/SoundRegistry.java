package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class SoundRegistry
{
	public static final SoundEvent WEEN = register(Formidulus.identifier("ween"));
	
	public static final SoundEvent MUSIC_DEER_INTRO = register(Formidulus.identifier("music.deer.intro"));
	public static final SoundEvent MUSIC_DEER_PHASE1 = register(Formidulus.identifier("music.deer.phase1"));
	public static final SoundEvent MUSIC_DEER_PHASE2_INTRO = register(Formidulus.identifier("music.deer.phase2_intro"));
	public static final SoundEvent MUSIC_DEER_PHASE2 = register(Formidulus.identifier("music.deer.phase2"));
	
	static SoundEvent register(Identifier id)
	{
		return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
	}
	
	public static void register()
	{
	
	}
}
