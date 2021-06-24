package com.LearningJava.basics;

import java.util.Scanner;

public class ReadingInput {

	public static void main(String[] args) {
		// Reading input
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter a Integer: ");
		a = sc.nextInt();
		System.out.println("You Entered: "+a);
	}

}
