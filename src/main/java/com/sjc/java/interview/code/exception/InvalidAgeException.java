package com.sjc.java.interview.code.exception;

public class InvalidAgeException extends Exception {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	InvalidAgeException(String msg) {
		super(msg);
	}
}