package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.item.DeerSkullItem;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;

import java.util.ArrayList;
import java.util.List;

public class ItemRegistry
{
	public static final DeerSkullItem DEER_SKULL = Registry.register(Registries.ITEM, Formidulus.identifier("deer_skull"),
			new DeerSkullItem(new Item.Settings().component(DataComponentTypes.LORE, new LoreComponent(generateLore("deer_skull", 3)))
							 .component(DataComponentTypes.MAX_STACK_SIZE, 1).component(DataComponentTypes.RARITY, Rarity.RARE)));
	
	static List<Text> generateLore(String name, int count)
	{
		List<Text> list = new ArrayList<>();
		for (int i = 0; i < count; i++)
			list.add(Text.translatable(String.format("item.%1$s.%2$s.lore%3$s",  Formidulus.MOD_ID, name, i)));
		return list;
	}
	
	public static void register()
	{
	
	}
}
