package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.registries.EntityRegistry;
import absolutelyaya.formidulus.registries.ItemRegistry;
import absolutelyaya.formidulus.registries.StatusEffectRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BaseTranslationProvider extends FabricLanguageProvider
{
	protected BaseTranslationProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
	{
		super(dataOutput, registryLookup);
	}
	
	@Override
	public void generateTranslations(RegistryWrapper.WrapperLookup registry, TranslationBuilder builder)
	{
		builder.add(EntityRegistry.DEER_GOD, "Cervus Cruoris");
		//builder.add(EntityRegistry.DEER_FOLLOWER, "Cruoris Servus");
		builder.add(EntityRegistry.IRRLICHT, "Scintilla Vitae");
		
		builder.add(ItemRegistry.DEER_SKULL, "Deer Skull");
		builder.add(ItemRegistry.DEER_SKULL.getTranslationKey() + ".lore0", "The Skull of a horrid Skeletal Beast.");
		builder.add(ItemRegistry.DEER_SKULL.getTranslationKey() + ".lore1", "A third eye was carved into this previously ordinary deer skull.");
		builder.add(ItemRegistry.DEER_SKULL.getTranslationKey() + ".lore2", "It was as though it spoke to us.. but we couldn't comprehend it.");
		
		builder.add("death.attack.lantern", "%s was shown the Light");
		builder.add("death.attack.lantern.item", "%1s was shown the Light by %2$s using %3$s");
		builder.add("death.attack.lantern.player", "%1s was shown the Light whilst fighting %2$s");
		
		builder.add(StatusEffectRegistry.REVERENCE.value(), "Unwilling Reverence");
	}
}
