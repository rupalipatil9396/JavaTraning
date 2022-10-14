package com.yash.java.oopstask1;

import java.util.Date;

public class Person {
	protected int pid;
	protected String pname;
	protected String paddress;
	protected Date dob;

	public Person(int pid, String pname, String paddress, Date dob) {
		this.pid = pid;
		this.pname = pname;
		this.paddress = paddress;
		this.dob = dob;
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

	String getPaddress() {
		return paddress;
	}

	void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	Date getDob() {
		return dob;
	}

	void setDob(Date dob) {
		this.dob = dob;
	}

}
