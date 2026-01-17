import java.util.Scanner;

public class UserInput {

    public static void showMenu (){
        System.out.println("Select an option:");
        System.out.println("1. Check number (>7 → \"Hello\")");
        System.out.println("2. Check name (\"John\" → \"Hello, John\")");
        System.out.println("3. Filter array (multiples of 3)");
        System.out.println("0. Exit");
        System.out.print("Your choice:");
    }

    /**
     * Reads an integer from the scanner, ignoring non-integer input.
     * After successful read, consumes the rest of the line to prevent buffer issues.
     *
     * @param scanner the Scanner to read from
     * @param errorMessage message to display on invalid input
     * @return the parsed integer
     */
    public static int readIntOnly (Scanner scanner, String errorMessage) {
        while (!scanner.hasNextInt()) {
            System.out.println(errorMessage);
            scanner.next();
        }
        int intForReturn = scanner.nextInt();
        scanner.nextLine();
        return intForReturn;
    }

    /**
     * Reads a line of space-separated integers from the user.
     * Repeats until valid input is provided.
     *
     * @param scanner the Scanner to read from
     * @return array of parsed integers (never null)
     */
    public static int [] readIntArray (Scanner scanner){
        while (true) {
            System.out.print("Enter numbers separated by spaces ");
            String line = scanner.nextLine().trim();

            if (line.isEmpty()) {
                System.out.println("Error: empty input. Please try again.");
                continue;
            }

            String[] parts = line.split("\\s+");
            int[] result = new int[parts.length];
            boolean stringIsValid = true;
            for (int i = 0; i < parts.length; i++) {
                try {
                    result[i] = Integer.parseInt(parts[i]);
                } catch (NumberFormatException e) {
                    System.out.println("Error: '" + parts[i] + "' is not a valid integer.");
                    stringIsValid = false;
                    break;
                }
            }
            if (stringIsValid) {
                return result;
            }
        }
    }
}