package com.techelevator;

public class RectangleWall extends Wall{
	
	//instance variables 
	private int length;
	private int height;
	//two constructors
	public RectangleWall(String name, String color, int length, int height) {
		super(name, color);
		this.length = length;
		this.height = height;
	}
		
	public RectangleWall(String name, String color) {
		super(name, color);
		}
	///override method and toString
	@Override
	public int getArea() {
		int area = length * height;
		return area;
	}
	@Override
	public String toString() {
	return getName() + " (" + getLength() + "x" + getHeight() + ") " + "rectangle";
	}
// getters
	public int getLength() {
		return length;
	}

	public int getHeight() {
		return height;
	}
	
	
}
