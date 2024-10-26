package absolutelyaya.formidulus.structure;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.registries.StructureRegistry;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.Blocks;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.structure.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.Heightmap;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.StructureAccessor;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureType;

import java.util.Optional;

public class DeerCultHideoutStructure extends Structure
{
	static final Identifier ID = Formidulus.identifier("deer_cult_hideout");
	public static final MapCodec<DeerCultHideoutStructure> CODEC = DeerCultHideoutStructure.createCodec(DeerCultHideoutStructure::new);
	
	public DeerCultHideoutStructure(Config config)
	{
		super(config);
	}
	
	@Override
	protected Optional<StructurePosition> getStructurePosition(Context context)
	{
		return DeerCultHideoutStructure.getStructurePosition(context, Heightmap.Type.WORLD_SURFACE_WG, collector -> addPieces(collector, context));
	}
	
	@Override
	public StructureType<?> getType()
	{
		return StructureRegistry.DEER_CULT_HIDEOUT;
	}
	
	private void addPieces(StructurePiecesCollector collector, Structure.Context context)
	{
		getStructurePosition(context).ifPresent(pos -> {
			collector.addPiece(new Piece(StructureRegistry.DEER_CULT_HIDEOUT_PIECE, 0, context.structureTemplateManager(),
					ID, ID.toString(), new StructurePlacementData().setLiquidSettings(StructureLiquidSettings.IGNORE_WATERLOGGING)
											   .setPosition(pos.position().subtract(new BlockPos(30, 43, 30))),
					pos.position().subtract(new Vec3i(30, 43, 30))));
		});
	}
	
	public static class Piece extends SimpleStructurePiece
	{
		public Piece(StructurePieceType type, int length, StructureTemplateManager structureTemplateManager, Identifier id,
					 String template, StructurePlacementData placementData, BlockPos pos)
		{
			super(type, length, structureTemplateManager, id, template, placementData, pos);
		}
		
		public Piece(StructureContext context, NbtCompound nbt)
		{
			super(StructureRegistry.DEER_CULT_HIDEOUT_PIECE, nbt, context.structureTemplateManager(),
					identifier -> new StructurePlacementData().addProcessor(new GrowCropsProcessor(1f, Blocks.WHEAT.getDefaultState(), true)));
		}
		
		@Override
		public StructurePlacementData getPlacementData()
		{
			return super.getPlacementData();
		}
		
		@Override
		public void generate(StructureWorldAccess world, StructureAccessor structureAccessor, ChunkGenerator chunkGenerator,
							 Random random, BlockBox chunkBox, ChunkPos chunkPos, BlockPos pivot)
		{
			super.generate(world, structureAccessor, chunkGenerator, random, chunkBox, chunkPos, pivot);
		}
		
		@Override
		protected void handleMetadata(String metadata, BlockPos pos, ServerWorldAccess world, Random random, BlockBox boundingBox)
		{
		
		}
	}
}
