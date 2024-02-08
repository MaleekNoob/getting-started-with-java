
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        CarRentalSystem carRentalSystem = new CarRentalSystem();

        do {
            System.out.println("Menu:");
            System.out.println("1. Car Management");
            System.out.println("2. Renter Management");
            System.out.println("3. Rent Transactions");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    carRentalSystem.carManagement();
                    break;
                case 2:
                    renterManagement();
                    break;
                case 3:
                    rentTransactions();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private static void renterManagement() {
        // Add new renters of different types
        // Display renter details
        // Remove a renter after they return the car
    }

    private static void rentTransactions() {
        // Rent a car to a renter
        // Display rental details
        // Calculate and display the total rental cost
        // Provide an option to add insurance if the rented car is insurable
        // If insurance is added, calculate and include insurance cost in the total
        // Calculate and display damage cost based on the car type and insurance status upon return
        // All rent transactions are stored in CRMS
    }
}
