// Prints a given number using a hundreds, tens, and units notation.

import java.util.Scanner;

public class NumWords {
	public static void main(String args[]) {
	    
		Scanner in = new Scanner(System.in);

	    int number = in.nextInt();

	    int hundreds = number / 100;
	    int tens = (number % 100) / 10;
	    int units = number % 10;

	    
	    System.out.println("The number " + number + " is read as: ");
	    System.out.println(hundreds + " hundred " + tens + " ten " + units + " ones");

	}
}
