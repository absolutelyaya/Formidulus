package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.registries.FormidableBannerPatterns;
import absolutelyaya.formidulus.structure.DeerCultHideoutStructure;
import absolutelyaya.formidulus.structure.FormidableBiomeTags;
import absolutelyaya.formidulus.structure.FormidableStructures;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.structure.StructureSet;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.pool.StructurePoolElement;
import net.minecraft.structure.pool.StructurePools;
import net.minecraft.util.collection.Pool;
import net.minecraft.world.StructureSpawns;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.chunk.placement.RandomSpreadStructurePlacement;
import net.minecraft.world.gen.chunk.placement.SpreadType;
import net.minecraft.world.gen.structure.Structure;

import java.util.List;
import java.util.Map;

public class Bootstrap
{
	static void bannerPatterns(Registerable<BannerPattern> registry)
	{
		registry.register(FormidableBannerPatterns.EYES, new BannerPattern(FormidableBannerPatterns.EYES.getValue(), "block.formidulus.banner.eyes"));
	}
	
	static void structures(Registerable<Structure> registry)
	{
		registry.register(FormidableStructures.DEER_CULT_HIDEOUT, new DeerCultHideoutStructure(new Structure.Config.Builder(
				registry.getRegistryLookup(RegistryKeys.BIOME).getOrThrow(FormidableBiomeTags.DEER_CULT_HIDEOUT_PLACEABLE))
						.step(GenerationStep.Feature.TOP_LAYER_MODIFICATION)
						.spawnOverrides(Map.of(SpawnGroup.MONSTER, new StructureSpawns(StructureSpawns.BoundingBox.STRUCTURE, Pool.empty()))).build()));
	}
	
	static void structureSets(Registerable<StructureSet> registry)
	{
		registry.register(FormidableStructures.DEER_CULT_HIDEOUT_SET,
				new StructureSet(registry.getRegistryLookup(RegistryKeys.STRUCTURE).getOrThrow(FormidableStructures.DEER_CULT_HIDEOUT),
				new RandomSpreadStructurePlacement(64, 26, SpreadType.LINEAR, 606734432)));
	}
	
	static void templatePools(Registerable<StructurePool> registry)
	{
		registry.register(FormidableStructures.DEER_CULT_HIDEOUT_POOL,
				new StructurePool(registry.getRegistryLookup(RegistryKeys.TEMPLATE_POOL).getOrThrow(StructurePools.EMPTY),
						List.of(new Pair<>(StructurePoolElement.ofSingle(
								FormidableStructures.DEER_CULT_HIDEOUT.getValue().toString()).apply(StructurePool.Projection.RIGID), 1))));
	}
}
