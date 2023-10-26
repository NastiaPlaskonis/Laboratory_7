package ucu.edu.ua.demo;

import ucu.edu.ua.demo.payment.PayPalPaymentStrategy;
import ucu.edu.ua.demo.payment.CreditCardPaymentStrategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class PaymentTests {
    private PayPalPaymentStrategy paymentWithPayPal;
    private CreditCardPaymentStrategy paymentWithCreditCard;
    private final double price = 80;

    @BeforeEach
    public void init() {
        paymentWithCreditCard = new CreditCardPaymentStrategy();
        paymentWithPayPal = new PayPalPaymentStrategy();
    }
    
    @Test
    public void testCreditCard() {
        Assertions.assertEquals(price, paymentWithCreditCard.pay(price));
    }

    @Test
    public void testPayPal() {
        Assertions.assertEquals(price, paymentWithPayPal.pay(price));
    }
}