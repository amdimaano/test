package com.codility.whiteskylabs;

import org.junit.Test;

public class Bulb {

	@Test
	public void test() {
		System.out.println(solution(new int[] { 2, 1, 3, 5, 4 }));

		System.out.println(solution(new int[] { 2, 3, 4, 1, 5 }));
		System.out.println(solution(new int[] { 1, 3, 4, 2, 5 }));
	}

	public int solution(int[] A) {
		int count = 0;
		int[] B = new int[A.length + 1];
		for (int i : A) {
			B[i] = i;
			if (i == 1) {
				count++;
			} else {
				int expected = (i * (i + 1)) / 2;
				int sum = 0;
				for (int j = 1; j <= i; j++) {
					sum += B[j];
				}
				if (sum == expected) {
					count++;
				}

			}
		}
		return count;
	}
}
