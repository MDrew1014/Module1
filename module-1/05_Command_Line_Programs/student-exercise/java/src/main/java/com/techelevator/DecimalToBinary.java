package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {Scanner sc = new Scanner(System.in);
	int number;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Please enter in a series of decimal values (separated by spaces):");
	number = scanner.nextInt();
	
	System.out.println("Binary number is " + Integer.toBinaryString(number));
}
}

