package com.yash.springfirstapp1;
/**
 * 
 *
 */
public class ConsecutiveNumber {
	public int add(int start, int end) {

		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;//1+2+3+4+5+6+7+8+9+10
		}
		System.out.println(sum);
		return sum;
	}
}
