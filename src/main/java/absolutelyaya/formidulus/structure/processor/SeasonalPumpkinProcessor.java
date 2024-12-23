package absolutelyaya.formidulus.structure.processor;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.realtime.TimedEvent;
import absolutelyaya.formidulus.realtime.TimedEventHandler;
import absolutelyaya.formidulus.structure.FormidableStructureProcessors;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CarvedPumpkinBlock;
import net.minecraft.block.ObserverBlock;
import net.minecraft.structure.StructurePlacementData;
import net.minecraft.structure.StructureTemplate;
import net.minecraft.structure.processor.StructureProcessor;
import net.minecraft.structure.processor.StructureProcessorType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class SeasonalPumpkinProcessor extends StructureProcessor
{
	public static final MapCodec<SeasonalPumpkinProcessor> CODEC =
			RecordCodecBuilder.mapCodec(instance -> instance.point(new SeasonalPumpkinProcessor()));
	
	//remove pumpkins from a structure if it's currently over a certain margin of days away from halloween
	@Override
	protected StructureProcessorType<?> getType()
	{
		return FormidableStructureProcessors.SEASONAL_PUMPKINS;
	}
	
	@Nullable
	@Override
	public StructureTemplate.StructureBlockInfo process(WorldView world, BlockPos pos, BlockPos pivot, StructureTemplate.StructureBlockInfo originalBlockInfo, StructureTemplate.StructureBlockInfo cur, StructurePlacementData data)
	{
		BlockState state = cur.state();
		if(!TimedEventHandler.isActive(TimedEvent.WEEN))
		{
			if (state.isOf(Blocks.PUMPKIN))
				return new StructureTemplate.StructureBlockInfo(cur.pos(), Blocks.CAVE_AIR.getDefaultState(), cur.nbt());
			else if (state.isOf(Blocks.CARVED_PUMPKIN) && !world.getBlockState(cur.pos().down()).isOf(Blocks.HAY_BLOCK))
				return new StructureTemplate.StructureBlockInfo(cur.pos(), Blocks.CAVE_AIR.getDefaultState(), cur.nbt());
			else if (state.isOf(Blocks.JACK_O_LANTERN))
				return new StructureTemplate.StructureBlockInfo(cur.pos(), Blocks.LANTERN.getDefaultState(), cur.nbt());
		}
		if (state.isOf(Blocks.ORANGE_STAINED_GLASS))
			return new StructureTemplate.StructureBlockInfo(cur.pos(), Blocks.PUMPKIN.getDefaultState(), cur.nbt());
		else if(state.isOf(Blocks.OBSERVER))
			return new StructureTemplate.StructureBlockInfo(cur.pos(),
					Blocks.CARVED_PUMPKIN.getDefaultState().with(CarvedPumpkinBlock.FACING, state.get(ObserverBlock.FACING)), cur.nbt());
		return cur;
	}
}
