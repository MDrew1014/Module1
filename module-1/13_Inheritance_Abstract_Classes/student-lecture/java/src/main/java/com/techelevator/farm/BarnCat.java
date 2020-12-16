package com.techelevator.farm;

public class BarnCat extends FarmAnimal{

	private static final String sound = "Meeeooooow";
	public BarnCat() {
		super("Cat", sound);
		
	}
	
	/*@Override
	public String getSound() {
		return sound;
	}*/
	@Override
	public String eat() {
		return "Catch a tasty mouse";
	}

}
