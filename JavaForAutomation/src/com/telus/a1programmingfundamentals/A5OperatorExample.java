package com.telus.a1programmingfundamentals;

public class A5OperatorExample {
	
	public static void main(String[] args) {
		
		//1. Assignment operator (=)
		
		int num1=100;
		int num2=200;
		int num3=300;
		int num4=400;
		
		//2.Arithmetic Operator
		
		//1. Addition
		
		System.out.println(num1 + num2);//300
		
		//2. Subtraction
		System.out.println(num2 - num1);//100
		
		//3.Multiplication
		
		System.out.println(num1 * num3);//30000
		
		//Division 
		System.out.println(num4/num2);//2
		
		//5.Remainder %
		System.out.println(10%3);//1
		
		
		System.out.println("**********************************");
		
		
		//Equality and Relational operator-->output is boolean
		
		int num5= 10;
		int num6= 20;
		int num7= 10;
		//1. equal to (==)
		
		System.out.println(num5==num6);//false
		System.out.println(num5==num7);//true
		
		//2.not equal to (!=)
		System.out.println(num5 != num6 );//true
		
				
		//3.grater than (>)
		System.out.println(num5 > num6);//false 
		
		//4.greater than or equal to (>=)
		System.out.println(num5>=num6);//false
		
		//5.less than (<)
		System.out.println(num5 < num6);//true
		
		//6.less than or equal to(<=) 
		System.out.println(num5 <=num6);//true
		
		System.out.println("**************************************");
		
		//4.Conditional Operator
		//1. and operator &&-Both condition is true then output is true
		System.out.println(num5==num6 && num5==num7 );//false
		
		//2. or operator ||- Any one condtion is false then false.
		System.out.println(num5 <=num6 || num5>=num6); //true

	}
	

}
