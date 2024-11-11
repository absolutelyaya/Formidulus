package absolutelyaya.formidulus.structure.processor;

import absolutelyaya.formidulus.structure.FormidableStructureProcessors;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.structure.StructurePlacementData;
import net.minecraft.structure.StructureTemplate;
import net.minecraft.structure.processor.StructureProcessor;
import net.minecraft.structure.processor.StructureProcessorType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class DeLeaferProcessor extends StructureProcessor
{
	public static final MapCodec<DeLeaferProcessor> CODEC =
			RecordCodecBuilder.mapCodec(instance -> instance.group(Codec.BOOL.fieldOf("removePersistent").forGetter(i -> i.removePersistent))
															.apply(instance, DeLeaferProcessor::new));
	public final boolean removePersistent;
	
	// I want to DeLeaf
	public DeLeaferProcessor(boolean removePersistent)
	{
		this.removePersistent = removePersistent;
	}
	
	@Nullable
	@Override
	public StructureTemplate.StructureBlockInfo process(WorldView world, BlockPos pos, BlockPos pivot, StructureTemplate.StructureBlockInfo originalBlockInfo, StructureTemplate.StructureBlockInfo currentBlockInfo, StructurePlacementData data)
	{
		if(currentBlockInfo.state().getBlock() instanceof LeavesBlock && (!currentBlockInfo.state().get(LeavesBlock.PERSISTENT) || removePersistent))
			return new StructureTemplate.StructureBlockInfo(currentBlockInfo.pos(), Blocks.GREEN_STAINED_GLASS.getDefaultState(), currentBlockInfo.nbt());
		return super.process(world, pos, pivot, originalBlockInfo, currentBlockInfo, data);
	}
	
	@Override
	protected StructureProcessorType<?> getType()
	{
		return FormidableStructureProcessors.DE_LEAFER;
	}
}
