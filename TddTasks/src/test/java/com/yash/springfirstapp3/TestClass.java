package com.yash.springfirstapp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.yash.springfirstapp3.EvenOdd;
/**
 * 
 *
 */
public class TestClass {
EvenOdd eo=new EvenOdd();
	
	@Test
	public void test_even_odd_count() {
		assertEquals(eo.evenodd(542587545), "4 5");
	}
	
	@Test
	public void test_even_odd_count1() {
		assertEquals(eo.evenodd(53545), "1 4");
	}
}
