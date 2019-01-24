package base.truth.cause.effect.body;

import base.truth.cause.effect.util.Constant;

public class MindObject extends TransientObject {

	public String type;
	Thread runningMind;
	
	public MindObject()
	{
		this.type = Constant.MIND_TYPE_IGNORANCE;
	}
	
	public MindObject(MindObject inputMind)
	{
		this.type = inputMind.getType();
	}
	
	
	public MindObject process(MindObject mind)
	{
		MindObject outputMind = new MindObject(mind);
		
		// 
		// Multiple steps of thought process to turn Input to Output mind
		// Detail steps are to be placed here, and are omitted for now.
		//
		
		return outputMind;
	}
	
	/** 
	 * Mind can be of type -> SEEING, HEARING, SMELLING, TASTING, SENSATIONAL
	 * @param type
	 * 
	 */
	public MindObject(String type)
	{
		this.type = type;
	}
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
