package com.yash.java.oopstask1;

import java.util.Date;

public class Employee extends Person {
	private double salary;
	private Date date_of_joining;
	private String base_location;
	private Department deptObj;
	private int contactNo;
	private String emailId;

	public Employee(int pid, String pname, String paddress, Date dob, double salary, Date date_of_joining,
			String base_location, Department deptObj, int contactNo, String emailId) {
		super(pid, pname, paddress, dob);
		this.salary = salary;
		this.date_of_joining = date_of_joining;
		this.base_location = base_location;
		this.deptObj = deptObj;
		this.contactNo = contactNo;
		this.emailId = emailId;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	Date getDate_of_joining() {
		return date_of_joining;
	}

	void setDate_of_joining(Date date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	String getBase_location() {
		return base_location;
	}

	void setBase_location(String base_location) {
		this.base_location = base_location;
	}

	Department getDeptObj() {
		return deptObj;
	}

	void setDeptObj(Department deptObj) {
		this.deptObj = deptObj;
	}

	int getContactNo() {
		return contactNo;
	}

	void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	String getEmailId() {
		return emailId;
	}

	void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	void printEmployeeDetails() {
		System.out.println("Employee ID : "+pid+"\nEmployee Name: "+pname+"\nAddress: "+paddress+"\nDOB: "+dob+
				"\nSalary: "+salary+"\nDate of Joining: "+date_of_joining+"\nBase Location: "+base_location+
				"\nDepartment: "+deptObj+"\nContact Number: "+contactNo+"\nEmail-Id: "+emailId);
	}
}
