package com.telus.b3accessmodifier1;

public class A1_Self {

	// Public - Access to all of them 
	public void bankName() {
		System.out.println("Having Account in HDFC Bank");
	}

	// Protected - Access within package and outside package using inheritance
	//Getting error from the last class one by one
	protected void loanDetails() {
		System.out.println("50 Lakhs Home Loan in HDFC Bank");
	}

	// Default - Access to only within the package 
	void atmPassword() {
		System.out.println("1234 is ATM password");
	}

	// Private - Access only within the class
	private void internetBanking() {
		System.out.println("xyz is is internet banking password");
	}	

	public static void main(String[] args) 
	{
		A1_Self obj = new A1_Self();
		obj.bankName();
		obj.loanDetails();
		obj.atmPassword();
		obj.internetBanking();
	}
}
//Having Account in HDFC Bank
//50 Lakhs Home Loan in HDFC Bank
//1234 is ATM password
//xyz is is internet banking password
