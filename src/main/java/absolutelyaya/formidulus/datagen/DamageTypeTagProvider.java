package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.damage.DamageSources;
import absolutelyaya.formidulus.registries.TagRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class DamageTypeTagProvider extends FabricTagProvider<DamageType>
{
	public DamageTypeTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
	{
		super(output, RegistryKeys.DAMAGE_TYPE, registriesFuture);
	}
	
	@Override
	protected void configure(RegistryWrapper.WrapperLookup wrapper)
	{
		getOrCreateTagBuilder(TagRegistry.BOSS_DAMAGE).add(DamageSources.CLAW, DamageSources.LANTERN);
		getOrCreateTagBuilder(TagRegistry.SOUL_DAMAGE).add(DamageSources.SOUL);
	}
}
