package com.holly.repository;

public class NatureFactory {

	public static Nature getNature(String natureType) {
		
		switch(natureType) {
		case "plant":
			return new Plant();
		case "tree":
			return new Tree();
		default:
			return null; 
		}
	}
}
