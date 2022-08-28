package com.telus.b2finalkeyword;

/*
 * final key word : The final keyword in java is used to restrict the user.
 * Final can be:
	1. variable - If you make any variable as final, you cannot change the value of final variable
	   (It will be constant).	   
	   
	2. method - If you make any method as final, you cannot override it.
	   (- Implement final keyword in polymorphism over riding program for methods)
	   
	3. class - If you make any class as final, you cannot extend it.
	   (- Implement final keyword in inheritance program for class)
	
 */

public class A1_FinalKeyword {
    
	// Instance variable 
	final String customerName = "Pranav";
	final int SSN = 123456789;	
	
	void display() {
		// customerName = "Vinoth";
		//SSN = 98765421;
		System.out.println("The customer name is "+ customerName);
		System.out.println("The Social Security Number is "+ SSN);
	}
		
	public static void main(String[] args) {
		A1_FinalKeyword obj = new A1_FinalKeyword();
		obj.display();				
	}

}
//The customer name is Pranav
//The Social Security Number is 123456789
