package com.bittercode;

import java.util.Scanner;

//WAP to find sum of squares of two numbers
public class ExampleB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter value of a and b");
		// input for first value
		int a = scanner.nextInt();

		// input for second value
		int b = scanner.nextInt();

		// executions
		int squareOfA = a * a;

		int squareOfB = b * b;

		int result = squareOfA + squareOfB;

		// printing the result
		System.out.println("Squares sum of " + a + " and " + b + " is " + result);
	}

}
