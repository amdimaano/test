package com.java8.lambda;

import java.time.LocalDate;
import java.time.Period;

public class Person {

	public enum Sex {
		MALE,
		FEMALE
	}

	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getAge() {
		return Period.between(getBirthday(), LocalDate.now()).getYears();
	}

	public void printPerson() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(name);
		builder.append(", birthday=");
		builder.append(birthday);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", emailAddress=");
		builder.append(emailAddress);
		builder.append(", age=");
		builder.append(getAge());
		builder.append("]");
		return builder.toString();
	}

}
