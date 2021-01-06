package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AddressBook {
	
	private final static String ADDRESS_PATH = "AddressBook";
	
	//helper method
	public static File createAddressFolderIfNeeded() {
		File addressBook = new File(ADDRESS_PATH);
		//does this exist?
		if(addressBook.exists()) {
			if (addressBook.isDirectory()) {
				return addressBook;
		}else {
			System.out.println("Address book already exists and is not a folder");
			System.exit(1);
			return null;
		}
		}else {
			if(addressBook.mkdir()) {
				return addressBook;
			}else {
				System.out.println("unable to make addressbook");
				System.exit(1);
				return null;
			}
		}
		// if yes make sure the file object is a directory
	}

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		// Make sure I have a local address book directory created
		// create if it doesn't exist
		File addressBook = createAddressFolderIfNeeded();
		// prompt user for a name
		System.out.print("Enter the name of your contact >>> ");
		String name = inputScanner.nextLine();
		
		String fileName = name.replace(" ","_") +".txt";
		
		File addressFile = new File(addressBook.getAbsolutePath(), fileName);
		if(addressFile.exists()){
			System.out.println(" file already exists");
			System.out.print("update existing record y/n >>>");
		}
		
		// check if we have an address for the user already
		// if so allow them to y/n update address
		// prompt for address line one
		// prompt for address line one
		// prompt for city
		// prompt for state
		// prompt for zip
		// open a file and write out the address content
		

	}

}
