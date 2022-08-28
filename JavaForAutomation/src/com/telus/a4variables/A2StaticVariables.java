package com.telus.a4variables;

public class A2StaticVariables {

	//Instance  Variables- Employee Datails

	String empNameOne = "Sumit";
	int empIDOne = 12345;
	float empSalaryone = 12345.55f;
	int empMobileOne;
	String empAddressOne;
	float empTaxOne;
	
	//Static Variables
	static String  companyName = "Telus International";
	static int companyRegId = 12345645;

	public static void main(String[] args) {
		// Create the object instance for employee one
		// ClassName ObjecName = new ClassNameConstructor();
		A1InstanceVariables empOne = new A1InstanceVariables();
		System.out.println("Employee One Name is: "+ empOne.empNameOne);//Umesh
		System.out.println("Employee One ID is: "+ empOne.empIDOne);//543528
		System.out.println("Employee One Salary is: "+ empOne.empSalaryone);//89522.55
		System.out.println("Employee One Mobile is: "+ empOne.empMobileOne);//0
		System.out.println("Employee One Address is: "+ empOne.empAddressOne);//null
		System.out.println("Employee One Tax is: "+ empOne.empTaxOne);//0.0
		
		//No need to create object instance for static variables
		System.out.println("Company Name is:" + companyName);//Telus International
		System.out.println("Company Registration ID is " + companyRegId);//12345645

	}

}
