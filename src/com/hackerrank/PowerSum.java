package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class PowerSum {

	public static void main(String[] args) {
		int X = 10;
		int N = 2;
		// Scanner in = new Scanner(System.in);
		// int X = in.nextInt();
		// int N = in.nextInt();
		int result = countExpressions(X, N, new ArrayList<>());
		System.out.println(result);
		// in.close();
	}

	static int countExpressions(int x, int n, List<Integer> summands) {
		int count = 0;

		int size = summands.size();
		if (size == 0) {
			summands.add(1);
		} else {
			int sum = 0;
			for (int i = 0; i < size; i++) {
				sum += Math.pow(summands.get(i), n);
			}

			
			
			if (sum == x || sum > x) {
				if (sum == x) {
					count += 1;
				}
				// backtrack
				summands.remove(size - 1);
				size = summands.size();
				int lastElement = summands.get(size - 1);
				
				if(size > 0) {
					summands.remove(size -1);
				}
				summands.add(lastElement + 1);
			} else {
				int lastElement = summands.get(size - 1);
				summands.add( lastElement + 1);
			}

		}

		return count + countExpressions(x, n, summands);

	}
}
