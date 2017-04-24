package com.sjc.java.interview.code.override;

class Class1 {
	public static int Method1() {
		return 0;
	}
}

class Class2 extends Class1 {
	public static int Method1() {
		return 1;
	}

}

public class StaticMethodOverride {
	public static void main(String[] args) {
		// Must explicitly chose Method1 from Class1 or Class2
		
		Class1 obj1=new Class1();
		Class1 obj2=new Class2();
		
		System.out.println(obj1.Method1());
		System.out.println(obj2.Method1());
		System.out.println(Class2.Method1());
		
		
		String s1="robin";
		String s2="robin";
		String s3="robin";
		String s4="robin";
		s4="louis";
		System.out.println(s1+" "+s2+" "+s3+" "+s4);
	}
}