package com.hackerrank.recursion;

import java.util.ArrayList;
import java.util.List;

public class Hanoi {

	public static void main(String[] args) {
		List<Integer> source = new ArrayList<>();
		// source.add(4);
		source.add(3);
		source.add(2);
		source.add(1);

		List<Integer> spare = new ArrayList<>();
		List<Integer> destination = new ArrayList<>();

		System.out.println("Initial state:");
		print(source, spare, destination);

		int moveCount = solve(source, spare, destination);
		System.out.println("Total moves: " + moveCount);

		// System.out.println("Final state:");
		// print(source, spare, destination);

	}

	// static int solve(List<Integer> source, List<Integer> spare, List<Integer>
	// destination) {
	// // print(source, spare, destination);
	// int moveCount = 0;
	//
	// if (source.isEmpty() && spare.isEmpty()) {
	// return moveCount;
	// }
	//
	// int m = pop(source);
	//
	// if (destination.isEmpty() || getTopValue(destination) > m) {
	// push(destination, m);
	// print(source, spare, destination);
	//
	// int m1 = pop(source);
	// push(spare, m1);
	// print(source, spare, destination);
	//
	// m = pop(destination);
	// push(source, m);
	// print(source, spare, destination);
	//
	// m1 = pop(spare);
	// push(destination, m1);
	// print(source, spare, destination);
	//
	// m = pop(source);
	// push(destination, m);
	// print(source, spare, destination);
	// } else {
	//
	// // first step is already done
	// moveCount += solve(source, spare, destination);
	// // >.< START FROM THE BOTTOM?
	// }
	//
	// if (!source.isEmpty()) {
	// moveCount += solve(source, spare, destination);
	// } else {
	// System.out.println("source is empty!");
	// print(source, spare, destination);
	// }
	// return moveCount;
	//
	// }

	private static int solve(List<Integer> source, List<Integer> spare, List<Integer> destination) {
		int n = source.size();
		if (n == 1) {
			int m = pop(source);
			push(destination, m);
			return 0;
		} else if (n == 2) {
			int m = pop(source);
			push(destination, m);

			int m1 = pop(source);
			push(spare, m1);

			m = pop(destination);
			push(source, m);

			m1 = pop(spare);
			push(destination, m1);

			m = pop(source);
			push(destination, m);
		} else {
			solve(source, spare, destination);
		}

		return 0;
	}

	static void print(List<Integer> source, List<Integer> spare, List<Integer> destination) {
		System.out.println("--------------------");
		System.out.println(source);
		System.out.println(spare);
		System.out.println(destination);
		System.out.println("--------------------");
	}

	// list is not empty!
	static int pop(List<Integer> list) {
		int index = list.size() - 1;
		return list.remove(index);
	}

	static void push(List<Integer> list, int value) {
		list.add(value);
	}

	// static int getLastIndex(List<Integer> list) {
	// return list.size() - 1;
	// }

	// list is not empty!
	static int getTopValue(List<Integer> list) {
		int index = list.size() - 1;
		return list.get(index);
	}

}
