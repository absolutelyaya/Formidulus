package absolutelyaya.formidulus.structure;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.structure.processor.StructureProcessorType;

public class FormidableStructureProcessors
{
	public static final StructureProcessorType<GrowCropsProcessor> GROW_CROPS =
			Registry.register(Registries.STRUCTURE_PROCESSOR, Formidulus.identifier("grow_crops"), () -> GrowCropsProcessor.CODEC);
	
	public static void register()
	{
	
	}
}
