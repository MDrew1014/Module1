package com.techelevator.model;
import java.util.List;
public interface SandwichDAO {
	
	Sandwich getById(int id);
	List<Sandwich> getAll();
	List<Sandwich> getByType();
	List<Sandwich> getByTypes(List<String> typeNames);
	

}
