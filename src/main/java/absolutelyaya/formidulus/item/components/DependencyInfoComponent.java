package absolutelyaya.formidulus.item.components;

import absolutelyaya.formidulus.datagen.Lang;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.tooltip.TooltipAppender;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextCodecs;
import net.minecraft.util.Colors;
import net.minecraft.util.Formatting;
import net.minecraft.util.dynamic.Codecs;

import java.util.function.Consumer;

public record DependencyInfoComponent(String modid, Text text) implements TooltipAppender
{
	private static final Style STYLE = Style.EMPTY.withColor(Formatting.RED).withItalic(true);
	public static final Codec<DependencyInfoComponent> CODEC = RecordCodecBuilder.create(
			instance -> instance.group(
					Codecs.NON_EMPTY_STRING.fieldOf("modid").forGetter(DependencyInfoComponent::modid),
					TextCodecs.STRINGIFIED_CODEC.fieldOf("text").forGetter(DependencyInfoComponent::text)
			).apply(instance, DependencyInfoComponent::new));
	public static final PacketCodec<RegistryByteBuf, DependencyInfoComponent> PACKET_CODEC = PacketCodec.tuple(
			PacketCodecs.STRING,
			DependencyInfoComponent::modid,
			TextCodecs.PACKET_CODEC,
			DependencyInfoComponent::text,
			DependencyInfoComponent::new
	);
	
	public DependencyInfoComponent(String modid)
	{
		this(modid, Text.translatable(Lang.DEPENDENCY_INFO_DEFAULT, modid));
	}
	
	@Override
	public void appendTooltip(Item.TooltipContext context, Consumer<Text> tooltip, TooltipType type)
	{
		tooltip.accept(text.copy().setStyle(STYLE));
	}
}
