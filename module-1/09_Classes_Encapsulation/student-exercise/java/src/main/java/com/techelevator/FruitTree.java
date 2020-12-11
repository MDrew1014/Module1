package com.techelevator;

public class FruitTree {
	
	
	//Instance Variables
	private String typeOfFruit; // Type of fruit on the tree
	private  int piecesOfFruitLeft;
	
	
	//constructor
	public FruitTree(String typeOfFruit,int startingPiecesOfFruit) {
		this.typeOfFruit = typeOfFruit;
		this.piecesOfFruitLeft = startingPiecesOfFruit;
	}
	
	//Method
	public boolean pickFruit(int numberOfPiecesToRemove) {
		if (numberOfPiecesToRemove <= piecesOfFruitLeft){
			piecesOfFruitLeft -= numberOfPiecesToRemove;
			return true;
		}else{   return false;
		}
	}
	
	//getters
	public String getTypeOfFruit() {
		return typeOfFruit;
	}
	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}
	
	
}
