package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
	public class MakeChange {
		
		public static void main(String[] args) {
			 Scanner scanner = new Scanner(System.in);
			 System.out.println("Welcome to the Change Calculator");
			 System.out.print("Enter the bill amount: ");
			 String makeChangeString = scanner.nextLine();
			 double makeChange = Double.parseDouble(makeChangeString);
			 System.out.println("The bill amount you entered as a decimal is " + makeChange);
			 System.out.print("Please enter the amount you paid: ");
			 String paidAmountString = scanner.nextLine();
			 double paidAmount = Double.parseDouble(paidAmountString);
			 double change = paidAmount - makeChange;
			 System.out.println("Here is your change: " + "$" + change);
		}
	
}