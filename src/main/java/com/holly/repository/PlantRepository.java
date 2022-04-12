package com.holly.repository;

import java.util.Set;
// import com.holly.repository.Plant;

//import.java.util[database]

public interface PlantRepository {
	
	public Set<Plant> findAllPlants();
	public Plant findPlantByName(String name);
	public Set<Plant> findPlantByName(String...name);

}
