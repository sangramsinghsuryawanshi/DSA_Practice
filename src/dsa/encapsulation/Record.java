package dsa.encapsulation;

sealed interface Order permits DigitalOrder,Record {
}

// Records seamlessly implementing a sealed interface
record DigitalOrder(String email, double price) implements Order {
}

public record Record(String shippingAddress, double price) implements Order {
    public static void main(String[] args) {
        DigitalOrder order = new DigitalOrder("email", 100.00);
        System.out.println(order.email());
    }
}


