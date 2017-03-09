package com.sjc.java.interview.code.experience;

import java.io.IOException;
import java.util.Arrays;

public class ReferenceTest1 {

	public static void main(String[] args) {
		ClassA classA = new ClassA();
		ClassB classB = new ClassB();
		ClassC classC = new ClassC();
		ClassA classA2 = new ClassB();
		ClassA classA3 = new ClassC();

		classA = classB;
		// classB=classC;
		// classC=classA3;
		// classC=(ClassC)classB;
		classB = (ClassB) classA2;
		// classC=(ClassA)classA3

		int a[] = { 1, 2, 0, 4, 5, 1, 2 };
		Arrays.sort(a);
		int aaa = Arrays.binarySearch(a, 2);
		System.out.println(aaa);
		for (int aa : a) {
			System.out.println(aa);
		}

		String text = "java. c. dotnet. cpp.";
		String[] words = text.split("\\.\\s*");
		for (String str : words) {
			System.out.println(str);
		}
		ClassC cc = new ClassC(10);
		System.out.println(cc.title);

	}

}

class ClassA {

	public void doIt() throws Exception {
		if (true)
			throw new AssertionError();
		System.out.println("");

	}

}

class ClassB extends ClassA {
	public void sss() throws Exception {
		super.doIt();
	}
}

class ClassC extends ClassA {

	int value;
	String title;

	ClassC() {
		title += " world";
	}

	ClassC(int value) {
		this();
		this.value = value;
		title = " hello";
		
	}

}
