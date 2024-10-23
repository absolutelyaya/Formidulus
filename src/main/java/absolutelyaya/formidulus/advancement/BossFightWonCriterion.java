package absolutelyaya.formidulus.advancement;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.advancement.AdvancementCriterion;
import net.minecraft.advancement.criterion.AbstractCriterion;
import net.minecraft.predicate.entity.EntityPredicate;
import net.minecraft.predicate.entity.LootContextPredicate;
import net.minecraft.predicate.entity.LootContextPredicateValidator;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class BossFightWonCriterion extends AbstractCriterion<BossFightWonCriterion.Conditions>
{
	@Override
	public Codec<Conditions> getConditionsCodec()
	{
		return Conditions.CODEC;
	}
	
	public void trigger(ServerPlayerEntity player, Identifier bossId)
	{
		super.trigger(player, conditions -> bossId.equals(conditions.bossId));
	}
	
	public record Conditions(Optional<LootContextPredicate> player, Identifier bossId) implements AbstractCriterion.Conditions
	{
		public static final Codec<BossFightWonCriterion.Conditions> CODEC = RecordCodecBuilder.create(instance -> instance.group(
					EntityPredicate.LOOT_CONTEXT_PREDICATE_CODEC.optionalFieldOf("player").forGetter(BossFightWonCriterion.Conditions::player),
					Identifier.CODEC.fieldOf("bossId").forGetter(BossFightWonCriterion.Conditions::bossId)
				).apply(instance, BossFightWonCriterion.Conditions::new)
		);
		
		public static AdvancementCriterion<Conditions> createBossfigthWon(Identifier bossId)
		{
			return CriteriaRegistry.BOSSFIGHT_WIN.create(new Conditions(Optional.empty(), bossId));
		}
		
		@Override
		public void validate(LootContextPredicateValidator validator)
		{
			AbstractCriterion.Conditions.super.validate(validator);
		}
	}
}
