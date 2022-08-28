package com.telus.assignments;

/**
 * @author Sumit Jambhe
 * Assignment:- Write a java programs to explain each concepts of HashMap as discussed in the class for mentioned topics:
                Refer the uploaded code in the module and recreate the same scenario. 
 * Date:- 23/08/2022
 */

import java.util.HashMap;
import java.util.Map;

public class HashMapAssignment {
	
	public static void main(String[] args) {
		
		HashMap<String, String> empDatails = new HashMap<String, String>();
		empDatails.put("firstName", "Sumit");
		empDatails.put("lastName", "Jambhe");
		empDatails.put("gender", "male");
		empDatails.put("emailID", "abc@gmai.com");
		empDatails.put("city", "Amravati");
		System.out.println(empDatails);
	
		
		System.out.println("======================================================================");
		
		//Duplicate Value-->print Always last updated value
		empDatails.put("city", "Delhi");
		System.out.println(empDatails);
		
		System.out.println("=============================Methods=========================================");
		
		//size of the HashMap
		System.out.println(empDatails.size());
		
		//Retrive the value based on the Key
		System.out.println(empDatails.get("emailID"));
		
		//Remove the values based on the HashMap values
		empDatails.remove("city");
		System.out.println(empDatails);
		
		//Remove the values based on the Key and value pair
		empDatails.remove("emailID", "abc@gmai.com");
		System.out.println(empDatails);
		
		//Replace or Update the value in the HashMap
		empDatails.replace("firstName", "Mr.Sumit");
		System.out.println(empDatails);

		System.out.println("=============================for each loop=========================================");
		for(Map.Entry<String,String> details : empDatails.entrySet())//java.util.map
		{
			System.out.println(details.getKey() + "-->" + details.getValue());
		}


		System.out.println("=============================Nested HashMap=========================================");
		/*
		 * Value
		 * values
		 * Object(K:V)
		 * object(K, Object(K:V));
		 */
		
		HashMap<Integer, HashMap<String, String> >  empOne = new  HashMap<Integer, HashMap<String, String> >();
		empOne.put(12345, empDatails);
		System.out.println(empOne);
	}

}
