package absolutelyaya.formidulus.compat;

import absolutelyaya.formidulus.Formidulus;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;

public class TrinketsUtil
{
	public static boolean isHasTrinketEquipped(LivingEntity living, Item item)
	{
		if(Formidulus.TRINKETS)
			return isHasTrinketEquippedInternal(living, item);
		return false;
	}
	
	private static boolean isHasTrinketEquippedInternal(LivingEntity living, Item item)
	{
		return TrinketsApi.getTrinketComponent(living).map(trinketComponent -> trinketComponent.isEquipped(item)).orElse(false);
	}
}
