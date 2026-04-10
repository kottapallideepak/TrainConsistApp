import java.util.LinkedHashSet;

/**
 * =============================================================
 * MAIN CLASS - TrainConsistApp
 * =============================================================
 *
 * Use Case 5: Preserve Insertion Order of Bogies (LinkedHashSet)
 *
 * @version 5.0
 */

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   Train Consist Management App");
        System.out.println("========================================\n");

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt duplicate
        train.add("Sleeper"); // duplicate (ignored)

        System.out.println("Train Formation (Insertion Order Preserved):");
        System.out.println(train);
    }
}