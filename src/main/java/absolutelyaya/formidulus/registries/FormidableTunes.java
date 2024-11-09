package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class FormidableTunes
{
	public static final RegistryKey<JukeboxSong> DEER_PHASE1 = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Formidulus.identifier("deer_phase1"));
	public static final RegistryKey<JukeboxSong> DEER_PHASE2 = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Formidulus.identifier("deer_phase2"));
}
