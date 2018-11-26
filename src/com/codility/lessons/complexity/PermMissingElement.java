package com.codility.lessons.complexity;

import org.junit.Test;

public class PermMissingElement {

	@Test
	public void test() {
		System.out.println(solution(new int[] {2, 3, 1, 5}));

	}

	public int solution(int[] A) {
		int length = A.length;
		int max = length + 1;
		long total = (max * (max + 1)) / 2;
		for (int i : A) {
			total -= i;
		}
		return (int) total;
	}
}
