package com.telus.b6interface;

public class A2_RBIBank implements A1_BankATMInterfaceScreen,A6_HDFCNetBanking {//After HDFCNetBanking

	@Override
	public void deposit() 
	{
		System.out.println("Deposit Method is executed");
	}

	@Override
	public void withdrawal() 
	{
		System.out.println("Withdrawl Method is executed");
	}

	@Override
	public void balance() 
	{
		System.out.println("Balance Method is executed");
	}

	@Override
	public void pinChange() 
	{
		System.out.println("Pin Change Method is executed");
	}

	@Override
	public void mobileRegistration() 
	{
		System.out.println("Comming Soon");
	}

	@Override//after adding the HDFCNetBankingInterface
	public void moneyTransfer() 
	{
		
	}
	

}
