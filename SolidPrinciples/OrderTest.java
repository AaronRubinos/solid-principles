public class OrderTest {
    public static void main(String[] args) {
        Pricing pricing = new PricingAction();
        Ordering ordering = new OrderingAction();

        Order order = new Order(pricing, ordering);

        order.processOrder(27.0, 7, "Aaron Gil Rubinos", "Barangay 176, Caloocan City");
    }
}
