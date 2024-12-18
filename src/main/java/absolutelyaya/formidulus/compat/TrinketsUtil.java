package absolutelyaya.formidulus.compat;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.function.Function;

/**
 * I'm trying to avoid required dependencies as much as possible.<br>
 * This class will only access the class that actually uses TrinketApi directly if Trinkets is present.<br>
 * This way Players can play without Trinkets if they wish to, without crashing due to the game trying to load classes that don't exist.<br>
 */
public class TrinketsUtil
{
	public static boolean isHasTrinketEquipped(LivingEntity living, Item item)
	{
		if(Formidulus.TRINKETS)
			return UnsafeTrinketHandler.isHasTrinketEquipped(living, item);
		return false;
	}
	
	public static boolean performIfPresent(LivingEntity living, Item item, Function<ItemStack, Boolean> function)
	{
		if(Formidulus.TRINKETS)
			return UnsafeTrinketHandler.performIfPresent(living, item, function);
		return false;
	}
	
	public static int performForEachPresent(LivingEntity living, Item item, Function<ItemStack, Boolean> function)
	{
		if(Formidulus.TRINKETS)
			return UnsafeTrinketHandler.performForEachPresent(living, item, function);
		return 0;
	}
}
