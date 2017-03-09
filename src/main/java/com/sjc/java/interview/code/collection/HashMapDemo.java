package com.sjc.java.interview.code.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "veni");
		map.put(3, "mani");
		map.put(2, "raja");
		List<Map.Entry<Integer, String>> list = new ArrayList<Map.Entry<Integer, String>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {

			@Override
			public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {

				//return o1.getKey().compareTo(o2.getKey());//    key accending
				//return o2.getKey().compareTo(o1.getKey()); //   key decanding
				return o1.getValue().compareTo(o2.getValue());//  value accending
			}
		});

		System.out.println("\nAfter sorting by key(ascending): ");
		for (Map.Entry<Integer, String> entry : list) {
			System.out.println(entry.getKey() + "=" + entry.getValue() + "  ");
		}
	}

}
