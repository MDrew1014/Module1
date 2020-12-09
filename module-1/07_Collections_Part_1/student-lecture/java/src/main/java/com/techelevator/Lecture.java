package com.techelevator;//our namespace

import java.util.ArrayList;//go to the java.util package and get the arrayList class and bring it to my namespace
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		
		List<String> names = new ArrayList<String>();
		names.add("Frodo");
		names.add("Sam");
		names.add("Bilbo");
		names.add("Merry");
		names.add("Aragorn");
		names.add("Gandalf");
		names.add("Legolas");

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
							//parenthesis means method
		int listSize = names.size();
		for (int i = 0; i < listSize; i++) {
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		names.add("Gandalf");
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		names.add(2,"Gimli");
		
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		names.remove(6);
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		
		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		
		if(names.contains("Gandalf")) {
			System.out.println("yur a wizard Harry");
		}else {
			System.out.println("Not a magical drop of blood in ya");
		}
	

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");
		
		int indexOfGandalf = names.indexOf("Gandalf");
		System.out.println("Gandalf is at position: "+ indexOfGandalf);


		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] namesArr = new String[names.size()];
		for(int i =0; i < names.size(); i++) {
			namesArr[i] = names.get(i);
			
		}
		System.out.println("####################");
		System.out.println("Arrays can be turned into a list");
		System.out.println("####################");
		
		List<String> names2 = new ArrayList<String>();
		
		for(int i = 0; i < namesArr.length; i++) {
			names2.add(namesArr[i]);
		}
		
		

		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");
		// changes order of list numerical or alphabetical
		Collections.sort(names);
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");
		
		Collections.reverse(names);
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}


		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();
		
		// typical patter for for loops
		//for(<declaration>; <conditional>; <iteration>)
		
		for(int i = 0; i < names.size(); i++){
			System.out.println(names.get(i));
		}
		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();
		
		//Java also has a foreach loop that looks like this
		//for(<declaration> : <collection>)
		// for each string name in the names list do{that}
		for(String name : names) {
			String excited = name + "!";
			System.out.println(name);
		}
		
	}
}
