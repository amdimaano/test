package com.codility.creditagricole;

public class CodilityTest1 {

	public static void main(String[] args) {
		String s = "Forget  CVs..Save time . x x";
		
		System.out.println(solution(s));
		
		
	}
	
	
	public static int solution(String s) {
		String[] sentences = s.split("[.?!]");
		int top = 0;
		for (String sentence : sentences) {
			System.out.println("Sentence: " + sentence);
			String[] words = sentence.trim().split("\\s+");
			System.out.println(words.length);
			if (words.length > top) {
				top = words.length;
			}
		}
		return top;
	}
	
}




