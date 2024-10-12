package absolutelyaya.formidulus.item.components;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public record AccessoryComponent(List<String> modes, int activeMode)
{
	public static final AccessoryComponent DEFAULT = new AccessoryComponent(List.of("default"), 0);
	public static final Codec<AccessoryComponent> CODEC = RecordCodecBuilder.create(
			instance -> instance.group(
					Codec.list(Codec.STRING).fieldOf("modes").forGetter(AccessoryComponent::modes),
					Codec.INT.fieldOf("activeMode").forGetter(AccessoryComponent::activeMode)
			).apply(instance, AccessoryComponent::new));
	public static final PacketCodec<ByteBuf, AccessoryComponent> PACKET_CODEC = PacketCodec.tuple(
				PacketCodecs.STRING.collect(PacketCodecs.toList()),
				AccessoryComponent::modes,
				PacketCodecs.INTEGER,
				AccessoryComponent::activeMode,
				AccessoryComponent::new
			);
	
	@NotNull
	public AccessoryComponent cycle()
	{
		return new AccessoryComponent(modes, (activeMode + 1) % modes.size());
	}
}
