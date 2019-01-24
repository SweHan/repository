package base.truth.cause.effect.body;

import java.util.ArrayList;

import base.truth.cause.effect.util.Constant;

public class Body {
	
	public ArrayList<MatrialObject> sensors;
	
	public Body()
	{
		MatrialObject eyes = new Eye();
		MatrialObject ears = new Ear();
		MatrialObject nose = new Nose();
		MatrialObject tongue = new Tongue();
		MatrialObject skinBody = new SkinBody();
		
		sensors.add(eyes);
		sensors.add(ears);
		sensors.add(nose);
		sensors.add(tongue);
		sensors.add(skinBody);
		
	}
}
