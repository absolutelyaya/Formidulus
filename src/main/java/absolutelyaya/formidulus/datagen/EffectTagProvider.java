package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.registries.StatusEffectRegistry;
import absolutelyaya.formidulus.registries.TagRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class EffectTagProvider extends FabricTagProvider<StatusEffect>
{
	protected EffectTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture)
	{
		super(output, RegistryKeys.STATUS_EFFECT, completableFuture);
	}
	
	@Override
	protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
	{
		getOrCreateTagBuilder(TagRegistry.DEER_EFFECTS)
				.add(StatusEffectRegistry.REVERENCE.value(), StatusEffectRegistry.DARKNESS.value());
	}
}
