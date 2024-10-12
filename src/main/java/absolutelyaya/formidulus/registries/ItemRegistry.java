package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.item.DeerSkullItem;
import absolutelyaya.formidulus.item.components.AccessoryComponent;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Rarity;

import java.util.List;

public class ItemRegistry
{
	public static final DeerSkullItem DEER_SKULL = Registry.register(Registries.ITEM, Formidulus.identifier("deer_skull"),
			new DeerSkullItem(new Item.Settings().component(DataComponentTypes.MAX_STACK_SIZE, 1).component(DataComponentTypes.RARITY, Rarity.RARE)
									  .component(DataComponentRegistry.ACCESSORY_COMPONENT,
											  new AccessoryComponent(List.of(DeerSkullItem.ACCESSORY_MODE_CAP, DeerSkullItem.ACCESSORY_MODE_MASK), 0))));
	
	public static void register()
	{
	
	}
}
