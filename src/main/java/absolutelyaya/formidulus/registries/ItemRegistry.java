package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.item.DeerSkullItem;
import absolutelyaya.formidulus.item.components.AccessoryComponent;
import absolutelyaya.formidulus.item.components.ExpandableLoreComponent;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.List;
import java.util.function.Function;

public class ItemRegistry
{
	public static final DeerSkullItem DEER_SKULL = register(Formidulus.identifier("deer_skull"), id -> {
		return new DeerSkullItem(new Item.Settings().component(DataComponentTypes.MAX_STACK_SIZE, 1).component(DataComponentTypes.RARITY, Rarity.RARE)
										 .component(DataComponentRegistry.ACCESSORY,
												 new AccessoryComponent(List.of(DeerSkullItem.ACCESSORY_MODE_CAP, DeerSkullItem.ACCESSORY_MODE_MASK), 0))
										 .component(DataComponentRegistry.EXPANDABLE_LORE, ExpandableLoreComponent.makeGeneric(id, 6)));
	});
	
	
	public static <T extends Item> T register(Identifier id, Function<Identifier, T> factory)
	{
		return Registry.register(Registries.ITEM, id, factory.apply(id));
	}
	
	public static void register()
	{
	
	}
}
