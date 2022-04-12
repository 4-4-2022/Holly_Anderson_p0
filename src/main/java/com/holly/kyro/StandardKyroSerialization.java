package com.holly.kyro;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Output;
import com.holly.repository.Plant;

//can also create custom serializers with kyro -- new class and then put methods in there 

public class StandardKyroSerialization {
	
	public static void Main (String[] args) {
		//Kyro class is standard 
				Kryo kryo = new Kryo();
				kryo.register(Plant.class);
				
				//Why am I only serializing one?
				Plant plant = new Plant("Monstera", 10, "Indirect Sun", false, false);
				
				//Specify my output stream, which is STDOUT
				Output output = new Output(System.out);
				kryo.writeObject(output, plant);
				output.close();
	}

	public StandardKyroSerialization() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
