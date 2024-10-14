package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.item.components.DamageTypeComponent;
import absolutelyaya.formidulus.registries.DataComponentRegistry;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity
{
	@Shadow public abstract @NotNull ItemStack getWeaponStack();
	
	protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world)
	{
		super(entityType, world);
	}
	
	@WrapOperation(method = "attack", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/damage/DamageSources;playerAttack(Lnet/minecraft/entity/player/PlayerEntity;)Lnet/minecraft/entity/damage/DamageSource;"))
	DamageSource onGetDamageSource(net.minecraft.entity.damage.DamageSources instance, PlayerEntity attacker, Operation<DamageSource> original)
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
