// Derived class for FrequentRenter
class FrequentRenter extends Renter {
    boolean loyaltyProgram;
    boolean specialOffers;
    String description;

    public FrequentRenter(int renterID, String name, String email, String phoneNumber, String address) {
        super(renterID, name, email, phoneNumber, address);
        loyaltyProgram = true;
        specialOffers = false;
        description = "Frequent Renter";
    }

    @Override
    public void displayDetails() {
        System.out.println("Renter ID: " + getRenterID());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Address: " + getAddress());
        System.out.println("Description: " + description);
        if (loyaltyProgram) {
            System.out.println("Eligible for Loyalty Program");
        } else {
            System.out.println("Not eligible for Loyalty Program");
        }
    }
}