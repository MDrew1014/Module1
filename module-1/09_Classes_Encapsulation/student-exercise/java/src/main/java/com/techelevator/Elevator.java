package com.techelevator;

public class Elevator {
//instance variables
	private int currentFloor;
	private int numberOfFloors;
	private boolean doorOpen;
	// constant

	// constructor
	public Elevator(int numberOfLevels) {
		this.numberOfFloors = numberOfLevels;
		this.currentFloor = 1;
	}

	// methods
	public void openDoor() {
		doorOpen = true;
	}

	public void closeDoor() {
		doorOpen = false;
	}

	public void goUp(int desiredFloor) {
		if (!doorOpen && desiredFloor <= numberOfFloors && desiredFloor > currentFloor) {

			currentFloor = desiredFloor;
		}
	}

	public void goDown(int desiredFloor) {
		if (!doorOpen && desiredFloor < currentFloor && desiredFloor > 0) {
			currentFloor = desiredFloor;
		}
	}

	/// getters and setters
	public int getCurrentFloor() {
		return currentFloor;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public boolean isDoorOpen() {
		return doorOpen;
	}

}	
