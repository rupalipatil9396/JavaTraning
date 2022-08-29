package stringpro;
/**
 * 
 *  @author rupali.patil
 *  To demonstrate which is fast in processing StringBuilder or StringBuffer

 */
 
public class StringBuilderBuffer {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Yash");
		long start = System.currentTimeMillis();
		for (int i = 0; i <= 10000; i++) {
			sb.append(new StringBuffer("Techology"));
		}
		long end = System.currentTimeMillis();
		long runtime = end - start;
		System.out.println("Time required for String Buffer " + runtime);

		long start1 = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("Yash");
		for (int j = 0; j <= 10000; j++) {
			sb1.append(new StringBuffer("Techology"));
		}
		long end1 = System.currentTimeMillis();
		long runtime1 = end1 - start1;
		System.out.println("Time required for String Builder " + runtime1);

		} //as per program time required for String Buffer is more as compare to String Builder
}
