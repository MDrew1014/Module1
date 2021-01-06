package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RecipeWriter {

	public static void main(String[] args) {
		System.out.println("Enter the path to create a directory: ");
		Scanner userInput = new Scanner(System.in);
		String path = userInput.next();
		System.out.println("Enter the name of the desired a directory: ");
		path = path + userInput.next();
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
		System.out.println("Great! Lets create a new recipe");
		System.out.print("Enter the name for the new recipe >>> ");
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
			System.out.print("Enter first ingredient followed by the amount(i.e.Flour 1 T)>>>");
			String ingredient1 = userInput.nextLine();
			
			System.out.print("Enter the next ingredient followed by the amount(i.e. Olive Oil 1 cup)>>>");
			String ingredient2 = userInput.nextLine();
			
			System.out.print("Enter the next ingredient followed by the amount(i.e. Diced Tomatoes 4oz.)>>>");
			String ingredient3 = userInput.nextLine();
			
			System.out.print("Enter the next ingredient followed by the amount(i.e. Sugar 1 tsp.)>>>");
			String ingredient4 = userInput.nextLine();
			
			System.out.print("Enter the next ingredient followed by the amount(i.e. Beef Stock 2 cups)>>>");
			String ingredient5 = userInput.nextLine();
			
			System.out.print("Enter the next ingredient followed by the amount(i.e. Chicken Breasts 2 each)>>>");
			String ingredient6 = userInput.nextLine();
			
			System.out.print("Enter the next ingredient followed by the amount(i.e. Salt 1 pinch)>>>");
			String ingredient7 = userInput.nextLine();
			
			try(PrintWriter writer = new PrintWriter(newFile)){
				writer.println(ingredient1);
				writer.println(ingredient2);
				writer.println(ingredient3);
				writer.println(ingredient4);
				writer.println(ingredient5);
				writer.println(ingredient6);
				writer.println(ingredient7);
				
			}catch (FileNotFoundException fne) {
				System.out.println("Unable to write to the Recipe file.");
				System.exit(1);
			}
			
			
		
		
		
	
	}
	
	
	

}
