// Generates three integer random numbers in a given range,
// and prints them in increasing order.

public class Ascend {

	public static int[] generateRandomNumbers(int upperBound) {
	
	
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
		
		int[] nums = generateRandomNumbers(Integer.parseInt(args[0]));
		oragniseNumbersGoingUp(nums);
		 
		System.out.println(nums[2] + " " + nums[1] + " " + nums[0]);
	
	}
}
