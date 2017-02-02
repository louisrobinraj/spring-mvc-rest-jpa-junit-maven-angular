package com.sjc.java.interview.code.experience;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WriteObjectFile {

	public static void main(String args[]) throws IOException {

		WriteObjectFile deserializer = new WriteObjectFile();
		deserializer.insertUserDataRow("10", "robinraj", "raj", "mca", "m", "1990");
		deserializer.insertUserDataRow("9", "robinraj", "raj", "mca", "m", "1990");
		deserializer.insertUserDataRow("8", "robinraj", "raj", "mca", "m", "1990");
		deserializer.insertUserDataRow("15", "robinraj", "raj", "mca", "m", "1990");

		List<UserDataRow> readDataFromFile = readDataFromFile();

		Iterator<UserDataRow> iterator = readDataFromFile.iterator();
		while (iterator.hasNext()) {
			UserDataRow userDataRow = (UserDataRow) iterator.next();

			System.out.println(userDataRow.getRegnumber() + " ::" + userDataRow.getFirstname() + " :: "
					+ userDataRow.getLastname() + " :: " + userDataRow.getProfession() + " :: " + userDataRow.getSex()
					+ userDataRow.getDateofbirth());
		}
	}

	public void insertUserDataRow(String regNr, String firstName, String lastName, String profession, String sex,
			String dateofbirth) throws IOException {
		List<UserDataRow> userDataList = readDataFromFile();
		UserDataRow ud = new UserDataRow(regNr, firstName, lastName, profession, sex, dateofbirth);
		userDataList.add(ud);
		saveAllDataToFile("c:\\address.txt", userDataList);
	}

	public static List<UserDataRow> readDataFromFile() {
		List<UserDataRow> listofusers = new ArrayList<UserDataRow>();
		FileInputStream fstream = null;
		try {
			fstream = new FileInputStream("c:\\address.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String strLine = "";
			String[] tokens = strLine.split(", ");
			while ((strLine = br.readLine()) != null) {
				listofusers.add(new UserDataRow(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fstream.close();
			} catch (Exception ignore) {
			}
		}
		return listofusers;
	}

	public static void saveAllDataToFile(String filename, List<UserDataRow> userDataList) throws IOException {
		BufferedWriter bufferedWriter = null;
		bufferedWriter = new BufferedWriter(new FileWriter(filename));
		UserDataRow ud;
		String row;
		for (int i = 0; i < userDataList.size(); i++) {
			ud = userDataList.get(i);
			row = ud.regnumber + ", " + ud.firstname + ", " + ud.lastname + ", " + ud.profession + ", " + ud.sex + ", "+ ud.dateofbirth;
			try {
				bufferedWriter.write(row);
				bufferedWriter.newLine();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		try {
			if (bufferedWriter != null) {
				bufferedWriter.flush();
				bufferedWriter.close();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}

class UserDataRow implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	public String regnumber;
	public String firstname;
	public String lastname;
	public String profession;
	public String sex;
	public String dateofbirth;
	public int size;

	public UserDataRow(String rn, String fn, String ln, String p, String s, String dob) {
		this.regnumber = rn;
		this.firstname = fn;
		this.lastname = ln;
		this.profession = p;
		this.sex = s;
		this.dateofbirth = dob;
		this.size = 6;
	}

	public String getRegnumber() {
		return this.regnumber;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public String getProfession() {
		return this.profession;
	}

	public String getSex() {
		return this.sex;
	}

	public String getDateofbirth() {
		return this.dateofbirth;
	}

	public int compareTo(Object obj) {
		UserDataRow st = (UserDataRow) obj;
		if (regnumber.equals(st.regnumber))
			return 0;
		else
			return regnumber.compareTo(st.regnumber);

	}
}