package com.telus.a5userdefinedmethods;

public class A3_MethodsRuleForVariables {

	int a = 10; // Instance Variable
	static int b = 20; // Static Variable
	
	// Static method Variable Rule 
	/*  We can use only static variable inside the static method. 
	 *  We can't use instance variable inside the static method.
	 */

	public static void display() {
		//System.out.println(a); // Compile time error
		System.out.println(b);
	}
	
	
	// Non Static method Variable Rule 
	/* We can use both instance and static variable inside the non static method
	 */

	public void display2() {
		System.out.println(a); 
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {

	display();
	A3_MethodsRuleForVariables obj = new A3_MethodsRuleForVariables();
	obj.display2();

	}

}
//20
//10
//20