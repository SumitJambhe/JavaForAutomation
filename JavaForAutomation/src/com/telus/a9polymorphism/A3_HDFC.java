package com.telus.a9polymorphism;
// Child Class - Method Overriding 
public class A3_HDFC extends A2_RBI {	
	
	public float getHomeLoan(float interest) 
	{
		System.out.println("Home Loan Interest = "+ interest);
		System.out.println("HDFC Class(Child) is executed");
		return interest;
	}

	public static void main(String[] args)
	{		
		A3_HDFC obj = new A3_HDFC();
		obj.getHomeLoan(7.10f);

	}

}
//Home Loan Interest = 7.1
//HDFC Class(Child) is executed