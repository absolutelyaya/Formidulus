package absolutelyaya.formidulus.sound;

import net.minecraft.sound.SoundEvent;
import org.jetbrains.annotations.NotNull;

public class BossMusicEntry
{
	protected final SoundEvent mainSound;
	protected final float fadeIn, fadeOut;
	
	SoundEvent introSound, outroSound;
	boolean intro, outro, skipIntroIfLate;
	int introTicks, outroTicks;
	
	public BossMusicEntry(SoundEvent mainSound, float fadeIn, float fadeOut)
	{
		this.mainSound = mainSound;
		this.fadeIn = fadeIn;
		this.fadeOut = fadeOut;
	}
	
	public @NotNull SoundEvent getMainSound()
	{
		return mainSound;
	}
	
	public BossMusicEntry withIntro(SoundEvent sound, int lengthMilliseconds)
	{
		return withIntro(sound, lengthMilliseconds, true);
	}
	
	public BossMusicEntry withIntro(SoundEvent sound, int lengthMilliseconds, boolean skipIfLate)
	{
		introSound = sound;
		intro = true;
		skipIntroIfLate = skipIfLate;
		introTicks = millisecondsToTicks(lengthMilliseconds);
		return this;
	}
	
	public boolean hasIntro()
	{
		return intro;
	}
	
	public BossMusicEntry withOutro(SoundEvent sound, int lengthMilliseconds)
	{
		outroSound = sound;
		outro = true;
		outroTicks = millisecondsToTicks(lengthMilliseconds);
		return this;
	}
	
	public boolean hasOutro()
	{
		return outro;
	}
	
	public float getFadeIn()
	{
		return fadeIn;
	}
	
	public float getFadeOut()
	{
		return fadeOut;
	}
	
	int millisecondsToTicks(int milliseconds)
	{
		return Math.round(milliseconds / 50f);
	}
}
