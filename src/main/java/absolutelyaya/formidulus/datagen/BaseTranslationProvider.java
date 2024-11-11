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
		builder.add(EntityRegistry.DEER_FOLLOWER, "Servant of Cruor");
		builder.add(EntityRegistry.IRRLICHT, "Irrlicht");
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
		builder.add(ACCESSORY_MODE_HINT, "[Right Click to cycle]");
		builder.add(ItemRegistry.SACRIFICIAL_DAGGER, "Sacrificial Dagger");
		builder.add(ItemRegistry.SACRIFICIAL_DAGGER.getTranslationKey() + ".lore0", "The Dagger of a Cultist.");
		builder.add(ItemRegistry.SACRIFICIAL_DAGGER.getTranslationKey() + ".lore1", "Previously used to make Blood Sacrifices.");
		builder.add(ItemRegistry.SOUL_DAGGER, "Soul Dagger");
		builder.add(ItemRegistry.SOUL_DAGGER.getTranslationKey() + ".lore0", "A superior version of those Daggers the Cultists carry.");
		builder.add(ItemRegistry.SOUL_DAGGER.getTranslationKey() + ".lore1", "Instead of the Body, it leeches directly off of the soul.");
		builder.add(ItemRegistry.EYES_BANNER_PATTERN, "Banner Pattern");
		builder.add(ItemRegistry.EYES_BANNER_PATTERN.getTranslationKey() + ".desc", "Eyes");
		builder.add(ItemRegistry.DEER_PHASE1_MUSIC_DISC, "Music Disc");
		builder.add(ItemRegistry.DEER_PHASE2_MUSIC_DISC, "Music Disc");
		builder.add(ItemRegistry.CULTIST_SPAWN_EGG, "Cultist Spawn Egg");
		builder.add(ItemRegistry.CRUOR_SPAWN_EGG, "Deer Spawn Egg");
		
		builder.add(Lang.MUSIC_DEER_PHASE1, "Efefski - Guiding Light");
		builder.add(Lang.MUSIC_DEER_PHASE2, "Efefski - Running Blood");
		
		builder.add(ItemAbilities.NONE.getTranslationKey(), "faulty");
		builder.add(ItemAbilities.VAMPIRISM.getTranslationKey(), "- VAMPIRISM -");
		builder.add(ItemAbilities.VAMPIRISM.getTranslationKey() + ".desc0", "Harming others replenishes Health.");
		builder.add(ItemAbilities.SOULSTEAL.getTranslationKey(), "- SOUL STEAL -");
		builder.add(ItemAbilities.SOULSTEAL.getTranslationKey() + ".desc0", "Harm others to chip pieces off of their Soul.");
		builder.add(ItemAbilities.SOULSTEAL.getTranslationKey() + ".desc1", "Consuming them replenishes high amounts of Health.");
		builder.add(ItemAbilities.SOULSTEAL.getTranslationKey() + ".desc2", "+2 §bsoulsteal§r damage; §6ignores Armor§r.");
		
		builder.add(BlockRegistry.WEEN, "Ween");
		builder.add(BlockRegistry.WEEN.getTranslationKey() + ".lore", "it's ween");
		builder.add("block.formidulus.banner.eyes.black", "Black Eyes");
		builder.add("block.formidulus.banner.eyes.blue", "Blue Eyes");
		builder.add("block.formidulus.banner.eyes.brown", "Brown Eyes");
		builder.add("block.formidulus.banner.eyes.cyan", "Cyan Eyes");
		builder.add("block.formidulus.banner.eyes.gray", "Gray Eyes");
		builder.add("block.formidulus.banner.eyes.green", "Green Eyes");
		builder.add("block.formidulus.banner.eyes.light_blue", "Light Blue Eyes");
		builder.add("block.formidulus.banner.eyes.light_gray", "Light Gray Eyes");
		builder.add("block.formidulus.banner.eyes.lime", "Lime Eyes");
		builder.add("block.formidulus.banner.eyes.magenta", "Magenta Eyes");
		builder.add("block.formidulus.banner.eyes.orange", "Orange Eyes");
		builder.add("block.formidulus.banner.eyes.pink", "Pink Eyes");
		builder.add("block.formidulus.banner.eyes.purple", "Purple Eyes");
		builder.add("block.formidulus.banner.eyes.red", "Red Eyes");
		builder.add("block.formidulus.banner.eyes.white", "White Eyes");
		builder.add("block.formidulus.banner.eyes.yellow", "Yellow Eyes");
		builder.add(BlockRegistry.BOSS_SPAWNER, "Boss Spawner");
		
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
		builder.add("dialogue.deer.death3", "Good looking; but not fit for battle.");
		builder.add("dialogue.deer.death4", "Once I find something more suitable,");
		builder.add("dialogue.deer.death5", "I shall destroy you.");
		
		builder.add("dialogue.deer.what", "Have you no Maidens ?");
		
		
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
