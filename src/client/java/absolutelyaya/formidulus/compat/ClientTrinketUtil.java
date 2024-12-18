package absolutelyaya.formidulus.compat;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.rendering.trinkets.TrinketRenderers;

public class ClientTrinketUtil
{
	public static void registerTrinketRenderers()
	{
		if(Formidulus.TRINKETS)
			TrinketRenderers.registerRenderers();
	}
}
