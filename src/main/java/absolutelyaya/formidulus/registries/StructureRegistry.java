package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.structure.DeerCultHideoutStructure;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.structure.StructurePieceType;
import net.minecraft.world.gen.structure.StructureType;

public class StructureRegistry
{
	public static final StructureType<DeerCultHideoutStructure> DEER_CULT_HIDEOUT = Registry.register(Registries.STRUCTURE_TYPE,
			Formidulus.identifier("deer_cult_hideout"), () -> DeerCultHideoutStructure.CODEC);
	
	public static final StructurePieceType DEER_CULT_HIDEOUT_PIECE = Registry.register(Registries.STRUCTURE_PIECE,
			Formidulus.identifier("deer_cult_hideout"), DeerCultHideoutStructure.Piece::new);
	
	public static void register()
	{
	
	}
}
