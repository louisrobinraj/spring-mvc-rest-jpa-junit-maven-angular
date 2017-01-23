package com.sjc.java.interview.code.experience;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TopOccurenceWord {

	public static void main(String[] args) {

		String str = "java is hight level programing language and is platform independant and is java";

		String worrds[] = str.split(" ");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String word : worrds) {

			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}

		}

		List<Map.Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

				return o1.getValue() - o2.getValue();
			}

		});
		System.out.println(
				"Top word " + list.get(list.size() - 1).getKey() + " Times " + list.get(list.size() - 1).getValue());
		System.out.println(
				"Top word " + list.get(list.size() - 2).getKey() + " Times " + list.get(list.size() - 2).getValue());
		System.out.println(
				"Top word " + list.get(list.size() - 3).getKey() + " Times " + list.get(list.size() - 3).getValue());

	}

}
