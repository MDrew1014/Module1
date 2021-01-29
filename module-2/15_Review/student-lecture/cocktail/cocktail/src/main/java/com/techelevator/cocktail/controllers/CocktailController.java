package com.techelevator.cocktail.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.cocktail.models.Cocktail;
import com.techelevator.cocktail.models.CocktailDAO;
@RequestMapping("/cocktail")
@RestController
public class CocktailController {
	private CocktailDAO dao;
	public CocktailController(CocktailDAO dao) {
		this.dao = dao;
	}
	//READ ALL
	
	@RequestMapping(path = "", method = RequestMethod.GET )
	public List<Cocktail> getAll(){
		return this.dao.getAll();
	}
	
	
	
	//TODO create
	//TODO READ
	//TODO UPDATE
	//TODO GET SPECIFIC
	//TODO DELETE
	//TODO Search

	
	
	
	
	
	
}
