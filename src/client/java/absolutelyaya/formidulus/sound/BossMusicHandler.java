package absolutelyaya.formidulus.sound;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.entities.boss.BossType;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.client.sound.SoundManager;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class BossMusicHandler
{
	static SoundManager manager;
	BossMusicEntry last, current, next;
	int introTicks, outroTicks;
	boolean playingIntro, playingOutro, stopping, late, noOutro;
	List<PositionedSoundInstance> soundInstances = new ArrayList<>();
	FadingMusicInstance mainInstance, introInstance, outroInstance;
	
	public void startTrack(Identifier bossId, String musicKey, boolean late)
	{
		this.late = late;
		if(late)
			introTicks = 0;
		try
		{
			BossType type = BossType.fromId(bossId);
			if(type == null)
				return;
			Object music = type.fight().getMethod("getMusicEntry", String.class).invoke(null, musicKey);
			if(music instanceof BossMusicEntry musicEntry)
			{
				if(!musicEntry.equals(current))
					next = musicEntry;
			}
			else
				Formidulus.LOGGER.warn("BossMusicHandler -> Received invalid musicKey; '{}' does not exist in '{}'s fight class!", musicKey, bossId);
		}
		catch (NoSuchMethodException exception)
		{
			Formidulus.LOGGER.warn("BossMusicHandler -> Couldn't find 'getMusicEntry' in BossType '{}'s fight class!", bossId);
			exception.printStackTrace();
		}
		catch (Exception exception)
		{
			Formidulus.LOGGER.warn("BossMusicHandler -> Something went wrong trying to get musicEntry from '{}'s fight class!", bossId);
			exception.printStackTrace();
		}
	}
	
	public void stopCurrentTrack()
	{
		stopping = true;
	}
	
	public void stopCurrentTrackNoOutro()
	{
		stopping = true;
		noOutro = true;
	}
	
	public void tick()
	{
		if(manager == null)
		{
			manager = MinecraftClient.getInstance().getSoundManager();
			return;
		}
		if(introTicks > 0)
			introTicks--;
		if(outroTicks > 0)
			outroTicks--;
		if(stopping)
		{
			if(!noOutro && current.hasOutro())
				playingOutro = true;
			else
				current = null;
			if(mainInstance != null)
				mainInstance.startFadeOut();
			if(introTicks > 0)
			{
				if(introInstance != null)
					introInstance.startFadeOut();
				introTicks = 0;
			}
			stopping = false;
			noOutro = false;
			return;
		}
		if(introTicks > 0)
		{
			if(next != null)
			{
				playingIntro = false;
				introInstance.startFadeOut();
				introTicks = 0;
			}
			return;
		}
		if(outroTicks > 0)
			return;
		if(current != null)
		{
			if(playingIntro)
			{
				if(next == null)
				{
					mainInstance.startFadeIn();
					manager.play(mainInstance);
				}
				playingIntro = false;
				return;
			}
			if(playingOutro)
			{
				manager.play(outroInstance);
				outroTicks = current.outroTicks;
				playingOutro = false;
				last = current;
				current = null;
				return;
			}
		}
		if(next != null)
		{
			if(playingIntro)
				playingIntro = false;
			current = next;
			mainInstance = new FadingMusicInstance(current.mainSound, current.fadeIn, current.fadeOut, true);
			next = null;
			if(current.hasIntro() && !(current.skipIntroIfLate && late))
			{
				introInstance = new FadingMusicInstance(current.introSound, 0f, current.fadeOut, false);
				introInstance.setFullVolume();
				manager.play(introInstance);
				introTicks = current.introTicks;
				playingIntro = true;
			}
			else
			{
				mainInstance.startFadeIn();
				manager.play(mainInstance);
				if(late)
					late = false;
			}
			if(current.hasOutro())
				outroInstance = new FadingMusicInstance(current.outroSound, current.fadeIn, 0f, false);
		}
	}
	
	public void stopAll()
	{
		soundInstances.forEach(manager::stop);
		soundInstances.clear();
		last = current = next = null;
		introTicks = outroTicks = 0;
	}
	
	public boolean isPlayingMusic()
	{
		return current != null || next != null;
	}
}
