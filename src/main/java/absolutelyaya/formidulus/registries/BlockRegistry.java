package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.block.BigLanternBlock;
import absolutelyaya.formidulus.block.BossSpawnerBlock;
import absolutelyaya.formidulus.block.DeerSkullBlock;
import absolutelyaya.formidulus.block.WeenBlock;
import net.minecraft.block.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;

public class BlockRegistry
{
	public static final Block WEEN = Registry.register(Registries.BLOCK, Formidulus.identifier("ween"),
			new WeenBlock(AbstractBlock.Settings.copy(Blocks.CARVED_PUMPKIN)));
	public static final Block DEER_SKULL = Registry.register(Registries.BLOCK, Formidulus.identifier("deer_skull"),
			new DeerSkullBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS).nonOpaque()));
	public static final Block BOSS_SPAWNER = Registry.register(Registries.BLOCK, Formidulus.identifier("boss_spawner"),
			new BossSpawnerBlock(AbstractBlock.Settings.copy(Blocks.COMMAND_BLOCK).nonOpaque()));
	public static final Block GREAT_LANTERN = Registry.register(Registries.BLOCK, Formidulus.identifier("great_lantern"),
			new BigLanternBlock(AbstractBlock.Settings.copy(Blocks.LANTERN).nonOpaque().luminance(BigLanternBlock::getLuminance).sounds(BlockSoundGroup.LANTERN)
										 .strength(6f, 10f).requiresTool()));
	
	public static void register()
	{
	
	}
}
