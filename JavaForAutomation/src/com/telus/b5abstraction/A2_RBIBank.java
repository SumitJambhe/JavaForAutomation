package com.telus.b5abstraction;

//Implementation of the abstract class will be done in subclass//Source
//Child
public class A2_RBIBank extends A1_BankAtmScreen {

	@Override
	void deposit() 
	{
		System.out.println("Deposit Method is executed");		
	}

	@Override
	void withdrawal() 
	{
		System.out.println("Withdrawl Method is executed");
		
	}

	@Override
	void balance() 
	{
		System.out.println("Balance Method is executed");
	}

	@Override
	void pinChange() 
	{
		System.out.println("Pin Change RBI Method is displayed");
	}

	//Next step written and direct to testing class
	@Override
	void mobileRegistration() 
	{
		System.out.println("comming soon");
	}

}
