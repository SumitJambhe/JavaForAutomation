package com.telus.a2controlstatements;

public class A4NestedIfStatement {
	
	public static void main(String[] args) {
		
		int age=35;
		int weight= 70;
		
		if(age>18)
		{
			if(weight>50)
			{
				System.out.println("You are eligible to donate the blodd !!");
			}
			else
			{
				System.out.println("You are not eligible to donate the blood because weight is less than 50 !!");
			}
		}
		else
		{
			System.out.println("Minimum age to donate blood is 18");
		}
	}

}
//You are eligible to donate the blodd !!