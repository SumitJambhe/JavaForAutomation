package com.telus.assignments;

/**
 * 
 * @author Sumit Jambhe
 * Assignment :- Create a single java file covers all the string methods as discussed in the training. 
 * Date:- 24/07/2022
 *
 */

public class StringBuildInMethodAssignment {

	public static void main(String[] args) {

		String popup = "Session is expired";


		/* 1. length() --> which return the length of string. 
		                   It also consider the spaces in the string.*/
		System.out.println("Output of string length method: ");
		System.out.println(popup.length());//18
		System.out.println("*************************************************");


		// 2. toLowerCase()--> It will convert the whole string into the Lower Case.
		System.out.println("Output of string toLowerCase method: ");
		System.out.println(popup.toLowerCase());
		System.out.println("*************************************************");


		// 3. toUpperCase()--> It will convert the whole string into the Upper Case.
		System.out.println("Output of string toUpperCase method: ");
		System.out.println(popup.toUpperCase());

		System.out.println("*************************************************");
		System.out.println("*************************************************");





		/* 4. trim()--> It removes the starting and ending void spaces of the string.
		 *              It will not remove the middle white space*/
		String fullName = " Sumit Jambhe ";
		System.out.println("Output of string trim method:");
		System.out.println(fullName.trim());
		System.out.println("*************************************************");
		System.out.println("*************************************************");





		// 5. concat()--> It will combine two string and gives one string as output.
		String firstName = "Sumit ";
		String lastName = "Jambhe";

		System.out.println("Output of string concat method: ");
		System.out.println(firstName.concat(lastName));
		System.out.println("*************************************************");
		System.out.println("*************************************************");







		//Two way comparison
		/* 6. equals() -->It compare the two string is exactly equal or not.
		                  (comes the concept of Case Sensitiveness)*/
		String personOneName = "Sumit Jambhe";
		String personTwoName = "Sumit JaMbhe";
		System.out.println("Output of string equals method: ");
		System.out.println(personOneName.equals(personTwoName));
		System.out.println("Output of string equalsIgnoreCase method: ");
		System.out.println(personOneName.equalsIgnoreCase(personTwoName));
		System.out.println("*************************************************");
		System.out.println("*************************************************");






		//Three ways comparision
		// 7. compareTo()--> It will return the value -ve, 0 , +ve .
		String var1 = "Sumit";
		String var2 = "sumit";
		String var3 = "sumit";
		System.out.println("Output of string compareTo method: ");
		System.out.println(var1.compareTo(var2));//-32

		System.out.println("Output of string compareTo method: ");
		System.out.println(+var2.compareTo(var1));//32

		System.out.println("Output of string compareTo method: ");
		System.out.println(var2.compareTo(var3));//0

		System.out.println("Output of string compareToIgnoreCase method: ");
		System.out.println(var1.compareToIgnoreCase(var2));//0
		System.out.println("*************************************************");
		System.out.println("*************************************************");





		// 8. charAt()--> It will returns the character at the index position which is given as input
		String notification= "Today is class off";

		System.out.println("Output of string charAt method: ");
		System.out.println(notification.charAt(6));//i

		//System.out.println("Output of string charAt method: "+notification.charAt(100));//StringIndexOutOfBoundsException
		System.out.println("*************************************************");


		/* 9. indexOf()--> It will return the index position of the character of string which we have to want.
		                   character is not present then it  give -1.*/
		System.out.println("Output of string indexOf method: ");
		System.out.println(notification.indexOf('c'));//9

		System.out.println("Output of string indexOf method: ");
		System.out.println(notification.indexOf('z'));//-1

		System.out.println("Output of string indexOf method: ");
		System.out.println(notification.indexOf('o',2));//15


		System.out.println("*************************************************");
		System.out.println("*************************************************");




		// 10. contains()--> It return the boolean status whether the particular string or set of character in the sequential manner is present or not.

		String registrationMsg="Registreation is Successfully Completed. Your registration number is : 58555552222222 . Thank you !!!";

		System.out.println("Output of string contains method: ");
		System.out.println(registrationMsg.contains("Registreation is Successfully Completed"));//true 
		System.out.println("*************************************************");


		// 11. substring()--> It will return the substring or part of the string from the given index which we give as input.(Begin Index, End index-1)
		System.out.println(registrationMsg.indexOf(':'));//69
		System.out.println("Output of string substring only: ");
		System.out.println(registrationMsg.substring(71));//58555552222222 . Thank you !!!
		System.out.println("Output of string substring with begin index and end index method: ");
		System.out.println(registrationMsg.substring(71, 85));//58555552222222
		System.out.println("*************************************************");



		// 12. replace() -->It replace the old character with new character
		String sample = "Sumit Mahore";
		System.out.println("Output of string without replace method: ");
		System.out.println(sample);
		String corected = sample.replace("Mahore", "Jambhe");
		System.out.println("Output of string replace method: ");
		System.out.println(corected);
		System.out.println("*************************************************");


		// 13 . Handling Special Characters
		System.out.println("Output of string length method: ");
		System.out.println("His name is \"Jagan Mohon Pande\"");
		System.out.println("*************************************************");


		// 14. Split()--It split the string a/c to condition and store into the array.
		String msg= "Enter you valid name";
		String[] arrWords = msg.split(" ");
		System.out.println("Output of string Split method: ");
		for(String iArr:arrWords)
		{
			System.out.println(iArr);
		}

	}
}
