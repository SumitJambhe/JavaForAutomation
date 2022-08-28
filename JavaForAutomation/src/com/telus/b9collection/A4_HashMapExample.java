package com.telus.b9collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class A4_HashMapExample {
	
	public static void main(String[] args) {
		
		HashMap<String, String> empDatails = new HashMap<String, String>();
		empDatails.put("firstName", "Sumit");
		empDatails.put("lastName", "Jambhe");
		empDatails.put("gender", "male");
		empDatails.put("emailID", "abc@gmai.com");
		empDatails.put("city", "Amravati");
		System.out.println(empDatails);
		//{firstName=Sumit, lastName=Jambhe, gender=male, city=Amravati, emailID=abc@gmai.com}
		
		System.out.println("======================================================================");
		
		//Duplicate Value-->print Always last updated value
		empDatails.put("city", "Delhi");
		System.out.println(empDatails);
		//{firstName=Sumit, lastName=Jambhe, gender=male, city=Delhi, emailID=abc@gmai.com}
		
		System.out.println("=============================Methods=========================================");
		
		//size of the HashMap
		System.out.println(empDatails.size());
		//5
		
		//Retrive the value based on the Key
		System.out.println(empDatails.get("emailID"));
		//abc@gmai.com
		
		//Remove the values based on the HashMap values
		empDatails.remove("city");
		System.out.println(empDatails);
		//{firstName=Sumit, lastName=Jambhe, gender=male, emailID=abc@gmai.com}
		
		//Remove the values based on the Key and value pair
		empDatails.remove("emailID", "abc@gmai.com");
		System.out.println(empDatails);
		//{firstName=Sumit, lastName=Jambhe, gender=male}
		
		//Replace or Update the value in the HashMap
		empDatails.replace("firstName", "Mr.Sumit");
		System.out.println(empDatails);
		//{firstName=Mr.Sumit, lastName=Jambhe, gender=male}

		System.out.println("=============================for each loop=========================================");
		for(Map.Entry<String,String> details : empDatails.entrySet())//java.util.map
		{
			System.out.println(details.getKey() + "-->" + details.getValue());
		}
//		firstName-->Mr.Sumit
//		lastName-->Jambhe
//		gender-->male

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
		//{12345={firstName=Mr.Sumit, lastName=Jambhe, gender=male}}
		
		
		System.out.println("=============================Hash Table=========================================");
        
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(101," ajay");
        ht.put(101,"Vijay");
        ht.put(102,"Ravi");
        ht.put(103,"Rahul");
        for (Map.Entry m:ht.entrySet()) 
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        
//        103 Rahul
//        102 Ravi
//        101 Vijay

	}

}
