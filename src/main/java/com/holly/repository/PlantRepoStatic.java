package com.holly.repository;

import java.util.Set;
import java.util.TreeSet;

import com.holly.repository.Plant;
import com.holly.repository.PlantRepoStatic;
import com.revature.model.Cupcake;
import com.revature.repository.CupcakeRepositoryImpl;

public abstract class PlantRepoStatic implements PlantRepository {
	
	private static PlantRepoStatic plantRepository;
	public static int counter; 
	
	//Array with mock data - connect to DB soon
	//Singleton: creating a private constructor of the class to restrict object creation outside of the class
	
	private Set<Plant> plants = new TreeSet<Plant>();
	private Object plant;
	
	
	//public Plant (String plantName, short price, String sun, boolean isHydroponic, boolean isSeed)
	//Sun = 1 = Shade, 2 = Indirect Sun, 3 = Full Sun 
	private PlantRepoStatic() {
		super();
		this.plants.add(new Plant("Monstera", 10, "Indirect Sun", false, false));
		this.plants.add(new Plant("Pothos", 5, "Indirect Sun", true, false));
		this.plants.add(new Plant("Spinach", 2, "Full Sun", false, true));
		this.plants.add(new Plant("Gardenia", 7, "Full Sun", false, false));
		counter++;
	}
	
	public static synchronized CupcakeRepositoryImpl getCupcakeRepository() {
		if(cupcakeRepository == null) {
			cupcakeRepository = new CupcakeRepositoryImpl();
		}
		return cupcakeRepository;
	}
	
	/*
	 * Now that we have our constructor, let's think about methods that simulate data access. For instance, we know that we need to
	 * read from our array of cupcakes as there would be no way to list all of these cupcakes from our repository if we didn't at least
	 * allow for this. That said, let's make a method that returns the array of cupcakes to the caller.
	 */
	
	public Set<Cupcake> findAllCupcakes() {
		return this.cupcakes;
	}
	
	///////////////////////////////////////////////////////////////////////////////
		
		public static synchronized PlantRepoStatic getPlantRepository() {
			if (plantRepository == null) {
				plantRepository = new PlantRepoStatic();
			}
			return plantRepository;
		}
	}
	
	

}
