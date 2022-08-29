package StringAss;
/**
 * 
 * @author rupali.patil
 * I want to allocate  memory to string objects in memory heap and string 
constant pool
 */
public class StrinLiteral {
public static void main(String[] args) {
	
	String name=new String("Yash");// object are in SCP and Heap
	String name1="Magarpatta";//Only in SCP
	
	String name2=new String("Yash");// object are in SCP and Heap


	System.out.println(name.equals(name1));// check content
	System.out.println(name==name1);// check reference
	System.out.println(name==name2);
	
	System.out.println(name.compareTo(name2));
	
}
}
