package com.codility.whiteskylabs;

import org.junit.Test;

public class PhoneNumberFormat {

	@Test
	public void test() {
		 System.out.println(solution("00-44 48 5555 8361"));
		 System.out.println(solution("00-44 48 5555 83612"));
		 System.out.println(solution("00-44 48 5555 836123"));
		 System.out.println(solution("1"));
		 System.out.println(solution("123"));
		 System.out.println(solution("1234"));
		System.out.println(solution("0 - 22 1985--324"));
		 System.out.println(solution("0 - 22 1985--3245"));

	}

	public String solution(String S) {
		String stripped = S.replace(" ", "").replace("-", "");
		if (stripped.length() <= 3) {
			return stripped;
		}

		int length = stripped.length();
		int hyphens = length / 3;
		int mod = length % 3;
		if (mod == 0) {
			hyphens -= 1;
		}

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < hyphens; i++) {
			int endIndex = 3;
			if (stripped.length() == 4) {
				endIndex = 2;
			}
			builder.append(stripped.substring(0, endIndex) + "-");
			stripped = stripped.substring(endIndex);
		}
		
		builder.append(stripped);

		return builder.toString();
	}

}
