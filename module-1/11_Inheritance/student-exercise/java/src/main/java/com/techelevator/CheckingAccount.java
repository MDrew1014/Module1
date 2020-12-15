package com.techelevator;

public class CheckingAccount extends BankAccount {
	
	private int checkingAccountBalance;

	public CheckingAccount(String accountHolderName, String accountNumber, int checkingAccountBalance) {
		super(accountHolderName, accountNumber, checkingAccountBalance);

		this.checkingAccountBalance = checkingAccountBalance;
	}

	public CheckingAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
		this.checkingAccountBalance = 0;
	}

	// this.getBalance()
	// super.withdraw
	@Override
	public int withdraw(int amountToWithdraw) {
		if (this.getBalance() - amountToWithdraw > -100) {
			super.withdraw(amountToWithdraw);
		} else if (this.getBalance() - amountToWithdraw < -100) {
			return this.getBalance();
		}
		if (this.getBalance() < 0) {
			super.withdraw(10);
		}
		{
			return this.getBalance();

		}
	}
}