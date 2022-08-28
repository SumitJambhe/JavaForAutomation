package com.telus.b5abstraction;

// 1. An abstract class must be declared with an abstract keyword.
// 2. All the methods declared as abstract in the parent class.
// 3. Non Abstract method can also be used in Abstract class. 
//Parent
public abstract class A1_BankAtmScreen {

	abstract void deposit();

	abstract void withdrawal();

	abstract void balance();

	abstract void pinChange();
	
	void minimumStatement() 
	{
		System.out.println("Minimum Statement Method is displayed");
	}

	//After mension only
	abstract void mobileRegistration();		

	
}
