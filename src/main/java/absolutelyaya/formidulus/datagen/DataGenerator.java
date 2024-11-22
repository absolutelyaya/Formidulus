package absolutelyaya.formidulus.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

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
		pack.addProvider(ItemTagProvider::new);
		pack.addProvider(EffectTagProvider::new);
		pack.addProvider(RecipeProvider::new);
		pack.addProvider(BiomeTagProvider::new);
		pack.addProvider(RegistryProvider::new);
		pack.addProvider(BannerTagProvider::new);
		pack.addProvider(StructureTagProvider::new);
		pack.addProvider(ChestLootTableProvider::new);
		pack.addProvider(DamageTypeTagProvider::new);
		pack.addProvider(EntityTagProvider::new);
	}
	
	@Override
	public void buildRegistry(RegistryBuilder registryBuilder)
	{
		DataGeneratorEntrypoint.super.buildRegistry(registryBuilder);
		registryBuilder.addRegistry(RegistryKeys.BANNER_PATTERN, Bootstrap::bannerPatterns);
		registryBuilder.addRegistry(RegistryKeys.STRUCTURE, Bootstrap::structures);
		registryBuilder.addRegistry(RegistryKeys.STRUCTURE_SET, Bootstrap::structureSets);
		registryBuilder.addRegistry(RegistryKeys.TEMPLATE_POOL, Bootstrap::templatePools);
		registryBuilder.addRegistry(RegistryKeys.PROCESSOR_LIST, Bootstrap::processorLists);
		registryBuilder.addRegistry(RegistryKeys.JUKEBOX_SONG, Bootstrap::jukeboxSongs);
		registryBuilder.addRegistry(RegistryKeys.DAMAGE_TYPE, Bootstrap::damageTypes);
	}
}
