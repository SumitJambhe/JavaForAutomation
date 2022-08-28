package com.telus.a4variables;

public class A1InstanceVariables {

	//Instance  Variables- Employee Datails

	String empNameOne = "Sumit";
	int empIDOne = 12345;
	float empSalaryone = 12345.55f;
	int empMobileOne;
	String empAddressOne;
	float empTaxOne;

	//Instance  Variables- Employee Datails

	String empNameTwo = "Umesh";
	int empIDTwo = 543528;
	float empSalaryTwo = 89522.55f;
	int empMobileTwo;
	String empAddressTwo;
	float empTaxTwo;

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
		
		System.out.println("************************");

		// Create the object instance for employee one
		A1InstanceVariables empTwo = new A1InstanceVariables();
		System.out.println("Employee Two Name is: "+ empTwo.empNameTwo);//Sumit
		System.out.println("Employee Two ID is: "+ empTwo.empIDTwo);//12345
		System.out.println("Employee Two Salary is: "+ empTwo.empSalaryTwo);//12345.55
		System.out.println("Employee Two Mobile is: "+ empTwo.empMobileTwo);//0
		System.out.println("Employee Two Address is: "+ empTwo.empAddressTwo);//null
		System.out.println("Employee Two Tax is: "+ empTwo.empTaxTwo);//0.0

	}

}
