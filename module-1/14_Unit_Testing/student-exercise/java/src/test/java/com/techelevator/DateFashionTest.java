package com.techelevator;
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
		
		int myFashion = (5, 10);
		
		int tableAvailable = 2;
		//act
		int actualResults = dateFashion.getATable(myFashion, tableAvailable);
		
		//assert
		
		Assert.assertEquals(
				"NO fashion No table", 
				myFashion, 
				tableAvailable);
				
	}
	@Test
	public void no_Fashion_No_Table() {
		//arrange
		
		DateFashion dateFashion = new DateFashion();
		
		int myFashion = 5;
		int theirFashion = 2;
		
		//act
		int actualResults = dateFashion.getATable(myFashion, theirFashion);
		
		//assert
		
		Assert.assertEquals(
				"NO fashion No table", 
				myFashion, 
				theirFashion);
				
	}
	
}
