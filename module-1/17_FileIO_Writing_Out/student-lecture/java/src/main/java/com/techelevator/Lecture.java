package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) throws IOException {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter the path of a file or directory>>> ");
		String providedPath = userInput.nextLine();
		
		File f = new File(providedPath);
		
		
		//given a file object we can explore the file system
		System.out.println();
		
		if(f.exists()) {
			System.out.println("Name: " + f.getName());
			System.out.println("Absolute Path: " + f.getAbsolutePath());
			
			if(f.isDirectory()) {
				System.out.println("Type: Directory");
			}else if (f.isFile()) {
				System.out.println("Type: File");
			}
		}else {
			System.out.println("That file does not exist");
		}
		System.out.println();
		
		/*
		 * 
		 * Manipulating the file system
		 * 
		 */
		System.out.println("Great! Now lets create a new directory");
		System.out.println("Enter the path of the new directory>>> ");
		String newDirectoryPath = userInput.nextLine();
		
		File newDirectory = new File(newDirectoryPath);
		if(newDirectory.exists()) {
			System.out.println("Sorry, " + newDirectory.getAbsolutePath() + " already exists!");
			System.exit(1);
		}else {
			if(newDirectory.mkdir()) {
				System.out.println("New directory created at: " + newDirectory.getAbsolutePath());
			}else {
				System.out.println("Unable to create directory");
				System.exit(1);
			}
		}
		
		System.out.println();
		/***
		 * 
		 * 
		 * manipulating the filesystem - creating files
		 * 
		 */
		
		System.out.println("Great lets make a new file in the new directory");
		System.out.print("Enter the name for the new file >>>");
		String newFilePath = userInput.nextLine();
		
		
		File newFile = new File(newDirectory.getAbsolutePath(), newFilePath);
		
		if(newFile.exists()) {
			System.out.println("The new file exists already!");
			System.exit(1);
			}else {
				try {
					if(newFile.createNewFile()) {
						System.out.println("Name: " + newFile.getName());
						System.out.println("Absolue path: " + newFile.getAbsolutePath());
						System.out.println("Size: " + newFile.length());
					}else{
						System.out.println("Unable to create file!");
						System.exit(1);
					}
			}catch(IOException ioe) {
				System.out.println("Exception trying to create the new file");
				System.exit(1);
			}
		}
		
		/**
		 * 
		 * writing to a file
		 * 
		 */
		
		System.out.println();
		System.out.println("Ok lets write something to the file");
		System.out.print("Enter a message >>> ");
		String message = userInput.nextLine();

		try (PrintWriter writer = new PrintWriter(newFile)) {
			writer.println(message);
		} catch (FileNotFoundException fnf) {
			System.out.println("Couldn't open the file to writ to it!");
			System.exit(1);
		}
		
		System.out.println("We finished writing our files");
		
		
		
		
		/*
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file system path
		 */
		
		// this is old skooool  >>>>> FileWriter fw = new FileWriter(newFile); don't use, use PrintWriter in a try/resource block like above
		

	}

}
