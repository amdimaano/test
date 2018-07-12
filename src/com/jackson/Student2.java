package com.jackson;

public class Student2 {
	private String name;
	private int age;
	
	public void setPangalan(String pangalan) {
		this.name = pangalan;
	}

	public void setEdad(int edad) {
		this.age = edad;
	}

	public String getPangalan() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEdad() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student2 [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
}
