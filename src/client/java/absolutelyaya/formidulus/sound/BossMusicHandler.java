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
	ClientBossMusicEntry current, next;
	boolean playingIntro, playingOutro, stopping;
	List<PositionedSoundInstance> soundInstances = new ArrayList<>();
	
	public void startTrack(Identifier bossId, String musicKey)
	{
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
	
	public void startTrack(ClientBossMusicEntry track)
	{
		next = track;
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
		if(current != null && (manager.isPlaying(current.intro) || manager.isPlaying(current.outro)))
			return;
		if(current != null)
		{
			if(stopping)
			{
				if(current.hasOutro())
					playingOutro = true;
				else
					current.main.startFadeOut();
				stopping = false;
				current = null;
				return;
			}
			if(playingIntro)
			{
				if(next != null)
				{
					current.main.setFullVolume();
					manager.play(current.main);
				}
				playingIntro = false;
			}
			if(next == null)
				return;
			if(!current.hasOutro())
			{
				current.main.startFadeOut();
				current = null;
				return;
			}
			if(!playingOutro)
			{
				manager.stop(current.main);
				manager.play(current.outro);
				playingOutro = true;
			}
			else
			{
				current = null;
				playingOutro = false;
			}
		}
		else if(next != null)
		{
			if(playingIntro)
				playingIntro = false;
			current = next;
			next = null;
			if(current.hasIntro())
			{
				current.main.setFullVolume();
				manager.play(current.intro);
				playingIntro = true;
			}
			else
			{
				current.main.startFadeIn();
				manager.play(current.main);
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
