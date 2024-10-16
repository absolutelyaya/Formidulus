package absolutelyaya.formidulus.sound;

import net.minecraft.client.sound.PositionedSoundInstance;

public class ClientBossMusicEntry extends BossMusicEntry
{
	FadingMusicInstance main;
	PositionedSoundInstance intro, outro;
	
	public ClientBossMusicEntry(BossMusicEntry entry)
	{
		super(entry.mainSound, entry.mainLength, entry.fadeIn, entry.fadeOut);
		if(hasIntro())
			intro = PositionedSoundInstance.music(introSound);
		main = new FadingMusicInstance(mainSound, getFadeIn(), getFadeOut());
		if(hasOutro())
			outro = PositionedSoundInstance.music(mainSound);
	}
}
