package com.telus.inheritanceassignments;

public class SavingAccount extends Account{

	public int viewSummaryAccount(int accNum) 
	{
		System.out.println("The Account summary is displayed for "+ accNum );
		System.out.println("Saving Account Class is executed");
		System.out.println();
		return accNum;		
	}
}
