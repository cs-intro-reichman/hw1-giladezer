// Splits a restaurant bill evenly among three diners.

import java.util.Scanner;

public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:

		Scanner in = new Scanner(System.in);

	    String name1 = in.nextLine();
	    String name2 = in.nextLine();
	    String name3 = in.nextLine();
	    double billAmount = in.nextDouble();
		double finalBill = Math.ceil(billAmount);

		double splitAmount = billAmount / 3;
		final String OWES = "owes:";
		System.out.println(name1 + OWES + finalBill + "$");
		System.out.println(name2 + OWES + finalBill + "$");
		System.out.println(name3 + OWES + finalBill + "$");

	     
	}
}
