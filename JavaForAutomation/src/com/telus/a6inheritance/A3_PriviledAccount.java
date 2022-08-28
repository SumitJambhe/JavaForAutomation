package com.telus.a6inheritance;

public class A3_PriviledAccount extends A2_SavingAccount{

	public void creditCard(int accNum) 
	{
		System.out.println("Credit card dispatched to the customer" + accNum );
		System.out.println("Priviled Account Class is executed");
	}
	
	public static void main(String[] args) 
	{
		A3_PriviledAccount PersonTwo = new A3_PriviledAccount();
		PersonTwo.deposit();
		PersonTwo.withdrawal();
		PersonTwo.viewSummary(54311);
		PersonTwo.creditCard(54311);		
	}
}
//Amount is deposited
//Account Class is executed
//Amount is withdrawn
//Account Class is executed
//The Account summary is displayed for 54311
//Saving Account Class is executed
//Credit card dispatched to the customer54311
//Priviled Account Class is executed
