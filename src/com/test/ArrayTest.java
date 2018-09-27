package com.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		List<Element> elements = new ArrayList<>();

		Element e = new Element();
		e.setName("Arvin");
		e.setAge(30);
		elements.add(e);

		e.setName("Jason");
		e.setAge(21);
		elements.add(e);

		e.setName("Martin");
		e.setAge(25);
		elements.add(e);

		for (Element element : elements) {
			System.out.println(element.getName());
			System.out.println(element.getAge());

			System.out.println();
		}

	}

	public static class Element {
		String name;
		int age;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

	}
}
