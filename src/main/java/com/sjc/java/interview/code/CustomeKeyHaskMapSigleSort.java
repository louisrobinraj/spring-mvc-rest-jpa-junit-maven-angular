package com.sjc.java.interview.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

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
		Map<Employee,Integer> em=new TreeMap<Employee, Integer>(employeeMap);
		System.out.println(em.size());
		List<Entry<Employee, Integer>> entryList = new ArrayList<Map.Entry<Employee, Integer>>(em.entrySet());
		printValues(entryList);

	}

	public static void printValues(List<Entry<Employee, Integer>> entryList) {

		for (Map.Entry<Employee, Integer> entry : entryList) {
			System.out.println(" ID " + entry.getKey().getId() + " Name " + entry.getKey().getName() + " Salary "+ entry.getKey().getSalary());
		}

	}
}
