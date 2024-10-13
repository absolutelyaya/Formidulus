package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.item.DeerSkullItem;
import absolutelyaya.formidulus.registries.BlockRegistry;
import absolutelyaya.formidulus.registries.EntityRegistry;
import absolutelyaya.formidulus.registries.ItemRegistry;
import absolutelyaya.formidulus.registries.StatusEffectRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BaseTranslationProvider extends FabricLanguageProvider implements Lang
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
		builder.add(EntityRegistry.PUMPKIN, "Volatile Pumpkin");
		
		builder.add(EXPANDABLE_LORE_HINT, "[Press Shift for more Info]");
		builder.add(ItemRegistry.DEER_SKULL, "Deer Skull");
		builder.add(ItemRegistry.DEER_SKULL.getTranslationKey() + ".lore0", "The Skull of a horrid Skeletal Beast.");
		builder.add(ItemRegistry.DEER_SKULL.getTranslationKey() + ".lore1", "A third eye was carved into its forehead.");
		builder.add(ItemRegistry.DEER_SKULL.getTranslationKey() + ".lore2", "There's also strange patterns painted onto it using blood.");
		builder.add(ItemRegistry.DEER_SKULL.getTranslationKey() + ".lore3", " ");
		builder.add(ItemRegistry.DEER_SKULL.getTranslationKey() + ".lore4", "It was as though it spoke to us..");
		builder.add(ItemRegistry.DEER_SKULL.getTranslationKey() + ".lore5", "..but we couldn't comprehend it.");
		builder.add(ACCESSORY_MODE_PREFIX, "Accessory Mode: %s");
		builder.add(genericKey("item.accessory_mode", "default"), "Default");
		builder.add(genericKey("item.accessory_mode", DeerSkullItem.ACCESSORY_MODE_CAP), "Cap");
		builder.add(genericKey("item.accessory_mode", DeerSkullItem.ACCESSORY_MODE_MASK), "Mask");
		builder.add(ACCESSORY_MODE_HINT, "[Press Alt & Click to cycle]");
		
		builder.add(BlockRegistry.WEEN, "Ween");
		builder.add(BlockRegistry.WEEN.getTranslationKey() + ".lore", "it's ween");
		
		builder.add("death.attack.lantern", "%1$s was shown the Light by %2$s");
		builder.add("death.attack.lantern.item", "%1s was shown the Light by %2$s using %3$s");
		builder.add("death.attack.lantern.player", "%1s was shown the Light whilst fighting %2$s");
		
		builder.add("death.attack.claw", "%1$s was torn apart by %2$s");
		builder.add("death.attack.claw.item", "%1s was torn apart by %2$s using %3$s");
		builder.add("death.attack.claw.player", "%1s was torn apart trying to escape %2$s");
		
		builder.add("death.attack.sacrifice", "%1$s was sacrificed by %2$s");
		builder.add("death.attack.sacrifice.item", "%1s was sacrificed by %2$s using %3$s");
		builder.add("death.attack.sacrifice.player", "%1s was sacrificed trying to escape %2$s");
		
		builder.add(StatusEffectRegistry.REVERENCE.value(), "Unwilling Reverence");
	}
	
	public static String modKey(String category, String path)
	{
		return category + "." + Formidulus.MOD_ID + "." + path;
	}
	
	public static String genericKey(String category, String path)
	{
		return category + "." + path;
	}
}
