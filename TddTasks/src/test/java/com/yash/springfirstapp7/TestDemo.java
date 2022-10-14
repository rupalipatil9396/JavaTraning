package com.yash.springfirstapp7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.yash.springfirstapp7.BinaryEquant;
/**
 * 
 *
 */
public class TestDemo {
BinaryEquant be=new BinaryEquant();
	
	@Test
	public void test_binary_equant() {
		assertEquals(be.findBinaryEquant(3), "11");
	}
	@Test
	public void test_binary_equant1() {
		assertEquals(be.findBinaryEquant(8), "1000");
	}
}
