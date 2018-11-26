package com.codility.lessons;

import org.junit.Test;

public class RequiredBitsToFlip {

	@Test
	public void test1() {
//		System.out.println(12 ^ 7);
		System.out.println(Integer.toBinaryString(12));
		System.out.println(Integer.toBinaryString(7));
		System.out.println(Integer.toBinaryString(11));
		
	}
	
	
	@Test
	public void testRightMost() {
		System.out.println("Right most");
		System.out.println(rightMost("100011"));
		
		System.out.println();
		
	}
	
	
	public int bitsToFlit(int a, int b) {
		return 0;
	}
	
	public String rightMost(String bits) {
		int x = Integer.parseInt(bits, 2);
		int a = x ^ (x & (x - 1));
		return Integer.toBinaryString(a);


	}
}
