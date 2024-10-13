package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.registries.BlockRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.ModelIds;
import net.minecraft.data.client.TextureMap;

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
	}
	
	@Override
	public void generateItemModels(ItemModelGenerator builder)
	{
	
	}
}
