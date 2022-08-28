package com.telus.b5abstraction;

public class A5_TestingAbtractionHDFCBankATM {

	//HDFC Bank used the all codes of RBI but cannot see code.
	public static void main(String[] args) {

		/*
		 * Object needs to be created for each bank for the same user.
		 * Following below way is not possible. 
		 * 
		 */
		// BankAtmScreen obj = new RBIBank();
		// BankAtmScreen obj = new HDFCBank();

		// Alternative Way to improve above code

		A1_BankAtmScreen obj;

		//create object instance for the RBI Bank
		obj = new A2_RBIBank();
		obj.deposit();
		obj.withdrawal();
		obj.balance();
		obj.pinChange();

		// Creating object instance for HDFC Bank
		obj = new A4_HDFCBank();
		obj.mobileRegistration();
		obj.minimumStatement();
	}
}
//Deposit Method is executed
//Withdrawl Method is executed
//Balance Method is executed
//Pin Change RBI Method is displayed
//Mobile Registration Method is displayed
//Minimum Statement Method is displayed