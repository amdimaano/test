package com.java8.lambda;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StreamTest {

	@Test
	public void filterAndToUpper() {
		List<String> names = Arrays.asList("a1", "a2", "b1", "b2", "c1", "c3", "c2");
		names.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);
	}

}
