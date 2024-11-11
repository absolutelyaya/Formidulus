package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.registries.BlockRegistry;
import absolutelyaya.formidulus.registries.ItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModelProvider extends FabricModelProvider
{
	static final Model TEMPLATE_SPAWN_EGG = new Model(Optional.of(Identifier.ofVanilla("item/template_spawn_egg")), Optional.empty());
	
	public ModelProvider(FabricDataOutput output)
	{
		super(output);
	}
	
	@Override
	public void generateBlockStateModels(BlockStateModelGenerator builder)
	{
		builder.registerNorthDefaultHorizontalRotatable(BlockRegistry.WEEN, TextureMap.textureSideTop(BlockRegistry.WEEN));
		builder.registerParentedItemModel(BlockRegistry.WEEN, ModelIds.getBlockModelId(BlockRegistry.WEEN));
		
		builder.registerNorthDefaultHorizontalRotation(BlockRegistry.DEER_SKULL);
		builder.excludeFromSimpleItemModelGeneration(BlockRegistry.DEER_SKULL);
		
		builder.registerSimpleCubeAll(BlockRegistry.BOSS_SPAWNER);
	}
	
	@Override
	public void generateItemModels(ItemModelGenerator builder)
	{
		builder.register(ItemRegistry.SACRIFICIAL_DAGGER, Models.HANDHELD);
		builder.register(ItemRegistry.SOUL_DAGGER, Models.HANDHELD);
		builder.register(ItemRegistry.EYES_BANNER_PATTERN, Items.SKULL_BANNER_PATTERN, Models.GENERATED);
		builder.register(ItemRegistry.DEER_PHASE1_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
		builder.register(ItemRegistry.DEER_PHASE2_MUSIC_DISC, Models.TEMPLATE_MUSIC_DISC);
		builder.register(ItemRegistry.CULTIST_SPAWN_EGG, TEMPLATE_SPAWN_EGG);
		builder.register(ItemRegistry.CRUOR_SPAWN_EGG, TEMPLATE_SPAWN_EGG);
	}
}
