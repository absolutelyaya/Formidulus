package absolutelyaya.formidulus.block;

import absolutelyaya.formidulus.network.OpenBossSpawnerScreenPayload;
import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.EntityShapeContext;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class BossSpawnerBlock extends BlockWithEntity
{
	public static final MapCodec<BossSpawnerBlock> CODEC = createCodec(BossSpawnerBlock::new);
	
	public BossSpawnerBlock(Settings settings)
	{
		super(settings);
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
		return new BossSpawnerBlockEntity(pos, state);
	}
	
	@Override
	protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
	{
		return VoxelShapes.empty();
	}
	
	@Override
	protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
	{
		if(context instanceof EntityShapeContext entityShapeContext && entityShapeContext.getEntity() instanceof PlayerEntity player && player.isCreative())
			return VoxelShapes.fullCube();
		return VoxelShapes.empty();
	}
	
	@Nullable
	@Override
	public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type)
	{
		return world.isClient ? null : (w, p, s, t) -> BossSpawnerBlockEntity.tick(w.getBlockEntity(p));
	}
	
	@Override
	protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit)
	{
		if(player.hasPermissionLevel(2))
		{
			if(!world.isClient && player instanceof ServerPlayerEntity serverPlayer)
				ServerPlayNetworking.send(serverPlayer, new OpenBossSpawnerScreenPayload(pos));
			return ActionResult.CONSUME;
		}
		return super.onUse(state, world, pos, player, hit);
	}
	
	@Override
	public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player)
	{
		if(world.getBlockEntity(pos) instanceof BossSpawnerBlockEntity spawner)
			spawner.onBlockBroken();
		return super.onBreak(world, pos, state, player);
	}
}
