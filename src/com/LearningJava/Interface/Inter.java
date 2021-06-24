package com.LearningJava.Interface;

public class Inter {

	public static void main(String[] args) {
		// Executing the methods stored in InterfaceImpl
		
		InterfaceImpl itrf = new InterfaceImpl();
		String nm = itrf.getName();
		System.out.println(nm);
		itrf.show();
	}

}
