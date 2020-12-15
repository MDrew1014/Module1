package com.techelevator;

public class SavingsAccount extends BankAccount{
	
	private int savingsAccountBalance;
	
	public SavingsAccount(String accountHolderName,String accountNumber, int savingsAccountBalance) {
		super(accountHolderName, accountNumber, savingsAccountBalance);
		
		this.savingsAccountBalance = savingsAccountBalance;
	}
	public SavingsAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
		this.savingsAccountBalance = 0;
	}
	
	@Override
	public int withdraw(int amountToWithdraw) {
		if(this.getBalance() - amountToWithdraw > 0){
		this.getBalance();
		}if(amountToWithdraw > this.getBalance()) {
			this.getBalance();
			}else{
			super.withdraw(amountToWithdraw);
		}
		return amountToWithdraw;
		
	}
}			
	