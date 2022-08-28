package com.telus.z9quieses;

public class A6InterfaceImplementationClass implements A5Interface{

	@Override
	public void m1() 
	{
		System.out.println();
	}

	@Override
	public void m2() 
	{
		System.out.println();
	}

	@Override
	public void m3() 
	{
		System.out.println();
	}

	
	public static void main(String[] args) {
		
		A5Interface interfaceVariable  = new A6InterfaceImplementationClass();
		interfaceVariable.m1();
		interfaceVariable.m2();
		interfaceVariable.m3();
	}
}
