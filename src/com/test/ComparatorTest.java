package com.test;

import java.util.Arrays;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("dis", "hello", "diss", "");
		names.sort((s1, s2) -> s1.compareTo(s2));
		
		System.out.println(names);
	}
}	
