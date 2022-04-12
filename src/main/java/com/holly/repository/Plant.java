package com.holly.repository;

/* 	Plant: Name(unique?): Price: Sun: -- extends nature booleans: water: seed
	*/ 
	
public class Plant extends Nature {
	// instance variables accessible through plant class - 
	private String plantName;
	private short price;
	private String sun;
	
	//counts number of plant instances. public = accessible; static = shared across all instances
	public static int plantCount;
	
	
	// manual constructor 
	public Plant () {
		super();
		plantCount++; 
	}
	// Auto-generated constructor stub
	public Plant(String string, int i, String string2, boolean b, boolean c) {
	} 
	
	// overload of constructor that uses class fields
	public Plant (String plantName, short price, String sun, boolean isHydroponic, boolean isSeed) {
	this.plantName = plantName;
	this.price = price;
	this.sun = sun;
	plantCount++;
	}

	//getters and setters - indirectly write to or read from field
	public String getPlantName () {
		return plantName;
	}
	
	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}
	
	public short getPrice () {
		return price;
	}
	
	public void setPrice (short price) {
		this.price = price;
	}
	
	public String getSun () {
		return sun;
	}
	
	public void setSun (String sun) {
		this.sun = sun;
	}
}



