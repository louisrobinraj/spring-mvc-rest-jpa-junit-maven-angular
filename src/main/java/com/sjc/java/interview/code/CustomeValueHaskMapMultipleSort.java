package com.sjc.java.interview.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CustomeValueHaskMapMultipleSort {
	public static void main(String args[]) {
		Employee employee2 = new Employee(2, "robin", 2000);
		Employee employee1 = new Employee(1, "mani", 1000);
		Employee employee3 = new Employee(3, "vishnu", 3000);
		Employee employee4 = new Employee(3, "vishnu", 5000);
		Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

		employeeMap.put(3, employee3);
		employeeMap.put(1, employee1);
		employeeMap.put(2, employee2);
		employeeMap.put(4, employee4);
		List<Entry<Integer, Employee>> entryList = new ArrayList<Map.Entry<Integer, Employee>>(employeeMap.entrySet());
		Collections.sort(entryList,
				new MulipleComparator(new IdComparator(), new NameComparator(), new SalaryComparator()));
		printValues(entryList);

	}

	public static void printValues(List<Entry<Integer, Employee>> entryList) {

		for (Map.Entry<Integer, Employee> entry : entryList) {
			System.out.println("KEY :: " + entry.getKey() + " ID " + entry.getValue().getId() + " Name "
					+ entry.getValue().getName() + " Salary " + entry.getValue().getSalary());
		}

	}
}

class IdComparator implements Comparator<Map.Entry<Integer, Employee>> {
	@Override
	public int compare(Map.Entry<Integer, Employee> entry1, Map.Entry<Integer, Employee> entry2) {
		return entry1.getValue().getId() - entry2.getValue().getId();
	}
}

class NameComparator implements Comparator<Map.Entry<Integer, Employee>> {
	@Override
	public int compare(Map.Entry<Integer, Employee> integerEmployeeEntry,
			Map.Entry<Integer, Employee> integerEmployeeEntry2) {
		return integerEmployeeEntry.getValue().getName().compareTo(integerEmployeeEntry2.getValue().getName());
	}
}

class SalaryComparator implements Comparator<Map.Entry<Integer, Employee>> {
	@Override
	public int compare(Map.Entry<Integer, Employee> entry1, Map.Entry<Integer, Employee> entry2) {
		return entry1.getValue().getSalary() - entry2.getValue().getSalary();
	}
}

class MulipleComparator implements Comparator<Map.Entry<Integer, Employee>> {
	List<Comparator<Map.Entry<Integer, Employee>>> list;

	public MulipleComparator(Comparator<Map.Entry<Integer, Employee>>... comarator) {
		this.list = Arrays.asList(comarator);
	}

	@Override
	public int compare(Entry<Integer, Employee> o1, Entry<Integer, Employee> o2) {
		for (Comparator<Map.Entry<Integer, Employee>> listCompareEntry : list) {
			int result = listCompareEntry.compare(o1, o2);
			if (result != 0) {
				return result;
			}
		}
		return 0;
	}

}
