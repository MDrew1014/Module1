package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {
		
	File fizzBuzz = new File("FizzBuzz");
	String results = null;
	
		try (PrintWriter writer = new PrintWriter(fizzBuzz)) {
			for (int i = 1; i <= 300; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					results = "FizzBuzz";
				} else if (i % 5 == 0 || (Integer.toString(i).contains("5"))) {
					results = "Buzz";
				} else if (i % 3 == 0 || (Integer.toString(i).contains("3"))) {
					results = "Fizz";
				} else {
					results = Integer.toString(i);
				}writer.println(results);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("");
			System.exit(1);

		}

	}
}
