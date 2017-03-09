package com.sjc.java.interview.code.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomeArrayListMultipleSort {

	@SuppressWarnings("unchecked")
	public static void main(String args[]) {

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(2, "robin", "MATHS"));
		studentList.add(new Student(1, "robin", "CS"));
		studentList.add(new Student(3, "robin", "MBA"));
		studentList.add(new Student(2, "mani", "SCIENCE"));

		Collections.sort(studentList, new MultipleComparator(new StudentIdComparator(), new StudentNameComparator(),
				new StudentDepartmentComparator()));
		for (Student student : studentList) {
			System.out.println(student);
		}

	}

}

class MultipleComparator implements Comparator<Student> {

	List<Comparator<Student>> listStudentComparator;

	public MultipleComparator(Comparator<Student>... listOfStudentComparator) {
		this.listStudentComparator = Arrays.asList(listOfStudentComparator);
	}

	@Override
	public int compare(Student student1, Student student2) {

		for (Comparator<Student> studentComparator : listStudentComparator) {
			int result = studentComparator.compare(student1, student2);
			if (result != 0) {
				return result;
			}
		}
		return 0;

	}
}

class StudentIdComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		if (student1.getId() == student2.getId()) {
			return 0;
		} else if (student1.getId() > student2.getId()) {
			return 1;
		} else {
			return -1;
		}
	}

}

class StudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return student1.getName().compareTo(student2.getName());
	}

}

class StudentDepartmentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return student1.getDepartment().compareTo(student2.getDepartment());
	}

}