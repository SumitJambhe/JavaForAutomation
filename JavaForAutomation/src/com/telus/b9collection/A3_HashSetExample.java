package com.telus.b9collection;

import java.util.HashSet;

public class A3_HashSetExample {
	
	public static void main(String[] args) {
		
		HashSet<String > emp = new HashSet<String>();
		emp.add("Sumit");
		emp.add("Anand");
		emp.add("Pranav");
		emp.add("Anand");//Duplicate allow
		emp.add("sathish");
		System.out.println(emp);
		//[Pranav, sathish, Anand, Sumit]--> Duplicate value removed, insertion not preseved
		
		System.out.println("===========================================");
		
		//Size of the Hashset
		System.out.println(emp.size());
		//4
		
		//Remove the value from the HashSet
		emp.remove("sathish");
		System.out.println(emp);
		//[Pranav, Anand, Sumit]
		
		System.out.println("============== for each loop=================");
		for(String name : emp)
		{
			System.out.println("Name of the employee: " +name);
		}
//		Name of the employee: Pranav
//		Name of the employee: Anand
//		Name of the employee: Sumit
		
	}

}
