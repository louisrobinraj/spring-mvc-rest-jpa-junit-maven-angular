package com.sjc.java.interview.code.exception;

import java.io.IOException;

class CheckedException {
	void m() throws Throwable {
		throw new IOException("device error");// checked exception
	}

	void n() throws Throwable {
		m();
	}

	void p() {
		try {
			n();
		} catch (Throwable e) {
			System.out.println("exception handeled");
		}
	}

	public static void main(String args[]) {
		CheckedException obj = new CheckedException();
		obj.p();
		System.out.println("normal flow");
	}
}