package com.hackerrank.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DigitSum {

	@Test
	public void testDigitSum() {
		assertEquals(19, digitSum(1729));
		assertEquals(-19, digitSum(-1729));
		assertEquals(-1, digitSum(-1));
	}

	public int digitSum(int x) {
		boolean isNegative = (x < 0);
		int multiplier = isNegative == true ? -1 : 1;

		// get absolute value
		int value = Math.abs(x);

		if (value / 10 == 0) {
			return (multiplier * value);
		}

		// get rightmost digit
		int r = value % 10;
		int sum = r;
		sum *= multiplier;

		// get next digit
		int next = (value - r) / 10;
		return sum += digitSum(multiplier * next);

	}

}
