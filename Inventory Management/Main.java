public class Main {
    public static void main(String[] args) {
        // Create some product objects of different types
        Product laptop = new Electronics("Laptop", 1200.0, "High-performance laptop");
        Product shirt = new Clothing("Shirt", 25.0, "Casual cotton shirt");
        Product book = new Books("Java Programming", 45.0, "Learn Java programming");

        // Create a customer object
        Customer customer = new Customer("John Doe", "john.doe@example.com", "123 Main St");

        // Create and place orders for various products
        OnlineOrder order1 = new OnlineOrder();
        order1.addProduct(laptop, 1);
        order1.addProduct(shirt, 2);

        OnlineOrder order2 = new OnlineOrder();
        order2.addProduct(book, 3);

        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Display order history and total price for each order
        customer.viewOrderHistory();
    }
}