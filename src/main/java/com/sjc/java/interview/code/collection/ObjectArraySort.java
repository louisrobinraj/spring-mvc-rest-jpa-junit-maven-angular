package com.sjc.java.interview.code.collection;

import java.util.Arrays;
import java.util.Iterator;

public class ObjectArraySort {

	public static void main(String[] args) {
		Object[] myObject = { new String("foo"), new String("foo"), new String("foo"), new Boolean(true) };
		for (Object object : myObject) {
			System.out.println(object);
		}

	}

}
