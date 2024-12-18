package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.registries.EntityRegistry;
import absolutelyaya.formidulus.registries.ItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.advancement.criterion.OnKilledCriterion;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.predicate.entity.EntityPredicate;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class RecipeProvider extends FabricRecipeProvider
{
	public RecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
	{
		super(output, registriesFuture);
	}
	
	@Override
	public void generate(RecipeExporter exporter)
	{
		ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemRegistry.SOUL_DAGGER)
				.input('*', ItemRegistry.SACRIFICIAL_DAGGER).input('d', Items.DIAMOND).input('b', Items.BLAZE_ROD).input('e', Items.ECHO_SHARD)
				.pattern(" e ").pattern("d*d").pattern(" b ")
				.showNotification(false)
				.criterion("deer", OnKilledCriterion.Conditions.createPlayerKilledEntity(EntityPredicate.Builder.create().type(EntityRegistry.DEER_GOD)))
				.offerTo(exporter);
		ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemRegistry.BIG_LANTERN)
				.input('c', ItemRegistry.CHAINLINK).input('l', Items.LANTERN)
				.pattern(" c ").pattern("clc").pattern(" c ")
				.showNotification(false)
				.criterion("deer", InventoryChangedCriterion.Conditions.items(ItemRegistry.CHAINLINK))
				.offerTo(exporter);
	}
}
