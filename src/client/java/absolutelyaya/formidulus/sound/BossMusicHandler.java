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
	int introTicks, outroTicks, outroDelayTicks;
	boolean playIntro, playOutro, stopping, late, noOutro, noFade, startedOutro;
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
			Formidulus.LOGGER.warn("BossMusicHandler -> Couldn't find 'getMusicEntry' in BossType '{}'s fight class!", bossId, exception);
		}
		catch (Exception exception)
		{
			Formidulus.LOGGER.warn("BossMusicHandler -> Something went wrong trying to get musicEntry from '{}'s fight class!", bossId, exception);
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
	
	public void stopCurrentTrackNoFade()
	{
		stopping = true;
		noFade = true;
		noOutro = false;
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
		if(stopping && !playOutro)
		{
			if(!startedOutro)
			{
				if(mainInstance != null)
				{
					if(noFade)
					{
						mainInstance.stopImmediately();
						noFade = false;
					}
					else
						mainInstance.startFadeOut();
				}
				if(introTicks > 0)
				{
					if(introInstance != null)
					{
						if(noFade)
						{
							introInstance.stopImmediately();
							noFade = false;
						}
						else
							introInstance.startFadeOut();
					}
					introTicks = 0;
				}
				startedOutro = true;
			}
			if(!noOutro && current != null && current.hasOutro())
			{
				if(outroDelayTicks <= 0)
					playOutro = true;
				else
					outroDelayTicks--;
				return;
			}
			else
				current = null;
			stopping = false;
			noOutro = false;
			return;
		}
		if(introTicks > 0)
		{
			if(next != null)
			{
				playIntro = false;
				introInstance.startFadeOut();
				introTicks = 0;
			}
			return;
		}
		if(outroTicks > 0)
			return;
		if(current != null)
		{
			if(playIntro)
			{
				if(next == null)
				{
					mainInstance.startFadeIn();
					manager.play(mainInstance);
				}
				playIntro = false;
				return;
			}
			if(playOutro)
			{
				outroInstance.setFullVolume();
				manager.play(outroInstance);
				outroTicks = current.outroTicks;
				playOutro = false;
				last = current;
				current = null;
				return;
			}
		}
		if(next != null)
		{
			if(playIntro)
				playIntro = false;
			current = next;
			mainInstance = new FadingMusicInstance(current.mainSound, current.fadeIn, current.fadeOut, true);
			next = null;
			if(current.hasIntro() && !(current.skipIntroIfLate && late))
			{
				introInstance = new FadingMusicInstance(current.introSound, 0f, current.fadeOut, false);
				introInstance.setFullVolume();
				manager.play(introInstance);
				introTicks = current.introTicks;
				playIntro = true;
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
			outroDelayTicks = current.outroDelayTicks;
			startedOutro = false;
		}
	}
	public void cancelAll()
	{
		stopCurrentTrackNoOutro();
		next = null;
		outroDelayTicks = 0;
	}
	
	public void stopAll()
	{
		soundInstances.forEach(manager::stop);
		soundInstances.clear();
		last = current = next = null;
		introTicks = outroTicks = outroDelayTicks = 0;
	}
	
	public boolean isPlayingMusic()
	{
		return current != null || next != null;
	}
}
