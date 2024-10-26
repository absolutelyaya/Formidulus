package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.registries.TagRegistry;
import absolutelyaya.formidulus.structure.FormidableStructures;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.world.gen.structure.Structure;

import java.util.concurrent.CompletableFuture;

public class StructureTagProvider extends FabricTagProvider<Structure>
{
	public StructureTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
	{
		super(output, RegistryKeys.STRUCTURE, registriesFuture);
	}
	
	@Override
	protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
	{
		getOrCreateTagBuilder(TagRegistry.CULT_HIDEOUT).add(FormidableStructures.DEER_CULT_HIDEOUT);
	}
}
