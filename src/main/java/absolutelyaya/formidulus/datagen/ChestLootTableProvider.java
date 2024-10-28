package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.registries.FormidableLootTables;
import absolutelyaya.formidulus.registries.ItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.entry.EmptyEntry;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.EnchantWithLevelsLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.BiConsumer;

public class ChestLootTableProvider extends SimpleFabricLootTableProvider
{
	RegistryWrapper.WrapperLookup registryLookup;
	
	public ChestLootTableProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
	{
		super(output, registryLookup, LootContextTypes.CHEST);
		try
		{
			this.registryLookup = registryLookup.get();
		}
		catch (ExecutionException | InterruptedException e)
		{
			Formidulus.LOGGER.error("couldn't get Registry Lookup when generating loot tables: ", e);
		}
	}
	
	@Override
	public void accept(BiConsumer<RegistryKey<LootTable>, LootTable.Builder> consumer)
	{
		consumer.accept(FormidableLootTables.CULT_HIDEOUT_HOUSE_CHEST,
				LootTable.builder()
						.pool(LootPool.builder()
									  .rolls(UniformLootNumberProvider.create(3, 5))
									  .with(ItemEntry.builder(Items.BOOK)
													.apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 6))).weight(5))
									  .with(ItemEntry.builder(Items.COBWEB)
													.apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0, 2))).weight(7))
									  .with(ItemEntry.builder(Items.BONE)
													.apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0, 2))).weight(3))
									  .with(ItemEntry.builder(Items.PAPER)
													.apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 7))).weight(7))
									  .with(ItemEntry.builder(Items.BOOK)
													.apply(EnchantWithLevelsLootFunction.builder(registryLookup,
																	UniformLootNumberProvider.create(20, 26))).weight(2))
									  .build()));
		consumer.accept(FormidableLootTables.CULT_HIDEOUT_CAVE_CHEST,
				LootTable.builder()
						.pool(LootPool.builder()
									  .rolls(UniformLootNumberProvider.create(4, 10))
									  .with(ItemEntry.builder(Items.BOOK)
													.apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 6))).weight(5))
									  .with(ItemEntry.builder(Items.PAPER)
													.apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2, 4))).weight(4))
									  .with(ItemEntry.builder(Items.BOOK)
													.apply(EnchantWithLevelsLootFunction.builder(registryLookup,
															UniformLootNumberProvider.create(30, 36))).weight(1))
									  .with(ItemEntry.builder(Items.GOLDEN_APPLE)
													.apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0, 1))).weight(2))
									  .with(ItemEntry.builder(Items.DIAMOND)
													.apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0, 3))).weight(2))
									  .with(ItemEntry.builder(Items.EMERALD)
													.apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 5))).weight(2))
									  .build())
						.pool(LootPool.builder()
									  .with(EmptyEntry.builder().weight(4))
									  .with(ItemEntry.builder(ItemRegistry.EYES_BANNER_PATTERN).weight(1))
									  .build()));
		consumer.accept(FormidableLootTables.CULT_HIDEOUT_TREE_CHEST,
				LootTable.builder()
						.pool(LootPool.builder()
									  .with(ItemEntry.builder(Items.GOLDEN_APPLE).weight(9))
									  .with(ItemEntry.builder(Items.ENCHANTED_GOLDEN_APPLE).weight(1))
									  .build()));
	}
}
