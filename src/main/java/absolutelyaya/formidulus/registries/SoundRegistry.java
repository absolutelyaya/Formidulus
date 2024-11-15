package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class SoundRegistry
{
	public static final SoundEvent ACCESSORY_CHANGE_MODE = register(Formidulus.identifier("item.accessory.change_mode"));
	
	public static final SoundEvent WEEN = register(Formidulus.identifier("ween"));
	
	public static final SoundEvent DEER_STEP_LANTERN = register(Formidulus.identifier("entity.deer.step.lantern"));
	public static final SoundEvent DEER_HURT = register(Formidulus.identifier("entity.deer.hurt"));
	public static final SoundEvent DEER_SWING = register(Formidulus.identifier("entity.deer.swing"));
	public static final SoundEvent DEER_LANTERN_IMPACT = register(Formidulus.identifier("entity.deer.lantern.impact"));
	public static final SoundEvent DEER_LANTERN_BREAK = register(Formidulus.identifier("entity.deer.lantern.break"));
	public static final SoundEvent DEER_LANTERN_CRUSH = register(Formidulus.identifier("entity.deer.lantern.crush"));
	public static final SoundEvent DEER_SCORCH = register(Formidulus.identifier("entity.deer.scorch"));
	public static final SoundEvent DEER_SUMMON_CULTIST = register(Formidulus.identifier("entity.deer.summon.cultist"));
	public static final SoundEvent DEER_VANISH = register(Formidulus.identifier("entity.deer.vanish"));
	public static final SoundEvent DEER_PREPARE_TELEPORT = register(Formidulus.identifier("entity.deer.teleport.prepare"));
	public static final SoundEvent DEER_PERFORM_TELEPORT = register(Formidulus.identifier("entity.deer.teleport.perform"));
	public static final SoundEvent DEER_SUMMON_BLOOD = register(Formidulus.identifier("entity.deer.summon.blood"));
	public static final SoundEvent DEER_BUBBLING = register(Formidulus.identifier("entity.deer.bubbling"));
	public static final SoundEvent DEER_SHAPE_FLESH = register(Formidulus.identifier("entity.deer.shape_flesh"));
	public static final SoundEvent DEER_ROAR = register(Formidulus.identifier("entity.deer.roar"));
	public static final SoundEvent DEER_DRAW_CLAWS = register(Formidulus.identifier("entity.deer.draw_claws"));
	public static final SoundEvent DEER_ROAR_SHORT = register(Formidulus.identifier("entity.deer.roar_short"));
	public static final SoundEvent DEER_GRIND = register(Formidulus.identifier("entity.deer.grind"));
	public static final SoundEvent DEER_KNIFE = register(Formidulus.identifier("entity.deer.knife"));
	public static final SoundEvent CULTIST_IDLE_FLIP_PAGE = register(Formidulus.identifier("entity.cultist.idle.flip_page"));
	public static final SoundEvent CULTIST_IDLE_HUM = register(Formidulus.identifier("entity.cultist.idle.hum"));
	public static final SoundEvent CULTIST_MASK_BREAK = register(Formidulus.identifier("entity.cultist.mask.break"));
	public static final SoundEvent CULTIST_MASK_RESTORE = register(Formidulus.identifier("entity.cultist.mask.restore"));
	public static final SoundEvent CULTIST_WORSHIP_HEAL = register(Formidulus.identifier("entity.cultist.worship.heal"));
	public static final SoundEvent CULTIST_MALE_HURT = register(Formidulus.identifier("entity.cultist.male.hurt"));
	public static final SoundEvent CULTIST_MALE_DEATH = register(Formidulus.identifier("entity.cultist.male.death"));
	public static final SoundEvent CULTIST_FEMALE_HURT = register(Formidulus.identifier("entity.cultist.female.hurt"));
	public static final SoundEvent CULTIST_FEMALE_DEATH = register(Formidulus.identifier("entity.cultist.female.death"));
	public static final SoundEvent IRRLICHT_IDLE = register(Formidulus.identifier("entity.irrlicht.idle"));
	public static final SoundEvent IRRLICHT_DEATH = register(Formidulus.identifier("entity.irrlicht.death"));
	public static final SoundEvent PUMPKIN_IMPACT = register(Formidulus.identifier("entity.pumpkin.impact"));
	
	public static final SoundEvent LANTERN_DAMAGE = register(Formidulus.identifier("damage.lantern"));
	public static final SoundEvent CLAW_DAMAGE = register(Formidulus.identifier("damage.claw"));
	
	public static final SoundEvent MUSIC_DEER_INTRO = register(Formidulus.identifier("music.deer.intro"));
	public static final SoundEvent MUSIC_DEER_PHASE1 = register(Formidulus.identifier("music.deer.phase1"));
	public static final SoundEvent MUSIC_DEER_PHASE2_INTRO = register(Formidulus.identifier("music.deer.phase2_intro"));
	public static final SoundEvent MUSIC_DEER_PHASE2 = register(Formidulus.identifier("music.deer.phase2"));
	public static final SoundEvent MUSIC_DEER_OUTRO = register(Formidulus.identifier("music.deer.outro"));
	
	static SoundEvent register(Identifier id)
	{
		return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
	}
	
	public static void register()
	{
	
	}
}
