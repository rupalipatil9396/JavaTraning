package com.yash.java.oopsTask2;

public class Test {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(15, 4);
		System.out.println("area of triangle: " + triangle.area());

		Rectangle rectangle = new Rectangle(14, 10);
		System.out.println("area of rectangle: " + rectangle.area());

		Square square = new Square(10);
		System.out.println("are of square: " + square.area());
	}

}
