public class Order {
    private final Pricing pricing;
    private final Ordering ordering;

    public Order(Pricing pricing, Ordering ordering) {
        this.pricing = pricing;
        this.ordering = ordering;
    }

    public void processOrder(double price, int quantity, String customerName, String address) {
        double total = pricing.calculateTotal(price, quantity);
        ordering.placeOrder(customerName, address);
        System.out.println("Order processed successfully!");
    }
}
