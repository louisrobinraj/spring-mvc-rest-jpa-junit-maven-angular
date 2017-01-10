package com.sjc.java.interview.code.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CustomeKeyHaskMapMultipleSort {
	public static void main(String args[]) {
		Employee employee2 = new Employee(2, "robin", 2000);
		Employee employee1 = new Employee(1, "mani", 1000);
		Employee employee3 = new Employee(3, "vishnu", 3000);
		Employee employee4 = new Employee(3, "vishnu", 5000);
		Map<Employee, Integer> employeeMap = new HashMap<Employee, Integer>();

		employeeMap.put(employee3, 3);
		employeeMap.put(employee1, 1);
		employeeMap.put(employee2, 2);
		employeeMap.put(employee4, 4);
		List<Entry<Employee, Integer>> entryList = new ArrayList<Map.Entry<Employee, Integer>>(employeeMap.entrySet());
		Collections.sort(entryList,
				new MulipleKeyComparator(new IdKeyComparator(), new NameKeyComparator(), new SalaryKeyComparator()));
		printKeys(entryList);

	}

	public static void printKeys(List<Entry<Employee, Integer>> entryList) {

		for (Map.Entry<Employee, Integer> entry : entryList) {
			System.out.println("Key :: " + entry.getKey() + " ID " + entry.getKey().getId() + " Name "
					+ entry.getKey().getName() + " Salary " + entry.getKey().getSalary());
		}

	}
}

class IdKeyComparator implements Comparator<Map.Entry<Employee, Integer>> {
	@Override
	public int compare(Map.Entry<Employee, Integer> entry1, Map.Entry<Employee, Integer> entry2) {
		return entry1.getKey().getId() - entry2.getKey().getId();
	}
}

class NameKeyComparator implements Comparator<Map.Entry<Employee, Integer>> {
	@Override
	public int compare(Map.Entry<Employee, Integer> integerEmployeeEntry,
			Map.Entry<Employee, Integer> integerEmployeeEntry2) {
		return integerEmployeeEntry.getKey().getName().compareTo(integerEmployeeEntry2.getKey().getName());
	}
}

class SalaryKeyComparator implements Comparator<Map.Entry<Employee, Integer>> {
	@Override
	public int compare(Map.Entry<Employee, Integer> entry1, Map.Entry<Employee, Integer> entry2) {
		return entry1.getKey().getSalary() - entry2.getKey().getSalary();
	}
}

class MulipleKeyComparator implements Comparator<Map.Entry<Employee, Integer>> {
	List<Comparator<Map.Entry<Employee, Integer>>> list;

	public MulipleKeyComparator(Comparator<Map.Entry<Employee, Integer>>... comarator) {
		this.list = Arrays.asList(comarator);
	}

	@Override
	public int compare(Entry<Employee, Integer> o1, Entry<Employee, Integer> o2) {
		for (Comparator<Map.Entry<Employee, Integer>> listCompareEntry : list) {
			int result = listCompareEntry.compare(o1, o2);
			if (result != 0) {
				return result;
			}
		}
		return 0;
	}

}