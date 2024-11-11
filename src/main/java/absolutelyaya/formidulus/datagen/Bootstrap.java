package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.damage.DamageSources;
import absolutelyaya.formidulus.registries.FormidableBannerPatterns;
import absolutelyaya.formidulus.registries.FormidableTunes;
import absolutelyaya.formidulus.registries.SoundRegistry;
import absolutelyaya.formidulus.structure.*;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.damage.DamageScaling;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.structure.StructureSet;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.pool.StructurePoolElement;
import net.minecraft.structure.pool.StructurePools;
import net.minecraft.structure.processor.StructureProcessor;
import net.minecraft.structure.processor.StructureProcessorList;
import net.minecraft.text.Text;
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
						List.of(new Pair<>(StructurePoolElement.ofProcessedSingle(
								FormidableStructures.DEER_CULT_HIDEOUT.getValue().toString(),
								registry.getRegistryLookup(RegistryKeys.PROCESSOR_LIST).getOrThrow(FormidableStructures.DEER_CULT_PROCESSORS)
								).apply(StructurePool.Projection.RIGID), 1))));
	}
	
	static void processorLists(Registerable<StructureProcessorList> registry)
	{
		registry.register(FormidableStructures.DEER_CULT_PROCESSORS,
				new StructureProcessorList(
						List.of(new GrowCropsProcessor(1f, Blocks.WHEAT.getDefaultState(), true),
								new SeasonalPumpkinProcessor(30, 5))));
	}
	
	static void jukeboxSongs(Registerable<JukeboxSong> registry)
	{
		registry.register(FormidableTunes.DEER_PHASE1,
				new JukeboxSong(RegistryEntry.of(SoundRegistry.MUSIC_DEER_PHASE1), Text.translatable(Lang.MUSIC_DEER_PHASE1), (float)133, 12));
		registry.register(FormidableTunes.DEER_PHASE2,
				new JukeboxSong(RegistryEntry.of(SoundRegistry.MUSIC_DEER_PHASE2), Text.translatable(Lang.MUSIC_DEER_PHASE2), (float)151, 12));
	}
	
	static void damageTypes(Registerable<DamageType> registry)
	{
		registry.register(DamageSources.SACRIFICE, new DamageType("sacrifice", DamageScaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER, 0.1f));
		registry.register(DamageSources.LANTERN, new DamageType("lantern", DamageScaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER, 0.1f));
		registry.register(DamageSources.CLAW, new DamageType("claw", DamageScaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER, 0.1f));
		registry.register(DamageSources.TRAMPLE, new DamageType("trample", DamageScaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER, 0.1f));
		registry.register(DamageSources.SOULSTEAL, new DamageType("soulsteal", DamageScaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER, 0.1f));
		registry.register(DamageSources.SCORCH, new DamageType("scorch", DamageScaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER, 0.1f));
	}
}
