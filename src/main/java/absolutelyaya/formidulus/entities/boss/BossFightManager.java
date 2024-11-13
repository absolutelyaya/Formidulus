package absolutelyaya.formidulus.entities.boss;

import net.minecraft.server.network.ServerPlayerEntity;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class BossFightManager
{
	public static final BossFightManager INSTANCE = new BossFightManager();
	static final Map<UUID, BossFight> activeFights = new HashMap<>();
	static final Map<BossType, List<UUID>> activeFightIdsByType = new HashMap<>();
	static final List<BossFight> endedFights = new ArrayList<>(), newFights = new ArrayList<>();
	
	public void tick()
	{
		activeFights.values().forEach(BossFight::tick);
		List.copyOf(newFights).forEach(fight -> {
			activeFights.put(fight.fightID, fight);
			if(!activeFightIdsByType.containsKey(fight.type))
				activeFightIdsByType.put(fight.type, new ArrayList<>());
			activeFightIdsByType.get(fight.type).add(fight.fightID);
		});
		newFights.clear();
		List.copyOf(endedFights).forEach(fight -> {
			BossFight removed = activeFights.remove(fight.fightID);
			if(removed != null)
				removed.onFightEnded();
			if(activeFightIdsByType.containsKey(fight.type))
				activeFightIdsByType.get(fight.type).remove(fight.fightID);
		});
		endedFights.clear();
	}
	
	public <T extends BossFight> T beginFight(T sender)
	{
		if(!newFights.contains(sender))
			newFights.add(sender);
		return sender;
	}
	
	public void endFight(BossFight sender)
	{
		if(!endedFights.contains(sender))
			endedFights.add(sender);
	}
	
	public void onPlayerDeath(ServerPlayerEntity player)
	{
		activeFights.values().forEach(f -> f.onPlayerDeath(player));
	}
	
	public boolean isActive(BossFight bossFight)
	{
		return isActive(bossFight.fightID);
	}
	
	public boolean isActive(UUID id)
	{
		return activeFights.containsKey(id);
	}
	
	public @Nullable BossFight fromId(UUID id)
	{
		return activeFights.get(id);
	}
}
