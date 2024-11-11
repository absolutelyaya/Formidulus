package absolutelyaya.formidulus.structure.processor;

import absolutelyaya.formidulus.structure.FormidableStructureProcessors;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Waterloggable;
import net.minecraft.state.property.Properties;
import net.minecraft.structure.StructurePlacementData;
import net.minecraft.structure.StructureTemplate;
import net.minecraft.structure.processor.StructureProcessor;
import net.minecraft.structure.processor.StructureProcessorType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class DehydrationProcessor extends StructureProcessor
{
	public static final MapCodec<DehydrationProcessor> CODEC =
			RecordCodecBuilder.mapCodec(instance -> instance.stable(new DehydrationProcessor()));
	
	@Nullable
	@Override
	public StructureTemplate.StructureBlockInfo process(WorldView world, BlockPos pos, BlockPos pivot, StructureTemplate.StructureBlockInfo originalBlockInfo, StructureTemplate.StructureBlockInfo cur, StructurePlacementData data)
	{
		BlockState state = cur.state();
		if(state.getBlock() instanceof Waterloggable && !state.isOf(Blocks.MANGROVE_ROOTS))
			return new StructureTemplate.StructureBlockInfo(cur.pos(), state.with(Properties.WATERLOGGED, false), cur.nbt());
		else if(state.isOf(Blocks.WATER))
			return new StructureTemplate.StructureBlockInfo(cur.pos(), Blocks.AIR.getDefaultState(), cur.nbt());
		return cur;
	}
	
	@Override
	protected StructureProcessorType<?> getType()
	{
		return FormidableStructureProcessors.DEHYDRATOR;
	}
}
