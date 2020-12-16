package com.techelevator;

public class SquareWall extends RectangleWall{
	private int sideLength;

	public SquareWall(String name, String color, int sideLength) {
		super(name, color);
		this.sideLength = sideLength;
	}

	public int getSideLength() {
		return sideLength;
	}
	@Override
	public String toString() {
		return getName() + " (" + getSideLength() + "x" + getSideLength() + ") " + "square";
	}
	@Override
	public int getArea() {
		int area = sideLength * sideLength;
		return area;
}
}
