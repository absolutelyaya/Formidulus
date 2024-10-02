package absolutelyaya.formidulus;

import com.chocohead.mm.api.ClassTinkerers;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.MappingResolver;

public class EarlyRiser implements Runnable
{
	
	@Override
	public void run()
	{
		MappingResolver remapper = FabricLoader.getInstance().getMappingResolver();
		
		String bossbarStyle = remapper.mapClassName("intermediary", "net.minecraft.class_1259$class_1261");
		ClassTinkerers.enumBuilder(bossbarStyle, String.class)
				.addEnum("DEER", "deer").build();
	}
}
