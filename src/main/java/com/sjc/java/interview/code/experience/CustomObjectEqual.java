package com.sjc.java.interview.code.experience;

import java.util.Set;
import java.util.TreeSet;

class CustomObjectEqual {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "robin");
		Employee e2 = new Employee(1, "robin");

		Set employeeSet = new TreeSet<Employee>();
		employeeSet.add(e1);
		employeeSet.add(e2);
		System.out.println(employeeSet.size());
	}

}

class Employee implements Comparable<Employee> {

	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "id ::" + id + " Name ::" + name;
	}

	@Override
	public int compareTo(Employee o) {
		if (o.id == id) {
			return 0;
		} else if (o.id > id) {
			return 1;
		}
		return -1;
	}
}
