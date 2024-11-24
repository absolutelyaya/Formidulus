package absolutelyaya.formidulus.datagen;

import static absolutelyaya.formidulus.datagen.BaseTranslationProvider.modKey;

public interface Lang
{
	String EXPANDABLE_LORE_HINT = modKey("item", "expandable_lore_hint");
	String ACCESSORY_MODE_PREFIX = modKey("item", "accessory_mode_prefix");
	String ACCESSORY_MODE_HINT = modKey("item", "accessory_mode_hint");
	String DEPENDENCY_INFO_DEFAULT = modKey("item", "dependency_info.default");
	
	String ADVANCEMENT_ROOT_TITLE = modKey("advancement", "root.title");
	String ADVANCEMENT_ROOT_DESCRIPTION = modKey("advancement", "root.description");
	String ADVANCEMENT_CULTISTS_TITLE = modKey("advancement", "cultists.title");
	String ADVANCEMENT_CULTISTS_DESCRIPTION = modKey("advancement", "cultists.description");
	String ADVANCEMENT_DEER_TITLE = modKey("advancement", "deer.title");
	String ADVANCEMENT_DEER_DESCRIPTION = modKey("advancement", "deer.description");
	String ADVANCEMENT_WEEN_TITLE = modKey("advancement", "ween.title");
	String ADVANCEMENT_WEEN_DESCRIPTION = modKey("advancement", "ween.description");
	
	String SCREEN_CONFIG_TITLE = modKey("screen", "config-screen.title");
	String SCREEN_BOSS_SPAWNER_TITLE = modKey("screen", "boss_spawner.title");
	String SCREEN_BOSS_SPAWNER_BOSS_TYPE = modKey("screen", "boss_spawner.boss_type");
	String SCREEN_BOSS_SPAWNER_RESPAWN_DELAY = modKey("screen", "boss_spawner.respawn_delay");
	String SCREEN_BOSS_SPAWNER_CLOSE = modKey("screen", "boss_spawner.close");
	
	String MAP_CULT_HIDEOUT = modKey("map", "cult_hideout");
	
	String MESSAGE_DEER_WARNING = modKey("message", "deer.warning");
	String MESSAGE_OUT_OF_BOUNDS = modKey("message", "out_of_bounds");
	
	String MUSIC_DEER_PHASE1 = modKey("jukebox_song", "deer.phase1");
	String MUSIC_DEER_PHASE2 = modKey("jukebox_song", "deer.phase2");
	
	String EVENT_INFO_PAST = modKey("event", "info.past");
	String EVENT_INFO_PRESENT = modKey("event", "info.present");
	String EVENT_INFO_FUTURE = modKey("event", "info.future");
	String EVENT_INFO_ACTIVE_SUFFIX = modKey("event", "info.active_suffix");
	
	String NOT_YET_IMPLEMENTED = modKey("item", "debug.not_yet_implemented");
}
