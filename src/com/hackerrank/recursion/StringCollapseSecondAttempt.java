package com.hackerrank.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCollapseSecondAttempt {

	@Test
	public void collapseSequencesTest() {
		String s = "aab";
		String collapsed = collapseSequences(s, 'a');
		System.out.println(collapsed);
		assertEquals("ab", collapsed);

		s = "aabaaccaaaaaada";
		collapsed = collapseSequences(s, 'a');
		System.out.println(collapsed);
		assertEquals("abaccada", collapsed);

	}

	private String collapseSequences(String s, char c) {

		if (s.length() == 1) {
			return s;
		}

		// if first two chars match, move 1 char to the right
		if (s.charAt(0) == c && s.charAt(1) == c) {
			return collapseSequences(s.substring(1), c);

		} else {
			// return first character of current string
			return s.substring(0, 1) + collapseSequences(s.substring(1), c);
		}
	}

}
