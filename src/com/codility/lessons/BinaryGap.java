package com.codility.lessons;

public class BinaryGap {

	public static void main(String[] args) {
		System.out.println(solution(66561));

	}

	static int solution(int N) {
		String s = Integer.toBinaryString(N);
		int sum = 0;
		int count = 0;
		int current = 0;
		for (int i = 0; i < s.length(); i++) {
			if ('1' == s.charAt(i)) {
				sum++;
			} else {
				current++;
			}
			if (sum == 2) {
				if (count < current) {
					count = current;
				}
				sum--;
				current = 0;
			}
		}
		
		return count;
	}
}
