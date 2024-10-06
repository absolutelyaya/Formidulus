package absolutelyaya.formidulus.util;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Vector2f;

public class RotationUtil
{
	public static Vector2f getRotationTowards(Vec3d origin, Vec3d destination)
	{
		double dx = destination.x - origin.x;
		double dy = destination.y - origin.y;
		double dz = destination.z - origin.z;
		double g = Math.sqrt(dx * dx + dz * dz);
		return new Vector2f((float)MathHelper.wrapDegrees(Math.toDegrees(MathHelper.atan2(dz, dx)) - 90f), (float)MathHelper.wrapDegrees(-Math.toDegrees(MathHelper.atan2(dy, g))));
	}
}
