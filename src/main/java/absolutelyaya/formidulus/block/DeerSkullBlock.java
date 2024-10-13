package absolutelyaya.formidulus.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class DeerSkullBlock extends BlockWithEntity
{
	public static final MapCodec<DeerSkullBlock> CODEC = createCodec(DeerSkullBlock::new);
	public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
	
	public DeerSkullBlock(Settings settings)
	{
		super(settings);
	}
	
	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
	{
		super.appendProperties(builder);
		builder.add(FACING);
	}
	
	@Override
	protected MapCodec<? extends BlockWithEntity> getCodec()
	{
		return CODEC;
	}
	
	@Nullable
	@Override
	public BlockEntity createBlockEntity(BlockPos pos, BlockState state)
	{
		return new DeerSkullBlockEntity(pos, state);
	}
	
	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx)
	{
		return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
	}
	
	@Override
	protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos)
	{
		BlockPos clickedPos = pos.offset(state.get(FACING).getOpposite());
		return world.getBlockState(clickedPos).isSideSolidFullSquare(world, clickedPos, state.get(FACING));
	}
	
	@Override
	protected BlockRenderType getRenderType(BlockState state)
	{
		return BlockRenderType.MODEL;
	}
	
	@Override
	protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
	{
		return VoxelShapes.union(switch(state.get(FACING))
		{
			case NORTH -> Block.createCuboidShape(0, 0, 14, 16, 16, 16);
			case SOUTH -> Block.createCuboidShape(0, 0, 0, 16, 16, 2);
			case WEST -> Block.createCuboidShape(14, 0, 0, 16, 16, 16);
			default -> Block.createCuboidShape(0, 0, 0, 2, 16, 16);
		}, Block.createCuboidShape(2, 2, 2, 14, 14, 14));
	}
	
	@Override
	protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
	{
		return getCollisionShape(state, world, pos, context);
	}
}
