package absolutelyaya.formidulus.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BossMusicEntry
{
	final SoundEvent mainSound;
	final int mainLength;
	final float fadeIn, fadeOut;
	
	SoundEvent introSound, outroSound;
	int introLength, outroLength;
	boolean intro, outro, skipIntroIfLate;
	
	public BossMusicEntry(SoundEvent mainSound, int mainLength, float fadeIn, float fadeOut)
	{
		this.mainSound = mainSound;
		this.mainLength = mainLength;
		this.fadeIn = fadeIn;
		this.fadeOut = fadeOut;
	}
	
	public @NotNull Pair<SoundEvent, Integer> getMainSound()
	{
		return new Pair<>(mainSound, mainLength);
	}
	
	public BossMusicEntry withIntro(SoundEvent sound, int length)
	{
		return withIntro(sound, length, true);
	}
	
	public BossMusicEntry withIntro(SoundEvent sound, int length, boolean skipIfLate)
	{
		introSound = sound;
		introLength = length;
		intro = true;
		skipIntroIfLate = skipIfLate;
		return this;
	}
	
	public boolean hasIntro()
	{
		return intro;
	}
	
	public @Nullable Pair<SoundEvent, Integer> getIntro()
	{
		if(!intro)
			return null;
		return new Pair<>(introSound, introLength);
	}
	
	public BossMusicEntry withOutro(SoundEvent sound, int length)
	{
		outroSound = sound;
		outroLength = length;
		outro = true;
		return this;
	}
	
	public boolean hasOutro()
	{
		return outro;
	}
	
	public @Nullable Pair<SoundEvent, Integer> getOutro()
	{
		if(!outro)
			return null;
		return new Pair<>(outroSound, outroLength);
	}
	
	public float getFadeIn()
	{
		return fadeIn;
	}
	
	public float getFadeOut()
	{
		return fadeOut;
	}
}
