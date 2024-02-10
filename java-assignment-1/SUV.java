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
        if (isInsured) {
            return base_rent * 0.1;
        }
        return 0.0;
    }

    @Override
    public double calculateDamageCost(double totalCost) {
        if (!isInsured) {
            return base_rent * 0.2 + totalCost * 0.1;
        }
        return 0.0;
    }

    @Override
    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    @Override
    public boolean isInsured() {
        return isInsured;
    }

    @Override
    public void setInsured(boolean isInsured) {
        this.isInsured = isInsured;
    }

    // Method to display car details
    @Override
    public void displayDetails() {
        System.out.println("Car ID: " + getCarID());
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Plate Number: " + getPlateNumber());
        System.out.println("Car Type: " + carType);
        System.out.println("Description: " + description);
        System.out.println("Rental Fee: " + calculateRentalCost());
        if (isInsured) {
            System.out.println("Insurance Cost: " + calculateInsuranceCost());
        }
        else {
            System.out.println("Damage Cost: " + calculateDamageCost(calculateRentalCost()));
        }
    }

    // Method to set distance traveled
    public void setDistanceTraveled(double distance) {
        distanceTraveled = distance;
    }
}