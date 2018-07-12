package com.java8.lambda;

import java.util.Arrays;

public class MethodReference {

	public static void main(String[] args) {

		String[] arr = { "zebra", "arvin", "joseph", "dimaano", "aardvark" };
		Arrays.sort(arr, String::compareToIgnoreCase);
		Arrays.asList(arr).stream().forEach(System.out::println);

	}
}
