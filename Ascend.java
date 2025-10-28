// Generates three integer random numbers in a given range,
// and prints them in increasing order.
import java.util.Scanner;

public class Ascend {

	public static int[] generateRandomNumbers() {

		Scanner in = new Scanner(System.in);

	
		System.out.println("Enter lower bound (integer): ");
		int upperBound = in.nextInt();

		int[] numbers = new int[3];
		for (int i = 0; i < 3; i++) {
			numbers[i] = (int) (Math.random() * (upperBound + 1));
		}
		return numbers;
	}

	public static void oragniseNumbersGoingUp(int[] numbers) {
		int temp;
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		int[] randomNumbers = generateRandomNumbers();
		oragniseNumbersGoingUp(randomNumbers);
		System.out.println("The numbers in increasing order are: ");
		for (int num : randomNumbers) {
			System.out.print(num + "\n");
		}

	}
}
