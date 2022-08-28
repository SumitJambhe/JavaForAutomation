package com.telus.a2controlstatements;

public class A3IfElseIfLadder {

	public static void main(String[] args) {

		//Program to validate student marks

		int marks =35;

		if(marks==35)
		{
			System.out.println(marks + " is just pass");
		}
		else if(marks>35 && marks<90)
			//else if(marks>35 || marks<90)--> 99-developer mistake it becomes good marks insted of merit marks because of or operator
		{
			System.out.println(marks + " is good marks");
		}
		else if(marks>=90)
		{
			System.out.println(marks + " is merit  marks");

		}
		else
		{
			System.out.println(marks + " is fail marks");

		}
	}

}
