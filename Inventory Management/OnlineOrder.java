import java.util.ArrayList;
import java.util.List;

class OnlineOrder implements Order {
    private List<OrderItem> orderItems;

    public OnlineOrder() {
        this.orderItems = new ArrayList<>();
    }

    @Override
    public void addProduct(Product product, int quantity) {
        orderItems.add(new OrderItem(product, quantity));
    }

    @Override
    public void removeProduct(Product product, int quantity) {
        orderItems.remove(new OrderItem(product, quantity));
    }

    @Override
    public double calculateTotal() {
        double total = 0;
        for (OrderItem orderItem : orderItems) {
            total += orderItem.calculateSubtotal();
        }
        return total;
    }

    private static class OrderItem {
        private Product product;
        private int quantity;

        public OrderItem(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }

        public double calculateSubtotal() {
            return product.getPrice() * quantity;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            OrderItem orderItem = (OrderItem) obj;
            return product.equals(orderItem.product);
        }

        @Override
        public int hashCode() {
            return product.hashCode();
        }
    }

}
