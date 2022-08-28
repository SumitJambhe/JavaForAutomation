package com.telus.inheritanceassignments;

public class CurrentAccount extends Account {

	public float getRateOfInterest(float interest) 
	{
		System.out.println("Rate of Interest  = "+ interest);
		System.out.println("Current Account Class is executed");
		return interest;
	}
	
	public static void main(String[] args) 
	{
		
		CurrentAccount customerThree = new CurrentAccount();
		customerThree.deposit(5000, 123456789);
		customerThree.withdrawal(2000, 123456789);
		customerThree.getRateOfInterest(8.5f);

	}
}
