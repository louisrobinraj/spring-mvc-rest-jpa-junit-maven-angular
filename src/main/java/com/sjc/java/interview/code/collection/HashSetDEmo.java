package com.sjc.java.interview.code.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDEmo {

	public static void main(String args[]) {
		Set<String> hashSet = new LinkedHashSet<String>();
		hashSet.add("Amit");
		hashSet.add("Vijay");
		hashSet.add("Kumar");
		List<String> list = new ArrayList<String>(hashSet);
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println("LinkedHashSet in ascending order:");
		for (String str : list) {
			System.out.println(str);
		}
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println("LinkedHashSet in descending order:");
		for (String str : list) {
			System.out.println(str);
		}
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("Amit");
		treeSet.add("Vijay");
		treeSet.add("Kumar");
		List<String> treeList = new ArrayList<String>(treeSet);
		Collections.sort(treeList, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println("TreeSet in descending order:");
		for (String str : list) {
			System.out.println(str);
		}
	}
}
