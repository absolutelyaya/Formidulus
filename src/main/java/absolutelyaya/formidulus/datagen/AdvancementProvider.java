package absolutelyaya.formidulus.datagen;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.advancement.BossFightWonCriterion;
import absolutelyaya.formidulus.entities.boss.BossType;
import absolutelyaya.formidulus.registries.EntityRegistry;
import absolutelyaya.formidulus.registries.FormidableMapDecorations;
import absolutelyaya.formidulus.registries.ItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementDisplay;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.advancement.criterion.ImpossibleCriterion;
import net.minecraft.advancement.criterion.OnKilledCriterion;
import net.minecraft.advancement.criterion.TickCriterion;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.map.MapState;
import net.minecraft.predicate.entity.EntityPredicate;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class AdvancementProvider extends FabricAdvancementProvider
{
	public static final AdvancementEntry ROOT;
	public static final AdvancementEntry CULTISTS;
	public static final AdvancementEntry DEER;
	public static final AdvancementEntry WEEN;
	
	protected AdvancementProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
	{
		super(output, registryLookup);
	}
	
	@Override
	public void generateAdvancement(RegistryWrapper.WrapperLookup registryLookup, Consumer<AdvancementEntry> consumer)
	{
		consumer.accept(ROOT);
		consumer.accept(CULTISTS);
		consumer.accept(DEER);
		consumer.accept(WEEN);
	}
	
	static {
		ItemStack stack = Items.FILLED_MAP.getDefaultStack();
		MapState.addDecorationsNbt(stack, BlockPos.ORIGIN, "+", FormidableMapDecorations.CULT_HIDEOUT);
		ROOT = Advancement.Builder.create()
					   .display(new AdvancementDisplay(stack,
							   Text.translatable(Lang.ADVANCEMENT_ROOT_TITLE),
							   Text.translatable(Lang.ADVANCEMENT_ROOT_DESCRIPTION),
							   Optional.of(Identifier.of("textures/block/polished_tuff.png")),
							   AdvancementFrame.TASK,
							   false,
							   false,
							   false))
					   .criterion("tick", TickCriterion.Conditions.createTick())
					   .build(Formidulus.identifier("root"));
		
		CULTISTS = Advancement.Builder.create()
						   .parent(ROOT)
						   .display(new AdvancementDisplay(ItemRegistry.SACRIFICIAL_DAGGER.getDefaultStack(),
								   Text.translatable(Lang.ADVANCEMENT_CULTISTS_TITLE),
								   Text.translatable(Lang.ADVANCEMENT_CULTISTS_DESCRIPTION),
								   Optional.empty(),
								   AdvancementFrame.TASK,
								   true,
								   true,
								   false))
						   .criterion("kill", OnKilledCriterion.Conditions
													  .createPlayerKilledEntity(EntityPredicate.Builder.create().type(EntityRegistry.DEER_FOLLOWER)))
						   .build(Formidulus.identifier("cultists"));
		
		DEER = Advancement.Builder.create()
										.parent(CULTISTS)
										.display(new AdvancementDisplay(ItemRegistry.DEER_SKULL.getDefaultStack(),
												Text.translatable(Lang.ADVANCEMENT_DEER_TITLE),
												Text.translatable(Lang.ADVANCEMENT_DEER_DESCRIPTION),
												Optional.empty(),
												AdvancementFrame.CHALLENGE,
												false,
												true,
												true))
										.criterion("win", BossFightWonCriterion.Conditions.createBossfigthWon(BossType.DEER.id()))
										.build(Formidulus.identifier("deer"));
		
		WEEN = Advancement.Builder.create()
					   .parent(ROOT)
					   .display(new AdvancementDisplay(ItemRegistry.WEEN.getDefaultStack(),
							   Text.translatable(Lang.ADVANCEMENT_WEEN_TITLE),
							   Text.translatable(Lang.ADVANCEMENT_WEEN_DESCRIPTION),
							   Optional.empty(),
							   AdvancementFrame.TASK,
							   true,
							   true,
							   true))
					   .criterion("ween", Criteria.IMPOSSIBLE.create(new ImpossibleCriterion.Conditions()))
					   .build(Formidulus.identifier("ween"));
	}
}
