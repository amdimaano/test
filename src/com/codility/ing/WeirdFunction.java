package com.codility.ing;

public class WeirdFunction {
	public static void main(String[] args) {
		int[] arr = new int[50000];
		System.out.println(solution(arr));
		System.out.println(solution2(arr));

	}

	public static int solution(int[] A) {
		int N = A.length;
		int result = 0;
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				if (A[i] == A[j]) {
					result = Math.max(result, Math.abs(i - j));
				}
		return result;
	}

	public static int solution2(int[] A) {
		int length = A.length;
		int result = 0;
		outer: for (int i = 0; i < length; i++) {
			for (int j = length - 1; j >= 0; j--) {
				if (A[i] == A[j]) {
					result = Math.abs(i - j);
					break outer;
				}
			}
		}
		return result;
	}

}
