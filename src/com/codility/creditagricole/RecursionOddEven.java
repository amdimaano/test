package com.codility.creditagricole;

public class RecursionOddEven {
	public static void main(String[] args) {
		String S = "011100";
		System.out.println(toZero(0, Integer.parseInt(S,2)));
	}


	public static int toZero(int count, int n) {
		if (n == 0) return count;
		// even
		if (n % 2 == 0) {
			return (toZero(count + 1, n / 2));
		} 
		// odd
		else {
			return (toZero(count + 1, n -1));
		}
	}
	

}
