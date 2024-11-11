package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.registries.EntityRegistry;
import absolutelyaya.formidulus.registries.ItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class EntityLootTableProvider extends SimpleFabricLootTableProvider
{
	public EntityLootTableProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
	{
		super(output, registryLookup, LootContextTypes.ENTITY);
	}
	
	@Override
	public void accept(BiConsumer<RegistryKey<LootTable>, LootTable.Builder> consumer)
	{
		consumer.accept(EntityRegistry.DEER_GOD.getLootTableId(),
				new LootTable.Builder().type(lootContextType)
						.pool(LootPool.builder().with(ItemEntry.builder(ItemRegistry.DEER_SKULL)).build())
						.pool(LootPool.builder().conditionally(RandomChanceLootCondition.builder(0.5f))
									  .with(ItemEntry.builder(ItemRegistry.DEER_PHASE1_MUSIC_DISC))
									  .with(ItemEntry.builder(ItemRegistry.DEER_PHASE2_MUSIC_DISC)).build()));
	}
}
