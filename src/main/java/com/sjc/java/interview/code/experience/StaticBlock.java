package com.sjc.java.interview.code.experience;

public class StaticBlock {
	StaticBlock() {
		System.out.println("constructor block executed");
	}

	public static void main(String args[]) {
		StaticBlock block = new StaticBlock();
		String str=new String ("robin");
		String str1=new String("robin");
		System.out.println(str==str1.intern());
		System.out.println(str.equals(str1));
		StringBuffer buffer1=new StringBuffer("robin");
		StringBuffer buffer2=new StringBuffer("robin");
		System.out.println(buffer1==buffer2);
		
		
		
	}

	static {
		System.out.println("static block executed");
	}
	{
		System.out.println("intance block");
	}
}
