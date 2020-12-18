package com.techelevator;
import static org.junit.Assert.assertEquals;
import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

public class FrontTimesTest {
	
	
	@Test
	public void first_Three_Two_Times() {
		//arrange
		FrontTimes frontTime = new FrontTimes();
		int numberOfCopies = 2;
		String wordToUse = "Chocolate";
		String expectedReturn = "ChoCho";
		// act
		String threeTimes = frontTime.generateString(wordToUse, numberOfCopies);
		//assert
		Assert.assertEquals(
				"Two times a Charm",
				expectedReturn,
				threeTimes
				);
		
}
	@Test
	public void first_Three_Three_Times() {
		//arrange
		FrontTimes frontTime = new FrontTimes();
		int numberOfCopies = 3;
		String wordToUse = "Chocolate";
		String expectedReturn = "ChoChoCho";
		// act
		String threeTimes = frontTime.generateString(wordToUse, numberOfCopies);
		//assert
		Assert.assertEquals(
				"Three times a Charm",
				expectedReturn,
				threeTimes
				);
		
}
	@Test
	public void one_Letter_Seven_Times() {
		//arrange
		FrontTimes frontTime = new FrontTimes();
		int numberOfCopies = 7;
		String wordToUse = "A";
		String expectedReturn = "AAAAAAA";
		// act
		String threeTimes = frontTime.generateString(wordToUse, numberOfCopies);
		//assert
		Assert.assertEquals(
				"Seven in a row, good for you",
				expectedReturn,
				threeTimes
				);
		
}
	@Test
	public void first_Two_Two_Times() {
		//arrange
		FrontTimes frontTime = new FrontTimes();
		int numberOfCopies = 2;
		String wordToUse = "Fi";
		String expectedReturn = "FiFi";
		// act
		String threeTimes = frontTime.generateString(wordToUse, numberOfCopies);
		//assert
		Assert.assertEquals(
				"First two for you twice",
				expectedReturn,
				threeTimes
				);
		
}
	@Test
	public void no_String_No_Thing() {
		//arrange
		FrontTimes frontTime = new FrontTimes();
		int numberOfCopies = 2;
		String wordToUse = "";
		String expectedReturn = "";
		// act
		String threeTimes = frontTime.generateString(wordToUse, numberOfCopies);
		//assert
		Assert.assertEquals(
				"No string should return enpty string ",
				expectedReturn,
				threeTimes
				);
		
}

	@Test
	public void null_String_No_Thing() {
		//arrange
		FrontTimes frontTime = new FrontTimes();
		int numberOfCopies = 2;
		String wordToUse = null;
		String expectedReturn = "";
		// act
		String threeTimes = frontTime.generateString(wordToUse, numberOfCopies);
		//assert
		Assert.assertEquals(
				"Null string should return enpty string ",
				expectedReturn,
				threeTimes
				);
	
	}
	
	
}