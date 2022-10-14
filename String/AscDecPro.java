package ass1;
/*WAP to remove all the vowels from the given string*/

import java.util.Arrays;
/*WAP to print the all alphabets of string in ascending and descending order.*/
public class AscDecPro {
	public static void main(String[] args) {
		String s = "abcdeAKRZfgh";
		char[] arr = s.toCharArray();
		char temp;
		int i, j;
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {//for  descending order
					// if (arr[i] > arr[j]) { //for ascending order
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
