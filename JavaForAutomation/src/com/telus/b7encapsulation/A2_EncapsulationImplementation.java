package com.telus.b7encapsulation;

public class A2_EncapsulationImplementation {

	public static void main(String[] args) {

		A1_EncapsulationExample obj = new A1_EncapsulationExample();
		//After entering the correct details you get the OTP 
		obj.setName("Vinoth");//data and method
		obj.setEmpNum(123544);
		obj.setAge(32);
		obj.setMobNum(968545756);

		System.out.println((obj.getName()));
		System.out.println((obj.getEmpNum()));
		System.out.println((obj.getAge()));
		System.out.println((obj.getMobNum()));
	}
}
//Getter and setter method we access the private variable
//Vinoth
//123544
//32
//968545756
