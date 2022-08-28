package com.telus.a3buildinmethods;

import java.util.Arrays;

public class A3JavaArraysExample {

	public static void main(String[] args) {


		// 1.Create Array 
		//syn: dataType arrName[];
		int arrNum[];

		//2. Define the array size - allocate the memory
		// Syn: arrName= new arrName[];
		arrNum = new int[5];

		//3. Assign the values
		arrNum[0] = 10;
		arrNum[1] = 20;
		arrNum[3] = 40;
		arrNum[4] = 50;

		System.out.println(arrNum[3]);//40
		System.out.println(arrNum[2]);//0
		//System.out.println(arrNum[5]);////ArrayIndexOutOfBoundsException

		//Alternative way
		int arrNum2[] = { 10, 15, 30, 45,60, 75, 90 };
		System.out.println(arrNum2[5]);//75

		System.out.println("*******************************");

		//for each- arrays concept
		for (int iArr :arrNum2)
		{
			System.out.println(iArr);
		}
		//		10
		//		15
		//		30
		//		45
		//		60
		//		75
		//		90

		System.out.println("*******************************");

		String arrName[] = {"Aakash" , "Bhagwan", "Charan", "Divya", "Deepak"};

		System.out.println(arrName[2]);//Bhagwan
		System.out.println("*******************************");
		for(String iArr : arrName )
		{
			System.out.println(iArr);
		}
		//		Aakash
		//		Bhagwan
		//		Charan
		//		Divya
		//		Deepak
		
		
		//Array Methods
		//Present or not
		System.out.println(Arrays.asList(arrName));//[Aakash, Bhagwan, Charan, Divya, Deepak]
		boolean name = Arrays.asList(arrName).contains("Deepak");
		System.out.println(name);//true
		
		System.out.println("*******************************");

		//13. split() method--We can split with help of dot.
		String valmsg= "Example : 99 : Thank you";
		String[] arrWords = valmsg.split(":");
		for(String iArr:arrWords)
		{
			System.out.println(iArr);
		}
//		Example 
//		 99 
//		 Thank you


	}

}
