public class Bill3 {
    public static void main(String[] args) {
        // Ensure correct number of arguments
        if (args.length != 4) {
            System.out.println("Usage: java Bill3 <name1> <name2> <name3> <total>");
            return;
        }

        // Read the inputs
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        int total = Integer.parseInt(args[3]);

        // Calculate the payment per person, rounding up
        double pay = Math.ceil((double) total / 3);

        // Print the final message
        System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 +
                           ": pay " + pay + " Shekels each.");
    }
}