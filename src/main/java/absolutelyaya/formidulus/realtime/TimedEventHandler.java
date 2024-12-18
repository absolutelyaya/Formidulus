package absolutelyaya.formidulus.realtime;

import absolutelyaya.formidulus.Formidulus;

import java.util.HashMap;

public class TimedEventHandler
{
	static final HashMap<TimedEvent, Boolean> cachedState = new HashMap<>();
	
	public static void update()
	{
		Formidulus.LOGGER.info("Updating Timed Event State; These are basically realtime holidays:");
		cachedState.put(TimedEvent.WEEN, TimedEvent.WEEN.isActive());
		Formidulus.LOGGER.info(TimedEvent.WEEN.getStateStringUntranslated());
		cachedState.put(TimedEvent.SOLSTICE_FESTIVAL, TimedEvent.SOLSTICE_FESTIVAL.isActive());
		Formidulus.LOGGER.info(TimedEvent.SOLSTICE_FESTIVAL.getStateStringUntranslated());
	}
	
	public static boolean isActive(TimedEvent event)
	{
		return cachedState.getOrDefault(event, false);
	}
}
