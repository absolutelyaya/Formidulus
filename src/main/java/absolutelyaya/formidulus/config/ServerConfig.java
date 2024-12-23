package absolutelyaya.formidulus.config;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.datagen.Lang;
import absolutelyaya.yayconfig.config.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ServerConfig extends Config
{
	static final Identifier BG_TEX = Identifier.of("textures/block/stone_bricks.png");
	public final FloatEntry cultistMendingChance = new FloatEntry("cultist_mending_chance", 0.1f).setIcon(getIconPath("mending_chance"));
	public final BooleanEntry deerWarning = new BooleanEntry("deer_warning", true).setIcon(getIconPath("deer_warning"));
	public final IntegerEntry fightCheckInterval = new IntegerEntry("fight_check_inverval", 100).setIcon(getIconPath("fight_check_interval"));
	public final FloatEntry jollyChance = new FloatEntry("jolly_chance", 0.01f).setIcon(getIconPath("jolly_mobs"));
	
	public ServerConfig()
	{
		super(Formidulus.identifier("world"));
		addEntry(new Comment(" ## ############################# ##  #"));
		addEntry(new Comment("     Welcome to Config Zone"));
		addEntry(new Comment(" ## ############################# ##  #"));
		addEntry(cultistMendingChance);
		addEntry(deerWarning);
		addEntry(fightCheckInterval);
		addEntry(jollyChance);
	}
	
	@Override
	protected String getFileName()
	{
		return "world.properties";
	}
	
	@Override
	public Text getTitle()
	{
		return Text.translatable(Lang.SCREEN_CONFIG_TITLE);
	}
	
	@Override
	public Identifier getBackgroundTexture()
	{
		return BG_TEX;
	}
	
	Identifier getIconPath(String name)
	{
		return Formidulus.identifier("textures/gui/rule_icons/" + name + ".png");
	}
}
