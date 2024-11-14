package absolutelyaya.formidulus.entities.boss;

import absolutelyaya.formidulus.advancement.CriteriaRegistry;
import absolutelyaya.formidulus.block.BossSpawnerBlockEntity;
import absolutelyaya.formidulus.datagen.Lang;
import absolutelyaya.formidulus.entities.BossEntity;
import absolutelyaya.formidulus.network.BossMusicUpdatePayload;
import absolutelyaya.formidulus.sound.BossMusicEntry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
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
	protected Map<ServerPlayerEntity, Integer> outOfBoundsParticipants = new HashMap<>();
	protected int playerCheckIntervall = 20;
	protected int playerCheckRange = 40;
	
	int playerCheckTimer, warmUp = 100;
	String lastMusicKey;
	boolean playerWin, ended;
	
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
		if(ended)
			return;
		if(playerCheckTimer-- <= 0)
			performParticipantCheck();
		bossEntities.removeIf(BossEntity::isDead);
		String music = getCurMusicKey();
		if(music != null && !music.equals(lastMusicKey))
		{
			onMusicChange(music);
			lastMusicKey = music;
		}
		if(warmUp-- > 0)
			return;
		if(shouldEnd())
			BossFightManager.INSTANCE.endFight(this);
	}
	
	void performParticipantCheck()
	{
		List<ServerPlayerEntity> validParticipants = world.getEntitiesByType(TypeFilter.instanceOf(ServerPlayerEntity.class), new Box(origin).expand(playerCheckRange),
				i -> true);
		List<ServerPlayerEntity> remove = new ArrayList<>();
		participants.forEach(p -> {
			if(!validParticipants.contains(p))
			{
				if(!outOfBoundsParticipants.containsKey(p))
					outOfBoundsParticipants.put(p, 10);
				int oob = outOfBoundsParticipants.get(p);
				if(oob > 0)
				{
					outOfBoundsParticipants.put(p, oob - 1);
					p.sendMessage(Text.translatable(Lang.MESSAGE_OUT_OF_BOUNDS, oob - 1), true);
				}
			}
			else
				outOfBoundsParticipants.remove(p);
			if(outOfBoundsParticipants.getOrDefault(p, 9) <= 0 || !p.isPartOfGame() || p.isCreative())
				remove.add(p);
		});
		remove.forEach(this::leaveFight);
		validParticipants.forEach(p -> {
			if(!participants.contains(p))
				joinFight(p);
		});
		playerCheckTimer = playerCheckIntervall;
	}
	
	protected boolean shouldEnd()
	{
		return bossEntities.isEmpty() || !hasAnyValidParticipants();
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
		outOfBoundsParticipants.remove(player);
	}
	
	public void onPlayerDeath(ServerPlayerEntity player)
	{
		if(!participants.contains(player))
			return;
		leaveFight(player);
		performParticipantCheck();
	}
	
	public List<ServerPlayerEntity> getAllParticipants()
	{
		return participants;
	}
	
	public boolean isValidParticipant(ServerPlayerEntity player)
	{
		return player.isPartOfGame() && !player.isCreative();
	}
	
	public boolean hasAnyValidParticipants()
	{
		for (ServerPlayerEntity p : participants)
		{
			if(isValidParticipant(p))
				return true;
		}
		return false;
	}
	
	public boolean isParticipant(ServerPlayerEntity player)
	{
		return participants.contains(player);
	}
	
	public void setPlayerCheckRange(int range)
	{
		playerCheckRange = range;
	}
	
	public void setPlayerCheckIntervall(int intervall)
	{
		playerCheckIntervall = intervall;
	}
	
	public void interrupt(boolean removeRemainingBossEntities)
	{
		if(removeRemainingBossEntities)
			bossEntities.forEach(BossEntity::forceReset);
		onFightEnded();
	}
	
	public UUID getFightID()
	{
		return fightID;
	}
	
	public void markWon()
	{
		playerWin = true;
	}
	
	void onFightEnded()
	{
		if(ended)
			return;
		if(playerWin)
		{
			participants.forEach(p -> CriteriaRegistry.BOSSFIGHT_WIN.trigger(p, type.id()));
			if(world.getBlockEntity(origin) instanceof BossSpawnerBlockEntity spawner && fightID.equals(spawner.getFightId()))
				spawner.onFightEnded();
		}
		else
		{
			bossEntities.forEach(BossEntity::forceReset);
			onMusicChange("cancel");
		}
		ended = true;
	}
	
	public boolean hasEnded()
	{
		return ended;
	}
}
