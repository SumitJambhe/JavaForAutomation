package com.telus.a6inheritance;

public class A2_SavingAccount extends A1_Account{

	public int viewSummary(int accNum) 
	{
		System.out.println("The Account summary is displayed for "+ accNum );
		System.out.println("Saving Account Class is executed");
		return accNum;		
	}
		
	public static void main(String[] args) 
	{
		A2_SavingAccount personOne = new A2_SavingAccount();
		personOne.deposit();
		personOne.withdrawal();
		personOne.viewSummary(12345);
	}
}
//Amount is deposited
//Account Class is executed
//Amount is withdrawn
//Account Class is executed
//The Account summary is displayed for 12345
//Saving Account Class is executed
