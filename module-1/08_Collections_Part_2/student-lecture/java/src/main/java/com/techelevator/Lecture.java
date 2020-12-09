package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();
		
		//Tracks inventory for player
		Map<String, Integer> inventory = new HashMap<String, Integer>();
		
		
		Map<String,List<String>> players = new HashMap<String,List<String>>();
		
		//load up inventory with put
		inventory.put("pokeball", 10);
		inventory.put("potion", 5);
		inventory.put("rare candy",1);
		
		//replace an item
		inventory.put("pokeball", 15);
		
		//for comparison, we'll make a list for out player
		List<String> ourPlayer = new ArrayList<String>();
		ourPlayer.add("Charmander");
		ourPlayer.add("e");
		
		
		
		Map<String,Double> myTeamsHealth = new HashMap<String,Double>();
	}

}










