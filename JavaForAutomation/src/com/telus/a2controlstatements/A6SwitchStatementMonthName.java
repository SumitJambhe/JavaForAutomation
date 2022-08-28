package com.telus.a2controlstatements;

public class A6SwitchStatementMonthName {
	
	public static void main(String[] args) {
		
		String monthName="Jan";
		//String monthName="dec";//default is executed because of case sensitiveness or use toLowerCase method

	
		switch (monthName.toLowerCase()) {
		
		case "jan": System.out.println("Jan Month - 1");
		break;
		
		case "feb": System.out.println("Feb Month - 2");
		break;

		case "mar": System.out.println("Mar Month - 3");
		break;
		
		case "apr": System.out.println("Apr Month - 4");
		break;
		
		case "may": System.out.println("May Month - 5 ");
		break;
		
		case "jun": System.out.println("Jun Month - 6");
		break;
		
		case "Jul": System.out.println("Jul Month - 7");
		break;
		
		case "aug": System.out.println("Aug Month - 8");
		break;
		
		case "sep": System.out.println("Sep Month - 9");
		break;
		
		case "oct": System.out.println("Oct Month - 10");
		break;
		
		case "nov": System.out.println("Nov Month - 11");
		break;
		
		case "dec": System.out.println("Dec Month - 12");
		break;
		
		default : System.out.println("Enter the valid month name ");//No need of break

		}
		
	}

}
