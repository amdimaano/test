package com.codility.lessons.counting;

import org.junit.Test;

public class MissingInteger {

	@Test
	public void test() {
		System.out.println(solution(new int[] { 1, 3, 6, 4, 1, 2 }));
		System.out.println(solution(new int[] { 1, 2, 3 }));
		System.out.println(solution(new int[] { -1, -2, -3 }));

	}

	public int solution(int[] A) {
		boolean[] arr = new boolean[1000001];
		for (int i = 0; i < A.length; i++) {
			int value = A[i];
			if (value < 0) {
				continue;
			}
			arr[value] = true;
		}

		int missing = 1;
		boolean found = false;
		for (int i = 1; i < arr.length; i++) {
			if (!arr[i]) {
				found = true;
				missing = i;
				break;
			}
		}

		if (!found) {
			missing = arr.length + 1;
		}
		return missing;
	}

}
