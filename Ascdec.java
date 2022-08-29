package StringAss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.*;

/**
 * 
 * @author rupali.patil I want print the all alphabets of string in ascending
 *         order
 *
 */

public class Ascdec {
	public static void main(String[] args) {
		String s = "YashMagrapatta123456"; // Input String
		char temp;

		char arr[] = s.toCharArray();
		System.out.println("Before sorting:-> " + s);
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (arr[j] > arr[i]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		System.out.print("After sorting String:-> ");
		for (int k = 0; k < s.length(); k++) {
			System.out.print(arr[k]);// Print value of array of K
		}

	}
}
