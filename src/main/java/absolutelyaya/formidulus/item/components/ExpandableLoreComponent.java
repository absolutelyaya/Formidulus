package absolutelyaya.formidulus.item.components;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.text.*;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public record ExpandableLoreComponent(List<Text> lines)
{
	private static final Style STYLE = Style.EMPTY.withColor(Formatting.DARK_PURPLE).withItalic(true);
	public static final Codec<ExpandableLoreComponent> CODEC = TextCodecs.STRINGIFIED_CODEC.sizeLimitedListOf(256)
																	   .xmap(ExpandableLoreComponent::new, ExpandableLoreComponent::lines);
	public static final PacketCodec<RegistryByteBuf, ExpandableLoreComponent> PACKET_CODEC = TextCodecs.REGISTRY_PACKET_CODEC
																									 .collect(PacketCodecs.toList(256))
																									 .xmap(ExpandableLoreComponent::new, ExpandableLoreComponent::lines);
	
	public static ExpandableLoreComponent makeGeneric(Identifier itemId, int lines)
	{
		String key = "item." + itemId.getNamespace() + "." + itemId.getPath() + ".lore";
		List<Text> list = new ArrayList<>();
		for (int i = 0; i < lines; i++)
			list.add(Text.translatable(key + i).setStyle(STYLE));
		Lists.transform(list, line -> Texts.setStyleIfAbsent(line.copy(), STYLE));
		return new ExpandableLoreComponent(list);
	}
	
	public static ExpandableLoreComponent makeGeneric(Identifier itemId, int lines, Style style)
	{
		String key = "item." + itemId.getNamespace() + "." + itemId.getPath() + ".lore";
		List<Text> list = new ArrayList<>();
		for (int i = 0; i < lines; i++)
			list.add(Text.translatable(key + i));
		Lists.transform(list, line -> Texts.setStyleIfAbsent(line.copy(), style));
		return new ExpandableLoreComponent(list);
	}
}
