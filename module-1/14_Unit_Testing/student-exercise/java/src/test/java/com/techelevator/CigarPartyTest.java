package com.techelevator;
import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;


public class CigarPartyTest {

	@Test
	public void cigar_Party_Too_Few_Test() {//Happy path 
		//Arrange
		
		CigarParty cigarParty = new CigarParty();
		int cigars = 30;
		
		boolean isWeekend = false;
		boolean expectedOut = false;
		//Act
		boolean actualOut = cigarParty.haveParty(cigars, isWeekend);
		//String actualHerd = animalGroupName.getHerd(inputAnimal);
		
		//assert
		Assert.assertFalse(
				"Too few cigars makes a bad party", 
				actualOut);
	}
	@Test
	public void cigar_Party_Too_Many_Test() {//Happy path 
		//Arrange
		
		CigarParty cigarParty = new CigarParty();
		int cigars = 75;
		
		boolean isWeekend = false;
		boolean expectedOut = false;
		//Act
		boolean actualOut = cigarParty.haveParty(cigars, isWeekend);
		//String actualHerd = animalGroupName.getHerd(inputAnimal);
		
		//assert
		Assert.assertFalse(
				"Too many cigars makes a bad party", 
				actualOut);
	}
	@Test
	public void cigar_Party_Just_Right_Weekday_Test() {//Happy path 
		//Arrange
		
		CigarParty cigarParty = new CigarParty();
		int cigars = 50;
		
		boolean isWeekend = false;
		boolean expectedOut = true;
		//Act
		boolean actualOut = cigarParty.haveParty(cigars, isWeekend);
		//String actualHerd = animalGroupName.getHerd(inputAnimal);
		
		//assert
		Assert.assertTrue(
				"Right amount of cigars for a weekday", 
				actualOut);
	}
	@Test
	public void cigar_Party_Just_Right_Weekend_Test() {//Happy path 
		//Arrange
		
		CigarParty cigarParty = new CigarParty();
		int cigars = 70;
		
		boolean isWeekend = true;
		boolean expectedOut = true;
		//Act
		boolean actualOut = cigarParty.haveParty(cigars, isWeekend);
		//String actualHerd = animalGroupName.getHerd(inputAnimal);
		
		//assert
		Assert.assertTrue(
				"Right amount of cigars for a weekend", 
				actualOut);
	}
	@Test
	public void cigar_Party_Too_Few_Weekend_Test() {//Happy path 
		//Arrange
		
		CigarParty cigarParty = new CigarParty();
		int cigars = 12;
		
		boolean isWeekend = true;
		boolean expectedOut = false;
		//Act
		boolean actualOut = cigarParty.haveParty(cigars, isWeekend);
		//String actualHerd = animalGroupName.getHerd(inputAnimal);
		
		//assert
		Assert.assertFalse(
				"Right amount of cigars for a weekday", 
				actualOut);
	}
}

