package com.sjc.java.interview.code.experience;

import java.util.ArrayList;

public class Teststringcomparison1 {
	public static void main(String args[]) {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Saurav";
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(s4));// false

		System.out.println(s1 == s2);// true

		System.out.println(s1 == s3.intern());// true
		String s11 = "sachin";
		String s22 = "SACHIN";
		System.out.println(s11==s22);//false
		String s33=s22.toLowerCase().intern();//true
		System.out.println(s11==s33);//true
		System.out.println(s11 == s22.toLowerCase());// false
		System.out.println(s11 == s22.toLowerCase().intern());// true
		System.out.println(s11.equals(s22.toLowerCase()));
		System.out.println(s11.equalsIgnoreCase(s22));//true  
		
	    String x1=new String("Sachin");  
	    String x2=x1.intern();  
	    System.out.println(s1.equals(x2));//true  
	    System.out.println(x1.intern()==x2);//true
	    StringBuffer buffer1=new StringBuffer("robin");
	    StringBuffer buffer2=new StringBuffer("robin");
	    System.out.println(buffer1.equals(buffer2));//false
	    
	    
	    
	}
}