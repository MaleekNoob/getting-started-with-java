// Class for CompactCar
class CompactCar extends Car {
    String carType;
    String description;
    Double base_rent;

    public CompactCar(int carID, String brand, String model, int year, String plateNumber) {
        super(carID, brand, model, year, plateNumber);
        this.carType = "Compact";
        this.description = "Basic features, suitable for short-distance travel.";
        this.base_rent = 50.0;
    }

    // Override rent calculation for CompactCar
    @Override
    public double calculateRentalCost(double distanceTraveled) {
        return base_rent + (distanceTraveled * 0.2);
    }
}