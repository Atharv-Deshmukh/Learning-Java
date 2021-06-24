package com.LearningJava.basics;

public class Loops {

	public static void main(String[] args) {
		// For Loop
		System.out.println("For Loop: ");
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// While Loop
		System.out.println("While Loop: ");
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		
		// Do While Loop
		System.out.println("Do While Loop: ");
		int a = 0;
		do {
			System.out.println(a);
			a++;
		}while(a < 10);
		
		// For Each
		String [] fruits = {"Apple", "Banana", "Cherry", "Mango"};
		for(String fruit: fruits) {
			System.out.println(fruit);
		}

	}

}
