import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private String email;
    private String address;
    private List<Order> orders;

    public Customer(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void viewOrderHistory() {
        System.out.println("Order History for Customer " + name + ":");
        for (Order order : orders) {
            System.out.println("Total Price: $" + order.calculateTotal());
        }
    }
}
