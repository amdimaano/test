package com.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class MaxFrequency {

	@Test
	public void getMax() {
		List<Integer> intArr = Arrays.asList(10, 20, 10, 20, 30, 20, 20);

		Map<Integer, Integer> countMap = new HashMap<>();

		for (Integer integer : intArr) {
			if (countMap.containsKey(integer)) {
				int count = countMap.get(integer) + 1;
				countMap.put(integer, count);
			} else {
				countMap.put(integer, 1);
			}
		}

		Set<Entry<Integer, Integer>> entryset = countMap.entrySet();

		Integer currentMax = 0;
		Integer result = 0;

		for (Entry<Integer, Integer> entry : entryset) {
			if (entry.getValue() > currentMax) {
				currentMax = entry.getValue();
				result = entry.getKey();
			}
		}

		assertEquals(Integer.valueOf(20), result);
		
		System.out.println(result + " appeared " + currentMax + " times.");

	}

}
