package absolutelyaya.formidulus.structure;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.structure.processor.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.structure.processor.StructureProcessorType;

public class FormidableStructureProcessors
{
	public static final StructureProcessorType<GrowCropsProcessor> GROW_CROPS =
			Registry.register(Registries.STRUCTURE_PROCESSOR, Formidulus.identifier("grow_crops"), () -> GrowCropsProcessor.CODEC);
	public static final StructureProcessorType<SeasonalPumpkinProcessor> SEASONAL_PUMPKINS =
			Registry.register(Registries.STRUCTURE_PROCESSOR, Formidulus.identifier("seasonal_pumpkins"), () -> SeasonalPumpkinProcessor.CODEC);
	public static final StructureProcessorType<DehydrationProcessor> DEHYDRATOR =
			Registry.register(Registries.STRUCTURE_PROCESSOR, Formidulus.identifier("dehydrator"), () -> DehydrationProcessor.CODEC);
	public static final StructureProcessorType<DeLeaferProcessor> DE_LEAFER =
			Registry.register(Registries.STRUCTURE_PROCESSOR, Formidulus.identifier("deleafer"), () -> DeLeaferProcessor.CODEC);
	
	public static void register()
	{
	
	}
}
