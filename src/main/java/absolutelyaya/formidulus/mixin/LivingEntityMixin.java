package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.item.components.AbilityComponent;
import absolutelyaya.formidulus.registries.DataComponentRegistry;
import absolutelyaya.formidulus.registries.StatusEffectRegistry;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.entry.RegistryEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin
{
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
}
