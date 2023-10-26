package ucu.edu.ua.demo.flowers;

import ucu.edu.ua.demo.payment.Payment;
import ucu.edu.ua.demo.delivery.Delivery;


import java.util.List;

public class Order {
    private Payment aPayment;
    private Delivery aDelivery;
    private List<Item> aOrder;

    public Order(List<Item> items) {
        this.aOrder = items;
    }

    public void setPaymentMethod(Payment clientPayment) {
        this.aPayment = clientPayment;
    }

    public double countPrice() {
        return aOrder.stream().mapToDouble(Item::price).sum();
    }

    public void setDeliverStrategy(Delivery clientDelivery) {
        this.aDelivery = clientDelivery;
    }

    public void processingOrder() {
        if (this.aPayment.pay(countPrice()) == countPrice()) {
            System.out.println("The order has been payed");

            this.aDelivery.deliver(this.aOrder);
            System.out.println("The order has been delivered");
        }
        else {
        System.out.println("Payment failed. Please try again.");
        }
    }

    public void addItem(Item item) {
        aOrder.add(item);
    }

    public void deleteItem(Item item) {
        aOrder.remove(item);
    }
}
