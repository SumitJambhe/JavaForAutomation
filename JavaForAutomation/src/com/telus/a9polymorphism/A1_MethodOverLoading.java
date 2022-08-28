package com.telus.a9polymorphism;

public class A1_MethodOverLoading {

	// 1. By changing the number of arguments
	public static int multiply(int a , int b)
	{
		int result = a * b;
		return result;		
	}

	public static int multiply(int a , int b , int c) 
	{
		int result = a * b * c;
		return result;
	}

	// 2 By changing the data type of the method
	public static float multiply(float a, float b)
	{
		float result = a * b;
		return result;		
	}

	public static void main(String[] args) 
	{
		System.out.println(multiply(50 ,20));
		System.out.println(multiply(10 , 50 , 60));
		System.out.println(multiply(7.5f , 10.25f));		
		System.out.println(multiply(10 , 15.50f));//float is executed		
	}
}
//1000
//30000
//76.875
//155.0
