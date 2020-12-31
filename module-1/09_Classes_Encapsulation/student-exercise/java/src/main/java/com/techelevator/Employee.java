package com.techelevator;

public class Employee {
//instance variables
	private int employeeId;
	private String firstName;
	private String lastName;
	private String fullName;// derived from firstName and lastName
	private String department;
	private double annualSalary;
//constructor
	public Employee(int employeeId, String firstName, String lastName, double annualSalary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = annualSalary;
	}
//method
	public void raiseSalary(double percent) {
			if(percent > 0) {
				annualSalary = annualSalary *(1.0 + (percent/100));
			}
			 }
		

//getters setters
	public int getEmployeeId() {
		return employeeId;
		}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getFullName() {
		return lastName + ", " + firstName;
	}
	public String getDepartment() {
		return department;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	}

