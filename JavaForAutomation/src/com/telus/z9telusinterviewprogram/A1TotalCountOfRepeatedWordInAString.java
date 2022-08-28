package com.telus.z9telusinterviewprogram;

//total count of the Java
public class A1TotalCountOfRepeatedWordInAString {
	
	public static void main(String[] args) {
		
		String msg = "Welcome to Java Class. Java is my most fav language. Thank you Java. Java  is easy langauge ";
		String[] splitwords = msg.split("Java");
		
		for(String iArr:splitwords)
		{
			System.out.println(iArr);
		}
//		Welcome to 
//		 Class. 
//		 is my most fav language. Thank you 
//		. 
//		  is easy langauge
		System.out.println(splitwords.length-1);//4
		
		//Exception if there is last word is java then we have to go for the regular method 
		
	}

}
