package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.item.components.AccessoryComponent;
import absolutelyaya.formidulus.item.components.DamageTypeComponent;
import absolutelyaya.formidulus.item.components.ExpandableLoreComponent;
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
	public static final ComponentType<DamageTypeComponent> DAMAGE_TYPE = register("expandable_lore",
			builder -> builder.codec(DamageTypeComponent.CODEC).packetCodec(DamageTypeComponent.PACKET_CODEC));
		
		static <T> ComponentType<T> register(String id, UnaryOperator<ComponentType.Builder<T>> builder)
		{
			return Registry.register(Registries.DATA_COMPONENT_TYPE, Formidulus.identifier(id), builder.apply(ComponentType.builder()).build());
		}
}
