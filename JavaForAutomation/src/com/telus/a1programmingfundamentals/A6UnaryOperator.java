package com.telus.a1programmingfundamentals;

public class A6UnaryOperator {
	
	public static void main(String[] args) {
		
		int i=10;
		//pre-increment --> ++i
		System.out.println(++i);//11
		
		int j=++i;
		System.out.println("Value of i= "+i);//12
		System.out.println(j);
		
		//Post Increment--> i++, First it will assign the value then only it will increment
		int a=10;
		int b=a++;
		System.out.println("Value of i= "+a);//11
		System.out.println("Value of i= "+b);//10
	}

}
