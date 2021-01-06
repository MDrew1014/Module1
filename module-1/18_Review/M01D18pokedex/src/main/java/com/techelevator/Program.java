package com.techelevator;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		//print welcome method
		printWelcomeMessage();
		
		//prompt for a pokedex source
		
		//call a module that loads the pokedex
		
		//print a menu for them to access pokemon by number
		
		
		

	}

	
	private static void printFlowerBox(int numberOfRows) {
		for(int i = 0; i < numberOfRows; i++) {
			System.out.println("************************");
		}
	}
	
	private static void printWelcomeMessage() {
		int boxSize = 3;
		printFlowerBox(boxSize);
		System.out.println("Welcome to the PokeDex 2000");
		printFlowerBox(boxSize);
		System.out.println("\n\n\n");
	}
	
	
	
}
