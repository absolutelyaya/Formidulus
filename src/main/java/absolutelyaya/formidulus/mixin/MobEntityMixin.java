package absolutelyaya.formidulus.mixin;

import absolutelyaya.formidulus.registries.StatusEffectRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;
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
}
