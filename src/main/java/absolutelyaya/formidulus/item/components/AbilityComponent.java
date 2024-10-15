package absolutelyaya.formidulus.item.components;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.item.abilities.ItemAbilities;
import absolutelyaya.formidulus.item.abilities.ItemAbility;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.util.Identifier;

public record AbilityComponent(ItemAbility ability)
{
	public static final AbilityComponent DEFAULT = new AbilityComponent(ItemAbilities.NONE);
	public static final Codec<AbilityComponent> CODEC = RecordCodecBuilder.create(
			instance -> instance.group(Identifier.CODEC.fieldOf("ability").forGetter(AbilityComponent::getTypeId))
								.apply(instance, AbilityComponent::fromIdentifier));
	public static final PacketCodec<ByteBuf, AbilityComponent> PACKET_CODEC = PacketCodec.tuple(
			Identifier.PACKET_CODEC,
			AbilityComponent::getTypeId,
			AbilityComponent::fromIdentifier
	);

	public Identifier getTypeId()
	{
		return Formidulus.identifier(ability.getName());
	}
	
	public static AbilityComponent fromIdentifier(Identifier id)
	{
		return new AbilityComponent(ItemAbilities.getFromId(id));
	}
}
