package com.telus.b5abstraction;

/*
 * It is similar to ATM Screen. Based on user requirement we can do the configuration 
 */

public class A3_TestingAbstractionATMScreen{

	public static void main(String[] args) {

		// Creating object instance for RBI Bank
		A1_BankAtmScreen obj = new A2_RBIBank();
		obj.deposit();
		obj.withdrawal();
		obj.balance();
		obj.pinChange();
		obj.minimumStatement();
		obj.mobileRegistration();


		// A1_BankAtmScreen obj2 = new A1_BankAtmScreen();//can not create the object of abstract class
		//When you create the object of the class you can access all methods of the class
	}

}
//Deposit Method is executed
//Withdrawl Method is executed
//Balance Method is executed
//Pin Change RBI Method is displayed
//Minimum Statement Method is displayed
//comming soon
