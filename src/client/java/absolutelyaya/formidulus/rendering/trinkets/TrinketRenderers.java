package absolutelyaya.formidulus.rendering.trinkets;

import absolutelyaya.formidulus.registries.ItemRegistry;
import dev.emi.trinkets.api.client.TrinketRendererRegistry;

public class TrinketRenderers
{
	public static void registerRenderers()
	{
		TrinketRendererRegistry.registerRenderer(ItemRegistry.DEER_SKULL, new DeerSkullTrinketRenderer());
		TrinketRendererRegistry.registerRenderer(ItemRegistry.JOLLY_HAT, new JollyHatTrinketRenderer());
	}
}
