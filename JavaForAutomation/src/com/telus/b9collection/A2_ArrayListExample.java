package com.telus.b9collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class A2_ArrayListExample {

	public static void main(String[] args) {

		//type Casting Issue
		ArrayList obj = new ArrayList();
		obj.add(1234);//Autoboxing
		obj.add("Hello");
		obj.add(true);
		obj.add(454.43f);
		obj.add(null);
		System.out.println(obj);
		//[1234, Hello, true, 454.43, null]
		//We not perform operation because all are the object Addition, substracion(store it)

		System.out.println("===============================");

		//Generic Warrper Class Array List
		ArrayList<String> emp = new ArrayList<String>();
		emp.add("Sumit");
		emp.add("Anand");
		emp.add("Pranav");
		emp.add("Anand");//Duplicate allow
		emp.add("sathish");
		emp.add(null);//Null allow
		System.out.println(emp);
		//[Sumit, Anand, Pranav, Anand, sathish, null]

		System.out.println("=============Methods==================");

		//Size of the ArrayList
		System.out.println(emp.size());
		//5

		//----------------------------------------------------------

		//Retrive the value using index
		System.out.println(emp.get(2));
		//Pranav

		//----------------------------------------------------------

		//Updating or Replacing the value
		emp.set(3, "Arun");
		System.out.println(emp);
		//[Sumit, Anand, Pranav, Arun, sathish]

		//----------------------------------------------------------

		//Removing the value using Indec
		emp.remove(5);//Null remove
		emp.remove(4);//Satish remove
		System.out.println(emp);
		//[Sumit, Anand, Pranav, Arun]

		//----------------------------------------------------------

		//Removing the value using Object Value
		emp.remove("Pranav");
		System.out.println(emp);
		//[Sumit, Anand, Arun]
		
		//Sorting the Object Values
		Collections.sort(emp);
		System.out.println(emp);
		//[Anand, Arun, Sumit]
				
		System.out.println("==============simple for loop=================");
		
		for(int i=0; i<emp.size(); i++)
		{
			System.out.println("Name of the employee: " +emp.get(i));
		}
//		Name of the employee: Anand
//		Name of the employee: Arun
//		Name of the employee: Sumit

		System.out.println("============== for each loop=================");
		for(String name : emp)
		{
			System.out.println("Name of the employee: " +name);
		}
//		Name of the employee: Anand
//		Name of the employee: Arun
//		Name of the employee: Sumit

		System.out.println("============== iterator=================");
		Iterator itr = emp.iterator();//whenever iterator comes we use the while loop
		while(itr.hasNext())
		{
			System.out.println("Name of the Employee: "+ itr.next());
		}
//		Name of the Employee: Anand
//		Name of the Employee: Arun
//		Name of the Employee: Sumit
		
		System.out.println("=============Methods==================");
		
		//remove all the values
		emp.removeAll(emp);
		System.out.println(emp);
		//[]

	}

}
