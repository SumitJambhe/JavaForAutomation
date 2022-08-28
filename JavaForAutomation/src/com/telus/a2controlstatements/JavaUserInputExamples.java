package com.telus.a2controlstatements;

import java.util.Scanner;

public class JavaUserInputExamples {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		//char as Initial 
		System.out.println("Enter the Employee Intial: ");
		char initial = sc.nextLine().charAt(0);
		System.out.println("Employee Name is: "+ initial);


		//String as Input 
		System.out.println("Enter the Employee Name: ");
		String name = sc.nextLine();
		System.out.println("Employee Name is: "+ name);

		//Integer as Input
		System.out.println("Enter the Employee Age : ");
		int age = sc.nextInt();
		System.out.println("Employee age is "+ age);

		//Float as input
		System.out.println("Enter the Employee Tax : ");
		float tax = sc.nextFloat();
		System.out.println("Employee age is "+ tax);

		//		    Enter the Employee Intial: 
		//			Sumit
		//			Employee Name is: S
		//			Enter the Employee Name: 
		//			Sumit Jambhe
		//			Employee Name is: Sumit Jambhe
		//			Enter the Employee Age : 
		//			26
		//			Employee age is 26
		//			Enter the Employee Tax : 
		//			24000
		//			Employee age is 24000.0



	}

}
