package absolutelyaya.formidulus.entities.boss;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class BossFightManager
{
	public static final BossFightManager INSTANCE = new BossFightManager();
	static final Map<UUID, BossFight> activeFights = new HashMap<>();
	static final Map<BossType, List<UUID>> activeFightIdsByType = new HashMap<>();
	static final Map<BossType, Map<BlockPos, PersistentBossPosition>> knownPersistentBossPositions = new HashMap<>();
	static final List<BossFight> endedFights = new ArrayList<>(), newFights = new ArrayList<>();
	
	public void tick()
	{
		activeFights.values().forEach(BossFight::tick);
		newFights.forEach(fight -> {
			activeFights.put(fight.fightID, fight);
			if(!activeFightIdsByType.containsKey(fight.type))
				activeFightIdsByType.put(fight.type, new ArrayList<>());
			activeFightIdsByType.get(fight.type).add(fight.fightID);
		});
		newFights.clear();
		endedFights.forEach(fight -> {
			BossFight removed = activeFights.remove(fight.fightID);
			if(removed != null)
				removed.onFightEnded();
			if(activeFightIdsByType.containsKey(fight.type))
				activeFightIdsByType.get(fight.type).remove(fight.fightID);
		});
		endedFights.clear();
	}
	
	public void registerPersistentBossPosition(PersistentBossPosition ref)
	{
		Optional<BossType> prev = getPersistenBossPosTypeIfKnown(ref.pos());
		if(prev.isPresent())
		{
			BlockPos pos = ref.pos();
			Formidulus.LOGGER.warn("Tried to register Persistent Boss Position of '{}' at [{}, {}, {}], which is already occupied by '{}'",
					ref.type().id(), pos.getX(), pos.getY(), pos.getZ(), prev.get());
			return;
		}
		if(!knownPersistentBossPositions.containsKey(ref.type()))
			knownPersistentBossPositions.put(ref.type(), new HashMap<>());
		knownPersistentBossPositions.get(ref.type()).put(ref.pos(), ref);
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
	
	Optional<BossType> getPersistenBossPosTypeIfKnown(BlockPos pos)
	{
		for (Map.Entry<BossType, Map<BlockPos, PersistentBossPosition>> type : knownPersistentBossPositions.entrySet())
			if(type.getValue().containsKey(pos))
				return Optional.of(type.getKey());
		return Optional.empty();
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
