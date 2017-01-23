package com.sjc.java.interview.code.override;

public class OverrideExaple {

	public static void main(String args[]) {
		Bank b1 = new SBI();
		Bank b2 = new ICICI();
		Bank b3 = new AXIS();
		System.out.println("SBI Rate of Interest: " + b1.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: " + b2.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: " + b3.getRateOfInterest());
		
		String s1="robin";
		String s2=s1;
		s1="robinraj";
		System.out.println(s2);
		int a1=10;
		int a2=a1;
		a1=30;
		System.out.println(a2);
		
	}

}

class Bank {
	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class AXIS extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}
