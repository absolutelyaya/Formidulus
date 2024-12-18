package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.item.components.DamageTypeComponent;
import absolutelyaya.formidulus.registries.DataComponentRegistry;
import absolutelyaya.formidulus.registries.StatusEffectRegistry;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MobEntity.class)
public abstract class MobEntityMixin extends LivingEntity
{
	protected MobEntityMixin(EntityType<? extends LivingEntity> entityType, World world)
	{
		super(entityType, world);
	}
	
	@Inject(method = "tickNewAi", at = @At("HEAD"), cancellable = true)
	void onTickAI(CallbackInfo ci)
	{
		if(hasStatusEffect(StatusEffectRegistry.REVERENCE))
			ci.cancel();
	}
	
	@WrapOperation(method = "tryAttack", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/damage/DamageSources;mobAttack(Lnet/minecraft/entity/LivingEntity;)Lnet/minecraft/entity/damage/DamageSource;"))
	DamageSource onGetDamageSource(DamageSources instance, LivingEntity attacker, Operation<DamageSource> original)
	{
		if(getWeaponStack().get(DataComponentRegistry.DAMAGE_TYPE) instanceof DamageTypeComponent component)
		{
			if(getWorld().getRegistryManager().get(RegistryKeys.DAMAGE_TYPE).contains(component.damageType()))
				return component.getSource(attacker);
			else
				Formidulus.LOGGER.warn("DamageTypeComponent -> Tried to use non-existent damage type '{}' (Item: {})", component.getTypeId(), getWeaponStack());
		}
		return original.call(instance, attacker);
	}
}
