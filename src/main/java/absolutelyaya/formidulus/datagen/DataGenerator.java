package absolutelyaya.formidulus.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGenerator implements DataGeneratorEntrypoint
{
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator generator)
	{
		FabricDataGenerator.Pack pack = generator.createPack();
		pack.addProvider(BaseTranslationProvider::new);
		pack.addProvider(GermanTranslationProvider::new); //there isn't too much to translate, so might as well
		pack.addProvider(EntityLootTableProvider::new);
		pack.addProvider(ModelProvider::new);
		pack.addProvider(BlockLootTableProvider::new);
		pack.addProvider(BlockTagProvider::new);
		pack.addProvider(AdvancementProvider::new);
	}
}
