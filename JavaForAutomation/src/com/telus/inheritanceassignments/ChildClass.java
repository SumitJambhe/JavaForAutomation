package com.telus.inheritanceassignments;

public class ChildClass extends ParentClass {
	public void bike()
	{
		System.out.println("Bike method from child class");
	}

	public static void main(String[] args) {

		ChildClass child = new ChildClass();

		child.farm();//Grand parent class method call
		child.home();//Parent class method call
		child.car();//parent class method call
		child.property();//Parent class method call
		child.bike();//child class method call
	}
}
