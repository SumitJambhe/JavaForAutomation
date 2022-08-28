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
public class A1_InstanceMethodExample {

	// Methods which returns values
	// accessModifier returnType methodName(dataType variableName) // (Arguments or Parameters)
	public int addition(int a, int b)
	{
		int result = a + b;
		return result;		
	}
	
	public int subtraction(int a, int b) 
	{
		int result  = a - b;
		return result;		
	}
	
	// Method without returning value or void method
	// accessModifier returnType methodName(dataType variableName)
	public void display(int value) 
	{
		System.out.println("The value is "+ value);
	}
		
	public static void main(String[] args) 
	{
	
		A1_InstanceMethodExample obj = new A1_InstanceMethodExample();
		int add = obj.addition(10, 20);
		System.out.println("The Output is: " + add);//OR
		obj.display(add);//use of Method without returning value for printing purpose

		
		int sub = obj.subtraction(20, 10);
		System.out.println("The output is: " + sub);//OR
		obj.display(sub);
	}
}
//The Output is: 30
//The value is 30
//The output is: 10
//The value is 10
