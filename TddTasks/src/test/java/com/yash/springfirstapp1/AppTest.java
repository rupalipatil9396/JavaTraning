package com.yash.springfirstapp1;
/**
 * 
 *
 */
import org.junit.jupiter.api.Test;

import com.yash.springfirstapp1.ConsecutiveNumber;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    
	ConsecutiveNumber cn = new ConsecutiveNumber();

	@Test
	public void test_consecutive_number() {

		assertEquals(cn.add(1, 10), 55);
	}

	@Test
	public void test_consecutive_number2() {

		assertEquals(cn.add(11, 20), 155);
	}
}
