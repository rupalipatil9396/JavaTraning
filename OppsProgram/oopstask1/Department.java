package com.yash.java.oopstask1;

public class Department {
	private String deptId;
	private String dname;

	public Department(String deptId, String dname) {
		this.deptId = deptId;
		this.dname = dname;
	}

	String getDeptId() {
		return deptId;
	}

	void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	String getDname() {
		return dname;
	}

	void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", dname=" + dname + "]";
	}

}
