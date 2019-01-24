package base.truth.cause.effect.object;

import java.util.ArrayList;

import base.truth.cause.effect.body.Body;
import base.truth.cause.effect.body.MindObject;
import base.truth.cause.effect.body.OuterBody;
import base.truth.cause.effect.livingThing.Angel;
import base.truth.cause.effect.livingThing.Animal;
import base.truth.cause.effect.livingThing.Human;
import base.truth.cause.effect.livingThing.ManInHell;
import base.truth.cause.effect.util.Constant;

public class LivingThing {

	Body body;
	MindObject mind;
	Karma karma;
	
	MindObject wipasanaMind;
	private static boolean isEnligntened = false;
	
	
	public LivingThing(Karma pastKarma)
	{
		this.karma = pastKarma;
		this.body = new Body();  		//See what your Body made up of
		this.mind = new MindObject();	//See what your Mind made up of
	}
	
	public static void main(String[] args)
	{
		Karma karma__FromUncountablePastLives = new Karma(); 
		
		/**
		 * Although it says new Karma(), it simply means your karma From Uncountable Past Lives.
		 * Remember you are already living. 
		 * Meaning you are already in the loop. 
		 * the only while loop 
		 * 
		 */
		
		LivingThing me = new LivingThing(karma__FromUncountablePastLives);
		
		while(!me.isEnligntened)
		{
			me.circlingInLife();
		}
	}
	
	
	/**
	 * isTimeToDie: Karma will decide if it is your time to die.
	 * 
	 */
	public void circlingInLife()
	{
		boolean isAlive = true;
		boolean isTimeToDie = false; //Karma turn it into TRUE
		
		boolean isOld = false;
		boolean isSick = false;
		boolean isDeath = false;
		
		int age = 0;
		
		while(isAlive)
		{
			boolean healthy = true;
			
			// day by day, seconds by seconds, moments by moments 
			// there are uncountable sights to be seen, voices to be heard, smells to be smelled, food to be tasted, touches to be felt
			ArrayList<OuterBody> uncountableOuterbodies = new ArrayList<OuterBody>(); 
			for ( int i = 0; i < uncountableOuterbodies.size(); i++ )
			{
				for( int x = 0; x < this.body.sensors.size(); x++ ) 		/** click on sensors for details **/
				{
					MindObject thoughtByOutsiders = body.sensors.get( x ).trigger(uncountableOuterbodies.get(i));
					
					if(this.wipasanaMind != null) 	continue;	 	   		/** with wipasana mind no new karma is made **/
						
					this.mind = thoughtByOutsiders;
					
					doKarma(mind); 											/** click on doKarma() for details **/
				}
			}
			
			// day by day, seconds by seconds, moments by moments 
			// there are uncountable thoughts to be processed.
			ArrayList<MindObject> uncountableOtherThoughts = new ArrayList<MindObject>(); 
			for ( int i = 0; i < uncountableOtherThoughts.size(); i++ )
			{
				MindObject otherThoughts = uncountableOtherThoughts.get(i);
				
				if(this.wipasanaMind != null) 	continue;	 	   		/** with wipasana mind no new karma is made **/
				
				MindObject feelings = mind.trigger(otherThoughts);
				
				this.mind = feelings;
				
				doKarma(mind);												/** click on doKarma() for details **/
			}
			
			 //Inevitable Stage of lives - > OLD , SICK , DIE
			
			// escape()?
			if (age >= Constant.OLD_AGE) //Inevitable Old stage of life
			{
				isOld = true;
			}
			
			
			// escape()?
			if (healthy == false) //Inevitable Sick stage of life
			{
				isSick = true;
			}
			
			
			// escape()?
			if (isAlive == false) //Inevitable End stage of life
			{
				isDeath = true;
			}
			
			
			if ( age == Constant.MAX_AGE //    or it is just  ->    isTimeToDie
					|| isTimeToDie	)
			{
				isAlive = false;
				isDeath = true;
				
				break; //DIE!!
			}
			
			age++;
			// When will you escape()?      You may not reach here.
		}
		
		if(isDeath)
		{
			LivingThing newLife = this.die();				/** click on die() for how we reincarnate **/
			
			newLife.circlingInLife();				/** NEW life starts again. Endless loop is here **/
		}
		
	}
	
	public void doKarma(MindObject thoughts)
	{
		//based on the thoughts do below
		Karma daily_body_Karma 		= new Karma(Constant.KARMA_TYPE_BODY);
		Karma daily_speech_Karma 	= new Karma(Constant.KARMA_TYPE_SPEECH);
		Karma daily_mind_Karma 		= new Karma(Constant.KARMA_TYPE_MIND);
		
		karma.add(daily_body_Karma);
		karma.add(daily_speech_Karma);
		karma.add(daily_mind_Karma);
	}
	
	/**
	 * It is important to know how to die.
	 * Mind in your last moment has great impact for your next life, so does karma.
	 * 
	 */
	public LivingThing die ()
	{
		MindObject lastMomentMind = new MindObject("may be 'thinkingGood' / may be 'thinkingBad'"); 
		
		LivingThing newLife = null;
		
		newLife = reincarnate( lastMomentMind );   /** See how you Reincernate **/
		
		return newLife;
	}
	
	/**
	 * For simplicity only 4 life forms are listed here during reincarnation. 
	 * There could be 31 realms of life forms.
	 * 
	 * @param mindBeforeDealth
	 * @return
	 */
	public LivingThing reincarnate (MindObject mindBeforeDealth)
	{
		LivingThing nextLife = null;
		
		/** 
		 * Note that karma here is this.karma. 
		 * which mean karma in this life 
		 * **/
		
		if (	karma.getType() == Constant.doneGood  	&& 		mindBeforeDealth.type == "thinkGood")
		{
			nextLife = new Angel(karma);
		}
		else if (karma.getType() == Constant.doneNormal && 		mindBeforeDealth.type == "thinkGood")
		{
			nextLife = new Human(karma);
		}
		else if (karma.getType() == Constant.doneBad 	&& 		mindBeforeDealth.type == "thinkBad")
		{
			nextLife = new Animal(karma);
		}
		else if (karma.getType() == Constant.doneVeryBad && 	mindBeforeDealth.type == "thinkBad")
		{
			nextLife = new ManInHell(karma);
		}
		else if (wipasanaMind != null) 
		{
			// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			
			System.exit(0);
			
			/** 
			 * Having wipasana mind means you are aware of everything happening at the moment of your death.
			 * You are not focusing on suffering of sickness, nor having other thoughts.
			 * With right awareness and right focus properties of wipasanaMind, you reach to Nivarna.
			 *  
			 * You do not reincarnate anymore.
			 * Endless looping of your lives ends here.
			 * 
			 * 
			 * Note: Wipasana Mind only exists when you practice through meditation and self realizing. 
			 *      (see how one attain wipasana mind, i.e. initialization of wipasanaMind java object.)
			 * 
			 */
			
			// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			
			 
		}
			
		return nextLife;
	}
	
	
	
	
	
	/**** **** **** **** **** **** **** **** **** **** **** ****/
	//Below are method to Escape from Endless circulation of lives
	/**** **** **** **** **** **** **** **** **** **** **** ****/
	
	public void escape ()
	{
		int mindLevel = 0;
		
		practiceWipasana( practiceMeditation ( mindLevel ) );
		
	}
	
	/**
	 * With Meditation you can attain TaMaTha (level 1) mind first.
	 * Then you can gradually perceive Zen (level 2) consciousness.
	 * 
	 * @param currentLevel
	 * @return
	 */
	public int practiceMeditation(int currentLevel) {
		boolean concentrating = true;
		boolean concerntationGood = false;
		
		while(concentrating)
		{
			if(concerntationGood == true && currentLevel == 0)
			{
				return Constant.MIND_LVL_1_TAMAHTA;
			}
			else if(concerntationGood == true && currentLevel == 1)
			{
				return Constant.MIND_LVL_2_ZEN;
			}
		}
		
		return 0; // Bad concentration. You did not attain anything today.
	}

	/**
	 * Practicing Wipasana to uncover and realize the actual reality with ZEN (level 2) consciousness 
	 * 	will awake MEG (level 3) consciousness.
	 * 
	 * Then from there you will gradually perceive WiPaSaNa mind (i.e. level 4 consciousness).
	 * 
	 * @param currentLevel
	 * @return
	 */
	public int practiceWipasana(int currentLevel)
	{
		boolean concentrating = true;
		boolean concerntationGood = false;
		
		while(concentrating)
		{
			if(concerntationGood == true && currentLevel == 2)
			{
				return Constant.MIND_LVL_3_MEG;
			}
			else if(concerntationGood == true && currentLevel == 3)
			{
				this.wipasanaMind = new MindObject(); 
				
				/**
				 * 
				 * This is the Ultimate Final achievement of Buddhism.
				 * wipasanaMind is also know is PHO. 
				 * Together with level 3 MEG, they are know as MEG & PHO.
				 * 
				 * Note: Look for the codes to see how having wipasanaMind (i.e wipasansaMind <> null)
				 *  	 helps you to escape from endless looping of lives.
				 * 
				 */
				
				return Constant.MIND_LVL_4_WIPASANA;
			}
		}
		
		return 0; // Bad concentration. You did not attain anything today.
		
	}

	
}
