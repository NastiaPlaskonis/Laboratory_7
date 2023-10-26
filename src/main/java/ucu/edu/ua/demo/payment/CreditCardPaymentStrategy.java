package ucu.edu.ua.demo.payment;

public class CreditCardPaymentStrategy implements Payment {
    
    @Override
    public double pay(double price) {
        return price;
    }
}
