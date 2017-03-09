package com.sjc.java.interview.code.methodoverload;

public class OverloadPrimitive {
	final static int speedlimit;

	public OverloadPrimitive() {

		// speedlimit=10;
	}

	static {

		speedlimit = 10;
	}

	public static void main(String[] args) {

		boolean boolenvalue = false;
		char charvalue = 0;
		byte bytevalue = 0;
		short shortvalue = 0;
		int intvalue = 0;
		long longvalue = 0;
		float flotvalue = 0;
		double doublevalue = 0;

		method(intvalue);// first find int arg method if not found search method long,float, double
		method(flotvalue);// first find float arg method if not found search method double
		method(longvalue);// first find long arg method if not found search method float,double
		// method(flotvalue);
		// method(boolenvalue);
		// method(charvalue);// first find char arg method if not found search
		// method int,float,long,double
		// method(bytevalue);// first find byte arg method if not found search
		// method short,int,float,long,double
		// method(shortvalue);// first find short arg method if not found search
		// method int,float,long,double
		// method(flotvalue);

		Integer integerValue = 0;
		// method(integerValue);// find Integer argument if not found primitive
		// type of args only not Doble,Float ect(primitive only type promise)

	}

	private static void method(double boolenvalue) {

		System.out.println("this is double value method");
	}

	public static void method(long value) {
		System.out.println("this is long value method");
	}

	public static void method(float value) {
		System.out.println("this is float value method");
	}

	//
	//
	// private static void method(boolean boolenvalue) {
	//
	// System.out.println("this is boolean value method");
	// }
	//
	// public static void method(double value) {
	// System.out.println("this is double value method");
	// }
	//
	// public static void method(int value) {
	// System.out.println("this is int value method");
	// }
	//
	// public static void method(short value) {
	// System.out.println("this is short value method");
	// }
	// public static void method(byte value) {
	// System.out.println("this is byte value method");
	// }
	// public static void method(char value) {
	// System.out.println("this is char value method");
	// }
}
