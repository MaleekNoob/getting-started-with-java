import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

// Class for CarRentalSystem
public class CarRentalSystem {
    private List<Car> cars;
    private List<Renter> renters;

    // Constructor
    public CarRentalSystem() {
        this.cars = new ArrayList<>();
        this.renters = new ArrayList<>();
    }

    // Method to add a new car
    public void addCar(Car car) {
        cars.add(car);
    }

    // Method to display available cars
    public void displayAvailableCars() {
        System.out.println("Available Cars:");
        for (Car car : cars) {
            if (!car.isRentalStatus()) {
                car.displayCarDetails();
                System.out.println();
            }
        }
    }

    // Method to remove a car if it is not rented
    public void removeCar(int carID) {
        for (Car car : cars) {
            if (car.getCarID() == carID && !car.isRentalStatus()) {
                cars.remove(car);
                System.out.println("Car removed successfully.");
                return;
            }
        }
        System.out.println("Car not found or currently rented. Unable to remove.");
    }

    // Method to add a new renter
    public void addRenter(Renter renter) {
        renters.add(renter);
    }

    // Method to display renter details
    public void displayRenterDetails(int renterID) {
        for (Renter renter : renters) {
            if (renter.getRenterID() == renterID) {
                renter.displayRenterDetails();
                return;
            }
        }
        System.out.println("Renter not found.");
    }

    // Method to remove a renter after they return the car
    public void removeRenter(int renterID) {
        for (Renter renter : renters) {
            if (renter.getRenterID() == renterID) {
                renters.remove(renter);
                System.out.println("Renter removed successfully.");
                return;
            }
        }
        System.out.println("Renter not found.");
    }

    // Method to rent a car to a renter
    public void rentCar(int renterID, int carID, double distanceTraveled) {
        // Implementation of rent transaction
        // ...
    }

    // Method to display rental details
    public void displayRentalDetails(int renterID) {
        // Implementation of displaying rental details
        // ...
    }

    // Main method to test the system
    public static void main(String[] args) {
        CarRentalSystem carRentalSystem = new CarRentalSystem();

        // Create and add cars to the system
        Car compactCar = new CompactCar(1, "Toyota", "Corolla", 2022, "ABC123");
        Car suv = new SUV(2, "Ford", "Explorer", 2022, "XYZ456");
        Car luxuryCar = new LuxuryCar(3, "Mercedes", "S-Class", 2022, "DEF789");

        carRentalSystem.addCar(compactCar);
        carRentalSystem.addCar(suv);
        carRentalSystem.addCar(luxuryCar);

        // Display available cars
        carRentalSystem.displayAvailableCars();

        // Create and add renters to the system
        Renter regularRenter = new RegularRenter(101, "John Doe", "john@example.com", "1234567890", "123 Main St");
        Renter frequentRenter = new FrequentRenter(102, "Jane Doe", "jane@example.com", "9876543210", "456 Oak St");
        Renter corporateRenter = new CorporateRenter(103, "ABC Corp", "info@abccorp.com", "5555555555", "789 Maple St");

        carRentalSystem.addRenter(regularRenter);
        carRentalSystem.addRenter(frequentRenter);
        carRentalSystem.addRenter(corporateRenter);

        // Display renter details
        carRentalSystem.displayRenterDetails(101);

        // Rent a car to a renter
        carRentalSystem.rentCar(101, 1, 50.0);

        // Display rental details
        carRentalSystem.displayRentalDetails(101);

        // Remove a renter after they return the car
        carRentalSystem.removeRenter(101);
    }

    
    public void carManagement() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("\nCar Management Menu:");
            System.out.println("1. Add new car");
            System.out.println("2. Display available cars");
            System.out.println("3. Remove a car");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter car details:");
                    int carType = 0;
                    while (carType < 1 || carType > 3)
                    {
                        System.out.println("Enter car type (1. Compact, 2. SUV, 3. Luxury): ");
                        carType = scanner.nextInt();
                    }
                    System.out.print("Enter car ID: ");
                    int carID = scanner.nextInt();
                    System.out.print("Enter brand: ");
                    String brand = scanner.next();
                    System.out.print("Enter model: ");
                    String model = scanner.next();
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();   
                    System.out.print("Enter plate number: ");
                    String plateNumber = scanner.next();
                    // Create a new car object based on the car type
                    Car car;
                    switch (carType) {
                        case 1:
                            car = new CompactCar(carID, brand, model, year, plateNumber);
                            break;
                        case 2:
                            car = new SUV(carID, brand, model, year, plateNumber);
                            break;
                        case 3:
                            car = new LuxuryCar(carID, brand, model, year, plateNumber);
                            break;
                        default:
                            System.out.println("Invalid car type. Please enter a number between 1 and 3.");
                            continue;
                    }
                    // Add the car to the system
                    addCar(car);
                    break;
                case 2:
                    displayAvailableCars();
                    break;
                case 3:
                    System.out.print("Enter car ID to remove: ");
                    int carIDToRemove = scanner.nextInt();
                    removeCar(carIDToRemove);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

}
