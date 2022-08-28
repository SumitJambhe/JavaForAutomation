package com.telus.b7encapsulation;

public class A1_EncapsulationExample {

 // Declaring the variable as private 
	private String name;
	private int empNum;
	private int age;
	private int mobNum;
	
	// Using the set method
	//Source-->Generate the Getter and setter method--->select all -->generate
	public void setName(String newName) 
	{
		name = newName;
	}
	
	public void setEmpNum(int newNum) 
	{
		empNum = newNum;
	}
	
	public void setAge(int newAge)
	{
		age = newAge;
	}
	
	public void setMobNum(int newMobNum) 
	{
		mobNum = newMobNum;
	}
	
	// Using get method
	public String getName() 
	{
		return name;
	}	
	
	public int getEmpNum() 
	{
		return empNum;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getMobNum() 
	{
		return mobNum;
	}
	
}

