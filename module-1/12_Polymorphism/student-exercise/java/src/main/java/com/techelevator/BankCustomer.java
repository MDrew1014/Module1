package com.techelevator;

import java.util.List;
import java.util.ArrayList;
public class BankCustomer {
	
	//instance variables
	private String name;
	private String address;
	private String phoneNumber;
	private List<Accountable> accounts = new ArrayList<Accountable>(); 
	
	//method
	public void addAccount(Accountable newAccount) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}	
	public BankCustomer() {
		accounts = new ArrayList<Accountable>();
	}
	public BankCustomer(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		accounts = new ArrayList<Accountable>();
	}
	public Accountable[] getAccounts() {
		  return accounts.toArray(new Accountable[accounts.size()]);
		}
	
	public boolean isVip() {
		int accountsCombined = 0;
		for(Accountable bankAccount : this.getAccounts()) {
			accountsCombined += bankAccount.getBalance();
		}	if(accountsCombined >= 25000) {
			return true;
		}else {
			return false;
		}
	
	}
	
	
	


	
}