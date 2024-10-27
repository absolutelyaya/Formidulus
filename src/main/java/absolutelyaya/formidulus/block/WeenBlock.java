package absolutelyaya.formidulus.block;

import absolutelyaya.formidulus.registries.SoundRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.WearableCarvedPumpkinBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class WeenBlock extends WearableCarvedPumpkinBlock
{
	public WeenBlock(Settings settings)
	{
		super(settings);
	}
	
	@Override
	public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack)
	{
		super.onPlaced(world, pos, state, placer, itemStack);
		world.playSound(null, pos, SoundRegistry.WEEN, SoundCategory.BLOCKS);
	}
}
