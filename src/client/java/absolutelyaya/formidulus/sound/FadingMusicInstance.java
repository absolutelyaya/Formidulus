package absolutelyaya.formidulus.sound;

import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.client.sound.TickableSoundInstance;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;

public class FadingMusicInstance extends PositionedSoundInstance implements TickableSoundInstance
{
	boolean active;
	float fadeIn, fadeOut;
	
	public FadingMusicInstance(SoundEvent sound, float fadeIn, float fadeOut, boolean loop)
	{
		super(sound.getId(), SoundCategory.MUSIC, 0.01f, 1, SoundInstance.createRandom(), loop, 0,
				SoundInstance.AttenuationType.NONE, 0, 0, 0, true);
		this.fadeIn = fadeIn;
		this.fadeOut = fadeOut;
	}
	
	public void setFullVolume()
	{
		volume = 1f;
		active = true;
	}
	
	public void startFadeIn()
	{
		volume = 0.01f;
		active = true;
	}
	
	public void startFadeOut()
	{
		active = false;
	}
	
	public void stopImmediately()
	{
		active = false;
		volume = 0f;
	}
	
	@Override
	public void tick()
	{
		if(active && volume < 1f)
			volume = Math.min(fadeIn <= 0f ? 1f : volume + 1f / 20f / fadeIn, 1f);
		if(!active && volume > 0f)
			volume = Math.max(fadeOut <= 0f ? 0f : volume - 1f / 20f / fadeOut, 0f);
	}
	
	@Override
	public boolean isDone()
	{
		return !active && volume <= 0f;
	}
}
