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
		if (getBalance() - amountToWithdraw >= 2) {
			super.withdraw(amountToWithdraw);

			if (getBalance() < 150) {
				super.withdraw(2);
			}
		}
		return getBalance();

	}
}
