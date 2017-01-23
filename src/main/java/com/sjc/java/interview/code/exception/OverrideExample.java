package com.sjc.java.interview.code.exception;

import java.io.IOException;

class Parent {
	void msg() throws IOException{
		System.out.println("parent");
	}
}

public class OverrideExample extends Parent {
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent p = new OverrideExample();
		//p.msg();
	}
}