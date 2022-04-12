package com.holly;

import java.util.Set;
import java.util.HashMap;

import com.holly.repository.PlantRepoStatic;
import com.holly.repository.PlantRepository;
import com.holly.repository.Plant;

public class Driver {
	
	public static void main(String[] args) {
		
		PlantRepository plantRepository = PlantRepoStatic.getPlantRepository();
		// Logging method needed to track instantiated services - create service package
		Set<Plant> plant = plantRepository.findAllPlants();
			
		/* map -- uncomment when implemented
		* StringBuilder sBuilder = new StringBuilder();
		* StringBuffer sBuffer = new StringBuffer();
			*	String title = "Inventory";
					
		* instantiate & build SCANNER to allow user navigation of program
		* Begin with Boolean to show if user is interested 
		* While loop if user is interested 
		*Switch statements 
		*/ 
		}	
}