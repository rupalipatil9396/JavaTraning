package com.yash.java.oopstask3;

public class Branch {
	private String branch_id;
	private String branch_name;
	private String branch_address;

	public Branch(String branch_id, String branch_name, String branch_address) {
		this.branch_id = branch_id;
		this.branch_name = branch_name;
		this.branch_address = branch_address;
	}

	String getBranch_id() {
		return branch_id;
	}

	void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}

	String getBranch_name() {
		return branch_name;
	}

	void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	String getBranch_address() {
		return branch_address;
	}

	void setBranch_address(String branch_address) {
		this.branch_address = branch_address;
	}

	@Override
	public String toString() {
		return "Branch [branch_id=" + branch_id + ", branch_name=" + branch_name + ", branch_address=" + branch_address
				+ "]";
	}

}
