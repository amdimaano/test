package com.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class StreamTest {

	@Test
	public void filterAndToUpper() {
		List<String> names = Arrays.asList("johnny", "martha", "anna", "bert", "max", "mary");
		names.stream().filter(s -> s.startsWith("m")).map(String::toUpperCase).forEach(System.out::println);
	}
	
//	@Test
	public void testPresence() {
		List<String> names = Arrays.asList("johnny", "martha", "anna", "bert", "max", "mary");
		List<String> n = Arrays.asList("martha", "anna");
		

		n.stream().filter(s -> names.contains(s)).forEach(System.out::println);
//		names.stream().filter(s -> n.contains(s)).collect(Collectors.toList()).stream().forEach(System.out::println);;
		
		
	}

}
