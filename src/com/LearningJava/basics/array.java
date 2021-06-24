package com.LearningJava.basics;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		// Already giving Valus
		int [] a = {1 , 2 , 3 , 4 , 5 };
		System.out.println(Arrays.toString(a));
		
		// Initialising the array with capacity of 5
		int [] n = new int[5];
		n[0] = 1;
		n[1] = 2;
		n[2] = 3;
		System.out.println(Arrays.toString(n));
	}

}
