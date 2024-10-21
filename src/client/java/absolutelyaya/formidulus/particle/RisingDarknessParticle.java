package absolutelyaya.formidulus.particle;

import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.util.math.random.Random;

public class RisingDarknessParticle extends DarknessParticle
{
	protected RisingDarknessParticle(ClientWorld clientWorld, double x, double y, double z, double velX, double velY, double velZ, SpriteProvider spriteProvider)
	{
		super(clientWorld, x, y, z, velX, velY, velZ, spriteProvider);
		maxAge = 150;
		velocityMultiplier = 0.925f;
	}
	
	@Override
	public void tick()
	{
		super.tick();
		if(age > maxAge / 3f)
			velocityY += 0.005f;
	}
	
	public record Factory(SpriteProvider sprite) implements ParticleFactory<SimpleParticleType>
	{
		static Random rand = Random.create();
		
		@Override
		public Particle createParticle(SimpleParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ)
		{
			RisingDarknessParticle particle = new RisingDarknessParticle(world, x, y, z, velocityX, velocityY, velocityZ, sprite);
			particle.maxAge = 100 + (int)(50 * rand.nextFloat());
			return particle;
		}
	}
}
