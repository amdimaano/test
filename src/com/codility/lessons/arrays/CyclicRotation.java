package com.codility.lessons.arrays;

public class CyclicRotation {
	public static void main(String[] args) {
		print(solution(new int[] {3, 8, 9, 7, 6 }, 8));

	}

	static public int[] solution(int[] A, int K) {
		int length = A.length;
		if (K == 0 || length == 0) {
			return A;
		}
		int[] B = new int[length];
		for (int i = 0; i < length; i++) {
			B[(i + K) % length] = A[i];
		}
		return B;

	}

	static void print(int[] A) {
		for (int i : A) {
			System.out.print(i + " ");
		}
	}
}
