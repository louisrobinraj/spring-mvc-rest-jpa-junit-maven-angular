package com.sjc.java.interview.code.experience;

public class OveridingDemo {

	public static void main(String[] args) {

		Cert vert = new Cert();
		Plip blip = new Plip(10);
		Plip blip2 = (Plip) vert;
		//Cert vert2 = (Cert) blip;// class case exception

		Plip p=new Cert();
		p.show();
	}

}

class Plip {
	static int show() {
		System.out.println("parent classs ");
		return 10;
	}

	protected Plip(int i) {

	}
}

class Cert extends Plip {
	protected Cert(int i) {
		super(i);
	}

	protected Cert() {
		this(10);
	}

	static int show() {
		System.out.println("child classs ");
		return 10;
	}
}