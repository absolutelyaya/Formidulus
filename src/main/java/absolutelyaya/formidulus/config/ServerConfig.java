package absolutelyaya.formidulus.config;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.yayconfig.config.Comment;
import absolutelyaya.yayconfig.config.Config;

public class ServerConfig extends Config
{
	public ServerConfig()
	{
		super(Formidulus.identifier("world"));
		addEntry(new Comment(" ## ############################# ##  #"));
		addEntry(new Comment("     Welcome to Config Zone"));
		addEntry(new Comment(" ## ############################# ##  #"));
	}
	
	@Override
	protected String getFileName()
	{
		return "world.properties";
	}
}
