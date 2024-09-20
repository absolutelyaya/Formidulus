package absolutelyaya.formidulus.particle;

import absolutelyaya.formidulus.registries.ParticleRegistry;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.*;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.util.dynamic.Codecs;
import org.joml.Vector3f;

import java.util.stream.Stream;

public record BloodDropParticleEffect(Vector3f destination) implements ParticleEffect
{
	@Override
	public ParticleType<?> getType()
	{
		return ParticleRegistry.BLOOD_DROP_PARTICLE;
	}
	
	public static MapCodec<BloodDropParticleEffect> getMapCodec()
	{
		return Codecs.VECTOR_3F.xmap(BloodDropParticleEffect::new, BloodDropParticleEffect::destination).fieldOf("destination");
	}
	
	public static PacketCodec<? super RegistryByteBuf, BloodDropParticleEffect> getPacketCodec()
	{
		return PacketCodecs.VECTOR3F.xmap(BloodDropParticleEffect::new, BloodDropParticleEffect::destination);
	}
}
