package com.yash.java.oopstask8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
public static void main(String[] args) throws ParseException {
	String manfDate = "31/12/2020";
	Date mfd = new SimpleDateFormat("dd/MM/yyyy").parse(manfDate);
	
	Electronics mobile = new Mobile(101, "mobile Semiconductor", mfd);
	System.out.println(mobile);
	System.out.println();
	
	Electronics lcd = new LCD(102, "lcd Semiconductor", mfd);
	System.out.println(lcd);
	System.out.println();
	
	Electronics laptop = new Laptop(103, "laptop Semiconductor", mfd);
	System.out.println(laptop);
}
}
