package base.truth.cause.effect.object;

import java.util.ArrayList;

public class Karma {

	//Karma itself is a aggregate
	ArrayList<Karma> karmas = new ArrayList<Karma>();
	
	String type;

	public Karma () 
	{
	}
	
	public Karma (String type)
	{
		this.type = type;
	}
	
	public void add(Karma newKarma)
	{
		karmas.add(newKarma);
		
		this.adjust();
		
		//it might also strike();
	}
	
	private void adjust(){
		/**
		 *  Natural process of karma adjustment
		 *  It may remove some karma
		 *  
		 */
	}
	
	private void strike(){
		/**
		 * Karma strike at its right time
		 * 
		 */
		
	}
	
	
	//getter setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
