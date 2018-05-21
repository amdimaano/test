package com.hackerrank.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EditDistance {

	public static void main(String[] args) {
	}

	@Test
	public void editDistanceTest() {
		// String s = "bvin";
		// System.out.println(s.substring(0, 0));
		// System.out.println("a" + s.substring(0));

		assertEquals(2, editDistance("bvin", "arvin", 0));
		assertEquals(1, editDistance("driving", "diving", 0));
		assertEquals(3, editDistance("debate", "irate", 0));
		assertEquals(6, editDistance("football", "cookies", 0));
	}

	public int editDistance(String s1, String s2, int index) {
		System.out.println(s1);
		int count = 0;
		if (s1.equals(s2)) {
			return 0;
		}

		if (index == s2.length()) {
			return 0;
		}

		char c1 = s1.charAt(index);
		char c2 = s2.charAt(index);
		int addend = 0;
		if (c1 == c2) {
			addend = 1;
		} else if (s2.length() == s1.length()) { // replace
			if (c1 != c2) {
				count++;
			}
			s1 = s1.substring(0, index) + String.valueOf(c2) + s1.substring(index + 1);
			addend = 1;
		} else if (s2.length() > s1.length()) { // add
			count++;
			s1 = s1.substring(0, index) + String.valueOf(c2) + s1.substring(index);
			addend = 1;
		} else if (s2.length() < s1.length()) { // remove
			count++;
			s1 = s1.substring(0, index) + s1.substring(index + 1);
			addend = 0;
		}
		return count += editDistance(s1, s2, index + addend);

	}
}
