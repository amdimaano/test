package com.codility.whiteskylabs;

	import java.util.ArrayList;
	import java.util.Comparator;
	import java.util.List;

import org.junit.Test;

public class Solution {

	@Test
	public void test() {
		System.out.println(solution(new int[] { 0, 3, 3, 7, 5, 3, 11 }));
	}

	public int solution(int[] A) {

		if (A.length == 0) {
			return -1;
		}
		List<Pair> list = new ArrayList<>();
		for (int i = 0; i < A.length; i++) {
			list.add(new Pair(i, A[i]));
		}

		list.sort(new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				return o1.compareTo(o2);
			}
		});

		int d = Integer.MAX_VALUE;
		for (int i = 0; i < list.size() - 1; i++) {
			Pair a = list.get(i);
			Pair b = list.get(i + 1);
			int abs = Math.abs(a.getValue() - b.getValue());
			if (abs < d) {
				d = abs;
			}
			if (d > 100000000) {
				break;
			}
		}

		if (d > 100000000) {
			return -1;
		}

		return d;

	}

	class Pair implements Comparable<Pair> {
		private int index;
		private int value;

		public Pair(int index, int value) {
			super();
			this.index = index;
			this.value = value;
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		@Override
		public int compareTo(Pair o) {
			int compareValue = o.getValue();
			// ascending order
			return this.value - compareValue;
		}

	}

}
