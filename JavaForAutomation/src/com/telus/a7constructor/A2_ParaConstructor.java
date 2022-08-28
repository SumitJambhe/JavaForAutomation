package com.telus.a7constructor;
/*
 * The parameterized constructor is used to provide different values to distinct objects.
 * However, you can provide the same values also.
 */

public class A2_ParaConstructor {
	
	// Instance Variable
	String empName;
	int empID;	
	
	A2_ParaConstructor(String n,int i)//Constructor,you replacing the instance variable with the local variable 
	{
		empName = n;
		empID = i;
	}	
		
	public static void main(String[] args) { 
		A2_ParaConstructor obj = new A2_ParaConstructor("Telus",12345);
		System.out.println(obj.empName);
		System.out.println(obj.empID);
	}
}
//Telus
//12345
