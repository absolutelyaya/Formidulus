package absolutelyaya.formidulus.particle;

import net.minecraft.client.particle.SpriteBillboardParticle;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Vector3f;

public abstract class SpriteAAParticle extends SpriteBillboardParticle
{
	protected final SpriteProvider spriteProvider;
	
	protected Vec3d scale3d;
	
	protected SpriteAAParticle(ClientWorld world, double x, double y, double z, SpriteProvider spriteProvider)
	{
		super(world, x, y, z);
		float s = 0.1F * (this.random.nextFloat() * 0.5F + 0.5F) * 2.0F;
		this.scale3d = new Vec3d(s, s, s);
		this.spriteProvider = spriteProvider;
		sprite = spriteProvider.getSprite(random);
	}
	
	@Override
	public void buildGeometry(VertexConsumer vertexConsumer, Camera camera, float tickDelta)
	{
		Vec3d camPos = camera.getPos();
		Vec3d dir = new Vec3d(x, y, z).subtract(camPos).normalize();
		float f = (float)(MathHelper.lerp(tickDelta, this.prevPosX, this.x) - camPos.getX());
		float g = (float)(MathHelper.lerp(tickDelta, this.prevPosY, this.y) - camPos.getY());
		float h = (float)(MathHelper.lerp(tickDelta, this.prevPosZ, this.z) - camPos.getZ());
		
		Vector3f[] Vectors = new Vector3f[]{
				new Vector3f(-1.0F, -1.0F, 0.0F),
				new Vector3f(-1.0F, 1.0F, 0.0F),
				new Vector3f(1.0F, 1.0F, 0.0F),
				new Vector3f(1.0F, -1.0F, 0.0F)};
		
		for(int k = 0; k < 4; ++k)
		{
			Vector3f vec = Vectors[k];
			vec = vec.rotateY((float)Math.atan2(dir.x, dir.z));
			vec = vec.mul((float) scale3d.getX(), (float) scale3d.getY(), (float) scale3d.getZ());
			Vectors[k] = vec.add(f, g, h);
		}
		
		int n = this.getBrightness(tickDelta);
		vertexConsumer.vertex(Vectors[0].x, Vectors[0].y, Vectors[0].z).texture(getMaxU(), getMaxV()).color(this.red, this.green, this.blue, this.alpha).light(n);
		vertexConsumer.vertex(Vectors[1].x, Vectors[1].y, Vectors[1].z).texture(getMaxU(), getMinV()).color(this.red, this.green, this.blue, this.alpha).light(n);
		vertexConsumer.vertex(Vectors[2].x, Vectors[2].y, Vectors[2].z).texture(getMinU(), getMinV()).color(this.red, this.green, this.blue, this.alpha).light(n);
		vertexConsumer.vertex(Vectors[3].x, Vectors[3].y, Vectors[3].z).texture(getMinU(), getMaxV()).color(this.red, this.green, this.blue, this.alpha).light(n);
	}
}