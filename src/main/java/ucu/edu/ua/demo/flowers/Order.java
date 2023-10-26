package ucu.edu.ua.demo.flowers;

import ucu.edu.ua.demo.payment.Payment;
import ucu.edu.ua.demo.delivery.Delivery;


import java.util.List;

public class Order {
    private Payment a_payment;
    private Delivery a_delivery;
    private List<Item> a_order;

    public Order(List<Item> many_items) {
        this.a_order = many_items;
    }

    public void setPaymentMethod(Payment clientPayment) {
        this.a_payment = clientPayment;
    }

    public double countPrice() {
        return a_order.stream().mapToDouble(Item::price).sum();
    }

    public void setDeliverStrategy(Delivery clientDelivery) {
        this.a_delivery = clientDelivery;
    }

    public void processingOrder() {
        if (this.a_payment.pay(countPrice()) == countPrice()) {
            System.out.println("The order has been payed");

            this.a_delivery.deliver(this.a_order);
            System.out.println("The order has been delivered");
        }
        else {
        System.out.println("Payment failed. Please try again.");
        }
    }

    public void addItem(Item item) {
        a_order.add(item);
    }

    public void deleteItem(Item item) {
        a_order.remove(item);
    }
}