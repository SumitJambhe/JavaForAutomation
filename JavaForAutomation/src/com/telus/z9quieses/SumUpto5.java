package com.telus.z9quieses;

public class SumUpto5 {
	public static void main(String[] args) {
		int sum=0;
		int n=5;
		for (int i=1; i<=n; ++i)
		{
			sum +=i;
		}
		System.out.println("Sum = " + sum);
	}

}
//Sum = 15