package com.hackerrank.recursion;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DigitsSorted {

	@Test
	public void digitsSortedTest() {
		assertTrue(digitsSorted(0));
		assertTrue(digitsSorted(2345));
		assertTrue(digitsSorted(-2345));
		assertTrue(digitsSorted(22334455));
		assertTrue(digitsSorted(-5));
		assertFalse(digitsSorted(4321));
		assertFalse(digitsSorted(24378));
		assertFalse(digitsSorted(21));
		assertFalse(digitsSorted(-33331));
	}

	private boolean digitsSorted(int i) {
		return digitsSorted(i, Integer.MAX_VALUE);
	}

	static boolean digitsSorted(int i, int previous) {
		// get rightMost digit
		int d = Math.abs(i % 10);

		// is last digit?
		if (i / 10 == 0) {
			if (d > previous) {
				return false;
			} else {
				return true;
			}
		}

		if (d > previous) {
			return false;
		}

		int reduced = (i - d) / 10;

		boolean sorted = true;
		return sorted &= digitsSorted(reduced, d);

	}

}
