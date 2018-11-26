package com.geeksforgeeks.basic;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class InfixToPostfix {
	List<Character> operators = Arrays.asList('^', '*', '/', '+', '-');

	@Test
	public void test() {
		String convert = convert("a+b*(c^d-e)^(f+g*h)-i");
		System.out.println(convert);
	}

	public String convert(String expression) {
		StringBuilder builder = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < expression.length(); i++) {
			char current = expression.charAt(i);
			// operator
			if (isOperator(current)) {
				if (stack.isEmpty()) {
					stack.push(current);
				} else {
					if (hasGreaterOrEqualPrecedence(current, stack.peek()) || stack.contains('(')) {
						stack.push(current);
					} else {
						char c = stack.peek();
						while (c != '(' || c != ')') {
							if (hasGreaterOrEqualPrecedence(c, current)) {
								if (!stack.empty()) {
									builder.append(stack.pop());
								}
							}
						}
						builder.append(current);
					}
				}
			}
			// open parens
			else if ('(' == current) {
				stack.push(current);
			}
			// close parens
			else if (')' == current) {
				char c;
				do {
					c = stack.pop();
					builder.append(c);
				} while (c != '(');
				stack.pop();

			}
			// operand
			else {
				builder.append(current);
			}
		}

		return builder.toString();

	}

	public boolean isOperator(char c) {
		return operators.contains(c);
	}

	public boolean hasGreaterOrEqualPrecedence(char a, char b) {
		return operators.indexOf(a) >= operators.indexOf(b);
	}
}
