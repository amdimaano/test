package com.topcoder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class A0Paper {
	String result = "Possible";

	@Test
	public void tc1() {
		int[] arr = { 0, 3 };
		int val = isPossible(arr, arr.length - 1);
		if (val == 0) {
			result = "Impossible";
		}
		assertEquals("Possible", result);

	}

	@Test
	public void tc2() {
		int[] arr = { 0, 0, 0, 0, 15 };
		int val = isPossible(arr, arr.length - 1);
		if (val == 0) {
			result = "Impossible";
		}
		assertEquals("Impossible", result);

	}

	@Test
	public void tc3() {
		int[] arr = { 2, 0, 0, 0, 0, 0, 0, 3, 2, 0, 0, 5, 0, 3, 0, 0, 1, 0, 0, 0, 5 };
		int val = isPossible(arr, arr.length - 1);
		if (val == 0) {
			result = "Impossible";
		}
		assertEquals("Possible", result);

	}

	public int isPossible(int[] arr, int index) {
		if (arr.length == 0) {
			return 0;
		}

		// A0 is already complete
		if (arr[0] >= 1) {
			return 1;
		}

		if (index > 0) {
			int val = arr[index] / 2;
			int previousVal = arr[index - 1];
			arr[index - 1] = val + previousVal;
			return isPossible(arr, index - 1);
		} else {
			return 0;
		}

	}

}
