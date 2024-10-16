package absolutelyaya.formidulus.entities.boss;

import absolutelyaya.formidulus.entities.DeerGodEntity;
import absolutelyaya.formidulus.registries.SoundRegistry;
import absolutelyaya.formidulus.sound.BossMusicEntry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.UUID;

public class DeerBossFight extends BossFight
{
	public DeerBossFight(DeerGodEntity deer)
	{
		super(deer.getWorld(), BossType.DEER, BlockPos.ofFloored(new Vec3d(deer.getOrigin())), UUID.randomUUID());
		registerBossEntity(deer);
	}
	
	@Override
	String getCurMusicKey()
	{
		return "phase" + (phase + 1);
	}
	
	@Override
	public void interrupt(boolean removeRemainingBossEntities)
	{
		bossEntities.forEach(i -> {
			if(i instanceof DeerGodEntity deer)
				deer.forceReset();
			else
				i.discard();
		});
		end();
	}
	
	static {
		bossMusic.put("phase1", new BossMusicEntry(SoundRegistry.MUSIC_DEER_PHASE1, 133, 0.5f, 0f));
	}
}
