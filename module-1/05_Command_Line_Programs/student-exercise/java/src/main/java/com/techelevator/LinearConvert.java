package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		
		System.out.println("Welcome to my fantastic linear converter");
		System.out.print("Please enter the length: ");
		Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.next());
			System.out.print("Enter m for meter or f for feet : ");
			String length = scanner.next();
			if(length.contentEquals("m")  || length.contentEquals("M")){
				double lengthF = num * 3.2808399;
				System.out.print( "The lenth in feet is :" + lengthF + " feet");
			}
			else if( length.contentEquals("f") || length.contentEquals("F")) {
				double lengthM =  num * 0.3048;
				System.out.print(" The length in feet is : " + lengthM + " meters");
			}
			else {
				System.out.println("You messed up");
			}
		
			
			
		
	}



	}


