package com.codility.lessons.arrays;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class OddOccurrencesInArray {

	@Test
	public void test0() {
		System.out.println(solution(new int[] { 9, 3, 9, 3, 9, 7, 9 }));
	}

	public int solution(int[] A) {
		int x = 0;
		for (int i : A) {
			x ^= i;
		}
		return x;
	}
	
	

}
