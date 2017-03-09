package com.sjc.java.interview.code.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CustomeKeyHaskMapSigleSort {
	public static void main(String args[]) {
		Employee employee1 = new Employee(3, "robin", 2000);
		Employee employee2 = new Employee(1, "mani", 1000);
		Employee employee3 = new Employee(2, "vishnu", 3000);
		Employee employee4 = new Employee(2, "vishnu", 5000);
		Map<Employee, Integer> employeeMap = new HashMap<Employee, Integer>();

		employeeMap.put(employee3, 3);
		employeeMap.put(employee1, 3);
		employeeMap.put(employee2, 1);
		employeeMap.put(employee4, 2);

		List<Map.Entry<Employee, Integer>> entryList = new ArrayList<Map.Entry<Employee, Integer>>(
				employeeMap.entrySet());
		Collections.sort(entryList, new Comparator<Entry<Employee, Integer>>() {
			@Override
			public int compare(Map.Entry<Employee, Integer> o1, Map.Entry<Employee, Integer> o2) {

				return o1.getKey().getId() - o2.getKey().getId();
			}
		});

		printValues(entryList);

	}

	public static void printValues(List<Entry<Employee, Integer>> entryList) {

		for (Map.Entry<Employee, Integer> entry : entryList) {
			System.out.println(" ID " + entry.getKey().getId() + " Name " + entry.getKey().getName() + " Salary "
					+ entry.getKey().getSalary());
		}

	}
}
