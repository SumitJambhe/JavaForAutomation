package com.telus.z9quieses;

public class StringMethods {
	
	public static void main(String[] args) {
		String s="Selenium Training";
		String s1 = s.substring(9);//Training
		String s2 = s.substring(9, 17);//Training
		char s3 = s.charAt(5);//i
		int s4 = s.length();//17
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
//Training
//Training
//i
//17
