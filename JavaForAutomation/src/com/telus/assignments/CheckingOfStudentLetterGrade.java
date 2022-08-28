package com.telus.assignments;

/**
 * 
 * @author Sumit Jambhe
 * Assignment:-
 * 
 * Using if else if ladder write java program for students grade.
 * Student Marks 	Letter Grade
 * 80 and above	         O
 * 75 to 79				 A
 * 70 to 74				 B
 * 60 to 69				 C
 * 50 to 59				 D
 * 45 to 49				 E
 * 40 to 44				 P
 * 39 and below	         F (Fail)
 * 
 * Date:- 24/07/2022
 *
 */

public class CheckingOfStudentLetterGrade {

	public static void main(String[] args) {

		int marks =65;

		if(marks >= 80 &&  marks <=100)
		{
			System.out.println("You obtained 'O' grade");
		}
		else if(marks >= 75 && marks <= 79)
		{
			System.out.println("You obtained 'A' grade");
		}
		else if(marks >= 70 && marks <= 74)
		{
			System.out.println("You obtained 'B' grade");
		}
		else if(marks >= 60 && marks <= 69)
		{
			System.out.println("You obtained 'C' grade");
		}
		else if(marks >= 50 && marks <= 59)
		{
			System.out.println("You obtained 'D' grade");
		}
		else if(marks >= 45 && marks <= 49)
		{
			System.out.println("You obtained 'E' grade");
		}
		else if(marks >= 40 && marks <= 44)
		{
			System.out.println("You obtained 'F' grade");
		}
		else if (marks <=39 && marks >=0 )
		{
			System.out.println("You obtained ' F (Fail)' grade");
		}
		else
		{
			System.out.println("Enter the marks between the rang (0-100)");
		}
	}
}

