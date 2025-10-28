// Computes the future value of a saving investment.

import java.util.Scanner;

public class FVCalc {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("Enter principal amount (integer): ");
		int principal = in.nextInt();
		System.out.println("Enter annual interest rate (as a percentage): ");
		double annualRate = in.nextDouble();
		System.out.println("Enter number of years (integer): ");
		int years = in.nextInt();

		double futureValue = principal * Math.pow((1 + (annualRate / 100)), years);
		System.out.printf("Future value: %.2f\n", futureValue);
	}
}