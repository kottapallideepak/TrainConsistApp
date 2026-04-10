import java.util.Scanner;

/**
 * =============================================================
 * MAIN CLASS - TrainConsistApp
 * =============================================================
 *
 * Use Case 18: Linear Search for Bogie ID
 *
 * @version 18.0
 */

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   Train Consist Management App");
        System.out.println("========================================\n");

        // Bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        boolean found = false;

        // Linear Search
        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                found = true;
                System.out.println("Bogie found at position: " + i);
                break; // Early termination
            }
        }

        // Result
        if (!found) {
            System.out.println("Bogie not found");
        }

        scanner.close();
        System.out.println("\nProgram continues...");
    }
}