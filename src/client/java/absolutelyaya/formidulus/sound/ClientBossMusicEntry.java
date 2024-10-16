package absolutelyaya.formidulus.sound;

import net.minecraft.client.sound.PositionedSoundInstance;

public class ClientBossMusicEntry extends BossMusicEntry
{
	FadingMusicInstance mainInstance;
	PositionedSoundInstance introInstance, outroInstance;
	
	public ClientBossMusicEntry(BossMusicEntry entry)
	{
		super(entry.mainSound, entry.fadeIn, entry.fadeOut);
		if(entry.hasIntro())
		{
			skipIntroIfLate = entry.skipIntroIfLate;
			introSound = entry.introSound;
			introInstance = PositionedSoundInstance.music(introSound);
			intro = true;
		}
		mainInstance = new FadingMusicInstance(mainSound, getFadeIn(), getFadeOut());
		if(entry.hasOutro())
		{
			outroSound = entry.outroSound;
			outroInstance = PositionedSoundInstance.music(outroSound);
			outro = true;
		}
	}
}
