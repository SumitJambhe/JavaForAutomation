package com.telus.inheritanceassignments;

public class Account {
	
	public int deposit(int depositeAmount, int accNum) 
	{
		System.out.println(depositeAmount + " Amount is deposited in account number " + accNum );
		System.out.println("Account Class is executed");
		System.out.println();
		return accNum;
	}
	
	public int withdrawal(int withdrawnAmount, int accNum) 
	{
		System.out.println(withdrawnAmount + " Amount is withdrawn from the account number " + accNum);
		System.out.println("Account Class is executed");
		System.out.println();
		return accNum;
	}
}
