package com.sjc.java.interview.code.experience;

public class PrimitiveConvetor {

	public static void main(String[] args) {
		float f = 1999990.6444f;

		int a = (int) f;
		System.out.println(f);
		System.out.println(a);
		int sum = 0;
		int aa[] = { 2, 3, 4, 2, 4, 5 };

		for (int i = 0; i < aa.length; i++) {

			for (int j = i + 1; j < aa.length; j++) {
				if (aa[i] > aa[j]) {
					int temp = aa[i];
					aa[i] = aa[j];
					aa[j] = temp;
				}
			}

		}
		for (int j = 0; j < aa.length; j++) {
			System.out.println(aa[j]);
		}
	}

}
