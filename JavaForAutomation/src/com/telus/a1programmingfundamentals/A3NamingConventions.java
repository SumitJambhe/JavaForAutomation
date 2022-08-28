package com.telus.a1programmingfundamentals;

public class A3NamingConventions {
	
	public static void main(String[] args) {
		
		//Use lower Camel case for naming variables (Advised to use it)
		
		String firstName;
		String lastName;
		String gender;
		String streetAddress;
		String dateOfDemo;
		
		/*
		 * A variable name can consist of Capital letters A-Z, 
		 * lowercase letters a-z, digits 0-9, and 
		 * two special characters such as underscore (_) and dollar ($) Sign.
		 */
		int salary;
		int SALARY;
		int salary56;
		int salary_;
		int salary$;
		//int salary&;//It can not be acceptable
		
		//Variable name must begin with a letter.
		int salary3456;
		
		//Variable name cannot begin with number.
		//int 345Salary;
		
		//Variable name can also begin with $ and _ (not advised to use it)
		int _salary;
		int $cost;
		
		//Variable names are case-sensitive. "automation and "AUTOMATION" are different variables)
		String automation;
		String AUTOMATION;
		
		//MATLAB, Matrix case incasesensive
		//Python is case sensitive
		
		//Java keywords cannot be used as variable names.
		//String int;
		//float class;
		
		
		

	}

}
