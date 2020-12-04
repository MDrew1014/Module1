package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {

	/**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      

        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        System.out.print("Enter the discount amount (w/out percentage): ");
        String percentageString = scanner.nextLine();
        double percentDiscount = Double.parseDouble(percentageString);
        double decimalDiscount = percentDiscount/100.0;
        System.out.println("The discount you entered as a decimal is " + decimalDiscount);

        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        String pricesAsString = scanner.nextLine();
        
        String[] pricesAsIndividualStrings = pricesAsString.split(" ");
        
        System.out.println("Prices you provided " + pricesAsString);

        // need to parse each string into a double
        
        
        
        
        // create a double array to hold the prices
        double[] prices = new double[pricesAsIndividualStrings.length];
        
        
        // loop through the price strings
       for(int i = 0; i < pricesAsIndividualStrings.length; i++) {
        	
        String stringToParse = pricesAsIndividualStrings[i];
               
        //parse each string into a double
        double price = Double.parseDouble(stringToParse);
         // apply the double	
        price = price - (price * decimalDiscount);
       
        //store that double in the array
        
        prices[i] = price;
       }
       // loop through the discounted prices and print them 
    	System.out.println("You qualified for a discount. Discounted prices are; ");
    	for(int j = 0; j < prices.length; j++) {
    		double price = prices[j];
    		System.out.print("$" + price + "\t");
    		}    		
    		System.out.println();
    }
}
			
