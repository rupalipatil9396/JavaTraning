package StringAss;

import java.util.Scanner;
/**
 * \
 * @author rupali.patil
 *I want to print the number of alphabets repeated in the given string
 */
public class CountReapete {
public static void main(String[] args) {
	String str="Hello I am Java Developer";
	char[] c = str.toCharArray();
    System.out.println("The string is:" + str);
    System.out.print("Repeatative Characters in given string are: ");
    for (int i = 0; i < str.length(); i++) {
       for (int j = i + 1; j < str.length(); j++) {
          if (c[i] == c[j]) {
             System.out.print(c[j] + " ");
             break;
          }
       }
    }
 }
          

}
