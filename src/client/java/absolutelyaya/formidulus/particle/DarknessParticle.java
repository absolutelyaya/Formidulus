package absolutelyaya.formidulus.particle;

import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.SimpleParticleType;

public class DarknessParticle extends SpriteBillboardParticle
{
	private final SpriteProvider spriteProvider;
	
	protected DarknessParticle(ClientWorld clientWorld, double x, double y, double z, double velX, double velY, double velZ, SpriteProvider spriteProvider)
	{
		super(clientWorld, x, y, z);
		this.spriteProvider = spriteProvider;
		setVelocity(velX, velY, velZ);
		scale = 0.35f + random.nextFloat() * 0.1f;
		maxAge = 20 + (int)(random.nextFloat() * 25);
		ascending = true;
		setColor(0f, 0f, 0f);
		setSpriteForAge(spriteProvider);
		collidesWithWorld = false;
	}
	
	@Override
	public ParticleTextureSheet getType()
	{
		return ParticleTextureSheet.PARTICLE_SHEET_OPAQUE;
	}
	
	@Override
	public void tick()
	{
		super.tick();
		setSpriteForAge(spriteProvider);
	}
	
	public record Factory(SpriteProvider sprite) implements ParticleFactory<SimpleParticleType>
	{
		@Override
		public Particle createParticle(SimpleParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ)
		{
			return new DarknessParticle(world, x, y, z, velocityX, velocityY, velocityZ, sprite);
		}
	}
}
