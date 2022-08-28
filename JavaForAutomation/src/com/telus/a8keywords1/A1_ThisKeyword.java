package com.telus.a8keywords1;

public class A1_ThisKeyword {

	// Instance Variable 
	String empName ="Vinoth";
	int empID = 12345;
	
	// Execute the below constructor with and without this keyword
	A1_ThisKeyword(String empName, int empID)//If you not use the this then it take instance variable value vinoth
	{
		this.empName = empName;//You are not replacing it 
		this.empID = empID;//after coming out of the execution value becomes erase.
	}
	
	void display() 
	{
		System.out.println(empName + " - " + empID);
	}
		
	public static void main(String[] args) 
	{
		A1_ThisKeyword obj = new A1_ThisKeyword("Pranav",54321);
		obj.display();
	}
}
//Pranav - 54321