package com.yash.java.oopstask3;

import java.util.Date;

public class Customer {
	private String custId;
	private int accountNo;
	private String custName;
	private String cust_address;
	private Date cust_dob;
	private Date cust_account_opening_date;
	private Branch branchObj;

	public Customer(String custId, int accountNo, String custName, String cust_address, Date cust_dob,
			Date cust_account_opening_date, Branch branchObj) {
		this.custId = custId;
		this.accountNo = accountNo;
		this.custName = custName;
		this.cust_address = cust_address;
		this.cust_dob = cust_dob;
		this.cust_account_opening_date = cust_account_opening_date;
		this.branchObj = branchObj;
	}

	String getCustId() {
		return custId;
	}

	void setCustId(String custId) {
		this.custId = custId;
	}

	int getAccountNo() {
		return accountNo;
	}

	void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	String getCustName() {
		return custName;
	}

	void setCustName(String custName) {
		this.custName = custName;
	}

	String getCust_address() {
		return cust_address;
	}

	void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	Date getCust_dob() {
		return cust_dob;
	}

	void setCust_dob(Date cust_dob) {
		this.cust_dob = cust_dob;
	}

	Date getCust_account_opening_date() {
		return cust_account_opening_date;
	}

	void setCust_account_opening_date(Date cust_account_opening_date) {
		this.cust_account_opening_date = cust_account_opening_date;
	}

	Branch getBranchObj() {
		return branchObj;
	}

	void setBranchObj(Branch branchObj) {
		this.branchObj = branchObj;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", accountNo=" + accountNo + ", custName=" + custName + ", cust_address="
				+ cust_address + ", cust_dob=" + cust_dob + ", cust_account_opening_date=" + cust_account_opening_date
				+ ", branchObj=" + branchObj + "]";
	}

}
