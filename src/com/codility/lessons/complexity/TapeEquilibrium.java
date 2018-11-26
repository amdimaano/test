package com.codility.lessons.complexity;

import org.junit.Test;

public class TapeEquilibrium {

	@Test
	public void test() {
		System.out.println(solution(new int[] { 3, 1, 2, 4, 3 }));
		System.out.println(solution(new int[] { -1000, 1000 }));
	}

	public int solution(int[] A) {
		long total = 0;
		for (int i : A) {
			total += i;
		}
		long min = Integer.MAX_VALUE;

		int lhs = 0;
		for (int i = 0; i < A.length - 1; i++) {
			lhs += A[i];
			long rhs = total - lhs;
			long diff = Math.abs(lhs - rhs);
			if (diff < min) {
				min = diff;
			}
		}

		return (int) min;
	}
}
