package com.sjc.java.interview.code.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CustomeValueHaskMapSigleSort {
	public static void main(String args[]) {
		Employee employee1 = new Employee(3, "robin", 2000);
		Employee employee2 = new Employee(1, "mani", 1000);
		Employee employee3 = new Employee(2, "vishnu", 3000);
		Employee employee4 = new Employee(2, "vishnu", 5000);
		Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

		employeeMap.put(3, employee3);
		employeeMap.put(1, employee1);
		employeeMap.put(2, employee2);
		employeeMap.put(4, employee4);

		List<Entry<Integer, Employee>> entryList = new ArrayList<Map.Entry<Integer, Employee>>(employeeMap.entrySet());
		//Collections.sort(entryList, new IdComparator());
		printValues(entryList);

	}

	public static void printValues(List<Entry<Integer, Employee>> entryList) {

		for (Map.Entry<Integer, Employee> entry : entryList) {
			System.out.println(" ID " + entry.getValue().getId() + " Name " + entry.getValue().getName() + " Salary "
					+ entry.getValue().getSalary());
		}

	}
}
