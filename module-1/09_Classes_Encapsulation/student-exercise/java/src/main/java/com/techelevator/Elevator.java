package com.techelevator;

public class Elevator {
//instance variables
	private int currentFloor;
	private int numberOfFloors;
	private boolean doorOpen;
	//constant
	public static final int defaultCurrentFloor = 1;
	//constructor
	public Elevator(int numberOfLevels){
		this.numberOfFloors = numberOfLevels;
	}
	//methods
	public void openDoor() {
		doorOpen = true;
	}
	public void closeDoor() {
		doorOpen = false;
	}
	public void goUp(int desiredFloor) {
		if (desiredFloor <= numberOfFloors) {
				if (desiredFloor > currentFloor) {
				currentFloor = desiredFloor;
				}
			}
		}
	
	
	public void goDown(int desiredFloor) {
		if (!doorOpen){
			if (desiredFloor >= defaultCurrentFloor) {
				if (desiredFloor < currentFloor) {
				currentFloor = desiredFloor;
				}
			}
		}
	}
	///getters and setters
	public int getCurrentFloor() {
		return defaultCurrentFloor;
	}
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public boolean isDoorOpen() {
		return doorOpen;
	}
	
	
	
	
	
	}
	
	
	

	
