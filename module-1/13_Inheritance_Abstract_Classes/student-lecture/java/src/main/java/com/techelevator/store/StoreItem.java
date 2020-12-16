package com.techelevator.store;

import java.math.BigDecimal;
import java.util.List;

public class StoreItem extends Store{
	//instance variables
	private String itemName;
	private BigDecimal price;
	private int quantity;
	
	//getters 
	public String getItemName() {
		return itemName;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	//constructor
	StoreItem(String name, BigDecimal price, int quantity){
		this.itemName = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public BigDecimal getTotal() {
		if(quantity > 0) {
		return this.getPrice().multiply(new BigDecimal(this.getQuantity()));
	}else {
		return BigDecimal.ZERO;
	}
	}
	@Override
	public String toString() {
		return"Item: "+ this.getItemName() +" price: $"+ this.getPrice() + " quantity: "	+ getQuantity() + " total: $" + this.getTotal();
}
	@Override
	public void printReceipt(List<StoreItem> cart) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isOnSale(String itemName) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public BigDecimal percentageDiscount(String itemName) {
		// TODO Auto-generated method stub
		return null;
	}

}
