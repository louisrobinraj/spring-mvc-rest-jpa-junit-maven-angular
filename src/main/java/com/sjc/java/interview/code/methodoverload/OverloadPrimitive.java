package com.sjc.java.interview.code.methodoverload;

public abstract class OverloadPrimitive {

	public static void main(String[] args) {

		boolean boolenvalue = false;
		char charvalue = 0;
		byte bytevalue = 0;
		short shortvalue = 0;
		int intvalue;
		long longvalue;
		float flotvalue = 0;
		double doublevalue;
		method(flotvalue);
		method(boolenvalue);
		method(charvalue);// first find char arg method if not found search method int,float,long,double
		method(bytevalue);// first find byte arg method if not found search method short,int,float,long,double
		method(shortvalue);// first find short  arg method if not found search method int,float,long,double
		
		
		Integer integerValue=0;
		method(integerValue);// find Integer argument if not found primitive type of args only not Doble,Float ect(primitive only type promise)

	}

	private static void method(Double boolenvalue) {
		
		System.out.println("this is Double value method");
	}
	
	
	private static void method(boolean boolenvalue) {
		
		System.out.println("this is boolean value method");
	}

	public static void method(double value) {
		System.out.println("this is double value method");
	}

	public static void method(long value) {
		System.out.println("this is float value method");
	}

	public static void method(float value) {
		System.out.println("this is float value method");
	}

	public static void method(int value) {
		System.out.println("this is int value method");
	}

	public static void method(short value) {
		System.out.println("this is short value method");
	}
	public static void method(byte value) {
		System.out.println("this is byte value method");
	}
	public static void method(char value) {
		System.out.println("this is char value method");
	}
}
