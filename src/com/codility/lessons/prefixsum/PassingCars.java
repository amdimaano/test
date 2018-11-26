package com.codility.lessons.prefixsum;

import java.util.concurrent.SynchronousQueue;

import org.junit.Test;

public class PassingCars {

	@Test
	public void test() {

		System.out.println(solution(new int[] { 0, 1, 0, 1, 1 }));
	}

	public int solution(int A[]) {
		int count = 0;
		int[] p = prefixSums(A);
		int length = A.length;
		for (int i = 0; i < length; i++) {
			if (A[i] == 0) {
				count += (p[length] - p[i]);
				if (count > 1000000000) {
					return -1;
				}
			}
		}
		return count;
	}

	public int[] prefixSums(int[] A) {
		int[] prefixSums = new int[A.length + 1];
		for (int i = 1; i < A.length + 1; i++) {
			prefixSums[i] = prefixSums[i - 1] + A[i - 1];
		}
		return prefixSums;
	}

}
