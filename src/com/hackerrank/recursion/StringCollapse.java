package com.hackerrank.recursion;

public class StringCollapse {

	public static void main(String[] args) {
		String collapsed = collapseSequences("aaaaaaaaaaaa", 'a');
		System.out.println(collapsed);

	}

	static String collapseSequences(String s, char c) {
		if (s.length() == 1) {
			return s;
		}
		
		if (s.charAt(0) == c && s.charAt(1) == c) {
			return collapseSequences(s.substring(1), c);
		} else {
			return s.substring(0, 1) + collapseSequences(s.substring(1), c);
		}

	}

}
