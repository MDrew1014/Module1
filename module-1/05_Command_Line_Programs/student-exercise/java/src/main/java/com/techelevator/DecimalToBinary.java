package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);    
		
        System.out.print("Please enter in a series of decimal values (separated by spaces):");
        decimal = scanner.nextInt();
		
        quot = decimal;
		
        while(quot != 0)
        {
            binary[i++] = quot%2;
            quot = quot/2;
        }
		
        System.out.print("Binary number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(binary[j]);
        }
        System.out.print("\n");
    }
	}


