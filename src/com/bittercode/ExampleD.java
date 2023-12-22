package com.bittercode;

//sum of squares of three numbers
public class ExampleD {

	public static void main(String[] args) {

		int a, b, c, res, sqa, sqb, sqc;
		a = 1;
		b = 2;
		c = 3;

		sqa = square(a);
		sqb = square(b);
		sqc = square(c);

		res = sqa + sqb + sqc;

		System.out.println("result: " + res);

	}

	private static int square(int x) {
		System.out.println("Calculating Square of: " + x);

		int res = x * x;

		System.out.println("Square Calculated value: " + res);

		return res;
	}

}
