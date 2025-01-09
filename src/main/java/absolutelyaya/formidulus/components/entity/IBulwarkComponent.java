package absolutelyaya.formidulus.components.entity;

import absolutelyaya.formidulus.entities.BulwarkEntity;
import org.ladysnake.cca.api.v3.component.ComponentV3;
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent;

public interface IBulwarkComponent extends ComponentV3, AutoSyncedComponent
{
	void setBulwark(BulwarkEntity entity);
	
	BulwarkEntity getBulwarkEntity();
	
	boolean hasBulwark();
	
	float getBulwarkYaw();
	
	void onBulwarkBreak();
}
