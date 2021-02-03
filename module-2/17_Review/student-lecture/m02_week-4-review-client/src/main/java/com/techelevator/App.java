package com.techelevator;

import com.techelevator.services.ConsoleService;

public class App {
	
	
	
	
	private ConsoleService console;
	
	public App(ConsoleService consoleService) {
		this.console = consoleService;
	}
	
	
	public void run() {
		int returnCode;
		do {
			returnCode = console.printMainMenu();
		}while(returnCode > 0);
		
	}

	public static void main(String[] args) {
		ConsoleService cService = new ConsoleService();
		App app = new App(cService);
		app.run();
	}

}
