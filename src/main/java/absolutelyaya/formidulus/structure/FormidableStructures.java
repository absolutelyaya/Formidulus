package absolutelyaya.formidulus.structure;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.structure.StructureSet;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.processor.StructureProcessorList;
import net.minecraft.world.gen.structure.Structure;

public class FormidableStructures
{
	public static final RegistryKey<StructureSet> DEER_CULT_HIDEOUT_SET =
			RegistryKey.of(RegistryKeys.STRUCTURE_SET, Formidulus.identifier("deer_cult_hideout"));
	
	public static final RegistryKey<Structure> DEER_CULT_HIDEOUT =
			RegistryKey.of(RegistryKeys.STRUCTURE, Formidulus.identifier("deer_cult_hideout"));
	
	public static final RegistryKey<StructurePool> DEER_CULT_HIDEOUT_POOL =
			RegistryKey .of(RegistryKeys.TEMPLATE_POOL, Formidulus.identifier("deer_cult_hideout"));
	
	public static final RegistryKey<StructureProcessorList> DEER_CULT_PROCESSORS =
			RegistryKey.of(RegistryKeys.PROCESSOR_LIST, Formidulus.identifier("deer_cult_hideout"));
}
