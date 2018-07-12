package com.java8.lambda;

import com.java8.lambda.Person.Sex;

public class CheckPersonEligibleForSelectiveService implements CheckPerson {

	@Override
	public boolean test(Person p) {
		return p.getGender() == Sex.MALE && (p.getAge() >= 18 && p.getAge() <= 25);
	}
}
