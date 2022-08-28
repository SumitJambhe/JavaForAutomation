package com.telus.b4accessmodifier2;
//Uncomment the below lines and learn the scope. 
import com.telus.b3accessmodifier1.A1_Self;


public class A1_Relatives extends A1_Self{

	public static void main(String[] args)
	{

		// Outside the package - Sub class only - Inheritance 
		// Here we have to create object for the present class
		A1_Relatives obj = new A1_Relatives();
		obj.bankName();
		obj.loanDetails();
		//obj.atmPassword();
		//obj.internetBanking()
	}
}
//50 Lakhs Home Loan in HDFC Bank
//Having Account in HDFC Bank
