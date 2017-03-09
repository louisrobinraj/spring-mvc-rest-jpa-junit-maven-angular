package com.sjc.java.interview.code.experience;

import java.util.*;

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("drawing circle");
	}
}

public class WildGeneics {
	// creating a method that accepts only child class of Shape
	public static void drawShapes(List<? extends Shape> lists) {
		for (Shape s : lists) {
			s.draw();// calling method of Shape class by child class instance
		}
	}

	public static void main(String args[]) {
		List<Rectangle> rectangleList = new ArrayList<Rectangle>();
		rectangleList.add(new Rectangle());

		List<Circle> circleList = new ArrayList<Circle>();
		circleList.add(new Circle());
		circleList.add(new Circle());
		
		List<Shape> shapeList = new ArrayList<Shape>();
		shapeList.add(new Rectangle());
		shapeList.add(new Circle());
		
		drawShapes(shapeList);

		drawShapes(rectangleList);
		drawShapes(circleList);
	}
}