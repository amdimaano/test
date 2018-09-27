package com.spoj;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;
import java.util.Stack;

import org.junit.Test;

public class StackRPN {

	@Test
	public void test() {
		String input = "(a+(b*c))";
		String output = toRPN(input);
		assertEquals("abc*+", output);

		input = "(a+(b*c))";
		output = toRPN(input);
		assertEquals("abc*+", output);

		input = "((a+b)*(z+x))";
		output = toRPN(input);
		assertEquals("ab+zx+*", output);

		input = "((a+t)*((b+(a+c))^(c+d)))";
		output = toRPN(input);
		assertEquals("at+bac++cd+^*", output);

	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			String line = scanner.nextLine();
			System.out.println(toRPN(line));
		}
		scanner.close();
	}
	

	public static String toRPN(String input) {
		Stack<Character> stack = new Stack<>();
		StringBuilder builder = new StringBuilder();

		for (char ch : input.toCharArray()) {
			if (Character.isAlphabetic(ch)) {
				builder.append(ch);
			} else if ('(' == ch) {
				stack.push(ch);
			} else if (')' == ch) {
				while (!stack.isEmpty() && stack.peek() != '(') {
					builder.append(stack.pop());
				}
				stack.pop();
			} else if (isOperator(ch)) {
				while (!stack.isEmpty() && isOperator(stack.peek())) {
					builder.append(stack.pop());
				}
				stack.push(ch);
			}
		}

		while (!stack.isEmpty()) {
			builder.append(stack.pop());
		}

		return builder.toString();
	}

	public static boolean isOperator(char ch) {
		return ch == '+' || ch == '-' || ch == '/' || ch == '*' || ch == '^';
	}
	
	public boolean hasGreaterPrecedence(char operator) {
		return false;
	}
	
	class Operator {
		private void compare(char c1, char c2) {
			// TODO Auto-generated method stub

		}
		
	}

}
