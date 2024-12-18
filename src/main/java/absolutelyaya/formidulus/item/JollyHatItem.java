package absolutelyaya.formidulus.item;

import absolutelyaya.formidulus.item.components.AccessoryComponent;
import absolutelyaya.formidulus.registries.DataComponentRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.block.Blocks;
import net.minecraft.block.DispenserBlock;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Equipment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.RaycastContext;

public class JollyHatItem extends Item implements Equipment, FabricItem
{
	public static final String ACCESSORY_MODE_ACTIVE = "active", ACCESSORY_MODE_INACTIVE = "inactive";
	
	public JollyHatItem(Item.Settings settings)
	{
		super(settings);
		DispenserBlock.registerBehavior(this, ArmorItem.DISPENSER_BEHAVIOR);
	}
	
	@Override
	public EquipmentSlot getSlotType()
	{
		return EquipmentSlot.HEAD;
	}
	
	public static boolean tickSnowfall(LivingEntity entity, ItemStack stack)
	{
		AccessoryComponent accessory = stack.get(DataComponentRegistry.ACCESSORY);
		if(accessory == null || !accessory.modes().get(accessory.activeMode()).equals(ACCESSORY_MODE_ACTIVE))
			return false;
		Random random = entity.getRandom();
		if(random.nextFloat() > 0.2f)
			return true;
		Vec3d pos = Vec3d.ZERO.addRandom(random, 1f).multiply(1.5, 0.2f, 1.5).add(entity.getEyePos()).add(0, 1f, 0);
		if(!entity.getWorld().raycast(new RaycastContext(entity.getEyePos(), pos, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.ANY, entity))
					.getType().equals(HitResult.Type.MISS))
			return true;
		entity.getWorld().addParticle(new BlockStateParticleEffect(ParticleTypes.FALLING_DUST, Blocks.SNOW_BLOCK.getDefaultState()),
				pos.x, pos.y, pos.z, 0, 0, 0);
		return true;
	}
}
