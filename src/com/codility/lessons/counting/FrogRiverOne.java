package com.codility.lessons.counting;

import org.junit.Test;

/**
 * @author ajmdimaano
 *
 */
public class FrogRiverOne {

	@Test
	public void test() {
//		System.out.println(solution(5, new int[] { 1, 3, 1, 4, 2, 3, 5, 4 }));
		System.out.println(solution(2, new int[] { 1, 1, 1, 1, 1, 2 }));

	}

	public int solution(int X, int[] A) {
		int sum = 0;
		boolean[] filled = new boolean[X + 1];
		for (int i = 0; i < A.length; i++) {
			if (filled[A[i]] == true) {
				continue;
			}
			filled[A[i]] = true;
			sum++;
			if (sum == X) {
				return i;
			}

		}

		return -1;
	}

}
