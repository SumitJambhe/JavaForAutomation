package com.telus.b1superkeyword;

/*
 * The super keyword in Java is a reference variable which is used to refer immediate parent class object.
 * Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.

 * Usage of Java super Keyword
1. super can be used to refer immediate parent class instance variable.
2. super can be used to invoke immediate parent class method.
3. super() can be used to invoke immediate parent class constructor.

 */

public class A2_SavingAccounts extends A1_Account{	

	String name = "Saving Account Class - Child";

	public void display() 
	{		
		//System.out.println("Saving Account Class(Child) is executed");
		//System.out.println("The variable value is "+ name);
		// Implementing the super keyword
		System.out.println("The variable value is "+ super.name);//variable Accessing
	}

	public void show() 
	{
		//display();
		super.display();
	}
	
	public static void main(String[] args) 
	{
		A2_SavingAccounts  obj = new A2_SavingAccounts();
		obj.display();		
		obj.show();		
	}
}
//The variable value is Account Class - Parent
//Account Class(Parent) is executed
//The variable value is Account Class - Parent


