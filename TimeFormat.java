public class TimeFormat {
    public static void main(String[] args) {
        // Check if input is provided
        if (args.length != 1) {
            System.out.println("Usage: java TimeFormat hh:mm");
            return;
        }

        String time = args[0];
        String[] parts = time.split(":");

        // Parse hours and minutes
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        // Validate input ranges
        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
            System.out.println("Invalid time format");
            return;
        }

        // Determine AM/PM
        String period = (hours < 12) ? "AM" : "PM";

        // Convert hours to 12-hour format
        if (hours > 12) {
            hours -= 12;
        }

        // Handle midnight case
        if (hours == 0) {
            hours = 0;
        }

        // Format and print result
        System.out.printf("%d:%02d %s%n", hours, minutes, period);
    }
}
