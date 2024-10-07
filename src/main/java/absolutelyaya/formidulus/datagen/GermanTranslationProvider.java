package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.registries.EntityRegistry;
import absolutelyaya.formidulus.registries.ItemRegistry;
import absolutelyaya.formidulus.registries.StatusEffectRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class GermanTranslationProvider extends FabricLanguageProvider
{
	protected GermanTranslationProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
	{
		super(dataOutput, "de_de", registryLookup);
	}
	
	@Override
	public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder builder)
	{
		builder.add(EntityRegistry.DEER_GOD, "Cervus Cruoris");
		//builder.add(EntityRegistry.DEER_FOLLOWER, "Cruoris Servus");
		builder.add(EntityRegistry.IRRLICHT, "Scintilla Vitae");
		
		builder.add(ItemRegistry.DEER_SKULL, "Hirsch Schädel");
		builder.add(ItemRegistry.DEER_SKULL.getTranslationKey() + ".lore0", "Der Schädel eines schrecklichen Skelettbiests.");
		builder.add(ItemRegistry.DEER_SKULL.getTranslationKey() + ".lore1", "Ein drittes Auge wurde in diesen zuvor normalen Schädel geschnitzt.");
		builder.add(ItemRegistry.DEER_SKULL.getTranslationKey() + ".lore2", "Es war als würde es mit uns reden.. aber wir konnten nichts verstehen.");
		
		builder.add("death.attack.lantern", "%s wurde das Licht gezeigt");
		builder.add("death.attack.lantern.item", "%1s wurde von %2$s mittels %3$s das Licht gezeigt");
		builder.add("death.attack.lantern.player", "%1s wurde das Licht gezeigt, während eines Kampfes mit %2$s");
		
		builder.add(StatusEffectRegistry.REVERENCE.value(), "Erzwungende Erfurcht");
	}
}
