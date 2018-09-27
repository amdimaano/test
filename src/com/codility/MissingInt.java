package com.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MissingInt {

	public int getMissingInt(int[] arr) {
		Integer.max
		
		int n = arr.length + 1;
		int total = (n * (n + 1)) / 2;
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return total - sum;
	}

	@Test
	public void testMissingFirst() {
		int[] arr = { 2, 3, 4, 5, 6, 7, 8 };
		int actual = getMissingInt(arr);
		assertEquals(1, actual);
	}

	@Test
	public void testMissingSecondToLast() {
		int[] arr = { 1, 2, 3, 4, 5, 6, 8 };
		int actual = getMissingInt(arr);
		assertEquals(7, actual);
	}

}
