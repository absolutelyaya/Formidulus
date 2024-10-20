package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.item.DeerSkullItem;
import absolutelyaya.formidulus.item.abilities.ItemAbilities;
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
		builder.add(ItemRegistry.SACRIFICIAL_DAGGER, "Opferdolch");
		builder.add(ItemRegistry.SACRIFICIAL_DAGGER.getTranslationKey() + ".lore0", "Der Dolch eines Kultisten.");
		builder.add(ItemRegistry.SACRIFICIAL_DAGGER.getTranslationKey() + ".lore1", "Zuvor wurde er benutzt um Blutopfer zu erbringen.");
		builder.add(ItemRegistry.SOUL_DAGGER, "Seelendolch");
		builder.add(ItemRegistry.SOUL_DAGGER.getTranslationKey() + ".lore0", "Eine bessere Version der Dolche die diese Kultisten mit sich tragen.");
		builder.add(ItemRegistry.SOUL_DAGGER.getTranslationKey() + ".lore1", "Anstelle von dem Körper, blutet dieser Dolch direkt die Seele aus.");
		
		builder.add(ItemAbilities.NONE.getTranslationKey(), "langweilig");
		builder.add(ItemAbilities.VAMPIRISM.getTranslationKey(), "- VAMPIRISMUS -");
		builder.add(ItemAbilities.VAMPIRISM.getTranslationKey() + ".desc0", "Das Verletzen anderer heilt den Nutzer.");
		builder.add(ItemAbilities.SOULSTEAL.getTranslationKey(), "- SEELEN BRECHER -");
		builder.add(ItemAbilities.SOULSTEAL.getTranslationKey() + ".desc0", "Schlage kleine Teile der Seele deines Feindes ab.");
		builder.add(ItemAbilities.SOULSTEAL.getTranslationKey() + ".desc1", "Der Konsum jener heilt den Nutzer erheblich.");
		builder.add(ItemAbilities.SOULSTEAL.getTranslationKey() + ".desc2", "+2 §bSeelen Brecher§r Schaden; §6ignoriert Rüstung§r.");
		
		builder.add(BlockRegistry.WEEN, "Ween");
		builder.add(BlockRegistry.WEEN.getTranslationKey() + ".lore", "es ist ween");
		
		builder.add(ADVANCEMENT_ROOT_TITLE, "Absolute Spooky Month 24");
		builder.add(ADVANCEMENT_ROOT_DESCRIPTION, "es ist ween");
		builder.add(ADVANCEMENT_CULTISTS_TITLE, "Kultisten ? In §omeinem§r Computer ?");
		builder.add(ADVANCEMENT_CULTISTS_DESCRIPTION, "Es ist wahrscheinlicher als sie denken.");
		builder.add(ADVANCEMENT_DEER_TITLE, "Ein Licht in der Dunkelheit");
		builder.add(ADVANCEMENT_DEER_DESCRIPTION, "Erschlage das Skelettbiest das der Kult verehrt.");
		builder.add(ADVANCEMENT_WEEN_TITLE, "es ist ween");
		builder.add(ADVANCEMENT_WEEN_DESCRIPTION, "ich hoffe du hast dich nicht zu sehr erschreckt-");
		
		builder.add("death.attack.lantern", "%1$s wurde von %2$s ins Licht geführt");
		builder.add("death.attack.lantern.item", "%1$s wurde von %2$s mittels %3$s ins Licht geführt");
		builder.add("death.attack.lantern.player", "%1s wurde ins Licht geführt, während eines Kampfes mit %2$s");
		
		builder.add("death.attack.claw", "%1$s wurde von %2$s zerrissen");
		builder.add("death.attack.claw.item", "%1s wurde von %2$s mit %3$s zerrissen");
		builder.add("death.attack.claw.player", "%1s wurde zerrissen beim Versuch %2$s zu entkommen");
		
		builder.add("death.attack.sacrifice", "%1$s wurde von %2$s geopfert");
		builder.add("death.attack.sacrifice.item", "%1s wurde von %2$s mit %3$s geopfert");
		builder.add("death.attack.sacrifice.player", "%1s wurde geopfert beim Versuch %2$s zu entkommen");
		
		builder.add("death.attack.soulsteal", "%1$ss Seele wurde von %2$s verschlungen");
		builder.add("death.attack.soulsteal.item", "%1ss Seele wurde von %2$s verschlungen, mit hilfe von %3$s");
		builder.add("death.attack.soulsteal.player", "%1ss Seele wurde verschlungen bei dem Versuch %2$s zu entkommen");
		
		builder.add(StatusEffectRegistry.REVERENCE.value(), "Erzwungende Ehrfurcht");
		builder.add(StatusEffectRegistry.DARKNESS.value(), "Drückende Dunkelheit");
		
		
		builder.add("dialogue.deer.intro1", "Wilderer.");
		builder.add("dialogue.deer.intro2", "Du der kam nur um Blut zu vergießen,");
		builder.add("dialogue.deer.intro3", "bist hier nicht Willkommen.");
		builder.add("dialogue.deer.intro4", "Ich werde dir eine Lehre erteilen.");
		
		builder.add("dialogue.deer.projectile1", "Ah, du bevozugst Vernkampf ?");
		builder.add("dialogue.deer.projectile2", "Dann lass es Feuer regnen!");
		
		builder.add("dialogue.deer.phase-transition1", "Du kleines...");
		builder.add("dialogue.deer.phase-transition2", "Erde, Blute für mich!");
		builder.add("dialogue.deer.phase-transition3", "Aus Blut mach Fleisch;");
		builder.add("dialogue.deer.phase-transition4", "schärfe Knochen zu Messern-");
		builder.add("dialogue.deer.phase-transition5", "Ich werde dich nicht länger dulden.");
		
		builder.add("dialogue.deer.player-death1", "Kehre niemals zurück.");
		
		builder.add("dialogue.deer.death1", "GENUG!");
		builder.add("dialogue.deer.death2", "Dieser Körper ist zu gebrechlich.");
		builder.add("dialogue.deer.death3", "Gut aussehend; aber nicht zum kämpfen gemacht.");
		builder.add("dialogue.deer.death4", "Sobald ich etwas geeigneteres finde,");
		builder.add("dialogue.deer.death5", "werde ich dich vernichten.");
		
		builder.add("dialogue.deer.what", "Have you no Maidens ?");
	}
}
