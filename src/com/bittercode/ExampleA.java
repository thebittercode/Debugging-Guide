package com.bittercode;

import java.util.Scanner;

//Write a program to find cube of a number
public class ExampleA {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the value to find its cube: ");

		// taking the input
		int input = scanner.nextInt();
		System.out.println("input value: " + input);
		
		// execution
		int result = input * input * input;
		
		System.out.println("Result after exeuction: "+ result);
		
		System.out.println("The cube of " + input + " is " + result);

	}

}
