package com.yash.java.oopstask10;

public class Product implements Cloneable {
	private int pid;
	private String pname;
	private double price;
	private int unitOfMeasurement;

	public Product(int pid, String pname, double price, int unitOfMeasurement) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.unitOfMeasurement = unitOfMeasurement;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	int getPid() {
		return pid;
	}

	void setPid(int pid) {
		this.pid = pid;
	}

	String getPname() {
		return pname;
	}

	void setPname(String pname) {
		this.pname = pname;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	int getUnitOfMeasurement() {
		return unitOfMeasurement;
	}

	void setUnitOfMeasurement(int unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", unitOfMeasurement="
				+ unitOfMeasurement + "]";
	}

}
