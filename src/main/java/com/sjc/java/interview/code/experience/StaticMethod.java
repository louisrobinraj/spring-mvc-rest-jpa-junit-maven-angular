package com.sjc.java.interview.code.experience;
//1.final variable value only initaize in contrctrutor or instance iinitaizer block
//2.blank final variable posible not posible.
//3.static final variable must be initaize using static block
//4.blank static final not posible sow compile error.
public class StaticMethod {

	public static void main(String args[]) {

	}

	public static void show() {
		// hide();
	}

	public void hide() {
		show();
	}

}
