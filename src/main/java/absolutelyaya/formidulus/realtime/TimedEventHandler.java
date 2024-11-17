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
	}
	
	public static boolean isActive(TimedEvent event)
	{
		return cachedState.getOrDefault(event, false);
	}
}
