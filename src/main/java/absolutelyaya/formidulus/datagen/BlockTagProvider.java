package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.registries.BlockRegistry;
import absolutelyaya.formidulus.registries.TagRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagProvider extends FabricTagProvider.BlockTagProvider
{
	public BlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
	{
		super(output, registriesFuture);
	}
	
	@Override
	protected void configure(RegistryWrapper.WrapperLookup wrapper)
	{
		getOrCreateTagBuilder(TagRegistry.PUMPKIN)
				.add(Blocks.PUMPKIN)
				.add(Blocks.CARVED_PUMPKIN)
				.add(Blocks.JACK_O_LANTERN)
				.add(BlockRegistry.WEEN);
		
		getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
				.add(BlockRegistry.WEEN)
				.add(BlockRegistry.DEER_SKULL);
		getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
				.add(BlockRegistry.GREAT_LANTERN);
		getOrCreateTagBuilder(BlockTags.ENDERMAN_HOLDABLE)
				.add(BlockRegistry.WEEN);
	}
}
