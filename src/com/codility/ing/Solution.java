package com.codility.ing;

import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		System.out.println(solution("Sun", 0));
		System.out.println(solution("Sun", 1));

		System.out.println(solution("Sun", 2));

		System.out.println(solution("Sun", 3));

		System.out.println(solution("Sun", 4));
		System.out.println(solution("Sun", 7));
		
		
		System.out.println();
		System.out.println();
		System.out.println(solution("Sat", 23));


		
	}
	
	public static String solution(String S, int K) {
		List<String> days = Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
		int i = days.indexOf(S);
		int mod = K % 7;
		return days.get((i + mod) % 7);
	
	}
	
	
}
