package absolutelyaya.formidulus.entities;

import absolutelyaya.formidulus.entities.goal.BossTargetGoal;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.entity.boss.ServerBossBar;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.TypeFilter;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public abstract class BossEntity extends AnimatedHostileEntity
{
	protected ServerBossBar bossBar;
	boolean wasBossbarVisible;
	float lastDamageTakenRaw, lastDamageTaken;
	int lastTargetDamagedTime;
	BossTargetGoal bossTargetGoal;
	
	protected BossEntity(EntityType<? extends AnimatedHostileEntity> entityType, World world)
	{
		super(entityType, world);
	}
	
	protected ServerBossBar initBossBar()
	{
		return new ServerBossBar(getDisplayName(), BossBar.Color.RED, getBossBarStyle());
	}
	
	abstract BossBar.Style getBossBarStyle();
	
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
	
	abstract boolean isInSequence();
	
	public Vec3d getFocusPos()
	{
		return getEyePos().subtract(0f, 0.5f, 0f);
	}
	
	public float getLastDamageTakenRaw()
	{
		return lastDamageTakenRaw;
	}
	
	public float getLastDamageTaken()
	{
		return lastDamageTaken;
	}
	
	public int getLastTargetDamagedTime()
	{
		return lastTargetDamagedTime;
	}
	
	public @Nullable LivingEntity getRandomTarget()
	{
		if(bossTargetGoal != null)
			return bossTargetGoal.getRandomTarget();
		return null;
	}
	
	@Override
	public boolean damage(DamageSource source, float amount)
	{
		boolean b = super.damage(source, amount);
		if(b)
		{
			lastDamageTakenRaw = amount;
			lastDamageTaken = applyArmorToDamage(source, amount);
		}
		return b;
	}
	
	public void onDamageEntity(LivingEntity damaged)
	{
		if(damaged.equals(getTarget()))
			lastTargetDamagedTime = age;
	}
}
