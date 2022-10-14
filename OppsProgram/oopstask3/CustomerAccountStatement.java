package com.yash.java.oopstask3;

import java.util.Date;

public class CustomerAccountStatement {
	private String CAID;
	private String custId;
	private double amount;
	private double deposit_withdrawl;
	private Date deposit_date;

	public CustomerAccountStatement(String CAID, String custId, double amount, double deposit_withdrawl,
			Date deposit_date) {
		this.CAID = CAID;
		this.custId = custId;
		this.amount = amount;
		this.deposit_withdrawl = deposit_withdrawl;
		this.deposit_date = deposit_date;
	}

	String getCAID() {
		return CAID;
	}

	void setCAID(String cAID) {
		CAID = cAID;
	}

	String getCustId() {
		return custId;
	}

	void setCustId(String custId) {
		this.custId = custId;
	}

	double getAmount() {
		return amount;
	}

	void setAmount(double amount) {
		this.amount = amount;
	}

	double getDeposit_withdrawl() {
		return deposit_withdrawl;
	}

	void setDeposit_withdrawl(double deposit_withdrawl) {
		this.deposit_withdrawl = deposit_withdrawl;
	}

	Date getDeposit_date() {
		return deposit_date;
	}

	void setDeposit_date(Date deposit_date) {
		this.deposit_date = deposit_date;
	}

	@Override
	public String toString() {
		return "CustomerAccountStatement [CAID=" + CAID + ", custId=" + custId + ", amount=" + amount
				+ ", deposit_withdrawl=" + deposit_withdrawl + ", deposit_date=" + deposit_date + "]";
	}

}
