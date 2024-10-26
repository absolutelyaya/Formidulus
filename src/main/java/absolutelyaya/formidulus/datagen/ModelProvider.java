package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.registries.BlockRegistry;
import absolutelyaya.formidulus.registries.ItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.Items;

public class ModelProvider extends FabricModelProvider
{
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
		builder.registerParentedItemModel(BlockRegistry.DEER_SKULL, Formidulus.identifier("item/deer_skull_cap"));
		
		builder.registerSimpleCubeAll(BlockRegistry.BOSS_SPAWNER);
	}
	
	@Override
	public void generateItemModels(ItemModelGenerator builder)
	{
		builder.register(ItemRegistry.SACRIFICIAL_DAGGER, Models.HANDHELD);
		builder.register(ItemRegistry.SOUL_DAGGER, Models.HANDHELD);
		builder.register(ItemRegistry.EYES_BANNER_PATTERN, Items.SKULL_BANNER_PATTERN, Models.GENERATED);
	}
}
