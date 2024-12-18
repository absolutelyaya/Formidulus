package absolutelyaya.formidulus.network;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.item.ItemStack;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;
import net.minecraft.util.Uuids;
import org.joml.Vector3f;

import java.util.UUID;

public record CastActiveAbilityPayload(Vector3f pos, Identifier ability, int caster, ItemStack stack) implements CustomPayload
{
	public static final Id<CastActiveAbilityPayload> ID = new Id<>(Formidulus.identifier("cast_active_ability"));
	public static final PacketCodec<RegistryByteBuf, CastActiveAbilityPayload> CODEC =
			PacketCodec.tuple(PacketCodecs.VECTOR3F, CastActiveAbilityPayload::pos,
					Identifier.PACKET_CODEC, CastActiveAbilityPayload::ability,
					PacketCodecs.INTEGER, CastActiveAbilityPayload::caster,
					ItemStack.PACKET_CODEC, CastActiveAbilityPayload::stack,
					CastActiveAbilityPayload::new);
	
	@Override
	public Id<? extends CustomPayload> getId()
	{
		return ID;
	}
}
