package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.registries.FormidableBannerPatterns;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.data.DataOutput;
import net.minecraft.data.server.tag.TagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BannerTagProvider extends TagProvider<BannerPattern>
{
	protected BannerTagProvider(DataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookupFuture)
	{
		super(output, RegistryKeys.BANNER_PATTERN, registryLookupFuture);
	}
	
	@Override
	protected void configure(RegistryWrapper.WrapperLookup lookup)
	{
		getOrCreateTagBuilder(FormidableBannerPatterns.EYES_TAG).add(FormidableBannerPatterns.EYES);
	}
}
