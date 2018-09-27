package com.misc;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BinarySearch {

	@Test
	public void testSearch10NonExistent() {
		List<Integer> input = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 11, 20, 30,40);
		int index = search(input, 0, input.size(), 10);
		assertEquals(-1, index);
	}
	
	@Test
	public void matchAtleftmost() {
		List<Integer> input = Arrays.asList(10, 20, 30);
		int index = search(input, 0, input.size(), 10);
		assertEquals(Integer.valueOf(10), input.get(index));
	}

	@Test
	public void matchAtRightmost() {
		List<Integer> input = Arrays.asList(1, 2, 10);
		int index = search(input, 0, input.size(), 10);
		assertEquals(Integer.valueOf(10), input.get(index));
	}

	public int search(List<Integer> list, int leftIndex, int rightIndex, Integer obj) {
		int midIndex = ((rightIndex - leftIndex) / 2) + leftIndex;
		Integer elem = list.get(midIndex);
		if (elem.equals(obj)) {
			return midIndex;
		} else {
			if (midIndex == leftIndex) {
				return -1;
			}
			if (elem > obj) {
				return search(list, leftIndex, midIndex, obj);
			} else {
				return search(list, midIndex, rightIndex, obj);
			}
		}
	}
}
