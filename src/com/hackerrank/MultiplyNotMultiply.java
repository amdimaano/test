package com.hackerrank;

public class MultiplyNotMultiply {

	public static void main(String[] args) {
		
		System.out.println(multiply(2, 10));
	}

	static int multiply(int a, int b) {
		return repeatedAddition(a, b, 1);
	}
	
	static int repeatedAddition(int a, int b, int counter) {
		int product = a;
		if (counter == b) {
			return product;
		}
		counter++;
		return product + repeatedAddition(a, b, counter);
	}
}
