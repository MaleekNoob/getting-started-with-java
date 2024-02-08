// Base class for Car
public abstract class Car {
    private int carID;
    private String brand;
    private String model;
    private int year;
    private boolean rentalStatus;
    private double rentalFee;
    private String plateNumber;

    // Constructor
    public Car(int carID, String brand, String model, int year, String plateNumber) {
        this.carID = carID;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.rentalStatus = false;
        this.rentalFee = 0.0;
        this.plateNumber = plateNumber;
    }

    // Abstract method for calculating rental cost
    public abstract double calculateRentalCost(double distanceTraveled);

    // Getter methods

    public int getCarID() {
        return carID;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isRentalStatus() {
        return rentalStatus;
    }

    public double getRentalFee() {
        return rentalFee;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    // Setter methods

    public void setRentalStatus(boolean rentalStatus) {
        this.rentalStatus = rentalStatus;
    }

    public void setRentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Car ID: " + carID);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Rental Status: " + (rentalStatus ? "Rented" : "Available"));
        System.out.println("Rental Fee: $" + rentalFee);
    }
}