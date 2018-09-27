package com.spoj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Factorial {
	
	
	
	
	@Test
	public void testSimple() {
		assertEquals(6, getFactorial(3));
		assertEquals(120, getFactorial(5));
		System.out.println(60 * 59 * 58 * 57);
	}
	

	public long getFactorial(long n) {
		if (n > 1) {
			return n * getFactorial(n -1);
		} else {
			return n * 1;
		}
	}

}
