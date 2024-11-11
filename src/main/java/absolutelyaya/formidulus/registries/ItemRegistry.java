package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.damage.DamageSources;
import absolutelyaya.formidulus.item.DeerSkullItem;
import absolutelyaya.formidulus.item.SacrificialDaggerItem;
import absolutelyaya.formidulus.item.abilities.ItemAbilities;
import absolutelyaya.formidulus.item.components.AbilityComponent;
import absolutelyaya.formidulus.item.components.AccessoryComponent;
import absolutelyaya.formidulus.item.components.DamageTypeComponent;
import absolutelyaya.formidulus.item.components.ExpandableLoreComponent;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.item.*;
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
											.component(DataComponentRegistry.EXPANDABLE_LORE, ExpandableLoreComponent.makeGenericBlock(id, 6))));
	public static final BlockItem WEEN = register(Formidulus.identifier("ween"),
			id -> new BlockItem(BlockRegistry.WEEN,
					new Item.Settings().component(DataComponentTypes.RARITY, Rarity.UNCOMMON)
							.component(DataComponentTypes.LORE, new LoreComponent(List.of(Text.translatable(BlockRegistry.WEEN.getTranslationKey() + ".lore"))))));
	public static final SacrificialDaggerItem SACRIFICIAL_DAGGER = register(Formidulus.identifier("sacrificial_dagger"),
			id -> new SacrificialDaggerItem(ToolMaterials.IRON,
					new Item.Settings().component(DataComponentTypes.RARITY, Rarity.UNCOMMON)
							.component(DataComponentTypes.MAX_DAMAGE, 640)
							.component(DataComponentRegistry.DAMAGE_TYPE, new DamageTypeComponent(DamageSources.SACRIFICE))
							.component(DataComponentTypes.ATTRIBUTE_MODIFIERS, SacrificialDaggerItem.createAttributeModifiers())
							.component(DataComponentRegistry.ABILITY, new AbilityComponent(ItemAbilities.VAMPIRISM))
							.component(DataComponentRegistry.EXPANDABLE_LORE, ExpandableLoreComponent.makeGeneric(id, 2))));
	public static final SacrificialDaggerItem SOUL_DAGGER = register(Formidulus.identifier("soul_dagger"),
			id -> new SacrificialDaggerItem(ToolMaterials.DIAMOND,
					new Item.Settings().component(DataComponentTypes.RARITY, Rarity.UNCOMMON)
							.component(DataComponentTypes.MAX_DAMAGE, 320)
							.component(DataComponentRegistry.DAMAGE_TYPE, new DamageTypeComponent(DamageSources.SACRIFICE))
							.component(DataComponentTypes.ATTRIBUTE_MODIFIERS, SacrificialDaggerItem.createAttributeModifiers())
							.component(DataComponentRegistry.ABILITY, new AbilityComponent(ItemAbilities.SOULSTEAL))
							.component(DataComponentRegistry.EXPANDABLE_LORE, ExpandableLoreComponent.makeGeneric(id, 2))));
	public static final BannerPatternItem EYES_BANNER_PATTERN = register(Formidulus.identifier("eyes_pattern"),
			id -> new BannerPatternItem(FormidableBannerPatterns.EYES_TAG, new Item.Settings().rarity(Rarity.RARE).maxCount(1)));
	
	public static final Item DEER_PHASE1_MUSIC_DISC = register(Formidulus.identifier("deer_phase1_disc"),
			id -> new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(FormidableTunes.DEER_PHASE1)));
	public static final Item DEER_PHASE2_MUSIC_DISC = register(Formidulus.identifier("deer_phase2_disc"),
			id -> new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(FormidableTunes.DEER_PHASE2)));
	
	public static final BlockItem BOSS_SPAWNER = register(Formidulus.identifier("boss_spawner"),
			id -> new BlockItem(BlockRegistry.BOSS_SPAWNER,
					new Item.Settings().component(DataComponentTypes.RARITY, Rarity.EPIC)));
	
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
			entries.add(SACRIFICIAL_DAGGER);
			entries.add(SOUL_DAGGER);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((entries) -> {
			entries.add(EYES_BANNER_PATTERN);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((entries) -> {
			entries.add(DEER_PHASE1_MUSIC_DISC);
			entries.add(DEER_PHASE2_MUSIC_DISC);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register((entries) -> {
			entries.add(BOSS_SPAWNER);
		});
	}
}
