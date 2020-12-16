package com.techelevator;

public class CreditCardAccount implements Accountable{
	//instance variables
	private String accountHolder;
	private String accountNumber;
	private int debt;
	
	@Override
	public int getBalance() {
		return this.debt;
	}
////getters
	public String getAccountHolder() {
		return accountHolder;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getDebt() {
		return -debt;
	}
////constructor
	public CreditCardAccount(String accountHolder, String accountNumber) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
	}
/////Methods
	public int pay(int amountToPay) {
		this.debt += amountToPay ;
		return debt;		
	}
	public int charge(int amountToCharge) {
		this.debt -= amountToCharge;
		return debt;
	}
	
	
	
}
