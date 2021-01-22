package com.techelevator.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
//POJO plain old java object
public class Sandwich {
	
	private int id;
	
	private String name;
	
	private String description;
	
	private BigDecimal price;
	
	private BigDecimal unitPrice;
	
	private Boolean isAvailable;
	
	private List<Category> categories;
	
	
	public Sandwich(List<Category> categories) {
		this.categories = categories == null ? new ArrayList<Category>() : categories;
		
	}
	
	

	public Category[] getCategories() {
		Category[] catArray = new Category[this.categories.size()];
		return this.categories.toArray(catArray);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	

	
}
