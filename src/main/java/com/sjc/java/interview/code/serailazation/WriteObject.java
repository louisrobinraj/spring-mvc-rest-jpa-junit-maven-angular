package com.sjc.java.interview.code.serailazation;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String args[]) {

		Employee address = new Employee();
		address.setStreet("wall street");
		address.setCountry("united states");

		try {

			FileOutputStream fout = new FileOutputStream("c:\\employee.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(address);
			oos.close();
			System.out.println("Done");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}