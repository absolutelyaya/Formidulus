package absolutelyaya.formidulus.advancement;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class CriteriaRegistry
{
	public static final BossFightWonCriterion BOSSFIGHT_WIN =
			Registry.register(Registries.CRITERION, Formidulus.identifier("bossfight_win"), new BossFightWonCriterion());
	
	public static void regiser()
	{
	
	}
}
