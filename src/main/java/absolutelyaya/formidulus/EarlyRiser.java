package absolutelyaya.formidulus;

import absolutelyaya.formidulus.registries.SoundRegistry;
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
				.addEnum("FORMIDULUS_DEER", "formidulus_deer").build();
		
		String damageEffect = remapper.mapClassName("intermediary", "net.minecraft.class_8107");
		String soundEvent = "L" + remapper.mapClassName("intermediary", "net.minecraft.class_3414") + ";";
		ClassTinkerers.enumBuilder(damageEffect, String.class, soundEvent)
				.addEnum("FORMIDULUS_LANTERN", () -> new Object[]{"formidulus_lantern", SoundRegistry.LANTERN_DAMAGE})
				.addEnum("FORMIDULUS_CLAW", () -> new Object[]{"formidulus_claw", SoundRegistry.CLAW_DAMAGE}).build();
	}
}
