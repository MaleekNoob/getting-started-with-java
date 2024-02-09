// Class for LuxuryCar
class LuxuryCar extends Car implements Insurable {
    String carType;
    String description;
    Double base_rent;
    double distanceTraveled;
    boolean isInsured;

    public LuxuryCar(int carID, String brand, String model, int year, String plateNumber) {
        super(carID, brand, model, year, plateNumber);
        this.carType = "Luxury";
        this.description = "High-end features, suitable for special occasions.";
        this.base_rent = 200.0;
        this.distanceTraveled = 0.0;
        this.isInsured = false;
    }

    // Base rent + distance traveled cost + luxury tax.
    @Override
    public double calculateRentalCost() {
        return base_rent + distanceTraveled + 100.0 /*luxuray tax */;
    }

    // Fixed percentage of the base rent
    @Override
    public double calculateInsuranceCost() {
        return base_rent * 0.15 /* insurance cost */;
    }

    // Percentage of the total cost including luxury tax
    @Override
    public double calculateDamageCost(double totalCost) {
        return totalCost * 0.2 /* damage cost */ + 100.0 /* luxury tax */;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car ID: " + getCarID());
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Plate Number: " + getPlateNumber());
        System.out.println("Car Type: " + carType);
        System.out.println("Description: " + description);
        System.out.println("Rental Fee: " + calculateRentalCost());
    }

    // Method to set distance traveled
    public void setDistanceTraveled(double distance) {
        distanceTraveled = distance;
    }
}