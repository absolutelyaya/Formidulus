package absolutelyaya.formidulus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class RegistryProvider extends FabricDynamicRegistryProvider
{
	public RegistryProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
	{
		super(output, registriesFuture);
	}
	
	@Override
	protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries)
	{
		entries.addAll(registries.getWrapperOrThrow(RegistryKeys.BANNER_PATTERN));
		
		entries.addAll(registries.getWrapperOrThrow(RegistryKeys.TEMPLATE_POOL));
		entries.addAll(registries.getWrapperOrThrow(RegistryKeys.STRUCTURE_SET));
		entries.addAll(registries.getWrapperOrThrow(RegistryKeys.STRUCTURE));
		
		entries.addAll(registries.getWrapperOrThrow(RegistryKeys.JUKEBOX_SONG));
		
		entries.addAll(registries.getWrapperOrThrow(RegistryKeys.DAMAGE_TYPE));
	}
	
	@Override
	public String getName()
	{
		return "Formidulus Dynamic Registry Provider";
	}
}
