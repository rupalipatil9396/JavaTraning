package com.yash.java.oopsTask2;

public class Triangle implements Shape {

	private double height;
	private double breath;

	public Triangle(double height, double breath) {
		this.height = height;
		this.breath = breath;
	}

	@Override
	public double area() {
		return (height * breath) / 2;
	}

}
