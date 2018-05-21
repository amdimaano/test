package com.hackerrank.recursion;

import org.junit.Test;

public class EvenDigits {
	public static void main(String[] args) {
		System.out.println(1235 % 10);
	}

	@Test
	public void evenDigitsTest() {

	}

	public int evenDigits(int n) {
		String result = "0";
		if (n % 10 == 0) {
			return 0;
		} else {
			int r = n % 10;
			n = (n - n % 10) / 10;
			Integer valueOf = Integer.valueOf(result);
			if (r % 2 == 0) {
				
				return valueOf + evenDigits(n);
			} else {
				return valueOf;
			}
		}
	}
}
