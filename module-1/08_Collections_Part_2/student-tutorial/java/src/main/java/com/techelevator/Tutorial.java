package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Tutorial {
	

    public static void main(String[] args) {

        // Step One: Declare a Map
    	Map<String, Boolean> dogs = new HashMap<String, Boolean>();
    	
    	// Step Two: Add items to a Map
    	dogs.put("Stuart", true);
    	dogs.put("Jaxson", true);
    	dogs.put("Olivia", true);
    	dogs.put("Harry", false);
    	dogs.put("Sally", false);
    	
    	
    	// Step Three: Loop through a Map

    for(Map.Entry<String, Boolean> dog : dogs.entrySet()) {
    	if(dog.getValue()) {
    		System.out.println(dog.getKey() + " is a dog.");
    	}else {
    		System.out.println(dog.getKey() + " is a cat.");
    	}
    }
    }
}


