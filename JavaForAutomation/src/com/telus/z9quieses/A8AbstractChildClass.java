package com.telus.z9quieses;

public class A8AbstractChildClass extends A7AbstractClass {

	@Override
	public void m1() 
	{
		System.out.println("Unimplemented Method from the abstract class.");
		
	}
	
	
	public static void main(String[] args) {
		
		A8AbstractChildClass ch= new A8AbstractChildClass();
		ch.m1();//child class
		ch.m2();//parent class
	}

}
