package absolutelyaya.formidulus.particle;

import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.ParticleTextureSheet;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.MathHelper;
import org.joml.Vector3f;

public class BloodDropParticle extends SpriteAAParticle
{
	Vector3f destination;
	float targetRiseSpeed;
	int attractDelay;
	
	protected BloodDropParticle(ClientWorld world, double x, double y, double z, SpriteProvider spriteProvider, Vector3f destination)
	{
		super(world, x, y, z, spriteProvider);
		this.destination = destination;
		collidesWithWorld = false;
		gravityStrength = 0f;
		attractDelay = (int)(random.nextFloat() * 40f);
		maxAge = 200 + (int)Math.ceil(attractDelay * 1.5f);
		scale = 0.1f;
		setSpriteForAge(spriteProvider);
	}
	
	@Override
	public ParticleTextureSheet getType()
	{
		return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
	}
	
	@Override
	public void tick()
	{
		prevPosX = x;
		prevPosY = y;
		prevPosZ = z;
		if (age++ >= maxAge)
		{
			markDead();
			return;
		}
		if(age == 35)
			targetRiseSpeed = random.nextFloat() * 0.5f + 0.15f;
		if(age >= 35 && age < 70)
			velocityY = MathHelper.lerp(0.01 * (age - 35) / 45f, velocityY, targetRiseSpeed);
		if(age >= 90 + attractDelay && age < 110 + attractDelay)
			velocityY = MathHelper.lerp(random.nextFloat() * 0.3f, velocityY, 0f);
		if(age >= 120 + attractDelay * 1.5f)
		{
			Vector3f pos = new Vector3f((float)x, (float)y, (float)z);
			Vector3f dir = new Vector3f(destination).sub(pos).normalize();
			float distance = destination.distance(pos);
			float speed = Math.min((age - (120f + attractDelay * 1.5f)) / (maxAge - (120f + attractDelay * 1.5f)), distance);
			Vector3f vel = new Vector3f((float)velocityX, (float)velocityY, (float)velocityZ)
								   .lerp(new Vector3f(dir).mul(speed), 0.1f + Math.min(1f - distance / 100f, 0.5f));
			velocityX = vel.x;
			velocityY = vel.y;
			velocityZ = vel.z;
			if(destination.distance(pos) < 0.4f)
				markDead();
		}
		setSpriteForAge(spriteProvider);
		move(velocityX, velocityY, velocityZ);
	}
	
	@Override
	public void setSpriteForAge(SpriteProvider spriteProvider)
	{
		if(dead)
			return;
		setSprite(spriteProvider.getSprite((int)(Math.min(age / 40f, 1f) * maxAge), maxAge));
	}
	
	public record Factory(SpriteProvider sprite) implements ParticleFactory<BloodDropParticleEffect>
	{
		@Override
		public Particle createParticle(BloodDropParticleEffect parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ)
		{
			return new BloodDropParticle(world, x, y + 0.2f, z, sprite, parameters.destination());
		}
	}
}
