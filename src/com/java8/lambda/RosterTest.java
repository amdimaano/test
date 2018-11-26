package com.java8.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import org.junit.Before;
import org.junit.Test;

import com.java8.lambda.Person.Sex;

public class RosterTest {
	
	public static void main(String[] args) {
		System.out.println("Hello world");
	}

	List<Person> roster;

	@Before
	public void init() {
		roster = new ArrayList<>();

		Person arvin = new Person();
		arvin.setBirthday(LocalDate.of(1988, 01, 20));
		arvin.setEmailAddress("ajmdimaano@gmail.com");
		arvin.setGender(Sex.MALE);
		arvin.setName("Arvin Dimaano");
		roster.add(arvin);

		Person jane = new Person();
		jane.setBirthday(LocalDate.of(2005, 05, 13));
		jane.setEmailAddress("janedoe@gmail.com");
		jane.setGender(Sex.FEMALE);
		jane.setName("Jane Doe");
		roster.add(jane);

		Person john = new Person();
		john.setBirthday(LocalDate.of(1977, 01, 01));
		john.setEmailAddress("johndoe@gmail.com");
		john.setGender(Sex.MALE);
		john.setName("John Doe");
		roster.add(john);

		Person angie = new Person();
		angie.setBirthday(LocalDate.of(1995, 12, 22));
		angie.setEmailAddress("angelinajolie@gmail.com");
		angie.setGender(Sex.FEMALE);
		angie.setName("Angelina Jolie");
		roster.add(angie);

		Person jack = new Person();
		jack.setBirthday(LocalDate.of(1995, 12, 22));
		jack.setEmailAddress("jackreacher@gmail.com");
		jack.setGender(Sex.MALE);
		jack.setName("Jack Reacher");
		roster.add(jack);

	}

	// @Test
	public void olderThan30() {
		printPersonsOlderThan(roster, 30);
	}

	// @Test
	public void between15And30() {
		printPersonsWithinRange(roster, 15, 30);
	}

	// @Test
	public void between18And25() {
		System.out.println("==============Between 18 and 25================");
		printPersonsWithinRange(roster, 18, 25);
		System.out.println("==============Between 18 and 25================");
	}

	// @Test
	public void eligibleForSelectiveService() {
		System.out.println("============== eligibleForSelectiveService ================");
		printPersons(roster, new CheckPersonEligibleForSelectiveService());
		System.out.println("============== eligibleForSelectiveService ================");
	}

	// @Test
	public void useAnonClassEligibleForSelectiveService() {
		System.out.println("============= Anon Class EligibleForSelectiveService =========================");
		printPersons(roster, new CheckPerson() {
			@Override
			public boolean test(Person p) {
				return p.getGender() == Sex.MALE && (p.getAge() >= 18 && p.getAge() <= 25);
			}
		});
		System.out.println("============= Anon Class EligibleForSelectiveService =========================");
	}

	// @Test
	public void lambdaEligibleForSelectiveService() {
		System.out.println("===================== LambdaEligibleForSelectiveService ==========================");
		printPersons(roster, (Person p) -> p.getGender() == Sex.MALE && (p.getAge() >= 18 && p.getAge() <= 25));
		System.out.println("===================== LambdaEligibleForSelectiveService ==========================");
	}

	// @Test
	public void predicateEligbileForSelectiveSErvice() {
		System.out.println("====================== Predicate Eligible forSelective Service ===================");
		PrintPersonsWithPredicate(roster, p -> p.getGender() == Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);

		System.out.println("====================== Predicate Eligible forSelective Service ===================");
	}

	@Test
	public void testAndAccecpLambdaPerson() {
		System.out.println("==================== testAndAccecpLambdaPerson============================");
		processPersons(roster, p -> p.getGender() == Sex.FEMALE, p -> System.out.println("Hi : " + p.getName()));

		System.out.println("==================== testAndAccecpLambdaPerson============================");
	}

	@Test
	public void testProcessPersonsWithFunction() {
		System.out.println("============================= processPersonsWithFunction ==========================");
		processPersonsWithFunction(roster, p -> p.getAge() >= 30, p -> p.getEmailAddress(),
				emailAddress -> System.out.println(emailAddress));

		System.out.println("============================= processPersonsWithFunction ==========================");

		roster.stream().forEach(p -> System.out.println(p.getName()));
	}

	public static void printPersonsOlderThan(List<Person> members, int age) {
		for (Person p : members) {
			if (p.getAge() >= age) {
				p.printPerson();
			}
		}
	}

	public static void printPersonsWithinRange(List<Person> members, int low, int high) {
		for (Person person : members) {
			int age = person.getAge();
			if (age >= low && age <= high) {
				person.printPerson();
			}
		}
	}

	public static void printPersons(List<Person> members, CheckPerson tester) {
		for (Person person : members) {
			if (tester.test(person)) {
				person.printPerson();
			}
		}

	}

	public static void PrintPersonsWithPredicate(List<Person> members, Predicate<Person> tester) {
		for (Person person : members) {
			if (tester.test(person)) {
				person.printPerson();
			}
		}
	}

	public static void processPersons(List<Person> members, Predicate<Person> tester, Consumer<Person> block) {
		for (Person person : members) {
			if (tester.test(person)) {
				block.accept(person);
			}
		}
	}

	public static <X, Y> void processPersonsWithFunction(Iterable<X> iterable, Predicate<X> tester,
			Function<X, Y> function, Consumer<Y> block) {
		for (X x : iterable) {
			if (tester.test(x)) {
				Y y = function.apply(x);
				block.accept(y);
			}
		}
	}

}
