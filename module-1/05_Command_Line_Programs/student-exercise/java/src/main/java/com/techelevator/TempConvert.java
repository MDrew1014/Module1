package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to my awesome temperature converter");
		System.out.print("Please enter the temperature: ");
		Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.next());
			System.out.print("Enter C for Celcius or F for Fahrenheit : ");
			String temp = scanner.next();
			if(temp.contentEquals("c")  || temp.contentEquals("C")){
				double degreeF = num * 1.8 + 32;
				System.out.print( "The Fahrenheit temperature is :" + degreeF + " F");;
			}
			else if( temp.contentEquals("F") || temp.contentEquals("f")) {
				double degreeC = (num - 32) / 1.8;
				System.out.print(" The Celcius temperature is : " + degreeC + " C");
			}
			else {
				System.out.println("You messed up");
			}
		
		
			
		
	}

}
