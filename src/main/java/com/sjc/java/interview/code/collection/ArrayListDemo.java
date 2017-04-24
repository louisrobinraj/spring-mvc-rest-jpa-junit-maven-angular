package com.sjc.java.interview.code.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String args[]) {
		List<String> arraylist = new ArrayList<String>();
		arraylist.add("Amit");
		arraylist.add("Amit");
		arraylist.add("Vijay");
		arraylist.add("Kumar");
		Collections.sort(arraylist, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println("ArrayList in Acending order:");
		for (String str : arraylist) {
			System.out.println(str);
		}
		Collections.reverse(arraylist);
		System.out.println("dddddddddddddddddd");
		for (String str : arraylist) {
			System.out.println(str);
		}
	}
}
