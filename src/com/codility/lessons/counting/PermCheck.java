package com.codility.lessons.counting;

import org.junit.Test;

public class PermCheck {

	@Test
	public void test() {
		System.out.println(solution2(new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
		System.out.println(solution2(new int[] { Integer.MAX_VALUE }));
		
	}

	public int solution(int[] A) {
		int max = 0;
		for (int i : A) {
			if (i > max) {
				max = i;
			}
		}

		int[] count = new int[max + 1];

		for (int i : A) {
			count[i] += 1;
		}

		for (int i = 1; i < count.length; i++) {
			if (count[i] != 1) {
				return 0;
			}
		}
		return 1;
	}

	public int solution2(int[] A) {
		// write your code in Java SE 8
		boolean[] seen = new boolean[A.length + 1];

		// repeated elements
		for (int i = 0; i < A.length; i++) {
			if (A[i] < 1 || A[i] > A.length)
				return 0;
			if (seen[A[i]] == true)
				return 0;
			else
				seen[A[i]] = true;
		}

		return 1;
	}

}
