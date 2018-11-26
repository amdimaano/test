package com.codility.ing;

import java.util.Stack;

public class Shoes {

	public static void main(String[] args) {
		System.out.println(count("RLRRLLRLRRLL"));
		System.out.println(count("LLRLRLRLRLRLRR"));
		System.out.println(count("RLLLRRRLLR"));
		System.out.println(count("LLLRRR"));

		System.out.println();
		
		System.out.println(useStack("RLRRLLRLRRLL"));
		System.out.println(useStack("LLRLRLRLRLRLRR"));
		System.out.println(useStack("RLLLRRRLLR"));
		System.out.println(useStack("LLLRRR"));
		
	}

	public static int count(String S) {
		int lhs = 0;
		int rhs = 0;
		int count = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'L') {
				lhs++;
			} else {
				rhs++;
			}
			if (lhs > 0 && rhs > 0 && lhs == rhs) {
				count++;
				lhs = 0;
				rhs = 0;
			}

		}
		return count > 0 ? count : 1;
	}

	public static int useStack(String string) {
		int count = 0;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < string.length(); i++) {
			char current = string.charAt(i);
			if (!stack.isEmpty() && stack.peek() != current) {
				stack.pop();
				if (stack.isEmpty()) {
					count++;
				}
			} else {
				stack.push(current);
			}
		}
		return count;
	}

}
