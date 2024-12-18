package absolutelyaya.formidulus.block;

import absolutelyaya.formidulus.item.abilities.HealwaveAbility;
import absolutelyaya.formidulus.item.components.ChargeComponent;
import absolutelyaya.formidulus.registries.DataComponentRegistry;
import absolutelyaya.formidulus.registries.ItemRegistry;
import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BigLanternBlock extends BlockWithEntity
{
	public static final MapCodec<BigLanternBlock> CODEC = createCodec(BigLanternBlock::new);
	public static final BooleanProperty CHAINED = BooleanProperty.of("chained");
	public static final IntProperty CHARGE = IntProperty.of("charge", 0, 4);
	
	public BigLanternBlock(Settings settings)
	{
		super(settings);
		setDefaultState(getDefaultState().with(CHARGE, 4));
	}
	
	@Override
	protected MapCodec<? extends BlockWithEntity> getCodec()
	{
		return CODEC;
	}
	
	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
	{
		builder.add(CHAINED).add(CHARGE);
		super.appendProperties(builder);
	}
	
	@Nullable
	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx)
	{
		BlockState state = getDefaultState().with(CHAINED, ctx.getWorld().getBlockState(ctx.getBlockPos().up()).isIn(ConventionalBlockTags.CHAINS));
		if(ctx.getStack().get(DataComponentRegistry.CHARGE) instanceof ChargeComponent chargeComp)
			state = state.with(CHARGE, (int)MathHelper.clamp(chargeComp.getChargePercent() * 4, 0, 4));
		return state;
	}
	
	@Override
	protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos)
	{
		if(direction.equals(Direction.UP))
			state = state.with(CHAINED, world.getBlockState(neighborPos).isIn(ConventionalBlockTags.CHAINS));
		return state;
	}
	
	@Override
	public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player)
	{
		if(state.get(CHARGE) > 0)
		{
			for (int i = 0; i < 4 * state.get(CHARGE); i++)
			{
				Vec3d ppos = pos.toCenterPos().addRandom(world.getRandom(), 0.4f);
				Vec3d vel = Vec3d.ZERO.addRandom(world.getRandom(), 0.1f);
				world.addParticle(ParticleTypes.FLAME, ppos.x, ppos.y, ppos.z, vel.x, vel.y, vel.z);
			}
		}
		return super.onBreak(world, pos, state, player);
	}
	
	@Override
	protected List<ItemStack> getDroppedStacks(BlockState state, LootContextParameterSet.Builder builder)
	{
		List<ItemStack> stacks = super.getDroppedStacks(state, builder);
		for (ItemStack stack : stacks)
			if(stack.isOf(asItem()))
				stack.set(DataComponentRegistry.CHARGE, new ChargeComponent(state.get(CHARGE), 4));
		return stacks;
	}
	
	@Override
	protected BlockRenderType getRenderType(BlockState state)
	{
		return BlockRenderType.MODEL;
	}
	
	@Override
	protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit)
	{
		if(state.get(CHARGE) == 4 && !(player.isSneaking() || player.getMainHandStack().isOf(Items.DEBUG_STICK)))
		{
			if(world.isClient)
				return ActionResult.SUCCESS;
			world.addSyncedBlockEvent(pos, this, 0, 0);
			world.setBlockState(pos, state.with(CHARGE, 0));
			HealwaveAbility.castHealwave(player, ItemRegistry.BIG_LANTERN.getDefaultStack(), pos.toBottomCenterPos());
			if(world.getBlockEntity(pos) instanceof BigLanternBlockEntity lantern)
				lantern.startRechargeTimer();
			world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);
			return ActionResult.SUCCESS;
		}
		return super.onUse(state, world, pos, player, hit);
	}
	
	@Override
	protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
	{
		float rim = 2.5f / 16f, innerRim = 3.5f / 16f;
		return VoxelShapes.union(VoxelShapes.cuboid(rim, 0f, rim, 1f - rim, 4f / 16f, 1f - rim),
				VoxelShapes.cuboid(innerRim, 4f / 16f, innerRim, 1f - innerRim, 1f, 1f - innerRim),
				VoxelShapes.cuboid(rim, 14f / 16f, rim, 1f - rim, 15f / 16f, 1f - rim));
	}
	
	@Override
	protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
	{
		float rim = 2.5f / 16f;
		return VoxelShapes.cuboid(rim, 0f, rim, 1f - rim, 1f, 1f - rim);
	}
	
	public static int getLuminance(BlockState state)
	{
		return switch(state.get(CHARGE))
		{
			default -> 15;
			case 0 -> 0;
			case 1 -> 4;
			case 2 -> 8;
			case 3 -> 12;
		};
	}
	
	@Nullable
	@Override
	public BlockEntity createBlockEntity(BlockPos pos, BlockState state)
	{
		return new BigLanternBlockEntity(pos, state);
	}
	
	@Nullable
	@Override
	public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type)
	{
		return world.isClient ? null : (w, p, s, t) -> BigLanternBlockEntity.tick(w.getBlockEntity(p));
	}
	
	@Override
	public ItemStack getPickStack(WorldView world, BlockPos pos, BlockState state)
	{
		ItemStack stack = super.getPickStack(world, pos, state);
		stack.set(DataComponentRegistry.CHARGE, new ChargeComponent(state.get(CHARGE), 4));
		return stack;
	}
}
