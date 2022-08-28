package com.telus.b6interface;

public class A5_TestingHDFCBankATM {

	public static void main(String[] args) {

		A1_BankATMInterfaceScreen obj;		
		
		obj = new A2_RBIBank();
		obj.withdrawal();
		obj.deposit();
		obj.pinChange();
		obj.balance();
		
		obj = new A4_HDFCBank();
		obj.mobileRegistration();
	}

}
//Withdrawl Method is executed
//Deposit Method is executed
//Pin Change Method is executed
//Balance Method is executed
//Mobile Registration is executed