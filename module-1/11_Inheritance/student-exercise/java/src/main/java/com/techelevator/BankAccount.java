package com.techelevator;

public class BankAccount implements Accountable {
	//instance variables
	private String accountHolderName;
	private String accountNumber;
	private int balance;
	
	public static final int defaultBalance = 0;
	//getters
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	//Constructors
	public BankAccount(String accountHolderName, String accountNumber) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
	public BankAccount(String accountHolderName, String accountNumber, int balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	//Methods
	public int deposit(int amountToDeposit) {
		 this.balance += amountToDeposit;
		 return balance;
		
	}
	public int withdraw(int amountToWithdraw) {
		 this.balance -= amountToWithdraw;
		 return balance;
	}

	public int transferTo(BankAccount destinationAccount, int transferAmount) {
		int oldBalance = this.getBalance();
		this.withdraw(transferAmount);
		if (this.getBalance() < oldBalance) {
			destinationAccount.deposit(transferAmount);
		}
		return this.getBalance();
	}
}
