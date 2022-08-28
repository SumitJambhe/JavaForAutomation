package com.telus.b6interface;

public class A3_TestingIInterfaceATMScreen {

	public static void main(String[] args) 
	{
		A1_BankATMInterfaceScreen obj = new A2_RBIBank();
		obj.deposit();
		obj.withdrawal();
		obj.balance();
		obj.pinChange();
		obj.mobileRegistration();
	}

}
//Deposit Method is executed
//Withdrawl Method is executed
//Balance Method is executed
//Pin Change Method is executed
//Comming Soon
