package com.sjc.java.interview.code.exception;

import java.io.IOException;

class Parent {
	void msg() throws IOException {
		System.out.println("parent");
	}
}

public class OverrideExample extends Parent {
	OverrideExample() {
		super();
		//this(10);
	}

	OverrideExample(int a) {
	}

	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String args[]) {
		OverrideExample example=(OverrideExample) new Parent();
		Parent p = new OverrideExample();
		// p.msg();
		try {
			System.out.println(1 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
}