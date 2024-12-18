package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.registries.EntityRegistry;
import absolutelyaya.formidulus.registries.ItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.condition.RandomChanceWithEnchantedBonusLootCondition;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.ConditionalLootFunction;
import net.minecraft.loot.function.LootFunctionTypes;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.EnchantmentTags;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.BiConsumer;

public class EntityLootTableProvider extends SimpleFabricLootTableProvider
{
	final RegistryWrapper.WrapperLookup registryLookup;
	
	public EntityLootTableProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
	{
		super(output, registryLookup, LootContextTypes.ENTITY);
		
		RegistryWrapper.WrapperLookup lookup;
		try
		{
			lookup = registryLookup.get();
		}
		catch (ExecutionException | InterruptedException e)
		{
			lookup = null;
		}
		this.registryLookup = lookup;
	}
	
	@Override
	public void accept(BiConsumer<RegistryKey<LootTable>, LootTable.Builder> consumer)
	{
		consumer.accept(EntityRegistry.DEER_GOD.getLootTableId(),
				new LootTable.Builder().type(lootContextType)
						.pool(LootPool.builder().with(ItemEntry.builder(ItemRegistry.DEER_SKULL)).build())
						.pool(LootPool.builder().conditionally(RandomChanceLootCondition.builder(0.5f))
									  .with(ItemEntry.builder(ItemRegistry.DEER_PHASE1_MUSIC_DISC))
									  .with(ItemEntry.builder(ItemRegistry.DEER_PHASE2_MUSIC_DISC)).build())
						.pool(LootPool.builder().with(ItemEntry.builder(ItemRegistry.CHAINLINK))
									  .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2, 5))).build())
						.pool(LootPool.builder().conditionally(RandomChanceWithEnchantedBonusLootCondition.builder(registryLookup, 0.33f, 0.05f).build())
									  .with(ItemEntry.builder(ItemRegistry.BIG_LANTERN))));
	}
}
