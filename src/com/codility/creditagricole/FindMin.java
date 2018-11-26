package com.codility.creditagricole;

public class FindMin {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };
		int N = 5;
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = 1;
		}

		
		

	}

	public static int find_min(int[] A) {
		int ans = 0;
		for (int i = 1; i < A.length; i++) {
			if (ans > A[i]) {
				ans = A[i];
			}
		}
		return ans;
	}
}
