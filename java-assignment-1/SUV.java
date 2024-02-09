// Class for SUV
class SUV extends Car implements Insurable {
    String carType;
    String description;
    Double base_rent;
    double distanceTraveled;
    boolean isInsured;

    public SUV(int carID, String brand, String model, int year, String plateNumber) {
        super(carID, brand, model, year, plateNumber);
        this.carType = "SUV";
        this.description = "Spacious, suitable for family trips.";
        this.base_rent = 100.0;
        this.distanceTraveled = 0.0;
        this.isInsured = false;
    }

    // Override rent calculation for SUV
    @Override
    public double calculateRentalCost() {
        return base_rent + (distanceTraveled * 0.5);
    }

    // Implement Insurable interface methods
    @Override
    public double calculateInsuranceCost() {
        return base_rent * 0.1;
    }

    @Override
    public double calculateDamageCost(double totalCost) {
        return base_rent * 0.2 + totalCost * 0.1;
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