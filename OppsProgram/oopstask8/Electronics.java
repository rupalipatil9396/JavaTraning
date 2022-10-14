package com.yash.java.oopstask8;

import java.util.Date;

public class Electronics {
	private int id;
	private String semiconductorType;
	private Date dateOfManufacturing;

	public Electronics(int id, String semiconductorType, Date dateOfManufacturing) {
		this.id = id;
		this.semiconductorType = semiconductorType;
		this.dateOfManufacturing = dateOfManufacturing;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getSemiconductorType() {
		return semiconductorType;
	}

	void setSemiconductorType(String semiconductorType) {
		this.semiconductorType = semiconductorType;
	}

	Date getDateOfManufacturing() {
		return dateOfManufacturing;
	}

	void setDateOfManufacturing(Date dateOfManufacturing) {
		this.dateOfManufacturing = dateOfManufacturing;
	}

	@Override
	public String toString() {
		return "Electronics [id=" + id + ", semiconductorType=" + semiconductorType + ", dateOfManufacturing="
				+ dateOfManufacturing + "]";
	}

}
