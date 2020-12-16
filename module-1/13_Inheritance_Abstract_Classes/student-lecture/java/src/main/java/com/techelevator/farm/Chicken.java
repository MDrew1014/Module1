package com.techelevator.farm;

public class Chicken extends FarmAnimal {

	public Chicken() {
		super("Chicken", "cluck!");
	}

	public void layEgg() {
		System.out.println("Chicken laid an egg!");
	}

	//this override same as overriding regular method
	//you cannot use the super key
	@Override
	public String eat() {
		return "Peck at some worms on the ground ...";
	}
	
}