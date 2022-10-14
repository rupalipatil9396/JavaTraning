package StringAss;

import java.util.Scanner;
/**
 * 
 * @author rupali.patil
 *
 */
public class IndexSort  {
/*Create a program in which two string is input by the user and after that user will enter index in 
first string where we want to insert the second string and insert the second string at that index 
and create a new string*/	 
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a First String");
	
	String s1=sc.next();
	System.out.println("Enter a Second String");
		
	String s2=sc.next();
	System.out.println("enter index");
	int n=sc.nextInt();
	String result="";
	
	char []ch1=s1.toCharArray();
    char []ch2=s2.toCharArray();
    char [] chArr1={' '};
    char chArr2[]={' '};
    
    for(int i=0;i<n;i++)
    {
        chArr1[i]=ch1[i];//a
    }
    String ss1=new String(chArr1);
    String ss2=ss1+s2;
    //System.out.println(ss2);
    char charArray[]=ss2.toCharArray();
    System.out.print(ss2);
    for(int j=n;j<ch1.length
            ;j++)
    {
        System.out.print(ch1[j]);
    }
    
    String newString=ss1+s2+ss2;

     
}

	
	
}