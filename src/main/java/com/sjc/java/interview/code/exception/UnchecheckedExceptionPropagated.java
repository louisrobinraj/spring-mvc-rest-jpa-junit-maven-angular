package com.sjc.java.interview.code.exception;

public class UnchecheckedExceptionPropagated {
	void m() {
		int data = 50 / 0;
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		UnchecheckedExceptionPropagated obj = new UnchecheckedExceptionPropagated();
		obj.p();
		System.out.println("normal flow...");
	}
}