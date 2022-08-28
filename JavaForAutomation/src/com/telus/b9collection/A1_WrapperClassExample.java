package com.telus.b9collection;

public class A1_WrapperClassExample {
	
	public static void main(String[] args) {
		
		int num=50;
		Integer obj= new Integer(num);
		
		//Primitive to Object-->boxing or wrapping (Manually)
		Integer a = Integer.valueOf(num);
		
		//autoBoxing-->Integer.valueOf(20);
		Integer b=20;
		
		System.out.println(a+b);//70
		
		//--------------------------------------------------------------
		
		//unboxing
		int i = a.intValue();
		
		//Alternative-->a1.intValue();
		int j = a;
		
	}

}
