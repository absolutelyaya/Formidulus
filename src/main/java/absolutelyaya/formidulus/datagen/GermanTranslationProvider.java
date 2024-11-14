package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.Formidulus;
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
		builder.add(EntityRegistry.DEER_FOLLOWER, "Cruors Diener");
		builder.add(EntityRegistry.IRRLICHT, "Irrlicht");
		builder.add(EntityRegistry.PUMPKIN, "Explosiver Kürbis");
		
		builder.add(EXPANDABLE_LORE_HINT, "[Drücke Shift für mehr Infos]");
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
		builder.add(ACCESSORY_MODE_HINT, "[Rechtsklick zum Modus wechseln]");
		builder.add(ItemRegistry.SACRIFICIAL_DAGGER, "Opferdolch");
		builder.add(ItemRegistry.SACRIFICIAL_DAGGER.getTranslationKey() + ".lore0", "Der Dolch eines Kultisten.");
		builder.add(ItemRegistry.SACRIFICIAL_DAGGER.getTranslationKey() + ".lore1", "Zuvor wurde er benutzt um Blutopfer zu erbringen.");
		builder.add(ItemRegistry.SOUL_DAGGER, "Seelendolch");
		builder.add(ItemRegistry.SOUL_DAGGER.getTranslationKey() + ".lore0", "Eine bessere Version der Dolche die diese Kultisten mit sich tragen.");
		builder.add(ItemRegistry.SOUL_DAGGER.getTranslationKey() + ".lore1", "Anstelle von dem Körper, blutet dieser Dolch direkt die Seele aus.");
		builder.add(ItemRegistry.EYES_BANNER_PATTERN, "Bannervorlage");
		builder.add(ItemRegistry.EYES_BANNER_PATTERN.getTranslationKey() + ".desc", "Augen");
		builder.add(ItemRegistry.DEER_PHASE1_MUSIC_DISC, "Schallplatte");
		builder.add(ItemRegistry.DEER_PHASE2_MUSIC_DISC, "Schallplatte");
		builder.add(ItemRegistry.CULTIST_SPAWN_EGG, "Kultisten-Spawn-Ei");
		builder.add(ItemRegistry.CRUOR_SPAWN_EGG, "Reh-Spawn-Ei");
		
		builder.add(Lang.MUSIC_DEER_PHASE1, "Efefski - Weisendes Licht");
		builder.add(Lang.MUSIC_DEER_PHASE2, "Efefski - Laufendes Blut");
		
		builder.add(ItemAbilities.NONE.getTranslationKey(), "mangelhaft");
		builder.add(ItemAbilities.VAMPIRISM.getTranslationKey(), "- VAMPIRISMUS -");
		builder.add(ItemAbilities.VAMPIRISM.getTranslationKey() + ".desc0", "Das Verletzen anderer heilt den Nutzer.");
		builder.add(ItemAbilities.SOULSTEAL.getTranslationKey(), "- SEELEN BRECHER -");
		builder.add(ItemAbilities.SOULSTEAL.getTranslationKey() + ".desc0", "Schlage kleine Teile der Seele deines Feindes ab.");
		builder.add(ItemAbilities.SOULSTEAL.getTranslationKey() + ".desc1", "Der Konsum jener heilt den Nutzer erheblich.");
		builder.add(ItemAbilities.SOULSTEAL.getTranslationKey() + ".desc2", "+2 §bSeelen§r Schaden; §6ignoriert Rüstung§r.");
		
		builder.add(BlockRegistry.WEEN, "Ween");
		builder.add(BlockRegistry.WEEN.getTranslationKey() + ".lore", "es ist ween");
		builder.add("block.formidulus.banner.eyes.black", "Schwarze Augen");
		builder.add("block.formidulus.banner.eyes.blue", "Blaue Augen");
		builder.add("block.formidulus.banner.eyes.brown", "Braune Augen");
		builder.add("block.formidulus.banner.eyes.cyan", "Türkise Augen");
		builder.add("block.formidulus.banner.eyes.gray", "Graue Augen");
		builder.add("block.formidulus.banner.eyes.green", "Grüne Augen");
		builder.add("block.formidulus.banner.eyes.light_blue", "Hellblaue Augen");
		builder.add("block.formidulus.banner.eyes.light_gray", "Hellgraue Augen");
		builder.add("block.formidulus.banner.eyes.lime", "Hellgrüne Augen");
		builder.add("block.formidulus.banner.eyes.magenta", "Magenta Augen");
		builder.add("block.formidulus.banner.eyes.orange", "Orange Augen");
		builder.add("block.formidulus.banner.eyes.pink", "Pinke Augen");
		builder.add("block.formidulus.banner.eyes.purple", "Lilane Augen");
		builder.add("block.formidulus.banner.eyes.red", "Rote Augen");
		builder.add("block.formidulus.banner.eyes.white", "Weiße Augen");
		builder.add("block.formidulus.banner.eyes.yellow", "Gelbe Augen");
		builder.add(BlockRegistry.BOSS_SPAWNER, "Boss Spawner");
		
		builder.add(ADVANCEMENT_ROOT_TITLE, "Formidulus");
		builder.add(ADVANCEMENT_ROOT_DESCRIPTION, "Unerzählte Legenden");
		builder.add(ADVANCEMENT_CULTISTS_TITLE, "Kultisten ? In §omeinem§r Computer ?");
		builder.add(ADVANCEMENT_CULTISTS_DESCRIPTION, "Es ist wahrscheinlicher als sie denken.");
		builder.add(ADVANCEMENT_DEER_TITLE, "Ein Licht im Dunkel");
		builder.add(ADVANCEMENT_DEER_DESCRIPTION, "Erschlage das Skelettbiest das der Kult verehrt.");
		builder.add(ADVANCEMENT_WEEN_TITLE, "es ist ween");
		builder.add(ADVANCEMENT_WEEN_DESCRIPTION, "ich hoffe du hast dich nicht zu sehr erschreckt-");
		
		builder.add(SCREEN_BOSS_SPAWNER_TITLE, "Boss Spawner Einstellungen");
		builder.add(SCREEN_BOSS_SPAWNER_BOSS_TYPE, "Boss Typ:");
		builder.add(SCREEN_BOSS_SPAWNER_RESPAWN_DELAY, "Respawn-Wartedauer:");
		builder.add(SCREEN_BOSS_SPAWNER_CLOSE, "Speichern und Schließen");
		
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
		
		builder.add("death.attack.trample", "%1$s stand in %2$s's Weg");
		builder.add("death.attack.trample.item", "%1$s stand in %2$s's Weg");
		builder.add("death.attack.trample.player", "%1s wurde zertrampelt bei dem Versuch %2$s zu entkommen");
		
		builder.add("death.attack.scorch", "%1$s wurde von %2$s kremiert");
		builder.add("death.attack.scorch.item", "%1s wurde von %2$s mittels %3$s kremiert");
		builder.add("death.attack.scorch.player", "%1s wurde kremiert bei dem Versuch %2$s zu entkommen");
		
		builder.add(StatusEffectRegistry.REVERENCE.value(), "Erzwungende Ehrfurcht");
		builder.add(StatusEffectRegistry.DARKNESS.value(), "Zermürbendes Dunkel");
		
		builder.add(MAP_CULT_HIDEOUT, "Kult Versteck Karte");
		
		builder.add(MESSAGE_DEER_WARNING + "0", "Dieser Ort gibt dir eine ganz böse Vorahnung.");
		builder.add(MESSAGE_DEER_WARNING + "1", "Es fühlt sich an als würde etwas dich nicht hier wollen.");
		builder.add(MESSAGE_DEER_WARNING + "2", "Du fühslt dich nicht bereit für.. was auch immer hier ist.");
		builder.add(MESSAGE_DEER_WARNING + "3", "Irgendwas stimmt hier nicht... Du solltest besser ausgerüstet wieder kommen.");
		builder.add(MESSAGE_OUT_OF_BOUNDS, "Außerhalb der Arena! Kampf wird verlassen in %s...");
		
		builder.add("dialogue.deer.intro1", "Wilderer.");
		builder.add("dialogue.deer.intro2", "Du der kam nur um Blut zu verschwenden,");
		builder.add("dialogue.deer.intro3", "bist hier nicht Willkommen.");
		builder.add("dialogue.deer.intro4", "Ich werde dir eine Lehre erteilen.");
		
		builder.add("dialogue.deer.projectile1", "Ah, du bevozugst Fernkampf ?");
		builder.add("dialogue.deer.projectile2", "Dann lass es Feuer regnen!");
		
		builder.add("dialogue.deer.phase-transition1", "Du kleines...");
		builder.add("dialogue.deer.phase-transition2", "Erde, Blute für mich!");
		builder.add("dialogue.deer.phase-transition3", "Aus Blut mach Fleisch..");
		builder.add("dialogue.deer.phase-transition4", "Schärfe Knochen zu Messern-");
		builder.add("dialogue.deer.phase-transition5", "Ich kann dich nicht länger dulden.");
		
		builder.add("dialogue.deer.player-death1", "Kehre niemals zurück.");
		
		builder.add("dialogue.deer.death1", "GENUG!");
		builder.add("dialogue.deer.death2", "Dieser Körper ist zu gebrechlich.");
		builder.add("dialogue.deer.death3", "Gut aussehend, aber nicht zum kämpfen gemacht.");
		builder.add("dialogue.deer.death4", "Sobald ich etwas geeigneteres finde,");
		builder.add("dialogue.deer.death5", "werde ich dich vernichten.");
		
		builder.add("dialogue.deer.what", "Have you no Maidens ?"); //not gonna translate this meme
		
		
		String cultistMendingChance = Formidulus.config.cultistMendingChance.getTranslationKey(Formidulus.MOD_ID);
		String deerWarning = Formidulus.config.deerWarning.getTranslationKey(Formidulus.MOD_ID);
		String fightCheckInterval = Formidulus.config.fightCheckInterval.getTranslationKey(Formidulus.MOD_ID);
		
		builder.add(SCREEN_CONFIG_TITLE, "Formidulus Server Einstellungen");
		builder.add(cultistMendingChance, "Cultist Reperatur Chance");
		builder.add(cultistMendingChance + ".description",
				"Die Wahrscheinlichkeit dass ein Buch eines Kultisten mit Reperatur verzaubert ist; " +
						"ACHTUNG: Die Wahrscheinlichkeit dass sie überhaupt ein Verzaubertes Buch tragen, ist an sich schon ziemlich gering.");
		builder.add(deerWarning, "Hirsch Warnung");
		builder.add(deerWarning + ".description",
				"Ob Spieler mit weniger als 20 Rüstung gewarnt werden sollten wenn sie in der Nähe von Cruor in seinem Ruhezustand sind.");
		builder.add(fightCheckInterval, "Bosskampf Check Intervall");
		builder.add(fightCheckInterval + ".description",
				"Der Intervall zwischen den checks die ein Boss Spawner ausführt um zu testen ob sein Kampf läuft, oder ein Lebender Boss zu ihm gehört.");
	}
}
