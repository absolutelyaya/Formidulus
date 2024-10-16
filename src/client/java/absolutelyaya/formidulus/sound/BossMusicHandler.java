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
	ClientBossMusicEntry last, current, next;
	boolean playingIntro, playingOutro, stopping, late;
	List<PositionedSoundInstance> soundInstances = new ArrayList<>();
	
	public void startTrack(Identifier bossId, String musicKey, boolean late)
	{
		this.late = late;
		try
		{
			BossType type = BossType.fromId(bossId);
			if(type == null)
				return;
			Object music = type.fight().getMethod("getMusicEntry", String.class).invoke(null, musicKey);
			if(music instanceof BossMusicEntry musicEntry)
			{
				ClientBossMusicEntry entry = new ClientBossMusicEntry(musicEntry);
				if(!entry.equals(current))
					next = entry;
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
	
	public void tick()
	{
		if(manager == null)
		{
			manager = MinecraftClient.getInstance().getSoundManager();
			return;
		}
		if((current != null && (manager.isPlaying(current.introInstance) || manager.isPlaying(current.outroInstance))) ||
				   (last != null && manager.isPlaying(last.outroInstance)))
			return;
		if(current != null)
		{
			if(stopping)
			{
				if(current.hasOutro())
					playingOutro = true;
				else
				{
					current.mainInstance.startFadeOut();
					current = null;
				}
				stopping = false;
				return;
			}
			if(playingIntro)
			{
				if(next == null)
				{
					current.mainInstance.setFullVolume();
					manager.play(current.mainInstance);
				}
				playingIntro = false;
				return;
			}
			if(playingOutro)
			{
				manager.stop(current.mainInstance);
				manager.play(current.outroInstance);
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
			next = null;
			if(current.hasIntro() && !(current.skipIntroIfLate && late))
			{
				current.mainInstance.setFullVolume();
				manager.play(current.introInstance);
				playingIntro = true;
			}
			else
			{
				current.mainInstance.startFadeIn();
				manager.play(current.mainInstance);
			}
		}
	}
	
	public void stopAll()
	{
		soundInstances.forEach(manager::stop);
		soundInstances.clear();
	}
	
	public boolean isPlayingMusic()
	{
		return current != null || next != null;
	}
}
