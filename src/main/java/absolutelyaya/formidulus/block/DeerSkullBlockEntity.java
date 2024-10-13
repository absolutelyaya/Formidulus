package absolutelyaya.formidulus.block;

import absolutelyaya.formidulus.registries.BlockEntityRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class DeerSkullBlockEntity extends BlockEntity
{
	public DeerSkullBlockEntity(BlockPos pos, BlockState state)
	{
		super(BlockEntityRegistry.DEER_SKULL, pos, state);
	}
}
