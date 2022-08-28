package com.telus.a3buildinmethods;

public class A2StringMethods {

	public static void main(String[] args) {

		String msg = "Welcome To Java Class";

		// 1. length()  - which returns the number of characters contained in the string object. Credit Card number, ATM pin, Minimum Password
		//space also consider.
		System.out.println(msg.length());//7

		// 2. toLowerCase() - Converts all of the characters in this String to lower case, emailID
		System.out.println(msg.toLowerCase());//welcome to java class


		// 3. toUpperCase() - Converts all of the characters in this String to Upper case, when resister in the Top welcome
		System.out.println(msg.toUpperCase());//WELCOME TO JAVA CLASS


		// 4. trim() - Returns a copy of the string, with leading and trailing whitespace omitted, while filling the form they remove the space
		String emailID = " sumitjambhe9@gmail.com ";
		System.out.println(emailID);       // sumitjambhe9@gmail.com 
		System.out.println(emailID.trim());//sumitjambhe9@gmail.com


		System.out.println("*****************************************************************************");


		// 5. concat() - This returns a new string by combining both the strings(String 2 added to it at the end)
		String val1 = "Sumit ";
		String val2 = "Pranav ";
		String val3 = "Anand";

		System.out.println(val1 + val2);//Sumit Pranav 
		System.out.println(val1 + val2 + val3);//Sumit Pranav Anand
		System.out.println(val1.concat(val2));//Sumit Pranav 
		System.out.println(val1.concat(val2).concat(val3));//Sumit Pranav Anand

		System.out.println("*****************************************************************************");


		/*
		 * ASCIT
		 * A to Z ( 65 to  90 )
		 * a to z (97  to  122 )
		 */
		//String comparison
		//Two Way comparison
		// 6. equals() - This method returns true if the String are equal; false otherwise.
		String val4 =  "Anand";
		String val5 =  "AnanD";
		System.out.println(val4 == val5);//false
		System.out.println(val4.equals(val5));//false
		System.out.println(val4.equalsIgnoreCase(val5));//true


		//Three way comparison
		/* 7. compareTo() - It compares the given string with current string index based(order). 
		 * It returns positive number, negative number or 0
		 * String 1 start with same case == String 2 start with same case -->0
		 * String 1 start with Lower case > String 2 start with Upper case--> +ve 32 value
		 * String 1 start with Upper case  < String 2 start with Lower case--> -ve 32 value
		 */
		String  val6 = "Aman";
		String  val7 = "AmaN";
		System.out.println(val6.compareTo(val7));//-32 , First value minus second value asci value
		System.out.println(val7.compareTo(val6));//32
		System.out.println(val6.compareToIgnoreCase(val7));//0

		System.out.println("*************************************************************************");


		//Index concept- Count start from the Zero
		// 8. charAt() - Return the character of the mentioned index value.	
		String outputmsg = "example: 98 . Thank you !! ";
		System.out.println(outputmsg.charAt(9));//9
		//System.out.println(outputmsg.charAt(100));//java.lang.StringIndexOutOfBoundsException

		// 9. indexOf()  - Returns the index of the specified character.When something is not there is gives -1.
		System.out.println(outputmsg.indexOf('a'));//2
		System.out.println(outputmsg.indexOf('z'));//-1
		System.out.println(outputmsg.indexOf('e'));//0
		System.out.println(outputmsg.indexOf('e', 1 ));//6

		System.out.println("*************************************************************************");

		
		// 10. contains() - Return true if the string contains specific characters
		String courseID = "Registreation is Successfully Completed. Your registration number is : 58555552222222 . Thank you !! ";
		
		System.out.println(courseID.contains("Registreation is Successfully Completed"));//true
		System.out.println("*************************************************************************");


		// 11. substring() - It returns a part of the string
		String valmsg = "Example: 99 . Thank you !!";
		System.out.println(valmsg.indexOf(':'));//7
		System.out.println(valmsg.substring(9));//99 . Thank you !!
		System.out.println(valmsg.substring(9, 11));//99
		System.out.println("*************************************************************************");
		
		System.out.println(courseID.indexOf(':'));//69
		System.out.println(courseID.substring(71));//58555552222222 . Thank you !! , till the last value pick it 
		System.out.println(courseID.substring(71, 85));
		

		System.out.println("*************************************************************************");
 

		// 12. replace() - A string replacing all the old character/word
		String wcmsg = "Welcome to Python Class. Python is easy to learn";
		String updatemsg = wcmsg.replace("Python", "Java");
		System.out.println(updatemsg);
		
		

		// 13 . Handling Special Characters
		// Because strings must be written within quotes, Java will misunderstand this string, and generate an error:
		System.out.println("Hello !! Welcome to \"Java\" Class");

		// Note: 14. Split() function will be discussed during array topic





	}

}
