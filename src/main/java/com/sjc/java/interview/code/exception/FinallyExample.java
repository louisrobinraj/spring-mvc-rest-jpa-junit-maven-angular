package com.sjc.java.interview.code.exception;

public class FinallyExample {

	public static void main(String[] args) {

		try {
			new FinallyExample().m3();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void m1() {
		System.out.println(2 / 0);
		System.out.println("welcome");
	}

	public void m2() {
		m1();
	}

	public void m3() {
		m2();
	}
}
