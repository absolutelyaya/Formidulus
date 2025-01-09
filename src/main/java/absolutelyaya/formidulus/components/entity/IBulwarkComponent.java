package absolutelyaya.formidulus.components.entity;

import absolutelyaya.formidulus.entities.BulwarkEntity;
import org.ladysnake.cca.api.v3.component.ComponentV3;

public interface IBulwarkComponent extends ComponentV3
{
	void setBulwark(BulwarkEntity entity);
	
	BulwarkEntity getBulwarkEntity();
	
	boolean hasBulwark();
	
	float getBulwarkYaw();
}
