package com.yash.java.oopstask3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) throws ParseException {
		String birthDate = "31/12/1993";
		Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(birthDate);

		String accOpenDate = "24/2/2021";
		Date aod = new SimpleDateFormat("dd/MM/yyyy").parse(accOpenDate);

		String depoDate = "24/2/2021";
		Date dod = new SimpleDateFormat("dd/MM/yyyy").parse(depoDate);

		Branch branch = new Branch("B101", "IT Department", "Pune");

		Customer customer = new Customer("c01", 1221140, "nilesh", "Cuttack", dob, aod, branch);

		CustomerAccountStatement accountStatement = new CustomerAccountStatement("Caid111", "cus101", 150000, 5000,
				dod);

		System.out.println(customer);
		System.out.println();
		System.out.println(accountStatement);
	}
}
