package com.telus.assignments;

/**
 * 
 * @author Sumit Jambhe
 * Assignment : Single program to implement Instance and Static Variables
 * Date : 26/07/2022
 *
 */

public class JavaVariables {

	//Instance variable student details

	String cityName = "Amaravati";
	int idCardNo = 12245;
	int stdMobileNo ;
	String stdEmailId ="abc@gmail.com";
	float examFee = 12345.50f;

	//Static variable 
	static String  collegeName = "Shivaji College";
	static int collegeRegId = 858552;


	public static void main(String[] args) {

		// Calling of instance variable
		JavaVariables jvar = new JavaVariables();
		System.out.println("Student One cityName is: "+ jvar.cityName);
		System.out.println("Student One idCardNo is: "+ jvar.idCardNo);
		System.out.println("Student One stdMobileNo is: "+ jvar.stdMobileNo);
		System.out.println("Student One stdEmailId is: "+ jvar.stdEmailId);
		System.out.println("Student One examFee is: "+ jvar.examFee);

		System.out.println("*************************************");

		//calling of static variable
		System.out.println("Student One collegeName is: "+ collegeName );
		System.out.println("Student One collegeRegId is: "+ collegeRegId );

	}

}
