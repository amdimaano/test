package com.effectivejava;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class ComparableTest {

	@Test
	public void testStringOrder() {
		System.out.println("Test treeset");
		String[] args = {"hello", "world", "arvin", "test", "aardvark"};
		Set<String> stringSet = new TreeSet<>();
		Collections.addAll(stringSet, args);
		System.out.println(stringSet);
		stringSet.add("cat");
		System.out.println(stringSet);
		System.out.println();
	}

	@Test
	public void testStringOrderHashSet() {
		System.out.println("Test hashset");
		String[] args = {"hello", "world", "arvin", "test", "aardvark"};
		Set<String> stringSet = new HashSet<>();
		Collections.addAll(stringSet, args);
		System.out.println(stringSet);
		System.out.println();
	}
	
	
	
}
