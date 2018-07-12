package com.hackerrank.recursion;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Palindrome {

	@Test
	public void palindromeTest() {
		assertTrue(isPalindrome("aabaa"));
		assertFalse(isPalindrome("aabaaa"));
		assertTrue(isPalindrome("rotor"));
		assertFalse(isPalindrome("arvin joseph"));

	}

	public boolean isPalindrome(String s) {
		if (s.length() == 0 || s.length() == 1) {
			return true;
		}

		if (s.charAt(0) != s.charAt(s.length() - 1)) {
			return false;
		}

		return isPalindrome(s.substring(1, s.length() - 1));
	}
}
