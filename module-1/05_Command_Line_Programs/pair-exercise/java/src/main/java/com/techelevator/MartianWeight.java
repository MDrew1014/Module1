package com.techelevator;

import java.util.Scanner;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */

public class MartianWeight {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.println("Weight on Earth and Mars");
	System.out.print("Enter weights in pounds (space seperated): ");
			String weightString = scanner.nextLine();
			String[] weightsAsIndividualStrings = weightString.split(" ");
			double[] weights = new double[weightsAsIndividualStrings.length];
			double[] martianWeights = new double[weightsAsIndividualStrings.length];
			for(int i = 0;i<weightsAsIndividualStrings.length;i++){
				String stringToParse = weightsAsIndividualStrings[i];
				double weight = Double.parseDouble(stringToParse);
				weights[i] = weight;
							}
			for(int i = 0;i<weights.length;i++) {
				double martianWeight = weights[i] * .378;
				martianWeights[i] = martianWeight;
			}
				System.out.println("Your weights on Earth and Mars are:");
				for(int j = 0;j<martianWeights.length;j++)
				{

					System.out.println(weights[j] + " lbs. on Earth, is " + martianWeights[j] + " lbs. on Mars.");
				}System.out.println();
			} 
	}

