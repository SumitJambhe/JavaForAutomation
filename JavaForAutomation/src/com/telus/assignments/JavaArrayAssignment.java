package com.telus.assignments;

/**
 * 
 * @author Sumit Jambhe
 * Assignment:-Create java array for integer and string data type.  Print it using for each loop.
 * Date :- 26/07/2022  
 *
 */

public class JavaArrayAssignment {


	public static void main(String[] args) {

		//Java Integer data type array 

		int numArr[] = { 50 , 60, 70 ,80, 50, 60 , 80 };
		for(int iArr:numArr)
		{
			System.out.println(iArr);
		}

		System.out.println("**************************************");

		//Java String data type array

		String nameArr[] = { "Vishal", "Sagar" , "Vaibhav" , "Gaurav" , "Manish"};
		for(String iArr : nameArr)
		{
			System.out.println(iArr);
		}


	}

}
