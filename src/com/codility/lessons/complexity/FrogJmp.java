package com.codility.lessons.complexity;

import org.junit.Test;

public class FrogJmp {
	
	@Test
	public void test() {
		System.out.println(solution(10, 85, 30));
	}

	public int solution(int X, int Y, int D) {
		int distance = Y - X;
		int times = distance / D;
		int mod = distance % D;
		if (mod > 0) {
			times += 1;
		}
		return times;
		
	}
}
