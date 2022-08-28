package com.telus.inheritanceassignments;

public class PriviledAccount extends SavingAccount{

	public void debitCard(int accNum) 
	{
		System.out.println("Credit card dispatched to the customer " + accNum );
		System.out.println("Priviled Account Class is executed");
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		PriviledAccount customer = new PriviledAccount();
		customer.deposit(5000, 1234567890);
		customer.withdrawal(2000, 123456789);
		customer.viewSummaryAccount(123456789);
		customer.debitCard(123456789);		
	}

}
