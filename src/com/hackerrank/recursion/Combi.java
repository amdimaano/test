package com.hackerrank.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Combi {

	@Test
	public void combiTest() {
		int l = combi(7, 4);
		assertEquals(35, l);

		// int l = combi(10, 3, 0, "");
		// assertEquals(120, l);

	}

	private int combi(int n, int r) {
		return combi(n, r, 1, "");
	}

	private int combi(int n, int r, int fix, String c) {
		// n choose r
		int count = 0;
		if (c.length() == r) {
			System.out.println(c);
			return 1;
		}

		for (int i = 1; i <= n; i++) {
			if (i == fix) {
				continue;
			}
			count += combi(n, r, i, fix + c + i);
		}

		return count;
	}

}
