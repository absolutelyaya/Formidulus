package absolutelyaya.formidulus.structure;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.structure.StructurePlacementData;
import net.minecraft.structure.StructureTemplate;
import net.minecraft.structure.processor.StructureProcessor;
import net.minecraft.structure.processor.StructureProcessorType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldView;

public class GrowCropsProcessor extends StructureProcessor
{
	public static final MapCodec<GrowCropsProcessor> CODEC =
			RecordCodecBuilder.mapCodec(instance -> instance.group(Codec.FLOAT.fieldOf("chance").orElse(1f).forGetter(i -> i.chance),
					BlockState.CODEC.fieldOf("crop").orElse(Blocks.WHEAT.getDefaultState()).forGetter(i -> i.crop),
					Codec.BOOL.fieldOf("randomlyAge").orElse(false).forGetter(i -> i.randomlyAge)
					).apply(instance, GrowCropsProcessor::new));
	
	static final Random random = Random.create();
	final float chance;
	final BlockState crop;
	final boolean randomlyAge;
	
	public GrowCropsProcessor(float chance, BlockState crop, boolean randomlyAge)
	{
		this.chance = chance;
		this.crop = crop;
		this.randomlyAge = randomlyAge;
	}
	
	@Override
	protected StructureProcessorType<?> getType()
	{
		return FormidableStructureProcessors.GROW_CROPS;
	}
	
	@Override
	public StructureTemplate.StructureBlockInfo process(WorldView world, BlockPos pos, BlockPos pivot,
														StructureTemplate.StructureBlockInfo originalBlockInfo,
														StructureTemplate.StructureBlockInfo currentBlockInfo,
														StructurePlacementData data)
	{
		BlockState state = crop;
		if(randomlyAge)
			state = state.with(CropBlock.AGE, random.nextInt(CropBlock.MAX_AGE));
		if(currentBlockInfo.state().isAir() && world.getBlockState(currentBlockInfo.pos().down()).isOf(Blocks.FARMLAND) && random.nextFloat() <= chance)
			return new StructureTemplate.StructureBlockInfo(currentBlockInfo.pos(), state, currentBlockInfo.nbt());
		return currentBlockInfo;
	}
}
