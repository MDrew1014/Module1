package com.techelevator.com.Controllers;

import org.junit.Assert;
import org.junit.Test;

import com.techelevator.apocalypse_now.controllers.StatusController;
import com.techelevator.apocalypse_now.models.Status;

public class StatusControllerTests {
	@Test
	public void basicStatusTest() {
		//arrange
		StatusController controller = new StatusController(new MockStatusDAO());
		//act
		Status status = controller.getCurrentStatus();
		//assert
		Assert.assertNotNull(status);
	}
	

}
