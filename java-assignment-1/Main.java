
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
                    carRentalSystem.renterManagement();
                    break;
                case 3:
                    carRentalSystem.rentTransactions();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

}
