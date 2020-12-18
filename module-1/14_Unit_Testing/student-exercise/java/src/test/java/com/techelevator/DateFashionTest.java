package com.techelevator;
import static org.junit.Assert.assertEquals;

import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;


public class DateFashionTest {

	@Test
	public void good_Fashion_Gets_Table() {
		//arrange
		
		DateFashion dateFashion = new DateFashion();
		int myFashion =5;
		int theirFashion = 10;
		
		
		int expectedReturn = 2;
		//act
		int getTable = dateFashion.getATable(myFashion,theirFashion);
		
		//assert
		
		Assert.assertEquals(
				"Yes fashion yes table", 
				expectedReturn, 
				getTable);
				
	}
	@Test
	public void bad_Fashion_No_Table() {
		//arrange
		
		DateFashion dateFashion = new DateFashion();
		int myFashion =5;
		int theirFashion = 2;
		
		
		int expectedReturn = 0;
		//act
		int getTable = dateFashion.getATable(myFashion,theirFashion);
		
		//assert
		
		Assert.assertEquals(
				"NO fashion No table", 
				expectedReturn, 
				getTable);
				
	}
	@Test
	public void maybe_Fashion_Maybe_Table() {
		//arrange
		
		DateFashion dateFashion = new DateFashion();
		int myFashion =5;
		int theirFashion = 5;
		
		
		int expectedReturn = 1;
		//act
		int getTable = dateFashion.getATable(myFashion,theirFashion);
		
		//assert
		
		Assert.assertEquals(
				"Some fashion maybe table", 
				expectedReturn, 
				getTable);
				
	}
	@Test
	public void negative_Fashion_No_Table() {
		//arrange
		
		DateFashion dateFashion = new DateFashion();
		int myFashion =-5;
		int theirFashion = 2;
		
		
		int expectedReturn = 0;
		//act
		int getTable = dateFashion.getATable(myFashion,theirFashion);
		
		//assert
		
		Assert.assertEquals(
				"Negative fashion does that mean naked?", 
				expectedReturn, 
				getTable);
				
	}
}
