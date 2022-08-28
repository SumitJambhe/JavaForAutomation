package com.telus.b4accessmodifier2;

//Uncomment the below lines and learn the scope. 

import com.telus.b3accessmodifier1.A1_Self;

public class A2_Neighbour {

	public static void main(String[] args) 
	{

		// Outside the package
		A1_Self obj = new A1_Self();
		obj.bankName();
		//obj.loanDetails();
		//obj.atmPassword();
		//obj.internetBanking()
	}
}
//Having Account in HDFC Bank
