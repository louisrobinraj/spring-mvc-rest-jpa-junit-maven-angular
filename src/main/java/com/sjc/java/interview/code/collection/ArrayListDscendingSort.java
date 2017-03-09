package com.sjc.java.interview.code.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListDscendingSort {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("four");
		list.add("five");
		list.add("six");

		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		for (String str : list) {
			System.out.println(str);
		}

	}

}
