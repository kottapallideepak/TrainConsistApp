/**
 * =============================================================
 * MAIN CLASS - TrainConsistApp
 * =============================================================
 *
 * Use Case 3: Track Unique Bogie IDs (Set – HashSet)
 *
 * @version 3.0
 */

import java.util.HashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   Train Consist Management App");
        System.out.println("========================================\n");

        // Create HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (with duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display input (for understanding)
        System.out.println("Bogie IDs added (with duplicates):");
        System.out.println("[BG101, BG102, BG103, BG101, BG102]");

        // Display unique IDs
        System.out.println("\nUnique Bogie IDs (after HashSet):");
        System.out.println(bogieIds);
    }
}