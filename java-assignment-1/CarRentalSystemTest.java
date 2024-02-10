public class CarRentalSystemTest {

    public static void main(String[] args) {

        // Test car management
        testCarManagement();

        // Test renter management
        testRenterManagement();

        // Test rent transactions
        testRentTransactions();

        // Test damage cost calculation
        testDamageCostCalculation();
    }

    // @Test
    public static void testCarManagement() {
        CarRentalSystem carRentalSystem = new CarRentalSystem();

        // Test case for adding new cars
        Car compactCar = new CompactCar(1, "Toyota", "Corolla", 2022, "ABC123");
        carRentalSystem.addCar(compactCar);

        // Display available cars
        carRentalSystem.displayAvailableCars();

        // Remove a car that is not rented
        carRentalSystem.removeCar(1);
    }

    // @Test
    public static void testRenterManagement() {
        CarRentalSystem carRentalSystem = new CarRentalSystem();

        // Test case for adding new renters
        Renter regularRenter = new RegularRenter(101, "John Doe", "john@example.com", "1234567890", "123 Main St");
        carRentalSystem.addRenter(regularRenter);

        // Display renter details
        carRentalSystem.displayRenterDetails(101);

        // Remove a renter after they return the car
        carRentalSystem.removeRenter(101);
    }

    // @Test
    public static void testRentTransactions() {
        CarRentalSystem carRentalSystem = new CarRentalSystem();

        // Test cases for renting a car to a renter
        Car compactCar = new CompactCar(1, "Toyota", "Corolla", 2022, "ABC123");
        Renter basicRenter = new RegularRenter(101, "John Doe", "john@example.com", "1234567890", "123 Main St");

        // 1. Basic renter with an uninsured car
        carRentalSystem.addCar(compactCar);
        carRentalSystem.addRenter(basicRenter);
        carRentalSystem.rentCar(101, 1, 50.0);

        // 2. VIP renter with an insured car
        Car luxuryCar = new LuxuryCar(2, "Mercedes", "S-Class", 2022, "DEF789");
        Renter vipRenter = new CorporateRenter(102, "ABC Corp", "info@abccorp.com", "5555555555", "789 Maple St");

        carRentalSystem.addCar(luxuryCar);
        carRentalSystem.addRenter(vipRenter);
        carRentalSystem.rentCar(102, 2, 100.0);

        // Calculate and display the total rental cost
        // Provide an option to add insurance if the rented car is insurable
        // If insurance is added, calculate and include insurance cost in the total
        carRentalSystem.displayRentalDetails(101);
        carRentalSystem.displayRentalDetails(102);
    }

    // @Test
    public static void testDamageCostCalculation() {
        CarRentalSystem carRentalSystem = new CarRentalSystem();

        // Test cases for calculating and displaying damage cost
        // 1. Uninsured car
        Car suv = new SUV(3, "Ford", "Explorer", 2022, "XYZ456");
        Renter uninsuredRenter = new RegularRenter(103, "Jane Doe", "jane@example.com", "9876543210", "456 Oak St");

        carRentalSystem.addCar(suv);
        carRentalSystem.addRenter(uninsuredRenter);
        carRentalSystem.rentCar(103, 3, 75.0);

        // Display damage cost for an uninsured car
        carRentalSystem.displayRentalDetails(103);

        // 2. Insured car with insurance decision 1
        Car luxuryCar2 = new LuxuryCar(4, "BMW", "7-Series", 2022, "GHI123");
        Renter insuredRenter1 = new FrequentRenter(104, "Bob", "bob@example.com", "1112223333", "789 Oak St");

        carRentalSystem.addCar(luxuryCar2);
        carRentalSystem.addRenter(insuredRenter1);
        carRentalSystem.rentCar(104, 4, 120.0);

        // Display damage cost for an insured car with insurance decision 1
        carRentalSystem.displayRentalDetails(104);

        // 3. Insured car with insurance decision 2
        Car compactCar2 = new CompactCar(5, "Honda", "Civic", 2022, "JKL456");
        Renter insuredRenter2 = new CorporateRenter(105, "XYZ Corp", "xyz@xyzcorp.com", "9998887777", "321 Elm St");

        carRentalSystem.addCar(compactCar2);
        carRentalSystem.addRenter(insuredRenter2);
        carRentalSystem.rentCar(105, 5, 60.0);

        // Display damage cost for an insured car with insurance decision 2
        carRentalSystem.displayRentalDetails(105);
    }
}
