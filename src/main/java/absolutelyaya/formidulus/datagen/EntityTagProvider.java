package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.registries.EntityRegistry;
import absolutelyaya.formidulus.registries.TagRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalEntityTypeTags;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class EntityTagProvider extends FabricTagProvider.EntityTypeTagProvider
{
	public EntityTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture)
	{
		super(output, completableFuture);
	}
	
	@Override
	protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
	{
		getOrCreateTagBuilder(ConventionalEntityTypeTags.BOSSES).add(EntityRegistry.DEER_GOD);
		getOrCreateTagBuilder(TagRegistry.JOLLY_MOBS).add(EntityType.ZOMBIE).add(EntityType.SKELETON).add(EntityType.CREEPER);
	}
}
