package base.truth.cause.effect.body;

import java.util.ArrayList;

import base.truth.cause.effect.util.Constant;

public class TransientObject {

	/** 
	 * Transient: A Nate Sa object
	 * 
	 */
	public TransientObject()
	{

	}
	
	/**
	 * Mind returned is suffering.
	 * 
	 * @param outerBody
	 * @return
	 */
	public MindObject trigger (OuterBody outerBody)
	{
		MindObject triggeredMind = null; //As known as "Suffering Mind"
		
		if ( this instanceof Eye 
				&& 	outerBody.getType().equals( Constant.OUTER_BODY_TYPE_SIGHT ) ) 
		{
			triggeredMind = new MindObject(Constant.MIND_TYPE_SEEING);
		}
		else if ( this instanceof Ear 
				&& 	outerBody.getType().equals( Constant.OUTER_BODY_TYPE_VOICE ) ) 
		{
			triggeredMind = new MindObject(Constant.MIND_TYPE_HEARING);
		}
		else if ( this instanceof Nose 
				&& 	outerBody.getType().equals( Constant.OUTER_BODY_TYPE_SMELL ) ) 
		{
			triggeredMind = new MindObject(Constant.MIND_TYPE_SMELLING);
		}
		else if ( this instanceof Tongue 
				&& 	outerBody.getType().equals( Constant.OUTER_BODY_TYPE_TASTE ) ) 
		{
			triggeredMind = new MindObject(Constant.MIND_TYPE_TASTING);
		}
		else if( this instanceof SkinBody 
				&& 	outerBody.getType().equals( Constant.OUTER_BODY_TYPE_TOUCH ) ) 
		{
			triggeredMind = new MindObject(Constant.MIND_TYPE_SENSATION);
		}
		
		return triggeredMind;
	}
	
	/**
	 * Mind returned is suffering.
	 * 
	 * @param outerBody
	 * @return
	 */
	public MindObject trigger (MindObject thought)
	{
		MindObject triggeredMind = null; //As known as "Suffering Mind"
		
		if ( this instanceof MindObject ) 
		{
			MindObject myThought = (MindObject) this;
			triggeredMind = myThought.process(thought); 
		}
		
		return triggeredMind;
	}
}
