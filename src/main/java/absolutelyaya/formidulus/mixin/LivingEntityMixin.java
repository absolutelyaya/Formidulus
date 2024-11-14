package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.entities.BossEntity;
import absolutelyaya.formidulus.item.components.AbilityComponent;
import absolutelyaya.formidulus.registries.DataComponentRegistry;
import absolutelyaya.formidulus.registries.StatusEffectRegistry;
import absolutelyaya.formidulus.registries.TagRegistry;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity
{
	@Unique int bossImmunity, soulImmunity;
	
	public LivingEntityMixin(EntityType<?> type, World world)
	{
		super(type, world);
	}
	
	@Shadow public abstract boolean hasStatusEffect(RegistryEntry<StatusEffect> effect);
	
	@Shadow public abstract boolean isInvulnerableTo(DamageSource damageSource);
	
	@ModifyReturnValue(method = "isInvulnerableTo", at = @At("RETURN"))
	private boolean modifyIsInvulnerable(boolean original)
	{
		return original || hasStatusEffect(StatusEffectRegistry.REVERENCE);
	}
	
	@Inject(method = "applyDamage", at = @At("TAIL"))
	void onDamage(DamageSource source, float amount, CallbackInfo ci)
	{
		if(isInvulnerableTo(source) || amount <= 0f)
			return;
		if(source.getAttacker() instanceof LivingEntity attacker && attacker.getWeaponStack().get(DataComponentRegistry.ABILITY) instanceof AbilityComponent component)
			component.ability().onDamageEntity(attacker.getWeaponStack(), attacker, source, amount, (LivingEntity)((Object)this));
	}
	
	@Inject(method = "baseTick", at = @At("HEAD"))
	void onBaseTick(CallbackInfo ci)
	{
		if (bossImmunity > 0)
			bossImmunity--;
		if (soulImmunity > 0)
			soulImmunity--;
	}
	
	@ModifyExpressionValue(method = "damage", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/damage/DamageSource;isIn(Lnet/minecraft/registry/tag/TagKey;)Z", ordinal = 4))
	boolean modifyIgnoresCooldown(boolean original, @Local(argsOnly = true) DamageSource source)
	{
		return original || ((source.getAttacker() instanceof BossEntity || source.getSource() instanceof BossEntity) &&
						source.isIn(TagRegistry.BOSS_DAMAGE) && bossImmunity <= 0) ||
					   (source.isIn(TagRegistry.SOUL_DAMAGE) && soulImmunity <= 0);
	}
	
	@Inject(method = "damage", at = @At("TAIL"))
	void modifyTimeUntilRegen(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir)
	{
		if (source.isIn(TagRegistry.SOUL_DAMAGE) && getWorld() instanceof ServerWorld serverWorld)
			serverWorld.spawnParticles(ParticleTypes.SOUL_FIRE_FLAME, getX(), getBoundingBox().getCenter().y, getZ(), (int)(amount * 2f),
					getWidth() / 2f, getHeight() / 2f, getWidth() / 2f, 0.025f);
	}
	
	@ModifyConstant(method = "damage", constant = @Constant(intValue = 20))
	int modifyTimeUntilRegen(int constant, @Local(argsOnly = true) DamageSource source)
	{
		if(source.isIn(TagRegistry.BOSS_DAMAGE))
			bossImmunity = 10;
		if(source.isIn(TagRegistry.SOUL_DAMAGE))
			soulImmunity = 15;
		return constant;
	}
	
	@ModifyConstant(method = "onDamaged", constant = @Constant(intValue = 20))
	int modifyTimeUntilRegenOnDamaged(int constant, @Local(argsOnly = true) DamageSource source)
	{
		if(source.isIn(TagRegistry.BOSS_DAMAGE))
			bossImmunity = 10;
		if(source.isIn(TagRegistry.SOUL_DAMAGE))
			soulImmunity = 15;
		return constant;
	}
}
