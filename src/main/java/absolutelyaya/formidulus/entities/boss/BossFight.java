package absolutelyaya.formidulus.entities.boss;

import absolutelyaya.formidulus.advancement.CriteriaRegistry;
import absolutelyaya.formidulus.block.BossSpawnerBlockEntity;
import absolutelyaya.formidulus.entities.BossEntity;
import absolutelyaya.formidulus.network.BossMusicUpdatePayload;
import absolutelyaya.formidulus.sound.BossMusicEntry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.TypeFilter;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

import java.util.*;

public abstract class BossFight
{
	protected static final Map<String, BossMusicEntry> bossMusic = new HashMap<>();
	protected final World world;
	protected final BossType type;
	protected final BlockPos origin;
	protected final UUID fightID;
	protected final List<BossEntity> bossEntities = new ArrayList<>();
	
	protected int phase;
	protected List<ServerPlayerEntity> participants = new ArrayList<>();
	protected int playerCheckIntervall = 20;
	protected int playerCheckRange = 48;
	
	int playerCheckTimer;
	String lastMusicKey;
	boolean playerWin;
	
	protected BossFight(BossEntity entity, UUID id)
	{
		this.world = entity.getWorld();
		this.type = entity.getBossType();
		this.origin = entity.getOriginBlock();
		
		if(id == null) //if continuation, all players should be counted as late so music intros don't repeat
			participants = world.getEntitiesByType(TypeFilter.instanceOf(ServerPlayerEntity.class), new Box(origin).expand(playerCheckRange),
					i -> !i.isSpectator() && i.isPartOfGame());
		this.fightID = id == null ? UUID.randomUUID() : id;
		
		if(world.getBlockEntity(origin) instanceof BossSpawnerBlockEntity spawner)
			spawner.setBossFightId(fightID);
		
		registerBossEntity(entity);
	}
	
	public void registerBossEntity(BossEntity boss)
	{
		bossEntities.add(boss);
	}
	
	public void tick()
	{
		if(playerCheckTimer-- <= 0)
		{
			List<ServerPlayerEntity> newParticipantList = world.getEntitiesByType(TypeFilter.instanceOf(ServerPlayerEntity.class), new Box(origin).expand(playerCheckRange),
					i -> !i.isSpectator() && i.isPartOfGame());
			List<ServerPlayerEntity> remove = new ArrayList<>();
			participants.forEach(p -> {
				if(!newParticipantList.contains(p) || p.isDead())
					remove.add(p);
			});
			remove.forEach(this::leaveFight);
			newParticipantList.forEach(p -> {
				if(!participants.contains(p))
					joinFight(p);
			});
			playerCheckTimer = playerCheckIntervall;
		}
		bossEntities.removeIf(BossEntity::isRemoved);
		String music = getCurMusicKey();
		if(music != null && !music.equals(lastMusicKey))
		{
			onMusicChange(music);
			lastMusicKey = music;
		}
		if(shouldEnd())
			BossFightManager.INSTANCE.endFight(this);
	}
	
	protected boolean shouldEnd()
	{
		return bossEntities.isEmpty();
	}
	
	public void setPhase(int phase)
	{
		this.phase = phase;
	}
	
	public int getPhase()
	{
		return phase;
	}
	
	public BossMusicEntry getCurMusicEntry()
	{
		return getMusicEntry(getCurMusicKey());
	}
	
	public static BossMusicEntry getMusicEntry(String key)
	{
		return bossMusic.get(key);
	}
	
	protected String getCurMusicKey()
	{
		return "phase" + (phase + 1);
	}
	
	void onMusicChange(String key)
	{
		participants.forEach(p -> ServerPlayNetworking.send(p, new BossMusicUpdatePayload(type.id(), key)));
	}
	
	public void joinFight(ServerPlayerEntity player)
	{
		if(participants.contains(player))
			return;
		participants.add(player);
		ServerPlayNetworking.send(player, new BossMusicUpdatePayload(type.id(), getCurMusicKey(), true));
	}
	
	public void leaveFight(ServerPlayerEntity player)
	{
		if(participants.remove(player))
			ServerPlayNetworking.send(player, new BossMusicUpdatePayload(type.id(), "cancel"));
	}
	
	public List<ServerPlayerEntity> getAllParticipants()
	{
		return participants;
	}
	
	public void interrupt(boolean removeRemainingBossEntities)
	{
		if(removeRemainingBossEntities)
			bossEntities.forEach(BossEntity::forceReset);
		onFightEnded();
	}
	
	public void markWon()
	{
		playerWin = true;
	}
	
	void onFightEnded()
	{
		if(playerWin)
		{
			participants.forEach(p -> CriteriaRegistry.BOSSFIGHT_WIN.trigger(p, type.id()));
			if(world.getBlockEntity(origin) instanceof BossSpawnerBlockEntity spawner && fightID.equals(spawner.getFightId()))
				spawner.onFightEnded();
		}
		onMusicChange("cancel");
	}
	
	public UUID getFightID()
	{
		return fightID;
	}
}
