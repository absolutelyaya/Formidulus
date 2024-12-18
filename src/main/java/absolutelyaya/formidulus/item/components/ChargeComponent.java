package absolutelyaya.formidulus.item.components;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;

import java.util.Optional;

public record ChargeComponent(float charge, float maxCharge)
{
	public static final Codec<ChargeComponent> CODEC = RecordCodecBuilder.create(
		instance -> instance.group(Codec.FLOAT.fieldOf("charge").forGetter(ChargeComponent::charge),
						Codec.FLOAT.fieldOf("maxCharge").forGetter(ChargeComponent::maxCharge))
							.apply(instance, ChargeComponent::new));
	public static final PacketCodec<ByteBuf, ChargeComponent> PACKET_CODEC = PacketCodec.tuple(
			PacketCodecs.FLOAT,
			ChargeComponent::charge,
			PacketCodecs.FLOAT,
			ChargeComponent::maxCharge,
			ChargeComponent::new
	);
	
	public boolean isCharged(float minPercent)
	{
		return getChargePercent() >= minPercent;
	}
	
	public ChargeComponent consumeCharge(float percent)
	{
		return new ChargeComponent(Math.max(charge - percent * maxCharge, 0f), maxCharge);
	}
	
	public Optional<ChargeComponent> tryConsumeCharge(float percent)
	{
		if(getChargePercent() < percent)
			return Optional.empty();
		return Optional.of(new ChargeComponent(Math.max(charge - percent * maxCharge, 0f), maxCharge));
	}
	
	public float getChargePercent()
	{
		return charge / maxCharge;
	}
}
