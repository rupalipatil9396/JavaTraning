package ass1;

/**
 *  @author rupali.patil 
 *  WAP to remove all the vowels from the given string.
 *  */
public class VowelsString {

	public static void main(String[] args) {

		String str = "YASH";

		char ch[] = str.toCharArray();// conversion between array to char

		char vowel;

		char con;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {

				vowel = ch[i]; // check if vowels is present then remove it
				System.out.println("Print only Vowels:" + vowel);

			} else {
				con = ch[i];

				System.out.println("Print only consont : " + con);
			}

		}
	}

}
