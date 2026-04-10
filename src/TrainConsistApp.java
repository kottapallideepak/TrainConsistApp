import java.util.Arrays;
import java.util.Scanner;

/**
 * =============================================================
 * MAIN CLASS - TrainConsistApp
 * =============================================================
 *
 * Use Case 20: Exception Handling During Search
 *
 * @version 20.0
 */

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   Train Consist Management App");
        System.out.println("========================================\n");

        // Try both cases:
        // Case 1: Empty array (should throw exception)
        String[] bogieIds = {};

        // Case 2: Uncomment to test valid case
        // String[] bogieIds = {"BG101", "BG205", "BG309"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = scanner.nextLine();

        try {
            // Fail-Fast Validation
            if (bogieIds.length == 0) {
                throw new IllegalStateException("No bogies available for search");
            }

            // Proceed with search (Linear Search)
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(key)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Bogie found");
            } else {
                System.out.println("Bogie not found");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
        System.out.println("\nProgram continues safely...");
    }
}