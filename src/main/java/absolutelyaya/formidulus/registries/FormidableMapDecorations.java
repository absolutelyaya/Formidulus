package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.item.map.MapDecorationType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;

public class FormidableMapDecorations
{
	public static final RegistryEntry<MapDecorationType> CULT_HIDEOUT =
			register("cult_hideout", true, 0x8e4ca8, false, true);
	
	private static RegistryEntry<MapDecorationType> register(String id, boolean showOnItemFrame, int mapColor, boolean trackCount, boolean explorationMapElement)
	{
		RegistryKey<MapDecorationType> registryKey = RegistryKey.of(RegistryKeys.MAP_DECORATION_TYPE, Formidulus.identifier(id));
		MapDecorationType mapDecorationType = new MapDecorationType(Formidulus.identifier(id), showOnItemFrame, mapColor, explorationMapElement, trackCount);
		return Registry.registerReference(Registries.MAP_DECORATION_TYPE, registryKey, mapDecorationType);
	}
	
	public static void register()
	{
	
	}
}
