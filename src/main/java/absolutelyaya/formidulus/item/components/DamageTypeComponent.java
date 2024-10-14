package absolutelyaya.formidulus.item.components;

import absolutelyaya.formidulus.damage.DamageSources;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public record DamageTypeComponent(RegistryKey<DamageType> damageType)
{
	public static final DamageTypeComponent DEFAULT = new DamageTypeComponent(DamageTypes.PLAYER_ATTACK);
	public static final Codec<DamageTypeComponent> CODEC = RecordCodecBuilder.create(
		instance -> instance.group(Identifier.CODEC.fieldOf("damageType").forGetter(DamageTypeComponent::getTypeId))
							.apply(instance, DamageTypeComponent::fromIdentifier));
	public static final PacketCodec<ByteBuf, DamageTypeComponent> PACKET_CODEC = PacketCodec.tuple(
			Identifier.PACKET_CODEC,
			DamageTypeComponent::getTypeId,
			DamageTypeComponent::fromIdentifier
	);
	
	public Identifier getTypeId()
	{
		return damageType.getRegistry();
	}
	
	public static DamageTypeComponent fromIdentifier(Identifier type)
	{
		return new DamageTypeComponent(RegistryKey.of(RegistryKeys.DAMAGE_TYPE, type));
	}
	
	public DamageSource getSource(LivingEntity attacker)
	{
		return DamageSources.get(attacker.getWorld(), damageType, attacker);
	}
}
