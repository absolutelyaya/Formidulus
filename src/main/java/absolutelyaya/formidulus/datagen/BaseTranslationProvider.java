package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.item.DeerSkullItem;
import absolutelyaya.formidulus.item.JollyHatItem;
import absolutelyaya.formidulus.item.abilities.ItemAbilities;
import absolutelyaya.formidulus.item.abilities.ItemAbility;
import absolutelyaya.formidulus.realtime.TimedEvent;
import absolutelyaya.formidulus.registries.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.sound.SoundEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class BaseTranslationProvider extends FabricLanguageProvider implements Lang
{
	static final Map<String, String> colors = new HashMap<>()
	{{
		put("white", "White");
		put("light_gray", "Light Gray");
		put("gray", "Gray");
		put("black", "Black");
		put("purple", "Purple");
		put("magenta", "Magenta");
		put("blue", "Blue");
		put("light_blue", "Light Blue");
		put("cyan", "Cyan");
		put("green", "Green");
		put("lime", "Lime");
		put("yellow", "Yellow");
		put("orange", "Orange");
		put("brown", "Brown");
		put("red", "Red");
		put("pink", "Pink");
	}};
	
	protected BaseTranslationProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
	{
		super(dataOutput, registryLookup);
	}
	
	@Override
	public void generateTranslations(RegistryWrapper.WrapperLookup registry, TranslationBuilder builder)
	{
		builder.add(EntityRegistry.DEER_GOD, "Cervus Cruoris");
		builder.add(EntityRegistry.DEER_FOLLOWER, "Servant of Cruor");
		builder.add(EntityRegistry.IRRLICHT, "Irrlicht");
		builder.add(EntityRegistry.PUMPKIN, "Volatile Pumpkin");
		
		builder.add(EXPANDABLE_LORE_HINT, "[Press Shift for more Info]");
		builder.add(ItemRegistry.DEER_SKULL, "Deer Skull");
		builder.add(lore(ItemRegistry.DEER_SKULL, 0), "The Skull of a horrid Skeletal Beast.");
		builder.add(lore(ItemRegistry.DEER_SKULL, 1), "A third eye was carved into its forehead.");
		builder.add(lore(ItemRegistry.DEER_SKULL, 2), "There's also strange patterns painted onto it using blood.");
		builder.add(lore(ItemRegistry.DEER_SKULL, 3), " ");
		builder.add(lore(ItemRegistry.DEER_SKULL, 4), "It was as though it spoke to us..");
		builder.add(lore(ItemRegistry.DEER_SKULL, 5), "..but we couldn't comprehend it.");
		builder.add(ACCESSORY_MODE_PREFIX, "Accessory Mode: %s");
		builder.add(genericKey("item.accessory_mode", "default"), "Default");
		builder.add(genericKey("item.accessory_mode", DeerSkullItem.ACCESSORY_MODE_CAP), "Cap");
		builder.add(genericKey("item.accessory_mode", DeerSkullItem.ACCESSORY_MODE_MASK), "Mask");
		builder.add(ACCESSORY_MODE_HINT, "[Right Click to cycle]");
		builder.add(ItemRegistry.SACRIFICIAL_DAGGER, "Sacrificial Dagger");
		builder.add(lore(ItemRegistry.SACRIFICIAL_DAGGER, 0), "The Dagger of a Cultist.");
		builder.add(lore(ItemRegistry.SACRIFICIAL_DAGGER, 1), "Previously used to make Blood Sacrifices.");
		builder.add(ItemRegistry.SOUL_DAGGER, "Soul Dagger");
		builder.add(lore(ItemRegistry.SOUL_DAGGER, 0), "A superior version of those Daggers the Cultists carry.");
		builder.add(lore(ItemRegistry.SOUL_DAGGER, 1), "Instead of the Body, it leeches directly off of the soul.");
		builder.add(ItemRegistry.EYES_BANNER_PATTERN, "Banner Pattern");
		builder.add(desc(ItemRegistry.EYES_BANNER_PATTERN), "Eyes");
		builder.add(ItemRegistry.DEER_PHASE1_MUSIC_DISC, "Music Disc");
		builder.add(ItemRegistry.DEER_PHASE2_MUSIC_DISC, "Music Disc");
		builder.add(ItemRegistry.CULTIST_SPAWN_EGG, "Cultist Spawn Egg");
		builder.add(ItemRegistry.CRUOR_SPAWN_EGG, "Deer Spawn Egg");
		builder.add(ItemRegistry.DEER_NECKLACE, "Strange Necklace");
		builder.add(lore(ItemRegistry.DEER_NECKLACE, 0), "The Necklace of a High Ranking Cultist.");
		builder.add(ItemRegistry.CHAINLINK, "Chain Link");
		builder.add(ItemRegistry.JOLLY_HAT, "Jolly Hat");
		builder.add(accessory(JollyHatItem.ACCESSORY_MODE_INACTIVE), "Inactive");
		builder.add(accessory(JollyHatItem.ACCESSORY_MODE_ACTIVE), "Active");
		
		builder.add(Lang.NOT_YET_IMPLEMENTED, "NOT YET IMPLEMENTED");
		builder.add(Lang.DEPENDENCY_INFO_REQUIRED, "Seems useless without '%s'...");
		builder.add(Lang.DEPENDENCY_INFO_ENHANCEMENT, "Seems like '%s' could unlock its true potential...");
		
		builder.add(Lang.MUSIC_DEER_PHASE1, "Efefski - Guiding Light");
		builder.add(Lang.MUSIC_DEER_PHASE2, "Efefski - Running Blood");
		
		builder.add(ItemAbilities.NONE.getTranslationKey(), "faulty");
		builder.add(ItemAbilities.VAMPIRISM.getTranslationKey(), "- VAMPIRISM -");
		builder.add(desc(ItemAbilities.VAMPIRISM, 0), "Harming others replenishes Health.");
		builder.add(ItemAbilities.SOULSTEAL.getTranslationKey(), "- SOUL STEAL -");
		builder.add(desc(ItemAbilities.SOULSTEAL, 0), "Harm others to chip pieces off of their Soul;");
		builder.add(desc(ItemAbilities.SOULSTEAL, 1), "Consuming them replenishes Health.");
		builder.add(desc(ItemAbilities.SOULSTEAL, 2), "+2 §bSoul§r Damage; §6ignores Armor§r.");
		builder.add(ItemAbilities.HEALWAVE.getTranslationKey(), "+ HEALWAVE +");
		builder.add(desc(ItemAbilities.HEALWAVE, 0), "Use when fully charged to emit a Healwave.");
		builder.add(desc(ItemAbilities.HEALWAVE, 1), "Applies Regeneration to Non-Hostile Entities around you.");
		
		builder.add(BlockRegistry.WEEN, "Ween");
		builder.add(BlockRegistry.WEEN.getTranslationKey() + ".lore", "it's ween");
		registerWithColorVariants(builder, modKey("block", "banner.eyes"), "Eyes", colors);
		builder.add(BlockRegistry.BOSS_SPAWNER, "Boss Spawner");
		builder.add(BlockRegistry.GREAT_LANTERN, "Great Lantern");
		builder.add(lore(ItemRegistry.GREAT_LANTERN, 0), "A huge Metal Lantern with Ornate Engravings.");
		builder.add(lore(ItemRegistry.GREAT_LANTERN, 1), "Slowly recharges energy while placed down.");
		builder.add(lore(ItemRegistry.GREAT_LANTERN, 2), "");
		builder.add(lore(ItemRegistry.GREAT_LANTERN, 3), "If only I had the Ability to create life...");
		builder.add(lore(ItemRegistry.GREAT_LANTERN, 4), "Then I wouldn't need to rely on Nature to charge it for me.");
		
		builder.add(ADVANCEMENT_ROOT_TITLE, "Formidulus");
		builder.add(ADVANCEMENT_ROOT_DESCRIPTION, "Legends Untold");
		builder.add(ADVANCEMENT_CULTISTS_TITLE, "Cultists ? In §omy§r Computer ?");
		builder.add(ADVANCEMENT_CULTISTS_DESCRIPTION, "It's more likely than you think.");
		builder.add(ADVANCEMENT_DEER_TITLE, "A Light in the Darkness");
		builder.add(ADVANCEMENT_DEER_DESCRIPTION, "Slay the Skeletal Beast worshipped by the Cult.");
		builder.add(ADVANCEMENT_WEEN_TITLE, "it's ween");
		builder.add(ADVANCEMENT_WEEN_DESCRIPTION, "hope you didn't get scared too bad-");
		
		builder.add(SCREEN_BOSS_SPAWNER_TITLE, "Boss Spawner Settings");
		builder.add(SCREEN_BOSS_SPAWNER_BOSS_TYPE, "Boss Type:");
		builder.add(SCREEN_BOSS_SPAWNER_RESPAWN_DELAY, "Respawn Delay:");
		builder.add(SCREEN_BOSS_SPAWNER_CLOSE, "Save and Close");
		
		builder.add("death.attack.lantern", "%1$s was shown the Light by %2$s");
		builder.add("death.attack.lantern.item", "%1s was shown the Light by %2$s using %3$s");
		builder.add("death.attack.lantern.player", "%1s was shown the Light whilst fighting %2$s");
		
		builder.add("death.attack.claw", "%1$s was torn apart by %2$s");
		builder.add("death.attack.claw.item", "%1s was torn apart by %2$s using %3$s");
		builder.add("death.attack.claw.player", "%1s was torn apart trying to escape %2$s");
		
		builder.add("death.attack.sacrifice", "%1$s was sacrificed by %2$s");
		builder.add("death.attack.sacrifice.item", "%1s was sacrificed by %2$s using %3$s");
		builder.add("death.attack.sacrifice.player", "%1s was sacrificed trying to escape %2$s");
		
		builder.add("death.attack.soulsteal", "%1$s soul was consumed by %2$s");
		builder.add("death.attack.soulsteal.item", "%1s soul was consumed by %2$s using %3$s");
		builder.add("death.attack.soulsteal.player", "%1s soul was consumed trying to escape %2$s");
		
		builder.add("death.attack.trample", "%1$s stood in %2$s's way");
		builder.add("death.attack.trample.item", "%1$s stood in %2$s's way");
		builder.add("death.attack.trample.player", "%1s was trampled to death trying to escape %2$s");
		
		builder.add("death.attack.scorch", "%1$s was reduced to ashes by %2$s");
		builder.add("death.attack.scorch.item", "%1s was reduced to ashes by %2$s using %3$s");
		builder.add("death.attack.scorch.player", "%1s was reduced to ashes trying to escape %2$s");
		
		builder.add(StatusEffectRegistry.REVERENCE.value(), "Unwilling Reverence");
		builder.add(StatusEffectRegistry.DARKNESS.value(), "Encroaching Darkness");
		
		builder.add(MAP_CULT_HIDEOUT, "Cult Hideout Map");
		
		builder.add(MESSAGE_DEER_WARNING + "0", "You have a terrible feeling about this place.");
		builder.add(MESSAGE_DEER_WARNING + "1", "It feels as though something doesn't want you here.");
		builder.add(MESSAGE_DEER_WARNING + "2", "An evil presence lurks below... And you don't feel prepared to face it.");
		builder.add(MESSAGE_DEER_WARNING + "3", "Something feels off... you shouldn't be here yet.");
		builder.add(MESSAGE_OUT_OF_BOUNDS, "Out of Bounds! Leaving the Fight in %s...");
		
		builder.add("dialogue.deer.intro1", "Poacher.");
		builder.add("dialogue.deer.intro2", "You who came only to waste Blood,");
		builder.add("dialogue.deer.intro3", "are not welcome here.");
		builder.add("dialogue.deer.intro4", "I shall teach you manners.");
		
		builder.add("dialogue.deer.projectile1", "Ah, you prefer Ranged Combat ?");
		builder.add("dialogue.deer.projectile2", "Then let it rain Fire!");
		
		builder.add("dialogue.deer.phase-transition1", "You little...");
		builder.add("dialogue.deer.phase-transition2", "Earth, shed Blood for me!");
		builder.add("dialogue.deer.phase-transition3", "Turn Blood to Flesh..");
		builder.add("dialogue.deer.phase-transition4", "Sharpen Bones to Knifes-");
		builder.add("dialogue.deer.phase-transition5", "I am done playing nicely.");
		
		builder.add("dialogue.deer.player-death1", "Never return.");
		
		builder.add("dialogue.deer.death1", "ENOUGH!");
		builder.add("dialogue.deer.death2", "This Vessel is too fragile.");
		builder.add("dialogue.deer.death3", "Good looking, but not fit for battle.");
		builder.add("dialogue.deer.death4", "Once I find something more suitable,");
		builder.add("dialogue.deer.death5", "I shall destroy you.");
		
		builder.add("dialogue.deer.what", "Have you no Maidens ?");
		
		builder.add(EVENT_INFO_PAST, "%1$s was %2$s days ago.");
		builder.add(EVENT_INFO_PRESENT, "%s is today!");
		builder.add(EVENT_INFO_FUTURE, "%1$s is in %2$s days.");
		builder.add(EVENT_INFO_ACTIVE_SUFFIX, " (active)");
		builder.add(TimedEvent.WEEN.getTitleKey(), "Ween");
		builder.add(TimedEvent.WEEN.getDescriptionKey(), "A time where ghastly ghosts and ghouls are worshipped; the entire Month it takes place in is also known as 'Spooky Month' in some circles.");
		builder.add(TimedEvent.SOLSTICE_FESTIVAL.getTitleKey(), "Solstice Festival");
		builder.add(TimedEvent.SOLSTICE_FESTIVAL.getDescriptionKey(), "In a world as unforgiving as this, holding onto hope is important. In the depth of winter, when Days are short, Nights long and some regions near uninhabitable, the Solstice is celebrated; for we've passed the hardest challenges of Winter.");
		
		
		String cultistMendingChance = Formidulus.config.cultistMendingChance.getTranslationKey(Formidulus.MOD_ID);
		String deerWarning = Formidulus.config.deerWarning.getTranslationKey(Formidulus.MOD_ID);
		String fightCheckInterval = Formidulus.config.fightCheckInterval.getTranslationKey(Formidulus.MOD_ID);
		
		builder.add(SCREEN_CONFIG_TITLE, "Formidulus Server Config Screen");
		builder.add(cultistMendingChance, "Cultist Mending Chance");
		builder.add(cultistMendingChance + ".description",
				"How likely an enchanted book held by Cultists is to have Mending on it; " +
						"NOTE: the chance that they hold an enchanted book at all is pretty low already.");
		builder.add(deerWarning, "Deer Warning");
		builder.add(deerWarning + ".description",
				"Whether Players with less than 20 Armor should be warned when close to Cruor in its unsummoned state.");
		builder.add(fightCheckInterval, "Bossfight Check Interval");
		builder.add(fightCheckInterval + ".description",
				"The interval between checks a boss spawner performs to see if there's an active fight, or a spawned boss belonging to it.");
		
		
		builder.add(subtitle(SoundRegistry.ACCESSORY_CHANGE_MODE), "Accessory mode changed");
		
		builder.add(subtitle(SoundRegistry.WEEN), "its ween :D");
		builder.add(subtitle(SoundRegistry.BIG_LANTERN_HEALWAVE), "Lantern emits Healwave");
		
		builder.add(subtitle(SoundRegistry.DEER_STEP_LANTERN), "Chain rattles");
		builder.add(subtitle(SoundRegistry.DEER_HURT), "Deer hurts");
		builder.add(subtitle(SoundRegistry.DEER_SWING), "Heavy swing");
		builder.add(subtitle(SoundRegistry.DEER_LANTERN_IMPACT), "Lantern hits the ground");
		builder.add(subtitle(SoundRegistry.DEER_LANTERN_BREAK), "Lantern breaks");
		builder.add(subtitle(SoundRegistry.DEER_LANTERN_CRUSH), "Lantern gets crushed");
		builder.add(subtitle(SoundRegistry.DEER_SCORCH), "Scorching Flames");
		builder.add(subtitle(SoundRegistry.DEER_SUMMON_CULTIST), "Cultist is summoned");
		builder.add(subtitle(SoundRegistry.DEER_VANISH), "Deer Vanishes");
		builder.add(subtitle(SoundRegistry.DEER_PREPARE_TELEPORT), "Deer prepares teleport");
		builder.add(subtitle(SoundRegistry.DEER_PERFORM_TELEPORT), "Deer teleports");
		builder.add(subtitle(SoundRegistry.DEER_SUMMON_BLOOD), "Blood is summoned");
		builder.add(subtitle(SoundRegistry.DEER_BUBBLING), "Blood bubbles");
		builder.add(subtitle(SoundRegistry.DEER_SHAPE_FLESH), "Flesh is Shaped");
		builder.add(subtitle(SoundRegistry.DEER_ROAR), "Deer screams");
		builder.add(subtitle(SoundRegistry.DEER_GRIND), "Deer grinds claw on ground");
		builder.add(subtitle(SoundRegistry.DEER_KNIFE), "Deer slashes upwards");
		builder.add(subtitle(SoundRegistry.DEER_WALL_IMPACT), "Deer runs into a wall");
		builder.add(subtitle(SoundRegistry.CULTIST_IDLE_FLIP_PAGE), "Cultist reads");
		builder.add(subtitle(SoundRegistry.CULTIST_IDLE_HUM), "Cultist hums");
		builder.add(subtitle(SoundRegistry.CULTIST_MASK_BREAK), "Cultist Mask breaks");
		builder.add(subtitle(SoundRegistry.CULTIST_MASK_RESTORE), "Cultist Mask is restored");
		builder.add(subtitle(SoundRegistry.CULTIST_WORSHIP_HEAL), "Cultist gets healed");
		builder.add(subtitle(SoundRegistry.CULTIST_MALE_HURT), "Cultist hurts");
		builder.add(subtitle(SoundRegistry.CULTIST_MALE_DEATH), "Cultist dies");
		builder.add(subtitle(SoundRegistry.CULTIST_FEMALE_HURT), "Cultist hurts");
		builder.add(subtitle(SoundRegistry.CULTIST_FEMALE_DEATH), "Cultist dies");
		builder.add(subtitle(SoundRegistry.IRRLICHT_IDLE), "Irrlicht crackles");
		builder.add(subtitle(SoundRegistry.IRRLICHT_DEATH), "Irrlicht extinguished");
		builder.add(subtitle(SoundRegistry.PUMPKIN_IMPACT), "Volatile Pumpkin impact");
		
		builder.add(subtitle(SoundRegistry.LANTERN_DAMAGE), "Player gets hit by Lantern");
		builder.add(subtitle(SoundRegistry.CLAW_DAMAGE), "Player gets slashed");
	}
	
	public static String modKey(String category, String path)
	{
		return category + "." + Formidulus.MOD_ID + "." + path;
	}
	
	public static String genericKey(String category, String path)
	{
		return category + "." + path;
	}
	
	public static String subtitle(SoundEvent sound)
	{
		return "subtitles." + sound.getId().getNamespace() + "." + sound.getId().getPath();
	}
	
	public static String lore(Item item, int line)
	{
		return item.getTranslationKey() + ".lore" + line;
	}
	
	public static String desc(Item item)
	{
		return item.getTranslationKey() + ".desc";
	}
	
	public static String desc(ItemAbility item, int line)
	{
		return item.getTranslationKey() + ".desc" + line;
	}
	
	public static void registerWithColorVariants(TranslationBuilder builder, String baseKey, String baseValue, Map<String, String> colors)
	{
		for (String color : colors.keySet())
			builder.add(String.format("%1$s.%2$s", baseKey, color), String.format("%1$s %2$s", colors.get(color), baseValue));
	}
	
	public static String accessory(String mode)
	{
		return genericKey("item.accessory_mode", mode);
	}
}
