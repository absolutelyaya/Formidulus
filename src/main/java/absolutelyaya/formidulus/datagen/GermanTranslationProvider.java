package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.item.DeerSkullItem;
import absolutelyaya.formidulus.item.JollyHatItem;
import absolutelyaya.formidulus.item.abilities.ItemAbilities;
import absolutelyaya.formidulus.realtime.TimedEvent;
import absolutelyaya.formidulus.registries.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static absolutelyaya.formidulus.datagen.BaseTranslationProvider.*;

public class GermanTranslationProvider extends FabricLanguageProvider implements Lang
{
	static final Map<String, String> colors = new HashMap<>()
	{{
		put("white", "Weiß");
		put("light_gray", "Hellgrau");
		put("gray", "Grau");
		put("black", "Schwarz");
		put("purple", "Lila");
		put("magenta", "Magenta");
		put("blue", "Blau");
		put("light_blue", "Hellblau");
		put("cyan", "Türkis");
		put("green", "Grün");
		put("lime", "Hellgrün");
		put("yellow", "Gelb");
		put("orange", "Orange");
		put("brown", "Braun");
		put("red", "Rot");
		put("pink", "Rosa");
	}};
	
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
		builder.add(lore(ItemRegistry.DEER_SKULL, 0), "Der Schädel eines schrecklichen Skelettbiests,");
		builder.add(lore(ItemRegistry.DEER_SKULL, 1), "in dessen Stirn ein drittes Auge geschnitzt wurde.");
		builder.add(lore(ItemRegistry.DEER_SKULL, 2), "Zudem ist er in seltsamen Mustern mit Blut bemalt.");
		builder.add(lore(ItemRegistry.DEER_SKULL, 3), " ");
		builder.add(lore(ItemRegistry.DEER_SKULL, 4), "Es war als würde es mit uns reden..");
		builder.add(lore(ItemRegistry.DEER_SKULL, 5), "..aber wir konnten nichts verstehen.");
		builder.add(ACCESSORY_MODE_PREFIX, "Accessoire Modus: %s");
		builder.add(genericKey("item.accessory_mode", "default"), "Standard");
		builder.add(genericKey("item.accessory_mode", DeerSkullItem.ACCESSORY_MODE_CAP), "Kappe");
		builder.add(genericKey("item.accessory_mode", DeerSkullItem.ACCESSORY_MODE_MASK), "Maske");
		builder.add(ACCESSORY_MODE_HINT, "[Rechtsklick zum Modus wechseln]");
		builder.add(ItemRegistry.SACRIFICIAL_DAGGER, "Opferdolch");
		builder.add(lore(ItemRegistry.SACRIFICIAL_DAGGER, 0), "Der Dolch eines Kultisten.");
		builder.add(lore(ItemRegistry.SACRIFICIAL_DAGGER, 1), "Zuvor wurde er benutzt um Blutopfer zu erbringen.");
		builder.add(ItemRegistry.SOUL_DAGGER, "Seelendolch");
		builder.add(lore(ItemRegistry.SOUL_DAGGER, 0), "Eine bessere Version der Dolche die diese Kultisten mit sich tragen.");
		builder.add(lore(ItemRegistry.SOUL_DAGGER, 1), "Anstelle von dem Körper, blutet dieser Dolch direkt die Seele aus.");
		builder.add(ItemRegistry.EYES_BANNER_PATTERN, "Bannervorlage");
		builder.add(desc(ItemRegistry.EYES_BANNER_PATTERN), "Augen");
		builder.add(ItemRegistry.DEER_PHASE1_MUSIC_DISC, "Schallplatte");
		builder.add(ItemRegistry.DEER_PHASE2_MUSIC_DISC, "Schallplatte");
		builder.add(ItemRegistry.CULTIST_SPAWN_EGG, "Kultisten-Spawn-Ei");
		builder.add(ItemRegistry.CRUOR_SPAWN_EGG, "Hirsch-Spawn-Ei");
		builder.add(ItemRegistry.DEER_NECKLACE, "Seltsame Halskette");
		builder.add(lore(ItemRegistry.DEER_NECKLACE, 0), "Die Halskette eines Hochrangigen Kultisten.");
		builder.add(ItemRegistry.CHAINLINK, "Kettenglied");
		builder.add(ItemRegistry.JOLLY_HAT, "Festliche Mütze");
		builder.add(accessory(JollyHatItem.ACCESSORY_MODE_INACTIVE), "Inaktiv");
		builder.add(accessory(JollyHatItem.ACCESSORY_MODE_ACTIVE), "Aktiv");
		
		builder.add(Lang.NOT_YET_IMPLEMENTED, "NOCH NICHT IMPLEMENTIERT");
		builder.add(Lang.DEPENDENCY_INFO_REQUIRED, "Scheint nutzlos zu sein ohne '%s'...");
		builder.add(Lang.DEPENDENCY_INFO_ENHANCEMENT, "Scheint so als würde '%s' sein wahres potential offenbaren...");
		
		builder.add(Lang.MUSIC_DEER_PHASE1, "Efefski - Weisendes Licht");
		builder.add(Lang.MUSIC_DEER_PHASE2, "Efefski - Laufendes Blut");
		
		builder.add(ItemAbilities.NONE.getTranslationKey(), "mangelhaft");
		builder.add(ItemAbilities.VAMPIRISM.getTranslationKey(), "- VAMPIRISMUS -");
		builder.add(desc(ItemAbilities.VAMPIRISM, 0), "Das Verletzen anderer heilt den Nutzer.");
		builder.add(ItemAbilities.SOULSTEAL.getTranslationKey(), "- SEELEN BRECHER -");
		builder.add(desc(ItemAbilities.SOULSTEAL, 0), "Splittere kleine Teile der Seele deines Feindes ab;");
		builder.add(desc(ItemAbilities.SOULSTEAL, 1), "Der Konsum jener heilt den Nutzer.");
		builder.add(desc(ItemAbilities.SOULSTEAL, 2), "+2 §bSeelen§r Schaden; §6ignoriert Rüstung§r.");
		builder.add(ItemAbilities.HEALWAVE.getTranslationKey(), "+ HEILUNGSWELLE +");
		builder.add(desc(ItemAbilities.HEALWAVE, 0), "Benutze dies um eine Heilungswelle abzugeben.");
		builder.add(desc(ItemAbilities.HEALWAVE, 1), "Gibt nicht-gegnerischen Wesen um dich herum Regeneration.");
		
		builder.add(BlockRegistry.WEEN, "Ween");
		builder.add(BlockRegistry.WEEN.getTranslationKey() + ".lore", "es ist ween");
		registerWithColorVariants(builder, modKey("block", "banner.eyes"), "Augen", colors, false);
		builder.add(BlockRegistry.BOSS_SPAWNER, "Boss Spawner");
		builder.add(BlockRegistry.GREAT_LANTERN, "Große Laterne");
		builder.add(lore(ItemRegistry.GREAT_LANTERN, 0), "Eine riesige Metall Lanterne mit kunstvollen Gravierungen.");
		builder.add(lore(ItemRegistry.GREAT_LANTERN, 1), "Lädt sich langsam auf während sie platziert ist.");
		builder.add(lore(ItemRegistry.GREAT_LANTERN, 2), "");
		builder.add(lore(ItemRegistry.GREAT_LANTERN, 3), "Wenn ich doch nur die Fähigkeit hätte Leben zu erschaffen...");
		builder.add(lore(ItemRegistry.GREAT_LANTERN, 4), "Dann müsste ich mich nicht darauf verlassen dass die Natur sie für mich auflädt.");
		
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
		
		builder.add(MAP_CULT_HIDEOUT, "Kultisten Versteck Karte");
		
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
		
		builder.add(EVENT_INFO_PAST, "%1$s war vor %2$s Tagen.");
		builder.add(EVENT_INFO_PRESENT, "Heute ist %s!");
		builder.add(EVENT_INFO_FUTURE, "%1$s ist in %2$s Tagen.");
		builder.add(EVENT_INFO_ACTIVE_SUFFIX, " (aktiv)");
		builder.add(TimedEvent.WEEN.getTitleKey(), "Ween");
		builder.add(TimedEvent.WEEN.getDescriptionKey(), "Ein Fest an dem schaurige Geister und Ghule gefeiert werden; der ganze Monat in dem es stattfindet, ist in manchen Kreisen als 'Spooky Month' bekannt.");
		builder.add(TimedEvent.SOLSTICE_FESTIVAL.getTitleKey(), "Fest der Sonnenwende");
		builder.add(TimedEvent.SOLSTICE_FESTIVAL.getDescriptionKey(), "In einer schonungslosen Welt wie dieser, ist es wichtig Hoffnung aufrecht zu erhalten. In den Tiefen des Winters, wo die Tage kurz, Nächte lang und eine Regionen beinahe unbewohnbar sind, wird die Sonnenwende gefeiert; denn wir haben die härtesten Herausforderungen dieses Winters bereits überstanden.");
		
		
		String cultistMendingChance = Formidulus.config.cultistMendingChance.getTranslationKey(Formidulus.MOD_ID);
		String deerWarning = Formidulus.config.deerWarning.getTranslationKey(Formidulus.MOD_ID);
		String fightCheckInterval = Formidulus.config.fightCheckInterval.getTranslationKey(Formidulus.MOD_ID);
		String jollyChance = Formidulus.config.jollyChance.getTranslationKey(Formidulus.MOD_ID);
		
		builder.add(SCREEN_CONFIG_TITLE, "Formidulus Server Einstellungen");
		builder.add(cultistMendingChance, "Kultist Reperatur Chance");
		builder.add(cultistMendingChance + ".description",
				"Die Wahrscheinlichkeit dass ein Buch eines Kultisten mit Reperatur verzaubert ist; " +
						"ACHTUNG: Die Wahrscheinlichkeit dass sie überhaupt ein Verzaubertes Buch tragen, ist an sich schon ziemlich gering.");
		builder.add(deerWarning, "Hirsch Warnung");
		builder.add(deerWarning + ".description",
				"Ob Spieler mit weniger als 20 Rüstung gewarnt werden sollten wenn sie in der Nähe von Cruor in seinem Ruhezustand sind.");
		builder.add(fightCheckInterval, "Bosskampf Check Intervall");
		builder.add(fightCheckInterval + ".description",
				"Der Intervall zwischen den checks die ein Boss Spawner ausführt um zu testen ob sein Kampf läuft, oder ein Lebender Boss zu ihm gehört.");
		builder.add(jollyChance, "Festliche Mob Chance");
		builder.add(jollyChance + ".description",
				"Die Wahrscheinlichkeit dass 'Festliche Mobs' die Festliche Mützen tragen im Rahmen des Fests zur Sonnenwende spawnen (24er Dez).");
		
		
		builder.add(subtitle(SoundRegistry.ACCESSORY_CHANGE_MODE), "Accessoire modus geändert");
		
		builder.add(subtitle(SoundRegistry.WEEN), "es ist ween :D");
		builder.add(subtitle(SoundRegistry.BIG_LANTERN_HEALWAVE), "Laterne gibt Heilwelle ab");
		
		builder.add(subtitle(SoundRegistry.DEER_STEP_LANTERN), "Kette rasselt");
		builder.add(subtitle(SoundRegistry.DEER_HURT), "Hirsch nimmt Schaden");
		builder.add(subtitle(SoundRegistry.DEER_SWING), "Großer Schwung");
		builder.add(subtitle(SoundRegistry.DEER_LANTERN_IMPACT), "Laterne trifft den Boden");
		builder.add(subtitle(SoundRegistry.DEER_LANTERN_BREAK), "Laterne Zerbricht");
		builder.add(subtitle(SoundRegistry.DEER_LANTERN_CRUSH), "Laterne wird Zersört");
		builder.add(subtitle(SoundRegistry.DEER_SCORCH), "Sengende Flammen");
		builder.add(subtitle(SoundRegistry.DEER_SUMMON_CULTIST), "Kultist wird beschworen");
		builder.add(subtitle(SoundRegistry.DEER_VANISH), "Hirsch verschwindet");
		builder.add(subtitle(SoundRegistry.DEER_PREPARE_TELEPORT), "Hirsch bereitet Teleportation vor");
		builder.add(subtitle(SoundRegistry.DEER_PERFORM_TELEPORT), "Hirsch teleportiert sich");
		builder.add(subtitle(SoundRegistry.DEER_SUMMON_BLOOD), "Blut wird beschworen");
		builder.add(subtitle(SoundRegistry.DEER_BUBBLING), "Blut blubbert");
		builder.add(subtitle(SoundRegistry.DEER_SHAPE_FLESH), "Fleisch wird geformt");
		builder.add(subtitle(SoundRegistry.DEER_ROAR), "Hirsch schreit");
		builder.add(subtitle(SoundRegistry.DEER_GRIND), "Hirsch schleift Krallen über den Boden");
		builder.add(subtitle(SoundRegistry.DEER_KNIFE), "Hirsch schneidet aufwärts");
		builder.add(subtitle(SoundRegistry.DEER_WALL_IMPACT), "Hirsch rennt in eine Wand");
		builder.add(subtitle(SoundRegistry.CULTIST_IDLE_FLIP_PAGE), "Kultist liest");
		builder.add(subtitle(SoundRegistry.CULTIST_IDLE_HUM), "Kultist summt");
		builder.add(subtitle(SoundRegistry.CULTIST_MASK_BREAK), "Kultist Maske zerbricht");
		builder.add(subtitle(SoundRegistry.CULTIST_MASK_RESTORE), "Kultist Maske wird wiederhergestellt");
		builder.add(subtitle(SoundRegistry.CULTIST_WORSHIP_HEAL), "Kultist wird geheilt");
		builder.add(subtitle(SoundRegistry.CULTIST_MALE_HURT), "Kultist nimmt Schaden");
		builder.add(subtitle(SoundRegistry.CULTIST_MALE_DEATH), "Kultist stirbt");
		builder.add(subtitle(SoundRegistry.CULTIST_FEMALE_HURT), "Kultist nimmt Schaden");
		builder.add(subtitle(SoundRegistry.CULTIST_FEMALE_DEATH), "Kultist stirbt");
		builder.add(subtitle(SoundRegistry.IRRLICHT_IDLE), "Irrlicht knistert");
		builder.add(subtitle(SoundRegistry.IRRLICHT_DEATH), "Irrlicht wird gelöscht");
		builder.add(subtitle(SoundRegistry.PUMPKIN_IMPACT), "Explosiver Kürbis schlägt ein");
		
		builder.add(subtitle(SoundRegistry.LANTERN_DAMAGE), "Spieler wird von Laterne getroffen");
		builder.add(subtitle(SoundRegistry.CLAW_DAMAGE), "Spieler wird aufgeschlitzt");
	}
	
	public static void registerWithColorVariants(TranslationBuilder builder, String baseKey, String baseValue, Map<String, String> colors, boolean singular)
	{
		for (String c : colors.keySet())
		{
			String color = colors.get(c);
			if(c.equals("magenta"))
			{
				builder.add(String.format("%1$s.%2$s", baseKey, c), String.format("%1$s %2$s", colors.get(c), baseValue));
				continue;
			}
			if(color.endsWith("a"))
				color += "n";
			if(!color.endsWith("e"))
				color += "e";
			if(singular && color.endsWith("e"))
				color += "s";
			builder.add(String.format("%1$s.%2$s", baseKey, c), String.format("%1$s %2$s", color, baseValue));
		}
	}
}
