package com.sjc.java.interview.code.experience;

import java.util.ArrayList;
import java.util.List;

public class CallbyReference {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("robin");

		add(list);
		System.out.println(list);

	}

	private static void add(List<String> list) {
		list.add("louis");

	}

}
