package com.techelevator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class WordSearch {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		File inputFile = getInputFileFromUser(inputScanner);
		String searchString = getSearchString(inputScanner);
		boolean caseSensitive = isCaseSensitive(inputScanner);
		try (Scanner fileScanner = new Scanner(inputFile)) {
			for (int lineNumber = 1; fileScanner.hasNextLine(); lineNumber++) {
				String line = fileScanner.nextLine();
				if (caseSensitive && line.contains(searchString)) {
					System.out.print(lineNumber + ") " + line + "\n");
					}else if (!caseSensitive && line.toLowerCase().contains(searchString.toLowerCase())){
					System.out.print(lineNumber + ") " + line + "\n");
					
				}

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static File getInputFileFromUser(Scanner userInput) {
		
		System.out.print("What is the file that should be searched?");
		String path = userInput.nextLine();
		File inputFile = new File(path);
		if(!inputFile.exists() ) {
			System.out.println(path+ " does not exist");
			System.exit(1);
		} else if(!inputFile.isFile()) {
			System.out.println(path+ " is not a file");
			System.exit(1);
		}
		return inputFile;
	}
	
	private static String getSearchString(Scanner userInput) {
		System.out.print("What string should we search for ?");
		String searchString = userInput.nextLine();
		return searchString;
	}
	
	private static boolean isCaseSensitive(Scanner userInput) {
		while(true) {
		System.out.println("Should the search be case sensitive? (Y/N)");
		String yesOrNo = userInput.nextLine().toLowerCase();
		if(yesOrNo.charAt(0) == 'y') {
			return true;
		} else if(yesOrNo.charAt(0) == 'n') {
			return false;
		}else {
			System.out.println("Please enter Y or N!!!");
			
		}}
	}
	
	
	
	
	
}	