// Class for SUV
class SUV extends Car implements Insurable {
    String carType;
    String description;
    Double base_rent;

    public SUV(int carID, String brand, String model, int year, String plateNumber) {
        super(carID, brand, model, year, plateNumber);
        this.carType = "SUV";
        this.description = "Spacious, suitable for family trips.";
        this.base_rent = 100.0;
    }

    // Override rent calculation for SUV
    @Override
    public double calculateRentalCost(double distanceTraveled) {
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
}