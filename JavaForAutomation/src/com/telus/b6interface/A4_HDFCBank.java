package com.telus.b6interface;

public class A4_HDFCBank implements A1_BankATMInterfaceScreen,A6_HDFCNetBanking{//HDFCNetBanking last

	@Override
	public void deposit() 
	{
		
	}

	@Override
	public void withdrawal() 
	{
		
	}

	@Override
	public void balance() 
	{
		
	}

	@Override
	public void pinChange() 
	{
		
	}

	@Override
	public void mobileRegistration() 
	{
		System.out.println("Mobile Registration is executed");
	}

	@Override//after adding the HDFC netbanking interface
	public void moneyTransfer() 
	{
		System.out.println("Money Transfer Method is executed");	
	}

}
