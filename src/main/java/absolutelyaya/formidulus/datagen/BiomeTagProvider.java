package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.structure.FormidableBiomeTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;

import java.util.concurrent.CompletableFuture;

public class BiomeTagProvider extends FabricTagProvider<Biome>
{
	public BiomeTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
	{
		super(output, RegistryKeys.BIOME, registriesFuture);
	}
	
	@Override
	protected void configure(RegistryWrapper.WrapperLookup wrapper)
	{
		getOrCreateTagBuilder(FormidableBiomeTags.DEER_CULT_HIDEOUT_PLACEABLE)
				.add(BiomeKeys.FOREST, BiomeKeys.BIRCH_FOREST, BiomeKeys.PLAINS, BiomeKeys.TAIGA, BiomeKeys.SUNFLOWER_PLAINS,
						BiomeKeys.SNOWY_PLAINS, BiomeKeys.SNOWY_TAIGA);
	}
}
