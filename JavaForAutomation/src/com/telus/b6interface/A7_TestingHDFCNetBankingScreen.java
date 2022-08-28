package com.telus.b6interface;

public class A7_TestingHDFCNetBankingScreen {

	public static void main(String[] args) {
		A6_HDFCNetBanking obj;
		
		obj = new A2_RBIBank();
		obj.deposit();
		obj.withdrawal();
		obj.balance();
		obj.pinChange();
		
		obj = new A4_HDFCBank();
		obj.mobileRegistration();
		obj.moneyTransfer();
	}

}
//Deposit Method is executed
//Withdrawl Method is executed
//Balance Method is executed
//Pin Change Method is executed
//Mobile Registration is executed
//Money Transfer Method is executed