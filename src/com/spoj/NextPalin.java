package com.spoj;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NextPalin {

	@Test
	public void testPalin() {
		assertTrue(isPalindrome("aabbabbaa"));
		assertTrue(isPalindrome("0"));
		assertFalse(isPalindrome("123453214322"));
		assertFalse(isPalindrome("12345054322"));
	}

	public String getNextPalindrome(String str) {
		if (isPalindrome(str)) {
			// increment middle
			// mirror
		}
		return null;
	}

	public String mirror(String str) {
		return null;
	}

	public boolean isPalindrome(String str) {
		char[] arr = str.toCharArray();
		int length = arr.length;
		int i = getMidPoint(length);
		int j = length / 2;

		while (i >= 0 && arr[i] == arr[j]) {
			i--;
			j++;
		}
		return i < 0;
	}

	public int getMidPoint(int length) {
		int midPoint = length / 2;
		if (length % 2 == 0) {
			midPoint -= 1;
		}
		return midPoint;
	}

}
