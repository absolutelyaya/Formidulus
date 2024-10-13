package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.item.DeerSkullItem;
import absolutelyaya.formidulus.registries.BlockRegistry;
import absolutelyaya.formidulus.registries.EntityRegistry;
import absolutelyaya.formidulus.registries.ItemRegistry;
import absolutelyaya.formidulus.registries.StatusEffectRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static absolutelyaya.formidulus.datagen.BaseTranslationProvider.genericKey;

public class GermanTranslationProvider extends FabricLanguageProvider implements Lang
{
	protected GermanTranslationProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
	{
		super(dataOutput, "de_de", registryLookup);
	}
	
	@Override
	public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder builder)
	{
		builder.add(EntityRegistry.DEER_GOD, "Cervus Cruoris");
		builder.add(EntityRegistry.DEER_FOLLOWER, "Cruoris Servus");
		builder.add(EntityRegistry.IRRLICHT, "Scintilla Vitae");
		builder.add(EntityRegistry.PUMPKIN, "Explosiver Kürbis");
		
		builder.add(EXPANDABLE_LORE_HINT, "[Drück Shift für mehr Infos]");
		builder.add(ItemRegistry.DEER_SKULL, "Hirsch Schädel");
		builder.add(ItemRegistry.DEER_SKULL.getTranslationKey() + ".lore0", "Der Schädel eines schrecklichen Skelettbiests,");
		builder.add(ItemRegistry.DEER_SKULL.getTranslationKey() + ".lore1", "in dessen Stirn ein drittes Auge geschnitzt wurde.");
		builder.add(ItemRegistry.DEER_SKULL.getTranslationKey() + ".lore2", "Zudem ist er in seltsamen Mustern mit Blut bemalt.");
		builder.add(ItemRegistry.DEER_SKULL.getTranslationKey() + ".lore3", " ");
		builder.add(ItemRegistry.DEER_SKULL.getTranslationKey() + ".lore4", "Es war als würde es mit uns reden..");
		builder.add(ItemRegistry.DEER_SKULL.getTranslationKey() + ".lore5", "..aber wir konnten nichts verstehen.");
		builder.add(ACCESSORY_MODE_PREFIX, "Accessoire Modus: %s");
		builder.add(genericKey("item.accessory_mode", "default"), "Standard");
		builder.add(genericKey("item.accessory_mode", DeerSkullItem.ACCESSORY_MODE_CAP), "Kappe");
		builder.add(genericKey("item.accessory_mode", DeerSkullItem.ACCESSORY_MODE_MASK), "Maske");
		builder.add(ACCESSORY_MODE_HINT, "[Drück Alt & Klick zum Modus wechseln]");
		
		builder.add(BlockRegistry.WEEN, "Ween");
		builder.add(BlockRegistry.WEEN.getTranslationKey() + ".lore", "es ist ween");
		
		builder.add("death.attack.lantern", "%1$s wurde von %2$s ins Licht geführt");
		builder.add("death.attack.lantern.item", "%1$s wurde von %2$s mittels %3$s ins Licht geführt");
		builder.add("death.attack.lantern.player", "%1s wurde ins Licht geführt, während eines Kampfes mit %2$s");
		
		builder.add("death.attack.claw", "%1$s wurde von %2$s zerrissen");
		builder.add("death.attack.claw.item", "%1s wurde von %2$s mit %3$s zerrissen");
		builder.add("death.attack.claw.player", "%1s wurde zerrissen beim Versuch %2$s zu entkommen");
		
		builder.add("death.attack.sacrifice", "%1$s wurde zu einer Opfergabe durch %2$s");
		builder.add("death.attack.sacrifice.item", "%1s wurde zu einer Opfergabe durch %2$s mit %3$s");
		builder.add("death.attack.sacrifice.player", "%1s wurde zu einer Opfergabe beim Versuch %2$s zu entkommen");
		
		builder.add(StatusEffectRegistry.REVERENCE.value(), "Erzwungende Erfurcht");
	}
}
