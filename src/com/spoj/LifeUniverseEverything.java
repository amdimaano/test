package com.spoj;

import java.util.Scanner;

public class LifeUniverseEverything {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean encountered = false;
		while (!encountered) {
			int n = scanner.nextInt();
			if (n == 42) {
				return;
			}
			System.out.println(n);
		}
		
		scanner.close();

	}
}
