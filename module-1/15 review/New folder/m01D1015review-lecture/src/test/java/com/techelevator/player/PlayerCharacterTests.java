package com.techelevator.player;
import static org.junit.Assert.assertEquals;

import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;


public class PlayerCharacterTests {

	private PlayerCharacter character;
	
	@Before
	public void setup() {
		character = new Rogue();
	}
	@After
	public void teardown() {
		character = null;
	}
	
	
	@Test
	public void initialHealthCorrect() {
		//arrange
		// ** handled by the before
		//act
		int acutalHealth = character.getHealth();
		//assert
		
		Assert.assertEquals("Health should match initial value",
				Rogue.BASE_HEALTH,
				acutalHealth);
		
	}
	@Test
	public void initialMaxHealthCorrect() {
		//arrange
		// ** handled by the before
		//act
		int acutal = character.getMaxHealth();
		//assert
		
		Assert.assertEquals("Health should match default value",
				Rogue.BASE_HEALTH,
				acutal);
	
	
}
	@Test
	public void initialDexterityCorrect() {
		//arrange
		// ** handled by the before
		//act
		int acutal = character.getDexterity();
		//assert
		
		Assert.assertEquals("Dexterity should match default value",
				Rogue.BASE_DEXTERITY,
				acutal);
	
	
}
	@Test
	public void basicDamageTest() {
		//arrange
		int expectedDifference = 10;
		int damageValue = character.getArmor() + expectedDifference;
		int initialHealth = character.getHealth();
		///act
		character.takeDamage(damageValue);
		int adjustedHealth = character.getHealth();
		int actualDamage = initialHealth - adjustedHealth;
		
		//assert
		Assert.assertTrue("Health should change when taking damagme",
				initialHealth != adjustedHealth);
		Assert.assertEquals("Damage value should have been removed from health",
				expectedDifference, actualDamage);
	
	
	
	}
}