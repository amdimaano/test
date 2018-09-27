package com.hackerrank;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class Factorial {

	@Test
	public void test() {
		assertEquals(0, getTrailingZeroes(3));
		assertEquals(14, getTrailingZeroes(60));
		assertEquals(24, getTrailingZeroes(100));
		assertEquals(253, getTrailingZeroes(1024));
		assertEquals(5861, getTrailingZeroes(23456));
		assertEquals(2183837, getTrailingZeroes(8735373));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			int j = scanner.nextInt();
			System.out.println(getTrailingZeroes(j));
		}
		scanner.close();
	}

	public static int getTrailingZeroes(int n) {
		int count = 0;
		int divisor = 5;
		while (n / divisor > 0) {
			count += n / divisor;
			divisor *= 5;
		}
		return count;
	}

}
