package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.item.components.AccessoryComponent;
import absolutelyaya.formidulus.item.components.DamageTypeComponent;
import absolutelyaya.formidulus.realtime.TimedEvent;
import absolutelyaya.formidulus.registries.DataComponentRegistry;
import absolutelyaya.formidulus.registries.ItemRegistry;
import absolutelyaya.formidulus.registries.StatusEffectRegistry;
import absolutelyaya.formidulus.registries.TagRegistry;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.entity.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MobEntity.class)
public abstract class MobEntityMixin extends LivingEntity
{
	@Shadow public abstract ItemStack getEquippedStack(EquipmentSlot slot);
	
	@Shadow public abstract void equipStack(EquipmentSlot slot, ItemStack stack);
	
	@Shadow public abstract void setEquipmentDropChance(EquipmentSlot slot, float dropChance);
	
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
	
	@Inject(method = "initialize", at = @At("TAIL"))
	void onInitialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, EntityData entityData, CallbackInfoReturnable<EntityData> cir)
	{
		if(TimedEvent.SOLSTICE_FESTIVAL.isActive() && getType().isIn(TagRegistry.JOLLY_MOBS) && getEquippedStack(EquipmentSlot.HEAD).isEmpty())
		{
			if(random.nextFloat() < Formidulus.config.jollyChance.getValue())
			{
				ItemStack stack = ItemRegistry.JOLLY_HAT.getDefaultStack();
				if(random.nextFloat() < 0.2 && stack.getComponents().get(DataComponentRegistry.ACCESSORY) instanceof AccessoryComponent accessory)
					stack.set(DataComponentRegistry.ACCESSORY, accessory.cycle());
				equipStack(EquipmentSlot.HEAD, stack);
				setEquipmentDropChance(EquipmentSlot.HEAD, 0.75f);
			}
		}
	}
}
