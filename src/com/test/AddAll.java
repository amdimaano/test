package com.test;

import java.util.ArrayList;
import java.util.List;

public class AddAll {

	public static void main(String[] args) {
		List<String> test = new ArrayList<>();
		test.add("hello");
		test.addAll(null);
		System.out.println(test.size());
		
	}
}
