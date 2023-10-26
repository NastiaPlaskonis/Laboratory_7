package ucu.edu.ua.demo.payment;


public class PayPalPaymentStrategy implements Payment {

    @Override

    public double pay(double price) {
        return price;
    }
}
