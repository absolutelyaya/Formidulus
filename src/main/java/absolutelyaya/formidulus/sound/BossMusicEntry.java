package absolutelyaya.formidulus.sound;

import net.minecraft.sound.SoundEvent;

public class BossMusicEntry
{
	protected final SoundEvent mainSound;
	protected final float fadeIn, fadeOut;
	
	SoundEvent introSound, outroSound;
	boolean intro, outro, skipIntroIfLate;
	int introTicks, outroTicks, outroDelayTicks;
	
	public BossMusicEntry(SoundEvent mainSound, float fadeIn, float fadeOut)
	{
		this.mainSound = mainSound;
		this.fadeIn = fadeIn;
		this.fadeOut = fadeOut;
	}
	
	public BossMusicEntry withIntro(SoundEvent sound, int lengthMs)
	{
		return withIntro(sound, lengthMs, true);
	}
	
	public BossMusicEntry withIntro(SoundEvent sound, int lengthMs, boolean skipIfLate)
	{
		introSound = sound;
		intro = true;
		skipIntroIfLate = skipIfLate;
		introTicks = millisecondsToTicks(lengthMs);
		return this;
	}
	
	public boolean hasIntro()
	{
		return intro;
	}
	
	public BossMusicEntry withOutro(SoundEvent sound, int lengthMs)
	{
		outroSound = sound;
		outro = true;
		outroTicks = millisecondsToTicks(lengthMs);
		return this;
	}
	
	public BossMusicEntry withOutroDelay(int delayMs)
	{
		outroDelayTicks = millisecondsToTicks(delayMs);
		return this;
	}
	
	public boolean hasOutro()
	{
		return outro;
	}
	
	int millisecondsToTicks(int milliseconds)
	{
		return Math.round(milliseconds / 50f);
	}
}
