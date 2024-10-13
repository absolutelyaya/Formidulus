package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.item.DeerSkullItem;
import absolutelyaya.formidulus.item.components.AccessoryComponent;
import absolutelyaya.formidulus.item.components.ExpandableLoreComponent;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.List;
import java.util.function.Function;

public class ItemRegistry
{
	public static final DeerSkullItem DEER_SKULL = register(Formidulus.identifier("deer_skull"),
			id -> new DeerSkullItem(new Item.Settings().component(DataComponentTypes.MAX_STACK_SIZE, 1).component(DataComponentTypes.RARITY, Rarity.RARE)
											.component(DataComponentRegistry.ACCESSORY,
													new AccessoryComponent(List.of(DeerSkullItem.ACCESSORY_MODE_CAP, DeerSkullItem.ACCESSORY_MODE_MASK), 0))
											.component(DataComponentRegistry.EXPANDABLE_LORE, ExpandableLoreComponent.makeGeneric(id, 6))));
	public static final BlockItem WEEN = register(Formidulus.identifier("ween"),
			id -> new BlockItem(BlockRegistry.WEEN,
					new Item.Settings().component(DataComponentTypes.RARITY, Rarity.UNCOMMON)
							.component(DataComponentTypes.LORE, new LoreComponent(List.of(Text.translatable(BlockRegistry.WEEN.getTranslationKey() + ".lore"))))));
	
	public static <T extends Item> T register(Identifier id, Function<Identifier, T> factory)
	{
		return Registry.register(Registries.ITEM, id, factory.apply(id));
	}
	
	public static void register()
	{
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((entries) -> {
			entries.add(WEEN);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((entries) -> {
			entries.add(DEER_SKULL);
		});
	}
}
