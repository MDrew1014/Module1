package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeWriter {

	public static void main(String[] args) {
		List<String> ingredients = new ArrayList<String>();
		List<String> step = new ArrayList<String>();
		System.out.println("Enter the path to create a directory: ");
		Scanner userInput = new Scanner(System.in);
		String path = userInput.nextLine();
		// Creating a File object
		File newDirectory = new File(path);
		// Creating the directory
		boolean bool = newDirectory.mkdir();
		if (bool) {
			System.out.println("Directory created successfully");
		} else {
			System.out.println("Sorry couldn’t create specified directory");
		}
		System.out.println();
		System.out.println("Great! Lets create a new recipe file");
		System.out.println("Enter the name for the new recipe file >>> ");
		String newFilePath = userInput.nextLine();
		
		//   same    =            directory                   ,  fileName
		File newFile = new File(newDirectory.getAbsolutePath(), newFilePath);
		
		if(newFile.exists()) {
			System.out.println("The recipe exists already!");
			System.exit(1);
		} else {
			try {
				if(newFile.createNewFile()) {
					System.out.println("name: " + newFile.getName());
				} else {
					System.out.println("Unable to create the recipe!");
					System.exit(1);
				}
			} catch(IOException ioe) {
			
				
				System.out.println("We failed trying to create the new recipe");
				
				System.exit(1);
			}
		}
			System.out.println();
			System.out.print("Enter the name of the recipe>>>");
			String recipeName = userInput.nextLine();
			System.out.println();
			
			
			
			while(true) {
				System.out.print("Enter the amount followed by the ingredient(i.e. 1 Cup Flour) or DONE to finish>>>");
				String ingredient = userInput.nextLine().trim();
				if(ingredient.contains("DONE")) {
					break;
				}else {
					//TODO add ingredient to ingredient list
					ingredients.add("\t" + ingredient);
				}
			}
			while(true) {
				System.out.print("Enter each step in the recipe creation or DONE to finish>>>");
				String steps = userInput.nextLine().trim();
				if(steps.contains("DONE")) {
					break;
				}else {
					//TODO add ingredient to ingredient list
					step.add( steps);
				}
			}
			System.out.println("Your recipe has been created!");
			try(PrintWriter writer = new PrintWriter(newFile)){
				int count = 0;
				writer.println(recipeName.toUpperCase());
				writer.println("*************************");
				writer.println("*************************");
				writer.println("*************************");
				for(String ingredient : ingredients) {
				writer.println("\t" + ingredient);
				}
				for(String steps : step) {
					count++;
				writer.println("Step " + count + " "+ steps);
				}
				
			}catch (FileNotFoundException fne) {
				
			}
			
			
		
		
		
	
	}
	
	
	

}
