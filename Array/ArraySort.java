package ass1;

import java.util.Arrays;

/* Suppose that you are having an array of size N. now your task is to sort the half array that is 
from 0 to N/2 in ascending order and N/2+1 to N in descending order. 
7) WAP to find the LCM and HCF of array number*/

public class ArraySort {
	public static void main(String[] agrs) {
		int[] arr = { 56, 50,21,9,80,218,};
		int length = arr.length;
		System.out.println("length of array is: " + length);

		Arrays.sort(arr);

		for (int i = 0; i <= length / 2; i++) {
			System.out.println(+arr[i]);
		}

		for (int j = arr.length - 1; j > length / 2; j--) {
			System.out.println(+arr[j]);
		}

	
}

}
