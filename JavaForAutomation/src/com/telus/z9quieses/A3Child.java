package com.telus.z9quieses;

public class A3Child extends A2Parent {
	
	String sChild = " ";
	public void m3()
	{
		System.out.println("Method From the Child class: " + sChild);
	}
	
	
	public static void main(String[] args) {
		
		A3Child ch = new A3Child();
		ch.m1();//GrandParent
		ch.m2();//Parent
		ch.m3();//child

	}
}
