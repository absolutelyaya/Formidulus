package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.block.*;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class BlockRegistry
{
	public static final Block WEEN = Registry.register(Registries.BLOCK, Formidulus.identifier("ween"),
			new WearableCarvedPumpkinBlock(AbstractBlock.Settings.copy(Blocks.CARVED_PUMPKIN)));
	
	public static void register()
	{
	
	}
}
