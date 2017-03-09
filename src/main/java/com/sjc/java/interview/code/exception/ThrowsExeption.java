package com.sjc.java.interview.code.exception;

import java.io.IOException;

class ThrowsExeption {
	void m() throws IOException {
		throw new ArrayIndexOutOfBoundsException("device error");// checked
																	// exception
	}

	void n() throws IOException {
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
		ThrowsExeption obj = new ThrowsExeption();
		obj.p();
		System.out.println("normal flow...");
	}
}
// 1.