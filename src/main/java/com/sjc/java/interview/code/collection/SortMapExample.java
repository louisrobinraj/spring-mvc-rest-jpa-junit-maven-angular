package com.sjc.java.interview.code.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapExample {

	public static void main(String[] args) {
		Map<Integer, String> unsortMap = new HashMap<Integer, String>();
		unsortMap.put(10, "Ashraf");
		unsortMap.put(5, "Sara");
		unsortMap.put(6, "Mohamed");
		unsortMap.put(20, "Esraa");
		unsortMap.put(1, "Bahaa");
		unsortMap.put(7, "Dalia");
		unsortMap.put(8, "Amira");
		unsortMap.put(99, "Ahmed");
		unsortMap.put(50, "Sama");
		unsortMap.put(2, "Nada");
		unsortMap.put(9, "Osama");

		List<Map.Entry<Integer, String>> listOfentrySet = new ArrayList<Map.Entry<Integer, String>>(
				unsortMap.entrySet());
		printSortByKeyAscending(listOfentrySet);
		printSortByKeyDescending(listOfentrySet);
		printSortByValueAscending(listOfentrySet);
		printSortByValueDescending(listOfentrySet);

	}

	private static void printSortByKeyAscending(List<Map.Entry<Integer, String>> listOfentrySet) {
		Collections.sort(listOfentrySet, new Comparator<Map.Entry<Integer, String>>() {
			@Override
			public int compare(Map.Entry<Integer, String> entry1, Map.Entry<Integer, String> entry2) {
				return (entry1.getKey()).compareTo(entry2.getKey());
			}
		});
		System.out.println("\nAfter sorting by key(ascending): ");
		for (

		Map.Entry<Integer, String> entry : listOfentrySet) {
			System.out.println(entry.getKey() + "=" + entry.getValue() + "  ");
		}
	}

	private static void printSortByKeyDescending(List<Map.Entry<Integer, String>> listOfentrySet) {
		Collections.sort(listOfentrySet, new Comparator<Map.Entry<Integer, String>>() {
			@Override
			public int compare(Map.Entry<Integer, String> entry1, Map.Entry<Integer, String> entry2) {
				return (entry2.getKey()).compareTo(entry1.getKey());
			}
		});

		System.out.println("\nAfter sorting by key(descending): ");
		for (Map.Entry<Integer, String> entry : listOfentrySet) {
			System.out.println(entry.getKey() + "=" + entry.getValue() + "  ");
		}
	}

	private static void printSortByValueAscending(List<Entry<Integer, String>> listOfentrySet) {
		Collections.sort(listOfentrySet, new Comparator<Map.Entry<Integer, String>>() {
			@Override
			public int compare(Map.Entry<Integer, String> entry1, Map.Entry<Integer, String> entry2) {
				return (entry1.getValue()).compareTo(entry2.getValue());
			}
		});
		System.out.println("\nAfter sorting by Value(ascending): ");
		for (Map.Entry<Integer, String> entry : listOfentrySet) {
			System.out.println(entry.getKey() + "=" + entry.getValue() + "  ");
		}
	}

	private static void printSortByValueDescending(List<Entry<Integer, String>> listOfentrySet) {
		Collections.sort(listOfentrySet, new Comparator<Map.Entry<Integer, String>>() {
			@Override
			public int compare(Map.Entry<Integer, String> entry1, Map.Entry<Integer, String> entry2) {
				return (entry2.getValue()).compareTo(entry1.getValue());
			}
		});
		System.out.println("\nAfter sorting by Value(ascending): ");
		for (Map.Entry<Integer, String> entry : listOfentrySet) {
			System.out.println(entry.getKey() + "=" + entry.getValue() + "  ");
		}
	}
}

// class SortByKeyAscending implements Comparator<Map.Entry<Integer, String>> {
//
// @Override
// public int compare(Map.Entry<Integer, String> entry1, Map.Entry<Integer,
// String> entry2) {
// return (entry1.getKey()).compareTo(entry2.getKey());
// }
// }
//
// class SortByKeyDescending implements Comparator<Map.Entry<Integer, String>> {
//
// @Override
// public int compare(Map.Entry<Integer, String> entry1, Map.Entry<Integer,
// String> entry2) {
// return (entry2.getKey()).compareTo(entry1.getKey());
// }
// }

// class SortByValueDescending implements Comparator<Map.Entry<Integer, String>>
// {
//
// @Override
// public int compare(Map.Entry<Integer, String> entry1, Map.Entry<Integer,
// String> entry2) {
// return (entry2.getValue()).compareTo(entry1.getValue());
// }
// }
//
// class SortByValueAscending implements Comparator<Map.Entry<Integer, String>>
// {
//
// @Override
// public int compare(Map.Entry<Integer, String> entry1, Map.Entry<Integer,
// String> entry2) {
// return (entry1.getValue()).compareTo(entry2.getValue());
// }
// }
