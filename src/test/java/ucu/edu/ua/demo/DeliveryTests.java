package ucu.edu.ua.demo;

import ucu.edu.ua.demo.delivery.PostDeliveryStrategy;
import ucu.edu.ua.demo.flowers.Flower;
import ucu.edu.ua.demo.flowers.FlowerColor;
import ucu.edu.ua.demo.flowers.Item;
import ucu.edu.ua.demo.delivery.DHLDeliveryStrategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

public class DeliveryTests {

    private List<Item> client_order;
    private final double price = 80;

    private PostDeliveryStrategy deliveryByPost;
    private DHLDeliveryStrategy deliveryByDHL;

    @BeforeEach
    public void init() {

        deliveryByPost = new PostDeliveryStrategy();
        deliveryByDHL = new DHLDeliveryStrategy();

        client_order = List.of(
            new Flower(price, 0.9, FlowerColor.BLUE),
            new Flower(price, 0.6, FlowerColor.BLUE),
            new Flower(price, 0.8, FlowerColor.RED),
            new Flower(price, 0.7, FlowerColor.RED));

    }

    @Test
    public void testPostDelivery() {
        Assertions.assertEquals(client_order, deliveryByPost.deliver(client_order));
    }

    @Test
    public void testDHLDelivery() {
        Assertions.assertEquals(client_order, deliveryByDHL.deliver(client_order));
    }

}