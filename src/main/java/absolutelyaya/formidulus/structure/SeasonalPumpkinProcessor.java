package absolutelyaya.formidulus.structure;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.registries.TagRegistry;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.structure.StructurePlacementData;
import net.minecraft.structure.StructureTemplate;
import net.minecraft.structure.processor.StructureProcessor;
import net.minecraft.structure.processor.StructureProcessorType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ServerWorldAccess;

import java.util.List;

public class SeasonalPumpkinProcessor extends StructureProcessor
{
	public static final MapCodec<SeasonalPumpkinProcessor> CODEC =
			RecordCodecBuilder.mapCodec(instance -> instance.group(Codec.INT.fieldOf("preMargin").orElse(30).forGetter(i -> i.preMargin),
					Codec.INT.fieldOf("postMargin").orElse(16).forGetter(i -> i.postMargin)
			).apply(instance, SeasonalPumpkinProcessor::new));
	
	public final int preMargin, postMargin;
	public final boolean keepAllPumpkins;
	
	//remove pumpkins from a structure if it's currently over a certain margin of days away from halloween
	public SeasonalPumpkinProcessor(int preMargin, int postMargin)
	{
		this.preMargin = preMargin;
		this.postMargin = postMargin;
		int daysUntilHalloween = Formidulus.getDaysUntilHalloween();
		keepAllPumpkins = daysUntilHalloween > preMargin && daysUntilHalloween < postMargin;
	}
	
	@Override
	protected StructureProcessorType<?> getType()
	{
		return FormidableStructureProcessors.SEASONAL_PUMPKINS;
	}
	
	@Override
	public List<StructureTemplate.StructureBlockInfo> reprocess(ServerWorldAccess world, BlockPos pos, BlockPos pivot, List<StructureTemplate.StructureBlockInfo> originalBlockInfos, List<StructureTemplate.StructureBlockInfo> currentBlockInfos, StructurePlacementData data)
	{
		if(keepAllPumpkins)
			return currentBlockInfos;
		for (StructureTemplate.StructureBlockInfo cur : currentBlockInfos)
		{
			if (cur.state().isOf(Blocks.PUMPKIN) && !hasStem(world, cur.pos()))
				world.setBlockState(cur.pos(), Blocks.CAVE_AIR.getDefaultState(), Block.NOTIFY_ALL);
			else if (cur.state().isOf(Blocks.CARVED_PUMPKIN) && !world.getBlockState(cur.pos().down()).isOf(Blocks.HAY_BLOCK))
				world.setBlockState(cur.pos(), Blocks.CAVE_AIR.getDefaultState(), Block.NOTIFY_ALL);
			else if (cur.state().isOf(Blocks.JACK_O_LANTERN))
			{
				BlockState neighbor = world.getBlockState(cur.pos().down());
				world.setBlockState(cur.pos(), ((neighbor.isAir() || neighbor.isIn(TagRegistry.PUMPKIN)) ? Blocks.CAVE_AIR : Blocks.LANTERN).getDefaultState(),
						Block.NOTIFY_ALL);
			}
		}
		return currentBlockInfos;
	}
	
	boolean hasStem(ServerWorldAccess world, BlockPos pos)
	{
		return world.getBlockState(pos.north()).isOf(Blocks.PUMPKIN_STEM) || world.getBlockState(pos.east()).isOf(Blocks.PUMPKIN_STEM) ||
					   world.getBlockState(pos.south()).isOf(Blocks.PUMPKIN_STEM) || world.getBlockState(pos.west()).isOf(Blocks.PUMPKIN_STEM);
	}
}
