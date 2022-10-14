package com.yash.springfirstapp2;
import org.junit.jupiter.api.Test;
import com.yash.springfirstapp2.Factorial;
import static org.junit.jupiter.api.Assertions.*;
/**
 * 
 *
 */
public class TestClass {
	Factorial f1=new Factorial();
	@Test
	public void test_factorial_number() {
		
		assertEquals(f1.fact(5), 120);
	}
	@Test
	public void test_factorial_number2() {

		assertEquals(f1.fact(6), 720);
	}
}
