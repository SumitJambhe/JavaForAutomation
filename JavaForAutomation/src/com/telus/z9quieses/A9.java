package com.telus.z9quieses;

public class A9 {
	
	public  float areaOfTrianle(float base, float height)
	{
		float area= (base*height)/2;
		return area;
	}
	
	public static void main(String[] args) {
		
		A9 a=new A9();
		float area = a.areaOfTrianle(200f, 300f);
		System.out.println(area);
		
	}

}
