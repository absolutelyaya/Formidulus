package absolutelyaya.formidulus.entities;

import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.entity.boss.ServerBossBar;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.TypeFilter;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public abstract class BossEntity extends AnimatedHostileEntity
{
	protected ServerBossBar bossBar;
	boolean wasBossbarVisible;
	
	protected BossEntity(EntityType<? extends AnimatedHostileEntity> entityType, World world)
	{
		super(entityType, world);
	}
	
	protected ServerBossBar initBossBar()
	{
		return new ServerBossBar(getDisplayName(), BossBar.Color.RED, getBossBarStyle());
	}
	
	abstract BossBar.Style getBossBarStyle();
	
	@Nullable
	@Override
	public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData)
	{
		return super.initialize(world, difficulty, spawnReason, entityData);
	}
	
	@Override
	public void setCustomName(@Nullable Text name)
	{
		super.setCustomName(name);
		if(isBossBarVisible())
			bossBar.setName(getDisplayName());
	}
	
	public boolean isBossBarVisible()
	{
		if(bossBar == null)
			bossBar = initBossBar();
		return true;
	}
	
	@Override
	public void onStartedTrackingBy(ServerPlayerEntity player)
	{
		super.onStartedTrackingBy(player);
		if(isBossBarVisible())
			bossBar.addPlayer(player);
	}
	
	@Override
	public void onStoppedTrackingBy(ServerPlayerEntity player)
	{
		super.onStoppedTrackingBy(player);
		if(isBossBarVisible())
			bossBar.removePlayer(player);
	}
	
	@Override
	protected void mobTick()
	{
		super.mobTick();
		if(isBossBarVisible())
			bossBar.setPercent(getHealth() / getMaxHealth());
		if(getWorld().isClient)
			return;
		if(wasBossbarVisible && !isBossBarVisible())
			bossBar.clearPlayers();
		else if(!wasBossbarVisible && isBossBarVisible())
		{
			getWorld().getEntitiesByType(TypeFilter.instanceOf(PlayerEntity.class), getBoundingBox().expand(64), p -> true)
					.forEach(p -> bossBar.addPlayer((ServerPlayerEntity)p));
		}
		wasBossbarVisible = isBossBarVisible();
	}
	
	@Override
	public boolean cannotDespawn()
	{
		return true;
	}
	
	abstract boolean isNotInSequence();
}
