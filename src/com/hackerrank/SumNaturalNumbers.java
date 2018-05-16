package com.hackerrank;

public class SumNaturalNumbers {

	public static void main(String[] args) {

		System.out.println(getSum(0, 0, 10));
		System.out.println(loop(10));

	}
	
	static int loop(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	static int getSum(int current, int sum, int n) {
		sum += current;
		if (current == n) {
			return sum;
		}

		return getSum(current + 1, sum, n);

	}
}
