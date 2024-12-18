package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.item.components.*;
import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import java.util.function.UnaryOperator;

public class DataComponentRegistry
{
	public static final ComponentType<AccessoryComponent> ACCESSORY = register("accessory",
			builder -> builder.codec(AccessoryComponent.CODEC).packetCodec(AccessoryComponent.PACKET_CODEC));
	public static final ComponentType<ExpandableLoreComponent> EXPANDABLE_LORE = register("expandable_lore",
			builder -> builder.codec(ExpandableLoreComponent.CODEC).packetCodec(ExpandableLoreComponent.PACKET_CODEC));
	public static final ComponentType<DamageTypeComponent> DAMAGE_TYPE = register("damage_type",
			builder -> builder.codec(DamageTypeComponent.CODEC).packetCodec(DamageTypeComponent.PACKET_CODEC));
	public static final ComponentType<AbilityComponent> ABILITY = register("ability",
			builder -> builder.codec(AbilityComponent.CODEC).packetCodec(AbilityComponent.PACKET_CODEC));
	public static final ComponentType<ChargeComponent> CHARGE = register("charge",
			builder -> builder.codec(ChargeComponent.CODEC).packetCodec(ChargeComponent.PACKET_CODEC));
	
	static <T> ComponentType<T> register(String id, UnaryOperator<ComponentType.Builder<T>> builder)
	{
		return Registry.register(Registries.DATA_COMPONENT_TYPE, Formidulus.identifier(id), builder.apply(ComponentType.builder()).build());
	}
}
