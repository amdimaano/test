package com.hackerrank.recursion;

import java.util.LinkedHashSet;
import java.util.Set;

public class Combi {

	public static void main(String[] args) {
		combi(7, 4);
	}

	static long combi(int a, int b) {
		Set<String> combinations = new LinkedHashSet<>();

		for (int i = 1; i <= a; i++) {
			String s = String.valueOf(i);
			for (int j = 1; j <= a; j++) {
				for (int j2 = 1; j2 <= a; j2++) {
					
				}
			}
		}

		System.out.println(combinations);
		return 0L;
	}
}
