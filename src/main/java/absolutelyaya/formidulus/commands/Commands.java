package absolutelyaya.formidulus.commands;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.realtime.TimedEventHandler;
import absolutelyaya.yayconfig.networking.OpenConfigScreenPayload;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.context.CommandContext;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.server.command.ServerCommandSource;

import static net.minecraft.server.command.CommandManager.literal;

public class Commands
{
	public static void register()
	{
		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, enviroment) -> {
			dispatcher.register(literal(Formidulus.MOD_ID)
										.requires(ServerCommandSource::isExecutedByPlayer).requires(source -> source.hasPermissionLevel(2))
										.then(literal("config")
													  .executes(Commands::executeOpenConfigMenu))
										.then(literal("debug")
													  .then(literal("forceUpdateTimedEvents").executes(Commands::executeDebugForceUpdateTimedEvents))));
		});
	}
	
	private static byte executeOpenConfigMenu(CommandContext<ServerCommandSource> context)
	{
		if(context.getSource().getPlayer() == null)
			return 0;
		ServerPlayNetworking.send(context.getSource().getPlayer(), new OpenConfigScreenPayload(Formidulus.config.getId()));
		return Command.SINGLE_SUCCESS;
	}
	
	private static int executeDebugForceUpdateTimedEvents(CommandContext<ServerCommandSource> context)
	{
		if(context.getSource().getPlayer() == null)
			return 0;
		TimedEventHandler.update();
		return Command.SINGLE_SUCCESS;
	}
}
