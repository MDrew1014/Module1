package com.techelevator;

import java.io.File;
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
	
	
	
	private static File promptForPokedexFile(Scanner inputScanner) {
		File pokedexFile = null;
		
		while(pokedexFile == null) {
			System.out.print("Enter the csv file for your Pokedex:>>> ");
			String dexPath = inputScanner.nextLine();

			if (!dexPath.endsWith("csv")) {
				System.out.println("You must enter a csv file");
			} else {
				pokedexFile = new File(dexPath);
				if (pokedexFile.exists()) {
					System.out.println("You must enter an existing pokedex file");
					pokedexFile = null;
				} else if (!pokedexFile.isFile()) {
					System.out.println("You must enter a file not a directory");
					pokedexFile = null;
				} else if (!pokedexFile.canRead()) {
					System.out.println("You must give us a pokedex file we can read");
					pokedexFile = null;
				}
			}
		}
		return pokedexFile;
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
