package com.techelevator;



public abstract class Wall {
	//instance variables 
	private String name;
	private String color;
	// abstract method
	public abstract int getArea();
	//constructor
	public Wall(String name, String color) {
		this.name = name;
		this.color = color;
	}
  ///getters
	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	} 
		
	
	}

