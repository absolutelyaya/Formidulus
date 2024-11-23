package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.registries.ItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

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
		
		getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, Identifier.of("trinkets", "chest/necklace")))
				.add(ItemRegistry.DEER_NECKLACE);
		getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, Identifier.of("trinkets", "head/hat")))
				.add(ItemRegistry.DEER_SKULL);
	}
}
