package ass1;

import java.util.Scanner;
/* An Array contain the n numbers you have to find out combination which satisfy Pythagoras 
Template. ( Pythagoras templates:- 3*3+4*4==5*5)*/

public class PyathagorousPro {
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double side1, side2, hpt;          
        System.out.print("Enter a value for Side 1: ");
        side1 = sc.nextDouble();
        System.out.print("Enter a value for Side 2: ");
        side2 = sc.nextDouble();
        hpt = Math.sqrt((side1*side1)+(side2*side2));
        System.out.println("The length of the hypotenuse is: " + hpt);
    }
}
