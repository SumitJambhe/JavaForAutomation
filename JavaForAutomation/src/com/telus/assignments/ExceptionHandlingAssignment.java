package com.telus.assignments;

import java.util.Scanner;

/**
 * 
 * @author Sumit Jambhe
 * Assignment:- Program to implement Exception Handling.
 * Date:- 10/08/2022
 *
 */

public class ExceptionHandlingAssignment {
	
	public static void main(String[] args) 
	{
		
		
				// 1. Arithmetic Exception 
				int num1 = 10;
				int num2 = 0;
				try 
				{
					int output = num1/num2;
					System.out.println(output);
				}
				catch(ArithmeticException arr)
				{
					System.out.println("The Error message is "+ arr);
					System.out.println("Dont divide number by zero.");
				}
				
				System.out.println("****************************************************");
				
		        // 2. Null Pointer Exception
				String name = null;		
				try
				{
					if (name.equals("Selenium")) 
					{
						System.out.println("Strings are same.");
					}
					else
					{
						System.out.println("String are NOT same.");
					}
				}
				catch(NullPointerException arr)
				{
					System.out.println("The Error message is "+ arr);
					System.out.println("Don't enter the null value.");
				}
				
				System.out.println("*******************************************************");
				
				// 3. Array Index out of bounds exception
				
				int [] num = new int[6];
				
				try 
				{
					num[9]= 50;
					System.out.println(num[9]);
				}
				catch(ArrayIndexOutOfBoundsException arr)
				{
					System.out.println("The Error message is "+ arr);
					System.out.println("Mention the value within the array limit.");
				}
				
				System.out.println("******************************************************");
			
				// 4. Number Format Exception
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Read Two Number");
				String s1 = sc.nextLine();
				String s2 = sc.nextLine();					
				try 
				{
					int num3 = Integer.parseInt(s1);
					int num4 = Integer.parseInt(s2);
					System.out.println(num3+num4);
				}
				catch(NumberFormatException arr) 
				{
					System.out.println("The Error message is " + arr);
					System.out.println("Give the input only in the numeric format.");
				}
				
				System.out.println("***********************************");
				
				// try catch finally Concept using DB example
				
				try 
				{
					// Connect to data base
					// Run the query
					// Display the output
				}
				catch(Exception e)
				{
					// Exception code for data base issue
				}
				finally 
				{
					// This code will be executed as compulsory 
					System.out.println("Finally Block is executed.");
				}
						
			}
	}


