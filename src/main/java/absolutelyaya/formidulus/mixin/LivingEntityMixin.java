package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.registries.StatusEffectRegistry;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.entry.RegistryEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin
{
	@Shadow public abstract boolean hasStatusEffect(RegistryEntry<StatusEffect> effect);
	
	@ModifyReturnValue(at = @At("RETURN"), method = "isInvulnerableTo")
	private boolean modifyIsInvulnerable(boolean original)
	{
		return original || hasStatusEffect(StatusEffectRegistry.REVERENCE);
	}
}
