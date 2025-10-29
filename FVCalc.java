// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		if(args.length != 3) {
			System.out.println("Usage: java FVCalc <principal> <annualRate> <years>");
			return;
		}

		int money = Integer.parseInt(args[0]);
		int rate = Integer.parseInt(args[1]);
		int years = Integer.parseInt(args[2]);

		double finalValue = money * Math.pow((1 + rate/100), years);
		System.out.println("after " + years + "years, " + money + 
		" saved at " + rate + "% will yield $" + finalValue);
	}
}