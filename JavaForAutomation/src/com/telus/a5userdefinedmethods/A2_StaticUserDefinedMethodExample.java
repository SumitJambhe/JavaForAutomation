package com.telus.a5userdefinedmethods;

/**
 *  Method - A set of statement that are grouped together to perform  an operation
 *  
 *  User Defined Methods
 *  
 *  1. Methods without returning values
 *  
 *  2. Methods which returns values 
 * 
 */
public class A2_StaticUserDefinedMethodExample { //Only static keyword is include in the methods

	// Methods which returns values
	// accessModifier static returnType methodName(dataType variableName) // (Arguments or Parameters)
	public static int addition(int a, int b)
	{
		int result = a + b;
		return result;		
	}
	
	
	public static int subtraction(int a, int b) 
	{
		int result  = a - b;
		return result;		
	}
	
	// Method without returning value
	// accessModifier returnType methodName(dataType variableName)
	public static void display(int value) 
	{
		System.out.println("The Value is "+ value);
	}
		
	public static void main(String[] args) 
	{

	int add = addition(10,50);
	display(add);

	int sub = subtraction(40, 20);
	display(sub);
	
	}
}
//The Value is 60
//The Value is 20
