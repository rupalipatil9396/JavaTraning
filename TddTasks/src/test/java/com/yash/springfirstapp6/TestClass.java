package com.yash.springfirstapp6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.yash.springfirstapp6.DivisibleBy7;
/**
 * 
 *
 */
public class TestClass {
	DivisibleBy7 d=new DivisibleBy7();
	@Test
	public void test_DivisibleBy7_Right() {
		assertEquals(d.add(), 2107);
	}
	
	@Test
	public void test_DivisibleBy7_Wrong() {
		assertEquals(d.add(), 2107);
	}
}
