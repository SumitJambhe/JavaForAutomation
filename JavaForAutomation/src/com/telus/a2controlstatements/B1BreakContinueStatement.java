package com.telus.a2controlstatements;

public class B1BreakContinueStatement {

	public static void main(String[] args) {
		//Break statement
		//program to print 1 to 10
		for(int num=1; num<=10; num++)
		{
			if(num==5) 
			{
				break;
			}
			System.out.println(num);
		}
		
		System.out.println("***********************************");

		//Continue statement:- The code below the continue statement will not be executed.
		//program to print 1 to 10
		for(int num=1; num<=10; num++)
		{
			if(num==5) 
			{
				continue;
			}
			System.out.println(num);
		}
	}

}
