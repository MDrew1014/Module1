package com.techelevator;

public class Airplane {
	//instance variables
	private String planeNumber;
	private int totalFirstClassSeats;
	private int bookedFirstClassSeats;
	private int availableFirstClassSeats;//derived from subtracting bookedFirstClassSeats from totalFirstClassSeats
	private int totalCoachSeats;
	private int bookedCoachSeats;
	private int availableCoachSeats; // derived from subtracting bookedCoachSeats from totalCoachSeats
	
	//Constructor
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	}
	
	//Method
	public boolean reserveSeats( boolean forFirstClass, int totalNumberOfSeats) {
		if(forFirstClass == true) {
			if(totalFirstClassSeats - bookedFirstClassSeats >= totalNumberOfSeats) {
				bookedFirstClassSeats += totalNumberOfSeats;
				return true;
			} else {
				return false;
			}			
		}
		else{
			if (totalCoachSeats - bookedCoachSeats >= totalNumberOfSeats) {
		
			bookedCoachSeats += totalNumberOfSeats;
			return true;
		}{
			return false;
		}
	}
	}	
	////Getters and Setters
	
	public String getPlaneNumber() {
		return planeNumber;
	}
	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}
	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}
	public int getAvailableFirstClassSeats() {
		return totalFirstClassSeats - bookedFirstClassSeats ;
	}
	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}
	public int getAvailableCoachSeats() {
		return totalCoachSeats - bookedCoachSeats;
	}

	
	
	
}
