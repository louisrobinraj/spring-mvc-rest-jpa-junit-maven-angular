package com.sjc.java.interview.code.serailazation;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String args[]) {

		String str=null;
		str=str+10;
		System.out.println(str);
		Employee employee;

		try {

			FileInputStream fin = new FileInputStream("c:\\employee.txt");
			ObjectInputStream ois = new ObjectInputStream(fin);

			employee = (Employee) ois.readObject();
			ois.close();

			System.out.println(employee);
 
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}