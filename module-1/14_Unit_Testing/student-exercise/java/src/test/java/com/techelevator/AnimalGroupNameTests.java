package com.techelevator;
import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

public class AnimalGroupNameTests {
	
	
	
	@Test
	public void animal_Group_Lowercase_Test() {//Happy path 
		//Arrange
		
		AnimalGroupName animalGroupName = new AnimalGroupName();
		String expectedHerd = "Tower";
		
		String inputAnimal = "giraffe";
		//Act
		String actualHerd = animalGroupName.getHerd(inputAnimal);
		
		//assert
		Assert.assertEquals(
				"The animal group name does not match the group name of the expected animal", 
				expectedHerd, 
				actualHerd);
		
		
	}
	@Test
	public void lion_Test() {//Happy path 
		//Arrange
		
		AnimalGroupName animalGroupName = new AnimalGroupName();
		String expectedHerd = "Pride";
		
		String inputAnimal = "Lion";
		//Act
		String actualHerd = animalGroupName.getHerd(inputAnimal);
		
		//assert
		Assert.assertEquals(
				"Lions are in a pride", 
				expectedHerd, 
				actualHerd);
		
		
	}
	@Test
	public void animal_Group_Capital_Test() {//Happy path 
		//Arrange
		
		AnimalGroupName animalGroupName = new AnimalGroupName();
		String expectedHerd = "Tower";
		
		String inputAnimal = "GIRAFFE";
		//Act
		String actualHerd = animalGroupName.getHerd(inputAnimal);
		
		//assert
		Assert.assertEquals(
				"Should be case insensitive", 
				expectedHerd, 
				actualHerd);
		
		
	}
	@Test
	public void animal_Name_Is_Not_Null() {//Happy path 
		//Arrange
		
		AnimalGroupName animalGroupName = new AnimalGroupName();
		String expectedHerd = "unknown";
		
		String inputAnimal = null;
		//Act
		String actualHerd = animalGroupName.getHerd(inputAnimal);
		
		//assert
		Assert.assertEquals(
				"results for null input", 
				expectedHerd, 
				actualHerd);
		
		
	}
	@Test
	public void animal_Name_Is_Empty_String() {//Happy path 
		//Arrange
		
		AnimalGroupName animalGroupName = new AnimalGroupName();
		String expectedHerd = "unknown";
		
		String inputAnimal = " ";
		//Act
		String actualHerd = animalGroupName.getHerd(inputAnimal);
		
		//assert
		Assert.assertEquals(
				"results for empty string", 
				expectedHerd, 
				actualHerd);
		
		
	}
	@Test
	public void animal_Name_Does_Not_Exist() {//Happy path 
		//Arrange
		
		AnimalGroupName animalGroupName = new AnimalGroupName();
		String expectedHerd = "unknown";
		
		String inputAnimal = "Chicken";
		//Act
		String actualHerd = animalGroupName.getHerd(inputAnimal);
		
		//assert
		Assert.assertEquals(
				"results for animal name not being on the list", 
				expectedHerd, 
				actualHerd);
		
		
	}

}
