import java.util.Arrays;
import java.util.Scanner;

/**
 * =============================================================
 * MAIN CLASS - TrainConsistApp
 * =============================================================
 *
 * Use Case 19: Binary Search for Bogie ID
 *
 * @version 19.0
 */

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   Train Consist Management App");
        System.out.println("========================================\n");

        // Unsorted bogie IDs
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Step 1: Sort (Precondition for Binary Search)
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String key = scanner.nextLine();

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        // Binary Search
        while (low <= high) {
            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                System.out.println("Bogie found at position: " + mid);
                found = true;
                break;
            } else if (comparison < 0) {
                high = mid - 1; // search left
            } else {
                low = mid + 1;  // search right
            }
        }

        if (!found) {
            System.out.println("Bogie not found");
        }

        scanner.close();
        System.out.println("\nProgram continues...");
    }
}