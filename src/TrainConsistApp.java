import java.util.ArrayList;
import java.util.List;

/**
 * =============================================================
 * MAIN CLASS - TrainConsistApp
 * =============================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * Entry point of the Train Consist Management Application.
 *
 * @version 1.0
 */

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome Banner
        System.out.println("========================================");
        System.out.println("   Train Consist Management App");
        System.out.println("========================================\n");

        // Create dynamic list for bogies
        List<String> trainConsist = new ArrayList<>();

        // Initial State
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count: " + trainConsist.size());
        System.out.println("Current Train Consist: " + trainConsist);

        System.out.println("\nSystem ready for operations...");
    }
}