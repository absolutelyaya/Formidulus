package absolutelyaya.formidulus.components;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.components.entity.BulwarkComponent;
import absolutelyaya.formidulus.components.entity.IBulwarkComponent;
import org.ladysnake.cca.api.v3.component.ComponentKey;
import org.ladysnake.cca.api.v3.component.ComponentRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentFactoryRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentInitializer;
import org.ladysnake.cca.api.v3.entity.RespawnCopyStrategy;

public class FormidableComponents implements EntityComponentInitializer
{
	public static final ComponentKey<IBulwarkComponent> BULWARK =
			ComponentRegistry.getOrCreate(Formidulus.identifier("bulwark"), IBulwarkComponent.class);
	
	@Override
	public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry)
	{
		registry.registerForPlayers(BULWARK, BulwarkComponent::new, RespawnCopyStrategy.NEVER_COPY);
	}
}
