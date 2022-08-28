package com.telus.assignments;

/**
 * 
 * @author Sumit Jambhe
 * Assignment:- Create a Java file and implement all the types of operators discussed in the class.
 * Date:- 24/07/2022
 */
public class OperatorAssignment {

	public static void main(String[] args) {

		// 1. Assignment Operator
		int num1 = 60;
		int num2 = 60;
		int num3 = 50;
		int num4 = 80;
		int num5 = 90;
		int num6 = 100;

		// 2. Arithmetic Operator

		// Addition
		System.out.println(num1 + num2 + num3+ num4 + num5 + num6);//440

		// Subtraction
		System.out.println(num6 - num3 );//50

		// Multiplication
		System.out.println(num6 * num4 * num1);//480000

		// Division
		System.out.println(num6/num3);//2

		// Remainder % or modulus operator
		System.out.println(200%3);//2

		System.out.println("******************");

		// 3. Equality and relational operators:- it return the boolean value
		//1. equal to (==)
		System.out.println(num1 == num2);//true

		//2.not equal to (!=)
		System.out.println(num3 != num2);//true

		//3.grater than (>)
		System.out.println(num2 > num3);//true 

		//4.greater than or equal to (>=)
		System.out.println(num6 >= num3);//true

		//5.less than (<)
		System.out.println(num5 < num6);//true

		//6.less than or equal to(<=) 
		System.out.println(num5 <= num4);//false

		//2.not equal to (!=)
		System.out.println(num3 != num2);//true

		System.out.println("******************");

		// 4. Conditional Operator

		// And - &&	:- If one of the condition becomes false then output will be false	
		System.out.println(num6 >= num3 && num3 != num2 && num5 <= num4);//true && true && false =False


		System.out.println("******************");

		// OR - || :- If one of the condition becomes true then output will be true
		System.out.println(num5 <= num4 || num3 != num2);//true
		System.out.println(num1 == num2 || num6 >= num3);//true

		System.out.println("********************");


		//5. UnaryOperator Operator
		//pre-increment-First increment then assign the value
		int i=20;
		int j=++i;
		System.out.println(i);//21
		System.out.println(j);//21

		System.out.println("***********************");

		//post-increment--First it will assign the value then  only will increment
		int k=j++;
		System.out.println(j);//22
		System.out.println(k);//21

		System.out.println("***********************");

		//pre-decrement:- First decrement then assign the value
		int l=--k;
		System.out.println(k);//20
		System.out.println(l);//20

		System.out.println("***********************");

		//post-decrement:- First it will assign the value then only will decrement
		int m=l--;
		System.out.println(l);//19
		System.out.println(m);//20

	}

}
