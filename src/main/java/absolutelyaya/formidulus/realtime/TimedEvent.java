package absolutelyaya.formidulus.realtime;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.datagen.Lang;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.Calendar;

/**
 * Basically Real Time Holidays that can affect something in-game.<br>
 * For example, the Cult Hideout will have tons of Pumpkins decorating it while Ween is active.
 */
public record TimedEvent(Identifier id, int month, int day, int preMargin, int postMargin)
{
	public static final TimedEvent WEEN = new TimedEvent(Formidulus.identifier("ween"), Calendar.OCTOBER, 31, 30, 20);
	
	public int getDaysUntil()
	{
		Calendar calender = Calendar.getInstance();
		int currentDay = calender.get(Calendar.DAY_OF_YEAR);
		calender.set(Calendar.MONTH, month);
		calender.set(Calendar.DAY_OF_MONTH, day);
		int celebration = calender.get(Calendar.DAY_OF_YEAR);
		return celebration - currentDay;
	}
	
	public boolean isActive(int delta)
	{
		return delta <= preMargin && -delta <= postMargin;
	}
	
	public boolean isActive()
	{
		return isActive(getDaysUntil());
	}
	
	public boolean isToday()
	{
		return getDaysUntil() == 0;
	}
	
	public String getBaseTranslationKey()
	{
		return "event." + id.getNamespace() + "." + id.getPath();
	}
	
	public String getTitleKey()
	{
		return getBaseTranslationKey() + ".title";
	}
	
	public String getDescriptionKey()
	{
		return getBaseTranslationKey() + ".description";
	}
	
	public Text getStateText()
	{
		Text title = Text.translatable(getTitleKey());
		Text activeSuffix = Text.translatable(Lang.EVENT_INFO_ACTIVE_SUFFIX);
		int delta = getDaysUntil();
		boolean isActive = isActive(delta);
		if(delta == 0)
			return Text.translatable(Lang.EVENT_INFO_PRESENT, title.getString());
		else if(delta < 0)
			return Text.translatable(Lang.EVENT_INFO_PAST, title.getString(), -delta)
						   .append(isActive ? activeSuffix : Text.empty());
		else
			return Text.translatable(Lang.EVENT_INFO_FUTURE, title.getString(), delta)
						   .append(isActive ? activeSuffix : Text.empty());
	}
	
	public String getStateStringUntranslated()
	{
		int delta = getDaysUntil();
		boolean isActive = isActive(delta);
		if(delta == 0)
			return String.format("Today is %s!", id);
		else if(delta < 0)
			return String.format("%1$s was %2$s days ago.", id, -delta) + (isActive ? " (active)" : "");
		else
			return String.format("%1$s is in %2$s days.", id, delta) + (isActive ? " (active)" : "");
	}
}
