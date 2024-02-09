import java.util.List;
import java.util.ArrayList;

// Base class for Renter
class Renter {
    private int renterID;
    private String name;
    private String email;
    private List<Car> rentedCars;
    private double totalRentalFee;
    private String phoneNumber;
    private String address;

    // Constructor
    public Renter(int renterID, String name, String email, String phoneNumber, String address) {
        this.renterID = renterID;
        this.name = name;
        this.email = email;
        this.rentedCars = new ArrayList<>();
        this.totalRentalFee = 0.0;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Getter methods

    public int getRenterID() {
        return renterID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Car> getRentedCars() {
        return rentedCars;
    }

    public double getTotalRentalFee() {
        return totalRentalFee;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    // Method to add a rented car
    public void addRentedCar(Car car) {
        rentedCars.add(car);
    }

    // Method to remove a rented car
    public void removeRentedCar(Car car) {
        rentedCars.remove(car);
    }

    // Method to display renter details
    public void displayDetails() {
        System.out.println("Renter ID: " + renterID);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Total Rental Fee: $" + totalRentalFee);
        System.out.println("Rented Cars:");
        for (Car car : rentedCars) {
            System.out.println("  - " + car.getBrand() + " " + car.getModel() + " (" + car.getPlateNumber() + ")");
        }
    }
}