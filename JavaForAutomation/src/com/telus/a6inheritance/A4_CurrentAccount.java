package com.telus.a6inheritance;

public class A4_CurrentAccount extends A1_Account {

	public float getRateOfInterest(float interest) 
	{
		System.out.println("Rate of Interest ="+ interest);
		System.out.println("Current Class is executed");
		return interest;
	}
	
	public static void main(String[] args) 
	{
		A4_CurrentAccount personThree = new A4_CurrentAccount();
		personThree.deposit();
		personThree.withdrawal();
		personThree.getRateOfInterest(10.5f);
	}
}
//Amount is deposited
//Account Class is executed
//Amount is withdrawn
//Account Class is executed
//Rate of Interest =10.5
//Current Class is executed
