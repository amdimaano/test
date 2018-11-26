package com.oop;

public class ReferenceTest {

	public static void main(String[] args) {
		Dog grover = new Dog("Grover", "Beagle");
		System.out.println(grover);
		reassignDog(grover);
		System.out.println(grover);
			
	}
	
	public static void reassignDog(Dog dog) {
		dog = new Dog("Bentley", "Dachshund");
		System.out.println(dog);
	}
}
