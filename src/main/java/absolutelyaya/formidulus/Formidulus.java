package absolutelyaya.formidulus;

import absolutelyaya.formidulus.advancement.CriteriaRegistry;
import absolutelyaya.formidulus.commands.Commands;
import absolutelyaya.formidulus.config.ServerConfig;
import absolutelyaya.formidulus.datagen.Lang;
import absolutelyaya.formidulus.entities.boss.BossFightManager;
import absolutelyaya.formidulus.entities.boss.BossType;
import absolutelyaya.formidulus.realtime.TimedEventHandler;
import absolutelyaya.formidulus.registries.*;
import absolutelyaya.formidulus.structure.FormidableStructureProcessors;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.EmptyEntry;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ExplorationMapLootFunction;
import net.minecraft.loot.function.SetNameLootFunction;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;

public class Formidulus implements ModInitializer
{
	public static final Identifier FONT = Identifier.of("illageralt");
	public static final String MOD_ID = "formidulus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static ServerConfig config;
	public static boolean ENCHANCEMENT;
	final int dateCheckInterval = 72000;
	int lastDayOfYear, dateCheckTimer;

	@Override
	public void onInitialize()
	{
		BlockRegistry.register();
		BlockEntityRegistry.register();
		ItemRegistry.register();
		ParticleRegistry.register();
		EntityRegistry.register();
		PacketRegistry.register();
		StatusEffectRegistry.register();
		SoundRegistry.register();
		CriteriaRegistry.regiser();
		StructureRegistry.register();
		FormidableMapDecorations.register();
		FormidableStructureProcessors.register();
		Commands.register();
		
		BossType.init();
		TimedEventHandler.update();
		lastDayOfYear = Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
		
		ServerLifecycleEvents.SERVER_STARTING.register((server -> {
			dateCheckTimer = dateCheckInterval - Calendar.getInstance().get(Calendar.MINUTE) * 60 * 20;
		}));
		
		ServerTickEvents.END_SERVER_TICK.register((server) -> {
			BossFightManager.INSTANCE.tick();
			if(dateCheckTimer-- <= 0)
			{
				int day = Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
				if(lastDayOfYear != day)
				{
					TimedEventHandler.update();
					lastDayOfYear = day;
				}
				dateCheckTimer = dateCheckInterval;
			}
		});
		
		config = new ServerConfig();
		
		LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
			if(source.isBuiltin() && key.equals(LootTables.ANCIENT_CITY_CHEST))
			{
				LootPool.Builder poolBuilder = LootPool.builder();
				poolBuilder.with(EmptyEntry.builder().weight(24))
						.with(ItemEntry.builder(Items.MAP).weight(1))
						.apply(ExplorationMapLootFunction.builder()
									   .withDestination(TagRegistry.CULT_HIDEOUT)
									   .withDecoration(FormidableMapDecorations.CULT_HIDEOUT)
									   .withZoom((byte)2)
									   .searchRadius(64))
						.apply(SetNameLootFunction.builder(Text.translatable(Lang.MAP_CULT_HIDEOUT), SetNameLootFunction.Target.ITEM_NAME));
				tableBuilder.pool(poolBuilder);
			}
		});
		
		ENCHANCEMENT = FabricLoader.getInstance().getModContainer("enchancement").isPresent();
	}
	
	public static Identifier identifier(String path)
	{
		return Identifier.of(MOD_ID, path);
	}
}
