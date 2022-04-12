package com.holly.repository;

import java.io.Serializable; 

/*  This is the base class for all plants
 * 
 *  JAVA BEAN includes 
 * - A Constructor Using Fields
 * - A No-Args Constructor
 * - Getters and Setters
 * - A Hashcode method
 * - An equals method
 * - A toString method
 * - Technically speaking, Java Beans should also implement the Serializable interface.
 */

public abstract class Nature implements Serializable {
	
	private boolean isHydroponic;
	private boolean isSeed;  
	
	public Nature () {
		super ();
		// need constructors - auto generate later
	}
	
	public Nature (boolean isHydroponic, boolean isSeed) {
		
		this.isHydroponic = isHydroponic;
		this.isSeed = isSeed;
	}
	
	// getters and setters
	
	public boolean isHydroponic () {
		return isHydroponic;
	}
	
	public void setIsHydroponic (boolean isHydroponic) {
		this.isHydroponic = isHydroponic;
	}
	
	public boolean isSeed() {
		return isSeed;
	}

	public void setSeed(boolean isSeed) {
		this.isSeed = isSeed;
	}
	
}
