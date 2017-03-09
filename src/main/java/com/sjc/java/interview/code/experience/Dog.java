package com.sjc.java.interview.code.experience;

class Animal {
	void eat() {
		System.out.println("animal is eating...");
	}

	int aminalValue = 10;
}

public class Dog extends Animal {
	void eat() {
		System.out.println("dog is eating...");
	}

	int aminalValue = 30;

	public static void main(String args[]) {
		Animal a = new Dog();
		a.eat();
		System.out.println(a.aminalValue);
	}

}

abstract class Abstarct {
	Abstarct() {

	}

	public static void main(String args[]) {

	}
	
}