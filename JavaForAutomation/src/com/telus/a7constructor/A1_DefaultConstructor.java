package com.telus.a7constructor;

/*
 * In Java, a constructor is a block of codes similar to the method. 
   It is called when an instance of the class is created. 
   At the time of calling constructor, memory for the object is allocated in the memory.

* It is a special type of method which is used to initialize the object.

* Every time an object is created using the new() keyword, at least one constructor is called.

* It calls a default constructor if there is no constructor available in the class. 
  In such case, Java compiler provides a default constructor by default..
  
* Rules for creating Java constructor
1. Constructor name must be the same as its class name
2. A Constructor must have no explicit return type
3. A Java constructor cannot be abstract, static, final, and synchronized
 */

public class A1_DefaultConstructor {
	
	// Instance Variable:- We didn't initialize the value
	String name;
	int empID;	
		
	A1_DefaultConstructor()
	{
		System.out.println("Constructor is executed first");
	}
		
	public static void main(String[] args) 
	{
		A1_DefaultConstructor obj = new A1_DefaultConstructor();
		System.out.println(obj.name);//Null, It is doing by constructor
		System.out.println(obj.empID);//zero, It is doing by constructor
	}
}
//Constructor is executed first
//null
//0