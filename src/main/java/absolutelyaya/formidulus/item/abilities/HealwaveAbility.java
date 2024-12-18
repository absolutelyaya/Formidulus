package absolutelyaya.formidulus.item.abilities;

import absolutelyaya.formidulus.item.components.ChargeComponent;
import absolutelyaya.formidulus.network.CastActiveAbilityPayload;
import absolutelyaya.formidulus.registries.DataComponentRegistry;
import absolutelyaya.formidulus.registries.SoundRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.MutableText;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Optional;

public class HealwaveAbility extends ItemAbility
{
	public HealwaveAbility(Identifier id)
	{
		super(id);
	}
	
	@Override
	public MutableText getNameText()
	{
		return super.getNameText().setStyle(STYLE.withColor(Formatting.GOLD));
	}
	
	@Override
	public int getDescriptionLines()
	{
		return 2;
	}
	
	@Override
	public Optional<TypedActionResult<ItemStack>> onUse(ItemStack stack, LivingEntity user, Hand hand, TypedActionResult<ItemStack> result)
	{
		super.onUse(stack, user, hand, result);
		if(!(stack.get(DataComponentRegistry.CHARGE) instanceof ChargeComponent comp))
			return Optional.empty();
		Optional<ChargeComponent> newCharge = comp.tryConsumeCharge(1f);
		if(newCharge.isEmpty())
			return Optional.empty();
		stack.set(DataComponentRegistry.CHARGE, newCharge.get());
		castActiveAbility(user, stack, user.getPos());
		return Optional.of(TypedActionResult.success(stack));
	}
	
	@Override
	public void castActiveAbility(LivingEntity caster, ItemStack stack, Vec3d pos)
	{
		if(!caster.isSneaking())
			castHealwave(caster, stack, pos);
	}
	
	public static void castHealwave(LivingEntity caster, ItemStack stack, Vec3d pos)
	{
		World world = caster.getWorld();
		if(!world.isClient)
		{
			world.getEntitiesByType(TypeFilter.instanceOf(LivingEntity.class),
							Box.from(pos).expand(6f, 3f, 6f).offset(0, 1f, 0), i -> i.squaredDistanceTo(pos) < 6 * 6 && !(i instanceof HostileEntity))
					.forEach(living -> living.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 300, 2)));
			world.playSound(null, BlockPos.ofFloored(pos), SoundRegistry.BIG_LANTERN_HEALWAVE, SoundCategory.BLOCKS, 1f, 0.8f);
			if(world instanceof ServerWorld serverWorld)
				serverWorld.getPlayers().forEach(p -> ServerPlayNetworking.send(p,
						new CastActiveAbilityPayload(pos.toVector3f(), ItemAbilities.HEALWAVE.id, caster.getId(), stack)));
			return;
		}
		for (int i = 0; i < 4; i++)
		{
			Vec3d ppos = pos.add(0, 0.1 + i * 0.33f, 0);
			for (int ii = 0; ii < 32; ii++)
			{
				Vec3d vel = new Vec3d(0, 0, 0.25 + world.getRandom().nextFloat() * 0.2)
									.rotateY((float)Math.toRadians(ii / 32f * 360f + world.getRandom().nextFloat() * 10f));
				world.addParticle(ParticleTypes.FLAME, ppos.x, ppos.y, ppos.z, vel.x, vel.y, vel.z);
			}
		}
	}
}
