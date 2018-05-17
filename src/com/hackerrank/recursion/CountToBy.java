package com.hackerrank.recursion;

import org.junit.Test;

public class CountToBy {

	@Test
	public void countToByTest() {
		System.out.println(countToBy(10, 1));
		System.out.println(countToBy(25, 4));
		System.out.println(countToBy(30, 4));
		System.out.println(countToBy(34, 5));
		System.out.println(countToBy(3, 6));
		System.out.println(countToBy(17, 3));

	}

	public String countToBy(int n, int m) {
		String s = "";
		if (n - m  < 1) {
			return String.valueOf(n);
		}

		return s += countToBy(n - m, m) + ", " + n;

	}

}
