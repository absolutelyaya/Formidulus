package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.registries.ItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ItemTagProvider extends FabricTagProvider.ItemTagProvider
{
	public ItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
	{
		super(output, registriesFuture);
	}
	
	@Override
	protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
	{
		getOrCreateTagBuilder(ItemTags.SWORD_ENCHANTABLE).add(ItemRegistry.SACRIFICIAL_DAGGER);
	}
}
