package com.geeksforgeeks.basic;

public class TowerOfHanoi {

	public static void main(String[] args) {
		towerOfHanoi(3, "A", "B", "C");

	}

	static void towerOfHanoi(int n, String source, String helper, String destination) {
		if (n == 1) {
			System.out.println("Move disc 1 from " + source + " to " + destination);
			return;
		}
		
		towerOfHanoi(n - 1, source, destination, helper);
		System.out.println("Move disc " + n + " from " + source + " to " + destination);
		towerOfHanoi(n - 1, helper, source, destination);

	}
}
