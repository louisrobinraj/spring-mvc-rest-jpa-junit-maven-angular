package com.sjc.java.interview.code.experience;

public class SortArray {

	public static void main(String[] args) {

		int a[] = { 4, 2, 3 };
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		for (int j = 0; j < a.length; j++) {
			System.out.println(" " + a[j]);
		}

		int[] value = new int[5];

		value[0] = 10;
		value[1] = 10;
		value[2] = 10;
		value[3] = 10;
		value[4] = 10;
		for(int a1:value){
			System.out.println(a1);
		}
		StringBuffer buffer1=new StringBuffer("a");
		StringBuffer buffer2=new StringBuffer("a");
		System.out.println(buffer1.equals(buffer2));
		System.out.println(buffer1==buffer2);
	}

}
