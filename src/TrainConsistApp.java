import java.util.ArrayList;
import java.util.List;

/**
 * =============================================================
 * MAIN CLASS - TrainConsistApp
 * =============================================================
 *
 * Use Case 2: Add Passenger Bogies to Train (ArrayList Operations)
 *
 * @version 2.0
 */

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   Train Consist Management App");
        System.out.println("========================================\n");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ADD (Create)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies after addition:");
        System.out.println(passengerBogies);

        // REMOVE (Delete)
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing 'AC Chair':");
        System.out.println(passengerBogies);

        // CHECK (Read)
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nDoes 'Sleeper' exist? " + exists);

        // FINAL STATE
        System.out.println("\nFinal Train Consist:");
        System.out.println(passengerBogies);
    }
}