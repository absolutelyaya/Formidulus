package absolutelyaya.formidulus.particle;

import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;

public class GatheringDarknessParticle extends DarknessParticle
{
	Vec3d center;
	
	protected GatheringDarknessParticle(ClientWorld clientWorld, double x, double y, double z, double velX, double velY, double velZ, SpriteProvider spriteProvider)
	{
		super(clientWorld, x + velX, y + velY, z + velZ, 0, -0.1, 0, spriteProvider);
		center = new Vec3d(x, y, z);
	}
	
	@Override
	public void tick()
	{
		super.tick();
		Vec3d pos = new Vec3d(x, y, z).lerp(center, (float)age / maxAge / 6f);
		setPos(pos.x, pos.y, pos.z);
	}
	
	public record Factory(SpriteProvider sprite) implements ParticleFactory<SimpleParticleType>
	{
		static Random rand = Random.create();
		
		@Override
		public Particle createParticle(SimpleParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ)
		{
			GatheringDarknessParticle particle = new GatheringDarknessParticle(world, x, y, z, velocityX, velocityY, velocityZ, sprite);
			particle.maxAge = 20 + (int)(10 * rand.nextFloat());
			return particle;
		}
	}
}
