package com.sjc.java.interview.code.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomeArrayListSigleSort {

	public static void main(String args[]) {

		List<Student> listStudent = new ArrayList<Student>();
		listStudent.add(new Student(2, "robin", "CS"));
		listStudent.add(new Student(1, "robin", "MBA"));
		listStudent.add(new Student(3, "robin", "CS"));
		Collections.sort(listStudent);
		for (Student string : listStudent) {
			System.out.println(string);
		}
	}

}

class Student implements Comparable<Student> {
	int id;
	String name;
	String department;

	Student(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public int compareTo(Student student) {
		if (this.id == student.getId()) {
			return 0;
		} else if (this.id > student.getId()) {
			return 1;
		} else {
			return -1;
		}
	}

	public String toString() {
		return "Id " + id + " Name " + name + " Department " + department;
	}
}