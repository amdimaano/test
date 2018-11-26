package com.codility.lessons.prefixsum;

import org.junit.Test;

public class MushroomPickerMax {

	@Test
	public void test() {
		System.out.println(solution(new int[] { 2, 3, 7, 5, 1, 3, 9 }, 4, 6));

	}

	public int solution(int[] A, int m, int k) {
		int n = A.length;
		int result = 0;
		int[] pref = prefixSums(A);
		for (int p = 0; p < Math.min(m, k) + 1; p++) {
			int left_pos = k - p;
			int right_pos = Math.min(n - 1, Math.max(k, k + (m - 2 * p)));
			result = Math.max(result, sumSlice(pref, left_pos, right_pos));
		}

		for (int p = 0; p < Math.min(m + 1, n - k); p++) {
			int left_pos = Math.max(0, Math.min(k, k - (m - 2 * p)));
			int right_pos = k + p;
			result = Math.max(result, sumSlice(pref, left_pos, right_pos));
		}
		return result;
	}

	public int[] prefixSums(int[] A) {
		int[] prefixSums = new int[A.length + 1];
		for (int i = 1; i < A.length + 1; i++) {
			prefixSums[i] = prefixSums[i - 1] + A[i - 1];
		}
		return prefixSums;
	}

	public int sumSlice(int[] A, int x, int y) {
		return A[y + 1] - A[x];
	}

}
