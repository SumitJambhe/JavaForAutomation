package com.telus.a3buildinmethods;

public class A1MathMethods {
	
	public static void main(String[] args) {
		
		int num1= 100;
		int num2= 200;
		int num3= -100;
		float num4= 234.44f;//234.74f;
		
		System.out.println(Math.max(num1, num2));//200
		
		System.out.println(Math.min(num1, num2));//100
		
		System.out.println(Math.abs(num3));//100, absolute means remove the negative sign
		
		
		System.out.println(Math.round(num4));//234,235
		
		System.out.println(Math.random());//0.9999455445454, output is decimal format starts 0.xxxxxxx
		
		//Program to generate random number between 0 to 1000
		System.out.println(Math.random()*1000);//999.9455445454
		
		int randomNumber= (int) (Math.random()*1000);
		System.out.println(randomNumber);//999
		
		
		System.out.println("************************************************");
		
		
		//while retriving values from web page, the data type will be string "101010"
		//then I have to convert sting to integer
		
		//Integer parsing-Convert string to integer
		int x=Integer.parseInt("10");
		System.out.println(x);
		
		int y=Integer.parseInt("50");
		System.out.println(y);
		
		System.out.println(x+y);//60
		System.out.println("10"+"20");//1020
		
			
	}

}
