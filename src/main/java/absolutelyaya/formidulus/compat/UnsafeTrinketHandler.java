package absolutelyaya.formidulus.compat;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Pair;

import java.util.List;
import java.util.function.Function;

/**
 * "Unsafe" just means using this directly will crash the game for people without Trinkets installed.<br>
 * Use {@link TrinketsUtil} instead!
 */
public class UnsafeTrinketHandler
{
	public static boolean isHasTrinketEquipped(LivingEntity living, Item item)
	{
		return TrinketsApi.getTrinketComponent(living).map(trinketComponent -> trinketComponent.isEquipped(item)).orElse(false);
	}
	
	/**
	 * Performs a given function with every found trinket of a given type until one succeeds
	 * @return whether the function was performed successfully
	 */
	public static boolean performIfPresent(LivingEntity living, Item item, Function<ItemStack, Boolean> function)
	{
		List<Pair<SlotReference, ItemStack>> list = TrinketsApi.getTrinketComponent(living).map(trinketComponent -> trinketComponent.getEquipped(item)).orElse(List.of());
		for (Pair<SlotReference, ItemStack> i : list)
			if(function.apply(i.getRight()))
				return true;
		return false;
	}
	
	/**
	 * Performs a given function with every found trinket of a given type
	 * @return how often the function was performed successfully
	 */
	public static int performForEachPresent(LivingEntity living, Item item, Function<ItemStack, Boolean> function)
	{
		int count = 0;
		List<Pair<SlotReference, ItemStack>> list = TrinketsApi.getTrinketComponent(living).map(trinketComponent -> trinketComponent.getEquipped(item)).orElse(List.of());
		for (Pair<SlotReference, ItemStack> i : list)
			if(function.apply(i.getRight()))
				count++;
		return count;
	}
}
