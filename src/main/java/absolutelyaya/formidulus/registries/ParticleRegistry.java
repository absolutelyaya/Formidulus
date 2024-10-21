package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.particle.BloodDropParticleEffect;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.ParticleType;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ParticleRegistry
{
	public static final SimpleParticleType DARKNESS = Registry.register(Registries.PARTICLE_TYPE,
			Formidulus.identifier("darkness"), FabricParticleTypes.simple());
	public static final SimpleParticleType RISING_DARKNESS = Registry.register(Registries.PARTICLE_TYPE,
			Formidulus.identifier("rising_darkness"), FabricParticleTypes.simple());
	public static final SimpleParticleType GATHERING_DARKNESS = Registry.register(Registries.PARTICLE_TYPE,
			Formidulus.identifier("gathering_darkness"), FabricParticleTypes.simple());
	
	public static final ParticleType<BloodDropParticleEffect> BLOOD_DROP_PARTICLE = Registry.register(Registries.PARTICLE_TYPE,
			Formidulus.identifier("blood_drop"), FabricParticleTypes.complex(BloodDropParticleEffect.getMapCodec(), BloodDropParticleEffect.getPacketCodec()));
	
	public static void register()
	{
	
	}
}
