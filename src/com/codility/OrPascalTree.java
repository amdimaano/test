package com.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrPascalTree {

	@Test
	public void countTrueTest() {
		boolean[] tree = { true, false, false, true, false };
		int count = countTrue(tree, 0);
		assertEquals(11, count);

	}

	@Test
	public void count7() {
		boolean[] tree = { true, false, false, true };
		int count = countTrue(tree, 0);
		assertEquals(7, count);

	}

	@Test
	public void allTrue() {
		boolean[] allTrue = { true, true, true };
		assertEquals(6, countTrue(allTrue, 0));
	}

	public int countTrue(boolean[] arr, int count) {
		int length = arr.length;
		boolean terminal = false;
		boolean[] newArray = null;
		if (length == 1) {
			terminal = true;
		}
		newArray = new boolean[length - 1];

		boolean allTrue = false;
		boolean allFalse = false;
		for (int i = 0; i < length; i++) {
			if (arr[i]) {
				count++;
			}
			if (i != length - 1) {
				if (!terminal) {
					newArray[i] = arr[i] || arr[i + 1];
				}
			}

			if (arr[i] == true) {
				allTrue = allTrue && true;
			} else if (arr[i] == false) {
				allFalse = allFalse && true;
			} else {
				allTrue = false;
				allFalse = false;
			}

		}

		if (allTrue) {
			return (length * length + 1) / 2;
		}

		if (allFalse) {
			return 0;
		}

		if (terminal) {
			return count;
		} else {

			return countTrue(newArray, count);
		}
	}

	class Solution {
		public int solution(boolean[] P) {
			return countTrue(P, 0);
		}

		public int countTrue(boolean[] tree, int count) {
			if (count > 1000000000) {
				return count;
			}
			int length = tree.length;
			boolean terminal = false;
			boolean[] newArray = null;
			if (length == 1) {
				terminal = true;
			}
			newArray = new boolean[length - 1];

			for (int i = 0; i < length; i++) {
				if (tree[i]) {
					count++;
				}
				if (i != length - 1) {
					if (!terminal) {
						newArray[i] = tree[i] || tree[i + 1];
					}
				}
			}
			if (terminal) {
				return count;
			} else {

				return countTrue(newArray, count);
			}
		}

	}
}
