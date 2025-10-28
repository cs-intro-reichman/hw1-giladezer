// Represents the hh:mm time format using an AM/PM format. 

import java.util.Scanner;

public class TimeFormat {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter tcurrent Hour ");
	    int hours = in.nextInt();
	    System.out.println("Enter current Minutes ");
	    int minutes = in.nextInt();

	    String period;
	    if (hours >= 12) {
	    	period = "PM";
	    } else {
	    	period = "AM";
	    }

	    hours = hours % 12;

	    System.out.printf("The time is: %d:%02d %s\n", hours, minutes, period);

	}
}