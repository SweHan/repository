package base.truth.cause.effect.body;

public class OuterBody {

	String type;

	/** 
	 * Outer body can be of type -> SIGHT, VOICE, SMELL ,TASTE ,TOUCH
	 * @param type
	 */
	
	public OuterBody (String type)
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
